# Recap
* We have learned about how to write methods 
* Practiced method signature
* Wrote some basic methods
* Learned __this__ key word

# Method Overloading
Lets learn what we mean by overloading

Start with writing some method here. Create a project(choose your own name) and create Application class with main method in it.

```java
    public class Application{
        public static void main(String[] args){
            System.out.println("We are going to learn method overloading today");
        }
    }
```

Create a class called __Student__ like below
```java
    public class Student{
        string name;

        Student(String name){
            this.name = name;
        }
    }
```

## Reading a given book
Now we ask a student to read a given book
```java
    public class Student{
        void readBook(String bookName){
            System.out.println("Reading book:" + bookName)
        }
    }
```
Lets ask a student to read "Harry Potter" book
```java
    public class Application{
        public static void main(String[] args){
            Student s1 = new Student();
            s1.readBook("Harry Potter");
        }
    }
```

## Reading a given book for given number of minutes
Now we will ask student to read some book and also say how long he/she needs to read this book
```java
    public class Student{
        void readBook(String bookName){
            System.out.println("Reading book:" + bookName)
        }

        void readBook(String bookName, int minutesToRead){
            System.out.println("Reading book:" + bookName + " for " + minutesToRead);
        }
    }
```
Lets ask a student to read "Harry Potter" book
```java
    public class Application{
        public static void main(String[] args){
            Student s1 = new Student();
            s1.readBook("Harry Potter");        // ask student to read "Harry potter"
            s1.readBook("Harry Potter", 30);    // ask student to read "Harry potter" for 30 minutes.
        }
    }
```
## Reading a given book for given number of minutes and also ask him/her to read certain pages
Not only we specify book to read but also minimum number of minutes and minimum number of pages.
```java
    public class Student{
        void readBook(String bookName){
            System.out.println("Reading book:" + bookName)
        }

        void readBook(String bookName, int minutesToRead){
            System.out.println("Reading book:" + bookName + " for " + minutesToRead);
        }

        void readBook(String bookName, int minutesToRead, int pagesToRead){
            System.out.println("Reading book:" + bookName + " for " + minutesToRead + " and " + pagesToRead);
        }
    }
```
Lets ask to read "Harry Potter" for 30 minutes and also 20 pages
```java
    public class Application{
        public static void main(String[] args){
            Student s1 = new Student();
            s1.readBook("Harry Potter");        // ask student to read "Harry potter"
            s1.readBook("Harry Potter", 30);    // ask student to read "Harry potter" for 30 minutes.
            s1.readBook("Harry Potter", 30, 20);    // read "Harry Potter" for 30mintes and 20 pages.
        }
    }
```
## Lets give choice to read a book and number minutes and pages
```java
    public class Student{
        void readBook(String bookName){
            System.out.println("Reading book:" + bookName)
        }

        void readBook(String bookName, int minutesToRead){
            System.out.println("Reading book:" + bookName + " for " + minutesToRead);
        }

        void readBook(String bookName, int minutesToRead, int pagesToRead){
            System.out.println("Reading book:" + bookName + " for " + minutesToRead + " and " + pagesToRead);
        }

        void readBook(){
            System.out.println("Reading my own book for whatever minutes I want and pages");
        }
    }
```
Lets ask him/her to read their own choice of book
```java
    public class Application{
        public static void main(String[] args){
            Student s1 = new Student();
            s1.readBook("Harry Potter");        // ask student to read "Harry potter"
            s1.readBook("Harry Potter", 30);    // ask student to read "Harry potter" for 30 minutes.
            s1.readBook("Harry Potter", 30, 20);    // read "Harry Potter" for 30mintes and 20 pages.
            s1.readBook();      // choice of book, minutes, pages.
        }
    }
```

What we saw above is we have used the same method name __readBook__ but based on number of parameters the behavior is different. Also see in calling place where a method runs its parameters are matched with appropriate method in Student class.

See below picture which matches the calling a method and its actual method being called.

![overloadmatching](https://github.com/sairamaj/programmingclass/blob/master/images/overloadmatching.png)

__Method Overloading__ is a feature that allows a class to have __more than one method having the same name__, if their argument lists are different.

For overload to work the method parameters should be different. See below
```java
    class Student{
        void readBook(String bookName, int minutesToRead){

        }
        
        void readBook(String bookName, int pagesToRead){

        }
    }
```
If you see above methods,it wont work. You think arguments are different as first one is taking minutesToRead as second parameter and second one is taking pagesToRead. But it is not the variable names it is their data types which are (String, int) and second method also (String,int) and which are same and hence this will be compile error.

Below will work
```java
    class Student{
        void readBook(String bookName, int minutesToRead){

        }
        
        void readBook(int pagesToRead, String bookName){

        }
    }
```
as they are (String,int) which is different from (int,String)

# Char data type
We have learned so far below data types
* String (Used for values with characters, numbers )
* int( used for numbers only)
* double ( used for numbers with decimals)
* boolean ( used for either true or false)

```java
    String s1 = "Hello";
    int x = 10;
    double d = 10.5;
    boolean result = true;
```
Data type __char__ is used for storing a single character.
```java
    char grade = 'A';
    char genderType = 'M';
```

# Instructions in Method body
What I see is some of them getting confused where a instruction to computer ( like System.out.println("")) will go. 

__Java__ Project contains 
*   Multiple __classes__
    * A __class__ contains
        *  variables
        *  constructor
        *  methods
        A __method__ contains 
           * instructions

Method body ( __body__ is the part which begins with __{__ and ends with __}__) is where all instructions should go. That means
```java
    class Student{

        void readBook(String bookName){

            // Instructions go here (between { and } )

        }

        // No instructions (outside {})
    }
```



# Tip in Eclipse
## Auto Completion
    When you want to type either method name or variable name you can start typing some characters and then press enter to finish.
![eclipsetipformethod](https://github.com/sairamaj/programmingclass/blob/master/images/eclipsetipformethod.png)

For variables you can press Ctrl and Space then you will see variables.
![eclipsetipforvariable](https://github.com/sairamaj/programmingclass/blob/master/images/eclipsetipforvariable.png)


# Homework
* Create session14 notes and check it in notes directory as session14.txt
* Create a project and in that
    * Create a class called Player
    * Create a method 
        * play ( no inputs and no outputs)
        * getScore( gives back the points he/she scored)
            * return 100 for now.
        * create same method getScore(int gameNumber)
    * In Application class
        * Create a player
        * call methods play and getScore
        * print the score
        * call method getScore(10) and print the score.





