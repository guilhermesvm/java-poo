/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ccc.banco.domain.contas;

/**
 *
 * @author jaqson
 */
public class ContaUniversitaria extends Conta{

    public ContaUniversitaria(Integer numero) {
        super(numero);
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
