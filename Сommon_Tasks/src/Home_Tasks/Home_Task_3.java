package Home_Tasks;
import java.util.Scanner;

/**
 * Created by NewDivide on 01.03.2015.
 * Написать программу которая вычислит и выведет на экран
 длинну окружности, если ее радиус считывается с
 клавиатуры.
 */
public class Home_Task_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введіть радіус кола:");
        int r=sc.nextInt();
        double length=Math.PI*2*r;
        System.out.println("Довжина кола дорівнює " +length);


    }
}