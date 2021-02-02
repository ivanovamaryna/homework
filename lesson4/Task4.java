package lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name 1");
        String name1 = input.nextLine();
        System.out.println("Enter name 2");
        String name2 = input.nextLine();
        System.out.println(name1.equalsIgnoreCase(name2)? "name 1 and name2 are same"  : "name1 is NOT equal name2");
        //if name1.equals(name2) {
        // System.out.println("name 1 equals name2");}
        // else System.out.println("name 1 is not equal name2");
    }
}
