/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ed;

/**
 *
 * @author 31409695
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.addLast("gato");
        lista.addLast("cobra");
        lista.addLast("zebra");
        lista.addLast("porco");
        lista.addFirst("boi");
        lista.addLast("peixe");
        System.out.println(lista.first());
        System.out.println(lista.last());
    }
    
}
