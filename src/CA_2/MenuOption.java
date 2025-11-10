/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package CA_2;

/**
 *
 * @author diego
 */
public enum MenuOption {
   
    SORT(1, "Sort Employee List"),
    SEARCH(2, "Search for Employee"),
    ADD_RECORD(3, "Add New Employee"),
    BINARY_TREE(4, "Create Employee Hierarchy"),
    EXIT(5, "Exit Program");
    
    private int option;
    private String description;
    
    // Constructor
    MenuOption(int option, String description) {
        this.option = option;
        this.description = description;
    }
    
    // Getters
    public int getoption() {
        return option;
    }
    
    public String getDescription() {
        return description;
    }
    
    // Mostrar o menu completo
    public static void displayMenu() {
        System.out.println("\n===== BANK EMPLOYEE SYSTEM =====");
        for (MenuOption menu : MenuOption.values()) {
            System.out.println(menu.getoption() + ". " + menu.getDescription());
        }
        System.out.println("================================");
        System.out.print("Choose option: ");
    }
}
