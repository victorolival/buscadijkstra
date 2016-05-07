/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadijkstra;

/**
 *
 * @author victor.rolival
 */
public class Grafos {
    private int vertices;
    private Lista[] l;
        
    
    

    

    Grafos(int vertices){
        this.vertices = vertices;
        this.l = new Lista[vertices];
        for(int i=0; i<l.length;i++){
            l[i] = new Lista();
        }
               
          
    }       
    
    
    public void inseriraresta(int origem, int destino, int peso){
        No n = new No();
        n.setDestino(destino);
        n.setPeso(peso);
        l[origem].inserir(n);
        
    }
    
    public void removeraresta(int origem, int destino){
        for(int i=0; i<l[origem].tamanho();i++){
            if(l[origem].get(i).getDestino() == destino){
                l[origem].remover(i);
                
            }
        }
                
        
    }
    public void existearesta(int origem, int destino){
        boolean existe = false;
        int peso = 0;
        for(int i=0; i< l[origem].tamanho();i++){
            if(l[origem].get(i).getDestino() == destino){
                existe = true;
                
            }
        }
        if(existe == true)
            System.out.println("Existe aresta entre os vertices "+origem+" e "+destino+", peso entre eles: "+peso);
        else
            System.out.println("Não existe aresta entre os vertices "+origem+" e "+destino);
        
            
    }
    public Lista listararestasadj (int vertice){
        /*System.out.print("Vertice "+vertice+": ");
        for(int i=0; i<l[vertice].tamanho();i++)
            System.out.print(l[vertice].get(i)+",");
        System.out.println("");
        */
        return l[vertice];
    
        
    }
    
    public void imprimilistaadj (int vertice){
        System.out.print("Lista adjacente do vertice "+vertice+": ");
        for(int i=0; i<l[vertice].tamanho();i++)
            System.out.print(l[vertice].get(i).getDestino()+"(peso:"+l[vertice].get(i).getPeso()+")"+",");
        System.out.println("");
    }
   
    public void relax (int origem, int destino, int peso){
        
    }
    
    
    public void dijkstra(int origem, int destino){
       
    }
}