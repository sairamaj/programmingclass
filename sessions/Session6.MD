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

### Create program with some more data types
* Repeat the above program but this time come up with your data types
* Some of them you came up with are
    * Movie
    * Animal
    * House
    * Recipe

__Note__ The data type which we wil be calling __class__ now-on-wards should be __Singular__ __Noun__. 

## Some common mistakes in the class
### Using the variables without declaring them.
![variablenotdeclared](https://github.com/sairamaj/programmingclass/blob/master/images/variablenotdeclared.png)

    you need to declare variable
```java
        int age = 10;       // You are declaring or you can call defining

        System.out.println(age);        // Here you are using the variable

```

Eclipse gives the message like below
![variablenotdeclaredwithmessage](https://github.com/sairamaj/programmingclass/blob/master/images/variablenotdeclaredwithmessage.png)

### The curly ({ } ) brackets.
In Java the curly brackets ( { and }) form a logical block and every opening of __{__ should have proper __}__. 
Class starts with __{__ and ends with __}__. Within the class method like __main__ starts with __{__ and __}__. Within the method the __if__ stars with __{__ and ends with __}__. 

```java
    public class Application{

        public static void main(String[] args){

            if(  ){

            }

            // You can create your own block and put code in it.
            {

            }
        }
    }
```

### Not every line ends with ';'
When we started the programming we said every line ends with ';'. Yes and No. Now that we have know more about Java we rephrase this that every __statement__ should end with ';'. What forms __statement__ and what not?

__statement__ is roughly equivalent to sentences in natural english language. When you see __if__ it does not end and hence we don't put __;__ when if starts

```java
    if( x > 0); {       // Wrong to put ';' as this not statement where sentence is not done.

    }
```

## Homework
* Create session6 notes in __notes/session6.txt__ in git repository
* Project with creating your own data type
    * Project name MyHomeWorkDataSample
    * Class Application.java with main
    * New class and here it depends on what you choose for your own data type
        * Hint: If you look around you can get lot of possibilities for data types like . Bike, Car, Picture, Kitchen, Room and soon 
    * Check-in __homework__ folder in git repository

    

