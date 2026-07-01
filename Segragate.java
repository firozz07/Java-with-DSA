public class Segragate {
    public static void main(String[] args) {
        int [] arr={0,1,0,1,0,0,0,1,1};
        int countzero=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                countzero++;
            }
        }
        for (int i = 0; i < countzero; i++) {
            arr[i]=0;
        }
        for (int i = countzero; i < arr.length; i++) {
            arr[i]=1;
        }
        for(int i:arr) System.out.print(i+" ");
    }
}
