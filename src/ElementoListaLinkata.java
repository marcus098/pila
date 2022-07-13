public class ElementoListaLinkata <T>{
    private  T data;
    private ElementoListaLinkata<T> nextElement;

    //Costruttore
    public ElementoListaLinkata(T data, ElementoListaLinkata<T> nextElement){
        this.data = data;
        this.nextElement = nextElement;
    }

    public T getData() {
        return data;
    }

    public ElementoListaLinkata<T> getNextElement() {
        return nextElement;
    }

    @Override
    public String toString() {
        return "ElementoListaLinkata{" +
                "data=" + data +
                ", nextElement=" + nextElement +
                '}';
    }
}
