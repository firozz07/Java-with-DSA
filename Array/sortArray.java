
import java.util.*;

public class sortArray {
    public static void main(String[] args) {
        int [] arr={100,120,330,490,50};
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
    }
}

}