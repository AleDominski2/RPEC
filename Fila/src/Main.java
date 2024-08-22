public class Main {
    public static void main(String[] args) {
        StaticQueue<Integer> fila = new StaticQueue<>(5);

        fila.add(10);
        fila.add(20);
        fila.add(30);

        System.out.println("Elemento na frente da fila: " + fila.peek());
        System.out.println("Removendo elemento: " + fila.remove());

        fila.add(40);
        fila.add(50);

        try {
            fila.add(60);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Elemento na frente da fila: " + fila.peek());
        System.out.println("Tamanho da fila: " + fila.size());

        fila.clear();
        System.out.println("Fila limpa. Tamanho da fila: " + fila.size());

        try {
            fila.remove();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}
