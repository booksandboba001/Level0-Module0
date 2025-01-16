package _03_print_and_popups._1_greeter;

import java.util.Scanner;

public class greeter {
    public static void main(String[] args) {
        int repeat = 2;
        Scanner asked = new Scanner(System.in);
        while (repeat > 0){
            Scanner asking = new Scanner(System.in);
            System.out.println("What is your name?");
            System.out.println("hello " + asking.nextLine());
            System.out.println("😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃😃");
            repeat--;
        } 
        System.out.println("")
        if (asked == "yes"
    }
}
