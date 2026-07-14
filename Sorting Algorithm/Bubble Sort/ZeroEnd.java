public class ZeroEnd {
    public static void main(String[] args) {
        int []arr={2,0,3,0,4,0,5};
        for (int i = 0; i < arr.length-1; i++) {
           for (int j = 0; j < arr.length-1; j++) {
             if(arr[j]!=0){

            }
            else{
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
           }
        }
        for(int i:arr) System.out.print(i+" ");
    }
}
