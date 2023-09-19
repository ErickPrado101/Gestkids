public class RelatorioFinal {
    /*Getters*/
    public Double getSaldoTotal(){
        double GanhoTotal = 0.0;
        for (Ganho ganho: Banco.listaGanhos) {
            GanhoTotal += ganho.getValor();
        }
        double GastoTotal = 0.0;
        for (Gasto gasto: Banco.listaGastos){
            GastoTotal += gasto.getValor();
        }
        double SaldoTotal = 0.0;
        SaldoTotal = GanhoTotal - GastoTotal;
        return SaldoTotal;
    }
    public void getRelatorioFinal(){
        System.out.println("total: " + getSaldoTotal());
        System.out.println();
    }
}
