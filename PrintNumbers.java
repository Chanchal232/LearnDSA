class PrintNumbers {
    public static void main(String[] args) {
       
       // recursionPrintRev(5);
    //recursionPrintBoth(5);
    //recursionPrintInc(5);
    
    }
    
    
    public static void recursionPrintBoth(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        recursionPrintBoth(n-1);
        System.out.println(n);
    }
    
    public static void recursionPrintRev(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        recursionPrintRev(n-1);
    }
    
    public static void recursionPrintInc(int n) {
        if(n==0){
            return;
        }
        recursionPrintInc(n-1);
        System.out.println(n);
    }
    
}
