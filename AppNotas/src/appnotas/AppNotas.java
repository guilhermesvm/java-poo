package appnotas;

import java.util.Scanner;

public class AppNotas {
    private static void lerDados() {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o nome: ");
        nome = ler.next();
       
        System.out.print("Nota 1: ");
        nota1 = ler.nextFloat();
        
        System.out.print("Nota 2: ");
        nota2 = ler.nextFloat();
    }
    
     private static void mostrarResultados() {
         Float media = (nota1 + nota2) / 2;
         System.out.println("A media e: " + media);
    }
  
    //Aqui vão os atributos = declarações
    static String nome;
    static Float nota1;
    static Float nota2;
    
    
    public static void main(String[] args) {
        lerDados();
        mostrarResultados();
        
    } 
}