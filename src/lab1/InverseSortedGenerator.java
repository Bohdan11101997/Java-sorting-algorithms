package lab1;

/**
 * Created by Роман on 04.02.2017.
 */
public class InverseSortedGenerator implements Generator {
    @Override
    public int[] generate(int size) {
        int[] arr=new int[size];

        System.out.print("2.Size: "+size+ " InsertionSorter - ");
        for(int i=arr.length-1; i>=0; i--)
        {
          arr[i]=i;
        }
        return  arr;

    }
}
