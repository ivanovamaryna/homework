//Вывести на консоль количество максимальных чисел среди этих четырех.


package lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 4 numbers");
        int[] numbers = new int[4];
        for (int i=0; i< numbers.length; i++){
            System.out.println("enter any int number");
            numbers[i]=input.nextInt();
        }
        int max = numbers[0];
        int count = 0;
        for (int num : numbers) {
            if (num > max) {
                max = num;
                count++;
            }
        }
        System.out.println("the biggest number is "+max+" and it appears "+count+" times");
    }
}
