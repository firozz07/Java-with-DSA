import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(14);
        arr.set(3,100);
        arr.set(0,10);
        arr.remove(3);
        arr.add(2,200);
        System.out.println(arr.get(0));
        System.out.println(arr.size());
        System.out.println(arr);
     
    }
}
