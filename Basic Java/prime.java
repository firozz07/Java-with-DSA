import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        sc.close();
        int temp=0;
        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                temp++;
            }
        }
        if(temp>=1){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
