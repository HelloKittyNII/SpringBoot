package hello.storage;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.function.Predicate;
import java.util.stream.Stream;

@Service
public class FileSystemStorageService implements StorageService
{

    private final Path rootLocation = Paths.get("upload-dir");


    /**
     * 保存文件
     *
     * @param file 文件
     */
    @Override
    public void store(MultipartFile file)
    {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        try
        {
            if (file.isEmpty())
            {
                throw new StorageException("Failed to store empty file " + filename);
            }
            if (filename.contains(".."))
            {
                // This is a security check
                throw new StorageException("Cannot store file with relative path outside current directory " + filename);
            }
            Files.copy(file.getInputStream(), this.rootLocation.resolve(filename), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e)
        {
            throw new StorageException("Failed to store file " + filename, e);
        }
    }

    /**
     * 列出upload-dir下面所有文件
     * @return
     */
    @Override
    public Stream<Path> loadAll()
    {
        try
        {
            return Files.walk(this.rootLocation, 1)  //path -> !path.equals(this.rootLocation)
                    .filter(new Predicate<Path>()
                    {
                        @Override
                        public boolean test(Path path)
                        {
                            return !path.equals(rootLocation);
                        }
                    });
        }
        catch (IOException e)
        {
            throw new StorageException("Failed to read stored files", e);
        }

    }

    @Override
    public Path load(String filename)
    {
        return rootLocation.resolve(filename);
    }

    /**
     * 获取文件资源
     * @param filename 文件名
     * @return Resource
     */
    @Override
    public Resource loadAsResource(String filename)
    {
        try
        {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable())
            {
                return resource;
            }
            else
            {
                throw new StorageFileNotFoundException("Could not read file: " + filename);

            }
        }
        catch (MalformedURLException e)
        {
            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
        }
    }

    /**
     * 删除upload-dir目录所有文件
     */
    @Override
    public void deleteAll()
    {
        FileSystemUtils.deleteRecursively(rootLocation.toFile());
    }

    /**
     * 初始化
     */
    @Override
    public void init()
    {
        try
        {
            Files.createDirectories(rootLocation);
        }
        catch (IOException e)
        {
            throw new StorageException("Could not initialize storage", e);
        }
    }
}
