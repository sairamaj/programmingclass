# Recap 
* We are on freeway now (developing graphics calculator)
* While doing this we will be exiting freeway now and then and learn some concepts required to proceed.
* Once we learn we will be back on freeway and proceed to develop calculator

Lets exit the freeway and learn new data type __enum__

# Enum
* Lets write a program where we will ask person to eat fruit.
* Create __Application__ and __Person__ class
* Write a method __eatFruit__ in Person class and should look like below

```java
public class Person {
	
	void eatFruit(int fruit) {
		if (fruit == 1) {
			System.out.println("eating Apple");
		} else if (fruit == 2) {
			System.out.println("eating Banana");
		} else {
			System.out.println("dont know");
		}
	}
}
```

we will ask person to eat a fruit like below in Application class in main method

```java

public class Application {

	public static void main(String[] args) {

		Person p = new Person();
		p.eatFruit(1);
		p.eatFruit(2);
		
	}
}
```
When you run the above program you will see output as

eating Apple

eating Banana

If you see the method we need to remember 1 is Apple and 2 is Banana. Now you can pass any number which might not correspond to any fruit. This is the problem. Lets solve this problem

## Defining mapping through int
Add a class __Fruit__ to the project like below

```java

public class Fruit {
	static int Apple=1;
	static int Banana=2;
}

```

Modify the Application class like below
```java
public class Application {

	public static void main(String[] args) {

		Person p = new Person();
		p.eatFruit(Fruit.Apple);
		p.eatFruit(Fruit.Banana);
		
	}
}
```

We have defined __Apple__ as __static int Apple=1__.  We have used __static__ keyword with methods and it is the same concept to class variables where it is __shared__ and you use __class__ to call (instead of creating __object__)

we did not change eatFruit method in Person which still takes __int__ as input data type. But when we see we have improved our readability on calling side by passing __Fruit.Apple__ and __Fruit.Banana__. This is what you see in some Java code where methods may take as __int__ data type and it is easy to with defining a mapping like this.

Lets visit the Calculator sample where we have used this.
```java
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```
If you see above lines the __setDefaultCloseOperation__ is taking __int__ input but we were able to pass __JFrame.EXIT_ON_CLOSE__. This has been defined in __JFrame__ class like below

```java
class JFrame{
     public static final int EXIT_ON_CLOSE = 3;
}
```

you can call with 2 ways now.
```java
    
    // Not a recommended way but still works.
    f.setDefaultCloseOperation(3);

    // recommended way.
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```
Even though we have now easy way we still have the problem as somebody can call the method with invalid inputs like below
```java
    p.eatFruit(100);
```
we don't want somebody to pass some invalid data. Lets learn how we can achive this.

## enum
Lets add a new type to this project. This time when you go to File->New you will see __Enum_
![filenewenum](https://github.com/sairamaj/programmingclass/blob/master/images/filenewenum.png)


Give the enum name as __Fruit__.

As you already have __Fruit__ class in this (you might have use default package) you need to create this in new package. If you see in the window you will see a package name to enter. Give __enumlearn__ as package name and this time you should be able to add __Fruit__ enum like below

```java
package enumlearn;

public enum Fruit {
	Apple,
	Banana
}

```

Lets add new method in Person class like below

```java
	void eatFruit(enumlearn.Fruit f) {
		System.out.println("eating " + f);
	}
```
Lets use this method in Application class like below

```java
		Person p = new Person();
		p.eatFruit(enumlearn.Fruit.Apple);
		p.eatFruit(enumlearn.Fruit.Banana);
```
Now with new method we have 2 advantages
* Readability (now we know we are passing either Apple or Banana not 1 or 2)
* Also we cannot use invalid fruit (only things you can use are whatever defined in __Fruit__ enum)

# Passing objects as method arguments 
Lets try to develope a school enroll application. In this application a student will be enrolled in a school
. Here we have  __Student__ and __School__ class. __School__ will have method called __enroll__. Typically enrolling a student in school require lot of information like name, age, address, medical records, grade etc.,

Lets start writing the classes
```java
	class Student{
		String name;
		int age;
		int grade;
		String addressLine1;
		String addressLine2;
		String city;
		String zipCode;
		String country;
	}

	class School{

		// enrolling student in school
		void enrollStudent(String name, int age, int grade, String addressLine1, string addressLine2, String city, string zipCode, String countr){
			System.out.println("enrolling:" + name + " for grade:" + grade);
		}

	}
```

If you see above our enrollStudent takes lot of inputs which are required. But this is not the best way to do in java. We will refine the class like below

```java
	class School{
		void enrollStudent(Student s){
			System.out.println("enrolling:" + s.name + " for grade:" + s.grade);
		}
	}
```
our new enrollStudent method takes only one parameter which is of data type __Student__. In order to enroll a student in school one will create __Student__ object and pass it to __enrollStudent__ method like below

```java
class Application{
	public static void main(String[] args){
		
		Student s = new Student();
		s.name = "joe";
		s.grade = 8;
		s.age = 13;

		School sc1 = new School();
		sc1.enrollStudent(s);		// pass Student object.
	}
}
```

# class within class
When you define a class and its variables within it so far you have used basic data types like __String__, __int__ etc., But one can use __class__ ( remember class is data type just like basic data types) as data type for a variable. Lets create address class like below

```java
	class Address{
		String addressLine1;
		String addressLine2;
		String city;
		String zipCode;
		String country;
	}

	// lets use the address data type in student
	class Student{
		
		String name;
		int age;
		int grade;
		Address homeAddress;	
	}
```

If you are creating __Student__ object and wanted to fill his/her address then you need to create __Address__ object and then assign homeAddress to this like below

```java
	// creating Address and Student object
	Address a = new Address();
	a.addressLine1 = "17003 nw";
	a.city = "beaverton";
	a.zipcode = "97006";
	a.country = "usa";

	Student s = new Student();
	s.name = "sai";
	s.homeAddress = a;		// here you are assigning address.
```

## Summary
* We have learned to substitute __int__ with some readable form
* We have learned __enum__ (used when you have limited set.)
* We have seen methods taking objects as inputs
* We have seen class containing other class



