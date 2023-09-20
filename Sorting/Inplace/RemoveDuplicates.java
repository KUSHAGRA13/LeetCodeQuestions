package Sorting.InPlace;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for(int i=0;i<length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(new RemoveDuplicates().removeDuplicates(arr));

    }
    public int removeDuplicates(int[] arr) {

        int beginPointer =0, repetition=1;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i] == arr[i+1]) {
                repetition++;
                if(repetition==2){
                    beginPointer =i;
                }
            }


        }
        return beginPointer;
    }
}
