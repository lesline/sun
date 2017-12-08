package sun.dynamic.bag;

public class Pack01 {

    public static void main(String[] args) {
        int c[] = {3, 5, 2, 7, 4};
        int v[] = {2, 4, 1, 6, 5};
        int f[][] = new int[5][11];

   /*  1 2 3 4 5 6 7 8 9 10
   3 2 0 0 2 2 2 2 2 2 2 2
   5 4 0 0 2 2 4 4 4 6 6 6
   2 1 0 1 2 2 4 4 5 6 6 7
   7 6 0 1 2 2 4 4 6 6 7 8
   4 5 0 1 2 5 5 6 7 7 9 9
    */
        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.print("『"+i+"』"+c[i] + " " + v[i] + "--->");

            for (int j = 1; j <= 10; j++) {

                if(i==0){
                    f[0][j]=j>v[0]?v[0]:0;
                    System.out.print(f[i][j] +" ");
                    continue;
                }
                if (c[i] > j)//如果背包的容量，放不下c[i]，则不选c[i]
                    f[i][j] = f[i - 1][j];
                else {
                    f[i][j] = getMaxx(f[i - 1][j], f[i - 1][j - c[i]] + v[i]);//转移方程式
                }
                System.out.print(f[i][j] +" ");
            }
        }

        for (int i = 0; i < f.length; i++) {
            System.out.println();
            for (int j = 0; j < f[i].length; j++) {
                System.out.print(f[i][j]);

            }

        }
    }

    private static int getMaxx(int a, int b) {
        return a>b?a:b;
    }

}
