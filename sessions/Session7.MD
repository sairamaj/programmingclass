# Syntax
Syntax is very important when you learning programming. If you are comfortable with syntax, it makes easy to correct compilation errors and concentrate on logical programming. There is not much syntax to learn in basic Java. Lets recap some of the syntax we have learned.

__Tip:__ Don't remember it blindly. Remember logically ( and also try to think as natural english sentences) and it will be easy

### if

```java
    if(...){

    }
```
__if__ followed by opening and closing parenthesis __()__ and then code block __{}__

```java
    if( condition which can say true/false (yes or no)){
        // programming statements
        // like System.out.println
        // some statements like x = x+2
    }
```
__condition__ returns true/false (says yes/no)
     
x>0  ( true if the variable __x__ is greater than 0. ex: __x__ 10 then __true__ , __x__ -2 then __false__)

x>0 && y<10  ( __x__ should be greater than zero __and__  __y__ should be less than 10 then only it is __true__)
   
   |    x   |  y     |   condition |
   | -----  | --     | ----------  |
   |   5    |  4     |      true   |
   |   5    |  15    |      false  |

x>0 || y<10  ( __x__ should be greater than zero __or__  __y__ should be less than 10 then only it is __true__)
   
   |    x   |  y     |   condition |
   | -----  | --     | ----------  |
   |   5    |  4     |      true   |
   |   5    |  14    |      true   |
   |   0    |   5    |      true   |
   |   0    |  15    |      false  |

__Tip:__ Read __if__ ( as __is__)

### if, else if, else
Follows the  same principle as if

```java
    if( ... ){

    }else if(...){

    }else if(...){

    }else if(...){

    }else{
        // If none of the above matches things will be executed here.
    }
```

### for
Used for repetition

```java
    for( ;  ; ){

    }
```

__for__ followed by __()__ , followed by code block __{}__ . __()__ contains 3 logical blocks separated by __;__.

Entire __for__ syntax was explained step by step [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session4.MD#loopingrepetitions)

### Custom data type ( class)

Defining your data type.

```java
    class YourDataTypeNameHere{

    }
```

Very simple here. __class__ followed by __yourdatatypename__ and then code block

```java
    class Person{

    }
```
### Custom data type ( class)

You can fill properties in the class just like any other variables you define.

```java
    class Person{
        String name;
        int age;
        int grade;
    }
```

### Using custom data type
In order to use the above data type and create a variable

```java
    // datatype   variableName = new  datatype();
    Person p1 = new Person();
```
syntax is __datatype__ ( in this case it is Person) followed by __variableName__ = __new__ keyword and then __datatype and followed by __()__


# Class, Object, Instance
Last week we have learned creating our data types with keyword as __class__ and creating variable.

```java
    class Person{
        String name;
        int age;
        int grade;
    }
```
We have discussed this is creating our data type and then creating variables for it.

The technical term for creating our data type in Java is __class__ and creating variable for this data type is called __object__ or __instance__  ( __object__ is more used.)

## Class
If you observe when we define the __class__ we are describing that data type. For example in above __Person__ class we are not specifying a particular person ,but we are specifying what a person in common will have it. We can think of creating a __class__ as __template__  or __cookie cutter__ or __recipe__ or __blueprint__. Just like you create __cookies__ with a __cookie cutter__ , we create __objects__ with __class__

    class  is template/cookie cutter/recipe/blueprint
    for example;
        When class is cookie cutter, then object is cookie

Now-on-wards call __class__ ( you can still think as custom data type for your reference, but start using word __class__). Similarly use word __object__ for creating a variable of that class.

__Note__: __class__ is __Singular Nonu__ ( ex: Person but not Persons.)

How many objects you can create for given __class__?. Answer is as many as you can.

# Actions/Methods/Functions/Behavior
When we have described a person like below
```java
    class Person{
        String name;
        int age;
        int grade;
    }
```

We have mentioned about a person will have name,age and grade. But what we are missing is some behavior associated with person. When we say a Person we also say what he/she can do also. For example a person can Play, Read Books, Jog for every day , does some programming etc., If you observe these they are all __actions__ a person can do. 

### action 
In general (not related to programming) we have actions happen all the time in our real life.
some of them are
* run
* run for 10 miles
* get coffee
* take money and get coffee

If you observe these actions can be grouped in to following categories
* Actions wont' take anything and does not give back anything
    * run, read, jog, play ( __action__:  __run__, __read__, __jog__, __play__)
* Actions take some inputs but does not give anything back
    * run 10 miles ( __action__ is __run__ and __input__ is __10 miles__)
* Action does not take anything but give back
    * Tell me how many miles you have run today ( __action__ is: __tell miles you have run__ and __output__ :  miles ran)
* Action take some input and also give back some output
    * If you go to Starbucks they take money and give coffee ( __action__ is: __get coffee__, __input__: money , __output__: coffee)

|    example                 |  action               |   input                     |    output
| ------------------         | ------------          |   -------------------       |---------------------|
|  run                       |    run                |    none                     | none                |
|  read "Harry Potter" book  |    read               |    "Harry Potter" book      | none                |
|  tell me miles you ran     |    tell miles you ran |    none                     | number of miles ran |
|  take money get coffee     |    get coffee         |    money                    | coffee              |

### Actions in programming
Lets define these actions in Java programming.

```java
    class Person{
        // no input
        // no output
        void run(){

        }

        // input : bookName
        // output: none
        void readBook(String bookName){

        }

        // input: none
        // output: miles ran
        int tellMeMilesRanToday(){
            return 10;
        }

        // input: money
        // output: coffee
        String getCoffee(int money){
            return "latte";
        }
    }
```

### Syntax
If you observe we have the syntax as

    void actionName(){

    }

    void actionName(inputVariables){

    }

    Datatype actionName(){
        return variableOfReturnDataType;
    }

    Datatype actionName(inputVariables){
        return variableOfReturnDataType;
    }

    inputVariables: comma separated variables. You know variables declaration by this time as every variable will be preceded by its daa type
        (int x,int y)
    Datatype : When you are returning (output) from a action you specify the just data type ( not variable)

    variableOfReturnDataType: when there is a output from action you should have return with actual value.

## Calculator sample
Lets define some examples. Lets build calculator class
* Create Java project with name as __CalculatorSample__
* Add class __Application__ (check __public static void main__ check mark as this is the class will have __main__ method)
* Add class __Calculator__ ( uncheck __public stati void main__ check box as this class __will not__ have __main__). (Only one class should have __main__ and you know why. When you run a program java starts from __main__ function )
* Fill the class like below

```java
    class Calculator{
        int add(int x, int y){
            int z;
            z = x+y;
            return z;
        }

        int sub(int x, int y){
            int z;
            z = x-y;
            return z;
        }
    }
```

#### add
__add__ method takes two inputs __x__ and __y__ and outputs (returns) of data type __int__

### How to use this action
In order to use this method we have to create object ( remember nothing but creating variable but now on wards you will be talking as __object__)

In __Application__ class and in __main__ method

```java
    Calculator c = new Calculator(); 
    int sum; 
    sum = c.add(2,3);
    System.out.println(sum);
```
If you observe above after creating object we call method with __dot__(.) operator

    c.add(2,3)

When a action returns (outputs) something then you can take this output with a variable like below
    sum = c.add(2,3);

You need to declare __sum__ variable before this (the data type of this variable is nothing but what action is returning. In above case __add__ is returning of type __int__ and hence the __sum__ has to be __int__ )

__Note__: we have been calling this as __action__ but technical term is  __method__ ( also called __function__)

### Scope
The variables declared in code block (remember code block starts with __{__ and ends with  __}__ )

In methods

```java
    class Calculator{
        int add(int x, int y){
            int z;
            z = x+y;
            return z;
        }

        int sub(int x, int y){
            int z;
            z = x-y;
            return z;
        }
    }
```
__add__ declares variable __z__ and this variable is __alive__ when it was declared and __dead__ after the end of __}__. The variable __z__ declared in __sub__ is totally different and hence we had declared again. The __z__ variable is no longer available after the return statement. This is called variable __scoping__ ( again remember for now the scope exists between code block __{ variable live and dead within this.}__)

## Homework
* Create session7 notes in __notes/session7.txt__ in git repository
* Project with creating methods.
    * Project name CarSample
    * Class Application.java with main
    * New class and name as __Car__
    * Add methods __start__ ( does not take anything and does not return anything)
    * In __start__ method add a print statement like below
        * System.out.println("starting the car")
    * Add methods __stop__ ( does not take anything and does not return anything)
        * System.out.println("stopping the car")
    * In Application class create Car object and call methods __start__ and __stop__
    * Check-in __homework__ folder in git repository





   






