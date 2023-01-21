package recursionstring;

import java.util.Scanner;

public class reverse {
    public static String rev(String s, int idx){
        if(idx==s.length()) return "";

        String smallans= rev(s, idx+1);
        return smallans+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println(rev(s, 0));
        String st=rev(s, 0) ;

    //     if(st==s){
    //         System.out.println("palindrome");
    //     }
    //     else
    //     System.out.println("Not Palindrome");
    //
 }
    
}
