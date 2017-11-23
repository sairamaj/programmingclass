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
    * ```java
        age = 10;
        int age;
    ```
* You cannot define a variable multiple in the same method
    * ``` java
        int age = 10;
        String name = "joe";
        int age;        // No you cannot define again the age
        name = "sai";
        name = "bob";   // You can use as many time as you want.
    ```
    * Above __age__ is defined multiple times and __name__ defined once and used multile times which is correct.
* A variable is __alive__ when it was __defined__ and __dead__ when it sees a closing flower bracket __}__
    * see below
    * ```java
        class Student{
            void readBook(){                                        // line 1
                String bookName = "Harry Potter";                   // line 2
                System.out.println("reading book:" + bookName);     // line 3
            }                                                       // line 4
        }
    ```
    * bookName is alive one line 2 and dead on line 4
    * see another example
    * ```java
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
    * ```java
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

# Solving a given problem
Lets discuss how one can convert a problem in to programming solution.
* Step-1 First you will be asked to do something
* Step-2 


