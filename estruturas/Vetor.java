/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.estruturas;

/**
 *
 * @author HOME
 */
public class Vetor<T> {
    
    protected T[] elementos;
    protected int tamanho;
    
    public Vetor(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    
    public Vetor(){
        this(10);
    }
    
    private void aumentarCapacidade(){
        if(this.tamanho >= this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for( int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    private void verificarPosicao(int posicao){
        if(!(posicao >= 0 && posicao <= this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
    }
    
    public T adicionar(T elemento){
        this.aumentarCapacidade();
        this.elementos[tamanho] = elemento;
        this.tamanho++;
        return this.elementos[tamanho];
    }
    
    public T adicionarEm(T elemento, int posicao){
        this.aumentarCapacidade();
        this.verificarPosicao(posicao);
        for( int i = this.tamanho+1; i > posicao; i--){
            this.elementos[i] = this.elementos[i-1];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return this.elementos[posicao];
    }
    
    public T remover(){
        T elementoRemovido = this.elementos[tamanho];
        this.elementos[tamanho] = null;
        this.tamanho--;
        return elementoRemovido;
    }
    
    public T removerEm(int posicao){
        this.verificarPosicao(posicao);
        T elementoRemovido = this.elementos[posicao];
        for( int i = posicao; i <= this.tamanho; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.remover();
        return elementoRemovido;
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    
    public boolean estaVazia(){
        return this.tamanho == 0;
    }
    
    public T buscar(int posicao){
        this.verificarPosicao(posicao);
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[posicao];
    }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for( int i = 0; i < this.tamanho-1; i++){
            s.append(this.elementos[i] + ", ");
        }
        s.append(this.elementos[this.tamanho-1] + "]");
        return s.toString();
    }
    
}
