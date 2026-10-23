import javax.swing.*;
import java.awt.*;

class SenderWindow extends JFrame {
	
	private JLabel lblSender;
	private JPanel pnlHome;
	private JButton btnSend;
	private JTextField txtFeild;
	private JTextArea txtArea;
	private JButton btnAdd;
	
	private Sender2Window sender2Window;
	private Sender3Window sender3Window;
		
	SenderWindow(){
		setTitle("Sender");
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(10,10));
		
		lblSender = new JLabel("Sender");
		lblSender.setFont(new Font("",1,20));
		lblSender.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblSender);
		
		btnAdd = new JButton("+");
		add("East",btnAdd);
		
		pnlHome = new JPanel(new BorderLayout(5,5));
		
		btnSend = new JButton ("Send");
		pnlHome.add(btnSend,BorderLayout.EAST);
		
		txtFeild = new JTextField();
		setFont(new Font("",1,20));
		pnlHome.add(txtFeild,BorderLayout.SOUTH);
		
		txtArea = new JTextArea();
		pnlHome.add(txtArea,BorderLayout.CENTER);
		
		add(pnlHome,BorderLayout.CENTER);
		
		btnAdd.addActionListener(e->{
			new NewSender().setVisible(true);
		});
		
		btnSend.addActionListener(e->{
			String msg = txtFeild.getText();
			showMessage("Sender 01 - "+msg);
			sender2Window.showMessage("Sender 01 - "+msg);
			sender3Window.showMessage("Sender 01 - "+msg);
			txtFeild.setText("");
		});

		setVisible(true);
	}
	public void showMessage (String msg){
		txtArea.append(msg+"\n");
	}
	public void setSenders(Sender2Window s2 , Sender3Window s3){
		sender2Window = s2;
		sender3Window = s3;
	}
}

class Sender2Window extends JFrame{
	private JLabel lblSender;
	private JPanel pnlHome;
	private JButton btnSend;
	private JTextField txtFeild;
	private JTextArea txtArea;
	private JButton btnAdd;
	
	private SenderWindow senderWindow;
	private	Sender3Window sender3Window;
		
	Sender2Window(){
		setTitle("Sender 02");
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(10,10));
		
		
		lblSender = new JLabel("Sender 02");
		lblSender.setFont(new Font("",1,20));
		lblSender.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblSender);
		
		pnlHome = new JPanel(new BorderLayout(5,5));
		
		btnSend = new JButton ("Send");
		pnlHome.add(btnSend,BorderLayout.EAST);
		
		txtFeild = new JTextField();
		setFont(new Font("",1,20));
		pnlHome.add(txtFeild,BorderLayout.SOUTH);
		
		txtArea = new JTextArea();
		pnlHome.add(txtArea,BorderLayout.CENTER);
		
		add(pnlHome,BorderLayout.CENTER);
		
		btnSend.addActionListener(e->{
			String msg = txtFeild.getText();
			showMessage("Sender 02 - "+msg);
			senderWindow.showMessage("Sender 02 - "+msg);
			sender3Window.showMessage("Sender 02 - "+msg);
			txtFeild.setText("");
		});
		
		setVisible(true);
	}
	public void showMessage (String msg){
		txtArea.append(msg+"\n");
	}
	public void setSenders(SenderWindow s1,Sender3Window s3){
		senderWindow=s1;
		sender3Window = s3;
	}
}

class Sender3Window extends JFrame{
	private JLabel lblSender;
	private JPanel pnlHome;
	private JButton btnSend;
	private JTextField txtFeild;
	private JTextArea txtArea;
	private JButton btnAdd;
	
	private SenderWindow senderWindow;
	private Sender2Window sender2Window;
		
	Sender3Window(){
		setTitle("Sender 03");
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(10,10));
		
		
		lblSender = new JLabel("Sender 03");
		lblSender.setFont(new Font("",1,20));
		lblSender.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblSender);
		
		pnlHome = new JPanel(new BorderLayout(5,5));
		
		btnSend = new JButton ("Send");
		pnlHome.add(btnSend,BorderLayout.EAST);
		
		txtFeild = new JTextField();
		setFont(new Font("",1,20));
		pnlHome.add(txtFeild,BorderLayout.SOUTH);
		
		txtArea = new JTextArea();
		pnlHome.add(txtArea,BorderLayout.CENTER);
		
		
		add(pnlHome,BorderLayout.CENTER);
		
		btnSend.addActionListener(e->{
			String msg = txtFeild.getText();
			showMessage("Sender 03 - "+msg);
			senderWindow.showMessage("Sender 03 - "+msg);
			sender2Window.showMessage("Sender 03 - "+msg);
			txtFeild.setText("");
		});

		setVisible(true);
	}
	public void showMessage (String msg){
		txtArea.append(msg+"\n");
	}
	public void setSenders(SenderWindow s1 , Sender2Window s2){
		senderWindow=s1;
		sender2Window=s2;
	}
}

class NewSender extends JFrame{
	
	private JLabel lblSender;
	private JButton btnAddSender;
	private JTextField newSender;
	private JPanel pnlHome;
	
	NewSender(){
		setTitle("new Sender");
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(10,10));
		
		lblSender = new JLabel("Add new Sender");
		lblSender.setFont(new Font("",1,20));
		lblSender.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblSender);
		
		pnlHome = new JPanel(new BorderLayout(5,5));
		
		btnAddSender =  new JButton("Add");
		pnlHome.add(btnAddSender,BorderLayout.SOUTH);
		
		newSender = new JTextField();
		setFont(new Font("",1,20));
		pnlHome.add(newSender,BorderLayout.CENTER);

		add(pnlHome,BorderLayout.CENTER);
		
		
		btnAddSender.addActionListener(e->{
			
			
		});
	
		setVisible(true);
	}
}

class GetNewSender extends JFrame{
	
	private JLabel lblSender;
	
	GetNewSender(){
		setTitle("newSender");
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(10,10));
		////
		lblSender = new JLabel("Add new Sender");
		lblSender.setFont(new Font("",1,20));
		lblSender.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblSender);
	}
	
}

class Demo {
	public static void main(String args[]){
		SenderWindow s1 = new SenderWindow();
		Sender2Window s2 = new	Sender2Window();
		Sender3Window s3 = new Sender3Window();
		
		s1.setSenders(s2,s3);
		s2.setSenders(s1,s3);
		s3.setSenders(s1,s2);
	}
}
