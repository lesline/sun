package sun.source;

//该加载器什么都不做，只是通过委派模型加载类
public class MyClassLoader extends ClassLoader{  
    @Override  
    public Class<?> findClass(String name) throws ClassNotFoundException{  
        return super.loadClass(name);    
    }  
}  