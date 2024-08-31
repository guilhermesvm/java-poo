package upf.ccc.domain;

public class Veiculo {
    public String nome;
    public String marca;
    public String cor;
    public String ano;
    public String placa;
    
    public boolean disponivel;
    
    public String exibirDisponibilidade(){
        return disponivel ? "Disponivel" : "Indisponivel";
    }
    
    public void alterarDisponibilidade(boolean novaDisponibilidade){
        disponivel = novaDisponibilidade;
    }
    
}
