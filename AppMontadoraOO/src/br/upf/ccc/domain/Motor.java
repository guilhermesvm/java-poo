package br.upf.ccc.domain;

import java.io.Serializable;
import java.util.Objects;

public class Motor implements Serializable {
    private Integer numero;
    private String modelo;
    private Integer cilindros;

    public Motor(Integer numero, String modelo, Integer cilindros) {
        this.numero = numero;
        this.modelo = modelo;
        this.cilindros = cilindros;
    }
    
   

    public Integer getNumero() {
        return numero;
    }

  
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

   
    public String getModelo() {
        return modelo;
    }

  
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    public Integer getCilindros() {
        return cilindros;
    }

    
    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.numero);
        hash = 73 * hash + Objects.hashCode(this.modelo);
        hash = 73 * hash + Objects.hashCode(this.cilindros);
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
        final Motor other = (Motor) obj;
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return Objects.equals(this.cilindros, other.cilindros);
    }

    @Override
    public String toString() {
        return "Motor{" + "numero=" + numero + ", modelo=" + modelo + ", cilindros=" + cilindros + '}';
    }
    
    
}
