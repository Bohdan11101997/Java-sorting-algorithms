# Java-sorting-algorithms
1. Створити інтерфейс Generator з методом List<Integer> generate(int size); 
2. Створити класи, що його реалізують SortedGenerator, InverseSortedGenerator, AlmostSortedGenerator, RandomSortedGenerator; 
2.1. SortedGenerator генерує список відсортованих чисел 
2.2. InverseSorted - обернено відсортований 
2.3. AlmostSortedGenerator - відсортований, і перший елемент поставлений в кінець 2 3 4 5 6 7 8 1, для прикладу 
2.4. RandomSorted - випадкові числа 
3. Створити інтерфейс Sorter з методом List<Integer> sort(List<Integer> list); 
3.1. Створити класи, що його реалызують: BubbleSorter(бульбашка), InsertionSorter(вставки), ShellSorter(сортування за Шеллом), QuickSorter(швидке сортування), DefaultSorter(використовуючи стандартний джавовський сортувальник) 
4. Створити клас TestsRunner, що буде використовувати генератори і сортувати отримані ними массиви засікаючи час. Сортувати для розмірів 10, 100, 1000, 10 000. 
4.1. Для створення TestRunner використати Reflection від гугла, що буде шукати всіх наслідників Generator і всіх наслідників Sorter. Таким чином зробити запуск всіх сортувальників на всіх типах массивів і для всіх розмірів 
5. Зробити вивід у форматі <SorterName> - <GeneratorName> - <size> - <time> 
5.1. SorterName та GeneratorName також можна буде витягнути за допомогою Reflrection
