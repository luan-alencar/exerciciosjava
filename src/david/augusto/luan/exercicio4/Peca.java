package david.augusto.luan.exercicio4;

import java.util.UUID;

public class Peca {

    private String nomePeca;
    private Double valorUnitario;
    private Integer quantidade;

    public String getCodigo() {
        return UUID.randomUUID().toString();
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
