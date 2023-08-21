package main;

public class Principal {

    // Função recursiva para calcular o valor da série de Fibonacci
    private static int fibonacci(int n) {
        // Condição de parada: os primeiros dois termos são 1
        if (n == 1 || n == 2) {
            return 1;
        }

        // Relação de chamada dos passos: chamar a função recursiva para os dois termos anteriores
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


