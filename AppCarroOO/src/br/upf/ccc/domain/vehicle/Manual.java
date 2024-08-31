package br.upf.ccc.domain.vehicle;

import br.upf.ccc.domain.brand.Marca;

public class Manual extends Veiculo{

    public Manual(String placa, Integer marcha, Integer rpm, Marca marca) {
        super(placa, marcha, rpm, marca);
    }

    public Manual() {
    }
   
    
    public void trocarMarcha(Integer qual) throws Exception{
        Integer marchaAtual = getMarcha();
        if(marchaAtual.equals(0)){
            if(!qual.equals(1)){
                throw new Exception("A marcha apenas pode ser trocada para a 1.");
            } else{
                setMarcha(qual);
            }   
        }
        if(marchaAtual.equals(1)){
            if(!qual.equals(0) && !qual.equals(2)){
                throw new Exception("A marcha apenas pode ser trocada para a 0 ou 2.");
            }else{
                setMarcha(qual);
            }
        }
        
        if(marchaAtual.equals(2)){
            if(!qual.equals(1) && !qual.equals(3)){
                throw new Exception("A marcha apenas pode ser trocada para a 1 ou 3.");
            }else{
                setMarcha(qual);
            }
        }
        
       if(marchaAtual.equals(3)){
            if(!qual.equals(2) && !qual.equals(4)){
                throw new Exception("A marcha apenas pode ser trocada para a 2 ou 4.");
            }else{
                setMarcha(qual);
            }
        }
       
       if(marchaAtual.equals(4)){
            if(!qual.equals(3) && !qual.equals(5)){
                throw new Exception("A marcha apenas pode ser trocada para a 3 ou 5.");
            }else{
                setMarcha(qual);
            }
        }
       
       if(marchaAtual.equals(5)){
            if(!qual.equals(4)){
                throw new Exception("A marcha apenas pode ser trocada para a 4.");
            }else{
                setMarcha(qual);
            }
        }
    }

    @Override
    public void acelerar() throws Exception {
        Integer rpm = getRpm();
        rpm += 1000;
        setRpm(rpm);
        
        if(rpm > 8000){
            throw new Exception("O rpm máxmo do veículo é 8000.");
        }
    } 

    @Override
    public String toString() {
        return "Manual{" + "placa=" + placa + ", marcha=" + marcha + ", rpm=" + rpm + ", marca=" + marca + '}';
    } 
}
