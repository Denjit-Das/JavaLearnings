package JavaTutorials;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String orgStr=scan.next();

        String revStr="";

        for (int i=orgStr.length()-1;i>=0;i--){
            revStr=revStr+orgStr.charAt(i);
        }
        System.out.println(revStr);
        if (orgStr.equalsIgnoreCase(revStr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
