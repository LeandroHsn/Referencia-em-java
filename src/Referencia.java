public class Referencia {

    static Pessoa nomeAlterar = new Pessoa("Roberto", 20);

    public static void testar(String[] nomes){
        for (int i = 0; i < nomes.length; i++){
            nomes[i] = nomes[i] + " Henrique";
            System.out.println("O nome é: " + nomes[i]);
        }
    }

    public static void modificacaoDoTestar(String[] nomes){
        for (int i = 0; i < nomes.length; i++){
            nomes[i] = nomes[i] + " Silva";
            System.out.println("O nome é: " + nomes[i]);
        }
    }

    public static void modificacaoDoObjeto(int idade){  
        nomeAlterar.setIdade(idade);      
        nomeAlterar.apresentacao();     
    }

    public static void segundaModificacaoDoObjeto(int idade){
        modificacaoDoObjeto(idade);
        nomeAlterar.setNome("Julio");
        nomeAlterar.apresentacao();
    }

    public static void metodoSemParametro(){
        Pessoa pessoa1 = new Pessoa("Jaqueline", 19);
        Pessoa pessoa2 = new Pessoa("Aline", 23);

        pessoa1.apresentacao();
        pessoa2.apresentacao();

        pessoa1.setIdade(120);
        pessoa2.setIdade(-80);

        System.out.println("Sou a "+ pessoa1.getNome()+" e minha idade agora é " + pessoa1.getIdade() + " anos.");
        System.out.println("Sou a "+pessoa2.getNome()+" e minha idade agora é " + pessoa1.getIdade() + " anos.");

    }

    public static void main(String[] args) throws Exception {

        String[] nomes = new String[]{"Leandro","Ronaldo", "Fernando"};

        System.out.println("Nomes raiz");
        for (int i = 0; i < nomes.length; i++){
            System.out.println("O nome é: " + nomes[i]);
        }

        System.out.println("\nNomes do método");
        testar(nomes);

        System.out.println("\nNomes modificados");
        for (int i = 0; i < nomes.length; i++){
            System.out.println("O nome é: " + nomes[i]);
        }

        System.out.println("\nNomes do método modificado novamente");
        modificacaoDoTestar(nomes);

        System.out.println("\nNomes modificados");
        for (int i = 0; i < nomes.length; i++){
            System.out.println("O nome é: " + nomes[i]);
        }


        // NOMES MODIFICADOS DO OBJETO PESSOA

        System.out.println("\nNOMES MODIFICADOS DO OBJETO PESSOA\n");
        
        nomeAlterar.apresentacao();
        modificacaoDoObjeto(85);
        segundaModificacaoDoObjeto(11);

        // MÉTODO SEM PARÂMETRO

        System.out.println("\nMÉTODO SEM PARÂMETRO\n");
        metodoSemParametro();
    }
}
