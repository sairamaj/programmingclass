
    Before going on to this session we have verified whether eclipse workspace is pointing towards basicjava repository so that any projects we create here can be checked in to github.


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

In algebra you don't specify type but in Java programming you need to tell the program what kind of data you need. 

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

    Strings are represented in double quotes(""). __Note__ : Not variables(ex:name) but their values (ex:"sairama")

### Syntax
   What is Syntax in Java programming? 
   
   it is grammar to programming just like you have grammar in English language.

   Some of the examples for syntax is every statement in Java will end with a ';' (semicolon)
   
   Another example is declaring variables like above where we start with __datatype__ followed by __space__ then __variable__ and then __=__ followed by __value__ and ends with __;__ (int age = 14;)

   Over the period of time we will be learning more syntax in Java.

