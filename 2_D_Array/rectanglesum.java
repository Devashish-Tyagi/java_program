package TwoDarray;

import java.util.Scanner;

// find the sum of rectangle bounded by l1,r1,l2,r2  in a matrix
public class rectanglesum {
     public static void prefixsum(int matrix[][],int r, int c){
        for(int i=0;i<r ; i++){
            for(int j=0; j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        for(int j=0 ; j<c;j++){
            for (int i=0 ; i<r;i++){
            matrix[i][j]+=matrix[i-1][j];
            }
        }
     }

    public static int findsum(int matrix[][] , int l1,int r1,int l2 ,int r2){
        int left=0 ,up=0,leftup=0 ;
        if(l1>=1) up=matrix[l1-1][r2];
        if(r1>=1) left=matrix[l2][r2-1];
        if(l1>=1 & r1>=1) leftup=matrix[l1-1][r2-1];
      int sum=matrix[l2][r2]-left-up+leftup;
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows and Column");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int matrix[][]=new int[r][c];
    System.out.println("Enter "+r*c+" element");
    for(int i=0 ; i<r;i++){
        for (int j =0 ; j<c; j++){
            matrix[i][j]= sc.nextInt();
        }
    }
    for(int i=0 ; i<r;i++){
        for (int j =0 ; j<c; j++){
       System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
    }
    System.out.println("Enter rectangle boundaries  L1,R1,L2,R2");
    int l1=sc.nextInt();
    int r1=sc.nextInt();
    int l2=sc.nextInt();
    int r2=sc.nextInt();
    System.out.println("Rectangle elements sum:"+ findsum(matrix, l1, r1, l2, r2));
    
    }
    
}

