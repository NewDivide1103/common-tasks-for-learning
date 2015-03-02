package TestApp1;
import java.util.Scanner;

/**
 * Created by NewDivide on 01.03.2015.
 * Написать программу которая считывает 5-и значное число с
 клавиатуры и выводит цифры из которого оно состоит.
 Например : Считываеться исло 54698
 Выводиться:
 5
 4
 6
 9
 8
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 5-ти значне число ");
        int x = sc.nextInt();

        int b1 = x / 10000 % 10;
        System.out.println(b1);
        int b2 = x / 1000 % 10;
        System.out.println(b2);
        int b3 = x / 100 % 10;
        System.out.println(b3);
        int b4 = x / 10 % 10;
        System.out.println(b4);
        int b5 = x / 1 % 10;
        System.out.println(b5);
    }
}

