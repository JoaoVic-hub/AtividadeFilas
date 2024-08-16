package src;

public class Main {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(5); // fila com tamanho máximo de 5 elementos

        // Teste de inserção
        System.out.println("Inserindo elementos na fila...");
        System.out.println(fila.insere(10)); // true
        System.out.println(fila.insere(20)); // true
        System.out.println(fila.insere(30)); // true
        System.out.println(fila.insere(40)); // true
        System.out.println(fila.insere(50)); // true
        System.out.println(fila.insere(60)); // false (fila cheia)

        // Teste de remoção
        System.out.println("\nRemovendo elementos da fila...");
        System.out.println("Elemento removido: " + fila.remove()); // Deve remover 10
        System.out.println("Elemento removido: " + fila.remove()); // Deve remover 20

        // Inserindo mais elementos
        System.out.println("\nInserindo mais elementos na fila...");
        System.out.println(fila.insere(60)); // true
        System.out.println(fila.insere(70)); // true
        System.out.println(fila.insere(80)); // false (fila cheia)

        // Testando o estado da fila
        System.out.println("\nEstado da fila:");
        System.out.println("Primeiro elemento: " + fila.primeiro()); // Deve mostrar 30
        System.out.println("Fila está vazia? " + fila.vazia()); // Deve mostrar false
        System.out.println("Fila está cheia? " + fila.cheia()); // Deve mostrar true
    }
}