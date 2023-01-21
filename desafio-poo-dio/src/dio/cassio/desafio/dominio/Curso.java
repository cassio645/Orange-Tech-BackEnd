package dio.cassio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    // construtor
    public Curso(){
    }

    // get e set
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    // implementando metodo abstrato
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // to string
    @Override
    public String toString(){
        return "Curso{"+
            "titulo='"+ getTitulo()+ '\''+
            ", descricao='"+ getDescricao()+ '\''+
            ", cargaHoraria="+ cargaHoraria+
            "}";
    }


}
