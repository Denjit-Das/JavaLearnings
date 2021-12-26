package JavaTutorials;

import java.util.Arrays;

public class ArrayQuestions {

    public static void main(String[] args) {

        //Sorting using sort()
//        int numData[]={2,25,3,4,10,5,8,9};
//        Arrays.sort(numData);
//        System.out.println(Arrays.toString(numData));
//        for(int i=0;i<numData.length;i++){
//            System.out.println(numData[i]);
//        }

        System.out.println("=======Ascending Sorting without Methods=======");
        int sortArr[]={90,25,9,-52,-60,10,100,-10,84};

        for (int i=0;i<sortArr.length;i++){
            for (int j=i+1;j<sortArr.length;j++){
                int temp=0;
                if (sortArr[i]>sortArr[j]){
                    temp=sortArr[i];
                    sortArr[i]=sortArr[j];
                    sortArr[j]=temp;
                }
            }
            System.out.println(sortArr[i]);
        }




    }
}
