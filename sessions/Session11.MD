# Recap
We did recap of everything we have learned so far.

Basically at this point you should now
* How to create a Hello world Java project 
* Declaring different kinds of variables
* Basic __if__ syntax
* __for__ loop syntax
* Creating __class__
* Creating variables in the class
* Creating methods in the class.
* Creating __object__
* Some experience with Eclipse
* Working with __git__ commands

# Some common misconceptions
A class will have variables(fields/properties) and methods (actions)

```java
    class Car{
        String name;
        int horsePower;

        void start(){
            System.out.println("starting the car:" + name);
        }

        void stop(){
            System.out.println("stopping the car:" + name);
        }
    }
```
In above we defined __name__ as variable and __start__ and __stop__ are methods. We have statement called "starting the car" (instruction) in __start__ and "stopping the car" in __stop__ method. Here we are creating a methods (start, stop ) with some instructions in it ( printing the messages) and does not mean when you run the program these statements will appear. Remember __class__ is __cookie cutter__. We can make __cookie__ (__object__) from this and use the __cookie__. We can make more than one __cookie__ ( multiple objects)

```java
    Car c1 = new Car();
    Car c2 = new Car();

    c1.start(); // this is calling the methods and at this time computer will run the instructions in the method start
    c1.stop();

    c2.start();
    c2.stop();
```
In above we have created 2 objects __c1__ and __c2__. 

fields of object can be accessed just like any other variable
```java
    c1.name = "Honda";
    c2.name = "Toyota";
```

methods can be called by invoking (calling) like below
```java
    c1.start();
    c2.start();
```

methods uses __(__ parameter here __)__. In start and stop we don't have any input parameters and hence empty __()__ after the method. At this point the computer will get into method __start__ and follows the instructions which in the above program is to print the message.

# Constructors
Lets create a class like __Person__ and create a object.

```java
    class Person{
        String name;

        void printDetails(){
            System.out.println("name is=" + name);
        }
    }

    class Application{
        public static void main(String[] args){
            Person p1 = new Person();
            p1.printDetails();
        }
    }
```

When you run the above program you will see

    name is=null

In above program we did not set name field to any value and for strings the java says __null__ (which is saying __nothing__)

If you want see some name printing you need to say
```java
    p1.name = "sai";
```

In this program what we are saying is 
    p1 is Person and his name is "sai" ( it is done in 2 steps where first step is creating Person object and then setting the name in second step)
If we forget setting the name then we have Person without name which does not make sense.

But what we wanted to say is __p1__ is Person with name "sai" ( In one step). We want to enforce this in the program that way you cannot create person without a name.

```java
  class Person{
	
    String name;
	
	Person(String inputname){
		name = inputname;
	}

        void printDetails(){
            System.out.println("name is=" + name);
        }
    }

    class Application{
        public static void main(String[] args){
            Person p1 = new Person("sai");
            p1.printDetails();
        }
    }  
```

If you observe in Person class we created a method whose name is same as class name (Person) which takes one input which is of data type __String__ and name __inputname__ which is assigned to __name__.

In creating the person object now you have to do the following
```java
    Person p1 = new Person("sai");
``` 

The method we have added has some unique characteristics
```java
    Person(String  inputname){

    }
```
* It has the same name as class name (Person)
* It does not return anything (for normal method when they don't return anything you need to specify __void__ but for this you cannot type anything)
* The parameters are just like any other methods where you can have 0 or multiple parameters.
* This is method is called when you are creating the object and hence it is called __Constructor__

### Homework
* Create session 11 notes and check it in notes directory as session11.txt
* The program which we have written class to create __Person__ with constructor taking name needs to be enhanced like below
    * Add __age__ variable to the Person class
    * As Person cannot exists without age enhance constructor to take 2nd parameter call inputage
    * Change the object creation to pass age parameter
    * Change the __printDetails__ method to print age of the person also.


