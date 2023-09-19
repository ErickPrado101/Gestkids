public class RelatorioGasto {
    /*Getters*/
    public double getGastoTotal() {
        double GastoTotal = 0.0;
        for (Gasto gasto: Banco.listaGastos) {
            GastoTotal += gasto.getValor();
        }
        return GastoTotal;
    }
    public void getRelatorioGasto(){
        for (Gasto Gasto: Banco.listaGastos){
            System.out.println("Tipo: " + Gasto.getTipo());
            System.out.println("Data: " + Gasto.getData());
            System.out.println("Valor: " + Gasto.getValor());
            System.out.println("Forma de Pagamento: " + Gasto.getFPag());
            System.out.println();

        }
        System.out.println("total: " + getGastoTotal());
        System.out.println();
    }




    }
