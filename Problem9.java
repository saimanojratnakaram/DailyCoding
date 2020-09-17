// Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

// For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.


package Dailycoding;

import java.util.Scanner;

public class Problem9 {
    static int MaxSum(int[] Ar){
        int including=Ar[0];
        int excluding=0;
        int new_exclude;
        if(Ar.length==1){
            return Ar[0];
        }

        for(int i=1;i<Ar.length;i++){
            new_exclude=(including>excluding)?including:excluding;
            including=excluding+Ar[i];
            excluding=new_exclude;
        }
        return (including>excluding)?including:excluding;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();

        String[] s1 = s.split(" ");
        int[] arr=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            arr[i]=Integer.parseInt(s1[i]);
        }
        System.out.println(MaxSum(arr));
    }
}
