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

