package opgave03.models;

import opgave01.models.StackEaaa;

public class DropOutStack<E> implements StackEaaa<E> {

    private int maxSize;
    private Node<E> top;
    private Node<E> bottom;
    public DropOutStack(int maxSize) {
        this.maxSize = maxSize;
        top = new Node<E>();
    }

    @Override
    public void push(E element) {
        Node<E> node = new Node<E>(element);

        if(isEmpty()) {
            top = node;
            bottom = top;
        }
        else {
            node.setNext(top);
            top.setPrevious(node);
            top = node;
            if(size() < maxSize) {
                bottom = bottom.getPrevious();
                bottom.setNext(null);
            }
        }
    }

    @Override
    public E pop() {
        Node<E> nodeToBePoped = top;
        top = top.getNext();
        top.setPrevious(null);
        return nodeToBePoped.getElement();
    }

    @Override
    public E peek() {
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {
        boolean status = false;
        if(top == null) {
            status = true;
        }
        return status;
    }

    @Override
    public void clear() {
        top = null;
        bottom = null;
    }

    @Override
    public int size() {
        int counter = 0;
        Node<E> node = top;
        if(top != null) {
            do {
                counter++;
                node = node.getNext();
            } while(node.getNext() != null);
        }
        else {
            counter = 0;
        }
        return counter;
    }

    private class Node<T> {
        private Node() {}
        private Node(T element) {
            this.element = element;
        }
        T element;
        Node<T> next;
        Node<T> previous;

        private T getElement() {
            return element;
        }
        private void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public Node<T> getPrevious() {
            return previous;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }
    }
}
