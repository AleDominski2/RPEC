public class StaticQueue<T> {
    private int top = -1;
    private int base = 0;
    private T[] data;

    public StaticQueue(int size) {
        data = (T[]) new Object[size];
    }

    // adiciona um elemento na fila
    public void add(T item) {
        if (isFull()) {
            throw new IllegalStateException("A fila está cheia. Não é possível adicionar mais elementos.");
        }
        top = move(top);
        data[top] = item;
    }

    // remove um elemento da fila
    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia. Não é possível remover elementos.");
        }
        T item = data[base];
        data[base] = null; // Limpa o valor na posição base
        base = move(base);
        return item;
    }

    // limpa a fila
    public void clear() {
        top = -1;
        base = 0;
        data = (T[]) new Object[data.length];
    }

    // verifica se a fila está cheia
    public boolean isFull() {
        return move(top) == base && data[base] != null;
    }

    // verifica se a fila está vazia
    public boolean isEmpty() {
        return top == -1;
    }

    // move a posição de forma circular
    private int move(int position) {
        return (position + 1) % data.length;
    }

    // ver o elemento da frente da fila
    public T peek() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
            return null;
        }
        return data[base];
    }

    //  ver o tamanho atual da fila
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        if (top >= base) {
            return top - base + 1;
        } else {
            return data.length - base + top + 1;
        }
    }
}