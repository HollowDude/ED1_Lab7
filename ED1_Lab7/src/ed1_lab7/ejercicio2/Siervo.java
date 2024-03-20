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

public class Siervo extends Reino {
    private List<Siervo> siervos;

    public Siervo() {
        this.siervos =  new LinkedList<>();
    }

    public List<Siervo> getSiervos() {
        return siervos;
    }

    public void setSiervos(List<Siervo> siervos) {
        this.siervos = siervos;
    }
    
    public List<Integer> preorden() {
        List<Integer> lista = new LinkedList<>();
        lista.add(this.siervos.size());
        for (int i = 0; i < siervos.size(); i++) {
            lista.addAll(siervos.get(i).preorden());
        }
        return lista;
    }

    public List<Integer> postorden() {
        List<Integer> lista = new LinkedList<>();
        for (int i = 0; i < siervos.size(); i++) {
            lista.addAll(siervos.get(i).postorden());
        }
        lista.add(this.siervos.size());
        return lista;
    }

    public List<Integer> entreorden() {
        List<Integer> lista = new LinkedList<>();
        if (!siervos.isEmpty()) {
            lista.addAll(siervos.get(0).entreorden());
        }
        lista.add(this.siervos.size());
        for (int i = 1; i < siervos.size(); i++) {
            lista.addAll(siervos.get(i).entreorden());
        }
        return lista;
    }
}

