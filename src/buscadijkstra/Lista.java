/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadijkstra;

import java.util.ArrayList;

/**
 *
 * @author victor.rolival
 */
public class Lista {
    
    ArrayList<No> dados = new  ArrayList<No>();
    
    
    public void inserir(No no){
        dados.add(no);
    }
    public void remover(int ind){
        dados.remove(ind);
    }
    public No get(int ind){
        return dados.get(ind);
    }
    public int tamanho(){
        return dados.size();
    }
    public void imprmir (){
        for(int i=0; i<dados.size();i++)
            System.out.print(dados.get(i)+",");
        System.out.println("");
    }
    public boolean consta(No valor){
        if(dados.contains(valor))
            return true;
        else
            return false;
    }
}
