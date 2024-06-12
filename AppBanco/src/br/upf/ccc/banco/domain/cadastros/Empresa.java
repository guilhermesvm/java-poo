/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ccc.banco.domain.cadastros;

/**
 *
 * @author jaqson
 */
public class Empresa extends Cliente {
    private String cnpj;

    public Empresa() {
        super();
    }

    public Empresa(String cnpj, Integer codigo, String nome, 
            String rua, Integer nro, String bairro) {
        super(codigo, nome, rua, nro, bairro);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return getNome() + " - CNPJ: " + cnpj;
    }

    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}
