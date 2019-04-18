package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the number of elements: ");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        BubbleSort b = new BubbleSort(n);

        // System.out.println("Enter the values for the array: ");
        System.out.println("Enter 1 to fill the values manually.");
        System.out.println("Enter 2 to fill the values automatically.");

        int ch = scanner.nextInt();

        if (ch == 1) {
            for (int i = 0; i < n; i++) {
                b.insert(scanner.nextLong());
            }
        } else if (ch == 2) {
            for (int i = 0; i < n; i++) {
                b.insert(new Random().nextLong() % 100);
            }
        } else {
            System.out.println("Enter either 1 or 2.");
        }

        System.out.println("The unsorted array is: ");

        b.display();

        b.sort();

        System.out.println("The sorted array is: ");

        b.display();

    }

}
