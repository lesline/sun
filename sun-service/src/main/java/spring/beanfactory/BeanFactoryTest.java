package spring.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import spring.Car;

public class BeanFactoryTest {
    public static void main(String[] args) throws Throwable {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("classpath:beans.xml");
        System.out.println(res.getURL());
        BeanFactory bf = new XmlBeanFactory(res);
        System.out.println("init BeanFactory.");

        Car car = bf.getBean("car", Car.class);
        System.out.println("car bean is ready for use!");
        car.introduce();
        car.destroy();
    }
}
