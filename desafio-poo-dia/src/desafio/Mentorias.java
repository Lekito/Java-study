package desafio;

import java.time.LocalDate;

public class Mentorias {
    private String titulo;
    private String descricao;
    LocalDate data;

    public Mentorias() {

    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return titulo +
                "\n descrição: " +
                descricao +
                "\n data: " +
                data;
    }
}
