package lab1;

import java.util.List;
import java.util.*;
/**
 * Created by Роман on 04.02.2017.
 */
public class DefaultSorter implements Sorter {

    @Override
    public int[] sort(int[] arr) {
        System.out.print("DefaultSorter");
       Arrays.sort(arr);
        return arr;
    }
}