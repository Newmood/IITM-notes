Contents:
1. [Week 1](#week-1)  : Programming, memory, absraction-modularity, OOPs
2. [Week 2](#week-2) : Basics of Java, control flow, class & objects, I/O
2. [Week 3](#week-3) : 


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