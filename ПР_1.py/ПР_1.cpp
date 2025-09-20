C++ 

#include <iostream>
#include <list>
#include <stack>
#include <string>

int main() {
  // Создание списка
  std::list<char> my_list = {'a', 'b', 'c', 'd', 'e', 'f'};

  // Организация стека
  std::stack<char> my_stack;
  my_stack.push('a');
  my_stack.push('b');
  my_stack.push('c');

  std::cout << "Верхний элемент стека: " << my_stack.top() << std::endl; // Вывод: c
  my_stack.pop();
  std::cout << "Верхний элемент стека: " << my_stack.top() << std::endl; // Вывод: b

  return 0;
}  

.cpp
