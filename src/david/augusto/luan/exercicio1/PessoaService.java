package david.augusto.luan.exercicio1;

public class PessoaService {

    private static final Pessoa PESSOA = new Pessoa();

    public Integer totalDias(Pessoa pessoa) {
        Integer totalDiasAno = ((pessoa.getAno() * 365) + (pessoa.getMes() * 30) + pessoa.getDia());
        return totalDiasAno;
    }

    public static void main(String[] args) {

        PessoaService teste = new PessoaService();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luan");
        pessoa.setAno(1996);
        pessoa.setMes(10);
        pessoa.setDia(10);

        System.out.printf("O total de dias de " + pessoa.getNome() + " é de: " + teste.totalDias(pessoa));
    }
}
