/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_lab7.ejercicio3;

/**
 *
 * @author Humbert
 */
public class Persona {
    private String nombre;
    private String colorOjos;

    public Persona() {
    }

    public Persona(String nombre, String colorOjos) {
        this.nombre = nombre;
        this.colorOjos = colorOjos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
}
