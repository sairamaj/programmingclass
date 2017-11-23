# Recap
* We had Session 16 as review

# Recaping Variables
As variables very important in programming lets recap some basic rules about variables.
* Variables has to have one word
    * age, name
    * car Speed ( invalid as spaces are not allowed)
* You have to define a variable before you use
    * Below code is wrong as we are trying to use the variable before you define.
    * Think as computer where the instructions are followed line by line and as it sees __age = 10__ first and errors out even though you have define __int age__ in next line.
    ```java
        age = 10;
        int age;
    ```
* You cannot define a variable multiple in the same method
    ``` java
        int age = 10;
        String name = "joe";
        int age;        // No you cannot define again the age
        name = "sai";
        name = "bob";   // You can use as many time as you want.
    ```
    * Above __age__ is defined multiple times and __name__ defined once and used multile times which is correct.
* A variable is __alive__ when it was __defined__ and __dead__ when it sees a closing flower bracket __}__
    * see below
    ```java
        class Student{
            void readBook(){                                        // line 1
                String bookName = "Harry Potter";                   // line 2
                System.out.println("reading book:" + bookName);     // line 3
            }                                                       // line 4
        }
    ```
    * bookName is alive one line 2 and dead on line 4
    * see another example
     ```java
	    public static void main(String[] args) {
		{
			int age = 10;
			System.out.println("age is:" + age);
		}

        // age cannot be used here as per the above rules as age is dead in above { line
		System.out.println("age is:" + age);
	}
    ```
* You can define the same variables in different methods as they will be different.
    ```java
        class Student{

            void readBook(){
                String bookName = "Harry Potter";
                System.out.println("reading book:" + bookName);
            }

            void readBook(int minutesToRead){
                String bookName = "Percy Jackson";
                System.out.println("reading book:" + bookName + " for :" + minutesToRead);
            }
        }
    ```
    * In above same __bookName__ has been defined in 2 different methods which is OK as they are in different methods
* Standard way of defining variable is to use lower case letter
    ```java
        int age;
    ```
* If there is a compound name then convention is to use __camelCase__ where each word first letter capitalized (except first one)
    ```java
        int bookName;
        int carSpeed;
    ```
# Solving a given problem
Lets discuss how one can convert a problem in to programming solution.
* Step-1 First you will be asked to do something
* Step-2 You need to decide which class is appropriate for this. Remember first principle which is __Encapsulation__ (packaging related stuff). __class__ is singular __noun__.
* Step-3 Once you decided the class name, then you have to say yourself , OK I need to write a method
* Step-4 Now you need to decide the name of the __method__ which will be __verb__
* Step-5 You need to find out whether there are any inputs.
* Step-6 Next to is to see whether this method has any output.
* Step-7 At this time you are ready to type in something which is __syntax__
* Step-8 Fill inputs
* Step-9 Type any output data type.
* Step-10 If the method is returning something then you put some dummy value it ( the real logic will come afterwards)
* Step-11 Create a object in main method for this class.
* Step-12 Call the method with some parameters and print if any outputs are coming
* Step-13 Run the program and you will get dummy value which you have put in the method.
* Step-14 Now you are ready to put real logic in the method to make it work correctly.
* Step-15 Run now and see that program is working fine. You are now __done__.

## Lets solve some problem by following above steps.
* Step-1
    * find given two numbers ,print the maximum value of those numbers.
* Step-2
    * Seeing the above problem this relates to some math problem and come up with class __Math__
* Step-3
    * Ok I need to write a method to solve this problem in the class.
* Step-4
    * method name will be __getMax__
* Step-5
    * inputs will be 2 numbers.
* Step-6
    * one output which is maximum of 2 numbers.
* Step-7
    * Syntax
    * ```java
        class Math{

            getMax(){

            }
        }
    ```
* Step-8
    * Fill inputs
    * ```java
        class Math{

            getMax(int num1, int num2){

            }
        }
    ```
* Step-9
    * Output
    * ```java
        class Math{

            int getMax(int num1, int num2){

            }
        }
    ```
* Step-10 
    * Dummy return value
    * ```java
        class Math{

            int getMax(int num1, int num2){
                return 0;
            }
        }
    ```
* Step-11
    * create object
    * ```java
        class Application{
            public static void main(String[] args){
                Math m1 = new Math();
            }
        }   
    ```
* Step-12
    * call method
    * ```java
        class Application{
            public static void main(String[] args){
                Math1 m1 = new Math();
                int result = m1.getMax(10,20);
                System.out.println("result is:" + result);
            }
        }
    ```
* Step-13
    * Run the program
    * The result you will see is __0__ which is the dummy value you have put it in the method.
* Step-14
    * Put real logic
    * ```java
        class Math{

            int getMax(int num1, int num2){
                
                int result;
                if( num1 > num2){
                    result = num1;
                }else{
                    result = num2;
                }

                return result;
            }
        }
    ```
* Step-15
    * Run the program
    * You will see output as __15__ which is correct.

__Now you are done__

# Summary
* Variables rules
* Steps in converting a problem in to code.


