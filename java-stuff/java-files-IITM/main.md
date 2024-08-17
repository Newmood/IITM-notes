# Contents:
1. [Week 1](#week-1)  : Programming, memory, absraction-modularity, OOPs
2. [Week 2](#week-2) : Basics of Java, control flow, class & objects, I/O
3. [Week 3](#week-3) : Class hierarchy, Inhertiance, Subtype, Polymorphism
3. [Week 4](#week-4) : Interfaces



# Week 1
- Operations are performed in CPU and information is stored in memory location, to perform operation a copy of information is created and result after operation is stored back in new memory location.
- We use high level languages to give instructions to computers. Compilers and interpreters are used to convert HL to LL machine language: Compilers convert entire program at once and interpreters converts one sentence at a time. This means tradeoff between expressiveness and efficiency.
- Two styles of writing programmes: Imperative (explicitly program the instrcutions) vs Declarative (exploit some chracteristic such as inductive properties).
- There are two types of languagse , static typed (Java) and dynamic (Python). In static typed languages we can declare the type of variables and objects before at the time of initialisation. With static analysis, , compilers can detect type erorors at compile time and may also optimize code execution. Dynamic typing would catch these errors at run time. Static type languages help connect to the conept we are trying to express through code and being more efficient.

## Memory management:
- There are three things to worry about: local variables, global variables, dynamic data types (e.g. linked lists)  
- Lifetime of a variable can exceed scope. "Hole in scope" refers to the situation when a variable value is still stored but inaccessible at the moment. Lifetime of a variable is the time for which it has memory allocated in the memory stack.
- When a function is called, a new activation record is added to the memory stack. This activation record called memory stack frame contains information about function call. The local variables gets memory allocatied on the stack within the function's activation record. This activation record also contains control link (pointer, points to activation record of the parent activation record), return value link (tells where to store the result in the record). Global variables are stored separately from stack or heap, exist in the data segment until the program ends.
- For dynamic data types like linked lists, memory is allocated dynamically during run time and is stored in the heap. Additionally these dynamic variable are anonymous accessed through static variables in stack. The memory stored like this must be explicitly deallocated otherwise it creates "memory leaks". IN some languages this is done manually using functions like `malloc()` or `free()` in C. In java or python, automatic garbage collections.

A typical process memory layout looks like this:    
|       |   
|:-----:|  
| Stack |  
|...| 
| Shared libraries | 
|...|   
| Heap |
| BSS segment |
| Data segment |
| Text segment |
| OS kernel |  

When the function ends, its activation record is popped off from the stack. Stack ha LIFO structure, heap has none in particular.

## Abstraction and Modularity:
- Abstraction is hiding unnecessary implementation details and focusing on essential characteristics. Such as Abstract data Types (ADTs) prodividing clean interaction with data, hiding implementation details.
- Modularity is breaking a task to smaller modules such that each module perform a specific function and can be developed, tesetd and maintained separately.
- Solve complex tesks:
    - Top-down : Refine the high level description to smaller subtasks or modules.
    - Bottom-up : Combine simple small tasks and to accomplish a high level task.
- Modular description:
    - Interface : An interface is a set of rules for different modules to interact with each other. Typically includes function declaration that outlines what functionalities are available and how they can be accessed.
    - Specification :  Defines the input/output behavior or properties that a module is expected to exhibit including error handling, performance requirements or other constraints.
- Data abstraction is implemented through the use of ADTs. An abtract data type defines a set of operations that can be performed on a data structure without revealing the underlying implementation. Example: Stack supports push, pop and peek but the implementation (arrays or linked list) is hidden fromt the user.
- Object oriented programming.

## Object oriented programming
Usually, we concentrate on control flow, defines functions and use data types is used to keep track of values and state. OOPs focuses on data that is needed to maintain and manipulate.
Objects are similar to abstrat datatypes. Distinguishing features of object-oriented programming:
- Abstraction : Public intergace, private implementation
- Subtyping : If a method is defined on `B` and `A` is a subtype of `B`, every object of `A` also supports the method.
- Dynamic Lookup : Each of such sub-object has its own action invoked using same operation. The action specfically, is determined at run time. (different from overloading). (A variable `v` of type `B` can refer to an object of subtype `A`. Static type of `v` is `B` but method implementation depends on run-time type `A`.)
- Inheritance : Different from subtype. Subtype supports all functions defined on parent type. Here, it inherits specific methods. Helps in code reuse.

Inheritance is a relationship of implementations while Sub-type is a relationship of interfaces.

Example: `deque` supports add and delete from both ends. `stack` is FIFO and `queue` is LIFO. We cannot implement `stack` and `queue` as subtype from Deque. We can inherit from `deque`. `deque` instead can be subtype of stack and queue, since it supports the functions defined on both, the other way round is not true.


### Classes and Objects:
- Two step process: Define a class then objects.
    - Class : A template describing the instance variables and methods for an ADT.
    - Object : An object is an concrete instance of a class.  

    Hierarchy of clasess are used to implement subtypes and inheritance. Constructors are used during class initialisation defining instance variables.
- As we should separate public intergace from private implementation, Java helps us enforce such habit. This helps catch bugs early through type checking,i.e. static checking.
- Sending a message to an objet refers to asking an object to execute a function on itself.

# Week 2
## Hello World
```java
public class helloworld{
    public static void main(String [] args){
        System.out.println("hello world");
    }
}
```
- In OOPs theory, every function must reside in a class.
- `public` modifier specifies visbility.
- `main()` is a designated function name that gets called by default. IT is available to run from outside the class.
- signature of `main()` : That is the input and output. Input is array of strings (`Strings[] args`) and with no output, return type is `void`
- The `main()` method is defined with a `void` return type because it does not need to return any value to the JVM.
- The `static` keyword allows calling the main method without using any object.


A java program is a collection of classes and each class is defined in a separated file with the same name of the class. The command `javac filename.java` compiles the program to JVM (Java Virtual Machine) and creates bytecode `filename.class`. Then it is interpreted with the command `java filename`

## Basic datatypes
Primitive scalar types: `int, long, short, byte, float, double, char, boolean`  
[See size of primitive datatypes](https://cs-fundamentals.com/tech-interview/java/how-to-find-size-of-a-datatype-in-java)

- Must declare variables before using (typed language)
- Single quotes denote chars double quotes denote string in java
- Use `final` keyword for a variable to be constant.  
Example : `final float pi=3.1415927f`
- JVM allocates the memory to variables.
- Incrementing and decerementing as `a++;`, `b--;` respectively.
- Shortcut operations: `a+=2` and `b*=2`.

### Strings and Arrays
Strnig is a built in class, denoted by enclosed in double quotes. `String s= "Hello";`
- String are immutable, changing the strings creates a new object.

Arrays are also objects. Decrlaration : add `[]`. Example : For array of ints: 
``` java
int[] a;
a = new int[100]
```

For length use : for array, `a.length` and for string `s.length()`.

## Control flow
### if-else:
- `if (c1){...} else if(c2){...} else{...}`

### while loops:
- `while(c){...}` : If body is single statement braces are not needed. 
- `do {...} while(c)` : Always runs one iteration. Sometimes useful such as in case of checking conditions on interactive user inputs.

### for loop
- `for (init; cond ; upd) {...}`
    - `init` is initialization
    - `cond` is termination condition
    - `upd` is iter var update

For iterations use `for` instead of `while`, better because of local scoping.

### switch cases
```java
public static void printsign(int v){
    switch(v){
        case -1: {
            System.out.println("Negative");
            break;
        }
        case 1: {
            System.out.println("Positive");
            break;
        }
        case 0: {
            System.out.println("Zero");
            break;
        }
    }
}
```
- Default behaviour is to execute every case, which is why we use `break`.
- case values cannot be conditional expressions.

## Defining classes and objects
- `class` (class name same as filname)
    - `public` modifier for visibility
    - default visibility is public to the package  (all classes in same directory form same package)
- creating objects : `new` creates a new object 
- `this` is a reference to current object
- _Accessor_ (reports about instance vars) and _mutator_ (updates instance vars) methods
- Java allows function overloading - same name different signatures (Date function below)
- Within objects of same class, private instance variables are visible.
- If we do, `d1=d2` then `d1` and `d2` are two names for the same object instead of different objects. To differentiate we need to do deep copy.


```java
public class Date {
    private int day, month, year;
    public void setDate(ind d, int m, int y){
        day = d;
        month = m ;
        year = y;
    }

    public void Usedate(){
        Date d;
        d= new Date();
    }

    public int getDay(){ // accessor
        return(day);
    }
    
    public int getMonth(){ // accessor
        return(month);
    }
    
    public int getYear(){ //accessor
        return(year);
    }

    public Date(int d, int m, int y){ // constructor with same name as class
        day = d; month =m; year = y;
    }
    public Date(int d, int m){ // function overloading
        this(d,m,2021);
    }

    public Date(Date d){ // copy constructor
        this.day = d.day; this.month = d.month; this.year = d.year;
    }

    public void UseDate(){
        Date d1,d2;
        d1 = new Date(12,4,1954);
        d2 = new.Date(d1);
    }
}
```

## Input/Output in Java
### reading input
```java
console cons = System.consol();
String username = cons.readLine("user name: ");
char [] passwd = cons.readPassword("Password : ");
```
- Using console class is a way for inputs
- `readLine` : returns a string
- `readPassword` : does not echo input, returns an array of `char`

```java
Scanner in = new Scanner(System.in);
String name = in.nextLine();
int age = in.nextInt();
```
- `Scanner` class allows more granular control, parsing as different data type available. `readPassword` not available.

### generating output
- For print, `System.out.print(arg)` and new line after print `System.out.println(arg)`
- Formatted output `System.out.printf(arg)`

# Week 3

## More on OOPs
OOP emphasizes data over algorithms improving system organization, debugging and scalability through encapsulation and class relationships.

- **Data-centric approach:** OOP prioritizes data structures that is to be manipulated and then define algorithms/methods to do so. Compared to structured programming where first we think about what program should do as fntions and then design data structures to support those functions.
- **Organization:** In sturcutred programming a series of procedures or functions are defined leading to large number of global procedures acting on shared data. While in OOPs, encapsulation is done for both data and methods on them and have a more of a modular structure.
- **Dependencies:** In structures programming methods could be depended on global data leading to conflicts. While in OOPs, change to once class without affecting others can be done.
- **Inheritance and Polymorphism:** In OOPs, new classes could be created on existing and hence extending and defining more functions, promoting code reuse and reduce duplication, establish parent-child relationship between classes forming hierarchies while also facilitating polymorphism.

**Polymorphism** : the ability of different classes to be treated as instances of the same class through a common interface. (allowing objects of the subclass to be treated as objects of the superclass.)

## Subclasses and Inheritance
- A subclass extends a parent class and inherits instance variables and methods from the parent class.
- A subclass can add more instance variables and methods and can also override methods. Subclasses however cannot see private components of parent class
- **Constructor chaining:** Use `super()` to invoke parent class constructors. For example:
```java
public class Employee{
    public Employee(string n, double s){
        name=n; salary=s;
    }
    public Employee(string n){
        this(n,500.00);
    }
}
public class Manager extends Employee{
    public Manager(String n, double s, String sn) { 
        super(n, s); 
        this.secretary = sn; 
    }
}
```
**Overloading :** It occurs when multiple methods in the same class have the same name but different parameter lists. The method called is determined at compile-time based on the argument types.

**Overriding :** Occurs when a subclass provides a specific  implementation for  method that is already defined in the superclass witht he name same signature. This enables _dynamic dispatch_ where the overridde method in the subclass is called based ont he runtime of the object.

**Dynamic Dispatch :** A runtime mechanim in OOP that selects the appropriate metod implementation to invoke based on the actual object's type rather than the reference type. It enables polymorphism by ensuring that the overrideden method in a subclass is executed, even when accessed through a superclass reference, allowing for flexible and extensible code behaviour.

All of these — overloading, overriding, and dynamic dispatch — are ways to implement polymorphism in object-oriented programming.  

### Type casting
Suppose in our example earlier `Manager` has `setSecretary` function but we want invoke it on `e` as `e.setSecretary()` where e is:
```java
Employee e = new Manager(...)
```

we can do this by type casting, converting `e` to `Manager`, first as:
```java
Employee e = new Manager(...)
((Manager) e).setSecretary(s)
```

Type casting is used for basic data types as well, as given in [casting rules here.](../main.md#casting-rules)


### Notes:
1. Superclass constructors cannot be overloaded and overridden in the subclass.  
    - *Overloading :* Super class constructors can be overloaded within the superclass itself. Subclass an call a superclass constructor using `super()`, but it cannot overlad the superclass constructor directly, can dfine its own cosntructors.
    - *Overriding :* Constructors cannot be overriden in subclasses, overriding applies to methods. Each class has its own constructors.
2. Methods can be overloaded with different number, types or order of parameters.

Example code snippet:
```java
public class A {
    void show() {
        System.out.println("Show without parameters");
    }
}

public class B extends A {
    @Override
    void show() {  // Overriding the show() method from class A
        System.out.println("Show in class B");
    }

    void show(int a) {  // This is an overloaded method
        super.show();  // Calls the show() method from class A
        System.out.println("Show with int parameter");
    }

    public static void main(String[] args) {
        A ob = new B();  // Polymorphic behavior
        ob.show();  // This will call the overridden show() method in class B
    }
}
```

## Class Hierarchies

### Multiple inheritance
Multiple inheritance is when a class inherits from more than one superclass.  Java does not support this due to _diamond problem_ (where two parent classes could methods with same signature raising ambguity in the inherited methods by child.) It is allowed in C++, Python, Java instead uses interface to achieve similar functionality.

### Overriding functions
- Suppose we have a `Date` class and wish to use `equals()` to compare object state, te following will not work:
```java
public boolean equals(Date d) {
	return this.day == d.day && this.month == d.month && this.year == d.year;
}
```

- `boolean equals(Date d)` does not override `boolean equals(Object o)`We have to instead cast it as date type first:

```java
public boolean equals(Object d){
    if (d instanceof Date){
        Date myd = (Date) d;
        return ( 
            (this.day==myd.day) && (this.month==myd.month) && (this.year==myd.year)
        );
    }
    return false;
}
}
```

## Subtypes and Inheritance
Class hierarchy represents both subtyping and inheritance.
Consider the example of the following data types:
- `queue` with methods `nset-rear`, `delete-rear`
- `stack` with methods `insert-front`, `delete-front`
- `deque` with methods `insert-front`, `delte-front`, `insert-rear`, `delete-rear`


### Subtype:
- Compatibility of interfaces. 
- If `B` is a subtype of `A`, then every function that can be invoked on object of type `A` can also be invoked on object of type `B`
- `deque` has more functionalities and is a subtype of both `stack` and `queue`.

### Inheritance
- Reuse of implementations
- `B` inherits from `A` if some functions for `B` are written in terms of funtions of `A`
- Both `queue` and `stack` inherit from `deque`

Food for thought : Given "A tree is a connected acyclic graph.", the true relation is _'Graph as the main type and the tree as the subtype.'_

## Java modifiers
- Java uses many modifiers in declarations, to cover different features of object-oriented programming
- `public` vs `private` to support encapsulation of data
    - Usually instance variables are `private` and methods are `public`
- `static`, for entities defined inside classes that exist without creating objects of the class
- `final`, for values that cannot be changed. `final` method cannot be overridden by subclass.
- These modifiers can be applied to classes, instance variables and methods
- - Use `private static` instance variables to maintain bookkeeping information across objects in a class. Example global serial number, count number of objects created, profile method invocations etc.
- Modifiers `static` and `final` are orthogonal to `public` or `private`.

# Week 4
we can use class hierarchy to gorup togehter related classes, providing a structure where objects of different types can be organized under a common parent. For example, geometric shapes like circles, squares, and rectangles can be grouped under a common abstract parent class `Shape`.

## Abstract Classes
- Abstract Method : An abstract method is defined without a body in the parent class forcing subclasses to implement (respective to their context). For example, `perimeter` method in abract class `Shape`.
```java
public abstract class Shape {
	...
	public abstract double perimeter();
	...
}
```
- Abstract Class : A class containing none, one or many abstract methods. Abstract classes cannot be instantiated directly; we cannot create objects of an abstract class type. However, we can declare variables of an abstract class type, which can hold references to objects of its concrete subclasses. Abstract classes may also contain concret methods.

```java
Shape shapearr[] = new Shape[3];
int sizearr[] = new int[3];

shapearr[0] = new Circle(...);
shapearr[1] = new Square(...);
shapearr[2] = new Rectangle(...);

for(int i = 0; i < 3; ++i) {
	sizearr[i] = shapearr[i].perimeter()
	// Here, each shapearr[i] calls the appropriate method
	...
}
```

- Abstract classes can also be used to define capabilities that must be implemented by subclasses. (e.g. defining `compareTo` for enabling generic functions like sorting.)
```java
public abstract class Comparable {
	public abstract int cmp(Comparable s);
	// return -1 if this < s
	// return 0 if this == s
	// return 1 if this > s
}
```
```java
public class SortFunctions {
	public static void quicksort(Comparable[] a) {
		...
		// Code for quicksort goes here
		// Except that to compare a[i] and a[j], we use a[i].cmp(a[j])
	}
}
```
```java
public class Myclass extends Comparable {
	private double size;  // Quantity used for comparison

	public int cmp(Comparable s) {
		if(s instanceof Myclass) {
			// Compare this.size and ((Myclass) s).size
			// We have to cast in order to access s.size
		}
	}
}
```

## Interfaces: A Specialized Abstract Class
- Interface: A type of abstract class with no concrete methods. All methods are abstract and public.
- Multiple Inheritance: A class can implement multiple interfaces, inheriting behaviors without method conflicts.
- Implementation: A class implements an interface by providing concrete methods, adhering to a defined contract.

```java
public interface Comparable {
	public abstract int cmp(Comparable s);
}
```
```java
public class Circle extends Shape implements Comparable {
	public double perimeter() { ... }
	public int cmp(Comparable s) { ... }
	...
}
```

> **NOTE: One we can extend only one class, but can implement multiple interfaces.** (This is workaround for not allowing multiple inheritance as seen earlier.)

## Private Classes
An object can have nested objects as instance variables and the structure of these nested objects should not be exposed. Private classes allow an additional degree of data encapsulation.

We can combine private classes with interfaces to provide controlled access to the state of an object

## Controlled interaction with Objects
Combining private classes with interfaces in Java allows for controlled object interactions, encapsulates implementation details, enforces access restrictions, and supports state management while maintaining a clear contract through the interface.

Consider a railway reservation system where querying seat availability (getStatus(int trainNo, Date date)) could be misused by bots, leading to potential denial-of-service attacks.

To mitigate misuse, the system can require user login before making queries. However, changing method signatures to include user credentials is impractical instead better encapsulate. Instead, stateful objects that maintain login status and track user interactions provide a better solution.

```java
public interface QIF {
	public abstract int getStatus(int trainno, Date d);
}

public class RailwayBooking {
	private BookingDB railwayDB;
	public QIF login(String u, String p) {
		QueryObject qobj;
		if(validLogin(u, p)) {
			qobj = new QueryObject();
			return qobj;
		}
	}

	private class QueryObject implements QIF {
		private int numQueries;
		private final int QLIM;

		public int getStatus(int trainno, Date d) {
			if(numQueries < QLIM) {
				// Respond, incremement numQueries
				...
			}
			...
		}
	}
}
```

## Callbacks
A callback is a mechanism where a method (callback method) is passed to another method and is invoked after a specific event or operation completes. Callbacks are useful for event handling, asynchronous programming, and implementing custom behaviors in frameworks.  
Video link : [Callbacks](https://youtu.be/CKjGnZCvlng)

## Iterators
Video link : [Iterator](https://youtu.be/BG_Btui0K1o)