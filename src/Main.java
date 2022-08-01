import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(c);
        System.out.println(c2);


        Mentoria m = new Mentoria();
        m.setTitulo("Mentoria de JPA");
        m.setDescricao("Mentoria de JPA ");
        m.setData(LocalDate.now());

        System.out.println(m);



    }

}
