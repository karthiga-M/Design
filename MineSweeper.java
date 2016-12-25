import java.util.HashMap;
import java.util.Map;

public class MineSweeper
{
    Map<Integer, Cell> cells = new HashMap<Integer, Cell>();
    int cellCount = 4;
    int MineCells = 1;
    int openCount = 0;

    public void start()
    {
        int i = 0;
        while (i <= cellCount - MineCells)
        {
            cells.put(i++, new MineCell());
        }
        int j = i;
        while (j <= this.MineCells)
        {
            cells.put(j++, new Cell());
        }
    }

    public void Click(int i) throws Exception
    {
        if (cells.get(i).openCell())
            openCount++;
    }

}
