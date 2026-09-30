import Classes.Entidades.Contribuente;
import Classes.Entidades.Fisica;
import Classes.Entidades.Juridica;

void main() {
    Scanner input = new Scanner(System.in);
try {
    List<Contribuente> contribuentes = new ArrayList<>();
    IO.print("Quantos contribuentes voce vai registrar? ");
    int quantos = input.nextInt();
    for (int i = 0; i < quantos; i++) {
        IO.print("Digite o nome do Contribuente: ");
        String nome = input.next();
        IO.print("Digite sua renda anual: ");
        double renda = input.nextDouble();
        IO.println("O seu funcionário é Físico ou Jurídico? [F/J]");
        String qual = input.next();
        while (!qual.equalsIgnoreCase("f") || !qual.equalsIgnoreCase("j")) {
            if (qual.equalsIgnoreCase("f")) {
                IO.print("Quanto foi o gasto com sáude ao longo do ano? ");
                double gasto = input.nextDouble();
                Contribuente pessoa = new Fisica(nome, renda, gasto);
                contribuentes.add(pessoa);
                break;
            } else if (qual.equalsIgnoreCase("j")) {
                IO.print("Quantos funcionários sua empresa possui? ");
                int funcionarios = input.nextInt();
                Contribuente pessoa = new Juridica(nome, renda, funcionarios);
                contribuentes.add(pessoa);
                break;
            }else{
                IO.print("Digite um dos valores solicitados. ");
                qual = input.nextLine();
            }
        }
    }
        contribuentes.forEach(Contribuente::Pessoa);
}catch (Exception e){
    IO.print("Um erro inexperado ocorreu, tente novamente mais tarde" + e);
}

}