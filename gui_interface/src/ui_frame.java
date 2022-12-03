
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class ui_frame {

	public static void main(String[] args) {

	JFrame jf = new JFrame();
	JLabel label = new JLabel();
	Border bd = BorderFactory.createLineBorder(Color.red, 10); //directly alter the color and the width size of the borders

	jf.setVisible(true);
	jf.setSize(500, 500);
	jf.setTitle("Test");
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setLayout(null);
	
	
	label.setText("IT'S-A ME MARIO!!"); //setting text to "ITs me mario"
	jf.add(label); // adding label to the jframe
	ImageIcon imge = new ImageIcon("C:\\Users\\dapit\\Downloads\\mario.png"); // file path
	label.setIcon(imge); //making the label add imge as an Icon
	label.setBounds(200, 200, 100, 100); //like horizontal and vertical. (x, y, width, length)

	label.setVerticalAlignment(JLabel.CENTER);   //top center bottom
	label.setHorizontalAlignment(JLabel.CENTER);  //right center left
	label.setVerticalTextPosition(JLabel.TOP);
	label.setHorizontalTextPosition(JLabel.CENTER);
	label.setForeground(new Color(0x4682B4)); 
	label.setFont(new Font("Arial Black", Font.BOLD, 20));
	label.setIconTextGap(20); //gap between the text and Image Icon
	label.setBackground(Color.WHITE); //settings background to white
	label.setOpaque(true); //just like setVisible making the colors to appear
	label.setBorder(bd); //labels setting a border
	
	//jf.pack(); this is for resize same with pics. But need to disable layout, size and setbounds.
	
	}

}
