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
you will get error __Cannot make a static reference to the non-static field someValue1__. The reason once you make __static__ the method wont exists as part of object (but part of class). 

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
From above observations you can see only when methods don't access class variables , you can declare them as __static__ and you call method on __class__ ( no need to create object)









