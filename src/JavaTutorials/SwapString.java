package JavaTutorials;

public class SwapString {

    public static void main(String[] args){

        System.out.println("======Swapping without third variable======");

        String s1="Java";
        String s2="Selenium";

        s1=s1+s2;
        //System.out.println(s1.length());
        s2=s1.substring(0,s1.length()-s2.length());
        //System.out.println(s2);
        s1=s1.substring(s2.length());
        System.out.println(s1);

//        String s="WelcomeHome";
//        System.out.println(s.length());
//        System.out.println(s.substring(4));
    }
}
