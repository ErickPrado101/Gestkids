public class RelatorioGanho {
    /*Getters*/
    public Double getGanhoTotal() {
        double GanhoTotal = 0.0;
        for (Ganho ganho: Banco.listaGanhos) {
            GanhoTotal += ganho.getValor();
        }
        return GanhoTotal;
    }
    public void getRelatorioGanho(){
        for (Ganho Ganho: Banco.listaGanhos){
            System.out.println("Tipo: " + Ganho.getTipo());
            System.out.println("Data: " + Ganho.getData());
            System.out.println("Valor: " + Ganho.getValor());
            System.out.println();

        }
        System.out.println("total: " + getGanhoTotal());
        System.out.println();
    }
}

