package recursionstring;

public class sumofsubset {
    static void sumsubset(int a[] , int n , int idx , int sum){
        if(idx>=n){
            System.out.println(sum);
            return ;
        }
        sumsubset(a, n, idx+1 , sum);
        sumsubset(a, n, idx+1 , sum+a[idx]);
    }
    public static void main(String[] args) {
        int a[]={ 2,4,5};
        sumsubset(a, a.length, 0, 0);
    }
    
}
