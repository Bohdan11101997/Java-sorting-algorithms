package lab1;

/**
 * Created by Роман on 04.02.2017.
 */
public class RandomSortedGenerator implements Generator {
    @Override
    public int[] generate(int size) {
        System.out.print("4.Size: "+size+ " RandomSortedGenerator - ");
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= (int)(Math.random()*size);

        }
        return arr;
    }
}
