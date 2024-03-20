/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_lab7.ejercicio3;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Humbert
 */
public class ArbolGenealogico {

    private Persona padre;
    private List<ArbolGenealogico> hijos;

    public ArbolGenealogico() {
    }

    public ArbolGenealogico(Persona padre) {
        this.padre = padre;
        this.hijos = new LinkedList<>();
    }

    public ArbolGenealogico(Persona padre, List<ArbolGenealogico> hijos) {
        this.padre = padre;
        this.hijos = hijos;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public List<ArbolGenealogico> getHijos() {
        return hijos;
    }

    public void setHijos(List<ArbolGenealogico> hijos) {
        this.hijos = hijos;
    }

    public List<String> preorden() {
        List<String> lista = new LinkedList<>();
        lista.add(this.padre.getNombre());
        for (int i = 0; i < hijos.size(); i++) {
            lista.addAll(hijos.get(i).preorden());
        }
        return lista;
    }

    public List<String> postorden() {
        List<String> lista = new LinkedList<>();
        for (int i = 0; i < hijos.size(); i++) {
            lista.addAll(hijos.get(i).postorden());
        }
        lista.add(this.padre.getNombre());
        return lista;
    }

    public List<String> entreorden() {
        List<String> lista = new LinkedList<>();
        if (!hijos.isEmpty()) {
            lista.addAll(hijos.get(0).entreorden());
        }
        lista.add(this.padre.getNombre());
        for (int i = 1; i < hijos.size(); i++) {
            lista.addAll(hijos.get(i).entreorden());
        }
        return lista;
    }

    //inciso a
    public List<Persona> listaPersonasConOjosDeUnColor(String color) {
        List<Persona> lista = new LinkedList<>();
        for (int i = 0; i < hijos.size(); i++) {
            if(padre.getColorOjos()==color){
                lista.add(this.padre);
            }
            lista.addAll(getHijos().get(i).listaPersonasConOjosDeUnColor(color));
        }
        return lista;
    }

    //inciso b
    public int cantidadPersonasConOjosDistintos(String color) {
        int cant = 0;
        for (int i = 0; i < hijos.size(); i++) {
            if(padre.getColorOjos()!=color){
                cant ++;
            }
            getHijos().get(i).listaPersonasConOjosDeUnColor(padre.getColorOjos());
        }
        return cant;
    }
}
