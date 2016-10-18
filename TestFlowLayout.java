import javax.swing.*;
import java.awt.FlowLayout;

public class TestFlowLayout extends JFrame {
	public TestFlowLayout() {
		setLayout( new FlowLayout( FlowLayout.LEFT, 10, 20 ) );
		add ( new JLabel ( "First Name" ) );
		add ( new JTextField(8) );
		add ( new JLabel ( "MI" ) );
		add ( new JTextField(1) );
		add ( new JLabel( "Last Name" ) );
		add ( new JTextField(8) );
       }
	public static void main( String[] args ) {
		TestFlowLayout frame = new TestFlowLayout();
		frame.setTitle( "FlowLayout" );
		frame.setSize( 400, 300 );
		frame.setLocationRelativeTo ( null );
		frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE);
		frame.setVisible ( true );
	}
}

