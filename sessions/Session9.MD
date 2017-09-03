# Recap
### Class
* template, blue print, cookie cutter, recipe,  your custom data type
* contains fields (properties), methods ( actions)
* methods in classes can access fields in class.
* Singular noun
* examples
  * Person, Animal, Car
* Syntax
```java
    class Persion{

    }
```
### Object (Instance)
* Creating a variable of class is nothing but object ( creating a cookie from cookie cutter)
* Syntax
```java
    Person p1 = new Person();       // You use new keyword.
```
### Fields
* Properties in class
* They are variables in class. Once you define a variable it will become field.
* Synax
```java
    class Person{
        String name;        // field name of data type String.
    }
``` 

### Methods
* Actions 
* Verbs
* Syntax
```java
    class Car{

        void start(){
            System.out.println("Starting car");
        }
    }
```

### Connection between methods and fields in class
* Methods in class can access fields
* fields are called instance variables.
* Syntax
```java
    class Car{
        String name;
        int horsePower;

        void start(){
            System.out.println("starting:" + name)      // name is defined in the class and method can access it.
        }
    }

    Car c1 = new Car();
    c1.name = "bmw";
    c1.start();

    // prints
    // starting: bmw
```

### boolean
* used to store either yes or no (true/false)
* Syntax
```java
    boolean isStarted = false;  // not started.

    isStarted = true;       // started.
```

# Using Boolean in Car sample
Last class we have one problem with Car sample. You can start car twice which is not real. Lets fix it.Revisit the pseudo logic we have discussed last class [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session8.MD#boolean)

```java
public class Car {
	String name;
	int horsePower;
	boolean isStarted = false;	// used to indicate whether is is started or not.

	void start() {
		if( isStarted == false) {
			System.out.println("starting : " + name + " which has:" + horsePower + " horse power");
			isStarted = true;		// now car started.
		}else {
			System.out.println("sorry , you need to stop the car fist.");
		}
	}

	void stop() {
		System.out.println("stopping: " + name);
		if( isStarted == true) {
			System.out.println("stopping:" + name);
			isStarted = false;		// now car stopped.
		}else {
			System.out.println("sorry you can only stop if car is already started");
		}
	}
}
  
```

# Encapsulation
Today we are going to learn one of the Object Oriented Programming (OOPs in short). Java language is based on Object Oriented Programming where everything is object ( you know now what mean by object which is nothing but creating a variable with __new__ keyword for given class.)

If you observe all the class we have defined so far have some patterns. We have fields and methods which are defined in classes are related. For example

```java
    class Person{
        String name;
        int age;

        void readBook(Sring bookName){
                System.out.println(name + " is reading book:" + bookName)
        }
    }

    class Car{
        String name;
        int horsePower;

        void start(){

        }

        void stop(){

        }
    }

    class Animal{
        String name;

        boolean canFly(){

        }
    }
```

We did not put __readBooks__ in Animal and Car. At the same time we did not put __start__ in Person or Animal. This is the one part of first principal which is called __Encapsulation__ which says packaging (putting) related data (fields) and behavior(methods) together in class.

## 2nd part of Encapsulation
A real car when you start lot of things happens which moves the car just you by putting pressure on accelerator. Imagine you have car where you need to put some gas in chamber, light the gas and turn some handlers which ultimately moves the wheels just move for a feet. How that experience will be? tough right? But somebody has to do it which Car manufacturer did all those things for you. 

Lets write a Car class which exists where you need to do lot of things to move the car.
```java

public class Car {
	String name;
	int horsePower;
	boolean isStarted = false;	// used to indicate whether is is started or not.

	void putGasInChamber() {
		System.out.println("putting gas in chamber");
	}
	
	void igniteChamber() {
		System.out.println("Igniting chamber");
	}
	
	void moveWheels() {
		System.out.println("moving wheels");
	}
}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "bmw";
		c1.horsePower = 200;

        // You need to do all these things just moving the car.
		c1.putGasInChamber();
		c1.igniteChamber();
		c1.moveWheels();
	}

```
Did you see from __Application__ class you are calling individual calls to __Car__ class to move the wheels. But in reality you will do the following

```java
public class Car {
	String name;
	int horsePower;
	boolean isStarted = false;	// used to indicate whether is is started or not.

	void start() {
		putGasInChamber();
		igniteChamber();
		moveWheels();
		System.out.println("now car is moving");
	}

	void stop() {
	}
	
	void putGasInChamber() {
		System.out.println("putting gas in chamber");
	}
	
	void igniteChamber() {
		System.out.println("Igniting chamber");
	}
	
	void moveWheels() {
		System.out.println("moving wheels");
	}
}

public static void main(String[] args) {
    Car c1 = new Car();
    c1.name = "bmw";
    c1.horsePower = 200;
    c1.start();
}

```

Where you simply call __start__ and Car is moving now which is what exactly happens in real life. In real life you can't control the gas chamber any more. This is what should be done in programming also where one should not be able to call __pumGasInChamber__ , __igniteChamber__  and __moveWheels__. This can be done by using __private__ key word.

```java

public class Car {
	String name;
	int horsePower;
	boolean isStarted = false;	// used to indicate whether is is started or not.

	void start() {
		putGasInChamber();
		igniteChamber();
		moveWheels();
		System.out.println("now car is moving");
	}
	
	void stop() {
	}
	
	// Nobody can call this method outside Car class
	private void putGasInChamber() {
		System.out.println("putting gas in chamber");
	}
	
	// Nobody can call this method outside Car class
	private void igniteChamber() {
		System.out.println("Igniting chamber");
	}
	
	// Nobody can call this method outside Car class
	private void moveWheels() {
		System.out.println("moving wheels");
	}
}

```

You observe above __private__ key word is used so that outside one cannot call c1.patGasInChamber();

![privatenotvisible](https://github.com/sairamaj/programmingclass/blob/master/images/privatenotvisible.png)

If you see above when you are trying to call __private__ method you get __not visible__ error. This is what second part of __Encapsulation__ principle which is saying __hiding the details__. In __Car__ class we are hiding __putGasInChamer__, __ignoreChamber__ and __moveWheels__ with Java keyword __private__.

### Encapsualation
* Packaging the related properties and actions ( __fields__ and __methods__ are related)
* Hiding the details ( with __private__ keyword)

# Recap
* OOP mean Object Oriented Programming where everything works with __object__
* The principles are important to do good design and programming
* Java is based on Object OOP principles
* Encapsulation
    * Packaging related __fields__ and __methods__ in __class__
    * Hiding the details
        * Some of the details in the class need not be visible outside and we use __private__ key word for this

# Homework
* Create session9 notes in __notes/session9.txt__ in git repository

