C++ 

  
#include <iostream>
#include <stack>
#include <string>

int main() {
  // Создание стека строк
  std::stack<std::string> myStack;

  // Добавление элементов в стек (push)
  myStack.push("Первый");
  myStack.push("Второй");
  myStack.push("Третий");

  // Проверка, пуст ли стек (empty)
  if (!myStack.empty()) {
    std::cout << "Стек не пуст." << std::endl;
  }

  // Получение верхнего элемента стека (top)
  std::cout << "Верхний элемент стека: " << myStack.top() << std::endl;

  // Удаление верхнего элемента стека (pop)
  myStack.pop();

  // Получение нового верхнего элемента стека после удаления
  std::cout << "Новый верхний элемент стека: " << myStack.top() << std::endl;

  // Получение размера стека (size)
  std::cout << "Размер стека: " << myStack.size() << std::endl;

  // Полное удаление элементов из стека (пока он не станет пустым)
  while (!myStack.empty()) {
    std::cout << "Удаляем: " << myStack.top() << std::endl;
    myStack.pop();
  }

  // Проверка, пуст ли стек после удаления всех элементов
  if (myStack.empty()) {
    std::cout << "Стек пуст." << std::endl;
  }

  return 0;
}


.cpp
