package david.augusto.luan.exercicio3;

public class Funcionario {

    public String nomeFuncionario;
    private Double reajuste;
    private Double salario;

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Double getReajuste() {
        return reajuste;
    }

    public void setReajuste(Double reajuste) {
        this.reajuste = reajuste;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
