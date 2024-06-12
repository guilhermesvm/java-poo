package br.upf.ccc.domain;

import java.io.Serializable;
import java.util.Objects;

public class Cidade implements Serializable {
    private Integer codigo;
    private String nome;
    private String uf; 
    
    public Cidade(Integer codigo, String nome, String uf){
        this.codigo = codigo;
        this.nome = nome;
        this.uf = uf;
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

 
    public String getUf() {
        return uf;
    }

 
    public void setUf(String uf) {
        this.uf = uf;
    }   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.codigo);
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.uf);
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
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Cidade{" + "codigo=" + codigo + ", nome=" + nome + ", uf=" + uf + '}';
    }
    
    
    
}
