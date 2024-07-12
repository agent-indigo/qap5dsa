package com.keyin.hynes.braden.qap5dsa.classes;
public class ArrayStack {
    private char[] charArray;
    private int top;
    public ArrayStack(int size) {
        this.charArray = new char[size];
        this.top = -1;
    }
    public boolean isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return true;
        } else {
            System.out.println("Stack is not empty.");
            return false;
        }
    }
    public boolean isFull() {
        if (top == charArray.length -1) {
            System.out.println("Stack is full.");
            return true;
        } else {
            System.out.println("Stack is not full.");
            return false;
        }
    }
    public void push(char character) {
        if (isFull()) {
            System.err.println("Stack is full.");
        } else {
            charArray[top + 1] = character;
            top++;
            System.out.println("Character successfully added.");
        }
    }
}