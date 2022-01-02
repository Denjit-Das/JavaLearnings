package JavaTutorials;

public class ReverseString {

    public static void main(String[] args){

        String str="Welcome to USA";
        String revStr="";
        int len=str.length();

        for(int i=len-1; i>=0;i--){
            revStr=revStr+str.charAt(i);
        }

        System.out.println(revStr);
    }
}
