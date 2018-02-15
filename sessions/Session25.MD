# Recap
* We have started our Calcualtor sample
* During the process we have learned replacing magic numbers with __static__ members and then with __enum__

This class lets continue our journey on Calculator. We have finished creating window and placing a single button. visit [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session23.MD)

Lets see the code 
```java
   JFrame f = new JFrame();
    f.setSize(1000,1000);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // create Panel
    JPanel p = new JPanel();
    p.setBackground(Color.BLUE);
    f.add(p);		// add panel to the 

    
    // create button
    JButton b = new JButton();
    b.setText("1");
    p.add(b);	// adding button to panel
    
    // Make visible at the end so that button and panel will show up
    f.setVisible(true);
```
Before moving on lets change the variables names and some comments. Variable names are important in understanding the flow of logic and comments make them to see why we are calling some methods

### Program with renaming variables and comments
```java
// Importing Color and other related classes
import java.awt.*;
//Importing Swing apis (JFrame,JPanel,JButton) classes
import javax.swing.*;

public class Application {

	public static void main(String[] args) {

		// Create frame which holds panels
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create Panel
		JPanel numberPanel = new JPanel();
		numberPanel.setBackground(Color.BLACK);
		// add panel to the frame
		frame.add(numberPanel); 

		// create button
		JButton numberButton = new JButton();
		numberButton.setText("1");
		// adding button to panel
		numberPanel.add(numberButton); 

		// Make visible at the end so that button and panel will show up
		frame.setVisible(true);
	}
}
```

With above we will see window with one button (don't worry the text size is small, we will fix it.)
![calculator_onebutton](https://github.com/sairamaj/programmingclass/blob/master/images/calculator_onebutton.png)

### Adding all numbers
In order to add all 10 numbers we need to add 10 buttons. One way to add is
```java
    JButton buttonOne = new JButton("1");
    numberPanel.add(buttonOne);

    JButton buttonOne = new JButton("2");
    numberPanel.add(buttonOne);

    JButton buttonOne = new JButton("2");
    numberPanel.add(buttonOne);
```

But we have learned __for__ loop which is for repetition which we can use here

```java
		// create 10 buttons
		for(int i=0; i<10; i++) {
			// setText method takes String data type and we have i here as Int
			// Again we need to look for a method for converting a number in to string
			// Looks like there exists one called Integer class
			String buttonText = Integer.toString(i);
			// Above method converts a Int data type to String type
			// Input: number of data type Int
			// Output: String data type
			JButton numberButton = new JButton();
			numberButton.setText(buttonText);
			// adding button to panel
			numberPanel.add(numberButton); 
		}
```

Full program

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

		// create Panel
		JPanel numberPanel = new JPanel();
		numberPanel.setBackground(Color.BLACK);
		// add panel to the frame
		frame.add(numberPanel); 

		// create 10 buttons
		for(int i=0; i<10; i++) {
			// setText method takes String data type and we have i here as Int
			// Again we need to look for a method for converting a number in to string
			// Looks like there exists one called Integer class
			String buttonText = Integer.toString(i);
			// Above method converts a Int data type to String type
			// Input: number of data type Int
			// Output: String data type
			JButton numberButton = new JButton();
			numberButton.setText(buttonText);
			// adding button to panel
			numberPanel.add(numberButton); 
		}

		// Make visible at the end so that button and panel will show up
		frame.setVisible(true);
	}
}

```
![calculator_tenbuttons.PNG](https://github.com/sairamaj/programmingclass/blob/master/images/calculator_tenbuttons.png)

Now we have 10 buttons but the text is very small. Lets make the button size little bigger. We need to look for a method and there exists method __setFont__ which we can use. In order to use __setFont__ we need to create object __Font__.

```java
	Font font = new Font("Serif", Font.BOLD, 66);
	numberButton.setFont(font);
```

Full program 
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

		// create Panel
		JPanel numberPanel = new JPanel();
		numberPanel.setBackground(Color.BLACK);
		// add panel to the frame
		frame.add(numberPanel); 

		// create 10 buttons
		for(int i=0; i<10; i++) {
			// setText method takes String data type and we have i here as Int
			// Again we need to look for a method for converting a number in to string
			// Looks like there exists one called Integer class
			String buttonText = Integer.toString(i);
			// Above method converts a Int data type to String type
			// Input: number of data type Int
			// Output: String data type
			JButton numberButton = new JButton();
			Font font = new Font("Serif", Font.BOLD, 66);
			numberButton.setFont(font);
			numberButton.setText(buttonText);
			
			// adding button to panel
			numberPanel.add(numberButton); 
		}

		// Make visible at the end so that button and panel will show up
		frame.setVisible(true);
	}
}
```
![calculator_tenbuttons_withbigfont.PNG](https://github.com/sairamaj/programmingclass/blob/master/images/calculator_tenbuttons_withbigfont.png)


## Layout
The screen is a rectangular area with origin as top left ( think of graph papter where origin is lower button). Screen is measured in pixels. When you are putting buttons you don't need to position exactly with coordinates. Layout is something you can think of when constructing homes , builder lays out the houses, roads, parks etc. You can use similar concept here. One such layout is Grid where it contains rows and columns.

Supposes you want to put buttons like below
![calculator_buttonlayout.PNG](https://github.com/sairamaj/programmingclass/blob/master/images/calculator_buttonlayout.png)

In above we can see there are 4 rows and 3 columns.

```java
    // Create layout with 4 rows and colums to show the buttons
    GridLayout numberPanelLayout = new GridLayout(4, 3);
    // Note: You will be setting this layout on number panel as buttons are added to numberpanel.
    numberPanel.setLayout(numberPanelLayout);
```

Full program
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

		// create Panel
		JPanel numberPanel = new JPanel();
		numberPanel.setBackground(Color.BLACK);
		// add panel to the frame
		frame.add(numberPanel); 

		// Create layout with 4 rows and colums to show the buttons
		GridLayout numberPanelLayout = new GridLayout(4, 3);
		// Note: You will be setting this layout on number panel as buttons are added to numberpanel.
		numberPanel.setLayout(numberPanelLayout);
		
		// create 10 buttons
		for(int i=0; i<10; i++) {
			// setText method takes String data type and we have i here as Int
			// Again we need to look for a method for converting a number in to string
			// Looks like there exists one called Integer class
			String buttonText = Integer.toString(i);
			// Above method converts a Int data type to String type
			// Input: number of data type Int
			// Output: String data type
			JButton numberButton = new JButton();
			Font font = new Font("Serif", Font.BOLD, 66);
			numberButton.setFont(font);
			numberButton.setText(buttonText);
			
			// adding button to panel
			numberPanel.add(numberButton); 
		}

		// Make visible at the end so that button and panel will show up
		frame.setVisible(true);
	}
}
```
and window will look like below
![calculator_numberpanel.png](https://github.com/sairamaj/programmingclass/blob/master/images/calculator_numberpanel.png)

### Breaking the big program
Our program is becoming big and we need to break this in to pieces. We have learned Java is all about classes and objects. So we have to break this in to smaller classes and use them. Lets recap the lesson where we have learned __inheritance__ (reuse) [here](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session19.MD)

```java
 class Animal{
        void feed(){
            System.out.println("animal is eating.");
        }
    }

     class Dog extends Animal{
        // Nothing in it.
        void walk(){
            feed(); // lets feed it first
            // super.feed();

            // In walk method we have feed which is defined in Animal can be called
            // we have two ways of calling
            //      simply using the method name 
            //      or using super.feed() ( super here is Animcal)
        }
    }
```

### NumberPanel class
Lets move everything related to creating number buttons and its panel to its own panel like below
```java
public class NumberPanel {

}

```

As our __NumberPanel__ is panel lets reuse __JPanel__ and our keyword is to use __extends__
```java
import javax.swing.*;

// NumberPanel is a Panel
public class NumberPanel extends JPanel {

}
```
Remember if we can read NumberPanel __is a__ JPanel which makes sense then we have done right ( this is test for making sure we are using inheritance right)

Create constructor in NumberPanel
```java
import javax.swing.*;

// NumberPanel is a Panel
public class NumberPanel extends JPanel {
	// Constructor.
	NumberPanel(){
		
	}
}
```

Lets identify all the calls related to number panel in __Application__ class we have done above
```java
		// Create layout with 4 rows and colums to show the buttons
		GridLayout numberPanelLayout = new GridLayout(4, 3);
		// Note: You will be setting this layout on number panel as buttons are added to numberpanel.
		numberPanel.setLayout(numberPanelLayout);
		
		// create 10 buttons
		for(int i=0; i<10; i++) {
			// setText method takes String data type and we have i here as Int
			// Again we need to look for a method for converting a number in to string
			// Looks like there exists one called Integer class
			String buttonText = Integer.toString(i);
			// Above method converts a Int data type to String type
			// Input: number of data type Int
			// Output: String data type
			JButton numberButton = new JButton();
			Font font = new Font("Serif", Font.BOLD, 66);
			numberButton.setFont(font);
			numberButton.setText(buttonText);
			
			// adding button to panel
			numberPanel.add(numberButton); 
		}
```

Move related to panel and buttons to the __NumberPanel__ constructor
```java
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

// NumberPanel is a Panel
public class NumberPanel extends JPanel {
	
	// Constructor.
	NumberPanel(){
		// Create layout with 4 rows and colums to show the buttons
		GridLayout numberPanelLayout = new GridLayout(4, 3);
		// Note: You will be setting this layout on number panel as buttons are added to numberpanel.
		setLayout(numberPanelLayout);
		
		// create 10 buttons
		for(int i=0; i<10; i++) {
			// setText method takes String data type and we have i here as Int
			// Again we need to look for a method for converting a number in to string
			// Looks like there exists one called Integer class
			String buttonText = Integer.toString(i);
			// Above method converts a Int data type to String type
			// Input: number of data type Int
			// Output: String data type
			JButton numberButton = new JButton();
			Font font = new Font("Serif", Font.BOLD, 66);
			numberButton.setFont(font);
			numberButton.setText(buttonText);
			
			// adding button to panel
			add(numberButton); 
		}
	}
}
```

As NumberPanel is extending JPanel all the methods in JPanel are available in NumberPanel (__inheritance__)
We need to remove __numberPanel__ variable here .

```java
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

// NumberPanel is a Panel
public class NumberPanel extends JPanel {
	
	// Constructor.
	NumberPanel(){
		// Create layout with 4 rows and colums to show the buttons
		GridLayout numberPanelLayout = new GridLayout(4, 3);
		// Note: You will be setting this layout on number panel as buttons are added to numberpanel.
		setLayout(numberPanelLayout);
		
		// create 10 buttons
		for(int i=0; i<10; i++) {
			// setText method takes String data type and we have i here as Int
			// Again we need to look for a method for converting a number in to string
			// Looks like there exists one called Integer class
			String buttonText = Integer.toString(i);
			// Above method converts a Int data type to String type
			// Input: number of data type Int
			// Output: String data type
			JButton numberButton = new JButton();
			Font font = new Font("Serif", Font.BOLD, 66);
			numberButton.setFont(font);
			numberButton.setText(buttonText);
			
			// adding button to panel
			add(numberButton); 
		}
	}
}

```

Lets revisit this __NumberPanel__ constructor. Here we are creating __JButton__ and adding using __add__ method ( we can use __super.add__ which will be the same.).

Now in __Application__ class __main__ method we need to create __NumberPanel__ object like instead of __JPanel__.

Replace below 
```java
		// create Panel
	JPanel numberPanel = new JPanel();
```

with
```java
    NumberPanel numberPanel = new NumberPanel();
```

With this we have below program
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

		// create NumberPanel (which will create buttons and add it)
		NumberPanel numberPanel = new NumberPanel();
		numberPanel.setBackground(Color.BLACK);
		// add panel to the frame
		frame.add(numberPanel); 
		

		// Make visible at the end so that button and panel will show up
		frame.setVisible(true);
	}
}
```

# Summary
* We have modified to add 10 buttons using __for__ loop
* We have used __GridLayout__ to set buttons in certain order
* We have created __NumberPanel__ extending __JPanel__ ( __inheritance__)
* We have moved all the related stuff in to separate class called __NumberPanel__


