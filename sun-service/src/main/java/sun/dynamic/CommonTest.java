package sun.dynamic;

public class CommonTest {
    public static void main(String[] args) {


        int [] a={0, -2, 3, 5, -1, 2};
        System.out.println(MaxSubString(a,6));
    }


 static int MaxSubString(int[] A, int n)
        {
        int max = -1000;  //初始值为负无穷大
          int sum;
          for(int i = 0; i < n; i++)
          {
            sum = 0;
            for(int j = i; j < n; j++)
            {
              sum += A[j];
              if(sum > max)
                max = sum;
            }
          }
          return max;

        }
}
