public class max_in_array {
    public static void main(String[] args) {
        int [] arr={12,3,4,5,6,5,90};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
       }
}
