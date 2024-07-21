package com.keyin.hynes.braden.qap5dsa.interfaces;
public interface Stacking<T> {
    int getSize();
    void push(T value);
    T pop();
    T peek();
    void delete();
}