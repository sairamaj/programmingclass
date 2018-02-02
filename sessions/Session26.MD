# Switch statement
Lets learn what a __switch__ does. To understand this lets write small program using __if__ statements.
```java

public class Person {

	void eatFruit(int fruitType){
        if(fruitType ==1 ){
            System.out.println("Eating apple.");
        }else if(fruitType == 2){
            System.out.println("Eating banana.");
        }else if(fruitType == 3){
            System.out.println("Eating orange.");
        }else if(fruitType == 4){
            System.out.println("Eating grape.");
        }else if(fruitType == 5){
            System.out.println("Eating pineapple.");
        }else{
            System.out.println("Dont' know which fruit.");
        }
    }
}

```
In above program we have __eatFruit__ which takes fruit type as parameter and based on this takes a decision. In order to use this we can create Person object and call eatFruti like below

```java
class Application{
    public static void main(String[] args){
        Person p = new Person();
        p.eatFruit(1);
    }
}
```

If you see __eatFruit__ method has lot of if and else if conditions which becomes difficult to understnd. We can make little easy way of using these __if__ and __else if__s like below

```java

public class Person {

	void eatFruit(int fruitType) {
		switch (fruitType) {
		case 1:
			System.out.println("Eating apple.");
			break;
		case 2:
			System.out.println("Eating banana.");
			break;
		case 3:
			System.out.println("Eating orange.");
			break;
		case 4:
			System.out.println("Eating grape.");
			break;
		case 5:
			System.out.println("Eating pineapple.");
			break;
		default:
			System.out.println("Dont' know which fruit.");
			break;
		}
	}
}

``` 

If you observe above it works like __if__ statement. __switch__ is alternative to __if__ . We can use __switch__ whenever we have __if__ with lot of else ifs. __switch__ makes easy to understand compared to __ifs__. 

in switch the variable to be checked will be present and each __case__ is like condition. In above we have 
```java
    case 1:
        System.out.println("Eating apple");
        break;
```
__case 1__ can be read as __(fruittype == 1)__ and __case 2__ can be read as __(fruittype ==2)__. finally you need __break__ statement after each case statement to stop.

# Calculator
Lets get back to caculator application again. Last time we had __NumberPanel__ which extends __JPanel__ and all the number buttons we have placed inside. We broke the all code in to reusable individual classes. Lets create one more class called __OperationalPanel__ which extends __JPanel__ and will be used for showing calculator operations like '+', '-' ,'/', '*','='

```java
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class OperationalPanel extends JPanel{
	OperationalPanel(){
		// Create layout with 5 rows 1 column
		GridLayout layout = new GridLayout(5, 1);
		// Note: You will be setting this layout.
		setLayout(layout);
		Font font = new Font("Serif", Font.BOLD, 66);

		
		// create '+' button
		JButton plusButton = new JButton("+");
		plusButton.setFont(font);
		// add this to panel
		super.add(plusButton);
		
		// create '-' button
		JButton minusButton = new JButton("-");
		minusButton.setFont(font);
		super.add(minusButton);
	
		// create '*' button
		JButton multiplyButton = new JButton("*");
		multiplyButton.setFont(font);
		super.add(multiplyButton);
		
		// create '/' button
		JButton devideButton = new JButton("/");
		devideButton.setFont(font);
		super.add(devideButton);
		
		// create '=' button
		JButton equalToButton = new JButton("=");
		equalToButton.setFont(font);
		super.add(equalToButton);
		
	}
}

```

As we have created __OperationalPanel__ we need to create a object and add this to frame like below
```java
		// add operational panel to frame
		OperationalPanel opPanel = new OperationalPanel();
		frame.add(opPanel);
```

Full Application code
```java
// Importing Color and other related classes
import java.awt.*;
//Importing Swing apis (JFrame,JPanel,JButton) classes
import javax.swing.*;

public class Application {

	public static void main(String[] args) {

		// Create frame which holds panels	
		// create frame with title through constructor
		JFrame frame = new JFrame("Calculator");
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Lets make 2 columns 
		// On first column we will put number panel
		// on second column we will put operational panel
		GridLayout layout = new GridLayout(1,2);
		frame.setLayout(layout);
		
		// create NumberPanel (which will create buttons and add it)
		NumberPanel numberPanel = new NumberPanel();
		numberPanel.setBackground(Color.BLACK);
		// add panel to the frame
		frame.add(numberPanel); 
		
		// add operational panel to frame
		OperationalPanel opPanel = new OperationalPanel();
		frame.add(opPanel);
		

		// Make visible at the end so that button and panel will show up
		frame.setVisible(true);
	}
}
```
# Summary
* Learned __switch__
* Created __OperationalPanel__ and added to frame.

# Homework
* We need to practice writing methods in class
* Create a class called Student
    * method not taking any inputs and outputs
        * doHomework
        * inputs: none
        * output: none
    * method taking one input no outputs
        * readBook
        * input: bookName
        * output : none
    * method taking 2 inputs and no outputs
        * readBook
        * inputs: bookName and numberOfMinutes
        * outputs: none
    * method not taking any inputs but returning output
        * getNumberOfHoursPlayed
        * input: none
        * output: number of hours played.
    * method taking 2 inputs and one output
        * play
        * inputs: gamename, numberOfMinutesPlayed
        * output: result (won/lost)