Our session 30 started after break of 4 weeks. We have reviewed some of the basic programming skills to get back to normal track.

We need to get back to our calculator program again but before that we need to understand some of the design principles in desiginng the classes. 

From now on wards the class will be changed a little bit. Every class will have 10-15mins a short quiz and also will have home work which needs to be checked in github. The home work will be very short one (usually takes <30mins) and everybody needs to do this.

# CRC
One of the very old but still effective method to design the classes. A class can be described with __CRC__ which stands __C__ as class name , __R__ as responsibilities and __C__ as colloborators.

## C
* class name. Here we will give the name.

## R
* Responsibilities
* Describe what this class does

## C
* Colloborator
* In order to do its job a class has to communicate to other classes and here we will list all the classes it communicates (note: we wil not list the classes which make a call to this class.)

## Why do we need CRC?
When you do a group project (like FLL, FTC, or school project) you do this all the time. In group you will devide the work and also at the same time communicate to teammates to get the job done. In computer programming is also similar where each class does some work and communicate to other class to make things work.

# CRS for Calcualtor project
Lets see what classes and their responsibilities in our calculator project

## NumberPanel
#### C
* NumberPanel
#### R
* Displays the panel with numbers in it.
* Reacts to the user clicks on number
#### C
* __ResultPanel__  (Informs the button clicked to result panel)

## Application

#### C
* Application
#### R
* Creates the panels and arrange them.
#### C
* NumberPanel
* OperationPanel
* ResultPanel

# How we can come up with certain classes for the project.
When we are going to develope a application we are going to write certain requirements. A __requirement__ is nothing but what this application is going to do. For example when we say we are going to write a calculator we are going to say the following.

    The calculator program will do simple math like add, subtraction,multiplation and devision. It will do only one operation at at time. For example 1+2 , 1*2 , 4/2 etc., It will not have multiple operands like 1+2+3+4 etc., This program will display numbers and operations and when user clicks a number, operation and another number it will do the math and display in panel. The number clicked will be shown in one text field, operation clicked is shown in another text field and second number will be clicked in another test field. The math will be calculated when user clicks equal (=) operator.

Typically all __nouns__ in the requirements will become __classes__. This will be only first cut and over the period of development either some classes will be added or some will be dropped.

## Scope
Scope is term used in programming world which means what the application is going to do and what it won't (only some will be listed in not list). For example when we say calculator we are going to do only simple 4 operands like +,-,* and /. We are not going to do scentific operations. __Scope__ will limit the application and we will have clear idea what we are going to do.

# Next class
In next class we will start the calculator program from begining by writing some requirements, identifying the classes and writing some __CRC__ for those. 

# Homework
* As we have already written some classes in current Calculator project write CRC for the each class and check it in your git hub under homework/calculatorcrc.txt



