public class twoSumArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
    int target=9;
    boolean found=false;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 1; j < arr.length; j++) {
            if(arr[i]+arr[j]==target) {
                found=true;
                System.out.print("the target is found at index :");
                System.out.print(arr[i]+" & ");
                System.out.print(arr[j]+" ");
                break;
            }
        }
        if(found) break;
    }
    if(found!=true){
        System.out.print("the target is not found");
    }
    }

    

}
