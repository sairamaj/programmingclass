# Recap
* We have missed Session 20 notes
* We have review session in session 20 where we practiced some programming.

# static
# methods
We have have done static methods in last class. 
* The static methods are shared across all objects (they are not part of the objects). 
* static methods cannot access the class variables
* static methods are accessed using class instead of objects.

Below __add__ is not part of each object.
![staticvsnonstatic](https://github.com/sairamaj/programmingclass/blob/master/images/staticandnonstatic.png)

# fields
we can extend the static to fields also. 

```java
    class Math{
        static double PI = 3.14;
    }
```
Above __PI__ which is part of Math class can be __static__ as it is shared across all Math objects. We can access this field like below

```java
    class Application{
        static void main(String[] args){
            double piValue = Math.PI;
            System.out.println(piValue);
        }
    }
```

Lets draw a picture for the below Math class with 3 objects.
```java
    class Math{
        int previousValue;
        static double PI = 3.14;

        public int addSpecial(int x){
            int result = previousValue + x;
            previousValue = result;
            return result;
        }

        public static int add(int x, int y){
            return x+y;
        }
    }
```

![staticmethodandfield](https://github.com/sairamaj/programmingclass/blob/master/images/staticmethodandfield.png)

# Packages
Lets redefine the Math class like below

```java
    class Math{
        int previousValue;
        static double PI = 4.14;    // yes we know PI value is wrong but will help in using the right one, stay with me :)

        public int addSpecial(int x){
            int result = previousValue + x;
            previousValue = result;
            return result;
        }
    }
```

and you have used in Application class like below
```java
    class Application{
        public static void main(String[] args){
            double piValue = Math.PI;
            System.out.println("PI value is:" + piValue);
        }
    }
```

Now that you have written Math class and realized that there is another __Math__ class in __JDK__ which you want to use and keep your __Math__ also. How can we do this?

Lets see in our class we have 2 Varuns. When we want to address a particular Varun we will use his __last name__ also so that there won't be any confusion. We have similar concept here which technical term is called __packages__. JDK comes with lot of packages. Vision each package is some kind of box. Each box(package) contains number of classes and they are unique in the package. You can have classes with the same name in different packages.

As __Math__ from __JDK__ comes from __java.lang__ package we  need to specify package name along with class name if we want to use __Math__ from __JDK__

```java

public class Application {

	public static void main(String[] args) {
		
		double piFromJDK = java.lang.Math.PI;
		System.out.println("PI from JDK:" + piFromJDK);
		
		double myPIValue = Math.PI;
		System.out.println("My PI value:" + myPIValue);

	}
}
```
Above for the __java.lang.Math.PI__ is Math class from JDK and __Math.PI__ is our class. In future we will learn how we can create some packages  ourselves.

There are lot of JDK packages and  you can think of them as boxes with classes in it.
![javapackagesamples](https://github.com/sairamaj/programmingclass/blob/master/images/javapackagesamples.png)

# Array data type
Lets ask a question about your age and you will come up with one single answer. If I have another question like your favorite numbers you may come up with more than one number. In order to keep track of one number you will use data type __int__ and in order to have multiple values in a single variable you will be using __array__

```java
    int age;

    int favNumbers = new int[4];       // you can have 4 values.
    favNumbers[0] = 1;      // first number is at 0
    favNumbers[1] = 12;      // second number is at 1 .
    favNumbers[3] = 5;      // last number is at 3 
```

We will be using these arrays more in next class.

# Your First Graphic application
As we talked about reusing, we first need to look in JDK to see whether we can use any classes to do our stuff before writing our own. When you get a new X-box for your X-mas present and you don't know how to use it, You will be either looking in to the manual, goggling for instructions or asking help from a friend. Just like that you will be using online help or asking help from friend to see what are the classes in JDK and what it does to use in your application. 

Lets say you got a help that there is a class in JDK called __Frame__ which will help you in creating graphics application. Lets see how we can use it.

* Create a project called HelloGraphics
* Create class __Application__ with public static void main checkbox.
* In Applcation class we will be using __Frame__ like below
* you need to which __package__ Frame exists and again you got help that it exists in __java.awt__

```java
public class Application{
    public static void main(String[] args){
        java.awt.Frame f = new java.awt.Frame();
    }
}
```

When you run the above program nothing happens. That means you did not read instructions to use your X-Box. You need to know how to use it, some sample to make the window show up.

Ok let me help you. What we need is to set the window size by calling a method (you know how to call a method.)

There is a method call __setSize__ to set the size of window.

__Tip__: In Eclipse you can do variable and then type period and wait , then you should see a pop up  window show up which is help. Also you can press variable. (Ctrl+Space) to show this window.

![framesetsize](https://github.com/sairamaj/programmingclass/blob/master/images/framesetsize.png)

```java
public class Application{
    public static void main(String[] args){
        java.awt.Frame f = new java.awt.Frame();
        f.setSize(500, 500);
    }
}
```

When you run the above program again nothing happens. That means still you are missing something. There is a method to show the window.


```java
public class Application{
    public static void main(String[] args){
        java.awt.Frame f = new java.awt.Frame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
```

Now run the program and you should see a window appear. Hurry you have written your first GUI (Graphic User Interface) program.

At this time the window does not response (it does not close.). That means we need to some more things which we will do next class.

For now kill the program javaw.exe through task manager like below.

![endjavaw](https://github.com/sairamaj/programmingclass/blob/master/images/endjavaw.png)

## Putting your name as window title.
Lets show your name on window title.

```java

public class Application {

	public static void main(String[] args) {
		
		java.awt.Frame f = new java.awt.Frame("Sairama");
		f.setSize(500, 500);
		f.setVisible(true);
	}

}
```
Run the above program after changing your name above and you should see a window with your name in the title.

If you observe above we have used the __Constructor__ ( you know constructor is the same name as class name.) and has overloads ( you know overload means having the same method with different parameters)

![FrameconstructorWithName](https://github.com/sairamaj/programmingclass/blob/master/images/FrameconstructorWithName.png)

# Summary
* __static__ class variable
* __packages__
* __array__
* __graphic application__

# Homework
* Add a label to the above window
* Your window should like below
* ![guihomework](https://github.com/sairamaj/programmingclass/blob/master/images/guihomework.png)
* Tips
    * construct object of __Label__
    * add this lable object to the frame object you have created using __add__



