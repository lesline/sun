package sun.source;

/**
 * 方法名、java等字符串在常量池中存在
 * Created by zhangshaolin on 2017/12/26.
 */
public class StringInternJava {
    public static void main(String[] args) {
        testt();
    }

    public static void testt() {
        String s1 = new StringBuilder().append("aa").append("bb").toString();
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder().append("ja").append("va").toString();
        System.out.println(s2.intern() == s2);
    }

}
