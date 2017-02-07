package lab1;

/**
 * Created by Роман on 04.02.2017.
 */
public class SortedGenerator implements Generator {

    @Override
    public int[] generate(int size) {
        int[] arr = new int[size];
        System.out.print("1.Size: "+size+ " SortedGenerator - ");
        for(int i=0;i<arr.length;i++)
        {
       arr[i]=i;
        }
      return arr;
    }
}
