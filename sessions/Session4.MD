Before going on to this session, we have verified whether eclipse workspace is pointing towards basicjava repository directory, so that any projects we create here can be checked in to github.

## Variables
    We are used to create variables in algebra like below

    x = 2

   Here __x__ is called __variable__ because we can change its value by assigning to another value like 

   x=3

   and __2__ , __3__ are called __constants__ because they never change ( 2 is 2 always)

## Data Types
   The concept of variable is same in Java programming too, where a variable can change at any time.

   Before discussing how we create variables in Java lets discuss following data.

   <pre>
     Q: What is your age?  
     A: 14
     Q: Which grade you are in? 
     A: 10

     Q: What is your name? 
     A: sairama
     Q: Which street you live in ? 
     A: Tucson

     Q: What is the price of bag?
     A: 24.50
     Q: What is 5/2?
     A: 2.5

     If you observe above data you can group them in 3 different categories
     (14,10)                   -> Numbers
     
     ("sairama", "Tucson")     -> Strings(series of alphabets)

     (24.50, 2.5)              -> Numbers with decimals

</pre>

In Java programming the above sets are given specific name and thats what we call them data type. ( type of the data it represents)

Int      (14,10)   -> Numbers without decimals

String   ("sairama", "Tucson")

double   (24.50, 2.5)  -> Numbers with decimals.

In algebra you don't specify type, but in Java programming you need to tell the program what kind of data you need. 

```java
    int         age = 14;
    int         grade = 10;
    String      name = "sairama";
    String      street = "Tucson";
    double      bagPrice = 24.50;
    double      result = 2.5;
```
If you see above we specify in below format
   
    Datatype VariableName = value ;

    Strings are represented in double quotes(""). Note : Not variables(ex:name) but their values (ex:"sairama")

### Syntax
   What is Syntax in Java programming? 
   
   it is grammar to programming just like you have grammar in English language.

   Some of the examples for syntax is every statement in Java will end with a __';'__ (semicolon)
   
   Another example is declaring variables like above where we start with __datatype__ followed by __space__ then __variable__ and then __=__ followed by __value__ and ends with __;__ (int age = 14;)

   Over the period of time we will be learning more syntax in Java.

### If statement
In real life you get different paths based on certain conditions. For example if you are more than 15 years old, then you can get driver permit. If the day is Sunday or Saturday you don't have to go to school. In Java programming also you can conditions and do things only that conditions match. This is represented by __if__ and __else if__ and __else__ statements.

```java
    int age = 13;

    if( age > 15){
        System.out.println("you can get drivers permit");
    }else if( age == 15){
        System.out.println("Congratulations. today is the day where you can apply for permit.");
    }else{
        System.out.println("Sorry, please wait till you get 15");
    }
```
In above program the syntax is
```java
    if( anything that evaluates to true/false){

    }else if(anything that evaluates to true/false){

    }else{
        // Anything does not match above.
    }
```
In Java programming certain operators make the statement either true/false (you can think of yes/no). for example in above __age > 15__ the symbol __>__ is used to check for __greater than__ . 
So you can read the if( age is greater than 15 ) and if this is true(yes) then the block (block starts with __{__ and ends with __}__ ) will be executed (means program follows the instructions)

Next we have __age == 15__. Why __==__ ( two equals)?. 

In Java programming 
 when we use single __=__ it is called __assignment__, that is __int age = 15__ means we are assigning (setting) value __15__ to variable __age__ . After this the value of variable __age__ will be __15__ and before that it will be __0__ (in Java if you don't specify anything to numbers by default they will be zero).
 
 when we use double __==__ it is called __comparison__, that is __age == 15__ means we asking is age __equal__ to 15?. The answer can be either __yes__ (true) or __no__(false). 

 Both if() and else if() take anything that can become __yes__ or __no__ statements. In future we will see complex conditions but ultimately the entire stuff should be answered to __yes__ or __no__

 One can put multiple statements (instructions, remember we are telling to computer to do some stuff) between __{__ and __}__

 for example:

 ```java
    int age = 13;

    if( age > 15){
        System.out.println("you can get drivers permit");
        System.out.println("you can drive now with an adult next to you");
        System.out.println("certain restrictions , apply");
    }else if( age == 15){
        System.out.println("Congratulations. today is the day where you can apply for permit.");
    }else{
        System.out.println("Sorry, please wait till you get 15");
    }
```
