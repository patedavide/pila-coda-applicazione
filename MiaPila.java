public class MiaPila {

    Nodo top;

    public void push(String valore) {
        Nodo nuovo = new Nodo(valore);
        nuovo.next = top;
        top = nuovo;
    }

    public String pop() {
        if (top == null) return null;
        String valore = top.value;
        top = top.next;
        return valore;
    }

    public String peek() {
        if (top == null)
            return null;
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }
}