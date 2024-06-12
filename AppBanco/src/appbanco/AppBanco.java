/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appbanco;

import br.upf.ccc.banco.domain.cadastros.Cliente;
import br.upf.ccc.banco.domain.cadastros.Empresa;
import br.upf.ccc.banco.domain.cadastros.Pessoa;
import br.upf.ccc.banco.domain.contas.Conta;
import br.upf.ccc.banco.domain.contas.ContaComum;
import br.upf.ccc.banco.domain.contas.ContaEspecial;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaqson
 */
public class AppBanco {

    static List<Cliente> clientes = new ArrayList<>();
    static List<Conta> contas = new ArrayList<>();
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cadastrarClientes();
        // listarClientes();
        cadastrarContas();
    }

    private static void cadastrarClientes() {
        Cliente obj = new Empresa("123456", 1, 
                "Empresa um", "Morom", 111, "centro");
        
        clientes.add(obj);
        
        // agora obj vair referenciar uma pessoa!!!
        obj = new Pessoa("987654", 20, null, 
                2, "Pessoa um", 
                "Av Brasil", 222, "centro");
        
        clientes.add(obj);
                
    }    

    private static void listarClientes() {
       for(Cliente c : clientes){
           
           System.out.println("Passando por uma "+c.getClass().getSimpleName());
           
           if (c instanceof Empresa)
              System.out.println("Uma empresa: "+c);
           if (c instanceof Pessoa)
              System.out.println("Uma pessoa: "+c);
           
       }
    }

    private static void cadastrarContas() {
        contas.add(new ContaComum(1, clientes.get(0)));
        contas.add(new ContaEspecial(5000f, 2, clientes.get(1)));
        listarContas();
        movimentarContas();
    }

    private static void listarContas() {
       for (Conta c : contas){
           System.out.println(c.toString());
       } 
    }

    private static void movimentarContas() {
        Conta c = contas.get(0);
        c.depositar(1000f);
        c.depositar(2000F, 1);
        try {
            c.sacar(500f);
            c.transferir(1500F, contas.get(1));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
        c = contas.get(1);
        c.depositar(1000f);
        c.depositar(2000F, 1);
        try {
            c.sacar(600f);
            c.transferir(1000F, contas.get(0));
        } catch (Exception ex) {
            Logger.getLogger(AppBanco.class.getName()).log(Level.SEVERE, null, ex);
        }        
 
    }
    
}
