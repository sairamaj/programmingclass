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


