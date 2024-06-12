/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ccc.banco.domain.cadastros;

import java.util.Objects;

/**
 *
 * @author jaqson
 */
public abstract class Cliente {
    private Integer codigo;
    private String nome;
    private Endereco endereco;

    public Cliente(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
        public Cliente(Integer codigo, String nome, String rua, Integer nro, String bairro) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = new Endereco(rua, nro, bairro);
    }

    public Cliente() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codigo);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + '}';
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    
    private static class Endereco {
        private String rua;
        private Integer numero;
        private String bairro;
        
        public Endereco() {
        }

        public Endereco(String rua, Integer numero, String bairro) {
            this.rua = rua;
            this.numero = numero;
            this.bairro = bairro;
        }
        
        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public Integer getNumero() {
            return numero;
        }

        public void setNumero(Integer numero) {
            this.numero = numero;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }
    }
    
    
}
