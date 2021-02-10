import java.util.Scanner;

public class Exercise {
    /**
     * Calcula el n-ésimo término de la sucesión de Fibonacci 
     * @param n: término a calcular
     * @return n-ésimo término de la sucesión de Fibonacci
     */
    public static int fibo(int n) {
        int result = 1;
        if (n == 1 || n == 2){ //en la sucesión de Fibonacci, los dos primeros términos son 1.
            return 1;
        }
        
        int n1 = 1, n2 = 1;
        for (int i = 3; i <= n; i++){
            result = n1 + n2; //La sucesión de Fibonacci viene determinada por la suma de los dos números anteriores.
            n1 = n2; //Ahora n1 toma valor de n2
            n2 = result; //Y n2 toma valor del resultado, luego repitiéndose el ciclo. 
        }
        return result;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dame un número positivo: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println(fibo(num));
        }
    }
}
