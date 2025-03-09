import javax.swing.*;
import java.awt.*;

public class GameBoard {
    public static Cell[][] getCells(int[][] values)
    {
        Cell[][] cellsArr = new Cell[values.length][values.length];
        for (int i = 0; i < values.length; i++)
        {
            for (int j = 0; j < values.length; j++)
            {
                Cell cell = new Cell(values[i][j]);
                if (((i + 1) % 3 == 0) && ((j + 1) % 3 == 0))
                {
                    cell.setBorder(BorderFactory.createMatteBorder(1, 1, 3, 3, Color.BLACK));
                }
                else if ((i + 1) % 3 == 0)
                {
                    cell.setBorder(BorderFactory.createMatteBorder(1, 1, 3, 1, Color.BLACK));
                }
                else if ((j + 1) % 3 == 0)
                {
                    cell.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 3, Color.BLACK));
                }
                cellsArr[i][j] = cell;
            }
        }
        return cellsArr;
    }
    public static void addValuesOnBoard(Cell[][] values, JPanel boardPanel)
    {
        boardPanel.removeAll();
        boardPanel.setLayout(new GridLayout(9, 9));
        for (int i = 0; i < values.length; i++)
        {
            for (int j = 0; j < values.length; j++)
            {
                boardPanel.add(values[i][j]);
            }
        }
    }
    public static void createNewBoard(Cell[][] values, int[][] updatedData)
    {
        for (int i = 0; i < values.length; i++)
        {
            for (int j = 0; j < values.length; j++)
            {
                if (values[i][j].getCellText().isEmpty())
                {
                    values[i][j].setCellText(updatedData[i][j] + "");
                }
            }
        }
    }
    public static void updateValues(int[][] values) {
        int[][] newValues = SudokuList.generateSudoku();
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = newValues[i][j];
            }
        }
    }

    public static void updateCells(Cell[][] cells, int[][] values) {
        Cell[][] newCells = getCells(values);
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = newCells[i][j];
            }
        }
    }
}
