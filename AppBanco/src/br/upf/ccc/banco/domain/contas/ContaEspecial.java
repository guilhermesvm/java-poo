/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ccc.banco.domain.contas;

import br.upf.ccc.banco.domain.cadastros.Cliente;

/**
 *
 * @author jaqson
 */
public class ContaEspecial extends Conta {

    private Float limite;
    private static Float taxaJuro;

    public ContaEspecial(Integer numero) {
        super(numero);
    }

    public ContaEspecial(Float limite, Integer numero, Cliente cliente) {
        super(numero, cliente);
        this.limite = limite;
    }

    public Float getLimite() {
        return limite;
    }

    public void setLimite(Float limite) {
        this.limite = limite;
    }

    public static Float getTaxaJuro() {
        return taxaJuro;
    }

    public static void setTaxaJuro(Float aTaxaJuro) {
        taxaJuro = aTaxaJuro;
    }

    @Override
    public String toString() {
        return super.toString() + " - ContaEspecial{" + "limite=" + limite + '}';
    }
    
        @Override
    public void sacar(Float vlr) throws Exception {
        if (vlr <= (getSaldo()+getLimite())){
            setSaldo(getSaldo() - vlr);
            System.out.println("Debug - sacar - "+getClass());
        } else{
            throw new Exception("Saldo insuficiente!");
        }
    }
    
    @Override
    public void transferir(Float vlr, Conta destino) throws Exception {
        if (vlr <= (getSaldo()+getLimite())){
            setSaldo(getSaldo() - vlr);
            destino.setSaldo(destino.getSaldo()+vlr);
            System.out.println("Debug - transferir - "+getClass());
        } else{
            throw new Exception("Saldo insuficiente!");
        }
    }    

}
