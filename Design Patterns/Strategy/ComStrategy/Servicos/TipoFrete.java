package Servicos;

public enum TipoFrete {
    SEDEX{
        @Override
        public Frete obterFrete(){
            return new Sedex();
        }
    },
    PAC{
        @Override
        public Frete obterFrete(){
            return new Pac();
        }
    };
    
    public abstract Frete obterFrete();
}
