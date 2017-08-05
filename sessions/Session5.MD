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

