# Recap
* We have learned java __interfaces__
* We have used __ActionListener__ interface to implement in __NumberPanel__
* in __actionPerformed__ we have put message box showing what button clicked.

Lets show the user clicked button in Result panel text box 

## Objects talk to each other through methods
Lets take real time example where I want to borrow a book from you. There are 2 ways of getting this book from you.
1. Go to your room , search the book shelf and grab the book and walk away
2. Stay outside your room and ask you for the book and you know where the book exists and give it to me.

I am sure you like the second option. For one reason is you don't want anybody to disturb your room and look for the book. Your room is private to yourself. 

The same concepts come to objects. When a class wants to talk to another class it uses __methods__ to communicate. Lets see what we mean by this.

* We have __NumberPanel__ which displays numbers and listens to the button clicks
* We have __ResultPanel__ which displays the text in its own text box

Now we want __NumberPanel__ to talk to __ResultPanel__ , give the number and ask it to show the number in its textbox. Here __NumberPanel__ talks to __ResultPanel__ through a method called __setNumber__ and gives the number

```java
	public void setNumber(String number) {
	}
```

Here we will be using the __JTextField__ which we have in result panel. Before that the JTextField which we have added in Constructor should be declared at class level. As we are creating this in Constructor, we need to hold on to it in class level so that it can be accessed in other methods in class.

```java
// ResultPanel is a JPanel
public class ResultPanel extends JPanel{
	// Constructor
	ResultPanel(){
		
		// create text field which is JTextField
	    JTextField textField = new JTextField();
	
	}
}
```
should be changed to
```java
public class ResultPanel extends JPanel{

	// declare class level which is created in constructor and can be used in setNumber method
	JTextField textField;
	// Constructor
	ResultPanel(){
		
		// create text field which is JTextField
		textField = new JTextField();
		
	}
}
```

Now we can use __setNumber__ method to set the number in to the text field like below

```java
	public void setNumber(String number) {
		// set the number in text field.
		this.textField.setText(number);
	}
```

Ok we have done half of the job where __ResultPanel__ has a method __setNumber__ where anybody can use to set the number.

Now __NumberPanel__ need to communicate to __ResultPanel__ object. Who is creating these object? It is the __Application__ class __main__ method we are creating both objects. What we can do is to modify the __NumberPanel__ class to take input __ResultPanel__ in its constructor and hold on to it in class level. When user clicks number button which will be informed to __actionPerformed__ , we can use result panel __setNumber__ method 

__NumberPanel__ constructor will take __ResultPanel__ like below

```java
public class NumberPanel extends JPanel implements ActionListener {
	
	// Constructor.
	NumberPanel(ResultPanel resultPanel){
    }    
```

We should hold on to this variable in class so that we can access in __actionPerformed__ method

```java
public class NumberPanel extends JPanel implements ActionListener {
	ResultPanel resultPanel;
	// Constructor.
	NumberPanel(ResultPanel resultPanel){
		
		this.resultPanel = resultPanel;
    }
```

Now we can tell __resultPanel__ about the number to be set through method __setNumber__  like below
```java
	public void actionPerformed(ActionEvent e) {
		// Button will call this method if user clicks button.
		String buttonText = e.getActionCommand();
		this.resultPanel.setNumber(buttonText);
	}
```

One last thing we need to is to pass __ResultPanel__ object to __NumberPanel__ object in __Application__ class where we are creating these 2 objects like below

```java
NumberPanel numberPanel = new NumberPanel(resultPanel);
```

Now run the program and click the number button and see that it is displayed in result panel.

![numbershowinginresultpanel](https://github.com/sairamaj/programmingclass/blob/master/images/numbershowinginresultpanel.png)

# Summary
* __objects__ talk to __objects__ through methods.

