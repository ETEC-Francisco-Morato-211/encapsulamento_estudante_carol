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
    int ra;
    String nome;
    char nota;
    double frequencia;
    boolean matriculaTrancada;
    
    
   //Métodos
    public void apresentacaoEstudante () {
           System.out.println("Nome:" + nome);
           System.out.println("RA:" + ra);
           System.out.println("Nota:" + nota);
           System.out.println("Frequencia:" + frequencia);
           System.out.println(matriculaTrancada? "Matricula Trancada": "Matricula Ativa");
           
    }
    
    public void responderChamada (){
        frequencia += 1.25;
        frequencia = frequencia + 1.25;
        
    }
}
