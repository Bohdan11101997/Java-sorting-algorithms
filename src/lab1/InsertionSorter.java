package lab1;

import java.util.List;

/**
 * Created by Роман on 04.02.2017.
 */
public class InsertionSorter implements Sorter {

    @Override
    public int[] sort(int[] arr) {
        System.out.print( "InsertionSorter" );
        for (int i = 0; i < arr.length; i++)
        {
            int temp = arr[i];// запомним i-ый элемент
            int j =i-1;//будем идти начиная с i-1 элемента
            while(j >= 0 && arr[j] > temp)
            // пока не достигли начала массива
            // или не нашли элемент больше i-1-го
            // который храниться в переменной temp
            {
                arr[j + 1] = arr[j];
                //проталкиваем элемент вверх
                j--;
            }
            arr[j + 1] = temp;
            // возвращаем i-1 элемент
        }
        return arr;
    }



}
