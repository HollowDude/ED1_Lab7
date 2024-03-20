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

public class ArbolGeneral {

    private Nodo raiz;

    List<ArbolGeneral> subArboles;

    public ArbolGeneral(Nodo raiz) {
        this.raiz = raiz;
        this.subArboles = new LinkedList<>();
    }

    public List<ArbolGeneral> getSubArboles() {
        return subArboles;
    }

    public void setSubArboles(List<ArbolGeneral> subArboles) {
        this.subArboles = subArboles;
    }

    public List<Integer> preorden() {
        List<Integer> lista = new LinkedList<>();
        lista.add(this.raiz.getDato());
        for (int i = 0; i < subArboles.size(); i++) {
            lista.addAll(subArboles.get(i).preorden());
        }
        return lista;
    }

    public List<Integer> postorden() {
        List<Integer> lista = new LinkedList<>();
        for (int i = 0; i < subArboles.size(); i++) {
            lista.addAll(subArboles.get(i).postorden());
        }
        lista.add(this.raiz.getDato());
        return lista;
    }

    public List<Integer> entreorden() {
        List<Integer> lista = new LinkedList<>();
        if (!subArboles.isEmpty()) {
            lista.addAll(subArboles.get(0).entreorden());
        }
        lista.add(this.raiz.getDato());
        for (int i = 1; i < subArboles.size(); i++) {
            lista.addAll(subArboles.get(i).entreorden());
        }
        return lista;
    }

    //inciso a
    public int sumaTotalNodos() {
        int cant = raiz.getDato();
        for (int i = 0; i < subArboles.size(); i++) {
            cant += subArboles.get(i).sumaTotalNodos();
        }
        return cant;
    }

    //inciso b
    public int cantNodos() {
        int cant = 1;
        for (int i = 0; i < subArboles.size(); i++) {
            cant += subArboles.get(i).cantNodos();
        }
        return cant;
    }

    //inciso c
    public int cantNodosInternos() {
        int cant = 0;
        for (int i = 0; i < subArboles.size() - 1; i++) {
            cant += subArboles.get(i).cantNodosInternos();
        }
        return cant;
    }

    //inciso d
    public int cantNodosHoja() {
        int cant = 0;
        if(subArboles.isEmpty()){
            cant++;
        }
        for (int i = 0; i < subArboles.size(); i++) {
            subArboles.get(i).cantNodosHoja();
        }
        return cant;
    }
}
