package david.augusto.luan.exercicio4;

public class PecaService {

    private static final Peca PECA = new Peca();
    private static final PecaService SERVICE = new PecaService();

    public Double calculaPorcentagemIPI() {
        PECA.setQuantidade(2);
        PECA.setValorUnitario(2.50);
        return ((PECA.getValorUnitario()) * PECA.getQuantidade() * (0.8/100 + 1));
    }

    public static void main(String[] args) {
        System.out.println(SERVICE.calculaPorcentagemIPI());
    }
}
