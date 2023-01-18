package Servicos;

public class Frete {
    private TipoFrete tipoFrete;

    public Frete(TipoFrete tipo){
        this.tipoFrete = tipo;
    }

    public double calcularPreco(int distancia){
        double preco = 0;
        if (TipoFrete.PAC.equals(tipoFrete)) {
			preco = distancia * 1.25 + 10;
		} else if (TipoFrete.SEDEX.equals(tipoFrete)) {
			preco = distancia * 1.45 + 12;
		}
        return preco;
    }
}
