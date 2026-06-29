import java.util.Scanner;

public class array_input{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[6];
        for (int i = 0; i<6; i++) {
            arr[i]=sc.nextInt();
            System.out.print(2*arr[i] +" ");
        }
        sc.close();
    }   
}