package opgave01.models;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack <T> implements StackEaaa<T> {

    private ArrayList<T> arrayList = new ArrayList<T>();
    @Override
    public void push(T element) {
        arrayList.addFirst(element);
    }

    @Override
    public T pop() {
        if(arrayList.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        else {
            return arrayList.removeFirst();
        }
    }

    @Override
    public T peek() {
        if(arrayList.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        else {
            return arrayList.getFirst();
        }
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public void clear() {
        arrayList.clear();
    }

    @Override
    public int size() {
        return arrayList.size();
    }
}
