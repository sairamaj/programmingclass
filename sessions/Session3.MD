Today we will be learning some __git__ basics as we are going to use __github__ for our java source files and notes.

## What is git?
* Git is version control system. But I wanted you know that for now, we will be using as central place to add and view our individual notes and projects. I will just one major feature with any version control system and hence also with __git__ which you need to know
Imagine  you are writing an essay for your school project which may take a month. You have been editing this text document everyday. After editing for 10 days you thought the one written 3 days back story is good and don't want any changes you have done for the last 3 days. What you might have done is take a backup of this document everyday like 1.txt, 2.txt, 3.txt etc., and now if you want to go back all you need is copy 7.txt and make as 10.txt and start working on it ( now  you have lost 8, 9 and 10th day changes which you want anyway). This works for one file by one person. Imagine a team of 3 working on this text document and writing independently 3 different sections of it and want to combine now and then and make final copy before final submit. All these things will be made easy with any version control system like __git__ where multiple persons can work on the same text document , combine them, view what changes anybody has done and lot more.

## What for we will be using __git__?
* Even though __git__ offers lot of features we may not use them all in this course. But doing with git will enable them to learn all these features in future.
* __git__ is being used by lot of companies for real and it will be useful for you to learn them now.
* We will be using as taking notes, exercises and any quizs.
* Imagine you have taken a break from learning java and resuming again but want to refresh then you can go to your github account and go through the notes, exercises and get up to speed quickly
* Now-a-days companies look for your github account to see what  you have learned and done and your github account can be added to your resume.

## Walk through
Lets walk through the process of putting something in github.
First you need to create account and you can view the details here: [Github basics](https://github.com/sairamaj/programmingclass/blob/master/sessions/githubinfo.MD)

If you follow the above link and see the screenshots all you need to remember is following

#### Get repository to your local machine
* A repository is collection of files ( can contain folders) 
* go to github.com and login and go to repository
* for example a repository __basicjava__ for my account will be
    https://github.com/sairamaj/basicjava.git
    (see the pattern above)
    * https
    * github.com
    * account name ( here sairamaj is my account)
    * repository name (basicjava)
    * .git
    you can get this information from ![getrepositoryurl](https://github.com/sairamaj/programmingclass/blob/master/images/github/getrepositoryurl.png)

on your local machine go to command prompt and type the following command 
* cd \
* md gitlearn
* cd gitlearn
* git clone __aboveurl__
* like below

![clonerepository](https://github.com/sairamaj/programmingclass/blob/master/images/github/clonerepository.png)

This will bring whatever is there in the repository on to your machine.

__Note__: When you have empty files in your repository you may see some warnings but thats normal.

#### Adding new files
Lets say you want to add new files in to this repository. for example you are creating session3.txt for this session.

* type __notepad session3.txt__
* in notepad type your own notes
* use File->Save option to save 
* Quit the notepad

* now type __git status__ this command will show any changes done in red color indicating some changes  you have done.

* type  __git add &ast;__ to add these files to your __local__ git (note: you are files on local machine still)
* next type __git status__ again to see all the files are shown in green.
* type __git commit -m "some comment"__ This will put in to local git ( again your files are still in on  your machine)
* type __git push origin master__ to finally push these changes to  your github account.

At this time you can go to your github account and see whether your newly added files existing there.

#### Modifying the files
The procedure is same except instead of creating new file you will be modifying.
* open command prompt
* cd \
* cd gitlearn\basicjava
* notepad session3.txt
* modify with new notes
* File->Save
* quit notepad
* __git status__
* __git add &ast;__
* __git commit -m "comment"__
* __git push origin master__

#### Deleting the files
* use __del__ command ( or use file explorer)
* repeat the above __git__ commands

#### Summary

   |    command                         |  description
   | ------------------                 | -----------------    
   |     __git status__                 |     shows the status of any additions/modifications/deletions
   |     __git add &ast;__              |     adds the files to local
   |     __git commit -m"some comment'__|     commits to local repository
   |     __git push origin master__     |     **finally they are in your github account**








