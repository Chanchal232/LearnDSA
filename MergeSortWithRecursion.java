
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        int[] inputarray = new int[]{56,6,4,8,6,4,53,2,1};
        inputarray = mergeSort(inputarray);
        System.out.println(Arrays.toString(inputarray));
        
    }
    
    static int[] mergeSort(int[] input){
        if(input.length==1){
            return input;
        }
        
        int mid = input.length/2;
        int[] leftArray = mergeSort(Arrays.copyOfRange(input,0,mid));
        int[] rightArray = mergeSort(Arrays.copyOfRange(input,mid,input.length));
        
        return merge(leftArray,rightArray);
    }
    
    static int[] merge(int[] leftArray,int[] rightArray){
        int[] mergedArray = new int[leftArray.length+rightArray.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<leftArray.length && j<rightArray.length){
            if(leftArray[i]<rightArray[j]){
                mergedArray[k] = leftArray[i];
                i++;
            }else{
                mergedArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        if(i<leftArray.length){
            mergedArray[k] = leftArray[i];
                i++;
                k++;
        }
        if(j<rightArray.length){
             mergedArray[k] = rightArray[j];
                j++;
                k++;
        }
        return mergedArray;
    }
    
    
}
