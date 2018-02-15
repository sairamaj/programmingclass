# Recap
We have defined the calculator with operational panel and number panel and our calculator looks like this now

![calculator_numberpaneloperationpanel](https://github.com/sairamaj/programmingclass/blob/master/images/calculator_numberpaneloperationpanel.png)

What we are going to do is to add ResultPanel which will show the results of calculation.

# Result Panel
Result panel is just like Number and Operation panel except it will have a text field. Lets create __ResultPanel__ class

```java
import javax.swing.*;

// ResultPanel is a JPanel
public class ResultPanel extends JPanel{

	// Constructor
	ResultPanel(){
		
		// create text field which is JTextField
		JTextField textField = new JTextField();
		textField.setText("answer");
		Font font = new Font("Serif", Font.BOLD, 66);
		textField.setFont(font);
				
		// add it to this panel
		super.add(textField);
	}
}
 
```

Lets add this result panel to frame

First change the grid layout of frame which has 1 row with 2 columns in to 2 rows and 2 columns to accomodate result panel.

```java
		// Lets make it 2 rows and 2 columns in frame
		// 1st row, 1st column will be result panel
		// 1st row 2nd column we will create some dummy panel for now
		GridLayout layout = new GridLayout(2,2);
		frame.setLayout(layout);
		
```
Next add Result Panel which will come at [1,1] and we will add dummy panel in [1,2]. Number panel is at [2,1] and operation panel at [2,2] ( the order of panels adding to frame matters as they appear in rows and columns)
```java
		
		// result panel is [1,1]
		ResultPanel resultPanel = new ResultPanel();
		frame.add(resultPanel);
		
		// add some dummy panel at [1,2]
		JPanel dummyPanel = new JPanel();
		frame.add(dummyPanel);
		
```

Now our calculator will be shown like below

![calculator_numberpaneloperationpanelresultpanel.png](https://github.com/sairamaj/programmingclass/blob/master/images/calculator_numberpaneloperationpanelresultpanel.png)

Now __Application__ class is like below
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

		// Lets make it 2 rows and 2 columns in frame
		// 1st row, 1st column will be result panel
		// 1st row 2nd column we will create some dummy panel for now
		GridLayout layout = new GridLayout(2,2);
		frame.setLayout(layout);
		
		// result panel is [1,1]
		ResultPanel resultPanel = new ResultPanel();
		frame.add(resultPanel);
		
		// add some dummy panel at [1,2]
		JPanel dummyPanel = new JPanel();
		frame.add(dummyPanel);
		
		// number panel is at [2,1]
		// create NumberPanel (which will create buttons and add it)
		NumberPanel numberPanel = new NumberPanel();
		numberPanel.setBackground(Color.BLACK);
		// add panel to the frame
		frame.add(numberPanel); 
		
		// operation panel is at [2,2]
		// add operational panel to frame
		OperationalPanel opPanel = new OperationalPanel();
		frame.add(opPanel);
		

		// Make visible at the end so that button and panel will show up
		frame.setVisible(true);
	}
}
```

