import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class AGame{
	
	public static void makeMove(JFrame f, JPanel[][] p, int row, int col, Game g) {
		
		p[row][col].removeAll();
		
		char symbol = g.move(row, col);
		
		p[row][col].add(new JButton(Character.toString(symbol)));
		
		f.validate();
		f.repaint();
		
		if(g.checkIfPlayer1Win()) {
			
			//JPanel message = new JMessage("Win");
			
		}else if (g.checkIfPlayer2Win()) {
			
			
		}else if (g.checkforDraw()) {
			
			
		}
		
		
	}

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("TicTacToe");
		frame.setSize(700, 700);
	   	frame.setVisible(true);
	   	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	
	   	JPanel panel = new JPanel();
		JButton button = new JButton("Start Game.");
		
		char player1 = 'O';
		char player2 = 'X';
		
		Game gam = new Game(player1, player2);
		
		JLabel title = new JLabel("Tic Tac Toe");
		title.setFont(new Font(title.getFont().getName(), title.getFont().getStyle(), 30));
		
		panel.add(title);
		
		frame.add(panel, BorderLayout.NORTH);
		
		frame.add(button, BorderLayout.SOUTH);
		
		button.addActionListener(new ActionListener()
				{
			
					public void actionPerformed(ActionEvent e)
					{
						
						frame.remove(panel);
						frame.remove(button);
						JPanel[][] layout = new JPanel[3][3];
						GridLayout board = new GridLayout(3,3);
						frame.setLayout(board);
						
						for(int i = 0; i < 3; i++) {
							for(int j = 0; j < 3; j++) {
								
								layout[i][j] = new JPanel();
								frame.add(layout[i][j]);
								
							}
						}
						
						JButton topleft = new JButton();
						topleft.setPreferredSize(new Dimension(200,200));
						topleft.addActionListener(new ActionListener(){ 
							
							public void actionPerformed(ActionEvent e) {makeMove(frame, layout, 0, 0, gam);}
							
						});
						layout[0][0].add(topleft);
						
						
						JButton topright = new JButton();
						topright.setPreferredSize(new Dimension(200,200));
						topright.addActionListener(new ActionListener(){ 
							
							public void actionPerformed(ActionEvent e) {makeMove(frame, layout, 0, 2, gam);}
							
						});
						layout[0][2].add(topright);
						
						JButton topmid = new JButton();
						topmid.setPreferredSize(new Dimension(200,200));
						topmid.addActionListener(new ActionListener(){ 
							
							public void actionPerformed(ActionEvent e) {makeMove(frame, layout, 0, 1, gam);}
							
						});
						layout[0][1].add(topmid);
						
						JButton midleft = new JButton();
						midleft.setPreferredSize(new Dimension(200,200));
						midleft.addActionListener(new ActionListener(){ 
							
							public void actionPerformed(ActionEvent e) {makeMove(frame, layout, 1, 0, gam);}
							
						});
						layout[1][0].add(midleft);
						
						JButton midright = new JButton();
						midright.setPreferredSize(new Dimension(200,200));
						midright.addActionListener(new ActionListener(){ 
							
							public void actionPerformed(ActionEvent e) {makeMove(frame, layout, 1, 2, gam);}
							
						});
						layout[1][2].add(midright);
						
						JButton midmid = new JButton();
						midmid.setPreferredSize(new Dimension(200,200));
						midmid.addActionListener(new ActionListener(){ 
							
							public void actionPerformed(ActionEvent e) {makeMove(frame, layout, 1, 1, gam);}
							
						});
						layout[1][1].add(midmid);
						
						JButton bottomleft = new JButton();
						bottomleft.setPreferredSize(new Dimension(200,200));
						bottomleft.addActionListener(new ActionListener(){ 
							
							public void actionPerformed(ActionEvent e) {makeMove(frame, layout, 2, 0, gam);}
							
						});
						layout[2][0].add(bottomleft);
						
						JButton bottomright = new JButton();
						bottomright.setPreferredSize(new Dimension(200,200));
						bottomright.addActionListener(new ActionListener(){ 
							
							public void actionPerformed(ActionEvent e) {makeMove(frame, layout, 2, 2, gam);}
							
						});
						layout[2][2].add(bottomright);
						
						JButton bottommid = new JButton();
						bottommid.setPreferredSize(new Dimension(200,200));
						bottommid.addActionListener(new ActionListener(){ 
							
							public void actionPerformed(ActionEvent e) {makeMove(frame, layout, 2, 1, gam);}
							
						});
						layout[2][1].add(bottommid);
						
						frame.validate();
						frame.repaint();
						
					}
			
				});
		

	}
	
	

}
