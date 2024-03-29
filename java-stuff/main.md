# Java self-learn notes

Book : [A Concise and Practical Introduction to Prgramming Algorithms in Java by Frank Nielsen](https://www.amazon.in/Practical-Introduction-Programming-Algorithms-Undergraduate/dp/184882338X)

# Chapter 1
### Hello World
- File name and `class` name should be same
- Workflow
    - Type/Edit program
    - Compile: `javac program.java`
    - Run/Execute: `java program`

Section 1.2.2: [HelloWorld program](./java-files/HelloWorld.java)  
>    terminal: `javac HelloWorld`   
    ```error: error: Class names, 'HelloWorld', are only accepted if annotation processing is explicitly requested```  
    To fix, run with `.java` : `javac HelloWorld.java`

### Implicit casting
Consider example:
```java
double  qq=2/3      //A
double qqq=2/3.0    //B
```
In $A$, first the operation is done with integers `2 & 3`, the output is casted into double, giving `0.0` as output. In $B$, since `3.0` is `double`, `double division` will occur and output will then be given to double variable `qqq` as `0.6666666666`

### Constants
Section 1.3 : [Mathematical functions](./java-files/MathFunction.java)  
 Constants in java are defined using `final` keyword, as they are immutable.

>    When we declare a variable as `final`, it means that the reference to the object it points to cannot be changed once initialized. However, it doesn't mean that the object itself (if it's mutable) cannot be modified.  
In the code file, the declaration of `One` as local variable in method overshadows the one declared at `class`. Hence, `Three2` outputs `4`.

