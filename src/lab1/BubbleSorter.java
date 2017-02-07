package lab1;

import java.util.List;

/**
 * Created by Роман on 04.02.2017.
 */
public class BubbleSorter implements Sorter {
    @Override
    public int[] sort(int arr[])
    {
        System.out.print(  "BubbleSorter ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
        }

    //   for (int i=0;i<arr.length;i++)
        //   System.out.print( arr[i]);
       return arr;
    }
}
