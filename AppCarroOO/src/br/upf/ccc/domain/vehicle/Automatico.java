package br.upf.ccc.domain.vehicle;

import br.upf.ccc.domain.brand.Marca;

public class Automatico extends Veiculo{

    public Automatico(String placa, Integer marcha, Integer rpm, Marca marca) {
        super(placa, marcha, rpm, marca);
    }

    public Automatico() {
    }
    
    @Override
    public void desacelerar() throws Exception{
        Integer rpm = getRpm();
        Integer marcha = getMarcha();
        rpm -= 1000;
        setRpm(rpm);
        
        if(rpm == 1000){
            
        }
        
        if(rpm < 1000){
            rpm = 1000;
            setMarcha(marcha -= 1);
                throw new Exception("Marcha não pode ser menor que 0.");
       } else if(rpm == 2000){
           setMarcha(marcha -= 1);
            setRpm(4000);
       }
    }

   @Override
    public void acelerar() throws Exception {
        Integer rpm = getRpm();
        Integer marcha = getMarcha();
        
        if(marcha.equals(0)){
            setMarcha(1);
            setRpm(2000);
        } 
        
        if(rpm >= 2000 && rpm <=4000){
            rpm = rpm + 1000;
            setRpm(rpm);
        } 
        
        if(rpm >= 4000){
           setMarcha(marcha = marcha + 1);
           setRpm(rpm - 2000);
        } 
        
        if(rpm > 8000){
            throw new Exception("O rpm máxmo do veículo é 8000.");
        }
    } 
}
