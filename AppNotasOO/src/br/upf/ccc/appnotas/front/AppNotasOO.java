package br.upf.ccc.appnotas.front;

import br.upf.ccc.appnotas.domain.Avaliacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppNotasOO {

    static List<Avaliacao> lista = new ArrayList<>();
    
    public static void main(String[] args) {
        do {            
            System.out.println("I = Incluir, E = Excluir, L = Listar, S = Sair");
            System.out.print("Sua opcao: ");
            
            String lido = new Scanner(System.in).next();
            switch (lido) {
                case "I":
                    lerAvaliacao();
                    break;
                case "E":
                    excluirAvaliacao();
                    break;
                case "L":
                    mostrarResultado();
                    break;
                case "S":
                	System.out.println("Obrigado por usar o software.");
                    System.exit(0);               
                    break;
                default:
                    throw new AssertionError();
            }            
        } while (true);
 
    }

    private static void lerAvaliacao() {
        Avaliacao obj = new Avaliacao();
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Nome: ");
        obj.nome = ler.next();
        
        System.out.print("Nota 1: ");
        obj.nota1 = ler.nextFloat();
        
        System.out.print("Nota 2: ");
        obj.nota2 = ler.nextFloat();
        
        System.out.println("");
        
        lista.add(obj); // guarda o objeto na lista
    }

    private static void mostrarResultado() {
        for(Avaliacao obj : lista){
            System.out.println(
                    "Nome: "+ obj.nome + " | Media: "+ obj.calcularMedia()+
                            " | Situacao: " + obj.situacao()
            );
        }
        System.out.println("");
    } 

    private static void excluirAvaliacao() {
        
    }
}
