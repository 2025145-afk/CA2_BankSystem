/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author diego
 */
public class Employee {
    private int id;
    private String name;
    private String managerType;
    private String department;
    
    // Constructor
    public Employee(int id, String name, String managerType, String department) {
        this.id = id;
        this.name = name;
        this.managerType = managerType;
        this.department = department;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getManagerType() {
        return managerType;
    }
    
    public String getDepartment() {
        return department;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setManagerType(String managerType) {
        this.managerType = managerType;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    // toString para mostrar info
    @Override
    public String toString() {
        return "Employee ID: " + id + " | Name: " + name + 
               " | Manager: " + managerType + " | Dept: " + department;
    }
}
