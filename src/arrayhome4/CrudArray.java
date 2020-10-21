package arrayhome4;

import java.util.Scanner;

public class CrudArray {

    static Scanner sc = new Scanner(System.in);

    static int[] numbers = new int[6];    static boolean loop = true;
    static  int counter = 0;

    public static void main(String[] args) {

        while (loop) {
            menu();
            addNumber();
            updateNumber();
            deleteNumber();
            listAllNumber();
            minNumber();
            maxNumber();

        }

    }

    public static void menu() {
        System.out.println("1.addNumber");
        System.out.println("2.updateNumber");
        System.out.println("3.delete number");
        System.out.println("4.listallnumber");
        System.out.println("5.minNumber");
        System.out.println("6.maxNumber");
        System.out.println("7.exit");

        System.out.println("\nmake a choice");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 0:
                loop = false;
                break;
            case 1:
                addNumber();
                break;
            case 2:
                updateNumber();
                break;

            case 3:
                deleteNumber
                ();
                break;
            case 4:
                listAllNumber();
                break;
            case 5:
                minNumber();
                break;

        }

    }

    public static void addNumber() {
        System.out.println("what  number do you want to add ?");
        numbers[counter]= sc.nextInt();
        counter= counter + 1 ;
        sc.nextLine();
       

    }

    public static void deleteNumber() {

    }
    
    public static void updateNumber()
    {
        System.out.println("what position do u want to upadte number?");
        int pos = sc.nextInt();
        System.out.println("what new numbe do u want");
        int newNumber= sc.nextInt();
        numbers [pos] =  newNumber;
    }
    
    public static void listAllNumbers()
    {
        
    }
    public static void minNumber()
    {
        
    }
    
    public static void maxNumber()
    {
        
    }

    private static void listAllNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
