public class MiaCoda {

    private class Nodo {
        String value;
        Nodo next;

        Nodo(String value) {
            this.value = value;
            this.next = null;
        }
    }

    Nodo testa;
    Nodo coda;

    public void enqueue(String valore) {
        Nodo nuovo = new Nodo(valore);
        if (coda != null) {
            coda.next = nuovo;
        }
        coda = nuovo;
        if (testa == null) {
            testa = nuovo;
        }
    }

    public String dequeue() {
        if (testa == null)
            return null;
        String valore = testa.value;
        testa = testa.next;
        if (testa == null) {
            coda = null;
        }
        return valore;
    }

    public String peek() {
        if (testa == null) return null;
        return testa.value;
    }

    public boolean isEmpty() {
        return testa == null;
    }
}