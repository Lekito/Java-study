package desafio;

import java.time.LocalDate;

public class Mentorias extends Conteudo {

    LocalDate data;

    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentorias() {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getTitulo() +
                "\n descrição: " +
                getDescricao() +
                "\n data: " +
                data;
    }
}
