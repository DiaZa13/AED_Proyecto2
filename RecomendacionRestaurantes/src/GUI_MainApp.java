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
	
	private ImageIcon logo, ubicacion, dinero, calificacion, unaE, dosE, tresE, cuatroE, cincoE;
	private Icon logoIcon, ubicacionIcon, dineroIcon, calificacionIcon, unaEIcon, dosEIcon, tresEIcon, cuatroEIcon, cincoEIcon;

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
		frame.setBounds(100, 100, 358, 611);
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
		unaE = new ImageIcon(getClass().getResource("UnaE.png"));
		unaEIcon = new ImageIcon(unaE.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		dosE = new ImageIcon(getClass().getResource("dosE.png"));
		dosEIcon = new ImageIcon(dosE.getImage().getScaledInstance(80, 40, Image.SCALE_DEFAULT));
		tresE = new ImageIcon(getClass().getResource("tresE.png"));
		tresEIcon = new ImageIcon(tresE.getImage().getScaledInstance(120, 40, Image.SCALE_DEFAULT));
		cuatroE = new ImageIcon(getClass().getResource("cuatroE.png"));
		cuatroEIcon = new ImageIcon(cuatroE.getImage().getScaledInstance(160, 40, Image.SCALE_DEFAULT));
		cincoE = new ImageIcon(getClass().getResource("cincoE.png"));
		cincoEIcon = new ImageIcon(cincoE.getImage().getScaledInstance(120, 80, Image.SCALE_DEFAULT));
		
		
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
		
		JLabel lblDineroMax = new JLabel("LIMITE ECONOMICO");
		lblDineroMax.setForeground(new Color(204, 0, 0));
		lblDineroMax.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblDineroMax.setBounds(70, 225, 187, 26);
		HomePanel.add(lblDineroMax);
		
		JLabel lblUbicacionImage = new JLabel("");
		lblUbicacionImage.setForeground(new Color(204, 0, 0));
		lblUbicacionImage.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblUbicacionImage.setBounds(0, 88, 40, 45);
		HomePanel.add(lblUbicacionImage);
		lblUbicacionImage.setIcon(ubicacionIcon);
		
		JLabel lblDineroImage = new JLabel("");
		lblDineroImage.setForeground(new Color(204, 0, 0));
		lblDineroImage.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblDineroImage.setBounds(7, 212, 53, 45);
		HomePanel.add(lblDineroImage);
		lblDineroImage.setIcon(dineroIcon);
		
		JLabel lblSeleccioneElRango = new JLabel("<html>Seleccione el rango de precios<html>");
		lblSeleccioneElRango.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		lblSeleccioneElRango.setBounds(10, 263, 171, 45);
		HomePanel.add(lblSeleccioneElRango);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(191, 270, 143, 33);
		HomePanel.add(comboBox);
		
		JLabel lblCalificacion = new JLabel("CALIFICACION");
		lblCalificacion.setForeground(new Color(204, 0, 0));
		lblCalificacion.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblCalificacion.setBounds(70, 328, 187, 26);
		HomePanel.add(lblCalificacion);
		
		JLabel lblCalificacionImage = new JLabel("");
		lblCalificacionImage.setForeground(new Color(204, 0, 0));
		lblCalificacionImage.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblCalificacionImage.setBounds(10, 322, 53, 45);
		HomePanel.add(lblCalificacionImage);
		lblCalificacionImage.setIcon(calificacionIcon);
		
		JLabel lblUnaE = new JLabel("");
		lblUnaE.setForeground(new Color(204, 0, 0));
		lblUnaE.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblUnaE.setBounds(20, 377, 40, 40);
		HomePanel.add(lblUnaE);
		lblUnaE.setIcon(unaEIcon);
		
		JLabel lblDosE = new JLabel("");
		lblDosE.setForeground(new Color(204, 0, 0));
		lblDosE.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblDosE.setBounds(101, 377, 80, 40);
		HomePanel.add(lblDosE);
		lblDosE.setIcon(dosEIcon);
		
		JLabel lblTresE = new JLabel("");
		lblTresE.setForeground(new Color(204, 0, 0));
		lblTresE.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblTresE.setBounds(201, 377, 120, 40);
		HomePanel.add(lblTresE);
		lblTresE.setIcon(tresEIcon);
		
		JLabel lblCuatroE = new JLabel("");
		lblCuatroE.setForeground(new Color(204, 0, 0));
		lblCuatroE.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblCuatroE.setBounds(21, 456, 160, 40);
		HomePanel.add(lblCuatroE);
		lblCuatroE.setIcon(cuatroEIcon);
		
		JLabel lblCincoE = new JLabel("");
		lblCincoE.setForeground(new Color(204, 0, 0));
		lblCincoE.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblCincoE.setBounds(201, 436, 120, 80);
		HomePanel.add(lblCincoE);
		lblCincoE.setIcon(cincoEIcon);
		
	}
}
