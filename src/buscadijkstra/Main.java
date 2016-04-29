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
        Grafos grafo = new Grafos(7);
        
        grafo.inseriraresta(0, 1, 2);
        grafo.inseriraresta(0, 2, 1);
        grafo.inseriraresta(1, 2, 1);
        grafo.inseriraresta(1, 3, 4);
        grafo.inseriraresta(1, 4, 7);
        grafo.inseriraresta(2, 1, 1);
        grafo.inseriraresta(2, 3, 5);
        grafo.inseriraresta(3, 4, 3);
        grafo.inseriraresta(3, 5, 2);
        grafo.inseriraresta(4, 2, 2);
        grafo.inseriraresta(4, 6, 1);
        grafo.inseriraresta(5, 6, 2);
        
        grafo.imprimilistaadj(0);
        grafo.imprimilistaadj(1);
        grafo.imprimilistaadj(2);
        grafo.imprimilistaadj(3);
        grafo.imprimilistaadj(4);
        grafo.imprimilistaadj(5);
        grafo.imprimilistaadj(6);
       
        
        
    
    }
    
}
