/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_lab7.ejercicio3;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejer3Controller {

    public void ArbolGenealogicoStuff() {

        Persona a = new Persona("Juan", "Azul");
        Persona b = new Persona("Pepe", "Marron");
        Persona c = new Persona("Serena", "Verde");
        Persona d = new Persona("Francisca", "Marron");
        Persona e = new Persona("Juana", "Marron");
        Persona f = new Persona("Andres", "Verde");
        Persona g = new Persona("Nestor", "Marron");
        Persona h = new Persona("Manolo", "Verde");
        Persona i = new Persona("Nancy", "Azul");
        Persona j = new Persona("Amanda", "Verde");
        Persona k = new Persona("Jonh", "Marron");
        Persona l = new Persona("Humberto", "Azul");

        ArbolGenealogico aa = new ArbolGenealogico(a);
        ArbolGenealogico ab = new ArbolGenealogico(b);
        ArbolGenealogico ac = new ArbolGenealogico(c);
        ArbolGenealogico ad = new ArbolGenealogico(d);
        ArbolGenealogico ae = new ArbolGenealogico(e);
        ArbolGenealogico af = new ArbolGenealogico(f);
        ArbolGenealogico ag = new ArbolGenealogico(g);
        ArbolGenealogico ah = new ArbolGenealogico(h);
        ArbolGenealogico ai = new ArbolGenealogico(i);
        ArbolGenealogico aj = new ArbolGenealogico(j);
        ArbolGenealogico ak = new ArbolGenealogico(k);
        ArbolGenealogico al = new ArbolGenealogico(l);

        List<ArbolGenealogico> listaA = new LinkedList<>();
        List<ArbolGenealogico> listaB = new LinkedList<>();
        List<ArbolGenealogico> listaC = new LinkedList<>();
        List<ArbolGenealogico> listaD = new LinkedList<>();
        List<ArbolGenealogico> listaF = new LinkedList<>();
        List<ArbolGenealogico> listaI = new LinkedList<>();

        listaI.add(ak);
        listaI.add(al);
        ai.setHijos(listaI);
        listaD.add(ai);
        ad.setHijos(listaD);
        listaC.add(ag);
        listaC.add(ah);
        ac.setHijos(listaC);
        listaF.add(aj);
        af.setHijos(listaF);
        listaB.add(ae);
        listaB.add(af);
        ab.setHijos(listaB);
        listaA.add(ab);
        listaA.add(ac);
        listaA.add(ad);
        aa.setHijos(listaA);

        Scanner sc = new Scanner(System.in);
        int x = 1;
        System.out.println("-----------Introduzca 0 para salir," + "\n"
                + "-----------1, 2, 3 para recorridos en preorden, postorden y entreorden," + "\n"
                + "-----------4 para listaPersonasConOjosDeUnColor, 5 para cantidadPersonasConOjosDistintos");
        while (x != 0) {
            System.out.println("Introduzca el numero de la opcion: ");
            x = sc.nextInt();
            switch (x) {
                case 1: {
                    System.out.println("El recorrido en preorden del arbol es:");
                    List<String> lista = aa.preorden();
                    for (String nombre : lista) {
                        System.out.print(nombre + " ");
                    }
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("El recorrido en postorden del arbol es:");
                    List<String> lista = aa.postorden();
                    for (String nombre : lista) {
                        System.out.print(nombre + " ");
                    }
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("El recorrido en entreorden del arbol es:");
                    List<String> lista = aa.entreorden();
                    for (String nombre : lista) {
                        System.out.print(nombre + " ");
                    }
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("Introduzca el color:");
                    String color = sc.next();
                    System.out.println("La lista de personas con ojos color " + color + " es:");
                    List<Persona> lista = aa.listaPersonasConOjosDeUnColor(color);
                    for (Persona persona : lista) {
                        System.out.print(persona.getNombre() + " ");
                    }
                    System.out.println("");
                    sc.nextLine();
                    break;
                }
                case 5: {
                    System.out.println("La cantidad de personas con ojos de color distinto al de sus padres es: " + aa.cantidadPersonasConOjosDistintos());
                    break;
                }
                default:
                    x = 0;
                    break;
            }
        }

    }

}
