import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class rButtons extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rButtons frame = new rButtons();
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
	public rButtons() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rbx = new JRadioButton("X");
		buttonGroup.add(rbx);
		rbx.setBounds(30, 83, 141, 23);
		contentPane.add(rbx);
		
		JRadioButton rbY = new JRadioButton("Y");
		buttonGroup.add(rbY);
		rbY.setBounds(30, 118, 141, 23);
		contentPane.add(rbY);
		
		JRadioButton rbZ = new JRadioButton("Z");
		buttonGroup.add(rbZ);
		rbZ.setBounds(30, 153, 141, 23);
		contentPane.add(rbZ);
		
		JLabel lbl1 = new JLabel("..");
		lbl1.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		contentPane.add(lbl1, BorderLayout.NORTH);
		
		if (rbx.isSelected()){
			lbl1.setText("You chose X");
		}
		contentPane.repaint();
		contentPane.revalidate();
		
	}
}
