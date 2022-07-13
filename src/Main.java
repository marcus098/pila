public class Main {
    public static void main(String[] args) {
        Pila<String> pila = new Pila<>();
        pila.push("stai");
        pila.push("come");
        pila.push("ciao");
        pila.push("prova");
        System.out.println(pila);

        pila.pop();
        System.out.println(pila);

    }
}
