public class DLL<T> {
    private class Node<T> {
        T valor;
        Node<T> antes;
        Node<T> prox;

        public Node(T valor) {
            this.valor = valor;
            this.antes = null;
            this.prox = null;
        }
    }

    private Node<T> base;
    private Node<T> top;
    private int tamanho;

    public DLL() {
        this.base = null;
        this.top = null;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int getSize() {
        return tamanho;
    }

    public void add(int pos, T valor) {
        if (pos < 0 || pos > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }

        Node<T> newNode = new Node<>(valor);

        if (pos == 0) {
            if (isEmpty()) {
                base = top = newNode;
            } else {
                newNode.prox = base;
                base.antes = newNode;
                base = newNode;
            }
        } else if (pos == tamanho) { // Adicionar no final
            add(valor);
        } else { // Adicionar no meio
            Node<T> current = getNode(pos);
            newNode.antes = current.antes;
            newNode.prox = current;
            current.antes.prox = newNode;
            current.antes = newNode;
        }
        tamanho++;
    }

    public void add(T valor) {
        Node<T> newNode = new Node<>(valor);
        if (isEmpty()) {
            base = top = newNode;
        } else {
            top.prox = newNode;
            newNode.antes = top;
            top = newNode;
        }
        tamanho++;
    }

    public T remove(int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }

        Node<T> nodeToRemove = getNode(pos);
        T value = nodeToRemove.valor;

        if (pos == 0) { // Remover do início
            base = base.prox;
            if (base != null) {
                base.antes = null;
            }
        } else if (pos == tamanho - 1) { // Remover do final
            top = top.antes;
            if (top != null) {
                top.prox = null;
            }
        } else { // Remover do meio
            nodeToRemove.antes.prox = nodeToRemove.prox;
            nodeToRemove.prox.antes = nodeToRemove.antes;
        }

        tamanho--;
        return value;
    }

    public T remove(Node<T> node) {
        if (node == null) {
            return null;
        }

        if (node == base) {
            return remove(0);
        } else if (node == top) {
            return remove(tamanho - 1);
        } else {
            node.antes.prox = node.prox;
            node.prox.antes = node.antes;
            tamanho--;
            return node.valor;
        }
    }

    public Node<T> getNode(int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }

        Node<T> atual = base;
        for (int i = 0; i < pos; i++) {
            atual = atual.prox;
        }
        return atual;
    }

    public T get(int pos) {
        return getNode(pos).valor;
    }

    public void set(int pos, T value) {
        getNode(pos).valor = value;
    }

    public int find(T value) {
        Node<T> atual = base;
        int index = 0;

        while (atual != null) {
            if (atual.valor.equals(value)) {
                return index;
            }
            atual = atual.prox;
            index++;
        }
        return -1;
    }
}
