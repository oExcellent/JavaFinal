import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizActionListener extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizActionListener frame = new QuizActionListener();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuizActionListener() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lbl1 = new JLabel("..");
		lbl1.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		contentPane.add(lbl1, BorderLayout.NORTH);
		
		JButton btnClickMe = new JButton("Click Me!");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lbl1.setText("This question is easy");
			}
		});
		contentPane.add(btnClickMe, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Dismiss");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText("");
			}
		});
		contentPane.add(btnNewButton, BorderLayout.EAST);
	}

}
