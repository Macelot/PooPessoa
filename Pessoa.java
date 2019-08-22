/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author marcelo
 */
public class Pessoa  {
    
    String nome;
    int idade;
    String cpf;
    Float peso;
    Float altura;
    String sexo;
    String sobreNome;
    String olhos;
    String cor;
    
    //construtor
    public Pessoa(){
        System.out.println("Deu certo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;  
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getOlhos() {
        return olhos;
    }

    public void setOlhos(String olhos) {
        this.olhos = olhos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
    public void imprimi(Pessoa p){
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
    }
    
    //5) Desenvolta um método que imprima as idades em ordem crescente;
    public void imprimi(Pessoa[] p){
        int idadeBkp;
        for (int j = 0; j < 10; j++) {
           for (int i = 0; i < p.length-1; i++) {
                if(p[i].getIdade()>p[i+1].getIdade()){
                    idadeBkp=p[i].getIdade();
                    p[i].setIdade(p[i+1].getIdade());
                    p[i+1].setIdade(idadeBkp);
                }
             } 
        }

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].getIdade());
        }     
    }
    
    public Pessoa[] cria10Pessoas(){
        Pessoa[] ps;
        ps = new Pessoa[10];
        for (int i = 0; i < 10; i++) {
           ps[i]=new Pessoa();
        }
        String[] nomes=new String[10];

        //leitura de arquivo
        FileReader fr;
        try {
            BufferedReader bf;
            fr = new FileReader("alunos_nome.txt");
            bf = new BufferedReader(fr);
            String linha;
            linha = bf.readLine();
            int posicao=0;
            while(posicao<10){
                nomes[posicao++]=linha;
                linha = bf.readLine();
            }
        } catch (Exception e) {
        }
        Random r;
        r = new Random();
        String[] cores,sobres,olhos;
        cores=new String[]{"branco","negro","pardo","afro","asiático"};
        sobres=new String[]{"Silva","Pinheiro","Machado","Telles","Medeiros"};
        olhos=new String[]{"preto","verde","azul"};
        
        
        for (int i = 0; i < 10; i++) {
            ps[i]=new Pessoa();
            ps[i].setIdade(r.nextInt(73)+8);
            ps[i].setNome(nomes[i]);
            ps[i].setCpf("123.456.789-"+r.nextInt(100));
            ps[i].setPeso(r.nextFloat()*100+30);
            ps[i].setAltura(r.nextFloat()*0.4f+1.50f);//1.50 ate 1.90
            if(r.nextInt(2)%2==0)
                ps[i].setSexo("M");
            else
                ps[i].setSexo("F");
            ps[i].setSobreNome(sobres[r.nextInt(5)]);
            ps[i].setOlhos(olhos[r.nextInt(3)]);
            ps[i].setCor(cores[r.nextInt(5)]);
            
        }
        
        return ps;
    }
    
    public Pessoa[] criaXPessoas(){
        //leitura do arquivo para saber o tamanho do array[]
        FileReader frX;
        int posicao=0;
        try {
            BufferedReader bf;
            frX = new FileReader("alunos_nome.txt");
            bf = new BufferedReader(frX);
            String linha;
            linha = bf.readLine();
            while(linha!=null){
                posicao++;
                linha = bf.readLine();
            }
        } catch (Exception e) {
        }
        System.out.println("TAMMMMMMMM"+posicao);
        
        Pessoa[] ps;
        ps = new Pessoa[posicao+1];
        for (int i = 0; i < posicao+1; i++) {
           ps[i]=new Pessoa();
        }
        String[] nomes=new String[posicao+1];
        Float[] pesos=new Float[posicao+1];
        String[] sexos=new String[posicao+1];
        //leitura de arquivo
        FileReader fr;
        try {
            BufferedReader bf;
            fr = new FileReader("alunos_nome.txt");
            bf = new BufferedReader(fr);
            String linha;
            linha = bf.readLine();
            int pos=0;
            String[] nomePeso;
            while(pos<(posicao+1)){
                nomePeso = linha.split(";");
                nomes[pos]=nomePeso[0];
                pesos[pos]=Float.parseFloat(nomePeso[1]);
                sexos[pos++]=nomePeso[2];
                linha = bf.readLine();
            }
        } catch (Exception e) {
        }
        Random r;
        r = new Random();
        String[] cores,sobres,olhos;
        cores=new String[]{"branco","negro","pardo","afro","asiático"};
        sobres=new String[]{"Silva","Pinheiro","Machado","Telles","Medeiros"};
        olhos=new String[]{"preto","verde","azul"};
        
        
        for (int i = 0; i < posicao+1; i++) {
            ps[i]=new Pessoa();
            ps[i].setIdade(r.nextInt(73)+8);
            ps[i].setNome(nomes[i]);
            ps[i].setCpf("123.456.789-"+r.nextInt(100));
            ps[i].setPeso(pesos[i]);
            ps[i].setAltura(r.nextFloat());
            ps[i].setSexo(sexos[i]);
            ps[i].setSobreNome(sobres[r.nextInt(5)]);
            ps[i].setOlhos(olhos[r.nextInt(3)]);
            ps[i].setCor(cores[r.nextInt(5)]);
            
        }
        
        return ps;
    }
    
    public ArrayList<Pessoa> criaXPessoasList(){
        //leitura do arquivo
        FileReader frX;
        int posicao=0;
        try {
            BufferedReader bf;
            frX = new FileReader("alunos_nome_peso_sexo.txt");
            bf = new BufferedReader(frX);
            String linha;
            linha = bf.readLine();
            while(linha!=null){
                posicao++;
                linha = bf.readLine();
            }
        } catch (Exception e) {
        }
        System.out.println("TAMANHO DO ARRAY "+posicao+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        String[] nomes=new String[posicao+1];
        Float[] pesos=new Float[posicao+1];
        String[] sexos=new String[posicao+1];
        //leitura de arquivo
        FileReader fr;
        try {
            BufferedReader bf;
            fr = new FileReader("alunos_nome_peso_sexo.txt");
            bf = new BufferedReader(fr);
            String linha;
            linha = bf.readLine();
            int pos=0;
            String[] nomePeso;
            while(pos<=(posicao)){
                nomePeso = linha.split(";");
                nomes[pos]=nomePeso[0];
                pesos[pos]=Float.parseFloat(nomePeso[1]);
                sexos[pos++]=nomePeso[2];
                linha = bf.readLine();
            }
        } catch (Exception e) {
        }
        Random r;
        r = new Random();
        String[] cores,sobres,olhos;
        cores=new String[]{"branco","negro","pardo","afro","asiático"};
        sobres=new String[]{"Silva","Pinheiro","Machado","Telles","Medeiros"};
        olhos=new String[]{"preto","verde","azul"};
        
        ArrayList<Pessoa> ps;
        ps = new ArrayList<>();
        for (int i = 0; i < posicao+1; i++) {
            ps.add(new Pessoa());
            ps.get(i).setIdade(r.nextInt(73)+8);
            ps.get(i).setNome(nomes[i]);
            ps.get(i).setCpf("123.456.789-"+r.nextInt(100));
            ps.get(i).setPeso(pesos[i]);
            ps.get(i).setAltura(r.nextFloat());
            ps.get(i).setSexo(sexos[i]);
            ps.get(i).setSobreNome(sobres[r.nextInt(5)]);
            ps.get(i).setOlhos(olhos[r.nextInt(3)]);
            ps.get(i).setCor(cores[r.nextInt(5)]);
            
        }
        
        return ps;
    }
    
    //6) Desenvolva um método que imprima conforme modelo;
    //Nome.....:Telles, Marcelo
    //Olhos....:Pretos
    //Cor......:Branca
    public void imprimiSeis(Pessoa p){
         System.out.print("Nome.........:"+p.getNome());
         System.out.println(","+p.getSobreNome());
         System.out.println("Olhos......:"+p.getOlhos());
         System.out.println("Cor........:"+p.getCor());
    }
    //7) Desenvolva um método que imprima um pronome de tratamento conforme o sexo, exemplo coloque Sr. Sra. antes do nome da pessoa; 
    public void imprimiSete(Pessoa p){
        if(p.getSexo().equals("M"))
            System.out.print("Nome........:Sr."+p.getNome());
        if(p.getSexo().equals("F"))
            System.out.print("Nome........:Sra."+p.getNome());
        System.out.println(","+p.getSobreNome());
        System.out.println("Olhos.......:"+p.getOlhos());
        System.out.println("Cor.........:"+p.getCor());
        System.out.println("Sexo........:"+p.getSexo());
        System.out.println("Peso........:"+p.getPeso());
        System.out.println("---------------------------");
        
    }   

}
