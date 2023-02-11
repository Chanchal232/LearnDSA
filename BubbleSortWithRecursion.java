//This question is based on star pattern.
//****
//***
//**
//*
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] inputarray = new int[]{5,6,4,3,2,1};
        bubbleSort(inputarray);
        System.out.println(Arrays.toString(inputarray));
        
    }
    
    static void bubbleSort(int[] input){
       helper(input,0,input.length-1);
    }
    
    static void helper(int[] input,int startIndex,int endIndex){
        if(endIndex==0){
            return;
        }
         if(startIndex<endIndex){
            if(input[startIndex]>input[endIndex]){
                //swap
                int temp = input[startIndex];
                input[startIndex] = input[endIndex];
                input[endIndex] = temp;
            }
            helper(input,startIndex+1,endIndex);
        }else{
            helper(input,0,endIndex-1);
        }else{
            helper(input,0,endIndex-1);
        }
    }
    
}
