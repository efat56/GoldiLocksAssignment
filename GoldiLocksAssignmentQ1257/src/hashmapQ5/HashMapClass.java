package hashmapQ5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapClass {

    public static void main(String[] args) {

        // Create a HashMap to store name-age pairs
        Map<String, Integer> hashMap = new HashMap<>();

        // Create a Scanner for user input
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Enter 1 to store Name and Age");
            System.out.println("2. Enter 2 for Search by Name");
            System.out.println("3. Enter 3 for Quit");

            // Get user's choice
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the name....: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter the age....: ");
                    int age = Integer.parseInt(sc.nextLine());
                    
                    hashMap.put(name, age);
                    break;
                    
                case 2:
                    System.out.print("Enter a name to search......: ");
                    String findName= sc.nextLine();
                    
                    if (hashMap.containsKey(findName)) {
                        int foundAge = hashMap.get(findName);
                        System.out.println(findName + "," + foundAge );
                    } else {
                        System.out.println(findName + " not found in the HashMap.");
                    }
                    break;
                case 3:
                    // Exit the program
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
