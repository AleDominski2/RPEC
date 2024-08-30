public class StaticList {
    int[] data;
    int tamanho;

    public StaticList(int capacidade) {
        this.data = new int[capacidade];
        this.tamanho = 0;
    }

    public void limpar() {
        for (int i = 0; i < data.length; i++) {
            data[i] = 0;
        }
        tamanho=0;
    }

    public void adicionar(int valor) {
        if (isFull()) {
            throw new RuntimeException("Lista cheia");
        }
        data[tamanho++] = valor;
    }

    public int remover(int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        int elementoRemovido = data[pos];
        // Desloca os elementos que restaram para a esquerda
        for (int i = pos; i < tamanho - 1; i++) {
            data[i] = data[i + 1];
        }
        tamanho--;
        return elementoRemovido;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == data.length;
    }

    public void setData(int valor, int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        data[pos] = valor;
    }

    public int getData(int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return data[pos];
    }

    public int getSize() {
        return tamanho;
    }

    public int find(int element) {
        for (int i = 0; i < tamanho; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
