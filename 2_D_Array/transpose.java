package TwoDarray;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        int r , c ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        r= sc.nextInt();
        System.out.println("Enter number of column :");
        c= sc.nextInt();
        int a1[][]= new int[r][c];
        int i , j ;
        System.out.println("Enter matrix elements :");
        for( i =0 ; i<r ; i++){
            for(j=0 ; j<c ;  j++){
                a1[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }
        int trans[][]= new int[r][c];
        for( i =0 ; i<r ; i++){
            for(j=0 ; j<c ;  j++){
                trans[i][j] = a1[j][i] ;
            }
        }
        System.out.println("Transpose :");
        for( i =0 ; i<r ; i++){
            for(j=0 ; j<c ;  j++){
               System.out.print(trans[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
    
}
