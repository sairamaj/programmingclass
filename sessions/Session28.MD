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
