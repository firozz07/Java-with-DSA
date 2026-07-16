public class Eg{
    public static void main(String[] args) {
        int []arr={7,3,4,7,8,1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i:arr) System.out.print(i+" ");
    }
}