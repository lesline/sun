package sun.source;

/**
 * String str1 = new String("a");//两个对象
 * String str1 = "a";//一个对象
 * String c = "a" + "b" + "c";  //操作会加到常量池中
 * <p>
 * <p>
 * Created by zhangshaolin on 2017/12/20.
 */
public class String2Test {
    public static void main(String[] args) {

        // test1();
        // test2();
    }


    public static void test() {
        // String str2 = "SEUCalvin";//新加的一行代码，其余不变
        String str1 = new String("SEU") + new String("Calvin");
        System.out.println(str1.intern() == str1);
        System.out.println(str1 == "SEUCalvin");
    }

    public static void test1() {
        String str1 = "a";
        String str2 = "b";
        String str3 = "ab";
        String str4 = str1 + str2;
        String str5 = new String("ab");

        System.out.println(str5.equals(str3));//true
        System.out.println(str5 == str3);//false
        System.out.println(str5.intern() == str3);//true
        System.out.println(str5.intern() == str4);//false
    }

    public static void test2() {

        String a = new String("ab");
        String b = new String("ab");
        String c = "ab";
        String d = "a" + "b";
        String e = "b";
        String f = "a" + e;

        System.out.println(b.intern() == a);//fasle
        System.out.println(b.intern() == c);//true
        System.out.println(b.intern() == d);//true  编译期d已确定(修改、赋值)为ab
        System.out.println(b.intern() == f);//false
        System.out.println(b.intern() == a.intern());//true


    }

    public static void test3() {
        // 编译期已确定
        String a = "abc";
        String b = "abc";
        String c = "a" + "b" + "c";
        String d = "a" + "bc";
        String e = "ab" + "c";

        System.out.println(a == b);//true
        System.out.println(a == c);//true
        System.out.println(a == d);//true
        System.out.println(a == e);//true
        System.out.println(c == d);//true
        System.out.println(c == e);//true
    }
}
