package Dailycoding;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();

        String[] s1 = s.split(" ");
        int[] arr=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            arr[i]=Integer.parseInt(s1[i]);
        }

        int start=arrange(arr);
      //  System.out.println(start);
        System.out.println(find_missing(arr,start));

    }

    static int arrange(int[] arr){
        int negative_numbers=0,temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
                temp=arr[i];
                arr[i]=arr[negative_numbers];
                arr[negative_numbers]=temp;
                negative_numbers++;
            }

        }
        return negative_numbers;
    }
    static int find_missing(int[] arr,int strt){
        int i,size=arr.length;
        for (i = strt; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];
        }

        for (i = strt; i < size; i++)
            if (arr[i] > 0)
                return i + 1;

        return size + 1-strt;

    }

}
