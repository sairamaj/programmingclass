We have started Tower of Honoi programming in UI and deviated little bit to understand some more java concepts. We will do a dummy (simulated) tower of honoi and get back to our main program. We have done enough pieces in the class. Here I will explain to proceed this simulated application in step by step process.

# Goal

- Check point for the things we have learned so far
- Go step by step and end up understanding all the classes and methods
- Move this in to real application once we are done.

# CRC

We have discussed **CRC** in the class. Once you understand the java class concepts , designing the classes , its methods is another challenge. **CRC** is old concept but very effective.

**C** is class , **R** is responsbilities and **C** is collaborator.

Each class will have some responsibilities (things to do) and in order to get the job done it has to interact with other classes which is collaboration. This is just like your group project where each person in group has some responsibilities to do and in order to finish his or her work need to talk to other person to get things done. This is exactly **CRC** in programming.

I will be outlining steps here and each step here is new java project and next step will use the previous step project as starting point. Lets start.

# Step1

## Goal

- Create the classes with dummy methods.

### Application

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**C** : This is the main class where **main** method exists ( remember Java program starts in main method and executes line by line)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**R** : Create the gamer, Ask the user to move discs interactively

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**C** : Gamer

### Gamer

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**C** : This is the class for creating the towers, and move disc from one tower to another tower

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**R** : creates towers, move disc from tower to tower

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**C** : Tower, DiscManager, Disc

### DiscManager

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**C** : Manages the discs

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**R** : Supplies 3 different discs

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**C** : Disc

### Tower

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**C** : Manages the tower and discs

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**R** : Draws the tower , draws the dics
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**C** : Disc

In above for each class we have mentioned

**C** (class) , **R** (responsibility), **C** (collaboration)

### Step1- Exercise

- Create Project TowerOfHonaiStep1
- Create above classes
- Create class fields
- Create method in each class which does not do anything but put simply its responsibility
- For example
  - method in Disc
  ```java
      Disc getSmallDisc(){
      System.out.println("returns small disc.);
      return null;
  }
  ```
- No need to call the methods. This exercise is only to come up with classes and its methods

[code is here](https://github.com/sairamaj/programmingclass/tree/master/toh/Step1)

### Step2

#### Goal

- In step1 we have created classes and methods. Now we will use these methods to do some stuff
- Here aim is to have game object and call create method which creates tower.

#### We will do below things to achive this

- In Eclipse right click on **Step1** and do **Copy** and then do **Paste** where it will ask the new project name and give as **Step2**
- In **Application** class we will create a **Gamer** object
- On this new object we will call method **create**
- In **Gamer** **create** method we will create **Tower** object
- Once we created **Tower** object we will call method **draw** on this

When you run the program below things should happen.

```cmd
  creating game
  drawing the tower
```

Thats it in step2.

[code is here](https://github.com/sairamaj/programmingclass/tree/master/toh/Step2)

### Sequence diagram

One way to understand how the flow (which method is calling which method ) can be understood by **Sequence diagram**. For the above program where we have created the game and drew the tower , one can draw the sequence diagram like below

# ![step2](https://github.com/sairamaj/programmingclass/blob/master/toh/images/step2_sequence.png)

If you observe the Step2 program and the above sequence diagram , you will understand the connection between code and this diagram.

### Step3

Goal we will get a **Disc** from **DiscManager** and give it to tower through **addDisc** method

- Right click and Copy on Step2 project
- Right click and use Paste and name it Step3
- Add a method called **getSmallDisc** where it will return the disc (If you have already added this method in step1, you can ignore)
- Add a method **addDisc** in **Tower**. **addDisc** will take the input as **Disc** and will look like below

```java
  void addDisc(Disc d){
    System.out.println("adding disc in tower");
  }
```

- Now **Gamer** will get **Disc** from **DiscManager** and give it to **Tower** like below

```java
  DiscManager manager = new DiscManager();
  Disc d = manager.getSmallDisc();
  t.addDisc(d);      // we alread have Tower object
```

Thats it in step3 and our sequence diagram will look like below

![step3](https://github.com/sairamaj/programmingclass/blob/master/toh/images/step3_sequence.png)

        
      
