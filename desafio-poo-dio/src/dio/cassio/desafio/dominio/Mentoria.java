package dio.cassio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    // construtor
    public Mentoria(){   
    }

    // get e set
    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }

    // sobrescrevendo o metodo calcularxp
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    // to string
    @Override
    public String toString(){
        return "Mentoria{"+
            "titulo='"+ getTitulo()+ '\''+
            ", descricao='"+ getDescricao()+ '\''+
            ", data="+ data+
            "}";
    }

}
