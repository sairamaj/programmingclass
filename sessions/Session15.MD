# Recap
* We have learned Method overloading
```java
    class Student{
        void readBook()}

        }
        void readBook(String name){

        }
        void readBook(String name, int minutesToRead){

        }
        void readBook(String name, int minutesToRead, int pageToRead){

        }

    class Application{
        public static void main(String[] args){
            Student s1 = new Student();
            s1.readBook();
            s1.readBook("Harry Potter");
            s1.readBook("Harry Potter",10);
            s1.readBook("Harry Potter", 10, 20);
        }
    }
    ![overloadmatching](https://github.com/sairamaj/programmingclass/blob/master/images/overloadmatching.png)
```
* Char data type
```java
        char grade = 'A';       // can take only single letters.
```

# Constructor Overloading
What we have learned so far is a __constructor__ is just like any other __method__ which takes some inputs and has some method body ( code between __{}__ ) with the exception of
* You don't have choice on method name as its name is as same as __class__ name
* It does not have return type
```java
    class Student{
        String name;

        Student(String name){
            this.name = name;
        }
    }
```

What this means is whatever we have learned __method overloading__ works for __constructors__ also ( as constructor is method)

```java
    class Student{
        String name;
        int age;

        Student(String name){
            this.name = name;
        }

        Student(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    class Application{
        public static void main(String[] args){
            Student s1 = new Student("Joe");        // Uses the first constructor which takes only name
            Student s2 = new Student("Joe", 13);    // Uses the second constructor which takes both name and age.
        }
    }
```
## Why Constructor is called Constructor?
As we have seen __constructor__ is special method, but why it is called constructor? The reason is, you can use this method only when creating object and not any other time ( regular methods you can use as many times as you want)
```java
 class Student{
        String name;
        int age;

        Student(String name){
            this.name = name;
        }

        Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        void readBook(){

        }
    }

    class Application{
        public static void main(String[] args){
            // Method Student(String) is being used(called) while creating object s1
            Student s1 = new Student("Joe");        

            // Method Student(String,int) is being used(called) while creating object s2
            Student s2 = new Student("Joe", 13);    // Uses the second constructor which takes both name and age.

            // Below will not work as you cannot call constructor again.
            // s1.Student("bob");

            // You can call readBook more than once.
            s1.readBook();
            s1.readBook();
        }
    }
```
# Method defining vs Method calling
You need to know the difference between method defining and then using it (or calling it).

## Defining a method
When you defining a method you are creating a index card which contains the following
* Name
* Inputs
* Outputs
* Instructions 

Picture here.

This is like you created this index card and put it in your pocket. Just because you have written instructions on a card does not mean somebody will follow it. You have to give this card to somebody and ask him to follow the __instructions__. While giving this card , if the card says any __inputs__ then you have to give him to that person and if the card says __outputs__ then you can expect from that person.

Creating a index card(where you do once) is like __defining method__

Somebody using this card and following the instructions(taking inputs and giving outputs) is like __using__ or __calling__ where you can do more than once.

# Methods calling other Methods
The method we have written __readBook__ like below will have generally multi steps like checking out the book from library, reading the book and returning the book back to library which we can define in another methods like below

```java
    class Student{
        String name;
        
        Student(String name){
            this.name = name;
        }

        void readBook(String bookName){
            checkOutFromLibrary(bookName);
            readTheBook(bookName);
            returnBookToLibrary(bookName);
        }

        void checkOutFromLibrary(String bookName){
            System.out.println("Checking out book:" + bookName + " from library");
        }

        void readTheBook(String bookName){
            System.out.println("Read the book out book:" + bookName + " now");   
        }

        void returnBookToLibrary(String bookName){
            System.out.println("Returning the book:" + bookName + " back to library");
        }
    }

    class Application{
        public static void main(String[] args){
            Student s1 = new Student("Joe");
            s1.readBook("Harry Potter");
        }
    }
```

If you see above __readBook__ calls the methods. When calling the methods inside its own class it can use just the method name and any parameters. Here are passing the same bookName
```java
     void readBook(String bookName){
            checkOutFromLibrary(bookName);
            readTheBook(bookName);
            returnBookToLibrary(bookName);
        }
```
When you are calling readBook in Application class you are using the object name like below
```java
class Application{
        public static void main(String[] args){
            Student s1 = new Student("Joe");
            s1.readBook("Harry Potter");
        }
    }
```
When inside class and calling the method which exists in the same class then you can use just the method name.

## Hiding the details
Lets say instead of asking the student to read the book, ask him to checkout from library, read the book and forget to return the book to library
```java
class Application{
        public static void main(String[] args){
            Student s1 = new Student("Joe");
            s1.checkOutFromLibrary("Harry Potter");
            s1.readTheBook("Harry Potter");

            // forgot to ask him to return the book.
        }
    }
```
We have problem here. We are asking the student to do each individual step instead of asking him to read the book (and let him/her to figure it out how to get book) and also in the process we forgot to tell him/her to return the book. Student need not be told each and every step and instead of just readBook method and should not be allowed to dictate individual steps. What we should do is not allow checkOutFromLibrary, readTheBook, returnToLibrary outside Student class and java allows this by specifying __private__ keyword like below

```java
        private void checkOutFromLibrary(String bookName){
            System.out.println("Checking out book:" + bookName + " from library");
        }

        private void readTheBook(String bookName){
            System.out.println("Read the book out book:" + bookName + " now");   
        }

        private void returnBookToLibrary(String bookName){
            System.out.println("Returning the book:" + bookName + " back to library");
        }

```
Now one cannot even call checkOutFromLibrary outside Student class and only method allowed is readBook. This way of __hiding__ the details by using  __private__ keyword is part of one of the OOPs (Object Oriented Programming) principalscalled __Encapsulation__

__Encapsulations__ has two parts
* Hiding the details
* Packaging related things.
    * In student we have include only related to Student (name, age, grade) but not breed (which applies to animals)

# One more time the difference of method defining and calling method
I want you to differentiate what we mean by defining a method and calling method as this is important.

## Defining the method
Preparing the index card with some instructions and giving it some name like below
 ![methoddefining](https://github.com/sairamaj/programmingclass/blob/master/images/methoddefining.png)

Using(calling) the method is ask them to follow the instruction in the card.
![methoddefining](https://github.com/sairamaj/programmingclass/blob/master/images/usingmethods.png)
