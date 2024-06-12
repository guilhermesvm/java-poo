package br.upf.ccc.domain;

import br.upf.ccc.domain.Cidade;
import java.io.Serializable;
import java.util.Objects;

public class Empresa implements Serializable {
    private Integer id;
    private String nome;
    private String cnpj;
    private Cidade cidade;
    
    public Empresa(Integer id, String nome, String cnpj, Cidade cidade){
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cidade = cidade;  
    }

 
    public Integer getId() {
        return id;
    }

   
    public void setId(Integer id) {
        this.id = id;
    }

  
    public String getNome() {
        return nome;
    }

    
   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCpnj() {
        return cnpj;
    }

   
    public void setCpnj(String cpnj) {
        this.cnpj = cpnj;
    }

  
    public Cidade getCidade() {
        return cidade;
    }

 
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.cnpj);
        hash = 89 * hash + Objects.hashCode(this.cidade);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.cidade, other.cidade);
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", cidade=" + cidade + '}';
    }
    
    
    
}
