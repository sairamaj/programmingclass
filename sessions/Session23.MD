We are going to develope a Graaphics calculator. Before we start lets recap all the things we need to know before we can write this GUI (Graphical User Interface) application.

# You should know
* [variables](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session4.MD)
* [class](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session6.MD)
* [object](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session6.MD)
* [jdk](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session19.MD)
* [static](https://github.com/sairamaj/programmingclass/blob/master/sessions/Session19.MD)

We are going to write a program using JDK and you need to keep the following things in mind

* Anything you want computer(program) to do in Java is to look for __method__ (remember method is action which does something.).
* As Java is Pure Object Oriented Programming any method must exists in some __class__. That means you need to identify the class.
* Once you identify the class you need to identify the __package__ in which this class exists (remember package contains number of classes)
* You need to see whether this method is __static__ or non static. If it is static then you don't need to create object to call. If it is non static then you need to create __object__ and then call method on it.
* Once you know class and method in it, you need to see what __inputs__ this method take.

## How do you find a method and its assoicated class?
Now you want something to be done with computer using Java. Your next question is where do you start. First we will look in JDK. Either you google, talk to friend. For now I will be telling what class and which package. Eclipse should be able to tell you the methods. For now I will tell you the methods also.

## Creating a Window
Ok I said You need __JFrame__ in package __javax.swing__ and need to use methods __setSize__, __setVisible__ to show the window. Lets see how one can show the window using this information.

After creating a Java project Application class with main method in it you should be able to do this
```java
    	
import javax.swing.*;       // Need this to use JFrame class.

public class Application {

	public static void main(String[] args) {
		JFrame f = new JFrame();        // Creating object.
		f.setSize(1000,1000);           // size the window and takes 2 arguments with width and height.
		f.setVisible(true);             // set the visible to true.
	}
}

```
If you observe above what we did is
* created object ( new JFrame())
* setSize with 1000 width and 1000 height
* setVisible with true (you need to see what methods inputs data type)

## Getting help in Eclipse
if you type variable followed by period then eclipse will bring the methods in the object and its help like below
![eclipseintellisenseformethod](https://github.com/sairamaj/programmingclass/blob/master/images/eclipseintellisenseformethod.png)

# Calculator
Lets start writing a calculator program.

* Start with creating project called Calculator
* Add __Application__ class.
* In main function do the following like explained above.

```java

import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000,1000);
		f.setVisible(true);
	}
}
    
```

If you run the above program window appears. By clicking the window it appears window closing but the application remains ( you can check this by using TaskManager Details tab a program called __javaw__ remain, you need to kill this.)

You can fix this by adding below line
```java
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

JFrame.EXIT_ON_CLOSE is constant (we will learn in next class) where default action is to close the application.

### JPanel
The __JFrame__ we did above is like picture frame and __JPanel__ is like portion in the frame. You can create __JPanel__ in __JFrame__.
![JPanelinfo](https://github.com/sairamaj/programmingclass/blob/master/images/JPanelinfo.png)

## Lets add one Panel to the frame
```java
		// create Panel
		JPanel p = new JPanel();
		p.setBackground(Color.BLUE);
		f.add(p);		// add panel to the 
		f.setVisible(true);
```
With above you should see blue color panel filled in frame.What we did is created a __JPanel__ object and added this to __JFrame__ object.

## Buttons on Panel
Now we can put buttons in panel.
```java
		// create button
		JButton b = new JButton();
		b.setText("1");
		p.add(b);	// adding button to panel
```
Here we have created __JButton__ object and added to __JPanel__
![JButton](https://github.com/sairamaj/programmingclass/blob/master/images/JButton.png)

Complete program 
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
