class PrimeNumbers {
    public static void main(String[] args) {
        int n=40;
        boolean[] arr = new boolean[41];
        sieve(n,arr);
     
    }
    
    public static void sieve(int n,boolean[] arr) {
        for(int i=2;i*i<=n;i++){
            if(!arr[i]){
                for(int j=i*2;j<=n;j=j+i){
                    arr[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!arr[i]){
             System.out.print(i+" ");
            }
        }
    }
    
}
