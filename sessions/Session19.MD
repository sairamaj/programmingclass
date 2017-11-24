# Recap
* Learned some basic rules about variables
* Steps involving converting a problem in to programming code.
* We have missed Session 18 notes

# Static methods
Today we will be learning __static__ methods. Lets look at example and then discuss
```java
    class Math{

        int add(int num1, int num2){
            return num1+num2;
        }
    }

    class Application {
        public static void main(String[] args){
            Math m1 = new Math();
            m1.add(20,30);
        }
    }
```
If you see above we have method __add__ in __Math__ class and in order to use we have to crate object __m1__ and then call method on the object. The method __add__ does not use any class variables ( variables in the class). It takes inputs and completely operates on those input parameters to give the output. These kind of methods we can convert in to __static__ ( we will discuss what are the advantages and rules associated with this)



```java
    class Math{

        static int add(int num1, int num2){
            return num1+num2;
        }
    }

    class Application {
        public static void main(String[] args){
            Math m1 = new Math();
            m1.add(20,30);
        }
    }
```
When a method has been declared as __static__ you have 2 ways of calling this method. Either by creating object and calling method or calling on class itself like below

```java
    class Application {
        public static void main(String[] args){
            Math m1 = new Math();
            m1.add(20,30);

            // calling on class
            Math.add(20,30);
        }
    }
```

The preferred way is to call on class ( __Math.add(20,30)__). If you observe we did not create object (no __new Meth()__).  

## Try using class variables in static method.
```java
    class Math{
        int someValue;

        static int add(int x, int y){
            System.out.println("someValue is:" + someValue);
            return x+y;
        }
    }
```
you will get error __Cannot make a static reference to the non-static field someValue1__. The reason once you make __static__ the method wont exists as part of object (but it is part of class). 

## Lets see regular methods (non static)
In order to understand the difference with __static__ and without ,lets come up with some add special method where it remembers last number and keeps adding to the previous total. 

### Add special
* Input: 2   Output: 2
* Input: 3   Output: 5   ( adds previous total 2 to current 3)
* Input: 4   Output: 9   ( adds previous total 5 to current 4)
* Input: 5   Output: 14  ( adds previous total 9 to current 5)

Lets write method which does this in Math class. 

```java
    class Math{
        int previousResult = 0;

        int addSpecial(int input){
            int result = previousResult + input;    // add the current to previous number
            previousResult += result;               // remember what we gave back ( 2, 5, 9 )
            return result;                          // give the total
        }
    }

    class Application{
        public static void main(String[] args){
            Math m1 = new Math();

            int result = m1.addSpecial(2);
            System.out.println("result is:" + result);
            result = m1.addSpecial(3);
            System.out.println("result is:" + result);
            result = m1.addSpecial(4);
            System.out.println("result is:" + result);
            result = m1.addSpecial(5);
            System.out.println("result is:" + result);
        }
    }
```
When you run the above program you will see the results as __2, 5, 9, 14__

We have used class variable __previousNumber__ to keep track of what was given ( you cannot use variable in the method addSpecial as you know the variable will be dead once it sees __}__ and hence cannot use as local variable)

## Lets combine static and non static method in Math class
```java
    class Math{
        int previousNumber;

        static int add(int x, int y){
            return x+y;
        }

        int addSpecial(int input){
            int result = previousResult + input;    // add the current to previous number
            previousResult += result;               // remember what we gave back ( 2, 5, 9 )
            return result;                          // give the total
        }
    }
```
Lets create 3 objects and see in pictures what static and non static methods have it.

![staticvsnonstatic](https://github.com/sairamaj/programmingclass/blob/master/images/staticandnonstatic.png)

In above __addSpecial__ is part of each object and can access __previousNumber__ where as __add__ is part of __class__ only and cannot access __previousNumber__ as it is part of object. Think of non static methods and class variables in the same box(object) hence can use class variales.

## When do you use static?
From above observations you can see, only when methods don't access class variables , you can declare them as __static__ and you call method on __class__ ( no need to create object)

# Reuse
You use reusing the existing all the time in real life. Either you borrow from somebody and use it or use the one you made previously. It is the same in programming. You want to use which was done already and may take existing one and change a little bit and then use it.

There were 2 kinds of reuse.

## Reuse 1
* You want something to be done but there has been exactly the same thing done by others. One such thing in Java programming is JDK ( Java Developer Kit). JDK comes with your default installation of eclipse.

We have written a method to find absolute of given value, given 2 numbers to find out a maximum number. JDK has done these things already for you.

```java
    class Application{
        public static void main(String[] args){
            // to find out absolute value.
            int value = Math.abs(-10);
            System.out.println(value);
            
            value = Math.max(10,20);
            System.out.println(value);
          
        }
    }
```
Above you are using __Math__ class that comes up with JDK which has lot of methods and __abs__, __max__ are some of them. You know they are __static__ as  you are able to use the class instead of creating object.

If you type Math. in your eclipse you will see there are lot of methods shown in Math class which JDK has it like below (__in eclipse type Math and then period and wait__ to see the list).

![jdkmathhelp](https://github.com/sairamaj/programmingclass/blob/master/images/jdkmathhelp.png)

In future classes we will be using other JDK classes.

## Reuse 2
Another kind of reuse is you saw something already made and you like most of it but wanted to change little bit. Here comes the second principle of OOPs which is __inheritance__.

### Inheritance
Lets see inheritance in action.

Write __Animal__ class like below
```java
    class Animal{
        void feed(){
            System.out.println("animal is eating.");
        }
    }
```

Write __Dog__ class like below
```java
    class Dog{
        // Nothing in it.
    }
```

Write __Application__ class with __main__ method in it.
```java
    class Application{
        public static void main(String[] args){

            Dog d1 = new Dog();
            d1.feed();
        }
    }
```
The above program should give __error__ as Dog does not have method called feed.

Now change the __Dog__ class like below
```java
    class Dog extends Animal{
        // Nothing in it.
    }
```

Now your program works fine.

Lets see what is happening. You saw __Animal__ class which has been written by somebody and saw __feed__ method in it and you like it. But you have dog which is animal but has some other extra things when compared to other animals. You want to have Dog class but wanted to share the feed of animal. You have  __extended__ with __extends__ key word in Dog and suddenly all the methods in __Animal__ became part of __Dog__ class.

The second principal of __OOP__ is __Inheritance__ which is all about __reuse__

Both kinds of reuse we saw are very important when we want to write big applications as we don't want to build everything and want to use if something already available. We will be using this in upcoming classes.

# Summary
* Learned about __static__ methods
* Saw  __reuse__ with JDK and __inheritance__











