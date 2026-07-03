public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,23,4,5,6,7,3};
        int n=arr.length;
        int i=0;
        int j=n-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int el:arr) System.out.print(el +" ");
        }
}
