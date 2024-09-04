public class Main {
    public static void main(String[] args) {
        DLL<Integer> lista = new DLL<>();


        System.out.println("Adicionando elementos:");
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(1, 15);
        lista.add(0, 5);
        mostrarLista(lista);

        System.out.println("\nElemento na posição 2: " + lista.get(2));
        System.out.println("Elemento na posição 0: " + lista.get(0));

        System.out.println("\nAlterando o elemento na posição 2 para 25:");
        lista.set(2, 25);
        mostrarLista(lista);

        System.out.println("\nRemovendo elemento na posição 3:");
        lista.remove(3);
        mostrarLista(lista);

        System.out.println("\nRemovendo o elemento de valor 5:");
        lista.remove(lista.getNode(lista.find(5)));
        mostrarLista(lista);

        System.out.println("\nÍndice do elemento 30: " + lista.find(30));
        System.out.println("Índice do elemento 100 (não existente): " + lista.find(100));

        System.out.println("\nA lista está vazia? " + lista.isEmpty());

        System.out.println("Tamanho da lista: " + lista.getSize());
    }

    public static <T> void mostrarLista(DLL<T> lista) {
        System.out.print("Lista: ");
        for (int i = 0; i < lista.getSize(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
}
