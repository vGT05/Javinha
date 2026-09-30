package Classes.Entidades;

import Classes.Interface.IOperacoes;

public abstract class Contribuente implements IOperacoes {
    String nome;
    double renda;

    public String getNome() {
        return nome;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }

    public double getRenda() {
        return renda;
    }
    protected void setRenda(double renda) {
        this.renda = renda;
    }

    public Contribuente(String nome, double renda) {
        setNome(nome);
        setRenda(renda);
    }

    public abstract double ImpostoGeral();

    public abstract void Pessoa();
}
