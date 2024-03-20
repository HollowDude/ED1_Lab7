/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_lab7.ejercicio2;

/**
 *
 * @author win-dpto-info
 */
public class Reino {

    private Siervo Rey;

    public Siervo getRey() {
        return Rey;
    }

    public void setRey(Siervo rey) {
        Rey = rey;
    }
    
    //inciso a
    public float cantidadAPagar() {
        float moneditas = 0;
        for (int i = 0; i < Rey.getSiervos().size(); i++) {
            if(Rey.getSiervos().get(i).preorden().size() >= 1){
                moneditas += 400 / Rey.getSiervos().get(i).cantidadAPagar();
            }else{
                return 2;   
            }
        }
        
        return moneditas;
    }

}
