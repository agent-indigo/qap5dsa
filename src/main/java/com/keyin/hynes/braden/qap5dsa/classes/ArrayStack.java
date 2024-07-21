package com.keyin.hynes.braden.qap5dsa.classes;
import com.keyin.hynes.braden.qap5dsa.interfaces.Stacking;
public final class ArrayStack<T> implements Stacking<T> {
    private Object[] array;
    private int top;
    private T popped;
    public ArrayStack(int size) {
        this.array = new Object[size];
        this.top = -1;
    }
    @Override
    public int getSize() {
        return array.length;
    }
    public boolean isEmpty() {
        if (top == -1) {
            System.err.println("Stack is empty.");
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (top == array.length -1) {
            System.err.println("Stack is full.");
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void push(T character) {
        if (!isFull()) {
            array[top + 1] = character;
            top++;
        }
    }
    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        if (!isEmpty()) {
            this.popped = (T) array[top];
            top--;
            return popped;
        } else {
            return null;
        }
    }
    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        return (T) array[top];
    }
    @Override
    public void delete() {
        this.array = null;
        this.top = -1;
        System.out.println("Stack deleted.");
    }
}