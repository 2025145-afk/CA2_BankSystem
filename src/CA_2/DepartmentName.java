/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package CA_2;

/**
 *
 * @author diego
 */
public enum DepartmentName {
    RETAIL_BANKING("Retail Banking"),
    LOANS("Loans"),
    INVESTMENT("Investment"),
    IT("IT");
    
    private String name;
    
    // Constructor
    DepartmentName(String name) {
        this.name = name;
    }
    
    // Getter
    public String getName() {
        return name;
    }
    
    // Mostrar todos os departamentos
    public static void displayDepartments() {
        System.out.println("\nDepartments:");
        int i = 1;
        for (DepartmentName dept : DepartmentName.values()) {
            System.out.println(i + ". " + dept.getName());
            i++;
        }
    }
}
