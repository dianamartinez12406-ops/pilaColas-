public class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public static void main(String[] args) {
        Nodo primero = new Nodo(10);
        primero.siguiente = new Nodo(20);

        System.out.println("Primer nodo: " + primero.dato);
        System.out.println("Siguiente nodo: " + primero.siguiente.dato);
    }
}
}
