/**
 * Created by Shane on 2018/3/30 13:19
 */
import java.util.Arrays;

public class BubbleSort {
    public static void show(){
    }


    public static void main(String[] args) {
        int[] a = {15, 67, 26, 43, 61, 25, 84, 80, 34, 70};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if ( a[j]>a[j+1]) {
                    //swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }
}

