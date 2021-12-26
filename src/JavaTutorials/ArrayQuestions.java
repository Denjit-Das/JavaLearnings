package JavaTutorials;

import java.util.Arrays;

public class ArrayQuestions {

    public static void main(String[] args) {

        //Sorting using sort()
        int numData[]={2,25,3,4,10,5,8,9};
        Arrays.sort(numData);
        System.out.println(Arrays.toString(numData));
        for(int i=0;i<numData.length;i++){
            System.out.println(numData[i]);
        }

    }
}
