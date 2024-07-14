package com.keyin.hynes.braden.qap5dsa.classes;
public class ArrayStack {
    private char[] array;
    private int top;
    private char popped;
    public ArrayStack(int size) {
        this.array = new char[size];
        this.top = -1;
    }
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
    public void push(char character) {
        if (!isFull()) {
            array[top + 1] = character;
            top++;
            System.out.println("Character successfully added.");
        }
    }
    public char pop() {
        if (!isEmpty()) {
            this.popped = array[top];
            top--;
            return popped;
        } else {
            return '\0';
        }
    }
    public char peek() {
        return array[top];
    }
    public void delete() {
        this.array = null;
        this.top = -1;
        System.out.println("Stack deleted.");
    }
}