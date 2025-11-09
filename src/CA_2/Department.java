/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author diego
 */
public class Department {
    private int id;
    private String name;
    private String location;
    
    // Constructor
    public Department(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLocation() {
        return location;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    // toString para mostrar info
    @Override
    public String toString() {
        return "Department ID: " + id + " | Name: " + name + " | Location: " + location;
    }
} 
