# Recap
### Class
__class__ is the technical term for creating data type

```java
class ClasNameHere{

}

// example
class Person{

}
```

### Object
__object__ is the technical term creating variable
```java
    Person p1 = new Person();
```

### Fields
What we are calling a class properties are called __fields__ in Java terminology
```java
class Person{
    String name;        // field name of type String
    int age;            // field age of type int
}

// creating object and accessing fields
Person p1 = new Person();
p1.name = "sai";
p1.age = 16;
```

### Methods
What we have called __Actions__(which are verbs) are called __Methods__ in Java terminology
```java
class Car{
    void start(){
        System.out.println("starting the car");
    }

    void stop(){
        System.out.println("stopping the car");
    }
}

// accessing methods
Car c1 = new Car();
c1.start();
c1.stop();
```

### Fields and Methods
Class will have both fields and methods
```java
    class Car{
        String name;
        int horsePower;

        void start(){
            System.out.println("starting");
        }

        void stop(){
            System.out.println("stopping");
        }
    } 

// Accessing both fields and methods
Car c1 = new Car();
c1.name = "bmw";
c1.horsePower = 200;
c1.start();
c1.stop();
```

# Connecting class methods and class fields
We have both __fields__ ( like name, horsePower in Car ) and __methods__ ( start and stop in Car). Lets see what is the connection between them.

Lets write a below program
* Open Eclipse
* New Java Project and name it as CarFieldMethodConnectionSample
* Create __Application__ (with public static void main checked)
* Create __Car__ class
* Fill the __Car__ class like below

```java
    class Car{
        String name;
        int horsePower;

        void start(){
            System.out.println("starting");
        }

        void stop(){
            System.out.println("stopping");
        }
    } 
```
* Fill the __Application__ class in __main__ method like below
```java
    Car c1 = new Car();
    c1.name = "bmw";
    c1.horsePower = 200;
    c1.start();
    c1.stop();

    Car c2 = new Car();
    c2.name = "honda";
    c2.horsePower = 50;
    c2.start();
    c2.stop();
```
* Run the program and you will see below

    starting
    stopping
    starting
    stopping

If you see above output you see "starting" and "stopping" with 2 times one for each car. But the problem in this is I don't which which car started first and which car stopped first by just looking at the output ( not looking at the program).

We can enhance this program to output which car is starting and which car is stopping. This is where the __fields__ in the __class__ and __methods__ in the __class__ are connected. The __methods__ in a class have access to the __fields__ as they are defined together in the class. You can think of these as family where family members things can be accessed by other members. Also when you create __c1__ object ( at this time you should know __object__ is nothing but creating a __variable__ for the __class__) you can think of creating a following memory in RAM ( Random Access Memory which we have studied [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/First.MD#computer-fundamentals)). As we have learned in previous classes where RAM is scratch pad where computer program uses to do its work.

![carmemoryimage](https://github.com/sairamaj/programmingclass/blob/master/images/carmemoryimage.png)

What is this mean we can use __name__ variable in  methods  __start__ and __stop__ like below

```java

public class Car {
	String name;
	int horsePower;

	void start() {
		System.out.println("starting : " + name + " which has:" + horsePower + " horse power");
	}

	void stop() {
		System.out.println("stopping: " + name);
	}
}

```
and the output will be 
    
    starting : bmw which has:200 horse power
    stopping: bmw
    starting : honda which has:50 horse power
    stopping: honda

these __fields__ are called __object__ variables. Even though we have not defined __name__ in the method __start__ we were able to access it because it is part of the class.
