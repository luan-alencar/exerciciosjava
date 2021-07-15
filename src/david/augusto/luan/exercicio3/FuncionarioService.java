package david.augusto.luan.exercicio3;

public class FuncionarioService {

    private static final Funcionario FUNCIONARIO = new Funcionario();
    private static final FuncionarioService SERVICE = new FuncionarioService();

    public Double calculaReajuste() {
        return (FUNCIONARIO.getSalario() * 0.1) + FUNCIONARIO.getSalario();
    }


    public static void main(String[] args) {

        FUNCIONARIO.setNomeFuncionario("Thaylanna");
        FUNCIONARIO.setSalario(980.0);

        System.out.println("O salario de " + FUNCIONARIO.getNomeFuncionario()
                + " antes era: R$ " + FUNCIONARIO.getSalario()
                + ". Apos o reajuste de 10% ficou: R$ " + SERVICE.calculaReajuste());
    }
}
