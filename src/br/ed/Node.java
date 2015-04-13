package br.ed;

public class Node {

    private String nomeAnimal; // elemento armazenado no nó
    private Node next; // próximo elemento da lista

    public Node(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
        next = null;
    }

    public String getNomeAnimal() {
        return this.nomeAnimal;
    }

    public void setnomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public Node getNext() {
        // Devolve o próximo elemento do nó
        return next;
    }

    public void setNext(Node no) {
        this.next = no;
    }

    @Override
    public String toString() {
        return "Node{" + "nomeAnimal=" + nomeAnimal + ", next=" + next + '}';
    }
}
