import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c = new Curso();
        c.setTitulo("Curso de Spring");
        c.setDescricao("Curso de Spring ");
        c.setCargaHoraria(8);

        Curso c2 = new Curso();
        c2.setTitulo("Curso de JPA");
        c2.setDescricao("Curso de JPA ");
        c2.setCargaHoraria(12);




        Mentoria m = new Mentoria();
        m.setTitulo("Mentoria de JPA");
        m.setDescricao("Mentoria de JPA ");
        m.setData(LocalDate.now());

        System.out.println(m);
        System.out.println(c);
        System.out.println(c2);


        Bootcamp b = new Bootcamp();
        b.setNome("Bootcamp Java Develop");
        b.setDescricao("Descrição Bootcamp Java Develop");
        b.getConteudos().add(c);
        b.getConteudos().add(c2);
        b.getConteudos().add(m);


        Dev dev = new Dev();
        dev.setNome("Everton");
        dev.inscreverBootcamp(b);
        System.out.println("Everton-Atividades pendente-> "+ dev.getConteudosInscritos());
        System.out.println("Everton-Atividades concluida-> "+ dev.getConteudosConcluidos());
        System.out.println("Everton-XP-> "+ dev.calcularXP());
        dev.progredir();
        System.out.println("Everton-Atividades pendente-> "+ dev.getConteudosInscritos());
        System.out.println("Everton-Atividades concluida-> "+ dev.getConteudosConcluidos());
        System.out.println("Everton-XP-> "+ dev.calcularXP());

        System.out.println("--------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Antonio");
        dev2.inscreverBootcamp(b);
        System.out.println("Antonio-Atividades pendente-> "+ dev2.getConteudosInscritos());
        System.out.println("Antonio-Atividades concluida-> "+ dev2.getConteudosConcluidos());
        System.out.println("Antonio-XP-> "+ dev2.calcularXP());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Antonio-Atividades pendente-> "+ dev2.getConteudosInscritos());
        System.out.println("Antonio-Atividades concluida-> "+ dev2.getConteudosConcluidos());
        System.out.println("Antonio-XP-> "+ dev2.calcularXP());
    }

}
