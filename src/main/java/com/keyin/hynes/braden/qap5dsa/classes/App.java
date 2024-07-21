package com.keyin.hynes.braden.qap5dsa.classes;
import java.util.Scanner;
public final class App {
    private Scanner scanner;
    private ArrayStack<Character> stack;
    private String word;
    private int length;
    private int middle;
    private int i;
    private App() {
        this.scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {
        App app = new App();
        try {
            app.palindrome();
        } catch (Exception exception) {
            exception.printStackTrace();
            System.exit(1);
        } finally {
            if (app.scanner != null) app.scanner.close();
        }
    }
    private void palindrome() {
        while (word == null) {
            System.out.println("\nEnter the word to check:\n");
            this.word = scanner.nextLine();
            this.length = word.length();
            this.middle = length / 2;
            this.i = length % 2 == 0 ? middle : middle + 1;
            this.stack = new ArrayStack<Character>(length);
            for (int i = 0; i < middle; i++) stack.push(word.charAt(i));
            while (i < length) {
                if (word.charAt(i) != stack.pop()) {
                    System.out.println("\nWord is not a palindrome.\n");
                    return;
                } else {
                    i++;
                }
            }
            System.out.println("\nWord is a palindrome.\n");
        }
    }
}