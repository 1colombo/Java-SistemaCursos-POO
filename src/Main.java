
public class Main {
  public static void main(String[] args) {
    Conteudo curso1 = new Curso("Java", "Javeiros até o fim", 8);
    Conteudo curso2 = new Curso("AWS", "Escalando a  nuvem", 4);
    Conteudo mentoria = new Mentoria("Spring", "Aprenda backend de uma vez.");

    Bootcamp bootcampJava = new Bootcamp("Java Master", "Domine a Linguagem Java");
    bootcampJava.getConteudos().add(curso1);
    bootcampJava.getConteudos().add(curso2);
    bootcampJava.getConteudos().add(mentoria);

    Dev devCaio = new Dev("Caio");
      devCaio.inscreverBootcamp(bootcampJava);
      infoDev(devCaio);
      devCaio.progredir();

    Dev devBia = new Dev("Bia");
      devBia.inscreverBootcamp(bootcampJava);
      infoDev(devBia);
      devBia.progredir();
  }

  public static void infoDev(Dev dev){
    System.out.println("-----------" + dev.getNome() + "-----------");
    System.out.println("-> Conteúdos Inscritos: " + dev.getConteudosInscritos());
    System.out.println("-> Conteúdos Concluídos" + dev.getConteudosConcluidos());
    System.out.println("XP Total: " + dev.calcularTotalXp());
  }
}