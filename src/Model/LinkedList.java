package Model;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public void appendToTail(T value){
        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = newNode;
        } else{
            Node<T> aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
        size++;
    }

    public T findByValue(T value){
        Node<T> aux = head;
        
        while(aux != null){
            if(aux.getValue().equals(value)){
                return aux.getValue();
            }
            aux = aux.getNext();
        }
        return null;
    }

    public void deleteByValue(T value){
        if (head == null){
            System.out.println("No se tiene ningun contacto");
        }

        if(head.getValue().equals(value)){
            head = head.getNext();
            size--;
            System.out.println("Contacto eliminado");
        }

        Node<T> aux = head;
        while(head != null){
            if(aux.getNext().getValue().equals(value)){
                aux.setNext(aux.getNext().getNext());
                size--;
            }
            aux = aux.getNext();
        }
    }

    public void print(){
        Node<T> aux = head;

        while(aux != null){
            System.out.println(aux.getValue());
            aux = aux.getNext();
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}