import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    private int[][] values;
    private Cell[][] cells;
    private JPanel boardPanel;
    public CustomButton(int[][] values, Cell[][] cells, JPanel boardPanel)
    {
        setSize(new Dimension(40, 20));
        this.values = values;
        this.cells = cells;
        this.boardPanel = boardPanel;
    }
}
