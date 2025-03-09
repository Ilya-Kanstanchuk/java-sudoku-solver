import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateSudokuTemplateButton extends CustomButton{
    public UpdateSudokuTemplateButton(int[][] values, Cell[][] cells, JPanel boardPanel) {
        super(values, cells, boardPanel);
        setText("Update");
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameBoard.updateValues(values);
                GameBoard.updateCells(cells, values);
                GameBoard.addValuesOnBoard(cells, boardPanel);
                boardPanel.revalidate();
                boardPanel.repaint();
            }
        });
    }

}
