public abstract class Pessoa {
    private String cpf;
    private int id;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void Falar(){
        System.out.println("Oi");
    }

    public void Falar(String frase){
        System.out.println(frase);
    }
}
