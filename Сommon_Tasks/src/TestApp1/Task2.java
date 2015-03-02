package TestApp1;
import java.util.Scanner;

/**
 * Created by NewDivide on 01.03.2015.
 * Написать программу которая вычислит и выведет на экран
 площадь треугольника если известны его стороны.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введіть 3 сторони трикутника, для того, щоб вичислити його площу");
        System.out.print("Перша сторона:");
        int oneside=sc.nextInt();
        System.out.print("Друга сторона:");
        int secondside=sc.nextInt();
        System.out.print("Третя сторона:");
        int thirdside=sc.nextInt();

        int p = (oneside+secondside+thirdside)/2;
        double s = Math.sqrt(p * (p - oneside) * (p - secondside) * (p - thirdside));
        System.out.println("Площа трикутника дорівнює:" + s);


    }
}