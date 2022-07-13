public class Pila<T> extends ListaLinkata<T> {

    public void push(T data) {
        this.addFirst(data);
    }
    public T pop(){
        T dataToRemove = this.getHead().getData();
        this.removeFirst();
        return dataToRemove;
    }
    private T peek(){
        return this.getHead().getData();
    }
}
