# Quiz
* Create a variable of name __x__ with data type __int__ and assign it to value __10__ in 2 lines.
```java
    int x;
    x = 10;
```
* What is OOP?
    * Object Oriented Programming
* What are the 2 concepts of OOP we have learned so far?
    * Encaptulation
    * Inheritance
* Write __if__ syntax
```java
    if(){

    }else if(){

    }else{

    }
```
* Write __for__ syntax
```java
    for( ; ; ){

    }
```

# OOP, Classes
We are going to solidify our understanding around OOP and classes again with some practical example. We need to understand when we should use instance variables, class variables and method using either of these variables.For this we will be doing some sample application.

## Sample Project
We are going to develop a mail program and here are the requirements which we need to fulfil in this sample.

### Requirement
Our program should be able to login to the the user account using user name and password and once login successfully should be receive and send emails. Once done he/she should logout from account.

### How to identify classes?
If you remember the class names are singular __nouns__ and methods in those classes are __verbs__. Also remember __CRC__ (Class Responsibility and Collborators) and OOP principles especially Encaptulation. With this information lets identity some classes for our sample project.

### Coming up with classes (first round)
Classes identify here will not be final but we can say __draft__ as we may refine and change the name of the classes and its responsibilities. What we can do is underline the nouns in the requirements and they become classes.
* Account
* Mail

### Methods
Methods will be verbs and we can identity underlining methods in our requirements.

* send mail
* receive mail
* login
* logout

### Assigning methods to classes
Here we should use the __CRC__ and __Encaptulations__ (related stuff together). With this we can come up with
```java
    class Account{
        void login(){
        }
    }

    class Mail{
        void send(){
        }

        void receive(){
        }
    }
```

### Inputs and Outputs to methods
Now that we have classes and its method we should identity the inputs and outputs to methods.
* login
    * in order to login we need user name and password which will be input
    * lets each user will have some unique id (for ex: Bob id is 1 and Joe id is 2) which will become output
    * we don't think logic now
```java
    int login(String userName, String password){
        return 0;       // stub(dummy) for now. Put the logic afterwards
    }
```

* sendmail
    * in order to send mail we need To address, Subject and Body and the login user id.
    * send mail will not get anything back
```java
    void send(int loginUserId, String to, String subject, String body){
        // here mail will be send
        // again we don't think logic here now.   
    }
```

* receive
    * receive mails will take login user id and displays mails.
    * for now lets say receive just displays mails but does not return anything
```java
    void receive(int loginUserId){
        System.out.println("receiving mails for:" + loginUserId)
    }
```



