# Recap
* We have learned about Constructor
* Constructor will allow to create object with some starting values.
* We will revisit once again Constructor after going through some methods

# Methods
We have discussed about methods( which are nothing but actions) [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session7.MD#actionsmethodsfunctionsbehavior). Please read this once again as this was discussed in depth. 

We will write some methods in class like below
```java
    class Person{
        String name;
        int age;

        /*
            method: doHomeWork
            input : none   ( does not take anything)
            output: none   ( does not give anything back)
        */
        void doHomeWork(){
            System.out.println("reading home work");
        }

        /*
            method: readBook
            input : bookName  ( book to be read)
            output: int   ( number of minutes to be read)
        */
        int readBook(String bookName){
            System.out.println("Reading book here");
            return 10;      // read 10 minutes
        }
    }
```
## Method Syntax
Lets discuss about the methods and signature of it.

### Steps for writing method signature
* First you have to ask for method name
* In above these 
    * doHomeWork
    * readBook
* Then you have to ask for what is inputs
    * for doHomeWork there are no inputs
    * for readBook there is one input called __bookName__ and then you have to ask for what is its __data type__
* Then you have to ask for what it gives back
    * for doHomeWork there is no output
    * for readBook the output is number of minutes read. 
Now we are ready to write the method signature
1. method name
```java
    doHomeWork
    readBook
```
2. Write open and close parenthesis
```java
    doHomeWork()
    readBook()
```
3. Write open __{__ and close __}__
```java
    doHomeWork(){

    }

    readBook(){

    }
```
4. Write any inputs in parenthesis. If no inputs then no need to write anything
```java
    doHomeWork(){

    }

    readBook(String bookName){

    }
```
5. Write output data type (here it is the data type and not the variable). If it is not returning anything then  you have to write __void__
```java
    void doHomeWork(){

    }

    int readBook(String bookName){

    }
```

6. Write a __return__ statement which matches with __data type__ .
```java
    void doHomeWork(){
            // No return statement here.
    }

    int readBook(String bookName){

        return 10;      // The value returned (10 here) should match with data type(int here) mentioned.
    }
```

7. Now complete the logic if any in the method

## Lets practice some methods here
We are going to write __Person__ and going to have a method which gives whether a person can drive or not.

* Create a new Java Project (ex:project name MethodLearning) in Eclipse
* Create a new __Application__ class with public static void main check box
```java
    public class Application{
        public static void main(String[] args){

        }
    }
```
* Create a new class __Person__ in this project
* Create __name__ and __age__ as class variables
```java
    class Person{
        String name;
        int age;
    }
```
* Now we are going to write method which can give whether a person can drive or not based on current Oregon law.
* method name
    * canDrive
* inputs
    * none
* output
    * yes/no ( in java programming yes/no can be done by __boolean__)
```java
    class Person{
        String name;
        int age;

        // always create 2 blank lines between variables and the rest of the methods.
        // In Java method name starts with lower case letter.
        canDrive
    }
```
* Add __()__ and __{}__
```java
    class Person{
        String name;
        int age;

        // always create 2 blank lines between variables and the rest of the methods.
        // In Java method name starts with lower case letter.
        canDrive(){

        }
    }
```
* Add return data type
```java
    class Person{
        String name;
        int age;

        // always create 2 blank lines between variables and the rest of the methods.
        // In Java method name starts with lower case letter.
        boolean canDrive(){

        }
    }
```
* Add __return__ in the method
```java
    class Person{
        String name;
        int age;

        // always create 2 blank lines between variables and the rest of the methods.
        // In Java method name starts with lower case letter.
        boolean canDrive(){

            return true;        // At present everybody can drive.
        }
    }
```
* At this time we have method is complete (except our own logic which depends upon method)
* Lets create a __object__ in Application class and use the method.
```java
    public class Application{
        public static void main(String[] args){
            
            Person p1 = new Person();
            p1.name = "bob";

            // You pass inputs between ()
            // You take the return value on left hand side.
            boolean drivable =  p1.canDrive();

        }
    }
```

rest is coming....