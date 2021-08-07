/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fabrica;

import modelo.Aula;
import modelo.AulaColetiva;
import modelo.AulaIndividual;
import modelo.Conteudo;
/**
 *
 * @author cypri
 */
public class FabricaAula {
    
   public static Aula criaAula(String tipoAula, Conteudo conteudo){
       
       if (tipoAula.equalsIgnoreCase("particular"))
       {
            return new AulaIndividual(conteudo);
       }
       else
       {
           return new AulaColetiva(conteudo);
       }
       
   }
    
}
