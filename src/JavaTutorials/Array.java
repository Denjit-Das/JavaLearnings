package JavaTutorials;

public class Array {

    public static void main(String[] args) {

        int[] number={54,5,54};

        for (int i=0;i< number.length;i++){
            System.out.println(number[i]);
        }

        int []number1={40,5,54};
        for (int i=0;i< number.length;i++){
            System.out.println(number1[i]);
        }

        int number2[]={88,5,54};
        for (int i=0;i< number.length;i++){
            System.out.println(number2[i]);
        }

        int[] a=new int[2];
        a[0]=23;
        a[1]=90;
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("=======================Two Dimensional========================");

        int twoDim[][]={{45,25},{89,36},{65,25}};
        System.out.println(twoDim.length);
        System.out.println(twoDim[0].length);

        for (int r = 0; r < twoDim.length; r++) {

            for (int c=0;c< twoDim[r].length;c++){
                System.out.println(twoDim[r][c]);
            }

        }

        for (int r[]:twoDim){

            for (int c:r){
                System.out.println(c);
            }
        }

    }
}
