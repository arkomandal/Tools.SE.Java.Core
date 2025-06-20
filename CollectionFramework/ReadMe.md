# Collection Framework
A framework is a set of classes and interfaces which provide a ready-made architecture.

## Collection in Java:
A collection is a group of individual data, that are grouped together to form a single unit. Collections are containers that hold multiple data as a single unit. For example, if we store the names of all the employees in a single list and name it as Employee, it will form a collection.
The two root interfaces of java collection class are:

* Collection interface(java.util.collection)
* Map interface(java.util.Map)

## Collection Framework in Java:

Collection Framework in Java is an architecture using which we can represent a collection of interfaces and classes. It is used in storing, maintaining and handling data effectively.
The collection framework makes manipulation of the collection easier. This makes the task of a programmer simpler.

## Hierarchy of Collection Framework in Java:

![hierarchy-of-collection-framework-in-java?](public/hierarchy-of-collection-framework-in-java.webp)

## Need for Java Collection Framework:

Java collection framework was introduced from Java 1.2 version, before that java had some ad hoc classes like vector, properties, stack, hash tables, dictionary, etc to store and handle data. These classes were useful but did not have the same interface,i.e, the technique of storing data was different for different classes. That is why the collection framework was introduced in java 1.2 to make these classes unified.

## Goals of Collection Framework in Java:

To Increase the efficiency of the fundamental collections like dynamic arrays, trees, linked lists and hash tables, etc.
To increase compatibility by letting all the collections work in an identical manner.
For increasing flexibility by easily extending and/or adapting a collection.
To increase the efficiency of the code due to the high optimization of the collection framework.
To increase the uniqueness of data by providing the set interface.
For making the organization of data easier by storing the data in key and value pair using the Map interface.
To increase flexibility of arrays by using the ArrayList class.


## Composition of Java Collection Frameworks:

All collection frameworks in java include the following three elements:
1. Interfaces
2. Implementation or classes
3. Collection Algorithms

Let us discuss them individually.

## 1. Interfaces in java:
The main architecture of the java collection framework stands on the basis of interfaces. Interfaces are abstract data types that represent collections in the framework. Using interfaces we can manipulate collections irrespective of the way they are represented in the memory. All these interfaces are part of the utility package of java, i.e, java.util.

The root of the Collection framework interfaces is java.util.Collections. It consists of several important methods that the programmer uses in his day to day life. Some of these methods include add(), size(), remove(), etc.
Each and every other interface implements the java.util.Collection interface, for example, Set, Queue, etc. The only interface that does not implement the collection interface but is part of the framework is the Map interface.

The table below tells us about the different interfaces and their work in the Collection framework.

---

| **SL. No.** | **Interface**        | **Extends**       | **Purpose / Description**                                                                                                            |
| ----------- | -------------------- | ----------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| 1           | `Collection<E>`      | —                 | **Root** of the collection hierarchy. Defines basic methods like `add()`, `remove()`, `size()`, `iterator()`.                        |
| 2           | `List<E>`            | `Collection<E>`   | Ordered collection (sequence). Allows **duplicate elements**. Access by index. Implementations: `ArrayList`, `LinkedList`, `Vector`. |
| 3           | `Set<E>`             | `Collection<E>`   | Unordered collection of **unique elements**. No duplicates allowed. Implementations: `HashSet`, `LinkedHashSet`, `TreeSet`.          |
| 4           | `SortedSet<E>`       | `Set<E>`          | Set with **natural ordering** or a custom comparator. Sorted version of Set. Implementation: `TreeSet`.                              |
| 5           | `NavigableSet<E>`    | `SortedSet<E>`    | Extends `SortedSet` with navigation methods (`lower()`, `floor()`, `ceiling()`, `higher()`).                                         |
| 6           | `Queue<E>`           | `Collection<E>`   | Used to hold elements prior to processing. **FIFO** by default. Implementations: `LinkedList`, `PriorityQueue`.                      |
| 7           | `Deque<E>`           | `Queue<E>`        | **Double-ended queue**. Supports insert/remove from both ends. Implementations: `ArrayDeque`, `LinkedList`.                          |
| 8           | `Map<K, V>`          | —                 | Stores key-value pairs. **No duplicate keys**, allows one null key. Implementations: `HashMap`, `TreeMap`, `LinkedHashMap`.          |
| 9           | `SortedMap<K, V>`    | `Map<K, V>`       | Map with keys in **sorted order**. Implementation: `TreeMap`.                                                                        |
| 10          | `NavigableMap<K, V>` | `SortedMap<K, V>` | Extends `SortedMap` with navigation methods (`floorEntry()`, `ceilingEntry()`, etc).                                                 |
| 11          | `Iterator<E>`        | —                 | Used to **traverse collections**. Methods: `hasNext()`, `next()`, `remove()`.                                                        |
| 12          | `ListIterator<E>`    | `Iterator<E>`     | For **bidirectional traversal** of lists. Methods: `previous()`, `nextIndex()`, `previousIndex()`.                                   |
| 13          | `Enumeration<E>`     | —                 | Legacy interface for traversing collections (mostly Vectors/Hashtables). Methods: `hasMoreElements()`, `nextElement()`.              |

---

### 🔹 Interface Hierarchy Overview (Simplified)

```
Collection
 ├── List
 │    └── ListIterator
 ├── Set
 │    └── SortedSet
 │         └── NavigableSet
 └── Queue
      └── Deque

Map
 └── SortedMap
      └── NavigableMap
```

---

## 2. Implementation:
   Java collection framework architecture’s next component is the implemented classes. These classes are the concrete implementation of the collection interface, i.e, these classes are reusable data structures. We can use them repeatedly to create different collections in our code. Some of the most important classes are ArrayList, LinkedList, HashMap, TreeMap, HashSet, TreeSet, etc. We can even create our own customized collection classes.

Let us understand the main classes of the collection framework by the following table:

---

| **SL. No.** | **Class**                | **Description**                                                               |
| ----------- | ------------------------ | ----------------------------------------------------------------------------- |
| 1           | `AbstractCollection`     | Implements most of the `Collection` interfaces.                               |
| 2           | `AbstractList`           | Extends `AbstractCollection` and implements most of the `List` interface.     |
| 3           | `AbstractSequentialList` | Extends `AbstractList`. Used for sequential access rather than random access. |
| 4           | `LinkedList`             | Implements a linked list. Extends `AbstractList`.                             |
| 5           | `ArrayList`              | Creates a dynamic array. Extends `AbstractList`.                              |
| 6           | `AbstractSet`            | Extends `AbstractCollection`, implements most of the `Set` interface.         |
| 7           | `HashSet`                | Implements hash tables. Extends `AbstractSet`.                                |
| 8           | `LinkedHashSet`          | Maintains insertion order. Extends `HashSet`.                                 |
| 9           | `TreeSet`                | Implements a tree-based set. Extends `AbstractSet`.                           |
| 10          | `AbstractMap`            | Implements most of the `Map` interface.                                       |
| 11          | `TreeMap`                | Tree-based implementation of `Map`. Extends `AbstractMap`.                    |
| 12          | `HashMap`                | Hash table implementation. Extends `AbstractMap`.                             |
| 13          | `WeakHashMap`            | Hash table with weak keys. Extends `AbstractMap`.                             |
| 14          | `LinkedHashMap`          | Maintains insertion order. Extends `HashMap`.                                 |
| 15          | `IdentityHashMap`        | Uses reference equality instead of `equals()`. Extends `AbstractMap`.         |

---

## 3. Java Collection Algorithms (from `Collections` class)

The collection framework has several predefined algorithms that can be applied to the Collection and Map interface. These algorithms are defined as static methods and are present inside the Collection interface. These algorithms are polymorphic, i.e, they can be implemented as many times as required.

Many of these methods can throw a ClassCastException, which occurs when an attempt is made to compare incompatible types, or an UnsupportedOperationException, which occurs when an attempt is made to modify an unmodifiable collection.

The following table explains all the collection framework algorithms:

---

| **SL. No.** | **Method**                               | **Description**                                              |
| ----------- | ---------------------------------------- | ------------------------------------------------------------ |
| 1           | `binarySearch(List, Object, Comparator)` | Searches for value using comparator; returns position or -1. |
| 2           | `binarySearch(List, Object)`             | Searches in sorted list using natural order.                 |
| 3           | `copy(List dest, List src)`              | Copies elements from `src` to `dest`.                        |
| 4           | `enumeration(Collection)`                | Returns an enumeration over the collection.                  |
| 5           | `fill(List, Object)`                     | Replaces all elements in list with given object.             |
| 6           | `indexOfSubList(List, List)`             | Finds first index of `subList` in list.                      |
| 7           | `lastIndexOfSubList(List, List)`         | Finds last index of `subList` in list.                       |
| 8           | `list(Enumeration)`                      | Converts enumeration to `ArrayList`.                         |
| 9           | `max(Collection, Comparator)`            | Returns max element by comparator.                           |
| 10          | `max(Collection)`                        | Returns max element using natural order.                     |
| 11          | `min(Collection, Comparator)`            | Returns min element by comparator.                           |
| 12          | `min(Collection)`                        | Returns min element using natural order.                     |
| 13          | `nCopies(int, Object)`                   | Returns immutable list with repeated object.                 |
| 14          | `replaceAll(List, Object, Object)`       | Replaces all occurrences of one object with another.         |
| 15          | `reverse(List)`                          | Reverses list order.                                         |
| 16          | `reverseOrder()`                         | Returns reverse comparator.                                  |
| 17          | `rotate(List, int)`                      | Rotates list elements by n positions.                        |
| 18          | `shuffle(List, Random)`                  | Randomizes list using `Random`.                              |
| 19          | `shuffle(List)`                          | Randomizes list using default randomness.                    |
| 20          | `singleton(Object)`                      | Returns immutable set with one element.                      |
| 21          | `singletonList(Object)`                  | Returns immutable list with one element.                     |
| 22          | `singletonMap(Object, Object)`           | Returns immutable map with one key-value pair.               |
| 23          | `sort(List, Comparator)`                 | Sorts list by comparator.                                    |
| 24          | `sort(List)`                             | Sorts list by natural order.                                 |
| 25          | `swap(List, int, int)`                   | Swaps two elements in list.                                  |
| 26          | `synchronizedCollection(Collection)`     | Returns synchronized (thread-safe) collection.               |
| 27          | `synchronizedList(List)`                 | Returns synchronized list.                                   |
| 28          | `synchronizedMap(Map)`                   | Returns synchronized map.                                    |
| 29          | `synchronizedSet(Set)`                   | Returns synchronized set.                                    |
| 30          | `synchronizedSortedMap(SortedMap)`       | Returns synchronized sorted map.                             |
| 31          | `synchronizedSortedSet(SortedSet)`       | Returns synchronized sorted set.                             |
| 32          | `unmodifiableCollection(Collection)`     | Returns read-only collection.                                |
| 33          | `unmodifiableList(List)`                 | Returns read-only list.                                      |
| 34          | `unmodifiableMap(Map)`                   | Returns read-only map.                                       |
| 35          | `unmodifiableSet(Set)`                   | Returns read-only set.                                       |
| 36          | `unmodifiableSortedMap(SortedMap)`       | Returns read-only sorted map.                                |
| 37          | `unmodifiableSortedSet(SortedSet)`       | Returns read-only sorted set.                                |

---

### Code to explain the use of algorithms:
```java
package com.DataFlair.CollectionFramework;
import java.util.*;
public class Algorithms
{
public static void main(String args[]) {
LinkedList L1 = new LinkedList();
L1.add(new Integer(15));
L1.add(new Integer(2));
L1.add(new Integer(-2));
L1.add(new Integer(1000));
Comparator r = Collections.reverseOrder();
Collections.sort(L1, r);
Iterator li = L1.iterator();
System.out.print("List sorted in reverse: ");
while(li.hasNext()) {
System.out.print(li.next() + " ");
}
System.out.println();
Collections.shuffle(L1);
li = L1.iterator();
System.out.print("List shuffled: ");
while(li.hasNext()) {
System.out.print(li.next() + " ");
}
System.out.println();
System.out.println("Minimum: " + Collections.min(L1));
System.out.println("Maximum: " + Collections.max(L1));
}
}
```
The output of the above code:
```
List sorted in reverse: 1000 15 2 -2
List shuffled: 15 -2 2 1000
Minimum: -2
Maximum: 1000
```

As we can see how the use of algorithms can make programs short and simple.

## Java Iterator Interface in Collection Framework:

There is no point in storing data using collections if we can’t cycle through them. Java provides us with a very simple interface to do this, known as Iterator or ListItertor, depending upon what type of collection needs to be iterated. Iterator enables you to cycle through a collection to obtain or remove elements.

ListIterator extends the Iterator interface to allow bidirectional traversal of a list and the modification of elements. These are very useful especially in the case of various operations that require constant cycling through the list.

### Code to understand Iterator implementation:

```java
package com.DataFlair.CollectionFramework;
import java.util.*;
public class Iterators
{
public static void main(String args[])
{
ArrayList al = new ArrayList();
al.add("D");
al.add("A");
al.add("T");
al.add("A");
al.add("F");
al.add("L");
al.add("A");
al.add("I");
al.add("R");
System.out.print("Original contents of al: ");
Iterator itr = al.iterator();
while(itr.hasNext()) {
Object element = itr.next();
System.out.print(element + " ");
}
ListIterator litr = al.listIterator();
while(litr.hasNext()) {
Object element = litr.next();
litr.set(element + "+");
}
System.out.print("\nModified contents of al: ");
itr = al.iterator();
while(itr.hasNext()) {
Object element = itr.next();
System.out.print(element + " ");
}
System.out.print("\nModified list backwards: ");  
while(litr.hasPrevious()) {
Object element = litr.previous();
System.out.print(element + " ");
}
}
}
```

### The output of the above code:

```
Original contents of al: D A T A F L A I R
Modified contents of al: D+ A+ T+ A+ F+ L+ A+ I+ R+
Modified list backwards: R+ I+ A+ L+ F+ A+ T+ A+ D+
```

## Java Comparator Interface in Collection Framework:
The comparator interface gives us the provision to compare two instances of a class or two elements in a collection of data. The Comparator interface consists of two methods: the compare method and the equals method.

### The compare method:
```java
int compare(Object obj1, Object obj2)
```
The compare method returns:

negative if obj1 < obj2
zero if obj1 == obj2
positive if obj1 > obj2

### The equal method:
```java
boolean equals(Object obj)
```
The equal() method returns true if the equality satisfies the object.

### Code to understand comparator implementation:
```java
package com.DataFlair.CollectionFramework;
import java.util.*;
class Dog implements Comparator<Dog>, Comparable<Dog>
{
private String name;
private int age;
Dog() {
}
Dog(String n, int a) {
name = n;
age = a;
}
public String getName() {
return name;
}
public int getAge() {
return age;
}
public int compareTo(Dog d) {
return (this.name).compareTo(d.name);
}
public int compare(Dog d, Dog d1) {
return d.age - d1.age;
}
}
public class Example {
public static void main(String args[])
{
List<Dog> list = new ArrayList<Dog>();
list.add(new Dog("Scooby", 3));
list.add(new Dog("Bruno", 2));
list.add(new Dog("Oreo", 10));
list.add(new Dog("Darcy", 4));
list.add(new Dog("Tommy", 1));
Collections.sort(list);
for(Dog a: list)
System.out.print(a.getName() + ", ");
Collections.sort(list, new Dog());
System.out.println(" ");
for(Dog a: list)
System.out.print(a.getName() +"  : "+ a.getAge() + ", ");
}
}
```

### The output of the above code:
```
Bruno, Darcy, Oreo, Scooby, Tommy,
Tommy : 1, Bruno : 2, Scooby : 3, Darcy : 4, Oreo : 10,
```

## Advantages of Java Collection Framework:
Java Collection framework has several advantages, few of them include:
1. **Consistent API**: Java collection framework consists of a consistent API that has all the essential arrangement of interfaces like collections, Lists, Set, List, etc, and classes that implement the interfaces like ArrayList, Vector, etc.

2. **Reduce Programming Exertion**: The collection framework provides various provisions to implement an operation at an ease, this helps the programmer to focus on the main task, rather than the basic operations.

3. **Increases Program Quality and Speed**: The collection Framework helps to increase the execution speed and quality by reducing program size and letting the programmer handle data at an ease.

## Choosing the Right Collection
Picking the appropriate collection for your data structure is a vital step in working with the Java Collection Framework. Here are some additional factors to consider when making your choice:

1. **Thread Safety**: If your program involves multiple threads working with the same collection concurrently, you’ll need to consider thread safety. The Java Collection Framework offers thread-safe versions of some collection classes, such as ConcurrentHashMap and CopyOnWriteArrayList. These classes ensure that data modifications by one thread won’t corrupt operations by another thread.

2. **Iteration Needs**: How you plan to iterate over your collection can also influence your decision. For example, if you need random access to elements, an ArrayList might be suitable. But if you only need to iterate in the order elements were added, a LinkedList could be more efficient.

## Conclusion:
No doubt that the Java Collection Framework makes the programmer’s task simpler. Not just that, by reducing the hassles of writing the operations manually, the java framework enables programmers to solve bigger problems at an ease. This is the reason why the Java collection framework is so important. In this article, we saw the basic structure of the Java collection framework, as well as how to implement a few of the important methods.