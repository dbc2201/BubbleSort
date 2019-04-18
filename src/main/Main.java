package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the number of elements: ");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        BubbleSort b = new BubbleSort(n);

        System.out.println("Enter the values for the array: ");

        for (int i = 0; i < n; i++) {
            b.insert(scanner.nextLong());
        }

        System.out.println("The unsorted array is: ");

        b.display();

        b.sort();

        System.out.println("The sorted array is: ");

        b.display();

    }

}
