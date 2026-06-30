public class twoSumArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
    int target=65;
    boolean found=false;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            if(arr[i]+arr[j]==target) {
                found=true;
            }

        }
    }
    if(found){
        System.out.println("the target is found");
    }
    else{
        System.out.println("target doe not found");
    }
    }

    

}
