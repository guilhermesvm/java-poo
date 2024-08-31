package br.upf.ccc.front;

import br.upf.ccc.domain.brand.Marca;
import br.upf.ccc.domain.vehicle.Automatico;
import br.upf.ccc.domain.vehicle.Manual;
import java.util.ArrayList;
import java.util.List;

public class MainCarro {
    
    public static void main(String[] args) throws Exception {
        Manual carroManual = new Manual("XXX-100", 0, 0, new Marca(1, "Ford"));
        carroManual.ligar();
        carroManual.trocarMarcha(1);
        carroManual.acelerar();
        carroManual.acelerar();
        carroManual.acelerar();
        carroManual.trocarMarcha(2);
        carroManual.desacelerar();
        carroManual.trocarMarcha(1);
        carroManual.trocarMarcha(0);
        carroManual.desligar();

        
        Automatico carroAutomatico = new Automatico("YYY-100", 0, 0, new Marca(2, "Porsche"));
        carroAutomatico.ligar();
        carroAutomatico.acelerar();
        carroAutomatico.acelerar();
        carroAutomatico.acelerar();
        carroAutomatico.acelerar();
        carroAutomatico.acelerar();
        carroAutomatico.acelerar();
        carroAutomatico.acelerar();
        carroAutomatico.desacelerar();
        
    
        System.out.println(carroAutomatico.getRpm());
        System.out.println(carroAutomatico.getMarcha());
 
       
       



        
        
        
    }
    
}
