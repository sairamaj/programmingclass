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
