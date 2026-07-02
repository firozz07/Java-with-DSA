import java.util.ArrayList;

public class addoneinarray {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        int carry=1;
        int [] q={1,2,3,4};
        for (int i = q.length-1; i >= 0; i--) {
            if(q[i]+carry<=9){
                arr.add(q[i]+carry);
                carry=0;
            }
            else{
                arr.add(0);
                carry=1;
            }
        }
        System.out.println(arr.reversed());
    }
}
