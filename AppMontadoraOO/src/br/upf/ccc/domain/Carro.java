package br.upf.ccc.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Carro extends Veiculo implements Serializable {
    private Integer passageiros;
    private Integer portas;

    public Carro(Integer id, String placa, String modelo, Integer ano, Motor motor, Chassi chassi, Empresa fabricante, Empresa fornecedor, List<Empresa> transportadores, Integer passageiros, Integer portas) {
        super(id, placa, modelo, ano, motor, chassi, fabricante, fornecedor, transportadores);
        this.passageiros = passageiros;
        this.portas = portas;
    }




    public Integer getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Integer passageiros) {
        this.passageiros = passageiros;
    }

    public Integer getPortas() {
        return portas;
    }


    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.passageiros);
        hash = 97 * hash + Objects.hashCode(this.portas);
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
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.passageiros, other.passageiros)) {
            return false;
        }
        return Objects.equals(this.portas, other.portas);
    }

    @Override
    public String toString() {
        return "Carro{" + "passageiros=" + passageiros + ", portas=" + portas + '}';
    }
    
    
}
