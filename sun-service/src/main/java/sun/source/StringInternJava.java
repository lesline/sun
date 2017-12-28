package sun.source;

/**
 *
 * 方法名、java等字符串在代码执行前已在常量池中存在
 * 所以s2.intern() 返回的是常量池中的数据
 *
 *
 * s1.intern() 返回的是常量池中的引用，引用的对象是堆中对象，所以=s1
 *
 *
 * Created by zhangshaolin on 2017/12/26.
 */
public class StringInternJava {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        String s1 = new StringBuilder().append("aa").append("bb").toString();
        System.out.println(s1.intern() == s1); //true
        String s2 = new StringBuilder().append("ja").append("va").toString();
        System.out.println(s2.intern() == s2);//false
    }
    public static void test2() {
        String s1 = new String("aabb");
        System.out.println(s1.intern() == s1);//false
        String s2 = new StringBuilder().append("ja").append("va").toString();
        System.out.println(s2.intern() == s2);//false
    }
}
