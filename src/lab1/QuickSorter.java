package lab1;

import java.util.List;

/**
 * Created by Роман on 04.02.2017.
 */
public class QuickSorter implements Sorter {
    @Override
    public int[] sort(int[] arr) {
      System.out.print("QuickSorter");
        sort(arr,0,arr.length-1);
        return arr;
    }

    public int[] sort(int[] arr, int start, int end) {
        if(start>=end) return arr;
        int i=start;
        int j=end;
        int op=i-(i-j )/2;
        while(i<j)
        {
            while((i<op) && (arr[i]<=arr[j]))i++;
            while((j>op) && (arr[j]>=arr[i]))j--;
            if(i<j)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
      if(i==op)
       op =j;
                else if(j==op) op=i;
            }

        }
     sort(arr,start, op);
        sort(arr,op+1, end);
        return arr;
    }

}
