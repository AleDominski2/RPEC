public class Main {
    public static void main(String[] args) {
        // Cria uma lista estática com capacidade para 5 elementos
        StaticList list = new StaticList(5);

        // Testando o método adicionar
        list.adicionar(10);
        list.adicionar(20);
        list.adicionar(30);
        printList(list);

        // Testando o método remover
        int removido = list.remover(1);
        System.out.println("Elemento removido: " + removido);
        printList(list);

        // Testando o método setData
        list.setData(25, 1);
        printList(list);

        // Testando o método getData
        int data = list.getData(1); // Deve retornar 25
        System.out.println("Elemento na posição 1: " + data);

        // Testando o método find
        int pos = list.find(10); // Deve retornar 0
        System.out.println("Posição do elemento 10: " + pos);

        // Testando o método isEmpty e isFull
        System.out.println("Lista está vazia? " + list.isEmpty()); // Deve ser false
        System.out.println("Lista está cheia? " + list.isFull()); // Deve ser false

        // Testando o método clear
        list.limpar();
        System.out.println("Lista após o clear: ");
        printList(list);
        System.out.println("Lista está vazia? " + list.isEmpty()); // Deve ser true
    }

    // Método auxiliar para imprimir os elementos da lista
    public static void printList(StaticList list) {
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.getData(i) + " ");
        }
        System.out.println();
    }
}