public class rotating_the_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int i=0;
        int j=n-8;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=3;
        j=n-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=n-1;
         while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int e:arr) System.out.print(e+" ");
        
    }
}
