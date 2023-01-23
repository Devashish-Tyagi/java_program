package TwoDarray;

import java.util.Scanner;

//return first n rows of pascal triangle.
public class pascaltriangle {
    public static int[][] pascal(int n){
      int ans[][] = new int[n][] ;
      int c=1 ;
      for(int i =0 ; i<n ; i++){
        ans[i]=new int[c];
        for(int j=0 ; j<c ; j++){
            if(j==0) { 
                ans[i][j] =1 ;
            }
            else if(j==c-1) {
                ans[i][j] =1 ;
            }
            else{
                ans[i][j]= ans[i-1][j-1]+ ans[i-1][j] ;
            }
        }
        c++ ;
      }
         return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int n = sc.nextInt();
        int ans[][]= pascal(n);
        System.out.println();
        for ( int i=0 ; i<n ; i++){
            for ( int j=0 ; j<ans[i].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
