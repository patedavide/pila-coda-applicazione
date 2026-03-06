public class MiaCoda {

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