package upf.ccc.domain;


public class Pessoa {
    public String cpf;
    public String nome;
    public Double peso;
    public Double altura;
    
    public Double calcularIMC(){
        return peso / (altura * altura);
    }
    
    public String resultado(){
        double IMC = calcularIMC();

        if(IMC < 18.5){
            return "Magreza";
        } else if(IMC >= 18.9 && IMC <= 24.9){
            return "Normal";
        } else if(IMC >= 25 && IMC <= 29.9){
            return "Sobrepeso";
        } else if(IMC >= 30 && IMC <= 39.9){
            return "Obesidade";
        } else if(IMC >= 40){
            return "Obesidade grave";
        } else{
            return "Não foi possível calcular";
        }
    }
}