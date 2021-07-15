package david.augusto.luan.exercicio2;

public class AlunoService {

    public Double calcularMediaAritmetricaSimples(Aluno aluno) {

        aluno.setMedia(aluno.getNota1(), aluno.getNota2());
        return aluno.getMedia();
    }

    public Double calcSomaMedias(Double media1, Double media2) {
        Double total = media1 + media2;
        return total;
    }

    public Double calcMediaDasMedias(Double media1, Double media2) {
        Double totalMedias = this.calcSomaMedias(media1, media2) / 2;
        return totalMedias;
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Larissa");
        aluno1.setNota1(8.9);
        aluno1.setNota2(7.0);
        aluno1.setMedia(aluno1.getNota1(), aluno1.getNota2());

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Flavia");
        aluno2.setNota1(4.5);
        aluno2.setNota2(6.0);
        aluno2.setMedia(aluno2.getNota1(), aluno2.getNota2());

        AlunoService service = new AlunoService();

        System.out.printf("A media de " + aluno1.getNome() + " é de "
                            + service.calcularMediaAritmetricaSimples(aluno1) + " !\n");


        System.out.printf("A media de " + aluno2.getNome() + " é de "
                + service.calcularMediaAritmetricaSimples(aluno2) + " !\n");

        System.out.printf("A soma das medias de " + aluno1.getNome() + " e " + aluno2.getNome() + " é de "
                + service.calcSomaMedias(aluno1.getMedia(), aluno2.getMedia()) + " !\n");

        System.out.printf("A media das medias de " + aluno1.getNome() + " e " + aluno2.getNome() + " é de "
                + service.calcMediaDasMedias(aluno1.getNota1(), aluno1.getNota2()) + " !\n");

    }
}
