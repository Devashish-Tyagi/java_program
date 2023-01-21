package recursionstring;

import java.util.Scanner;
                                    //Without using idx 
public class palindrome {
    public static String rev(String s){
        // Base Case
        if( s.length()==0) return "" ;
        String smallans=rev(s.substring(1)) ;
        return smallans+s.charAt(0);
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);         
        String s=sc.nextLine();                        //Palindrome not w0rking 
        String reverse=rev(s);
        System.out.println(reverse);
        if(reverse==s){
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not Palindrome");
    }
    
}
