package br.upf.ccc.appimc.domain;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Double peso;
    private Double altura;
    private Integer codigo;
    private static Integer proximo = 1;
    
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
   
    public Pessoa(String nome, Double peso, Double altura, Integer codigo) throws Exception {
        setNome(nome);
        setPeso(peso);
        setAltura(altura);
        this.codigo = proximo++;
    }
    
    //Substituir o método toString generico herdado de Object
    @Override
    public String toString() {
        return " IMC{" + "nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", codigo=" + codigo + '}';
    }
    
    public Pessoa() {
       codigo = proximo++;

    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
    if (nome.length() < 2) {
        throw new Exception("O nome deve ter pelo menos dois caracteres.");
    }
    this.nome = nome;
    }


    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) throws Exception {
        if(peso < 1){
            throw new Exception("O peso deve ser maior que 1.");
        }
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) throws Exception {
        if(altura < 0.3){
            throw new Exception("A altura deve ser maior que 0.3.");
        }
        this.altura = altura;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public static Integer getProximo() {
        return proximo;
    }


    public static void setProximo(Integer aProximo) {
        proximo = aProximo;
    }
    
}
