JDK - Java development kit
JRE - Java runtime environment
JVM - Java virtual machine

Import java.lang - lang is a basic package


Methods present in scanner class are:
nextInt()
nextFloat()
nextDouble()
next()
nextLine()
nextByte()
nextShort()
nextLong()
nextBoolean()


public class ReadKeyboard {
        public static void main (string arg[])
        {
        Scanner sc = new Scanner(system.in);
        int x = sc.nextInt();
        System.out.println(x);
    }
    }



JAVA BUZZWORDS/FEATURES
- Simple
- Secure i.e. JVM has security manager which verify java code.
- Portable i.e. it can run everywhere
- Object oriented
- Robust i.e. they do not crash even in worst condition
- Multithreaded
- Architecture neutral i.e. the common architecture is von-nueman
- Interpreted i.e. java use interpreted as JIT compiler which enable it work fast
- Distributed
- High performance
- Dynamic




OPERATION AND EXPRESSION
- Arithmetic operator
*,-,+,/
- coercion; converting data types
e.g. byte + byte = int
     short + byte = int
    short + short = int
    int + float = float
    long + float = float
    char + short = int
    float + double = double
    long + double = double

- Increment/decrement
e.g. int x=5;
    x++ , x=6
 


CONDITIONAL STATEMENT
- Relational operator: They are use in comparing the value and data.
e.g. <,>,<=,>=,==,!=
They return boolean value.
int a=5, b=10, c=15
a < b - true
b > c - false
a == c - false
a != c  - true

-Logical operator: They are use in combining two conditional statement.
e.g. && - and, ||, !.

A       B       A&&B        A||B        !A
T       T       T           T           False
T       F       F           T           F
F       T       F           T           T
F       F       F           F           T

SWITCH CASES
The data types switch cases accept are byte, short, int, char, string.


LOOPS
They are repeated block of statements
- while loop
- do while loop
- for loop
- for each loop

- while loop: It checks the condition before executing the process.
- do while loop: It goes through the process before checking the condition.
- for loop: It depends on the number of time you want to get the result while meeting the conditions.
            
  for(initialization, condition, updation(i.e. increment/decrement)){
s
  }

    for(int i=1 i>=10 i++){
    System.out.println(i);

}
NB: You can declare multiple variable but their data type should be the same.
- Nested loop: It means having a loop inside another loop.


ARRAY
It means collection of similar elements.
Int A [] = new int [s]

Arrays are created in heap.

int A[] = {2,4,6,8,10}
NB: For each loop is use for an array.

How to declare an array:
int A[] = new int [10]

int B[] = {1,2,3,4,5}

int C []

C = new int [10].



METHODS
They are know for functionality e.g. length(), sub String();
It is a function associated with an object and defines a particular behaviour of that object.
Methods are typically defined within a class, they operate within that class.

A method implement behaviour for it class e.g. Student(), Book()

Methods are reusable within other method in the same class.

Method support polymorphism i.e. allowing methods with the same name to have different implementations in different classes.



OOP(Object-oriented programming)
It is centered around the concept of object which are instances of class.
It organizes the code into modular units(object) that can interact with each other.

One of it key principle is encapsulation which means bundling data and methods into single unit i.e. objects











