
package Array;
import java.util.Random;
import java.util.Scanner;


/**
 * Created by NewDivide on 05.03.2015.
 * Вывести массив и посчитать сумму*/


public class Mas_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random in=new Random();
        int n;
        System.out.println("Input n");
        n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){

            arr[i]=in.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        int sum=0;
        for(int temp:arr){
            sum+=temp;
        }
        System.out.print("Suma = " + sum);


    }
}
