/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;
import java.util.Scanner;
import java.io.*;
import java.util.*;
/**
 *
 * @author diego
 */
public class MainApp {
  
        // Class variables (outside main method!)
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int employeeIdCounter = 1000;
    
    // Only ONE main method
    public static void main(String[] args) {
        System.out.println("Welcome to Bank Employee Management System!");
        
        // Read file
        loadEmployeesFromFile();
        
        // Menu loop
        boolean running = true;
        
        while (running) {
            MenuOption.displayMenu();
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            
            switch (choice) {
                case 1:
                    System.out.println("SORT selected");
                    // will implement later
                    break;
                case 2:
                    System.out.println("SEARCH selected");
                    // will implement later
                    break;
                case 3:
                    System.out.println("ADD RECORD selected");
                    // will implement later
                    break;
                case 4:
                    System.out.println("BINARY TREE selected");
                    // will implement later
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        
        scanner.close();
    }
    
    // Function to read file
    private static void loadEmployeesFromFile() {
        System.out.print("Please enter the filename to read: ");
        String filename = scanner.nextLine();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    // Create employee with random data for now
                    String name = line.trim();
                    String managerType = "Branch Manager"; // temporary
                    String department = "Retail Banking"; // temporary
                    
                    Employee emp = new Employee(employeeIdCounter++, name, managerType, department);
                    employeeList.add(emp);
                }
            }
            
            br.close();
            System.out.println("File read successfully! Loaded " + employeeList.size() + " employees.");
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}
