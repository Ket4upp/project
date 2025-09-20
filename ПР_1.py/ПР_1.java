Java 

import java.util.ArrayList;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        // Создание списка
        ArrayList<Character> myList = new ArrayList<>();
        myList.add('a');
        myList.add('b');
        myList.add('c');
        myList.add('d');
        myList.add('e');
        myList.add('f');

        // Организация стека
        Stack<Character> myStack = new Stack<>();
        myStack.push('a');
        myStack.push('b');
        myStack.push('c');

        System.out.println("Верхний элемент стека: " + myStack.peek()); // Вывод: c
        myStack.pop();
        System.out.println("Верхний элемент стека: " + myStack.peek()); // Вывод: b
    }
}
