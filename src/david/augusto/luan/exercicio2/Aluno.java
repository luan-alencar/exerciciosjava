package david.augusto.luan.exercicio2;

public class Aluno {

    private String nome;
    private Double nota1;
    private Double nota2;
    private Double media;
    private Double mediaTotal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double nota1, Double nota2) {
        this.media = ((getNota1() + getNota2()) / 2);
    }
}
