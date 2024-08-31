package br.upf.ccc.domain.vehicle;

import br.upf.ccc.domain.brand.Marca;
import java.util.Objects;

public abstract class Veiculo {
    final String placa;
    Integer marcha;
    Integer rpm;
    Marca marca;

    public Veiculo(String placa, Integer marcha, Integer rpm, Marca marca) {
        this.placa = placa;
        this.marcha = marcha;
        this.rpm = rpm;
        this.marca = marca;
    }

   
    
    public Veiculo(){
        this.placa = null;
    }

    public String getPlaca() {
        return placa;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
   abstract void acelerar() throws Exception;
    
   public void desacelerar() throws Exception{
       Integer rpm = getRpm();
       rpm -= 1000;
       setRpm(rpm);
       if(rpm < 1000){
           throw new Exception("O rpm mínimo do veículo é 1000.");
       }
   }
   
   public void ligar() throws Exception{
       if(!getMarcha().equals(0)){
           throw new Exception("Para ligar, deve estar em Marcha 0.");
       } else{
          setRpm(1000);
       }
   }
   
   public void desligar() throws Exception{
       if(!getMarcha().equals(0)){
           throw new Exception("Para desligar, deve estar em Marcha 0.");
       } else{
          setRpm(0);
       }
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
        final Veiculo other = (Veiculo) obj;
        return Objects.equals(this.placa, other.placa);
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", marcha=" + marcha + ", rpm=" + rpm + ", marca=" + marca + '}';
    }
    
    
}
