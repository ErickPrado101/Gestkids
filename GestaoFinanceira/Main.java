import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        boolean rodando = true;
        while(rodando){
            System.out.println("Gestão financeira");
            System.out.println("-------------------------");
            System.out.println("1 - Adicionar Gasto");
            System.out.println("2 - Adicionar Ganho");
            System.out.println("3 - Relatório Gastos");
            System.out.println("4 - Relatório Ganhos");
            System.out.println("5 - Relatório Mensal");
            System.out.println("6 - Sair");
            System.out.println("Selecione uma opção");
            int opcao = Scanner.nextInt();
            Scanner.nextLine();
            switch (opcao){

                case 1:
                    System.out.println("Adicionar Gasto");
                    System.out.println("-----------------------");
                    System.out.println("Informe o tipo de Gasto(Alimentação, Habitação, etc)");
                    String TipoGasto = Scanner.next();
                    System.out.println("informe a data: dd/mm/yyyy");
                    String DataGasto = Scanner.next();
                    System.out.println("informe o valor: ");
                    Double ValorGasto = Scanner.nextDouble();
                    System.out.println("1 - Cheque");
                    System.out.println("2 - Pix");
                    System.out.println("3 - Debito");
                    System.out.println("Selecione a forma de pagamento");
                    int Fpag = Scanner.nextInt();
                    Scanner.nextLine();
                    switch (Fpag){
                        case 1:
                        Gasto GastoCheque = new Gasto(TipoGasto, DataGasto,ValorGasto, "Cheque");
                        Banco.addGastos(GastoCheque);
                        System.out.println("Gasto Adicionado");
                        break;
                        case 2:
                        Gasto GastoPix = new Gasto(TipoGasto, DataGasto,ValorGasto, "Pix");
                        Banco.addGastos(GastoPix);
                        System.out.println("Gasto Adicionado");
                        break;
                        case 3:
                        Gasto GastoDebito = new Gasto(TipoGasto, DataGasto,ValorGasto, "Debito");
                        Banco.addGastos(GastoDebito);
                        System.out.println("Gasto Adicionado");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Adicionar Ganho");
                    System.out.println("-----------------------");
                    System.out.println("Informe o tipo de Ganho(Salário, Freelancer, etc)");
                    String TipoGanho = Scanner.nextLine();
                    System.out.println("Informe a data: dd/mm/yyyy");
                    String DataGanho = Scanner.nextLine();
                    System.out.println("Informe o valor: ");
                    Double ValorGanho = Scanner.nextDouble();
                    Ganho Ganho = new Ganho(TipoGanho,DataGanho,ValorGanho);
                    Banco.addGanhos(Ganho);
                    break;
                case 3:
                    System.out.println("Relatório de Gastos");
                    RelatorioGasto relatorioGasto = new RelatorioGasto();
                    relatorioGasto.getRelatorioGasto();
                    break;
                case 4:
                    System.out.println("Relatório de Ganhos");
                    RelatorioGanho relatorioGanho = new RelatorioGanho();
                    relatorioGanho.getRelatorioGanho();
                    break;
                case 5:
                    System.out.println("Relatório Mensal");
                    RelatorioGanho ganhoTotal = new RelatorioGanho();
                    System.out.println("Total de ganhos: " + ganhoTotal.getGanhoTotal());
                    RelatorioGasto gastoTotal = new RelatorioGasto();
                    System.out.println("total de gastos: " + gastoTotal.getGastoTotal());
                    System.out.println();
                    RelatorioFinal relatorioFinal = new RelatorioFinal();
                    relatorioFinal.getRelatorioFinal();
                    System.out.println();
                    break;
                case 6:
                    rodando = false;
            }
            Scanner.nextLine();
        }
    }
}