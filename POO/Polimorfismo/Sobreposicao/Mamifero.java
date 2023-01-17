public class Mamifero extends Animal {
    protected String corPelo;

    public String getCorPelo(){
        return corPelo;
    }

    public void setCorPelo(String cor){
        this.corPelo = cor;
    }

    @Override
    public void locomover(){
        System.out.println("Mamifero Andando");
    }

    @Override
    public void alimentar(){
        System.out.println("Mamifero comendo");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    }
}
