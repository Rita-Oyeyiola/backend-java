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

