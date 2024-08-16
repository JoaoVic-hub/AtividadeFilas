package src;

public class FilaCircular {
    private int[] dados;
    private int inicio;
    private int fim;
    private int nElementos;
    private int tamMax;

    public FilaCircular(int tamMax) {
        this.tamMax = tamMax;
        dados = new int[tamMax];
        inicio = 0;
        fim = -1;
        nElementos = 0;
    }

    public boolean vazia() {
        return nElementos == 0;
    }

    public boolean cheia() {
        return nElementos == tamMax;
    }

    public int tamanho() {
        return nElementos;
    }

    public int primeiro() {
        if (vazia()) {
            return -1;
        }
        return dados[inicio];
    }

    public boolean insere(int valor) {
        if (cheia()) {
            return false;
        }
        fim = (fim + 1) % tamMax; // Incremento circular
        dados[fim] = valor;
        nElementos++;
        return true;
    }

    public int remove() {
        if (vazia()) {
            return -1;
        }
        int valorRemovido = dados[inicio];
        inicio = (inicio + 1) % tamMax; // Incremento circular
        nElementos--;
        return valorRemovido;
    }
}
