
public class Main {
  public static void main(String[] args) {
    Conteudo curso1 = new Curso("Java", "Javeiros até o fim", 8);
    Conteudo curso2 = new Curso("AWS", "Escalando a  nuvem", 4);
    Conteudo mentoria = new Mentoria("Spring", "Aprenda backend de uma vez.");

    Bootcamp bootcampJava = new Bootcamp();
    bootcampJava.setNome("Java Master");
    bootcampJava.setDescricao("Domine a Linguagem Java");
    bootcampJava.getConteudos().add(curso1);
    bootcampJava.getConteudos().add(curso2);
    bootcampJava.getConteudos().add(mentoria);

    Dev devCaio = new Dev();
    devCaio.setNome("Caio");
    devCaio.inscreverBootcamp(bootcampJava);
    System.out.println("> Dev " + devCaio.getNome());
    System.out.println("Conteúdos Inscritos: " + devCaio.getConteudosInscritos());
    devCaio.progredir();
    System.out.println(devCaio.getConteudosConcluidos());
    devCaio.calcularTotalXp();

    System.out.println("=======================================");

    Dev devBia = new Dev();
    devBia.setNome("Bia");
    devBia.inscreverBootcamp(bootcampJava);
    System.out.println("> Dev " + devBia.getNome());
    System.out.println(devBia.getConteudosInscritos());
    devBia.progredir();
    System.out.println(devBia.getConteudosConcluidos());
    devBia.calcularTotalXp();

  }
}
