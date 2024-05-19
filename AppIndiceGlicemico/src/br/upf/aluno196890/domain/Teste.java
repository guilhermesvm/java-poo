package br.upf.aluno196890.domain;

public class Teste {
    public Integer id;
    public String nome;
    public Integer idg;
    
    public Teste(Integer id, String nome, Integer idg) throws Exception{
        setId(id);
        setNome(nome);
        setIdg(idg);
    }
    
    public Teste(){
    }
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
      
    public Integer getIdg(){
        return idg;
    }
    
    public void setIdg(Integer idg) throws Exception {
        if(idg <= 0){
            throw new Exception("Valores precisam ser maiores que 0.");
        }
        this.idg = idg;
    }
    
    public String getInterpretacao(){
        if(idg < 70){
            return "Hipoglicemia";
        } else if(idg >= 70 && idg <= 99){
            return "Normal";
        } else if(idg >= 100 && idg <= 125){
            return "Glicemia de jejum alterada";
        } else{ 
            return "Diagnóstico de diabetes";
        }
    }
   
    @Override
    public String toString() {
        return " IDG {" + "id=" + id + ", nome=" + nome + ", idg=" + idg + '}';
    }
}
