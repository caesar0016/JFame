package framePanels;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class main_panel01 {

	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		Border border = BorderFactory.createLineBorder(Color.WHITE, 5);
		BufferedImage cross = ImageIO.read(new File("C:\\Users\\dapit\\Pictures\\Saved Pictures\\ex.png"));
		JLabel pic = new JLabel(new ImageIcon(cross));
		
		JPanel cross01 = new JPanel();
		JPanel cross02 = new JPanel();
		JPanel cross03 = new JPanel();
		JPanel cross04 = new JPanel();
		
		cross01.setBackground(Color.red);
		cross01.setSize(500, 500);
		cross01.setBounds(0, 0, 150, 150);
		cross01.setBorder(border);
		cross01.add(pic);
		
		
		
		cross02.setBackground(Color.blue);
		cross02.setSize(500, 500);
		cross02.setBounds(0, 150, 150, 150);
		cross02.setBorder(border);
		
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(cross01);
		frame.add(cross02);
		frame.add(cross03);
		frame.add(cross04);
		
	
	
	
	
	
	}

}
