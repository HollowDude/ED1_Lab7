/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed1_lab7;

import ed1_lab7.ejercicio1.Ejer1Controller;
import ed1_lab7.ejercicio2.Ejer2Controller;
import ed1_lab7.ejercicio3.Ejer3Controller;
import java.util.Scanner;

/**
 *
 * @author win-dpto-info
 */
public class ED1_Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (x != 0) {
            System.out.println("Elija el numero de ejercicio:");
            x = sc.nextInt();
            switch (x) {
                case 1: {
                    Ejer1Controller e1 = new Ejer1Controller();
                    e1.arbolGeneralStuff();
                    break;
                }
                case 2: {
                    Ejer2Controller e2 = new Ejer2Controller();
                    e2.ReinoStuff();
                    break;
                }
                case 3: {
                    Ejer3Controller e3 = new Ejer3Controller();
                    e3.ArbolGenealogicoStuff();
                    break;
                }
                default:
                    x = 0;
                    break;
            }
        }

    }

}
