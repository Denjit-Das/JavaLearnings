package JavaTutorials;

public class ConstructorOverloading {

    public ConstructorOverloading(int a,int b){
        System.out.println(a+b);
    }
    public ConstructorOverloading(int a,double b){
        System.out.println(a+b);
    }
    public ConstructorOverloading(double a,double b){
        System.out.println(a+b);
    }

    public static void main(String[] args){
        ConstructorOverloading co1=new ConstructorOverloading(10,20);
        ConstructorOverloading co2=new ConstructorOverloading(10,20.5);
    }
}
