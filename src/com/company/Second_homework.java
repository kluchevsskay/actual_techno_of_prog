package com.company;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Second_homework {
    public static void main(String[] args) {
        int n = 10;
        int [] list_1 = new int[n];
        int [] list_2 = new int[5];
        int [] res = new int[5];

        for (int i = 0; i < n; i++) {
            list_1[i] = (int)(Math.random() * 10);
            if (list_1[i] == 0){
                list_1[i] = 1;
            }
        }

        for (int i = 0; i < 5; i++) {
            list_2[i] = i + 1;
        }

        System.out.println(Arrays.toString(list_1));
        System.out.println(Arrays.toString(list_2));


        int index = 0;
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            if(IntStream.of(list_1).anyMatch(x -> x == list_2[finalI])){
                list_2[index] = list_1[i];
                res[index] = list_2[finalI];
                index++;
            }
        }

        System.out.print("совпадающие числа: ");
        for (int i = 0; i < 5; i++) {
            if (res[i] != 0){
                System.out.print(res[i] + " ");
            }

        }
//        System.out.println(Arrays.toString(res));
    }
}