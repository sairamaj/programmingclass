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
Lets discuss about the methods and syntax( also called signature) of it.

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

![methodreturn](https://github.com/sairamaj/programmingclass/blob/master/images/methodreturn.png)

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
To complete the __canDrive__ method with Oregon law, you need to write the logic(steps) in the function
```java
    class Person{
        String name;
        int age;

        // always create 2 blank lines between variables and the rest of the methods.
        // In Java method name starts with lower case letter.
        boolean canDrive(){
            if(age >=15){
                return true;        // can drive.
            }else{
                return false;       // cannot drive.
            }
        }
    }
```

### Calling method and using return values and providing inputs
If you have method like below
```java
    class Student{
        String name;

        public void doHomeWork(){
            System.out.println(name + " doing homework");
        }
    }
```

When you run the above program the statement "doing homework" does not appear. why? When you are defining a method you are writing instructions and grouping them with a method. They are not being used. Remember __class__ is a template(cookie cutter) and just like that __method__ is template and unless we use that computer wont run these instructions. Lets how we do that

#### Calling ( using the method)
```java
    public class Application{
        public static void main(String[] args){
            Student s1 = new Student();
            s1.name = "bob";
            // Asking bob to do homework
            s1.doHomeWork();

            Student s2 = new Student();
            s2.name = "joe";
            // Asking joe to do homework
            s2.doHomeWork();
        }
    }
```

When you execute the above program then you will see the below output

```java
    bob doing homework
    joe doing homework
```

If you observe there is a difference between accessing class variables and methods. For methods you use __()__ and provide any input.

```java
    s1.name = "bob";        // just like any other variable assignment.
    s1.doHomeWork();        // use () to provide input. Here we don't have any inputs.
```
#### Providing inputs 
Some methods take input and when you are calling (now you know the difference between __defining__ and __calling__).

```java
    class Student{

        void readBook(String bookName){
            System.out.println("reading book :" + bookName);
        }
    }
```
If you want to call(use) this method and pass input parameters
```java
    Student s1 = new Student();
    s1.readBook("Harry Potter");
```
Use __()__ and pass input parameters. As the __readBook__ is taking one parameter and its data type is __String__ , you can pass any value which corresponds to string.

The same goes with multiple inputs
```java
    class Student{
        String name;

        // Method which is asking to read a given book for specified number of minutes.
        void readBook(String bookName, int minutesToRead){
            System.out.println("reading book :" + bookName + "  for:" + minutesToRead);
        }
        
    }
```
and to call
```java
    Student s1 = new Student();
    s1.name = "bob";
    s1.readBook("Harry Potter",60);     // asking student "bob" to study "Harry Potter" for 60 minutes.
```
where you specify each parameter with __,__ and parameters order matters, as readBook is taking book name and minutes to read which are of data type __String__ and __int__ respectively ,you need to use __String__ data type value and __int__ data type value.

#### Using Return values specified by method
As the method give back something (like readBook is giving how many minutes were read) and in calling place we can get back like below

```java
    int numberOfMinutesRead = s1.readBook("Harry Potter",60);
    System.out.println("Number of minutes read:" + numberOfMinutesRead);
```
As readBook is returning the __int__ data type, one needs to define a __int__ variable which we have done above (numberOfMinutesRead is int variable)

### Constructor revisited
We have seen constructor earlier. Lets revisit one more time as we have learned about methods.

A constructor is 
* method ( it has inputs just like any other method)
* special method 
    * Its name is same as class type
    * It does not have return data type ( you cannot say __void__ also);
```java
    class Student{
        String name;
        int age;

        // method name: Student ( same as class name)
        // no return type specified ( not even void)
        Student(String inputName, int inputAge){
            name = inputName;
            age = inputAge;
        }
    }
```
You can create objects
```java
    Student s1 = new Student("bob",13);
    Student s2 = new Student("joe",30);
```
When creating a object , you will realize why this special method is called __Constructor__. When creating object  you are passing parameter and during this period it uses this special method (see its inputs matching with method) and hence called Constructor.

### this special keyword
In above samples we have defined the constructor like below
```java
    class Student{
        Student(String inputName, int inputAge){
            name = inputName;
            age = inputAge;
        }
    }
```
where inputName is the input for the name and inputAge for the age. Instead of using input for the variables prefix we want to use regular variable names like __name__ and __age__ like below
```java
    class Student{
        String name;
        int age;

        Student(String name, int age){
            name = name;
            age = age;
        }
    }
```
But when we say
```java
    name = name;
    age = age;
```
then we got some confusion. which name is class variable and which name is input to the method. Here is where the keyword __this__ is useful. Lets see the below constructor again.

```java
    class Student{

        String name;
        int age;

        Student(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
```
When you say __this.name__ then it is referring to class variable and the one without __this__ is input to the method.

![showingthis](https://github.com/sairamaj/programmingclass/blob/master/images/showingthis.png)

### Some Eclipse useful tips
When you are trying to access variables or methods of an object , as soon as you type intellisense will show you the methods and variables and you can highlight the one you want and press enter key word which will fill the method automatically. You don't have to type the entire method name yourself.

### Homework
* Create session13 notes and check it in notes directory as session13.txt
* Create a project and in that
    * Create a class called Player
    * Create a method 
        * play ( no inputs and no outputs)
        * getScore( gives back the points he/she scored)
            * return 100 for now.
    * In Application class
        * Create a player
        * call methods play and getScore
        * print the score




