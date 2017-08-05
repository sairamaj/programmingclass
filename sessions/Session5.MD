Today class is more working samples based on last class __if__ and __for__ statements which we have discussed.
We have discussed how to approach a problem and convert in to working program.

### Taking input from user
```java
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		System.out.print("first number:");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		
		System.out.print("second number:");
		int secondNumber = scanner.nextInt();
	}
}
```
In above we are declaring variable __scanner__ of type __Scanner__ ( we will learn in future about these data types). From variable __scanner__ you can call method __nextInt()__ to get user input. Don't worry about these lines as we will learn what exactly they mean in future classes.


### Steps involved in writing program
#### Step 1
Understand what the program is supposed to do. This is very important and called __requirements__ in real software. Have a mental picture how the working program will look like even if you have no idea how you are going to write it. 

For example when we discussed about the program to find out minimum and maximum numbers given 2 numbers, need to think of the working program will have

* A program called MinMaxSample exists
* When we run this program it will ask
    * First number:
    * Second number:
    * prints as
    * minimum number is:
    * maximum number is:

#### Step 2
Forget about the program but how you are going to do solve this.
Take some sample data and run through your mind.
For example in above case what happens 2 numbers are __10, 20__ then it should print minimum  number is :__10__ and maximum is __20__. If I give another set like __40, 20__ then it should give minimum number as __20__ and maximum is __40__
How did you determine which number is minimum and maximum between these 2 numbers. It was not first number always. What you did is you have asked yourself a question , whether first number is less that second number. If YES then minimum is first number otherwise minimum is second number. Usually the questions like this will be come logical conditions like __if__ in programing. you can start typing this in plain English like below

    if first number is less than second number then
        minimum = first number
        maximum = second number
    otherwise
        minimum = second number
        maximum = first number

#### Step 3

Now you can start putting in program. Questions like __is__ will be come __if__ ,  phrases like __otherwise__ will become __else__

#### Write syntax first
```java
    if(){

    }else{

    }
```
As we have learned in last class the __if__ block will take anything __yes or no__ (true/false). you can take your above written sentences and convert in to logic
```java
    if( firstNumber < secondNumber){
        System.out.println("Minimum is:" + firstNumber);
        System.out.println("Maximum is:" + secondNumber);
    }else{

        System.out.println("Minimum is:" + secondNumber);
        System.out.println("Maximum is:" + firstNumber);
    }
```


### Another conditional program
Do you know what is the value of 5/2? . It can be either 2.5 or 2 based on data types.
```java

		int x = 5;
		int y = 2;
		System.out.println(x/y);

		double x1 = 5;
		double y1 = 2;
		System.out.println(x1/y1);
```
x/y will get __2__ and x1/y1 will get __2.5__

There is another operator __%__ which will get __reminder__.
* 5 % 2 = 1
* 6 % 2 = 0
* 7 % 2 = 1
* 8 % 2 = 0

We are going to use this __%__ operator to find out whether number is __even__ or __odd__

#### pseudo logic

    is number % 2 value is 0 then
         number is even
    otherwise 
        number is odd
```java

    import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("give number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		// number % 2 is zero it is even
		// else it is odd
		
		if(number %2 == 0) {
			System.out.println(number + " is even");
		}else {
			System.out.println(number + " is odd");
		}

	}
}

```

### Program using for loop
As we have learned and did last class __for__ we did some exercise using __for__ loop.

#### Requirement
    Program should able to take a number from user and should print multiplication table up to 10. 
    
    for example if user gives 3 then
        3
        6
        9
        12
        ...
        ...
        30

    enhanced form of this program should print in the following format
       3 * 1  = 3
       3 * 2  = 6
       3 * 3  = 9
       3 * 4  = 12
       ...
       ...
       3 * 10  = 30

#### Pseudo logic
    
    Here we need to print 10 times starting from 1
    We can think of something like this
    number = user input
    starting from 1 to 10
        number * counter

#### Actual program logic
As we have learned __for__ is the for repetition do first the syntax
```java
    for( ;   ;  ){

    }
```
* If you know in the first part of __for__ is initialization like __i=0__
* Second part is condition where till true the loop should continue. __number <= 10__
* Third part is increment in this case __i=i+1__
* Next is body of the for ( in between __{__ and __}__ )

With the above thing in mind the final program will be
```java
import java.util.*;
public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("table number:");
		int number = scanner.nextInt();
		for(int i=1; i<=10; i++) {
			int answer = number * i;
			System.out.println(answer);
		}
	}
}

```

Printing the answer along with table number is:

```java
import java.util.*;
public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("table number:");
		int number = scanner.nextInt();
		for(int i=1; i<=10; i++) {
			int answer = number * i;
			System.out.println(number + " *" + " " + i + " = " + " " + answer);
		}
	}
}
```

### Easy Navigation in Eclipse
You can use short keys to do speed up your coding in windows (also in mac).

    ![accelerationkeys](https://github.com/sairamaj/programmingclass/blob/master/images/accelerationkeys.png)

If you observe above you can see there is __underline__ for each characters in the menu. What is this means if you press __Alt key__ ( for example __Alt F__ will select the __File__ menu)

    ![filenewjavaproject](https://github.com/sairamaj/programmingclass/blob/master/images/filenewjavaproject.png)

By typing __Alt F__  and pressing Enter twice you will be in creating new Java project. 

### Homework
* Create session5 notes and check it in notes directory as session5.txt
* Create a program which tells the school type based on user entered.
   * Project name: SchoolTypeApp
   * Class name: Application.java
   * Should Ask the user about the grade
   * Based on user entered
     * less than 5th , should print __Elementary School__
     * between 6th and 8 should print __Middle School__
     * between 9th and 12th should print __High School__
     * above 12th should print as __College__
* Create program which will tell how man calories will burn on total runs
    * Project name: RunTimeCalculator
    * Class name: Applcation.java
    * Ask the user
        * Give number of laps run:
        * for each run
           * ask how much time taken
        * Finally print total time taken for all laps.

__Note__: Check the home work under HomeWork5 folder ( change Eclipse workspace to Homework5 directory for the projects to be created in Homework5 so that you can check in git using standard git commands)








