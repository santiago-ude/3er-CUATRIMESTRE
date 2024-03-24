
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

        int valor = 1;


        while(valor == 1){





        System.out.println("Ingresa 2 numeros");

        System.out.print("Numero 1:");

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.print("Numero 2:");

        int num2 = scanner.nextInt();


        System.out.println("|1 SUMAR|\n|2 RESTAR|\n|3 MULTIPLICAR|\n|4 DIVIDIR|");
        System.out.println("Ingrese opcion: ");
        int eleccion =  scanner.nextInt();

        int result;

        switch(eleccion){

            case 1:

                result = num1 + num2;
                System.out.print("Resultado: ");
                System.out.print(result);
                break;

            case 2:
                if(num1 >= num2){

                    result = num1 - num2;
                    System.out.print("Resultado: ");
                    System.out.print(result);

                } else{

                    System.out.println("No aceptamos resultados negativos");
                }
                break;

            case 3:

                result = num1*num2;
                System.out.print("Resultado: ");
                System.out.print(result);

                break;

            case 4:

                float resultDiv;

                if(num1 > 0 && num2 > 0){

                    resultDiv = (float)num1/(float)num2;
                    System.out.print("Resultado: ");
                    System.out.print(resultDiv);
                }else{

                    System.out.println("Solo divisiones positivas");

                }

                break;
        }

        System.out.println("\n|1 seguir haciendo operaciones|\n|2 dejar de hacer operaciones|\n");
        valor = scanner.nextInt();



        }

    }
}
