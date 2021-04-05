public class Valor {

    public static void testar(int[] multiplicar){
     for (int i = 0; i < multiplicar.length; i++){
         multiplicar[i] = multiplicar[i] * 2;
     }
    }

    public static void modificacaodoTestar(int[] dividir){
        for (int i = 0; i < dividir.length; i++){
            dividir[i] = dividir[i] / 3;
        }     
        testar(dividir); 
    }

    public static void main(String[] args) throws Exception {
        
        int[] valores = new int[]{10,15,20,30};  
        
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
      
        testar(valores);

        for (int i = 0; i < valores.length; i++){
            System.out.println("Valores multiplicados " + valores[i]);
        }

        modificacaodoTestar(valores);

        for (int i = 0; i < valores.length; i++){
            System.out.println("Valores dividos por 3 e em seguida multiplicados por 2: " + valores[i]);
        }
                

    }
}
