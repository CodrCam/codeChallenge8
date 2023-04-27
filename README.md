# ZippedLinkedList

This Java project demonstrates how to implement a singly linked list and a method to zip two linked lists together. It includes a main class `ZippedLinkedList` that contains a `Node` class, a `LinkedList` class, and a `zipLists()` method.

## Classes and Methods

### Node

Represents a node in a singly linked list, with an integer value and a reference to the next node in the list.

### LinkedList

Represents a singly linked list, with a `head` attribute that points to the first node in the list. The class has two methods:

- `add(int value)`: Adds a new node with the given value to the end of the list.
- `zipLists(LinkedList list1, LinkedList list2)`: Takes two linked lists as input and returns a new linked list where the nodes from the input lists are alternately combined (zipped).

## How to Run

1. Compile the Java code:

```
javac ZippedLinkedList.java
```

2. Run the compiled Java class:

```
java ZippedLinkedList
```

## Testing

The project includes JUnit tests to ensure the correctness of the implementation. To run the tests, add the JUnit 5 library to your project and create a test class called `ZippedLinkedListTest.java`. The test class contains four test cases to cover the functionality of the `add()` method and the `zipLists()` method.

## License

This project is licensed under the MIT License.