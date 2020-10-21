package arrayhome4;

import java.util.Scanner;

public class Arrayhome {

    static Scanner sc = new Scanner(System.in);
    static int[] number;

    public static void main(String[] args) {
        createArray();
        fillArray();
        printArray();
        
    }

    public static void createArray() {
        System.out.println("how many numbers do you want? ");
        int n1 = sc.nextInt();
        sc.nextLine();
        number = new int[n1];
    }

    public static void fillArray() {
        
        for (int i = 0; i < number.length; i++) {
            System.out.println(" The number at index " + i + " is: ");
            int numToAdd = sc.nextInt();
            

            number[i] = numToAdd;

        }
   
    }

    public static void printArray() {
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);

        }

    }

}
