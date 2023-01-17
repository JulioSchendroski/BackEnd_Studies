public class Ave extends Animal {
    protected String corPena;

    public String getCorPena(){
        return corPena;
    }

    public void setCorPena(String cor){
        this.corPena = cor;
    }

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void alimentar(){
        System.out.println("Ave Comendo");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    }
}
