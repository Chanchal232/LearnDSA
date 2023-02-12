import java.util.*;
public class QuickSortMiddleElement {
    public static void main(String args[]) {
        //int x = 80060090;//20
        // int sum = 0;
        int[] x = {1,90,3,4,90,6};
        quickSort(x,0,x.length-1);
      System.out.println("Quick Sort" + Arrays.toString(x));
    }
    
    static void quickSort(int[] a,int low,int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int pivotIndex = low + (high-low)/2;//Consider mid element as pivot ,other options like end element , random ,can take anything
        int pivot = a[pivotIndex];
        while(start<=end){
            while(a[start]<pivot){
                start++;
            }
            while(pivot<a[end]){
                end--;
            }
            if(start<=end){
                
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(a,low,end);
        quickSort(a,start,high);
    }
    
}
