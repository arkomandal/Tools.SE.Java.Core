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


Composition of Java Collection Frameworks:
All collection frameworks in java include the following three elements:
1. Interfaces
2. Implementation or classes
3. Collection Algorithms

Let us discuss them individually.

1. Interfaces in java:
   The main architecture of the java collection framework stands on the basis of interfaces. Interfaces are abstract data types that represent collections in the framework. Using interfaces we can manipulate collections irrespective of the way they are represented in the memory. All these interfaces are part of the utility package of java, i.e, java.util.

The root of the Collection framework interfaces is java.util.Collections. It consists of several important methods that the programmer uses in his day to day life. Some of these methods include add(), size(), remove(), etc.
Each and every other interface implements the java.util.Collection interface, for example, Set, Queue, etc. The only interface that does not implement the collection interface but is part of the framework is the Map interface.

The table below tells us about the different interfaces and their work in the Collection framework.

SL. No.	Interface	Description
1	Collection	This is the root interface and is present at the top of the Collection hierarchy and allows us to work with a group of objects.
2	List	This interface extends the Collection interface and is used to store data in the form of a list. The object of List stores elements in an ordered form.
3	Set	This interface extends the Collection interface and handles a set of data with unique elements.
4	SortedSet	This interface extends the Set interface and is used to handle the set of elements that are sorted.
5	Map	This interface does not extend any other interfaces. It is used to map the data in the form of keys and values.
6	SortedMap	This interface extends the Map interface and is used to maintain the keys in ascending order.
7	Map.Entry	This is an inner class of the Map interface that is used to represent elements(Both keys and values) on a map.
8	Enumeration	This is a legacy interface that is used to enumerate data one at a time in the collection of objects.
2. Implementation:
   Java collection framework architecture’s next component is the implemented classes. These classes are the concrete implementation of the collection interface, i.e, these classes are reusable data structures. We can use them repeatedly to create different collections in our code. Some of the most important classes are ArrayList, LinkedList, HashMap, TreeMap, HashSet, TreeSet, etc. We can even create our own customized collection classes.

Let us understand the main classes of the collection framework by the following table:

SL. No.	Class	Description
1	AbstractCollection	This class implements most of the Collection interfaces.
2	AbstractList	This class extends the AbstractCollecton and implements most of the list interfaces.
3	AbstractSequentialList	This class extends the AbstractList class. It is used to perform sequential access to a collection of elements rather than random access
4	LinkedList	This class is used to implement a linked list. This class also extends the AbstractList class.
5	ArrayList	This class is used to create a dynamic and flexible array. It extends the AbstractList class.
6	AbstractSet	This class extends the AbstractCollection class and implements most of the Set interface.
7	HashSet	This class is used to work with Hash Tables. The class extends the AbstractSet.
8	LinkedHashSet	This class allows iteration in insertion order and extends the HashSet class.
9	TreeSet	This class is used to implement the set stored in a tree. It extends the AbstractSet Class.
10	AbstractMap	This class implements most of the Map interfaces.
11	TreeMap	This class is used to implement a tree. It extends the AbstractMap Class.
12	HashMap	This class is used to implement a hash table. It extends the AbstractMap class.
13	WeakHashMap	This class is used to implement a hash table with weak keys. It extends the AbstractMap Class.
14	LinkedHashMap	This class is used to perform iteration in insertion order. This class extends the HashMap class.
15	IdentityHashMap	This class uses reference equality when comparing documents. It extends the AbstractMap class.
3. Java Collection Algorithms:
   The collection framework has several predefined algorithms that can be applied to the Collection and Map interface. These algorithms are defined as static methods and are present inside the Collection interface. These algorithms are polymorphic, i.e, they can be implemented as many times as required.

Many of these methods can throw a ClassCastException, which occurs when an attempt is made to compare incompatible types, or an UnsupportedOperationException, which occurs when an attempt is made to modify an unmodifiable collection.

The following table explains all the collection framework algorithms:

SL. No.	Method	Description
1	static int binarySearch(List list, Object value, Comparator c)	This method searches for a value in the list ordered according to c. Returns the position of value in the list, or -1 if the value is not found.
2	static int binarySearch(List list, Object value)	This method Searches for a value in the list. The list must be sorted. Returns the position of value in the list, or -1 if the value is not found.
3	static void copy(List list1, List list2)	This method copies the elements of list2 to list1.
4	static Enumeration enumeration(Collection c)	This method returns an enumeration over c.
5	static void fill(List list, Object obj)	This method assigns obj to each element of the list.
6	static int indexOfSubList(List list, List subList)	This method searches a list for the first occurrence of subList. Returns the index of the first match, or .1 if no match is found.
7	static int lastIndexOfSubList(List list, List subList)	This method searches a list for the last occurrence of subList. Returns the index of the last match, or .1 if no match is found.
8	static ArrayList list(Enumeration enum)	This method returns an ArrayList that contains the elements of an enum.
9	static Object max(Collection c, Comparator comp)	This method returns the maximum element in
c as determined by comp.

10	static Object max(Collection c)	This method returns the maximum element in c as determined by natural ordering. The collection need not be sorted.
11	static Object min(Collection c, Comparator comp)	This method returns the minimum element in c as determined by comp. The collection need not be sorted.
12	static Object min(Collection c)	This method returns the minimum element in c as determined by natural ordering.
13	static List nCopies(int num, Object obj)	This method returns num copies of obj contained in an immutable list. num must be greater than or equal to zero.
14	static boolean replaceAll(List list, Object old, Object new)	This method replaces all occurrences of old with new in the list. Returns true if at least one replacement occurred. Returns false, otherwise.
15	static void reverse(List list)	This method reverses the sequence in a list.
16	static Comparator reverseOrder( )	This method returns a reverse comparator.
17	static void rotate(List list, int n)	This method rotates a list by n places to the right. To rotate left, use a negative value for n.
18	static void shuffle(List list, Random r)	This method shuffles (i.e., randomizes) the elements in the list by using r as a source of random numbers.
19	static void shuffle(List list)	This method shuffles (i.e., randomizes) the elements in a list.
20	static Set singleton(Object obj)	This method returns obj as an immutable set. This is an easy way to convert a single object into a set.
21	static List singletonList(Object obj)	This method returns obj as an immutable list. This is an easy way to convert a single object into a list.
22	static Map singletonMap(Object k, Object v)	This method returns the key/value pair k/v as an immutable map. This is an easy way to convert a single key/value pair into a map.
23	static void sort(List list, Comparator comp)	This method sorts the elements of a list as determined by comp.
24	static void sort(List list)	This method sorts the elements of the list as determined by their natural ordering.
25	static void swap(List list, int idx1, int idx2)	This method exchanges the elements in the list at the indices specified by idx1 and idx2.
26	static Collection synchronizedCollection(Collection c)	This method returns a thread-safe collection backed by c.
27	static List synchronizedList(List list)	This method returns a thread-safe list backed by a list.
28	static Map synchronizedMap(Map m)	This method returns a thread-safe map backed by m.
29	static Set synchronizedSet(Set s)	This method returns a thread-safe set backed by s.
30	static SortedMap synchronizedSortedMap(SortedMap sm)	This method returns a thread-safe sorted set backed by sm.
31	static SortedSet synchronizedSortedSet(SortedSet ss)	This method returns a thread-safe set backed by ss.
32	static Collection unmodifiableCollection(Collection c)	This method returns an unmodifiable collection backed by c.
33	static List unmodifiableList(List list)	This method returns an unmodifiable list backed by the list.
34	static Map unmodifiableMap(Map m)	This method returns an unmodifiable map backed by m.
35	static Set unmodifiableSet(Set s)	This method returns an unmodifiable set backed by s.
36	static SortedMap unmodifiableSortedMap(SortedMap sm)	This method returns an unmodifiable sorted map backed by sm.
37	static SortedSet unmodifiableSortedSet(SortedSet ss)	This method returns an unmodifiable sorted set backed by ss.
Code to explain the use of algorithms:

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
The output of the above code:

List sorted in reverse: 1000 15 2 -2
List shuffled: 15 -2 2 1000
Minimum: -2
Maximum: 1000
As we can see how the use of algorithms can make programs short and simple.

Java Iterator Interface in Collection Framework:
There is no point in storing data using collections if we can’t cycle through them. Java provides us with a very simple interface to do this, known as Iterator or ListItertor, depending upon what type of collection needs to be iterated. Iterator enables you to cycle through a collection to obtain or remove elements.

ListIterator extends the Iterator interface to allow bidirectional traversal of a list and the modification of elements. These are very useful especially in the case of various operations that require constant cycling through the list.

Code to understand Iterator implementation:

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
The output of the above code:

Original contents of al: D A T A F L A I R
Modified contents of al: D+ A+ T+ A+ F+ L+ A+ I+ R+
Modified list backwards: R+ I+ A+ L+ F+ A+ T+ A+ D+
Java Comparator Interface in Collection Framework:
The comparator interface gives us the provision to compare two instances of a class or two elements in a collection of data. The Comparator interface consists of two methods: the compare method and the equals method.

The compare method:
int compare(Object obj1, Object obj2)
The compare method returns:

negative if obj1 < obj2
zero if obj1 == obj2
positive if obj1 > obj2
The equal method:
boolean equals(Object obj)
The equal() method returns true if the equality satisfies the object.

Code to understand comparator implementation:

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
The output of the above code:

Bruno, Darcy, Oreo, Scooby, Tommy,
Tommy : 1, Bruno : 2, Scooby : 3, Darcy : 4, Oreo : 10,
Advantages of Java Collection Framework:
Java Collection framework has several advantages, few of them include:
1. Consistent API: Java collection framework consists of a consistent API that has all the essential arrangement of interfaces like collections, Lists, Set, List, etc, and classes that implement the interfaces like ArrayList, Vector, etc.

2. Reduce Programming Exertion: The collection framework provides various provisions to implement an operation at an ease, this helps the programmer to focus on the main task, rather than the basic operations.

3. Increases Program Quality and Speed: The collection Framework helps to increase the execution speed and quality by reducing program size and letting the programmer handle data at an ease.

Choosing the Right Collection
Picking the appropriate collection for your data structure is a vital step in working with the Java Collection Framework. Here are some additional factors to consider when making your choice:

1. Thread Safety: If your program involves multiple threads working with the same collection concurrently, you’ll need to consider thread safety. The Java Collection Framework offers thread-safe versions of some collection classes, such as ConcurrentHashMap and CopyOnWriteArrayList. These classes ensure that data modifications by one thread won’t corrupt operations by another thread.

2. Iteration Needs: How you plan to iterate over your collection can also influence your decision. For example, if you need random access to elements, an ArrayList might be suitable. But if you only need to iterate in the order elements were added, a LinkedList could be more efficient.

Conclusion:
No doubt that the Java Collection Framework makes the programmer’s task simpler. Not just that, by reducing the hassles of writing the operations manually, the java framework enables programmers to solve bigger problems at an ease. This is the reason why the Java collection framework is so important. In this article, we saw the basic structure of the Java collection framework, as well as how to implement a few of the important methods.