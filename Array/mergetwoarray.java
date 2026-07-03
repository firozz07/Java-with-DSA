import java.util.ArrayList;
public class mergetwoarray {
    public static void main(String[] args) {
        ArrayList<Integer> newArray=new ArrayList<>();
        int [] arr={1,3,5,6,7};
        int [] arr2={8,9,10,11,12};
        int i=0,j=0,k=0;
        while(i<arr.length && j<arr2.length){
            if(arr[i]<arr2[j]){
                newArray.add(arr[i]);
                i++;
                k++;
            }
            else{
                newArray.add(arr2[j]);
                j++;
                k++;
            }
        }
        while(i<arr.length){
            newArray.add(arr[i]);
            i++;
            k++;
        }
        while(j<arr2.length){
            newArray.add(arr2[j]);
            j++;
            k++;
        }
        System.out.print(newArray);
        
    }
}
