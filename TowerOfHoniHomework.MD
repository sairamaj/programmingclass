We have started Tower of Honoi programming in UI and deviated little bit to understand some more java concepts. We will do a dummy (simulated) tower of honoi and get back to our main program. We have done enough pieces in the class. Here I will explain to proceed this simulated application in step by step process. 

# Goal
* Check point for the things we have learned so far
* Go step by step and end up understanding all the classes and methods
* Move this in to real application once we are done.

# CRC
We have discussed __CRC__ in the class. Once you understand the java class concepts , designing the classes , its methods is another challenge. __CRC__ is old concept but very effective.

__C__ is class , __R__ is responsbilities and __C__ is collaborator.

Each class will have some responsibilities (things to do) and in order to get the job done it has to interact with other classes which is collaboration. This is just like your group project where each person in group has some responsibilities to do and in order to finish his or her work need to talk to other person to get things done. This is exactly __CRC__ in programming.

I will be outlining steps here and each step here is new java project and next step will use the previous step project as starting point. Lets start.

# Step1
## Goal
* Create the classes with dummy methods.
### Application
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__C__ : This is the main class where __main__ method exists ( remember Java program starts in main method and executes line by line)

  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__R__ : Create the gamer, Ask the user to move discs interactively

  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__C__ : Gamer

### Gamer
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__C__ : This is the class for creating the towers, and move disc from one tower to another tower
 
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__R__ : creates towers, move disc from tower to tower
 
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__C__ : Tower, DiscManager, Disc

### DiscManager
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__C__ : Manages the discs

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__R__ : Supplies 3 different discs

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__C__ : Disc

### Tower
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__C__ : Manages the tower and discs

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__R__ : Draws the tower , draws the dics
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;__C__ : Disc

In above for each class we have mentioned 

__C__ (class) , __R__ (responsibility), __C__ (collaboration)

### Step1- Exercise

* Create Project TowerOfHonaiStep1
* Create above classes
* Create class fields
* Create method in each class which does not do anything but put simply its responsibility
* For example
    * method in Disc 
    ```java
        Disc getSmallDisc(){
        System.out.println("returns small disc.);
        return null;
    }
    ```
* No need to call the methods. This exercise is only to come up with classes and its methods

[code is here](https://github.com/sairamaj/programmingclass/tree/master/toh/Step1)

### Step2
#### Goal
* In step1 we have created classes and methods. Now we will use these methods to do some stuff
* Here aim is to have game object and call create method which creates tower.

#### We will do below things to achive this
* In Eclipse right click on __Step1__ and do __Copy__ and then do __Paste__ where it will ask the new project name and give as __Step2__
* In __Application__ class we will create  a __Gamer__ object
* On this new object we will call method __create__
* In __Gamer__  __create__ method we will create __Tower__ object
* Once we created __Tower__ object we will call method __draw__ on this

When you run the program below things should happen.
```cmd
  creating game
  drawing the tower
```

Thats it in step2.

[code is here](https://github.com/sairamaj/programmingclass/tree/master/toh/Step2)

### Sequence diagram
  One way to understand how the flow (which method is calling which method ) can be understood by __Sequence diagram__.  For the above program where we have created the game and drew the tower , one can draw the sequence diagram like below

![step2sequencediagaram](https://github.com/sairamaj/programmingclass/tree/master/toh/images/step2_sequence.png)

If you observe the Step2 program and the above sequence diagram , you will understand the connection between code and this diagram. 

### Step3
Goal we will get a __Disc__ from __DiscManager__ and give it to tower through __addDisc__ method

* Right click and Copy on Step2 project
* Right click and use Paste and name it Step3
* Add a method called __getSmallDisc__ where it will return the disc (If you have already added this method in step1, you can ignore)
* Add a method __addDisc__ in __Tower__. __addDisc__ will take the input as __Disc__ and will look like below
```java
  void addDisc(Disc d){
    System.out.println("adding disc in tower");
  }
```
* Now __Gamer__ will get __Disc__ from __DiscManager__ and give it to __Tower__ like below
```java
  DiscManager manager = new DiscManager();
  Disc d = manager.getSmallDisc();
  t.addDisc(d);      // we alread have Tower object
```

Thats it in step3 and our sequence diagram will look like below

![step3sequencediagaram](https://github.com/sairamaj/programmingclass/tree/master/toh/images/step3_sequence.png)