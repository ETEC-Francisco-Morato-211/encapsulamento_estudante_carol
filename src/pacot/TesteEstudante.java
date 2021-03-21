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
public class TesteEstudante {
    public static void main(String[] args) {
        //Criação do objeto da classe estudante
        Estudante e1 = new Estudante ();
        
        //Construindo o estudante
        e1.nome = "carolzinha";
        e1.ra = 12345;
        e1.nota = 'b';
        e1.frequencia = 0.00;
        e1.matriculaTrancada = false;
        
        //Apresentação
        System.out.println("--------------APRESENTANDO ESTUDANTE---------------");
        e1.apresentacaoEstudante();
        
        //Responder Chamada
        e1.responderChamada();
        
          //Apresentação do estudante depois de responder a chamada
        System.out.println("--------------APRESENTANDO ESTUDANTE---------------");
        e1.apresentacaoEstudante();
        
    
    }
}
