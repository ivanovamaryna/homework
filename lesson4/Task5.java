//Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.

package lesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter month number");
        int month = s.nextInt();
        String season = null;
        switch (month){
            case 1:
            case 2:
            case 12:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                System.out.println("month number =>1 and <=12");
        }
        System.out.println("your season is "+season);
    }
}
