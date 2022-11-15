import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        System.out.print("ID number: ");
        int idNumber = scanner.nextInt();
        System.out.println("Your id number is : " + idNumber + ".");

        System.out.print("Full number: ");
        String name = scanner.next();
        System.out.println("Your name is " + name + ".");

        //2
        System.out.println("hello dear costumer, for how much days you want to rent a car?");
        int days = scanner.nextInt();
        int cost;
        if (days < 3) {
            cost = (days * 35);
            System.out.println("Your total cost is " + cost);
        } else if (days > 3 && days < 7) {
            cost = (days * 35) - 10;
            System.out.println("Total cost: " + cost);
        } else if (days > 7) {
            cost = (days * 35) - 40;
            System.out.println("Total cost: " + cost);
        }

        //3
        int[] boxDigits = {1, 4, 7, 8};
        int multiplyNumber = 1;

        for (int i = 0; i < boxDigits.length; i++) {
            multiplyNumber = multiplyNumber * boxDigits[i];

        }
        System.out.println(multiplyNumber);

        //4
        String[] waves = {"-", "-", "~", "-", "-", "-", "-", "~", "~", "-", "-", "~", "~"};

        int count = 0;
        int numberOfTransictions = 0;

        for (int i = 0; i < waves.length; i++) {
            if (waves[i].equals("-") && waves[i + 1].equals("~")) {
                count++;
            }
            numberOfTransictions++;
        }

        double percent = (double) (count / numberOfTransictions);

    }
}