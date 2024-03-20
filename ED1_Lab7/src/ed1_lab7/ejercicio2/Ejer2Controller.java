/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_lab7.ejercicio2;

/**
 *
 * @author win-dpto-info
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejer2Controller {

    public void ReinoStuff() {
        Siervo Rey = new Siervo();
        Siervo l = new Siervo();
        Siervo b = new Siervo();
        Siervo m = new Siervo();
        Siervo c = new Siervo();
        Siervo r = new Siervo();
        Siervo d = new Siervo();
        Siervo s = new Siervo();
        Siervo e = new Siervo();
        Siervo t = new Siervo();
        Siervo f = new Siervo();
        Siervo x = new Siervo();
        Siervo g = new Siervo();
        Siervo y = new Siervo();
        Siervo h = new Siervo();
        Siervo i = new Siervo();
        Siervo j = new Siervo();
        Siervo k = new Siervo();
        List<Siervo> listRey = new LinkedList<>();
        List<Siervo> listB = new LinkedList<>();
        List<Siervo> listC = new LinkedList<>();
        List<Siervo> listD = new LinkedList<>();
        List<Siervo> listE = new LinkedList<>();
        List<Siervo> listG = new LinkedList<>();
        List<Siervo> listJ = new LinkedList<>();

        listJ.add(m);
        j.setSiervos(listJ);
        listG.add(l);
        g.setSiervos(listG);
        listE.add(j);
        listE.add(k);
        listE.add(r);
        e.setSiervos(listE);
        listD.add(i);
        d.setSiervos(listD);
        listC.add(h);
        listC.add(t);
        c.setSiervos(listC);
        listB.add(f);
        listB.add(g);
        listB.add(s);
        b.setSiervos(listB);
        listRey.add(b);
        listRey.add(c);
        listRey.add(d);
        listRey.add(e);
        listRey.add(x);
        listRey.add(y);
        Rey.setSiervos(listRey);
        Reino Camelot = new Reino();
        Camelot.setRey(Rey);

        Scanner sc = new Scanner(System.in);
        int xoxo = 1;
        System.out.println("-----------Introduzca 0 para salir," + "\n"
                + "-----------1, 2, 3 para recorridos en preorden, postorden y entreorden," + "\n"
                + "-----------4 para cantidadAPagar");
        while (xoxo != 0) {
            System.out.println("Introduzca el numero de la opcion: ");
            xoxo = sc.nextInt();
            switch (xoxo) {
                case 1: {
                    System.out.println("El recorrido en preorden del arbol es:");
                    List<Integer> lista = Camelot.getRey().preorden();
                    for (Integer integer : lista) {
                        System.out.print(integer + " ");
                    }
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("El recorrido en postorden del arbol es:");
                    List<Integer> lista = Camelot.getRey().postorden();
                    for (Integer integer : lista) {
                        System.out.print(integer + " ");
                    }
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.println("El recorrido en entreorden del arbol es:");
                    List<Integer> lista = Camelot.getRey().entreorden();
                    for (Integer integer : lista) {
                        System.out.print(integer + " ");
                    }
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("El rey debe ganar: " + Camelot.cantidadAPagar());
                    break;
                }
                default:
                    xoxo = 0;
                    break;
            }
        }
    }

}
