/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ccc.banco.domain.contas;

import br.upf.ccc.banco.domain.cadastros.Cliente;
import java.util.Objects;

/**
 *
 * @author jaqson
 */
public abstract class Conta {
   private final Integer numero;
   private Float saldo;
   private Cliente cliente;
   
   public Conta(){
      numero = 0; 
   }

    public Conta(Integer numero) {
        this.numero = numero;
        saldo = 0f;
    }

    public Conta(Integer numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        saldo = 0f;
    }
    
    public void depositar(Float vlr){
        saldo += vlr;
        System.out.println("Debug: depositar "+getClass());
    }
    
    public void depositar(Float vlr, Integer envelope){
        saldo += vlr;
        System.out.println("Debug: depositar "+getClass()+
                " envelope: "+envelope);
    }
    
    public abstract void sacar(Float vlr) throws Exception;
    
    public void transferir(Float vlr, Conta destino) throws Exception {
        if (vlr <= (getSaldo())){
            setSaldo(getSaldo() - vlr);
            destino.setSaldo(destino.getSaldo()+vlr);
            System.out.println("Debug - transferir - "+getClass());
        } else{
            throw new Exception("Saldo insuficiente!");
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        return Objects.equals(this.numero, other.numero);
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", cliente=" + cliente + '}';
    }
    
    

    public Integer getNumero() {
        return numero;
    }
/*
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
*/
    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /*
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
*/

    
    
   
}
