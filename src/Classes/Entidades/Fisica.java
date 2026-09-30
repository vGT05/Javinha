package Classes.Entidades;

public class Fisica extends Contribuente{
    private double gasto;
    private double imposto;

    public double getGasto() {
        return gasto;
    }
    protected void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public Fisica(String nome, double renda, double gasto) {
        super(nome, renda);
        setGasto(gasto);
    }
    protected double Imposto(){
        if (getRenda() <= 20000){
            imposto = (getRenda() * 0.15);
            return imposto;
        }else {
            imposto = getRenda() * 0.25;
            return imposto;
        }
    }
    @Override
    public double ImpostoGeral(){
        double impostoGeral = Imposto() - (getGasto() * 0.5) ;
        return impostoGeral;
    }

    @Override
    public void Pessoa() {
        IO.println("\nNome do contribuente: " + getNome()  +
                "\n\tRenda anual: " + getRenda() +
                "\n\tGasto com saúde: " + getGasto() +
                "\n\tImposto arrecadado: " + ImpostoGeral());
    }
}

