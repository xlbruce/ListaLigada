package br.ed;

public class LinkedList {

    private Node header; // início da lista ligada
    private int size; // quantidade de elementos na lista ligada

    public LinkedList() {
        // inicializa a lista como vazia
        header = null;        
        size = 0;
    }

    public int size() {
        // retorna o tamanho da lista
        return size;
    }

    public boolean isEmpty() {
        // verifica se a lista está vazia
        return size == 0;
    }

    public Node first() {
        // retorna o Nó inicial da lista
        return header;
    }

    public Node last() {
        // retorna o último Nó da lista
        Node n;
        if (header == null) {
            return null;
        }
        for (n = header; n.getNext() != null; n = n.getNext());
        return n;
    }

    public void addFirst(String nomeAnimal) {
        Node n = new Node(nomeAnimal);
        n.setNext(header);
        header = n;
        size++;
    }

    public void addLast(String nomeAnimal) {
        Node n = new Node(nomeAnimal);
        if (header == null) {
            n.setNext(header);
            header = n;
        } else {
            Node no = last();
            no.setNext(n);
        }
    }
    
    public void addAfter(Node n) {
    }
}
