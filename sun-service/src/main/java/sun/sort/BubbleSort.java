package sun.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array={4,2,5,3,6,7};

        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {

                    if(array[j]<array[j+1]){
                        int tmp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=tmp;
                    }

            }

        }


    }
}
