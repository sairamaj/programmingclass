Before going on to this session, we have verified whether eclipse workspace is pointing towards basicjava repository directory, so that any projects we create here can be checked in to github.

## Variables
    We are used to create variables in algebra like below

    x = 2

   Here __x__ is called __variable__ because we can change its value by assigning to another value like 

   x=3

   and __2__ , __3__ are called __constants__ because they never change ( 2 is 2 always)

## Data Types
   The concept of variable is same in Java programming too, where a variable can change at any time.

   Before discussing how we create variables in Java, lets discuss following data.

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

## Syntax
   What is Syntax in Java programming? 
   
   it is grammar to programming just like you have grammar in English language.

   Some of the examples for syntax is every statement in Java will end with a __';'__ (semicolon)
   
   Another example is declaring variables like above where we start with __datatype__ followed by __space__ then __variable__ and then __=__ followed by __value__ and ends with __;__ (int age = 14;)

   Over the period of time we will be learning more syntax in Java.

## If statement
In real life you get different paths based on certain conditions. For example if you are more than 15 years old, then you can get driver permit. If the day is Sunday or Saturday you don't have to go to school. In Java programming also you can conditions and do things only that conditions match. This is represented by __if__ , __else if__ and __else__ statements.

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

 Both if() and else if() take anything that can become __yes__ or __no__ statements. In future we will see complex conditions but ultimately the entire stuff ( whatever goes in between __()__ )should be answered to __yes__ or __no__

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

## Looping(repetitions)
Just like we have some repetitions in real life, we have some repetitions in programming too. There are different ways of doing repetitions in programming.

### For loop
One such loop in Java programming is __for__ loop.
Before knowing syntax of __for__ loop, lets take some real life scenario involving looping.

Lets say you are about to run in school playground tracks. You have been asked to run for 10 times on the track. 

One time
* Before starting the run and entering in to the track, you do some warm ups
* Eat banana for instant energy
* Put music and ear buds
* Start counting your mind (still not finished one round,so you say yourself as zero)

Next
* Check whether 10 rounds are done (you had zero runs so far, so you need to run on track)

Next
* Start Run on track

After finishing one round 
* You add 1 to your run count which is 0+1 = 1
* Then check whether you have finished 10 runs
* As you have not reached 10 you will start run on track again.

You go for 2nd round
* You add 1 to your run count which is 1+1 = 2
* Then check whether you have finished 10 runs (only 2 runs )
* As you have not reached 10 you will start run on track again.

You go for 3rd round
    .. so you repeat these 
....

Now you are on run 9
* You add 1 to your run count which is 9+1 = 10
* Then check whether you have finished 10 runs 
* Yes you are done 

Stop running at this time.

Lets see how we can do this in Java programming

```java
    int i;  // For counting in loops usually variable name 'i' is used 

    for(i=0 ; i<10 ; i++){
        System.out.println("running :" + (i+1));
    }

```
The above program will print running statement as 10 times.

Lets the syntax of __for__ loop
```java
    for( initialiation_onetime ; condition_which_should_return_true_or_false ; do_some_increment_which_runs_for_each_loop){
        somestatements_which_will_execute_aslongas_theconditionis_true
    }
```
Lets see how computer runs the above __for__ program 

Step-1  (only one time)
  
 * i=0 

Step-2
  
 * i < 10  ( is 0<10, yes __true__)

Step-3

 * System.out.println("running " + (i+1))    ( __prints "running 1"__)

Step-4 

 * i=i+1        ( __i will become 1__)

Step-5 

 * i<10 ( is 1<10 , yes __true__)

Step-6

 * * System.out.println("running " + (i+1))    (__prints "running 2"__)

 ...
 
 ...

 ...

Finally when i becomes 10 and the condition 10<10 becomes __false__ and thats where the loop stops.

so if you observe the 3 parts in for loop are

initialiation   -> one time

condition_which_should_return_true_or_false -> each loop time

do_some_increment_which_runs_for_each_loop -> each loop time.

## Some general Info regarding Java programming

### Naming of variables
When naming variables in Java programming, it is best practice give proper good names for easy understanding and readability of the code. 

####  some bad examples

```java
    int x;
    String y;
    double z;
```
####  some good examples
```java
    int age;
    String name;
    double price;
```
### Commenting
One can put comments in the code . if you start the line with // and anything followed by is comment and good practice to put your notes in the code
```java
    // This loop prints up to 100 numbers.
```

### Indentation
While editing the program indentation (meaning putting spaces or tabs in section of the code) is important for readability and identifying any mistakes in the code (yes indentation helps readability and hence spotting any errors easily).

####  some bad indentation
![badindentation](https://github.com/sairamaj/programmingclass/blob/master/images/badindentation.png)

####  some good indentation
![goodindentation](https://github.com/sairamaj/programmingclass/blob/master/images/goodindentation.png)

__Hint__:  Use Ctrl+Shift+F (on Windows and on mac Ctrl->Command) to do __auto indent__ which indent properly.

### Fixing Syntax errors
Remember __syntax__ is grammar and if you don't follow proper grammar then Java program will complain. Eclipse which is IDE ( Interactive Development Environment ) for Java projects shows a small red circle showing some error. One can click that red circle to see what is the actual error and fix them.

![syntaxerrorvariablenotdefined](https://github.com/sairamaj/programmingclass/blob/master/images/syntaxerrorvariablenotdefined.png)

![syntaxerrorsemicolonmissing](https://github.com/sairamaj/programmingclass/blob/master/images/syntaxerrorsemicolonmissing.png)

### Matching curly brackets ( { } )

In Java a block is defined between two curly brackets which starts with __{__ and ends with __}__. It is important to match them , i.e every open __{__ should have __}__. If not you will get errors.

![curlybracketsmatchin1](https://github.com/sairamaj/programmingclass/blob/master/images/curlybracketsmatchin1.png)

![curlybracketsmatchin2](https://github.com/sairamaj/programmingclass/blob/master/images/curlybracketsmatchin2.png)

## Homework
* Makes notes out of this and check-in in your git hub account.
* Write a program to show like below
    * age is less than 13 -> you are kid
    * age is between 13 and 19 -> you are teen
    * age is between 20 and 60 -> you are adult
    * age is above 60 -> senior citizen

    __Hint__: to do multiple comparison one can use like below
        __age >=13 && age <=19__   ( here __&&__ is like __AND__ meaning both  >=13 and <=19 should be true)

* Write a program to print numbers starting from 5 to 100 in step of 10. i.e program should print
    * 5, 15, 25, 35, 45, 55, 65, 75, 85, 95







    















