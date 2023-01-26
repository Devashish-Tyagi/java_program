package TwoDarray;



public class turnBYrightangle {
    public static void rotate(int a[][] , int n ) {
        for ( int i =0 ; i<n/2 ; i++){
            for ( int j =i ; j<n-i-1 ; j++){
                int temp = a[i][j] ;
                a[i][j]=a[n-1-j][i];

                a[n-1-j][i]=a[n-1-i][n-1-j];
                a[n-1-j][n-1-j]=a[j][n-1-i];
                a[j][n-1-i]=temp ;
            }
        }
    }
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int n=3 ;
    rotate(a, n);
    
    for( int i =0 ; i<n ; i++){
        for(int j=0 ; j<n ;  j++){
            System.out.print(a[i][j]+ " ");
        }
        System.out.println(" ");
    }
    }
}
