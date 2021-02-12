//Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
package lesson4;

import java.sql.SQLOutput; << делай alt + control + o чтобы убрать иморты 
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 4 numbers"); << следи за копипастой
        int[] numbers = new int[5];
        for (int i=0; i< numbers.length; i++){
            System.out.println("enter any int number");
            numbers[i]=input.nextInt();
        }
        Arrays.sort(numbers); << это хорошо и правильно, но напиши свою сортировку 
        System.out.println("the smallest number is "+numbers[0]+ " and the biggest number is "+numbers[4]);
    }
}
