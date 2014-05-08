package hostnametoIP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hostnametoIPappw {

	private JFrame frame;
	private JTextField txtHostname;
	private JTextField txtIPaddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hostnametoIPappw window = new hostnametoIPappw();
					
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hostnametoIPappw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblHostnameotip = new JLabel("Enter hostname, press Resolve to get IP address");
		lblHostnameotip.setBounds(0, 20, 376, 32);
		lblHostnameotip.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblHostnameotip);
		
		JLabel lblHostname = new JLabel("Hostname");
		lblHostname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHostname.setBounds(10, 63, 86, 24);
		frame.getContentPane().add(lblHostname);
		
		txtHostname = new JTextField();
		txtHostname.setBounds(106, 63, 198, 26);
		txtHostname.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(txtHostname);
		txtHostname.setColumns(10);
		
		JLabel lblIpAddress = new JLabel("IP address");
		lblIpAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIpAddress.setBounds(10, 110, 86, 24);
		frame.getContentPane().add(lblIpAddress);
		
		txtIPaddress = new JTextField();
		txtIPaddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtIPaddress.setColumns(10);
		txtIPaddress.setBounds(106, 110, 198, 26);
		frame.getContentPane().add(txtIPaddress);
		
		JButton btnResolve = new JButton("Resolve");
		btnResolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnResolve.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				txtIPaddress.setText(hostnametoIP.hosttoIP(txtHostname.getText()));
			}
		});
		btnResolve.setBounds(67, 147, 102, 23);
		frame.getContentPane().add(btnResolve);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtHostname.setText(null);
				txtIPaddress.setText(null);
			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setBounds(202, 147, 102, 23);
		frame.getContentPane().add(btnReset);
		frame.setSize(400,250);
		/** frame.setVisible(true); **/ 
		
	}
}
