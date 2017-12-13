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

Lets see in our class we have 2 Varuns. When we want to address a particular Varun we will use his __last name__ also so that there won'tbe any confusion. We have similar concept here which technical term is called __packages__. JDK comes lot of packages. Vision as each package is some kind of box. Each box(package) contains number of classes and they are unique in the package. You can have classes with the same name in different packages.

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

There are lot of JDK packages and  you can think of them 
![javapackagesamples](https://github.com/sairamaj/programmingclass/blob/master/images/javapackagesamples.png)
