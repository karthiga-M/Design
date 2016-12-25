# Design Problem

The objective of the game is to clear a minefield without detonating a land mine.The player is initially presented with n*n grid squares.
Some randomly-selected squares,unknown to the player are designated to contain mines.

On each turn, the playet has to select a square (x,y) to indicate if it contains a mine (flag a mine) or if it is safe and does not have a mine(open a cell).
If square containing a mine is opened ,the player loses the game.
If it does not contain a mine,the square displays '0'.

The player uses this information to deduce the contents of other squares, may either safely reveal each square as containing a mine. The game is won when all mine-free squares are revealed, because all mines have been located.


Sample Input:

Enter the minefield layout:xxm,xmx,xxx

This represents a 3*3 mine field with mines located in 0,2 and 1,1 locations.The program should then display the grid as shown below with all squares concealed.

xxx
xxx
xxx

Enter option :o(0,0)
(this option specifies to open location 0,0.The program should then display the grid as shown below.)

0xx
xxx
xxx

Enter option:o(1,1)
(this options specifies to open location 1,1. Since there is a mine, the player loses.The output will be as shown below.)

00f
xmx
xxx

oops you stepped on a mine!ame over !
