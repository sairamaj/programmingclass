
# Introduction (name/grade/school/hobby)
    * Everybody shared their details with others
# Computer fundamentals
* We asked some questions about what it means by a Computer
    * What is a Computer?
    * How does it understands your commands ?
    * How do you compare with human being
Everybody gave some interesting answers.

* Some of the things we discussed
    * Computer = Hardware + Software
        * Hardware
            * Things you can touch/feel (some you can see outside and some are inside which needs to open the case)
            * Some examples Mouse, keyboard( can be seen) , CPU,Motherboard,Hard disk(need to open the cover)
            * [Visited this link to see more of these](http://www.informationq.com/about-the-basic-parts-of-a-computer-with-devices/)

            * [you can click and see the parts](http://www.kids-online.net/learn/click/table.html)

            * [Some parts inside laptop](https://thumbs.dreamstime.com/z/laptop-inside-view-24503927.jpg)

            * CPU
                * We have discussed more about this
                * Asked the question to kids about 2+2=? and everybody came with quick answer. How did they do it? Some said they just knew it, Some said they did with their brain. Here we discussed the CPU is just like human brain. __C__ entral __P__ rocesing __U__ nit
                We have watched a short video showing CPU [here](https://www.youtube.com/watch?v=7uHo08bZnRg)
            * RAM
                * Then we posed the question of 4567*1245. Here they needed a paper and pen to do their regular math to get answer. What happens if we ask the same question tomorrow and they replied they can do this again on paper and pen. This is exactly RAM is like scratch pad where things can be done temporarily to do some stuff and can be thrown away.
            * Hard disk
                * What if they have given each student name,email and phone and I will ask them next week to give the email given a name. Then they need to write this in note book so that next week they can refer this book. This is exactly like hard disk computer uses to save permanently so that even if the computer is shutdown and come next day we will have things saved.
        
            * Even though we have discussed major parts CPU,RAM,Hard disk there are lot other parts in computer. When we buy a computer at store we can compare the computers with respect to these parameters to start with.

            At this point we have paused and recapped everything. Going to different persons and asked about different things to make sure everybody understood these concepts.
        
        * Software
            * Now the second part of computer which is Software
            * Asked random kid about what they did with their computer in the last 2 weeks. We got different answers as saying used Word to write document,watched a movie in you tube, did with Adobe. Word, Browser, Adobe are software. One will interact with software(as we don't interact with some of the hard like CPU,RAM directly) and get things done. Each software does some special things. You don't use word to play videos. Software also called Programs.
            * Discussed about special software which starts computer and called Operating System. This is the software you interact to run other programs(software)
            * Asked them to identify their respective OS (operating system) and they came up with Windows 10,Windows 7 , Xp, OS X , Linux

            * Program is series of steps/ series of actions / series of instructions ( instructions is right technical terminology)
                *  Some examples
                    * Read  (instruction: read)
                    * Read book for 10 mins ( instruction: read , data: 10 mins)
                    * Run for 1 hour at 6 miles/hour ( instruction: run, data 1 hour , 6miles/hour)
        
        * Recap of everything done at this point
    * Decimal System
        * All of you know the decimal system which we use on daily basis. Lets take the number: 546. You have learned the number system with place value like ones place, tenth ,hundredth place and so on.
        * Given above number 546 we can write like : (5*100) + (4*10) + (6*1)
        * Also can be written as (5* 10^2) + (4*10^1) + (6*10^0)
        * In this system every number is between 0-9 (total 10 numbers) and base called 10. Deca is 10 and hence it is called __decimal__

    * Binary
        * Lets consider different number system where you have only two choices which are either 1 or 0 (only 2 numbers you can use) and base is 2 (instead of 10 as in decimal)

        * for example 101  and this can be written as (1*2^2) + (0* 2^1) + (1* 2^0)  ( see the pattern as decimal here we have 2 instead of base and either 0/1 instead of 0-9)

        * The 101 value which is binary value will will be 5 in decimal (see above where you can simplify)
        * To convert binary to decimal
            * expand each digit with its place value and base 2
            * The place values goes multiple of 2 ( in decimal it is multiple of 10)
            * 1, 2 , 4, 8, 16, 32, 64, 128 and so on
            * for example given: 11100111 will be
            * (1*2^7) + (1*2^6) + (1*2^5) + (0*2^4) + (0*2^3) +(1*2^2) + (1*2^1) + (1*2^0)
            * 128+64+32+0+0+4+2+1
            * 231
        * To convert decimal to binary
        * split the number in multiple of 2
        * for ex: 83
        * 64+16+2+1
        * remember in binary place values are multiple of 2
        * in above we have missing 4, 8, 32 means it will be zero in the place
        * start from last number 
        * 1 is mean 1
        * 2 means second place 1
        * 4 missing meaning third place 0
        * 8 missing meaning fourth place 0
        * 16 means fifth place 1
        * 32 missing means 6th place 0
        * 64 means 7th place 1
        * 1010011
    * Why did we learn binary
        * What you see on computer (including this text) , web sites, videos , pictures cannot be understand by basic computers. It is the Software ( also called Programs, Applications) making the things easy for you. The basic computer understands only binary meaning 1 or 0. How come then Software is the one understands them. How come they understand? For that you need to under stand standards. How many alphabets we have including capital letters? 52 (26*2) and then some mathematical symbols (+, - , %, * etc.,) , and some punctuations and all put together they are less than 128. They developed some kind of code words like __A__ is __65__ , __B__ is __66__ , __a__ is __97__ where every computer interprets the same way and this is called [ASCII](https://msdn.microsoft.com/en-us/library/60ecse8t(v=vs.80).aspx) which is __A__ merican __S__ tandard __C__ code for __I__ nformation __I__ nterchange. Now for computer everything is numbers. For example lets say __HELLO__ which in number becomes (72 69 76 76 79) [ASCII] (https://msdn.microsoft.com/en-us/library/60ecse8t(v=vs.80).aspx)
        Now convert __HELLO__ which becomes 72 69 76 76 79 and then convert this in to binary (you learned above to convert) which becomes __1001000__ __1000101__ __1001100__ __1001100__ __1001111__
        Still how these 1/0 will be understood by computer? Lets say I have given 8 electric bulbs and ask you to put next to each other. Lets say they are all plugged in and you can turn them __on__ or __off__ with a switch. If __OFF__ say the number is __0__ and __ON__ it is __1__. Now in order to represent __72__ you can make the bulbs 

        ![72](https://github.com/sairamaj/programmingclass/blob/master/images/72.png)
        Even though computers does not have electric bulbs but have similar concept. In fact computer has billions of __transistors__ which has similar effect.

        
 



     
