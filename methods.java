import java.util.Scanner;

public class methods {
    public static void maxi(int a,int b,int c) {
        if(a>b && a>c) System.out.println(a + "is greater");
        if(b>a && b>c) System.out.println(b + "is greater");
        else System.out.println(c + "is greater");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("add nums");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        sc.close();
        maxi(x,y,z);
    }
}
