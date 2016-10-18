import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestInput extends JFrame {

	JTextField jtf = new JTextField();
	JTextField jtl = new JTextField();
	public static void main ( String[] args ) {
		TestInput frame = new TestInput();
		frame.setTitle ( "Panel Test" );
		frame.setSize ( 512, 128 );
		frame.setLocationRelativeTo ( null );
		frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
	}
	public TestInput() {
		//create the first panel
		JPanel p = new JPanel();
		p.setLayout( new GridLayout(2,2,5,5) );

		p.add( new JLabel ( "First Name" ) );
		p.add( jtf );
		jtf.setHorizontalAlignment( JTextField.RIGHT );
		jtf.addActionListener( new TextFieldListenerFNAME() );
		
		p.add ( new JLabel ( "Last Name" ) );
		p.add ( jtl );
		jtl.setHorizontalAlignment( JTextField.LEFT );
		jtl.addActionListener( new TextFieldListenerLNAME() );

		add(p, BorderLayout.WEST );
	}

	private class TextFieldListenerFNAME implements ActionListener {
		public void actionPerformed ( ActionEvent e ) {
			String fname = jtf.getText().trim();
			System.out.println( "First Name entered is " + fname );
		}
	}
	private class TextFieldListenerLNAME implements ActionListener {
                public void actionPerformed ( ActionEvent e ) {
                        String lname = jtl.getText().trim();
                        System.out.println( "Last Name entered is " + lname );
                }
        }
}
