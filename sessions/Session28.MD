# Recap
* We have done calcualtor program to include number panel , operation panel and result panel.
* Learned about grid layouts

Our next aim is to put number in result panel whenever user clics button in number panel.For this we need one more concept in Java called __interface__

# Interface
We know __inheritance__ which is __reuse__ and in java we can use __extends__ key word to do this. Also we learned that you should only extends a class if it has __is a__ relationship. For __Dog__ is a __Animal__ hence we can extend __Dog__ from __Animal__.

Some times there is some common behavior across different classes. Lets take a example of __play__ where a Person can play and dog can play but differently. There is no connection between person and dog (we cannot use __is a__ relationship here.). But still want to use the play method across 2 different classes. __interface__ helps in establishing this common behavior.

In Java one can define interface like below
```java
    interface Playable{
        void play();
    }
```

See the method declaration in the interface. There is no body (no implementation). so far you have defined a method in class which does something (some instructions ) like below
```java
    class Person{
        void play(){
            // instructions describing playing by person.
        }
    }
```

so class has method which has body and interface does not. Interface method define __what__ not __how__. class methods define __how__ also.

If a class is capable of __playable__ then class will __implements__ this interface like below

```java
public class Person implements Playable{
	
	@Override
	public void play() {
		
		System.out.println("person shoots basketball");
	}
}
```

Above Person is capable of play and hence implements Playable.

Similarly a dog can also play and the dog class can also implement

```java
public class Dog implements Playable {

	@Override
	public void play() {

		System.out.println("wags his tail");
	}
}
```

In above there is no common between Person and Dog other than that both can play. This kind of common behavior is captured in __interface__ and individual class __implements__ the interface accordingly.

Lets see how we can use these classes and interface with sample below

```java
public class PlayerManager {

	static Playable getPlayer(int option) {

		switch (option) {
		case 1:
			return new Person();
		case 2:
			return new Dog();

		}
		return null;
	}
}    
```

In above PlayerManager will give a __object__ which is of data type __Playable__. getPlayer is returning __Playable__ and we are returning __Person__ or __Dog__ instance (where both are Playable)

```java
public class Application {
\

	public static void main(String[] args) {
		
		Playable p = PlayerManager.getPlayer(2);
		p.play();		
	}
}
``` 

__Application__ class uses __PlayerManager__ and method __getPlayer__ to get __Playable__ and ask the object to __play__. See it does not care (or know) which object is being returned from getPlayer method as long as it is __Playable__. 

__interface__ play very important role in java programming. It may take some time to get the concept behind this but over the period of time we will be implementing or uses some of the JDK interfaces and we will become familiar with this.

# Extending our Calculator class
Now that we know interfaces lets revisit the calculator class. 

## Where are we?
    We have number panel, operation panel and result panel in our calculator and looks like below

![calculatorbeforeimplentingactionlistener](https://github.com/sairamaj/programmingclass/blob/master/images/calculatorbeforeimplentingactionlistener.png)

### Classes we have written
* Application
* NumberPanel (extends JPanel)
* OperationPanel (extends JPanel)
* ResultPanel (extends JPanel)

### Classes we have used
* JFrame
* JButton
* JTextField
* GridLayout
* JPanel
* Font

### Objects we have created
* NumberPanel - 1
* OperatonPanel - 1
* ResultPanel -1
* JButton - 15 ( 10 numbers + 4 operations + 1 equal button)
* JTextField - 1
* GridLayout - 3 ( 1 frame, 1 number panel and 1 operation panel)

### Listening to the button clicks
Out next aim is to show what button clicked when user clicks number button

Every button (JButton) looks for any object interested in listening to the button clicks. The way in which it looks is to see a a particular interface called __ActionListener__ which is defined like below in JDK

```java
public  interface ActionListener {
  
  public abstract void actionPerformed(ActionEvent evt);
}
```

What this means is if anybody interested in listening to button clicks should implement __ActionListener__ and method __actionPerformed__ then JButton call the method __actionPerformed__ to inform that somebody clicked the button. Remember in programming if we need something to be done means look for __method__.

Now that our NumberPanel is interested in listening the button clicks it should implement the __ActionListener__ interface( you need to import __java.awt.*__)

Our __NumberPanel__ looks like below
```java
public class NumberPanel extends JPanel implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// Button will call this method if user clicks button.
		
	}
}
```

There is one more thing left to wire up the things. Just because you (NumberPanel) interested does not mean you(actionPerformed) wil be called. It is like you have email does not mean I can send updates to your email. You need to tell me about your email. Just like that __JButton__ needs to be told that our __NumberPanel__ will listen the events.

We have created 10 buttons in the loop and we need to inform each button that NumberPanel is interested and it looks like below

```java
			JButton numberButton = new JButton();
			Font font = new Font("Serif", Font.BOLD, 66);
			numberButton.setFont(font);
			numberButton.setText(buttonText);
			
			// please add this (we are in NumberPanel so this means NumberPanel)
			// to you(button) and inform me whenever user clicks button
			numberButton.addActionListener(this);

```

Lets show a message whenever user clicks button 

```java
	public void actionPerformed(ActionEvent e) {
		// Button will call this method if user clicks button.
        // show the message about button clicked.
		JOptionPane.showMessageDialog(null, "hi button clicked");
	}    
```

Now when you click button you will see the message like below

![buttonclicked](https://github.com/sairamaj/programmingclass/blob/master/images/buttonclicked.png)

We want to know what button is clicked. Look there is input to the __actionPerformed__ where some of the information about which button is clicked. It is object and you can see what methods exists and looks like there is method 

```java
	public void actionPerformed(ActionEvent e) {
		// Button will call this method if user clicks button.
		String buttonText = e.getActionCommand();
		JOptionPane.showMessageDialog(null, "button clicked is:  " + buttonText);
	}
```

![buttonclickedwithnumber](https://github.com/sairamaj/programmingclass/blob/master/images/buttonclickedwithnumber.png)

Full NumberPanel looks like below

```java
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// NumberPanel is a Panel
public class NumberPanel extends JPanel implements ActionListener {
	
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
			
			// please add this (we are in NumberPanel so this means NumberPanel)
			// to you(button) and inform me whenever user clicks button
			numberButton.addActionListener(this);
			// adding button to panel
			add(numberButton); 
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Button will call this method if user clicks button.
		String buttonText = e.getActionCommand();
		JOptionPane.showMessageDialog(null, "button clicked is:  " + buttonText);
	}
}
```

# Summary
* __interface__ captures commn behavior across different classes.
* __JButton__ informs the objects about the user clicks thorugh __actionPerformed__ (in __ActionListener__ interface)
* __JButton__ has method __addActionListener__ to add a particular listener about the user clicks


