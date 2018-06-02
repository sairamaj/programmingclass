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
We are going to solidify our understanding around OOP and classes again with some practical example. We need to understand when we should use instance variables, class variables and method using either of these variables. For this we will be doing some sample application.

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

### Instance variables
Now that we have identified classes, methods and its inputs we need to see whether we need any instance variables (variables define in the class).
What we have in __Mail__ class methods for __send__ and __receive__ are the loginUserId being passed each time. Instead of sending loginId each time for these methods what we can do is create instance variable in class which will be part of the instance and because of instance variable the methods can use it.

Lets change Mail class little bit like below
```java
    class Mail{
        int loginUserId;

        Mail(int loginUserId){
            this.loginUserId = loginUserId;
        }

        void send(String to, String subject, String body){
            System.out.println("Sending mail with login id:" + this.loginUserId);
            // here mail will be send
        }
        void receive(){
            System.out.println("receiving mails for:" + this.loginUserId);
        }
    }
```

We have removed __loginUserId__ from the inputs for the methods and made part of class which will be available for each instance. This is one way of using instance variables and we will see some more examples of using instance variables.

Lets finish the logic in login method 
```java
    int login(String userName, String password){

    	if( userName.equals("Bob") && password.equals("1234")){
            return 1;
        }else if(userName.equals("Joe") && password.equals("4567")){
            return 2;
        }
        return 0;       // no user.
    }
```

We are used to compare the numbers like __x==2__ but for Strings we have to use method __equals__ which is part of String (String itself is class which comes with JDK). Also see __&&__ which is way of saying __And__ 

With above now we can write mail application to receive and send mails like below
```java
    public class Application{
        public static void main(String[] args){

            Account a1 = new Account();
            int id1 = a1.login("Bob","1234");
             Mail m1 = new Mail(id1);
            m1.send("s@abc.om","Test email","This is from CoolMail App");
            m1.receive();
        }
    }
```

In Next class we refine this application to understand more about classes.
