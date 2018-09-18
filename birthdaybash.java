
	package birthdaybash;
	import java.util.*;
	import java.awt.*;
	import javax.swing.*;

	public class birthdaybash {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a=0; 
			String [] month_arr = {"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
			String [] days_arr = new String [31] ;
			for(int i=1;i<32;i++) 
				days_arr[i-1]=Integer.toString(i);
			
			String [] year_arr = new String [60] ;
			for(int i=1990;i<2050;i++) 
				year_arr[i-1990]=Integer.toString(i);
			
		
			
			JFrame frame=new JFrame();
			JLabel l =new JLabel("BIRTHDAY REMINDER");
			JLabel l2=new JLabel("Day:");
			JLabel l3=new JLabel("Month:");
			JLabel l4=new JLabel("Year:");
			JLabel l5=new JLabel("Time Left in your birthday:");
			JLabel l6 =new JLabel("");
			ImageIcon icon=new ImageIcon("bp.jpg");
			ImageIcon icon1=new ImageIcon();
			JLabel l1 = new JLabel(icon1);
			JComboBox month = new JComboBox(month_arr);
			JComboBox days = new JComboBox(days_arr);
			JComboBox year = new JComboBox(year_arr);
			frame.setBounds(1920,1110,icon1.getIconWidth(),icon1.getIconHeight());
			
			Font f= new Font("Algerian",Font.PLAIN,20);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBounds(100, 100, 1000, 500);
			frame.setTitle("birthday reminder");
			frame.setIconImage(icon.getImage());
			
		Container c = frame.getContentPane();
		c.setBackground(Color.lightGray);
		c.setLayout(null);
		l.setFont(f);
		
		l.setBounds(550,20,500,250);
		l2.setBounds(500,70,500,250);
		l3.setBounds(650,70,500,250);
		l4.setBounds(815,70,500,250);
		l5.setBounds(550,150,500,250);
		l1.setBounds(600,10,icon1.getIconWidth(),icon1.getIconHeight());
		days.setBounds(525,178,70,30);
		month.setBounds(690,178,70,30);
		year.setBounds(845,178,70,30);
		l6.setBounds(700,256,130,30);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l);
		c.add(days);
		c.add(month);
		c.add(year);
		c.add(l6);
    
		days.setEditable(true);
		month.setEditable(true);
		year.setEditable(true);
		}

	
}
