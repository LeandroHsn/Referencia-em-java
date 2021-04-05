public class Pessoa {

    private String nome;
    private int idade;   


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentacao (){
       System.out.println("Olá meu nome é " + this.nome + " e minha idade é " + this.idade + " anos.");
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
