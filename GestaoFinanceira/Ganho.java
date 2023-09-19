import java.util.Date;

public class Ganho {
    /*Atributos*/
    private String Tipo;
    private Double Valor;
    private String Data;

    /*Setters*/
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    public void setData(String Data){
        this.Data = Data;
    }
    public void setValor(Double Valor){
        this.Valor = Valor;
    }
    /*Constructor*/
    public Ganho(String Tipo, String Data, Double Valor){
        this.Tipo = Tipo;
        this.Valor = Valor;
        this.Data = Data;
    }
    /*Getters*/
    public String getTipo(){return Tipo;}
    public String getData() {
        return Data;
    }
    public Double getValor() {
        return Valor;
    }

}
