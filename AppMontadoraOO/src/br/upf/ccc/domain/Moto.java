package br.upf.ccc.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Moto extends Veiculo implements Serializable {
    private Integer cilindradas;

    public Moto(Integer id, String placa, String modelo, Integer ano, Motor motor, Chassi chassi, Empresa fabricante, Empresa fornecedor, List<Empresa> transportadores) {
        super(id, placa, modelo, ano, motor, chassi, fabricante, fornecedor, transportadores);
    }

  
    public Integer getCilindradas() {
        return cilindradas;
    }

   
    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.cilindradas);
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
        final Moto other = (Moto) obj;
        return Objects.equals(this.cilindradas, other.cilindradas);
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindradas=" + cilindradas + '}';
    }
    
    
    
    
    
}
