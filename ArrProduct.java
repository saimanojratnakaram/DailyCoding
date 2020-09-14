package Dailycoding;

import java.util.Scanner;

public class ArrProduct {
      void productSol(int arr[]) {
         int n=arr.length;
        int i, temp = 1;
        int[] product = new int[n];
        for(i=0;i<n;i++){
            product[i]=1;
        }
        product[0]=arr[0];
        for(i=1;i<n;i++){
            product[i]=product[i-1]*arr[i];
        }
        for(i=n-1;i>0;i--){
            product[i]=product[i-1]*temp;
            temp*=arr[i];
        }
        product[0]=temp;
        for(i=0;i<n;i++){
            System.out.print(product[i]+" ");

        }

    }

    public static void main(String[] args) {
        ArrProduct ap=new ArrProduct();
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        String[] s1 = s.split(" ");
        int[] arr=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            arr[i]=Integer.parseInt(s1[i]);
        }
        ap.productSol(arr);
    }
    }
