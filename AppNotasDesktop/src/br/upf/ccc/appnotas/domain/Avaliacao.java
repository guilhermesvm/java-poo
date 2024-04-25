package br.upf.ccc.appnotas.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Avaliacao {
    /**
     * Atributo nome. Armazena ...
     * No escopo da classe definimos todos os atributos para o
     * objeto
     */
    private String nome;
    /**
     * na nota um colocamos a primeira nota da prova, na nota dois colocamos a segunda nota da prova 
     */
    private Float nota1;
    private Float nota2;
    private Integer matricula;
    private static Integer proximo = 1;

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
        final Avaliacao other = (Avaliacao) obj;
        return Objects.equals(this.nome, other.nome);
    }

    public Avaliacao(String nome, Float nota1, Float nota2, Integer matricula) throws Exception {
        this.nome = nome;
        //this.nota1 = nota1;
        //this.nota2 = nota2;
        setNota1(nota1);
        setNota2(nota2);
        this.matricula = proximo++;
    }
    
    public Avaliacao() {
       matricula = proximo++;
    }
    
    //Substituir o método toString generico herdado de Object
    @Override
    public String toString() {
        return " avaliacao{" + "nome=" + nome + ", nota1=" + nota1 + ", nota 2=" + nota2 + ", matricula=" + matricula + '}';
    }
    
    
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) throws Exception {
        if(nota1 > 10 || nota1 < 0){
            proximo--;
            throw new Exception("Nota 1 fora do intervalo de 1 a 10.");
        }
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) throws Exception {
        if(nota2 > 10 || nota2 < 0){
            proximo--;
            throw new Exception("Nota 2 fora do intervalo de 1 a 10.");
        }
        this.nota2 = nota2;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public static Integer getProximo() {
        return proximo;
    }

    public static void setProximo(Integer aProximo) {
        proximo = aProximo;
    }
    
    /**
     * Este método calcula a média aritmética das duas notas 
     * @return Retorna um float com a média calculada
     */
    public Float calcularMedia(){
        return (getNota1() + getNota2()) / 2;
    }
    
    public String situacao(){
        Float media = calcularMedia();
        return media >= 7f ? "Aprovado" : "Exame";
    }
    
}