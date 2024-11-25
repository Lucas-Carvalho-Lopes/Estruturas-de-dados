/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.estruturasdedados;

import com.lucas.estruturas.Vetor;

/**
 *
 * @author HOME
 */
public class EstruturasDeDados {
    
    public static void main(String[] args){
        
        Vetor<String> vetor = new Vetor<String>();
        
        vetor.adicionar("A");
        vetor.adicionar("C");
        vetor.adicionarEm("B", 1);
        vetor.removerEm(1);
        
        System.out.println(vetor);
        
    }
    
}
