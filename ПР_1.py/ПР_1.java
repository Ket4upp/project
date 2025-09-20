Java 

  // Пример кода на Java для записи переменной "список"
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {  // Исправлено: args - массив строк
        // Создаём пустой список
        ArrayList<Integer> a = new ArrayList<Integer>();
        // Добавляем элементы
        a.add(1);
        a.add(2);
        a.add(3);
        // Печатаем список
        System.out.println(a);
    }
}

// Пример кода на Java для организации стека
class MyStack<T> {  // Сделали класс MyStack дженериком, чтобы можно было использовать разные типы данных
    private ArrayList<T> stackList;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.stackList = new ArrayList<>(capacity);
    }

    public void push(T item) {
        if (stackList.size() == capacity) {
            System.out.println("Стек переполнен!");
            return; // Или выбросить исключение
        }
        stackList.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст!");
            return null; // Или выбросить исключение
        }
        return stackList.remove(stackList.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Стек пуст!");
            return null; // Или выбросить исключение
        }
        return stackList.get(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int size() {
        return stackList.size();
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Верхний элемент: " + stack.peek());
        System.out.println("Удаляем верхний элемент: " + stack.pop());
        System.out.println("Новый верхний элемент: " + stack.peek());
        System.out.println("Размер стека: " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println("Удаляем: " + stack.pop());
        }

        System.out.println("Стек пуст: " + stack.isEmpty());
    }
}
