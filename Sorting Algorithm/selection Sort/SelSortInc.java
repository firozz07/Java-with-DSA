
public class SelSortInc {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length; i++) {
            int max=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        for(int i:arr)System.out.print(i+" ");
    }
}
