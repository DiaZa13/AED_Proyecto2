import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;

public class GUI_MainApp {

	private JFrame frame;
	
	private ImageIcon logo, ubicacion, dinero;
	private Icon logoIcon, ubicacionIcon, dineroIcon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_MainApp window = new GUI_MainApp();
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
	public GUI_MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 358, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
//------------HomePanel
		logo = new ImageIcon(getClass().getResource("Logo1.png"));
		logoIcon = new ImageIcon(logo.getImage().getScaledInstance(345, 80, Image.SCALE_DEFAULT));
		ubicacion = new ImageIcon(getClass().getResource("ubicacion.png"));
		ubicacionIcon = new ImageIcon(ubicacion.getImage().getScaledInstance(40, 35, Image.SCALE_DEFAULT));
		dinero = new ImageIcon(getClass().getResource("dinero.png"));
		dineroIcon = new ImageIcon(dinero.getImage().getScaledInstance(50, 45, Image.SCALE_DEFAULT));
		
		JPanel HomePanel = new JPanel();
		HomePanel.setBackground(Color.WHITE);
		frame.getContentPane().add(HomePanel, "name_1061856235906000");
		HomePanel.setLayout(null);
		
		JLabel lblLogoImage = new JLabel("");
		lblLogoImage.setBounds(0, 0, 345, 80);
		HomePanel.add(lblLogoImage);
		lblLogoImage.setIcon(logoIcon);
		
		JComboBox cbZona = new JComboBox();
		cbZona.setBounds(191, 136, 143, 26);
		HomePanel.add(cbZona);
		
		JLabel lblZona = new JLabel("Seleccione una Zona");
		lblZona.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblZona.setBounds(10, 136, 171, 26);
		HomePanel.add(lblZona);
		
		JLabel lblCalle = new JLabel("Seleccione una Calle");
		lblCalle.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblCalle.setBounds(10, 172, 171, 26);
		HomePanel.add(lblCalle);
		
		JComboBox cbCalle = new JComboBox();
		cbCalle.setBounds(191, 172, 143, 26);
		HomePanel.add(cbCalle);
		
		JLabel lblUbicacionmsg = new JLabel("UBICACION");
		lblUbicacionmsg.setForeground(new Color(204, 0, 0));
		lblUbicacionmsg.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblUbicacionmsg.setBounds(40, 102, 108, 26);
		HomePanel.add(lblUbicacionmsg);
		
		JLabel lblLimiteEconomico = new JLabel("LIMITE ECONOMICO");
		lblLimiteEconomico.setForeground(new Color(204, 0, 0));
		lblLimiteEconomico.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblLimiteEconomico.setBounds(57, 225, 187, 26);
		HomePanel.add(lblLimiteEconomico);
		
		JLabel lblUbicacionImage = new JLabel("");
		lblUbicacionImage.setForeground(new Color(204, 0, 0));
		lblUbicacionImage.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblUbicacionImage.setBounds(0, 88, 40, 45);
		HomePanel.add(lblUbicacionImage);
		lblUbicacionImage.setIcon(ubicacionIcon);
		
		JLabel lblDineroImage = new JLabel("");
		lblDineroImage.setForeground(new Color(204, 0, 0));
		lblDineroImage.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblDineroImage.setBounds(7, 212, 40, 45);
		HomePanel.add(lblDineroImage);
		lblDineroImage.setIcon(dineroIcon);
	}
}
