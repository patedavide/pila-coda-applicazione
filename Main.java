public class Main {

    public static void main(String[] args) {

        // ---- LISTA ----
        System.out.println("LISTA");
        Lista lista = new Lista();

        lista.aggiungi("Davide");
        lista.aggiungi("Ilario");
        lista.aggiungi("Federico");

        lista.resetIteratore();
        String elemento;
        while ((elemento = lista.visita()) != null) {
            System.out.println(elemento);
        }

        lista.modifica("Davide", "Paternò");
        System.out.println("\nDopo modifica:");
        lista.resetIteratore();
        while ((elemento = lista.visita()) != null) {
            System.out.println(elemento);
        }

        lista.elimina("Ilario");
        System.out.println("\nDopo elimina:");
        lista.resetIteratore();
        while ((elemento = lista.visita()) != null) {
            System.out.println(elemento);
        }

        System.out.println("\nPILA");
        MiaPila pila = new MiaPila();

        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("Peek: " + pila.peek());

        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        System.out.println("\nCODA");
        MiaCoda coda = new MiaCoda();

        coda.enqueue("Primo");
        coda.enqueue("Secondo");
        coda.enqueue("Terzo");

        System.out.println("Peek: " + coda.peek());

        while (!coda.isEmpty()) {
            System.out.println(coda.dequeue());
        }
    }
}