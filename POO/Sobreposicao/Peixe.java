public class Peixe extends Animal {
    protected String corEscama;

    public String getCorEscama(){
        return corEscama;
    }

    public void setCorEscama(String cor){
        this.corEscama = cor;
    }

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Peixe Comendo");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Peixe");
    }
}
