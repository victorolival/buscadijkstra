/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadijkstra;

/**
 *
 * @author symbol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grafos grafo = new Grafos(5);
        
        grafo.inseriraresta(0, 1, 5);
        grafo.inseriraresta(0, 2, 10);
        grafo.existearesta(0, 1);
        grafo.imprimilistaadj(0);
        
    
    }
    
}
