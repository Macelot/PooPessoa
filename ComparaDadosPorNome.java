/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo1;

import java.util.Comparator;

/**
 *
 * @author marcelo
 */
public class ComparaDadosPorNome  implements Comparator<Pessoa>{
    @Override
   public int compare(Pessoa c1, Pessoa c2) {  
         if(c1 == null || c2 == null)  
             System.out.println("Nome em branco");  
           
         String  nome1 = c1.getNome();
         String  nome2 = c2.getNome(); 

         return  nome1.compareTo(nome2); 

}


}
