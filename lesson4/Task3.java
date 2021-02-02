package lesson4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 4 numbers");
        int[] numbers = new int[5];
        for (int i=0; i< numbers.length; i++){
            System.out.println("enter any int number");
            numbers[i]=input.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("the smallest number is "+numbers[0]+ " and the biggest number is "+numbers[4]);
    }
}
