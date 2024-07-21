package com.keyin.hynes.braden.qap5dsa.classes;
import com.keyin.hynes.braden.qap5dsa.interfaces.Stacking;
import java.util.LinkedList;
public final class LinkedListStack<T> implements Stacking<T> {
    private LinkedList<T> list;
    public LinkedListStack() {
        this.list = new LinkedList<T>();
    }
    @Override
    public int getSize() {
        return list.size();
    }
    @Override
    public void push(T value) {
        list.addLast(value);
    }
    @Override
    public T pop() {
        return list.pop();
    }
    @Override
    public T peek() {
        return list.getLast();
    }
    @Override
    public void delete() {
        this.list = null;
    }
}