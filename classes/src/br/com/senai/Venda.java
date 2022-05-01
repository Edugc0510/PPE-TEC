package br.com.senai;

public class Venda
{
    private String nome;
    private String rg;
    private String cpf;
    private String endereco;
    private String metodoPagamento;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }


    @Override
    public String toString() {
        return "Venda:" +
                "\nnome:" + nome +
                "\nrg:" + rg +
                "\ncpf:" + cpf +
                "\nendereco:'" + endereco +
                "\nmetodoPagamento:" + metodoPagamento;
    }
}
