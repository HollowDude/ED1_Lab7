/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_lab7.ejercicio1;

/**
 *
 * @author win-dpto-info
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejer1Controller {

    ArbolGeneral raiz;

    public void arbolGeneralStuff() {
        Scanner sc = new Scanner(System.in);

        Nodo a = new Nodo(52);
        Nodo b = new Nodo(74);
        Nodo c = new Nodo(85);
        Nodo d = new Nodo(27);
        Nodo e = new Nodo(85);
        Nodo f = new Nodo(97);
        Nodo g = new Nodo(48);
        Nodo h = new Nodo(13);
        ArbolGeneral aa = new ArbolGeneral(a);
        ArbolGeneral ab = new ArbolGeneral(b);
        ArbolGeneral ac = new ArbolGeneral(c);
        ArbolGeneral ad = new ArbolGeneral(d);
        ArbolGeneral ae = new ArbolGeneral(e);
        ArbolGeneral af = new ArbolGeneral(f);
        ArbolGeneral ag = new ArbolGeneral(g);
        ArbolGeneral ah = new ArbolGeneral(h);
        List<ArbolGeneral> listaA = new LinkedList<>();
        List<ArbolGeneral> listaB = new LinkedList<>();
        List<ArbolGeneral> listaC = new LinkedList<>();
        List<ArbolGeneral> listaF = new LinkedList<>();
        listaF.add(ah);
        listaC.add(ae);
        listaC.add(af);
        listaC.add(ag);
        listaB.add(ad);
        listaA.add(ab);
        listaA.add(ac);
        af.setSubArboles(listaF);
        ac.setSubArboles(listaC);
        ab.setSubArboles(listaB);
        aa.setSubArboles(listaA);

        this.raiz = aa;

        int x = 1;
        System.out.println("-----------Introduzca 0 para salir," + "\n"
                + "-----------1, 2, 3 para recorridos en preorden, postorden y entreorden," + "\n"
                + "-----------4 para sumaTotalNodos, 5 para cantNodos, 6 para cantNodosInternos, 7 para cantNodosHojas");
        while (x != 0) {
            System.out.println("Introduzca el numero de la opcion: ");
            x = sc.nextInt();
            switch (x) {
                case 1: {
                    System.out.println("El recorrido en preorden del arbol es:");
                    List<Integer> lista = raiz.preorden();
                    for (Integer integer : lista) {
                        System.out.print(integer + " ");
                    }
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("El recorrido en postorden del arbol es:");
                    List<Integer> lista = raiz.postorden();
                    for (Integer integer : lista) {
                        System.out.print(integer + " ");
                    }
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("El recorrido en entreorden del arbol es:");
                    List<Integer> lista = raiz.entreorden();
                    for (Integer integer : lista) {
                        System.out.print(integer + " ");
                    }
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("La suma total de todos los nodos es " + raiz.sumaTotalNodos());
                    break;
                }
                case 5: {
                    System.out.println("La cantidad de nodos es " + raiz.cantNodos());
                    break;
                }
                case 6: {
                    System.out.println("La cantidad de nodos internos es " + raiz.cantNodosInternos());
                    break;
                }
                case 7: {
                    System.out.println("La cantidad de nodos hojas es " + raiz.cantNodosHoja());
                    break;
                }
                default:
                    x = 0;
                    break;
            }
        }

    }

}
