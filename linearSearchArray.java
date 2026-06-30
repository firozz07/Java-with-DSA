public class linearSearchArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,65};
        int target=65;
        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("thr target is found at the index "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("the target is not found");
        }
    }
}
