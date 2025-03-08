import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ComplexCell extends JPanel {
    private SudokuElement[][] elementsList;
    private int position;
    public ComplexCell(SudokuElement[][] elementsList, int position)
    {
        this.position = position;
        this.elementsList = elementsList;
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setLayout(new GridLayout(3, 3, 0,0));
        int startRow = ((position - 1) / 3) * 3;
        int startCol = ((position - 1) % 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                SudokuElement element = elementsList[startRow + i][startCol + j];
                PrimitiveCell cell = new PrimitiveCell(element);
                add(cell);
            }
        }
    }
}
