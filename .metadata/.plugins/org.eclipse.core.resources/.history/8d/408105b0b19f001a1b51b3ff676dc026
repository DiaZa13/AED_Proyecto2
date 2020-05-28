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
//Borrar despues
public class GUI_MainApp {

	private JFrame frame;
	
	private ImageIcon logo, ubicacion, dinero, calificacion;
	private Icon logoIcon, ubicacionIcon, dineroIcon, calificacionIcon;

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
		calificacion = new ImageIcon(getClass().getResource("calificacion.png"));
		calificacionIcon = new ImageIcon(calificacion.getImage().getScaledInstance(50, 45, Image.SCALE_DEFAULT));
		
		
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
		lblLimiteEconomico.setBounds(67, 225, 187, 26);
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
		lblDineroImage.setBounds(7, 212, 50, 45);
		HomePanel.add(lblDineroImage);
		lblDineroImage.setIcon(dineroIcon);
		
		JLabel lblMaxDinero = new JLabel("<html>Seleccione un rango de precios<html>\r\n");
		lblMaxDinero.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblMaxDinero.setBounds(10, 261, 143, 45);
		HomePanel.add(lblMaxDinero);
		
		JComboBox cbDinero = new JComboBox();
		cbDinero.setBounds(163, 261, 171, 41);
		HomePanel.add(cbDinero);
		
		JLabel lblCalificacion = new JLabel("CALIFICACION");
		lblCalificacion.setForeground(new Color(204, 0, 0));
		lblCalificacion.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblCalificacion.setBounds(67, 328, 187, 26);
		HomePanel.add(lblCalificacion);
		
		JLabel lblCalificacionImage = new JLabel("");
		lblCalificacionImage.setForeground(new Color(204, 0, 0));
		lblCalificacionImage.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblCalificacionImage.setBounds(10, 323, 50, 41);
		HomePanel.add(lblCalificacionImage);
		lblCalificacionImage.setIcon(calificacionIcon);
		
		JLabel lblUnaE = new JLabel("");
		lblUnaE.setForeground(new Color(204, 0, 0));
		lblUnaE.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblUnaE.setBounds(10, 380, 50, 45);
		HomePanel.add(lblUnaE);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(204, 0, 0));
		label.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		label.setBounds(83, 380, 50, 45);
		HomePanel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(new Color(204, 0, 0));
		label_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		label_1.setBounds(131, 380, 50, 45);
		HomePanel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setForeground(new Color(204, 0, 0));
		label_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		label_2.setBounds(201, 380, 50, 45);
		HomePanel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setForeground(new Color(204, 0, 0));
		label_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		label_3.setBounds(248, 380, 50, 45);
		HomePanel.add(label_3);
	}
}
