package br.upf.ccc.domain.brand;

import java.util.Objects;

public class Marca {
    private Integer id;
    private String descricao;

    public Marca(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    public Marca(){
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Marca other = (Marca) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
    
    
    
}
