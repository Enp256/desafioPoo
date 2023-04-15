import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição do curso de JavaScript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria =new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição do bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devErick = new Dev();
        devErick.setNome("Erick");
        devErick.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do Erick:" + devErick.getConteudoInscritos());
        devErick.progredir();
        devErick.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos do Erick:" + devErick.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos do Erick:" + devErick.getConteudosConcluidos());
        System.out.println("XP: " +devErick.calcularTotalXp());

        System.out.println("-------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos da Camila:" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos da Camila:" + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos da Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " +devCamila.calcularTotalXp());
    }
}
