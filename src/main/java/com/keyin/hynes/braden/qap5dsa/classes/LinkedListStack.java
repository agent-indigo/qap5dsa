package com.keyin.hynes.braden.qap5dsa.classes;
import java.util.LinkedList;
public class LinkedListStack {
    private LinkedList<Character> list;
    public LinkedListStack() {
        this.list = new LinkedList<Character>();
    }
    public int getSize() {
        return list.size();
    }
    public void push(char character) {
        list.addLast(character);
    }
    public void pop() {
        list.removeLast();
    }
    public char peek() {
        return list.getLast();
    }
    public void delete() {
        this.list = null;
    }
}