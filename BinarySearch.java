public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(binarySearch(arr,0));
    }
    
    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        return helper(arr,target,start,end);
    }
    
    public static int helper(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start+((end-start)/2); // because stat+end only might exceed the int value
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>=target){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
