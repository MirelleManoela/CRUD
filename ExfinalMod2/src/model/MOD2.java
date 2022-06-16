package model;
import java.sql.Date;
public class MOD2 {

    private Long id;
    private String marca;
    private double valor;
    private String cor;

    @Override
    public String toString(){
        return "mod2{" +
                "id=" + id +
                "marca=´" + marca + '\'' +
                "valor=´" + valor + '\'' +
                "cor=´" + cor + '\'' +
                '}';

    }

    public Long getId() {
        return id;
}
    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}


