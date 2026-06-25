import java.util.Scanner;

public class profit_loss{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter selling price :");
        int selling=sc.nextInt();
        System.out.print("enter buying price :");
        int buying =sc.nextInt();
        sc.close();
        if (selling>buying) {
            System.out.print("profit is : ");
            System.out.println(selling-buying);
        }
        else{
            System.out.print("loss is of : ");
            System.out.println(buying-selling);
        }


    }
}