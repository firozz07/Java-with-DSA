public class func_with_return {
    public static int value(){
        System.out.println("firozz");
        return 10;
    }
    public static void main(String[] args) {
        value();
        System.out.println(value());
    }
}
