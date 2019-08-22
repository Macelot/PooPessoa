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
public class ComparaDadosPorPeso  implements Comparator<Pessoa>{
    @Override
   public int compare(Pessoa c1, Pessoa c2) {  
         if(c1 == null || c2 == null)  
             System.out.println("Nome em branco");  
           
         Float  p1 = c1.getPeso();
         Float  p2 = c2.getPeso(); 

         return  p1.compareTo(p2); 

}


}
