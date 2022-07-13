import java.util.ArrayList;

public abstract class ListaLinkata<T> {
    /*Progettate una classe ListaLinkata generica

    Ogni elemento della lista contiene un valore e il riferimento al prossimo elemento​

    Implementate i metodi removeFirst e addFirst
    */
    private ElementoListaLinkata<T> head;

    public ListaLinkata() {
        this.head = null;
    }

    public ElementoListaLinkata<T> getHead() {
        return head;
    }

    public void setHead(ElementoListaLinkata<T> head) {
        this.head = head;
    }

    public void addFirst(T data) {
        this.head = new ElementoListaLinkata<>(data, this.head);
    }

    public void removeFirst() {
        this.head = head.getNextElement();
    }

    @Override
    public String toString() {
        String output = "";
        if (this.head != null) {
            ElementoListaLinkata<T> currentElement = this.head;
            while (currentElement.getNextElement() != null) {
                output += currentElement.getData() + ", ";
                currentElement = currentElement.getNextElement();
            }
            output += currentElement.getData();
        }
        return output;
    }
}
