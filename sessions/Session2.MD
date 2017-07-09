Today we have recapped last week session which are hardware,software,binary system etc.,

We have defined __bit__ which is one binary digit which is smallest data in computer system which can take either 0 or 1. 2 bits can carry 4 values which are 00(0), 01(1), 10(2), 11(3).

   |    number of bits   |  number of values     |   values |
   | ------------------  | -----------------     |----------|
   |     1 (2^1)         |     2                 |   0-1    |
   |     2 (2^2)         |     4                 |   0-3    |
   |     3 (2^3)         |     8                 |   0-7    |
   |     4 (2^4)         |    16                 |   0-15   |
   |     5 (2^5)         |    32                 |   0-31   |
   |     6 (2^6)         |    64                 |   0-63   |
   |     7 (2^7)         |   128                 |   0-127  |
   |     8 (2^8)         |   256                 |   0-128  |

If you see above 8 bits can carry 256 values which are plenty for alphabets+numbers+other characters. All [ASCII](http://ascii.cl/) can fit in to these 256 values. Earlier computers grouped 8 bits and called as __Byte__


   |      info                       |     description                                            | 
   | ----------------------------    | ---------------------------------------------------------- |
   |     8 bits                      |     1 bytes                                                |
   |  1024 bytes    (10^3)           |     1 Kilo byte  ( it is no 1000 as it is exponent of 2)   |
   |  1024*1024 bytes  (10^6)        |     1 Mega byte                                            |
   |  1024 * 1024 * 1024 bytes (10^9)|     1 Giga byte                                            |

## Windows OS
  As computer is our tool to develop programs we need to know the details of our computer. We will be learning some basic details and in the future we will be learning some advanced concepts and also other operating systems like OSX , Linux etc.,

  Lets find out what is the memory and hard disk spaces we have on each computer.

  Windows 10 press windows key button  ![windowkey](https://github.com/sairamaj/programmingclass/blob/master/images/windowskey.png) and then start typing __winver__. You will see the below screen. 

![windowkey](https://github.com/sairamaj/programmingclass/blob/master/images/winver.png)

### Memory
  Right click on edit box where it says __Type here to search__ 
  ![totaskmanager](https://github.com/sairamaj/programmingclass/blob/master/images/totaskmanager.png) 

### Hard disk
  Lets find out how much hard disk each one had.
  Press  ![windowkey](https://github.com/sairamaj/programmingclass/blob/master/images/windowskey.png) + E and you wll see the below diagram

  ![fileexplorer](https://github.com/sairamaj/programmingclass/blob/master/images/fileexplorer.png)

  on C drive (you should see on the left side) right click and select Properties

![driveproperties](https://github.com/sairamaj/programmingclass/blob/master/images/driveproperties.png)

![disksize](https://github.com/sairamaj/programmingclass/blob/master/images/disksize.png)

### Question?
  Why we have less (like 16GB on RAM) and high on hard disk (500GB)?

  Recollect about __RAM__ which is used for scratch pad during computer working and __HardDisk__ used for permanent storage like your photos, movies etc., We need higher on hard disk for this items to store permanently.

  ### Folders and Files
   *  __file__ is group of bytes ( you may see characters, numbers but they are stored in binary which you already know). They have different types of files in windows.  __.txt__  is text file which you can create using __notepad.exe__ which is another kind of file __.exe__ (Software/Program/Application also in windows called executable). Executable (__.exe__) are programs which you can use to do some stuff. Some of the executables in windows are __notepad.exe__ (creating text files), __cmd.exe__ (command prompt where you can type windows command), __chome.exe__ (browser) , __calc.exe__ (calculator). There are __.png__, __.jpg__ picture files, __.mp4__ videos, __.html__ (HTML files).
   
   * __folder__ is collection of __files__ and also can contain __folders__

   * Below we can see __class__ contains 2 folders __english__ , __math__ and text file __hello.txt__. __math__ folder contains anothe folder __algebra__ and soon.
        
    ![foldersandfiles](https://github.com/sairamaj/programmingclass/blob/master/images/foldersandfiles.png)

    One can create folders using file explorer  like below
    ![createfolder](https://github.com/sairamaj/programmingclass/blob/master/images/createfolder.png)

  ### Command Prompt
    Command prompt is where you can type commands to do some stuff in windows. Type windows key ![windowkey](https://github.com/sairamaj/programmingclass/blob/master/images/windowskey.png) + R to get Run window

    ![runwindow](https://github.com/sairamaj/programmingclass/blob/master/images/runwindow.png)
 
 and type __cmd__ to open command window like below
 ![commandwindow](https://github.com/sairamaj/programmingclass/blob/master/images/commandwindow.png)

 When you open you might be different directory and type __cd\\__ to get to root.

 Type the command like below
 
 ![commandwindowwithdirectories](https://github.com/sairamaj/programmingclass/blob/master/images/commandwindowwithdirectories.png)

 Above __md__ is to create directory and __cd__ is to change the directory. __directory__ and __folder__ meaning the same in windows.
 
##### Absolute Path
 The complete directory when you are in 0709 is c:\class\math\algebra\0709. you can go to root at any time by typing __c:\\__ at any place. Also you can go to any directory from anywhere by completely typing the path.
 for example if you are in c:\class\math\algebra\0709 and want to go to english you can go by typing c:\class\english like below

 ![cdwithcompletepath](https://github.com/sairamaj/programmingclass/blob/master/images/cdwithcompletepath.png)

 ##### Relative Path
 Also you can use relative path like below
 ![cdwithrelativepath](https://github.com/sairamaj/programmingclass/blob/master/images/cdwithrelativepath.png)

 Above __..__ is going to parent ( 0709 directory parent is algebra and algebra parent is math)
 

 

 


 
 

  ### Hello World Java
  #### Eclipse




  
  


  go to __Performance__ tab and you should see below one.

  ![memoryintaskmanager](https://github.com/sairamaj/programmingclass/blob/master/images/memoryintaskmanager.png)





