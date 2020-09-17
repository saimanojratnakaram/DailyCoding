package Dailycoding;

import java.util.Scanner;

public class Problem12 {
    static int WaysToClimb(int num,int[] Options) {
        int[] Ways = new int[num+1];
        Ways[0]=1;
        int p=0;
        for(int i=1;i<=num;i++){
            for(int j=0;j<Options.length;j++) {
                if (i - Options[j] > 0) {
                    p=i-Options[j];
                    if(p<0){
                        p=num+p;
                    }
                    Ways[i] += Ways[p];
                }
            }

             for(int k=0;k<Options.length;k++){
                 if(Options[k]==i){
                     Ways[i]++;
                 }

            }
        }

        return Ways[num];
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the values for number of steps we can climb at a time");
        String s= scanner.nextLine();
        System.out.println("Number of steps to climb");
        int num=scanner.nextInt();
        String[] s1 = s.split(" ");
        int[] arr=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            arr[i]=Integer.parseInt(s1[i]);
        }
        System.out.println(WaysToClimb(num,arr));
    }
}
