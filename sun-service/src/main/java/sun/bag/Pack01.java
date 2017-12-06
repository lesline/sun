package sun.bag;

public class Pack01 {

    public static void main(String[] args) {


        int c[] = {3, 5, 2, 7, 4};
        int v[] = {2, 4, 1, 6, 5};
        int f[][] = new int[6][10];


        for (int i = 1; i < 6; i++)
            for (int j = 1; j < 10; j++) {
                System.out.println(i+"-"+j);
                if (c[i] > j)//如果背包的容量，放不下c[i]，则不选c[i]
                    f[i][j] = f[i - 1][j];
                else {
                    f[i][j] = getMaxx(f[i - 1][j], f[i - 1][j - c[i]] + v[i]);//转移方程式
                }
            }
        System.out.println(f);
    }

    private static int getMaxx(int a, int b) {
        return a>b?a:b;
    }

}
