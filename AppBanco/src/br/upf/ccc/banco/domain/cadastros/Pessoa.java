/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ccc.banco.domain.cadastros;

import java.util.Date;

/**
 *
 * @author jaqson
 */
public final class Pessoa extends Cliente{
    private String cpf;
    private transient Integer idade;
    private Date nascimento;

    public Pessoa() {
        super();
    }

    public Pessoa(String cpf, Integer idade, Date nascimento, Integer codigo, String nome, String rua, Integer nro, String bairro) {
        super(codigo, nome, rua, nro, bairro);
        this.cpf = cpf;
        this.idade = idade;
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        idade = 88;
        return idade;
    }
/*
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
*/
    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
        @Override
    public String toString() {
        return getNome() + " - CPF: " + cpf;
    }
    
}
