Now that we have done 9 sessions lets review where we are , what we have learned so far.

We have started to learn basic Java and some Computer Fundamentals.

# Why Learn a Programing language like Java?
In real life if you want to get some help from your friend, first thing you have to talk to him which involves some common language ( either English, Spanish) and then ask him what you need and then only he can do. In order to to talk to Computer you need a language and there are many, just like we have many languages in real life. Some of the languages you can use to communicate to Computer are __C__, __C++__, __C#__ , __Java__ and there are many more.

## What you can do to Computer using this language
Ok lets see what you can do to your computer which you bought it from either store. You can open a __browser__ and go to your favorite Internet sites. You can open a __windows word__ program and type your home work essay. You can copy some photos from your mobile phone on to your disk and view them. You can play some songs. Like this you can do lot of other things. Did you know these programs (browser, windows word, picture viewer, playing songs) are written by somebody using some language ( may be they are __C__ or __Java__)?. If you want to do something new with your computer (like managing your friends along with their birthdays, hangouts etc.,) then you need some language like Java to instruct computer to do so.

# Knowing more about your Computer
Knowing about your tool which is Computer in this case is more important as you will be using this to your programming. What we have learned in first session is you can divide the Computer in to two parts which is __Hardware__ and __Software__

## Hardware
* Physical parts
    * CPU (Central Processing Unit) (like human brain. This is responsible for everything whether it is simple like doing 2+2=4 or any other big calculations)
    * RAM (Random Access Memory) (like your scratch pad where things are stored temporarily)
    * Hard disk (Things are stored permanently like your photos, videos which exists even if you turn on computer)

## Software
* Programs does some stuff.
* Program = Set of instructions
* Each instruction will have some action name and data
* For example you can do some simple program like this
    * wakeup at 6am ( action: __wakeup__ , data: __6am__)
    * run 4 miles ( action: __run__, data: __4miles__)
    * eat breakfast ( action: __eat__)
* You need some master program which can run other programs and this is called __Operating System__ ( like windows, mac, linux)

### Does computer know about your photos, documents, videos?
Basic computer does not know English. Computers know only 1 or 0. Can you believe so many things are done with Computers ( like playing 3D games, videos , your pictures) with just 1 or 0s. For that you need to know binary system which we have discussed in our first session.

For full details about these visit [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/First.MD)

# IDE (Interactive Development Environment)
Now that you know Java is one language you use to communicate to Computer ,how do you use this language and ask Computer to do some stuff. In real life you talk to somebody to give instructions and in Computer you need to type and put it in a file and give this file to Computer. You have different programs in computer to do different things. When you want to do some internet you open browser like google chrome. When you want to edit document you use windows word. Similarly when you want to play you use video player. To type your Java language there are special programs which are called Interactive Development Environment (in short IDE) and __Eclipse__ is one such program. These programs give you to type Java programs, tells you any mistakes you make, allow to run your program to show the results etc., In __Eclipse__ you can create Java project, classes and many more. You can see what we have covered regarding eclipse [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session2.MD#eclipse)

# Where do you start?
You know now that __Java__ is required to communicate and __Eclipse__ is used to type language to tell __Computer__ to do some stuff, where do you start? Just like we have some grammar in our real life communication we need to use Java (Computer language) in specific way. There is some structure to it which is called __Syntax__.  Whatever we want to tell to computer through Java we need to put in to instructions and give some name to it which are called __methods__ and group these methods in to __classes__ and __invoke__ them which is also called __calling__ them. 

Lets say you want Computer to do some math like addition and subtractions given two numbers. 

You start by writing a __class__ and name it and put __actions__ (__methods__) in it.
```java
    class Math{
        int add(int x, int y){
            int z;

            z = x+y;
            return z;
        }
    }

    class Application{
        public static void main(String[] args){
            Math m = new Math();
            int sum = 0;

            // This is invoking action add (also use the term calling add method)
            sum = m.add(2,4);
            
            System.out.println("sum is:" + sum)
        }
    }
```

Before this you need to create a Project ( think project as collections of __classes__ ) in Eclipse and name it
* Project: 
  * MathSample
     * Class
       * Math
       * Application

## Running (Executing) the program
The term used to follow the instructions written by Java to Computer is usually referred by __run__ or __execute__ the program. If you see in Eclipse there will be __Run__ button which you click and the computer follows your Java written program and does whatever you asked to do. Some of these are explained [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session2.MD#eclipse)

# Syntax
There are two aspects in programming. One is Syntax (equivalent of grammar in English language). You have grammar like period, comma, paragraphs, verbs , nouns etc., in English language and Java has similar. The following are some of the syntax we have learned so far in Java

### Semicolon (;)
* Every statement (a __statement__ is equivalent of __sentence__ in English language ) ends with __;__
```java
    int x = 0;
    String name = "sai";

    System.out.println("hello world");

    if(){       // No semi colon as if was not ending there is some continuation to it.

    }
```

### Data type
* Java language needs to know what are the values a variable is going to have it.
* Only numbers then you would say __int__
* __Strings__ which will take any alpha numeric values.
* [more info](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session4.MD#data-types)

### Variable
* A __variable__ by definition changes values.
* __x__ is variable which can take either 1, 2, 3 etc.,
* [more info](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session4.MD#data-types)

### Constants
* A __constant__ by definition does not change
* 1,2, 3 ,"hello" are all constants.

### Declaring a variable
```java
    int x = 0;      // datatype(int)  variablename(x) = value;
    String name = "hai";
```
### String constants are in quotes
* String constants are specified in double quotes ""
```java
    String name = "sai";   // string constants have quotes
    int x = 3;      // int constants does not have constant
```
### Difference between quotes and non quotes
```java
    String name = "sai";

    System.out.println(name);       // you are printing variable name which has the value "sai" and hence prints "sai"
    System.out.println("name");     // you are printing value "name" and hence prints as "name" 
```
### If ,else if, else
* If, else if , else are used for controlling the which instructions should a computer follow based on inputs which are called __control flow statements__
```java
    if(){

    }else if(){

    }else if(){

    }else{

    }
```
* [more info](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session4.MD#if-statement)

### for
* for is used for repetitions
```java
    for( ; ; ){

    }
```
[more info](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session4.MD#for-loop)

### class
* class is used to define the template (cookie cutter)
```java
    class Person{

    }

    class Animal{

    }
```
[more info](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session7.MD#class-object-instance)

### object
* object is creating a variable for the class with keyword new
```java
    Person p1 = new Person();
    Animal cat = new Animal();
```
[more info](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session7.MD#class-object-instance)

### fields
* fields are properties defined in class
```java
    class Aninal{
        String name;
        int age;
    }
```
### methods
* methods are actions defined in class
```java
    class Car{
        void start(){
            System.out.println("starting a car");
        }

        void stop(){
            System.out.println("stopping a car");
        }
    }
```
[more info](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session7.MD#actionsmethodsfunctionsbehavior)

### Connection between methods and fields
* methods in class can access fields
```java
    class Car{
        String name;

        void start(){
            System.out.println("starting:" + name);
        }
    }
```
[more info](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session8.MD#connecting-class-methods-and-class-fields)

### main method
* This is where the computer starting following instructions in your program
* You can have multiple classes in your project, but there should be only one class which contain main method
```java
    class Application{
        public static void main(String[] args){
            System.out.println("This is where computer start following your instructions");
        }
    }
```

### code block
* Any code which enclosed between __{__ and __}__
* Group of multiple statements
```java
    if( x> 0){  // begining
        System.out.println()
    }   // ends here

    void start(){   // begining of method start

        pumpGas();
        ignireChamber();
        System.out.println("started");
        
    }   // end
```
# Encapsulation
* First principle of Object Oriented Programming
* Two parts
   * packaging the related fields and methods in class
   * hiding the details
[more info](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session9.MD#encapsulation)

# Strategy of approaching of writing a new program
* Following some basic steps when writing your new programs will help [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session5.MD#steps-involved-in-writing-program)


# Git
* Git is where you can store your programs online.
* Your homeworks and notes are stored here.
* The following are minimum commands you need to know in order out get files in to git online account
  * git add *
  * git status
  * git commit -m "your comment"
  * git push

[more info](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session3.MD#what-is-git)

# Miscellaneous info
[Converting Decimal to Binary and Binary to Decimal](https://github.com/sairamaj/programmingclass/blob/master/sessions/First.MD)

[Windows Operating System](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session2.MD)

[Creating your first Hello world project](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session2.MD#hello-world-java)

[Switching workspaces in Eclipse](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session3.MD#eclipse)

[Naming of variables, commenting, Indentation, Fixing Syntax errors, Matching curly brackets](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session4.MD#some-general-info-regarding-java-programming)

[Taking user input](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session5.MD#taking-input-from-user)

[Using Keyboard shortcuts](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session5.MD#easy-navigation-in-eclipse)

[Some common mistakes you do](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session6.MD#some-common-mistakes-in-the-class)

[Actions with different inputs and outputs](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session7.MD#action)

# All previous sessions
[Session 1 - Computer fundamentals](https://github.com/sairamaj/programmingclass/blob/master/sessions/First.MD)

[Session 2 - Operating System & HelloWorld Java](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session2.MD)

[Session 3 - Working with git basics](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session3.MD)

[Session 4 - Data Types , If, For and Some general guidelines](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session4.MD)

[Session 5 - Strategy to approach for writing a program](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session5.MD)

[Session 6 - Defining your own data types - classes](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session6.MD)

[Session 7 - Defining methods](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session7.MD)

[Session 8 - Connecting methods and fields in class](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session8.MD)

[Session 9 - Encapsulation](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session9.MD)












