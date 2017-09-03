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
### Fields
* Properties in class
* They are variables in class. Once you define a variable it will become field.
* Synax
```java
    class Person{
        String name;        // field name of data type String.
    }
``` 
### Object (Instance)
* Creating a variable of class is nothing but object.
* Syntax
```java
    Person p1 = new Person();       // You use new keyword.
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


