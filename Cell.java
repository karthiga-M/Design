
public class Cell
{

    boolean openCell() throws Exception
    {
        return true;
    }
}

class MineCell extends Cell
{
    boolean openCell() throws Exception
    {
        throw new Exception("Its a mine cell");
    }
}

