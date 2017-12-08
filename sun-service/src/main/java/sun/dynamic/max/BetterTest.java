package sun.dynamic.max;

public class BetterTest {
    public static void main(String[] args) {
        int[] a = {0, -2, 3, 5, -1, 2};
        System.out.println(maxSubStr(a));
    }

    static int maxSubStr(int[] a) {

        int max = -1000;  //初始值为负无穷大
        int sum;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }




}
