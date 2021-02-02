package lesson4;
//Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 4 numbers");
        int[] numbers = new int[4];
        for (int i=0; i< numbers.length; i++){
            System.out.println("enter any int number");
            numbers[i]=input.nextInt();
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("the smallest number is "+min);

    }
}
