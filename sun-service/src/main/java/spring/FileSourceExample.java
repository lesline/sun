package spring;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ClassUtils;
import sun.misc.URLClassPath;

import java.io.IOException;
import java.io.InputStream;


public class FileSourceExample {

    public static void main(String[] args) {
        try {

            String filePath = "/Users/zhangshaolin/git/workspace/sun/sun-service/src/main/resources/file1.txt";
            Resource res1 = new FileSystemResource(filePath);
            Resource res2 = new ClassPathResource("file1.txt");

            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();
            System.out.println("res1:" + res1.getFilename());
            System.out.println("res2:" + res2.getFilename());

            ClassUtils.getDefaultClassLoader();


            URLClassPath url=sun.misc.Launcher.getBootstrapClassPath();
            System.out.println(url);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
