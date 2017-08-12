We have recapped again to declare a variable
```java
    int age = 12;
    String name = "sai";
```
__datatype__ <space> __varaiblename__ = __valueofthevariable__ ;

In above we have 2 variables. __age__ which is of type __int__ (remember __int__ can take only numbers) and another one __name__ which is of type __String__ (takes characters). __int__ , __String__ are the data types provided by Java. 

Can you represent a person with a single variable using any one of the Java supplied data types (int, String, double)? No. When you want to represent a person usually you describe with a name, age, grade, height, weight. In this if you want to represent the person  you should have 5 variables (for name one variable, age another one etc.,). What we need is to have single variable __p__ to represent a person. This is where we will learn big concept in Java which is defining your own data types.

## Your own data types
One can define their own data types using basic data types (__int__ , __String__ ). This is like building a shape using small lego blocks.

```java
    class Person{

    }
```
Here you have defined your own data type called __Person__. Above __class__ is keyword and __Person__ is the name you have given to your data type. 

The syntax is

__class__ <yourdatatypename>{

}

Then you can define what you want in this data type. Lets fill in with some data types (lego blocks)

```java
    class Person{
        int age;
        int name;
        int grade;
        int height;
        int weight;
    }
```
Now the data type __Person__ is complete.

### Using this your data type
How can we use this data type in our program. Remember again how you are used to declare a variable which is __datatype__ followed by __variable__. Here also same.

__Person__ person1;

Here the data type is __Person__ and variable is __person1__

We have slight difference in assigning values to this variable. In regular data type like __int__ you have used = 10 ( justed used = and then value). But for the data types you have created

__Person__ person1 = new __Person__();

<datatype> <variable> = __new__ <datatype>();

__new__ is the keyword and you are saying to Java that I want to create new value ( the technical term __object__ which we will learn more about this in the next class) for this data type I have created. One you have done this then you can assign individual parts of Person (age,name,grade,height,weight) using __.__ (dot) like below

```java
    Person person1 = new Person();
    person1.age = 20;
    person1.name = "sai";
    person1.grade = 7;
    person1.height = 5;
    person1.weight = 100;
```

In order to assign age we use our variable __person1__ and then __.__ (dot) and then one of the property you have defined in the class.

In order to use the variable for printing you use the same way like below
```java
    System.out.println( person1.name + " age is:" + person1.age);
```

## Complete Program
* Open Eclpse
* Create Java project called MyOwnDataSample
* Create class called Application.java and make sure that public static void main() check mark is checked.
* Print line using System.out to say learning data sample 
    * System.out.println("learning my own data type");
* Run the program and make sure that it prints.
* At this time we are ready to add our own data type
* File->New->Class and name __Person__
* Make sure that public static void main() is __unchecked__ ( this is the difference between when you have created Application class where you have checked it. The reason is our Java project is going to have 2 classes but only one class needs to have __main__ method so that when you run the program starts from first instructions in __main__)
* In newly created __Person__ class input the following
```java
    class Person{
        String name;
        int age;
        int grade;
        int height;
        int weight;
    }
```
* Now in Application class after System.out.println
```java
    Person person1 = new Person();
    person1.name = "sai1";
    person1.age = 12;
    
    Person person2 = new Person();
    person1.name = "sai2";
    person1.age = 15;

    System.out.println(person1.name + " age is:" + person1.age);
    System.out.println(person2.name + " age is:" + person2.age);
```
* Run the program
    you should see
    sai1 age is:12
    sai2 age is:15
* In above we have 2 persons with different values.

    

