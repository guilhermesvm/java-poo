package upf.ccc.front;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import upf.ccc.domain.Pessoa;
import java.text.DecimalFormat;


public class calculoIMC {
    static List<Pessoa> lista = new ArrayList<>();

    public static void main(String[] args) {
        do{
            System.out.println("L = Ler testes, R = Mostrar resultados, E = Mostrar estatisticas, S = Sair");
            System.out.print("Opcao: ");
            
            String lido = new Scanner(System.in).next();
            switch (lido) {
            case "L":
                lerTestes();
                break;
            case "R":
                 mostrarResultados();
                 System.out.println("");
                 break;
            case "E":
            	mostrarEstatisticas();
            	System.out.println("");
            	break;
            case "S":
            	System.out.println("Obrigado por utilizar nosso software, até mais!");
            	System.exit(0);
            	break;
            default:
            	 throw new AssertionError();
            } 	
        } while(true);  
    }
    
    public static void lerTestes(){
        Pessoa obj = new Pessoa();
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Nome: ");
        obj.nome = ler.next();
        
        System.out.print("CPF: ");
        obj.cpf = ler.next();
        
        System.out.print("Peso: ");
        obj.peso = ler.nextDouble();
        
        System.out.print("Altura: ");
        obj.altura = ler.nextDouble();
        
        System.out.println("");
        
        lista.add(obj);   
    }
    
    public static void mostrarResultados(){
    	DecimalFormat deci = new DecimalFormat("0");
    	
        for(Pessoa obj : lista){
            System.out.println("Nome: " + obj.nome + " | CPF: " + obj.cpf +
            " | Altura: " + obj.altura + " | Peso: " + deci.format(obj.peso) + " | Indice IMC: " + obj.resultado()
            );
        }
    }
    
    public static void mostrarEstatisticas() {
    	Integer totalTestes = lista.size();
    	
    	System.out.println("Total: " + totalTestes + " teste(s) realizado(s).");
    
    	 int magreza = 0;
         int normal = 0;
         int sobrepeso = 0;
         int obesidade = 0;
         int obesidadeGrave = 0;
         
         for(Pessoa obj : lista) {
        	 String resultado = obj.resultado();
        	 if(resultado.equals("Magreza")){
        		 magreza++;
        	 }else if(resultado.equals("Normal")){
        		 normal++;
        	 }else if (resultado.equals("Sobrepeso")) {
        		sobrepeso++;
        	 }else if(resultado.equals("Obesidade")) {
        		 obesidade++;
        	 } else {
        		 obesidadeGrave++;
        	 }
         }
         
         if(magreza > 0) {
        	 System.out.println("Magreza: " + magreza + " ("+ calcularPorcentagem(magreza, lista.size()) + "%)");
         } 
         if(normal > 0) {
        	 System.out.println("Normal: " + normal + " ("+ calcularPorcentagem(normal, lista.size()) + "%)");
         } 
         if(sobrepeso > 0) {
        	 System.out.println("Sobrepeso: " + sobrepeso + " ("+ calcularPorcentagem(sobrepeso, lista.size()) + "%)");
         } 
         if(obesidade > 0) {
        	 System.out.println("Obesidade: " + obesidade + " ("+ calcularPorcentagem(obesidade, lista.size()) + "%)");
         } 
         if(obesidadeGrave > 0) {
        	 System.out.println("Obesidade Grave: " + obesidadeGrave + " ("+ calcularPorcentagem(obesidadeGrave, lista.size()) + "%)");
         } 
         
         System.out.println("");     
    }
    
    public static Double calcularPorcentagem(Integer parte, Integer total) {
    	if(total != 0) {
    		return (((double) parte / total) * 100.0);
    	} else {
    		return 0.0;
    	}
    }       
}