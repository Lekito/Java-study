import java.time.LocalDate;

import desafio.Curso;
import desafio.Mentorias;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição do curso de JS");
        curso2.setCargaHoraria(4);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição: mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
