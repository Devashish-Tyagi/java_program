package TwoDarray;

import java.util.Scanner;

public class matrixmultiplication {
    public static void main(String[] args) {
        
    int r , c , i ,j , k ;
    Scanner sc= new Scanner(System.in);
    
 
    System.out.println("Enter the number of rows :");
    r= sc.nextInt();
    System.out.println("Enter the number of column");
    c=sc.nextInt();

    int a1[][] = new int[r][c];
    int a2[][] = new int[r][c];
    int ans[][] = new int[r][c];
     
    System.out.println("Enter the first matrix element :");
    for(i=0 ; i<r ; i++){
        for(j=0 ; j<c ; j++){
            a1[i][j]=sc.nextInt();
        }
        
    }
    System.out.println("Enter the second matrix element :");
    for(i=0 ; i<r ; i++){
        for(j=0 ; j<c ; j++){
            a2[i][j]=sc.nextInt();
        }
        
    }
    for(i=0 ; i<r ; i++){
        for(j=0 ; j<c ; j++){
            ans[i][j]=0 ;
            for(k=0 ; k<c;k++){
            ans[i][j]=ans[i][j]+ a1[i][k]*a2[k][j];
        }}
    }
    System.out.println("Answer matrix is :");
    for(i=0 ; i<r ; i++){
        for(j=0 ; j<c ; j++){
            System.out.print(ans[i][j]+ " ");
        }
        System.out.println(" ");
    }





}
}