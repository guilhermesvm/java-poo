package br.upf.ccc.appnotas.domain;


public class Avaliacao {
    /**
     * Atributo nome. Armazena ...
     * No escopo da classe definimos todos os atributos para o
     * objeto
     */
    public String nome;
    /**
     * na nota um colocamos a nota da primeira prova
     */
    public Float nota1;
    public Float nota2;

    /**
     * Este método calcula a média aritmética das duas notas 
     * @return Retorna um float com a média calculada
     */
    public Float calcularMedia(){
        return (nota1 + nota2) / 2;
    }
    
    public String situacao(){
        Float media = calcularMedia();
        return media >= 7f ? "Aprovado" : "Exame";
    }
    
}
