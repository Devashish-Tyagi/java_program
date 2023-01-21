package recursion;

public class sumofarray {
    static int sum(int a[] , int idx){
        if(idx==a.length)
        return 0 ;
         int smallans=sum(a, idx+1) ;
        return smallans+a[idx] ;
    }
    public static void main(String[] args) {
        int a[]= {1,2,4,5,6,7} ;
        System.out.println(sum(a, 0));
    }
    
    
}
