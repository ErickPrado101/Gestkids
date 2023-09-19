import java.util.Date;

public class Gasto {
    /*Atributos*/
    private String Tipo;
    private String Data;
    private Double Valor;
    private String FPag;
    /*Setters*/
    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }
    public void setData(String data) {
        this.Data = data;
    }
    public void setValor(Double valor) {
        this.Valor = valor;
    }
    public void setFPag(String FPag) {
        this.FPag = FPag;
    }
    /*Constructor*/
    public Gasto(String tipo, String data, Double valor, String FPag) {
        this.Tipo = tipo;
        this.Data = data;
        this.Valor = valor;
        this.FPag = FPag;
    }
    /*Getters*/
    public String getTipo() {
        return Tipo;
    }
    public String getData() {
        return Data;
    }
    public Double getValor() {
        return Valor;
    }
    public String getFPag() {
        return FPag;
    }
}
