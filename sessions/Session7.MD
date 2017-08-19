## Syntax
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

You can fill properties in the class just like any other variables you define.

```java
    class Person{
        String name;
        int age;
        int grade;
    }
```


