package Servicos;

public class Sedex implements Frete{
    public double calcularPreco(int distancia){
        return 1.45 * distancia;
    }
}
