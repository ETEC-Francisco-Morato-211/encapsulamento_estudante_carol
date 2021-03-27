/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacot;

/**
 *
 * @author User
 */
public class Estudante {
    //Atributos
    private int ra;
    private String nome;
    private char nota;
    private double frequencia;
    private boolean matriculaTrancada;
    
    
   //Métodos
    public void apresentacaoEstudante () {
           System.out.println("Nome:" + getNome());
           System.out.println("RA:" + getRa());
           System.out.println("Nota:" + getNota());
           System.out.println("Frequencia:" + getFrequencia());
           System.out.println(isMatriculaTrancada()? "Matricula Trancada": "Matricula Ativa");
           
    }
    
    public void responderChamada (){
        setFrequencia(getFrequencia() + 1.25);
        setFrequencia(getFrequencia() + 1.25);
        
    }

    //getters e setters
    public int getRa() {
        return ra;
    }

  
    public void setRa(int ra) {
        this.ra = ra;
    }

   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public char getNota() {
        return nota;
    }

  
    public void setNota(char nota) {
        this.nota = nota;
    }

   
    public double getFrequencia() {
        return frequencia;
    }

   
    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    
    public boolean isMatriculaTrancada() {
        return matriculaTrancada;
    }

    public void setMatriculaTrancada(boolean matriculaTrancada) {
        this.matriculaTrancada = matriculaTrancada;
    }
     public Estudante(int ra, String nome, char nota, double frequencia, boolean matriculaTrancada){
        this.ra = ra;
        this.nome = nome;
        this.nota = nota;
        this.frequencia = frequencia;
        this.matriculaTrancada = matriculaTrancada;
     }

    public Estudante() {
        this.nome = "sem nome";
        this.matriculaTrancada = true;
        
    }
     
     
}