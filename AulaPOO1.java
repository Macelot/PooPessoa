/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author marcelo
 */
public class AulaPOO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        teste manual -- INICIO        
//        Pessoa[] pessoa;
//        pessoa = new Pessoa[2];
//        pessoa[0] = new Pessoa();
//        pessoa[0].setCpf("123.123.456-78");
//        pessoa[0].setIdade(20);
//        pessoa[0].setNome("Marcelo");
//        teste manual -- FIM

//        teste digitando no console -- INICIO         
//        Scanner s;
//        s = new Scanner(System.in);
//        System.out.print("Digite seu nome.....:");
//        String digitou = s.nextLine();
//        pessoa[1] = new Pessoa();
//        pessoa[1].setNome(digitou);
//        s = new Scanner(System.in);
//        System.out.print("Digite seu cpf.....:");
//        digitou = s.nextLine();
//        pessoa[1].setCpf(digitou);
//        System.out.print("Digite sua idade.....:");
//        pessoa[1].setIdade(s.nextInt());
//        teste digitando no console -- FIM  

//		  Impressão da pessoa do teste manual	
//        pessoa[0].imprimi(pessoa[0]);

//		  Impressão da pessoa do teste digitando no console	
//        pessoa[1].imprimi(pessoa[1]);

//        teste Automático, ciando 10 pessoas -- INICIO  
//        String[] nomes=new String[10];
//        Pessoa[] p;
//        p = new Pessoa[10];
//        //leitura de arquivo
//        FileReader fr;
//        try {
//            BufferedReader bf;
//            fr = new FileReader("alunos_nome.txt");
//            bf = new BufferedReader(fr);
//            String linha;
//            linha = bf.readLine();
//            int posicao=0;
//            while(posicao<10){
//                nomes[posicao++]=linha;
//                linha = bf.readLine();
//            }
//        } catch (Exception e) {
//        }
//        Random r;
//        r = new Random();
//        for (int i = 0; i < 10; i++) {
//            p[i]=new Pessoa();
//            p[i].setIdade(r.nextInt(73)+8);
//            p[i].setNome(nomes[i]);
//        }
//        
//        for (int i = 0; i < 10; i++) {
//            p[i].imprimi(p[i]);
//        }
//      teste Automático, ciando 10 pessoas -- FIM  

//		Impressão da primeira pessoa do teste Automático         
//      p[0].imprimi(p);

//		Teste para criar 10 pessoas usando método --INÍCIO	
//		Pessoa[] ps;
//      ps = new Pessoa[10];
//      for (int i = 0; i < 10; i++) {
//          ps[i]=new Pessoa();
//      }
//      ps=ps[0].cria10Pessoas();
//        
//      for (int i = 0; i < 10; i++) {
//          ps[i].imprimiSeis(ps[i]);
//      }
//       
//      for (int i = 0; i < 10; i++) {
//          ps[i].imprimiSete(ps[i]);
//      }
//	Teste para criar 10 pessoas usando método --FIM	


//	Teste para criar X pessoas usando método --INÍCIO	

        Pessoa p;
        p=new Pessoa();
        
        ArrayList<Pessoa> pessoas;
        pessoas = p.criaXPessoasList();
        
        System.out.println("############Ordenado por original############"); 
        for (int i = 0; i < pessoas.size()-1; i++) {
            pessoas.get(i).imprimiSete(pessoas.get(i));
        }
//	Teste para criar X pessoas usando método --FIM

        //remover ultimo, pois ele leu a linha em branco do arquivo
        pessoas.remove(pessoas.size()-1);
        
//      ordenação por nome --INÍCIO
        ComparaDadosPorNome cpn ;
        cpn=new ComparaDadosPorNome();
        Collections.sort(pessoas,cpn);
        System.out.println("############Ordenado por nome############");     
        for (int i = 0; i < pessoas.size(); i++) {
            pessoas.get(i).imprimiSete(pessoas.get(i));
        }
//      ordenação por nome --FIM

//      ordenação por peso --INÍCIO
        ComparaDadosPorPeso cpp ;
        cpp=new ComparaDadosPorPeso();
        Collections.sort(pessoas,cpp);
        
        System.out.println("############Ordenado por peso############");     
        for (int i = 0; i < pessoas.size(); i++) {
            pessoas.get(i).imprimiSete(pessoas.get(i));
        }
//      ordenação por peso --FIM
        //int teste;
        //teste = Integer.MAX_VALUE;
        //System.out.println(teste);
    }
}
