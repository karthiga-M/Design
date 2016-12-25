public class Player
{
    public static void main(String[] args)
    {
        MineSweeper mineSweeper = new MineSweeper();
        mineSweeper.start();
        try
        {
            mineSweeper.Click(1);
            mineSweeper.Click(2);
            mineSweeper.Click(3);
            mineSweeper.Click(4);
            if (mineSweeper.openCount == mineSweeper.cellCount)
                System.out.println("You Won!");
        }
        catch (Exception e)
        {
            System.out.println("Its a mine cell, You Lost");
        }
    }

}
