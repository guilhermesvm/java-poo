package br.upf.ccc.main;

import br.upf.ccc.domain.Carro;
import br.upf.ccc.domain.Chassi;
import br.upf.ccc.domain.Cidade;
import br.upf.ccc.domain.Empresa;
import br.upf.ccc.domain.Moto;
import br.upf.ccc.domain.Motor;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Motor> motores = new ArrayList<>();
    static List<Cidade> cidades = new ArrayList<>();
    static List<Empresa> empresas = new ArrayList<>();
    static List<Carro> carros = new ArrayList<>();
    static List<Moto> motos = new ArrayList<>();
    
    public static void main(String[] args) {
        
        motores.add(new Motor(1, "ModeloX", 4));
        Motor motor = new Motor(1, "ModeloX", 4);
        Motor motor2 = new Motor(2, "ModeloY", 6);
        Motor motor3 = new Motor(3, "ModeloZ", 12);

        Cidade cidade = new Cidade(1, "Cruz Alta", "RS");
        Cidade cidade2 = new Cidade(2, "Soledade", "RS");
        Cidade cidade3 = new Cidade(3, "Passo Fundo", "RS");

        Empresa empresa = new Empresa(1, "Compass.UOL", "87193236000170", cidade);
        Empresa empresa2 = new Empresa(2, "Digital Business", "50255324000149", cidade2);
        Empresa empresa3 = new Empresa(3, "OSF Digital", "19133221000166", cidade3);

        Carro carro = new Carro(1, "ABC-1234", "Ka", 20002, motor, 
                      new Chassi(1, "CH123456789", null), 
                      empresa3, null, null, 5, 4);
    }
    
    
}
