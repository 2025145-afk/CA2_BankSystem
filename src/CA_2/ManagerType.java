/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package CA_2;

/**
 *
 * @author diego
 */
public enum ManagerType {
    BRANCH_MANAGER("Branch Manager"),
    DEPARTMENT_MANAGER("Department Manager"),
    REGIONAL_MANAGER("Regional Manager");
    
    private String type;
    
    // Constructor
    ManagerType(String type) {
        this.type = type;
    }
    
    // Getter
    public String getType() {
        return type;
    }
    
    // Mostrar todos os tipos
    public static void displayTypes() {
        System.out.println("\nManager Types:");
        int i = 1;
        for (ManagerType mt : ManagerType.values()) {
            System.out.println(i + ". " + mt.getType());
            i++;
        }
    }
}
