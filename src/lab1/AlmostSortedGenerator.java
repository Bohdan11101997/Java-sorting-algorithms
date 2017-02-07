package lab1;

/**
 * Created by Роман on 04.02.2017.
 */
public class AlmostSortedGenerator implements Generator {

    @Override
    public int[] generate(int size) {
        System.out.print("3.Size: "+size+ " AlmostSortedGenerator - ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = i;
        }
        arr[arr.length - 1] = 1;
        return arr;
    }
}
