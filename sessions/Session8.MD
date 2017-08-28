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

output

    starting
    stopping
    starting
    stopping

If you see above output you see "starting" and "stopping" with 2 times one for each car. But the problem in this is, we don't which car started first and which car stopped first by looking at the output ( not looking at the program).

We can enhance this program to output which car is starting and which car is stopping. This is where the __fields__ in the class and __methods__ in the class are connected. The __methods__ in a class have access to the __fields__ as they are defined together in the class. You can think of these as family, where family members things can be accessed(shared) by other members. Also when you create __c1__ object ( at this time you should know __object__ is nothing but creating a __variable__ for the __class__) , you can think of creating a following memory in RAM ( Remember, we have learned in previous classes where RAM is scratch pad where computer program uses to do its work [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/First.MD#computer-fundamentals)).

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

We still have one problem. Look the code below
```java

public class Application {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "bmw";
		c1.horsePower = 200;
		c1.start();
		// Start one more time and see what happens
		c1.start();
		c1.stop();

		Car c2 = new Car();
		c2.name = "honda";
		c2.horsePower = 50;
		c2.start();
		c2.stop();

	}
}

```

and the output will be

    starting : bmw which has:200 horse power
    starting : bmw which has:200 horse power
    stopping: bmw
    starting : honda which has:50 horse power
    stopping: honda

Oops, we were able to start the car twice without stopping. In real scenario we can only __stop__ after starting the car. We should be able to fix this

### boolean
We have learned Java given types __int__, __String__ and __double__. Lets visit a new kind of data type which is given by Java called  __boolean__. This data type is used when your data value can take only yes or no. Like did you go to school? you have either yes or not. Are you taking chemistry class this year? yes or no. 

We are going to use this data type here. I will be giving pseudo code here and you should be finish this as home work.

Before giving pseudo code lets walk through non programming scenario. Imagine you are Car object and conversations are done like below

    Me:  Start the car
    You: Starting
    Me:  Start
    You: Sorry , you have started already. You need to stop before starting again.

How did you say sorry when I asked you second time. Because you have __remembered__ that I already called start and when I asked to start second time you have asked yourself did he call start already and you got answer yes ( by thinking in your brain) and hence you said sorry.

If you have followed this conversation , see the __remembered__ and __yes__ and __no__ in giving answer in __start__.

    start method
        is started
            "sorry you have started already. you need to stop before starting again
        else
            "start"
            started = true
    
    stop method
        is started
            "stopping"
            started = false
        else
            "sorry,  you have not started yet. please start the car before stopping"
    
If you remember __is__ in real conversation will become __if__ in programming world.

# Summary
* __fields__ in class are nothing but variables in class
* __action__ in class are nothing but __methods__ in class
* __methods__ in class can access the __fields__ declared in class.
* __boolean__ variables are used to store values __yes__ or __no__ types.

# Homework
* Create session7 notes in __notes/session7.txt__ in git repository
* You have created CarSample already ( if not you can create now and use the code mentioned above)
  * Fix the start method so that if you start second time you should say "sorry" ( just like explained above conversation)
  