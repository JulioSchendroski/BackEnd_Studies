public class Main{
    public static void main(String[] args){
        Mamifero mamifero = new Mamifero();
        Ave ave = new Ave();
        Peixe peixe = new Peixe();
        Reptil reptil = new Reptil();

        mamifero.emitirSom();
        mamifero.alimentar();
        mamifero.locomover();

        System.out.println("\n--------------------------\n");

        ave.emitirSom();
        ave.alimentar();
        ave.locomover();
        System.out.println("\n--------------------------\n");

        peixe.emitirSom();
        peixe.alimentar();
        peixe.locomover();
        System.out.println("\n--------------------------\n");

        reptil.emitirSom();
        reptil.alimentar();
        reptil.locomover();
    }
}