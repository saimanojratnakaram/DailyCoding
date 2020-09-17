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
