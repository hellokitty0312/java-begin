import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUlexample1 {
	public static void main(String[] args){
		
		//①Instantiate it!
		JFrame f= new JFrame("JFrame");
		JPanel p= new JPanel();
		JButton b= new JButton("JBtton");
		JLabel l= new JLabel("JLabel");
		BorderLayout BL= new BorderLayout();
		//ここにGUI部品を生成
		
		
		//②Set its properties!
		f.setVisible(true);
		f.setSize(256, 256);
		p.setBackground(Color.white);
		b.setSize(10, 30);
		b.setForeground(new Color(50,50,200));
		l.setSize(10, 30);
		l.setFont(new Font("Serif",Font.BOLD,48));
		p.setLayout(null);//x,y layout
		b.setBounds(new Rectangle(10,10, 100, 50));
		l.setBounds(new Rectangle(110,110,200,150));
		p.setLayout(BL);
		//GUI部品の表示、大きさ、色などを設定
		
		
		//③Listen it!
		MouseListener ML=new MouseListener(){
		public void mouseClicked(MouseEvent e){
		}
	    public void mouseEntered(MouseEvent e){
		}
		public void mouseExited(MouseEvent e){
		}
		public void mousePressed(MouseEvent e){
		System.out.println("The left mouse button was pressed.");
		
		public void mouseReleased(MouseEvent e){
		}
		
		
		
		//④Add it!
		p.add(b);
		p.add(l);
		f.add(p);
		p.add(b,BorderLayout.NORTH);
		p.add(l,BorderLayout.SOUTH);
		b.addMouseListener(ML);
		//f.setContentPane(p);という書き方もありますがこれは昔の仕様。今はこれでOK.
		
		
		
	}

}
