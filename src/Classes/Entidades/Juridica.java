package Classes.Entidades;

public class Juridica extends Contribuente{
    private int funcionarios;
    private double imposto = 0;

    public int getFuncionarios() {
        return funcionarios;
    }
    protected void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Juridica(String nome, double renda, int funcionarios) {
        super(nome, renda);
        setFuncionarios(funcionarios);
    }
    @Override
    public double ImpostoGeral(){
        if (funcionarios < 10){
            imposto = getRenda() * 0.16;
            return imposto;
        }else{
            imposto = getRenda() * 0.14;
            return imposto;
        }
    }

    @Override
    public void Pessoa() {
        IO.println("\nNome do contribuente: " + getNome() +
                "\n\tRenda anual: " + getRenda() +
                "\n\tNúmero de funcionários: " + getFuncionarios() +
                "\n\tImposto arrecadado: " + ImpostoGeral());
    }
}
