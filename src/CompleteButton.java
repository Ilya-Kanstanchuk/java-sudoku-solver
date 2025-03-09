import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompleteButton extends CustomButton{
    public CompleteButton(int[][] values, Cell[][] cells, JPanel boardPanel) {
        super(values, cells, boardPanel);
        setText("Complete");
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Solver().solveSudoku(values);
                GameBoard.createNewBoard(cells, values);
            }
        });
    }

}
