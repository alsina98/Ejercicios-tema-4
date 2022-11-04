public class comparar {
    public static void main(String[] args) {
        
        // Exercicio 1
        
        
        int variable = 10;
        
        if (variable > 0){
            System.out.println("es positivo");
        }else if (variable < 0){
            System.out.println("es negativo");
        }else{
            System.out.println("es 0");
        }
        

        //Exercio 2

        

        int numeroWhile = 0;

        
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        

        //Exercicio 3


        

        int numeroDoWhile = 0;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile < 1);

        

        // Exercicio 4

        
        
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++ ){
            System.out.println(numeroFor);
        }
        
        

        // Exercicio 5

        String estacion = "OTOÑO";

        switch (estacion){
            case "VERANO":
            System.out.println("es verano");
            break;
            case "INVIERNO":
            System.out.println("es invierno");
            break;
            case "PRIMAVERA":
            System.out.println("es primavera");
            break;
            case "OTOÑO":
            System.out.println("es otoño");
            break;
            default:
            System.out.println("No corresponde a ninguna opcion");
        }
    }
}
