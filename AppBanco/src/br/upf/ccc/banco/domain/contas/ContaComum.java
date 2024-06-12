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
public class ContaComum extends Conta {

    public ContaComum(Integer numero) {
        super(numero);
    }

    public ContaComum(Integer numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void sacar(Float vlr) throws Exception {
        if (vlr <= getSaldo()){
            setSaldo(getSaldo() - vlr);
            System.out.println("Debug - sacar - "+getClass());
        } else{
            throw new Exception("Saldo insuficiente!");
        }
    }
    
    
}
