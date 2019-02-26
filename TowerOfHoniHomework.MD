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

## Goal
  The step1 goal is just to define the classes and some of the methods. We may not be able to define all the classes and their methods.

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

[code is here]()

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
[code is here]()


