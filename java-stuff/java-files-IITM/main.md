Contents:
1. [Week 1](#week-1)

# Week 1
- Operations are performed in CPU and information is stored in memory location, to perform operation a copy of information is created and result after operation is stored back in new memory location.
- We use high level languages to give instructions to computers. Compilers and interpreters are used to convert HL to LL machine language: Compilers convert entire program at once and interpreters converts one sentence at a time. This means tradeoff between expressiveness and efficiency.
- Two styles of writing programmes: Imperative (explicitly program the instrcutions) vs Declarative (exploit some chracteristic such as inductive properties).
- There are two types of languagse , static typed (Java) and dynamic (Python). In static typed languages we can declare the type of variables and objects before at the time of initialisation. With static analysis, , compilers can detect type erorors at compile time and may also optimize code execution. Dynamic typing would catch these errors at run time. Static type languages help connect to the conept we are trying to express through code and being more efficient.
- __Memory management:__  
    - There are three things to worry about: local variables, global variables, dynamic data types (e.g. linked lists)  
    - Lifetime of a variable can exceed scope. "Hole in scope" refers to the situation when a variable value is still stored but inaccessible at the moment. Lifetime of a variable is the time for which it has memory allocated in the memory stack.
    - 