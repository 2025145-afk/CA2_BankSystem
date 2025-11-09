/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author diego
 */
public class Manager {

    private int id;
    private String name;
    private String role; // managerType
    
    // Constructor
    public Manager(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getRole() {
        return role;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    // toString para mostrar info
    @Override
    public String toString() {
        return "Manager ID: " + id + " | Name: " + name + " | Role: " + role;
    }
}

