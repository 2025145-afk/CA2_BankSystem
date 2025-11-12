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
                   sortEmployees();
                    break;
                    // will implement later
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
    // Function to sort employees using Merge Sort
    private static void sortEmployees() {
        System.out.println("\n========== SORTING EMPLOYEES ==========");
        
        if (employeeList.isEmpty()) {
            System.out.println("No employees to sort!");
            return;
        }
        
        // Create copy to sort
        ArrayList<Employee> sortedList = new ArrayList<>(employeeList);
        
        // Perform merge sort
        mergeSort(sortedList, 0, sortedList.size() - 1);
        
        // Display first 20 names
        System.out.println("\nFirst 20 employees (sorted alphabetically):");
        int displayCount = Math.min(20, sortedList.size());
        for (int i = 0; i < displayCount; i++) {
            System.out.println((i + 1) + ". " + sortedList.get(i).getName());  // ERRO AQUI - falta importar método
        }
        
        System.out.println("\nTotal employees sorted: " + sortedList.size());
        System.out.println("=======================================")
    }  // ERRO - falta ponto e vírgula
    
    // Recursive Merge Sort implementation
    private static void mergeSort(ArrayList<Employee> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            // Recursively sort left half
            mergeSort(list, left, mid);
            
            // Recursively sort right half
            mergeSort(list, mid + 1, right);
            
            // Merge sorted halves
            merge(list, left, mid, right);
        }
    }
    
    // Merge function for merge sort
    private static void merge(ArrayList<Employee> list, int left, int mid, int right) {
        // Create temporary arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        ArrayList<Employee> leftArray = new ArrayList<>();
        ArrayList<Employee> rightArray = new ArrayList<>();
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray.add(list.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightArray.add(list.get(mid + 1 + j));
        }
        
        // Merge temporary arrays back
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            // Compare employee names
            if (leftArray.get(i).getName().compareToIgnoreCase(rightArray.get(j).getName()) <= 0) {
                list.set(k, leftArray.get(i));
                i++;
            } else {
                list.set(k, rightArray.get(j))  // ERRO - falta ponto e vírgula
                j++;
            }
            k++;
        }
        
        // Copy remaining elements
        while (i < n1) {
            list.set(k, leftArray.get(i));
            i++;
            k++;
        }
        
        while (j < n2) {
            list.set(k, rightArray.get(j));
            j++;
            k++;
        }
    }
}
