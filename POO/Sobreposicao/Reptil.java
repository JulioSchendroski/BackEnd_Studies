public class Reptil extends Animal {
    protected String corEscama;

    public String getCorEscama(){
        return corEscama;
    }

    public void setCorEscama(String cor){
        this.corEscama = cor;
    }

    @Override
    public void locomover(){
        System.out.println("Reptil Andando");
    }

    @Override
    public void alimentar(){
        System.out.println("Reptil Comendo");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Reptil");
    }
}
