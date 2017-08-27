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
    String name;
    int age;
}

// creating object and accessing fields
Person p1 = new Person();
p1.name = "sai";
p1.age = 16;
```

### Methods
What we have been called __Actions__(which are verbs) are called __Methods__ in Java terminology
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

