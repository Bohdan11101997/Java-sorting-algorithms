package lab1;

import java.util.List;

/**
 * Created by Роман on 04.02.2017.
 */
public class ShellSorter implements Sorter {

    @Override
    public int[] sort(int[] arr) {
        System.out.print(  "ShellSorter" );
        int step = arr.length / 2;//инициализируем шаг.
        while (step > 0)//пока шаг не 0
        {
            for (int i = 0; i < (arr.length - step); i++)
            {
                int j = i;
                //будем идти начиная с i-го элемента
                while (j >= 0 && arr[j] > arr[j + step])
                //пока не пришли к началу массива
                //и пока рассматриваемый элемент больше
                //чем элемент находящийся на расстоянии шага
                {
                    //меняем их местами
                    int temp = arr[j];
                    arr[j] = arr[j + step];
                    arr[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;//уменьшаем шаг
        }
        return arr;
    }



}
