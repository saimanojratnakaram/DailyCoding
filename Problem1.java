package Dailycoding;

import java.util.HashSet;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args)
    {
        Problem1 p =new Problem1();
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        int sum = scanner.nextInt();
        String[] s1 = s.split(" ");
        int[] arr=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            arr[i]=Integer.parseInt(s1[i]);
        }
        System.out.println(p.checkSum(arr,sum));
    }
    boolean checkSum(int[] arr,int sum){
        int n=arr.length;
        HashSet<Integer> s=new HashSet<>();

        for(int i=0;i<n;i++){
            if(s.contains(sum-arr[i])){
                return true;
            }
            s.add(arr[i]);
        }
        return false;
    }
}
