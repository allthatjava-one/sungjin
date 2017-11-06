User Story

A user can play the JugPuzzle specified below: 
A Jug Puzzle consists of three Jugs (numbered 0,1 and 2) with capacities 8,5 and 3 respectively. Initially, jug 0 is full, the other two are empty. The player of the game (user of the program) spills liquid between the jugs until both jugs 0 and 1 contain 4 units of liquid each. When a player spills between jugs, either one jug will be emptied or one jug will be filled. An example trace of the game follows:

0  0:(8/8) 1:(0/5) 2:(0/3)
spill from jug: 0
into jug: 1
1  0:(3/8) 1:(5/5) 2:(0/3)
spill from jug: 1
into jug: 2
2  0:(3/8) 1:(2/5) 2:(3/3)
spill from jug: 1
into jug: 0
3  0:(5/8) 1:(0/5) 2:(3/3)

...

spill from jug: 0
into jug: 2
9  0:(4/8) 1:(1/5) 2:(3/3)
spill from jug: 2
into jug: 1
Congrats you solved it in 10 moves!!
Use Javas Object Oriented features to write a program which plays the JugPuzzle with a user. That is, define classes (JugPuzzle, Jug, JugPuzzleController). For each class, identify
IS-A: inheritance (extends)
HAS-A: attributes
RESPONDS-TO: methods 
Note:: Include toString(), the method that returns a String representation of an instance. Also include constructors: special initialization code used when creating new instances.
All of your classes should have JavaDoc and appropriate JUnit tests. Please see your repository for starter code, including JugPuzzleController (which you should not modify, except for adding JavaDoc), also, don't unit test JugPuzzleController. On the submit dates and due date, we will check your code out of your repository.

