package desafio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {

    }

    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return getTitulo() +
                "\n Descrição: " +
                getDescricao() +
                "\n Carga horaria: " +
                cargaHoraria + " horas";
    }
}