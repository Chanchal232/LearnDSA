
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        int[] inputarray = new int[]{56,6,4,8,6,4,53,2,1};
        mergeSort(inputarray,0,inputarray.length);
        System.out.println(Arrays.toString(inputarray));
        
    }
    
    static void mergeSort(int[] input,int start,int end){
        if(end-start==1){
            return;
        }
        
        int mid = start+(end-start)/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid,end);
        
        mergeInPlace(input,start,mid,end);
    }
    
    static void mergeInPlace(int[] input,int start,int mid,int end){
        int[] mergedArray = new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(input[i]<input[j]){
                mergedArray[k] = input[i];
                i++;
            }else{
                mergedArray[k] = input[j];
                j++;
            }
            k++;
        }
        if(i<mid){
            mergedArray[k] = input[i];
                i++;
                k++;
        }
        if(j<end){
             mergedArray[k] = input[j];
                j++;
                k++;
        }
        for(int l=0;l<mergedArray.length;l++){
            input[start+l] = mergedArray[l];
        }
    }
    
    
}
