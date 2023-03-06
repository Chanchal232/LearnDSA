class CeilByBinarySearch {
  
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println("Hello, World!"+ceilBinarySearch(arr,target));
        System.out.println("Hello, World!"+floorBinarySearch(arr,target));
    }
    
    //return the highest element <= target
    public static int floorBinarySearch(int[] input,int target) {
        if(target<input[0]){
            return -1;
        }
        return helperFloor(input,0,input.length-1,target);
    }
    
    public static int helperFloor(int[] input,int start,int end,int target) {
         while(start<=end){
             int mid = (start+(end-start)/2);
             
             if(input[mid] == target){
                 return input[mid];
             }else if(input[mid]<target){
                 start = mid+1;
                 
             }else {
                 end = mid-1;
             }
         }
         return input[end];
     }
        
    //return the smallest element >= target
    public static int ceilBinarySearch(int[] input,int target) {
        if(target>input[input.length-1]){
            return -1;
        }
        return helperCeil(input,0,input.length-1,target);
    }
    
     public static int helperCeil(int[] input,int start,int end,int target) {
         while(start<=end){
             int mid = (start+(end-start)/2);
             
             if(input[mid] == target){
                 return input[mid];
             }else if(input[mid]<target){
                 start = mid+1;
                 
             }else {
                 end = mid-1;
             }
         }
         return input[start];
     }
    
    
    
}
