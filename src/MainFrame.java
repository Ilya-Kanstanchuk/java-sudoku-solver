import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel boardPanel;
    private JPanel topPanel;
    private CompleteButton completeButton;
    private UpdateSudokuTemplateButton updateSudokuTemplateButton;
    private int[][] values;
    private Cell[][] cells;
    public MainFrame()
    {
        boardPanel = new JPanel();
        topPanel = new JPanel();
        values = SudokuList.generateSudoku();
        cells = GameBoard.getCells(values);
        GameBoard.addValuesOnBoard(cells, boardPanel);
        completeButton = new CompleteButton(values, cells, boardPanel);
        updateSudokuTemplateButton = new UpdateSudokuTemplateButton(values, cells, boardPanel);
        topPanel.add(completeButton, BorderLayout.CENTER);
        topPanel.add(updateSudokuTemplateButton, BorderLayout.CENTER);
        topPanel.setPreferredSize(new Dimension(500, 50));
        add(topPanel, BorderLayout.NORTH);
        add(boardPanel, BorderLayout.CENTER);
    }
}
