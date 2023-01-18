package Servicos;

public class Pac implements Frete{
    public double calcularPreco(int distancia){
        return 1.10 * distancia;
    }
}
