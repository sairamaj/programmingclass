# Quiz
As promised last class we will be doing one quiz before starting the class. These are the notes for 2 sessions and hence we will have 2 quizs.


## Write program for the below pattern
### The pattern is
  |  Input   |   Output                                       
  | ---------|-----------|
  |    1     |    1      |
  |    2     |    3      |
  |    3     |    6      |
  |    4     |   10      |
  |    5     |   15      |
  |    6     |   ?       |
  |    7     |   ?       |
  |    -     |   ?       |
  |    n     |   ?       |

  If you observe the numbers given input there is output and a pattern exists. The pattern is for the nth number is 1+2+3+4....+n. (for 1 it is 1 and 2 it is 1+2 and for 3 it is 1+2+3 and so on)

  What we need is a program given input number (for now we can put the input number value in the program itself) the output should be printed.

  Before converting to program think about how  you will do in the paper. As you see there is a repetition in pattern we need to use __for__ loop. 
  
  Lets start with above information
``` java
public class Application{
  public static void main(String[] args){
      int input = 3;    // lets start with 3 where we know the output should be 6

      for(int i=1; i<=input; i++){
          System.out.println(i);
      }
  }
}
```
The above program will print as 1,2,3

Now we need to introduce the variable __output__ which can be used in the loop to add the __i__ variable. The program will look like below

``` java
public class Application{
  public static void main(String[] args){
      int input = 3;    // lets start with 3 where we know the output should be 6
      int output = 0;
      for(int i=1; i<=input; i++){
          output = output + i;   // add i to the previous output.
      }

      System.out.println(output);
  }
}
```
variable __output__ will be come like below

  |  i       |   Output  |                         
  | ---------|-----------|
  |    1     |    1      |
  |    2     |    1+2=3  |
  |    3     |    3+3 =6 |

finally the output will be __6__.

You can change the input to different values and try.

## Debug
When program written and is not working as expected we call there is a __bug__ in the program which is saying some __error__ in the program. Finding out that error in the program is process called __debugging__. Lets use our __eclipse__ editor to see how a debugging is done.

```java
public class Application{
  public static void main(String[] args){
      int input = 3;    // lets start with 3 where we know the output should be 6
      int output = 0;
      for(int i=1; i<input; i++){
          output = output + i;   // add i to the previous output.
      }

      System.out.println(output);
  }
}
```

when you run the above program it prints the value as __3__ instead of __6__. That means we have a __bug__ and lets __debug__ to find out the problem.

In eclipse double click on the gray bar (on left hand side) on line 6 then  you will see small circle like below

![debug breakpoint](https://github.com/sairamaj/programmingclass/blob/master/images/debugbreakpoint.png)

You can also get this by going __Run__ menu and then select __Toggle Breakpoint__ like below

![debug breakpoint through menu]
(https://github.com/sairamaj/programmingclass/blob/master/images/debugbreakpointthrumensu.png)

Usually you use __Run__ command to run the program which does all the instructions. With debugging you can ask program to stop on the first break point you had put ( in above we have put a break point on  __int input=3__ )
Lets  do Run with debug 

![debug breakpoint](https://github.com/sairamaj/programmingclass/blob/master/images/rundebug.png)

When you run with debug you will see Debug perspective dialog box and press OK to it.

Then you will see similar to the below screen.  

![debug run window](https://github.com/sairamaj/programmingclass/blob/master/images/debugrunwindow.png)

What is happening here is program executed up to line number 6 and then stopped ( remember when you run the program it will be run line by line.). 

### Step Over
On top of the screen you will see toolbar and lets see what __Step Over__ will do. When you click the program will execute (run) the current line and move on to the next line.

![stepovernextline](https://github.com/sairamaj/programmingclass/blob/master/images/stepovernextline.png)

### Variables window
There will be window on the screen where all your variables in the current method will be shown like below

![debugvariables](https://github.com/sairamaj/programmingclass/blob/master/images/debugvariables.png)

You can observe one more thing here is a yellow bar appearing in variable window showing that particular variable changed its value which will allow you to pay attention.

Keep clicking __Step Over__ button and you will see program will move line by line and also in for loop it will go up and start executing.

While you  stepping over like this in for loop, you will see only 2 times going in instead of 3 times as you expect. Remember __for__ loop where the condition in 2nd part will decide how many time loop will run. If you see our condition is like __i < input__ and should be __i <= input__.

### Will Debug will show the problem?
NO. It will not show it will give the __clues__ and  you need to find out what is the problem from the clues just like detective solves the problem from the clues.


