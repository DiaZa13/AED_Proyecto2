import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.border.EtchedBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import com.toedter.calendar.JCalendar;
import java.awt.SystemColor;
import javax.swing.JList;
import java.awt.Cursor;

public class PrincipalGUI {

	private Controlador control;
	private String alerta;
	
	private JFrame frame;
	private JPanel PRegistrate;
	private JPanel PInicioS;
	private JPanel PDonaciones;
	private JPanel PUsuario;
	private JPanel PInicio;
	private JPanel POds_1;
	private JPanel POds_2;
	private JPanel POds_11;
	private JPanel POds_14;
	private JPanel POds_15;
	private JPanel PODS;
	private JPanel PHistorial;
	private JPanel PConfiguracion;
	
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtProfesion;
	private JTextField txtLugar;
	private JTextField txtUsuario;
	private JTextField txtCreditCard;
	private JTextField textField_1;
	private JTextField txtGenero;
	private JTextField txtEdad;

	private JCheckBox ChBTrabaja;
	private JCheckBox ChBEstudia;

	ImageIcon imagen,image,perfil;
	Icon icono,icon,Iperfil;
	ImageIcon od1, od2, od3, od4, od5, don, don1,his,conf,pconfi,ods_1,ods_2,ods_11, ods_14, ods_15;
	Icon ods1, ods2, ods3, ods4, ods5, dona, dona1,histo,confi,Iconfi,Ods_1,Ods_2,Ods_11, Ods_14, Ods_15;

	private JButton btnCrearCuenta;
	private JButton btnIniciarS;
	private JButton btnIniciarSesion;
	private JButton btnIngTarjeta;
	private JButton btnRegresar_1;
	private JButton btnRegresar_2;
	private JButton btnRegresar_11;
	private JButton btnRegresar_14;
	private JButton btnRegresar_15;
	private JButton btnRegresar_3;
	private JButton btnDonacion1;
	private JButton btnDonacion2;
	private JButton btnDonacion3;
	private JButton btnDonacion4;
	private JButton btnDonacion5;
	private JButton btnMasInfo;
	private JButton btnMasInfo2;
	private JButton btnMasInfo3;
	private JButton btnMasInfo4;
	private JButton btnMasInfo5;
	private JButton btnApoyaATeamtrees;
	private JButton btnagregarEvento;
	private JButton btnagregarEvento_1;
	private JButton btnagregarEvento_2;
	private JButton btnagregarEvento_3;
	private JButton btnagregarEvento_4;
	private JButton btnEvento;
	private JButton btnRecomendarEvento;
	private JButton btnRecomendarEvento_11;
	private JButton btnRecomendadionOds_14;
	private JButton btnRecomendarEvento_15;
	
	private JLabel lblPerfil;
	private JLabel lblImage;	
	private JLabel lblRecordarcontra;
	private JLabel lblOds_1;
	private JLabel lblOds_2;
	private JLabel lblOds_11;
	private JLabel lblOds_14;
	private JLabel lblOds_15;
	private JLabel lblOds;
	private JLabel lblHistorial;
	private JLabel lblDonaciones;
	private JLabel ImDonacion;
	private JLabel Im1Donacion;
	private JLabel ImHistorial;
	//private JLabel ImConfiguracion;
	private JLabel lblNombre_1;
	private JLabel lblCerrarSesion;
	private JLabel lblConfiguracion;
	private JLabel lblPImagen;
	private JLabel lblOds_1Im;
	private JLabel lblOds_2Im;
	private JLabel lblOds_11Im;
	private JLabel lblOds_14Im;
	private JLabel lblOds_15Im;
	//private JLabel lblRegistrate;
	private JLabel lblRegistrate;
	private JPasswordField pwfContrasena;
	private JPasswordField pwfContrasena_1;
	private JPasswordField pwfConfirmarContrasena;
	private JTextField txtPNombre;
	private JTextField txtPDireccion;
	private JTextField txtPCorreo;
	private JTextField txtPSexo;
	private JTextField txtPTelefono;
	private JTextField txtPProfesion;
	private JTextField txtPLugar;
	private JTextField txtPEdad;
	private JTextField txtDescripcion_1;
	
	private JComboBox<String> CBOds_1;
	private JComboBox<String> CBOds_2;
	private JComboBox<String> CBOds_11;
	private JComboBox<String> CBOds_14;
	private JComboBox<String> CBOds_15;
	private JLabel lblDespcripcion_15;
	private JLabel lblDescripcion_2;
	private JLabel lblDescripcion_11;
	private JLabel lblDescripcion_14;
		
	private String fecha;
	private JLabel EventosHistorial;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalGUI window = new PrincipalGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */

	public PrincipalGUI() throws SQLException {

		alerta = "";
		
		control = new Controlador();


		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		
		Teclado tecla = new Teclado();
		Mouse mouse = new Mouse();
		Listener listener = new Listener();
	
		
		//control.crearNuevoUsuario("", "", "", "5", "18", "18","Estudiante", "18","18");
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 727, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{461, 0};
		gridBagLayout.rowHeights = new int[]{39, 0, 0, -41, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		

	//Panel de Inicio de Sesion 
		
		PInicioS = new JPanel();
		PInicioS.setBackground(Color.WHITE);
		frame.getContentPane().add(PInicioS, "name_13267557990707");
		PInicioS.setLayout(new GridLayout(3, 0, 0, 0));
		
		String path = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		//ImageIcon(getClass().getResource("/images/Report.png"));
		image = new ImageIcon(getClass().getResource("CiudadanosGlobles_3.png"));
		icon = new ImageIcon(image.getImage().getScaledInstance(600, 170, Image.SCALE_DEFAULT));

		JPanel PTIniciar = new JPanel();
		PTIniciar.setBackground(new Color(240, 248, 255));
		PInicioS.add(PTIniciar);
		GridBagLayout gbl_PTIniciar = new GridBagLayout();
		gbl_PTIniciar.columnWidths = new int[]{0, 0};
		gbl_PTIniciar.rowHeights = new int[]{0, 61, 0};
		gbl_PTIniciar.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_PTIniciar.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		PTIniciar.setLayout(gbl_PTIniciar);
		
		JLabel lblCiudadanosGlobales = new JLabel("CIUDADANOS GLOBALES");
		lblCiudadanosGlobales.setForeground(new Color(0, 0, 128));
		lblCiudadanosGlobales.setFont(new Font("Eras Bold ITC", Font.BOLD, 37));
		GridBagConstraints gbc_lblCiudadanosGlobales = new GridBagConstraints();
		gbc_lblCiudadanosGlobales.insets = new Insets(0, 0, 5, 0);
		gbc_lblCiudadanosGlobales.gridx = 0;
		gbc_lblCiudadanosGlobales.gridy = 0;
		PTIniciar.add(lblCiudadanosGlobales, gbc_lblCiudadanosGlobales);
		
		JTextArea txtrelFuturoDe = new JTextArea();
		txtrelFuturoDe.setBackground(new Color(240, 248, 255));
		txtrelFuturoDe.setEditable(false);
		txtrelFuturoDe.setFont(new Font("Brush Script MT", Font.ITALIC, 22));
		txtrelFuturoDe.setText("\"El futuro no esta escrito, porque solo los ciudadanos \r\n                   pueden escribirlo\"-Adolfo Suarez");
		GridBagConstraints gbc_txtrelFuturoDe = new GridBagConstraints();
		gbc_txtrelFuturoDe.fill = GridBagConstraints.VERTICAL;
		gbc_txtrelFuturoDe.gridx = 0;
		gbc_txtrelFuturoDe.gridy = 1;
		PTIniciar.add(txtrelFuturoDe, gbc_txtrelFuturoDe);
		
		JPanel PImagen = new JPanel();
		PImagen.setBackground(new Color(240, 248, 255));
		PInicioS.add(PImagen);
		
		lblImage = new JLabel("");
		PImagen.add(lblImage);
		lblImage.setIcon(icon);
		
		JPanel PIniciarSesion = new JPanel();
		PIniciarSesion.setBackground(new Color(240, 248, 255));
		PInicioS.add(PIniciarSesion);
		GridBagLayout gbl_PIniciarSesion = new GridBagLayout();
		gbl_PIniciarSesion.columnWidths = new int[]{109, 0, 0};
		gbl_PIniciarSesion.rowHeights = new int[]{39, 36, 29, 0, 39, 0};
		gbl_PIniciarSesion.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_PIniciarSesion.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		PIniciarSesion.setLayout(gbl_PIniciarSesion);
		
		JLabel lblUsuario = new JLabel("Correo:");
		lblUsuario.setFont(new Font("Eras Medium ITC", Font.PLAIN, 17));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 0;
		PIniciarSesion.add(lblUsuario, gbc_lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.addKeyListener(tecla);
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.anchor = GridBagConstraints.SOUTH;
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 1;
		gbc_txtUsuario.gridy = 0;
		PIniciarSesion.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contrasena: ");
		lblContrasena.setFont(new Font("Eras Medium ITC", Font.PLAIN, 17));
		GridBagConstraints gbc_lblContrasena = new GridBagConstraints();
		gbc_lblContrasena.anchor = GridBagConstraints.EAST;
		gbc_lblContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasena.gridx = 0;
		gbc_lblContrasena.gridy = 1;
		PIniciarSesion.add(lblContrasena, gbc_lblContrasena);
		
		
		btnIniciarS = new JButton("Iniciar Sesion");
		btnIniciarS.addActionListener(listener);
		btnIniciarS.setEnabled(false);
		btnIniciarS.setForeground(new Color(255, 255, 255));
		btnIniciarS.setBackground(new Color(0, 0, 128));
		btnIniciarS.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		GridBagConstraints gbc_btnIniciarS = new GridBagConstraints();
		gbc_btnIniciarS.insets = new Insets(0, 0, 5, 0);
		gbc_btnIniciarS.gridwidth = 3;
		gbc_btnIniciarS.gridx = 0;
		gbc_btnIniciarS.gridy = 2;
		PIniciarSesion.add(btnIniciarS, gbc_btnIniciarS);
		
		pwfContrasena = new JPasswordField();
		pwfContrasena.setBackground(Color.WHITE);
		pwfContrasena.addKeyListener(tecla);
		pwfContrasena.setEnabled(false);
		pwfContrasena.setEchoChar('*');
		GridBagConstraints gbc_pwfContrasena = new GridBagConstraints();
		gbc_pwfContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_pwfContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwfContrasena.gridx = 1;
		gbc_pwfContrasena.gridy = 1;
		PIniciarSesion.add(pwfContrasena, gbc_pwfContrasena);
		
		lblRegistrate = new JLabel("<html>Aun no tienes cuenta. <b>Registrate<html>");
		lblRegistrate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegistrate.addMouseListener(mouse);
		lblRegistrate.setForeground(new Color(0, 0, 128));
		lblRegistrate.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrate.setFont(new Font("Eras Medium ITC", Font.PLAIN, 17));
		GridBagConstraints gbc_lblRegistrate = new GridBagConstraints();
		gbc_lblRegistrate.gridwidth = 3;
		gbc_lblRegistrate.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblRegistrate.insets = new Insets(0, 0, 5, 0);
		gbc_lblRegistrate.gridx = 0;
		gbc_lblRegistrate.gridy = 3;
		PIniciarSesion.add(lblRegistrate, gbc_lblRegistrate);
		
		lblRecordarcontra = new JLabel("Has olvidado tu contrasena?");
		lblRecordarcontra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRecordarcontra.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecordarcontra.setForeground(new Color(0, 0, 139));
		lblRecordarcontra.addMouseListener(mouse);
		lblRecordarcontra.setFont(new Font("Eras Medium ITC", Font.BOLD, 17));
		GridBagConstraints gbc_lblRecordarcontra = new GridBagConstraints();
		gbc_lblRecordarcontra.anchor = GridBagConstraints.SOUTH;
		gbc_lblRecordarcontra.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblRecordarcontra.gridwidth = 4;
		gbc_lblRecordarcontra.gridx = 0;
		gbc_lblRecordarcontra.gridy = 4;
		PIniciarSesion.add(lblRecordarcontra, gbc_lblRecordarcontra);
		
//---------------------------PANEL REGISTRATE-----------------------------------------------------------------
		
		PRegistrate = new JPanel();
		PRegistrate.setBackground(Color.WHITE);
		frame.getContentPane().add(PRegistrate, "name_2946035646365364");

		imagen = new ImageIcon(path + "Registrate_11.png");
		icono = new ImageIcon(imagen.getImage().getScaledInstance(250,100, Image.SCALE_DEFAULT));
		GridBagConstraints gbc_PTitulo_1 = new GridBagConstraints();
		gbc_PTitulo_1.insets = new Insets(0, 0, 5, 0);
		gbc_PTitulo_1.fill = GridBagConstraints.BOTH;
		gbc_PTitulo_1.gridx = 0;
		gbc_PTitulo_1.gridy = 0;
		GridBagLayout gbl_PRegistrate = new GridBagLayout();
		gbl_PRegistrate.columnWidths = new int[]{713, 0};
		gbl_PRegistrate.rowHeights = new int[]{121, 218, 105, 75, 0};
		gbl_PRegistrate.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_PRegistrate.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		PRegistrate.setLayout(gbl_PRegistrate);
		GridBagConstraints gbc_PDatosPersonales_1 = new GridBagConstraints();
		gbc_PDatosPersonales_1.insets = new Insets(0, 0, 5, 0);
		gbc_PDatosPersonales_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_PDatosPersonales_1.gridx = 0;
		gbc_PDatosPersonales_1.gridy = 1;
		
		JPanel PTitulo = new JPanel();
		PTitulo.setBackground(Color.WHITE);
		PRegistrate.add(PTitulo, gbc_PTitulo_1);
		GridBagLayout gbl_PTitulo = new GridBagLayout();
		gbl_PTitulo.columnWidths = new int[]{536, 0};
		gbl_PTitulo.rowHeights = new int[]{25, 11, 0};
		gbl_PTitulo.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_PTitulo.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		PTitulo.setLayout(gbl_PTitulo);
		
		JLabel lblFormaParteDe = new JLabel("Forma Parte de los Ciudadanos Globales");
		lblFormaParteDe.setForeground(new Color(0, 0, 139));
		lblFormaParteDe.setFont(new Font("Eras Medium ITC", Font.BOLD, 28));
		GridBagConstraints gbc_lblFormaParteDe = new GridBagConstraints();
		gbc_lblFormaParteDe.insets = new Insets(0, 0, 5, 0);
		gbc_lblFormaParteDe.gridx = 0;
		gbc_lblFormaParteDe.gridy = 0;
		PTitulo.add(lblFormaParteDe, gbc_lblFormaParteDe);
		
		JLabel lblImagen = new JLabel("");
		GridBagConstraints gbc_lblImagen = new GridBagConstraints();
		gbc_lblImagen.fill = GridBagConstraints.VERTICAL;
		gbc_lblImagen.gridx = 0;
		gbc_lblImagen.gridy = 1;
		PTitulo.add(lblImagen, gbc_lblImagen);
		lblImagen.setIcon(icono);
		
		JPanel PDatosPersonales = new JPanel();
		PDatosPersonales.setBackground(Color.WHITE);
		PDatosPersonales.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		PRegistrate.add(PDatosPersonales, gbc_PDatosPersonales_1);
		GridBagLayout gbl_PDatosPersonales = new GridBagLayout();
		gbl_PDatosPersonales.columnWidths = new int[]{246, 453, 0};
		gbl_PDatosPersonales.rowHeights = new int[]{16, 16, 16, 16, 21, 16, 0, 16, 0};
		gbl_PDatosPersonales.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_PDatosPersonales.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		PDatosPersonales.setLayout(gbl_PDatosPersonales);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.BOTH;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		PDatosPersonales.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBackground(new Color(173, 216, 230));
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.BOTH;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 0;
		PDatosPersonales.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.fill = GridBagConstraints.BOTH;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 0;
		gbc_lblTelefono.gridy = 1;
		PDatosPersonales.add(lblTelefono, gbc_lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBackground(new Color(173, 216, 230));
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.fill = GridBagConstraints.BOTH;
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_txtTelefono.gridx = 1;
		gbc_txtTelefono.gridy = 1;
		PDatosPersonales.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion: ");
		lblDireccion.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.fill = GridBagConstraints.BOTH;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 0;
		gbc_lblDireccion.gridy = 2;
		PDatosPersonales.add(lblDireccion, gbc_lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBackground(new Color(173, 216, 230));
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.fill = GridBagConstraints.BOTH;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_txtDireccion.gridx = 1;
		gbc_txtDireccion.gridy = 2;
		PDatosPersonales.add(txtDireccion, gbc_txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electronico:");
		lblCorreoElectronico.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCorreoElectronico = new GridBagConstraints();
		gbc_lblCorreoElectronico.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCorreoElectronico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectronico.gridx = 0;
		gbc_lblCorreoElectronico.gridy = 3;
		PDatosPersonales.add(lblCorreoElectronico, gbc_lblCorreoElectronico);
		
		txtCorreo = new JTextField();
		txtCorreo.setBackground(new Color(173, 216, 230));
		GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
		gbc_txtCorreo.fill = GridBagConstraints.BOTH;
		gbc_txtCorreo.insets = new Insets(0, 0, 5, 0);
		gbc_txtCorreo.gridx = 1;
		gbc_txtCorreo.gridy = 3;
		PDatosPersonales.add(txtCorreo, gbc_txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrasena");
		lblContrasea.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.WEST;
		gbc_lblContrasea.fill = GridBagConstraints.VERTICAL;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 0;
		gbc_lblContrasea.gridy = 4;
		PDatosPersonales.add(lblContrasea, gbc_lblContrasea);
		
		pwfContrasena_1 = new JPasswordField();
		pwfContrasena_1.addKeyListener(tecla);
		pwfContrasena_1.setEchoChar('*');
		GridBagConstraints gbc_pwfContrasena_1 = new GridBagConstraints();
		gbc_pwfContrasena_1.insets = new Insets(0, 0, 5, 0);
		gbc_pwfContrasena_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwfContrasena_1.gridx = 1;
		gbc_pwfContrasena_1.gridy = 4;
		PDatosPersonales.add(pwfContrasena_1, gbc_pwfContrasena_1);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar Contrasena:");
		lblConfirmarContrasea.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		GridBagConstraints gbc_lblConfirmarContrasea = new GridBagConstraints();
		gbc_lblConfirmarContrasea.anchor = GridBagConstraints.WEST;
		gbc_lblConfirmarContrasea.fill = GridBagConstraints.VERTICAL;
		gbc_lblConfirmarContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarContrasea.gridx = 0;
		gbc_lblConfirmarContrasea.gridy = 5;
		PDatosPersonales.add(lblConfirmarContrasea, gbc_lblConfirmarContrasea);
		
		pwfConfirmarContrasena = new JPasswordField();
		pwfConfirmarContrasena.setEnabled(false);
		pwfConfirmarContrasena.setEchoChar('*');
		GridBagConstraints gbc_pwfConfirmarContrasena = new GridBagConstraints();
		gbc_pwfConfirmarContrasena.insets = new Insets(0, 0, 5, 0);
		gbc_pwfConfirmarContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwfConfirmarContrasena.gridx = 1;
		gbc_pwfConfirmarContrasena.gridy = 5;
		PDatosPersonales.add(pwfConfirmarContrasena, gbc_pwfConfirmarContrasena);
		
		JLabel lblEdad = new JLabel("Edad");
		GridBagConstraints gbc_lblEdad = new GridBagConstraints();
		gbc_lblEdad.anchor = GridBagConstraints.WEST;
		gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdad.gridx = 0;
		gbc_lblEdad.gridy = 6;
		PDatosPersonales.add(lblEdad, gbc_lblEdad);
		lblEdad.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		
		txtEdad = new JTextField();
		GridBagConstraints gbc_txtEdad = new GridBagConstraints();
		gbc_txtEdad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEdad.insets = new Insets(0, 0, 5, 0);
		gbc_txtEdad.gridx = 1;
		gbc_txtEdad.gridy = 6;
		PDatosPersonales.add(txtEdad, gbc_txtEdad);
		txtEdad.setBackground(new Color(173, 216, 230));
		
		JLabel lblNewLabel = new JLabel("Genero:");
		lblNewLabel.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 7;
		PDatosPersonales.add(lblNewLabel, gbc_lblNewLabel);
		
		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		txtGenero.setBackground(new Color(173, 216, 230));
		GridBagConstraints gbc_txtGenero = new GridBagConstraints();
		gbc_txtGenero.fill = GridBagConstraints.BOTH;
		gbc_txtGenero.gridx = 1;
		gbc_txtGenero.gridy = 7;
		PDatosPersonales.add(txtGenero, gbc_txtGenero);
		
		JPanel PDatosProfesionales = new JPanel();
		PDatosProfesionales.setBackground(Color.WHITE);
		PDatosProfesionales.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Datos Profesionales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		GridBagConstraints gbc_PDatosProfesionales_1 = new GridBagConstraints();
		gbc_PDatosProfesionales_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_PDatosProfesionales_1.insets = new Insets(0, 0, 5, 0);
		gbc_PDatosProfesionales_1.gridx = 0;
		gbc_PDatosProfesionales_1.gridy = 2;
		PRegistrate.add(PDatosProfesionales, gbc_PDatosProfesionales_1);
		
		ChBTrabaja = new JCheckBox("Trabaja");
		ChBTrabaja.setForeground(new Color(0, 0, 0));
		ChBTrabaja.setBackground(new Color(255, 255, 255));
		ChBTrabaja.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		ChBTrabaja.addActionListener(listener);
		PDatosProfesionales.setLayout(new GridLayout(0, 2, 0, 0));
		PDatosProfesionales.add(ChBTrabaja);
		
		ChBEstudia = new JCheckBox("Estudia");
		ChBEstudia.setForeground(new Color(0, 0, 0));
		ChBEstudia.setBackground(new Color(255, 255, 255));
		ChBEstudia.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		ChBEstudia.addActionListener(listener);
		PDatosProfesionales.add(ChBEstudia);
		
		JLabel lblPofesion = new JLabel("Profesion o carrera que estudia: ");
		lblPofesion.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		PDatosProfesionales.add(lblPofesion);
		
		txtProfesion = new JTextField();
		txtProfesion.setBackground(new Color(173, 216, 230));
		PDatosProfesionales.add(txtProfesion);
		txtProfesion.setColumns(10);
		
		JLabel lblTrabajo = new JLabel("Lugar donde labora o estudia: ");
		lblTrabajo.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		PDatosProfesionales.add(lblTrabajo);
		
		txtLugar = new JTextField();
		txtLugar.addKeyListener(tecla);
		txtLugar.setBackground(new Color(173, 216, 230));
		PDatosProfesionales.add(txtLugar);
		txtLugar.setColumns(10);
		
		JPanel PCreacion = new JPanel();
		PCreacion.setBackground(Color.WHITE);
		GridBagConstraints gbc_PCreacion_1 = new GridBagConstraints();
		gbc_PCreacion_1.fill = GridBagConstraints.BOTH;
		gbc_PCreacion_1.gridx = 0;
		gbc_PCreacion_1.gridy = 3;
		PRegistrate.add(PCreacion, gbc_PCreacion_1);
		GridBagLayout gbl_PCreacion = new GridBagLayout();
		gbl_PCreacion.columnWidths = new int[]{0, 230, 65, 0, 0, 294, 0};
		gbl_PCreacion.rowHeights = new int[]{0, 43, 0};
		gbl_PCreacion.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_PCreacion.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		PCreacion.setLayout(gbl_PCreacion);
		
		JLabel lblyaEresUn = new JLabel("\u00BFYa eres un ciudadano global?");
		lblyaEresUn.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		GridBagConstraints gbc_lblyaEresUn = new GridBagConstraints();
		gbc_lblyaEresUn.anchor = GridBagConstraints.EAST;
		gbc_lblyaEresUn.insets = new Insets(0, 0, 5, 5);
		gbc_lblyaEresUn.gridx = 1;
		gbc_lblyaEresUn.gridy = 0;
		PCreacion.add(lblyaEresUn, gbc_lblyaEresUn);
		
		btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(new Color(0, 0, 128));
		btnIniciarSesion.addActionListener(listener);
		btnIniciarSesion.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		GridBagConstraints gbc_btnIniciarSesion = new GridBagConstraints();
		gbc_btnIniciarSesion.gridwidth = 2;
		gbc_btnIniciarSesion.insets = new Insets(0, 0, 0, 5);
		gbc_btnIniciarSesion.gridx = 1;
		gbc_btnIniciarSesion.gridy = 1;
		PCreacion.add(btnIniciarSesion, gbc_btnIniciarSesion);
		
		btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.setForeground(new Color(255, 255, 255));
		btnCrearCuenta.setBackground(new Color(0, 0, 128));
		btnCrearCuenta.setFont(new Font("Showcard Gothic", Font.PLAIN, 17));
		btnCrearCuenta.addActionListener(listener);
		GridBagConstraints gbc_btnCrearCuenta = new GridBagConstraints();
		gbc_btnCrearCuenta.gridx = 5;
		gbc_btnCrearCuenta.gridy = 1;
		PCreacion.add(btnCrearCuenta, gbc_btnCrearCuenta);
		
			
//----------------------------Panel Usuarios----------------------------------------------------
		PUsuario = new JPanel();
		PUsuario.setForeground(Color.WHITE);
		frame.getContentPane().add(PUsuario, "name_2946080524338749");
		PUsuario.setLayout(new CardLayout(0, 0));
		
		PInicio = new JPanel();
		PInicio.setBackground(new Color(224, 255, 255));
		PUsuario.add(PInicio, "name_2946630871796498");
		
		perfil = new ImageIcon(getClass().getResource("Usuario.png"));
		Iperfil = new ImageIcon(perfil.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

		od1 = new ImageIcon(getClass().getResource("Ods_1.png"));
		ods1 = new ImageIcon(od1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		
		od2 = new ImageIcon(getClass().getResource("Ods_2.png"));
		ods2 = new ImageIcon(od2.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		
		od3 = new ImageIcon(getClass().getResource("Ods_11.png"));
		ods3 = new ImageIcon(od3.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		
		od4 = new ImageIcon(getClass().getResource("Ods_14.png"));
		ods4 = new ImageIcon(od4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		
		od5 = new ImageIcon(getClass().getResource("Ods_15.png"));
		ods5 = new ImageIcon(od5.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		
		don = new ImageIcon(getClass().getResource("Donacion_1.png"));
		dona = new ImageIcon(don.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		
		don1 = new ImageIcon(getClass().getResource("Donacion_2.png"));
		dona1 = new ImageIcon(don1.getImage().getScaledInstance(250, 125, Image.SCALE_DEFAULT));
		
		his = new ImageIcon(getClass().getResource("Logo.png"));
		histo = new ImageIcon(his.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		
		
		
		
		GridBagLayout gbl_PInicio = new GridBagLayout();
		gbl_PInicio.columnWidths = new int[]{77, 0, 91, 527};
		gbl_PInicio.rowHeights = new int[]{80, 33, 0, 0, 0, 0, 276, 67, 0};
		gbl_PInicio.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gbl_PInicio.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		PInicio.setLayout(gbl_PInicio);
		
		lblNombre_1 = new JLabel("JUNITO PEREZ");
		lblNombre_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 14));
		GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
		gbc_lblNombre_1.gridwidth = 2;
		gbc_lblNombre_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre_1.gridx = 0;
		gbc_lblNombre_1.gridy = 0;
		PInicio.add(lblNombre_1, gbc_lblNombre_1);
		
		lblPerfil = new JLabel("");
		lblPerfil.setIcon(Iperfil);
		GridBagConstraints gbc_lblPerfil = new GridBagConstraints();
		gbc_lblPerfil.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerfil.gridx = 2;
		gbc_lblPerfil.gridy = 0;
		PInicio.add(lblPerfil, gbc_lblPerfil);
		
		JPanel MP = new JPanel();
		GridBagConstraints gbc_MP = new GridBagConstraints();
		gbc_MP.gridheight = 8;
		gbc_MP.fill = GridBagConstraints.VERTICAL;
		gbc_MP.gridx = 3;
		gbc_MP.gridy = 0;
		PInicio.add(MP, gbc_MP);
		MP.setLayout(new CardLayout(0, 0));
		
		PHistorial = new JPanel();
		PHistorial.setBackground(new Color(255, 255, 255));
		MP.add(PHistorial, "name_743697276005500");
		GridBagLayout gbl_PHistorial = new GridBagLayout();
		gbl_PHistorial.columnWidths = new int[]{265, 193, 0};
		gbl_PHistorial.rowHeights = new int[]{0, 17, 0, 0, 120, 0};
		gbl_PHistorial.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_PHistorial.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		PHistorial.setLayout(gbl_PHistorial);
		
		JLabel lblHistorial_1 = new JLabel("Historial");
		lblHistorial_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 22));
		GridBagConstraints gbc_lblHistorial_1 = new GridBagConstraints();
		gbc_lblHistorial_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblHistorial_1.gridx = 0;
		gbc_lblHistorial_1.gridy = 0;
		PHistorial.add(lblHistorial_1, gbc_lblHistorial_1);
		
		JLabel lblNewLabel_3 = new JLabel("<html>\"El cambio no vendr\u00E1 si esperamos a otra persona o en otro momento. Somos los que hemos estado esperando. Somos el cambio que buscamos\"-Barack Obama<html>");
		lblNewLabel_3.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 1;
		PHistorial.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		ImHistorial = new JLabel("");
		ImHistorial.setIcon(histo);
		ImHistorial.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_ImHistorial = new GridBagConstraints();
		gbc_ImHistorial.gridheight = 2;
		gbc_ImHistorial.insets = new Insets(0, 0, 5, 0);
		gbc_ImHistorial.gridx = 1;
		gbc_ImHistorial.gridy = 0;
		PHistorial.add(ImHistorial, gbc_ImHistorial);
		
		JCalendar calendar = new JCalendar();
		GridBagConstraints gbc_calendar = new GridBagConstraints();
		gbc_calendar.gridwidth = 2;
		gbc_calendar.fill = GridBagConstraints.HORIZONTAL;
		gbc_calendar.insets = new Insets(0, 0, 5, 0);
		gbc_calendar.anchor = GridBagConstraints.NORTH;
		gbc_calendar.gridx = 0;
		gbc_calendar.gridy = 2;
		PHistorial.add(calendar, gbc_calendar);
		
		JLabel lblEventosAsistidos = new JLabel("Eventos Asistidos");
		lblEventosAsistidos.setFont(new Font("Eras Medium ITC", Font.BOLD, 16));
		GridBagConstraints gbc_lblEventosAsistidos = new GridBagConstraints();
		gbc_lblEventosAsistidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEventosAsistidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventosAsistidos.gridx = 0;
		gbc_lblEventosAsistidos.gridy = 3;
		PHistorial.add(lblEventosAsistidos, gbc_lblEventosAsistidos);
		
		EventosHistorial = new JLabel("");
		EventosHistorial.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GridBagConstraints gbc_EventosHistorial = new GridBagConstraints();
		gbc_EventosHistorial.gridwidth = 2;
		gbc_EventosHistorial.insets = new Insets(0, 0, 0, 5);
		gbc_EventosHistorial.gridx = 0;
		gbc_EventosHistorial.gridy = 4;
		PHistorial.add(EventosHistorial, gbc_EventosHistorial);
		
		PODS = new JPanel();
		PODS.setBorder(null);
		PODS.setBackground(new Color(255, 255, 255));
		MP.add(PODS, "name_743841580391900");
		GridBagLayout gbl_PODS = new GridBagLayout();
		gbl_PODS.columnWidths = new int[]{177, 168, 171, 0};
		gbl_PODS.rowHeights = new int[]{42, 0, 0, 0, 0, 0, 0};
		gbl_PODS.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_PODS.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		PODS.setLayout(gbl_PODS);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccione un ODS");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel_2.gridwidth = 2;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		PODS.add(lblNewLabel_2, gbc_lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Eras Medium ITC", Font.BOLD, 23));
		
		lblOds_1 = new JLabel("");
		lblOds_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_lblOds_1 = new GridBagConstraints();
		gbc_lblOds_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblOds_1.gridx = 0;
		gbc_lblOds_1.gridy = 2;
		PODS.add(lblOds_1, gbc_lblOds_1);
		lblOds_1.addMouseListener(mouse);
		lblOds_1.setIcon(ods1);
		
		lblOds_2 = new JLabel("");
		lblOds_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_lblOds_2 = new GridBagConstraints();
		gbc_lblOds_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblOds_2.gridx = 1;
		gbc_lblOds_2.gridy = 2;
		PODS.add(lblOds_2, gbc_lblOds_2);
		lblOds_2.addMouseListener(mouse);
		lblOds_2.setIcon(ods2);
		
		lblOds_11 = new JLabel("");
		lblOds_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_lblOds_11 = new GridBagConstraints();
		gbc_lblOds_11.insets = new Insets(0, 0, 5, 0);
		gbc_lblOds_11.gridx = 2;
		gbc_lblOds_11.gridy = 2;
		PODS.add(lblOds_11, gbc_lblOds_11);
		lblOds_11.addMouseListener(mouse);
		lblOds_11.setIcon(ods3);
		
		lblOds_14 = new JLabel("");
		lblOds_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_lblOds_14 = new GridBagConstraints();
		gbc_lblOds_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblOds_14.gridx = 0;
		gbc_lblOds_14.gridy = 3;
		PODS.add(lblOds_14, gbc_lblOds_14);
		lblOds_14.addMouseListener(mouse);
		lblOds_14.setIcon(ods4);
		
		lblOds_15 = new JLabel("");
		lblOds_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GridBagConstraints gbc_lblOds_15 = new GridBagConstraints();
		gbc_lblOds_15.insets = new Insets(0, 0, 5, 0);
		gbc_lblOds_15.gridx = 2;
		gbc_lblOds_15.gridy = 3;
		PODS.add(lblOds_15, gbc_lblOds_15);
		lblOds_15.addMouseListener(mouse);
		lblOds_15.setIcon(ods5);
		
		PDonaciones = new JPanel();
		MP.add(PDonaciones, "name_829115022567100");
		PDonaciones.setBackground(new Color(255, 255, 255));
		GridBagLayout gbl_PDonaciones = new GridBagLayout();
		gbl_PDonaciones.columnWidths = new int[]{220, 144, 139, 0};
		gbl_PDonaciones.rowHeights = new int[]{33, 20, 0, 30, 29, 43, 23, 30, 44, 0, 0};
		gbl_PDonaciones.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_PDonaciones.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		PDonaciones.setLayout(gbl_PDonaciones);
		
		JLabel lblDonaciones_1 = new JLabel("Donaciones");
		lblDonaciones_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 26));
		GridBagConstraints gbc_lblDonaciones_1 = new GridBagConstraints();
		gbc_lblDonaciones_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDonaciones_1.gridx = 0;
		gbc_lblDonaciones_1.gridy = 0;
		PDonaciones.add(lblDonaciones_1, gbc_lblDonaciones_1);
		//Nada
		JLabel lblsoloCuandoSe = new JLabel("<html>\"Solo cuando se haya talado el ultimo arbol, envenenado el ultimo rio, pescado el ultimo pez, solo entonces descubrira el hombre, que el dinero NO es comestible\" (Antigua profecia de los indios Cree de Canada)<html>");
		lblsoloCuandoSe.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_lblsoloCuandoSe = new GridBagConstraints();
		gbc_lblsoloCuandoSe.insets = new Insets(0, 0, 5, 0);
		gbc_lblsoloCuandoSe.fill = GridBagConstraints.BOTH;
		gbc_lblsoloCuandoSe.gridwidth = 3;
		gbc_lblsoloCuandoSe.gridx = 0;
		gbc_lblsoloCuandoSe.gridy = 1;
		PDonaciones.add(lblsoloCuandoSe, gbc_lblsoloCuandoSe);
		
		JLabel lblTarjeta = new JLabel("Tarjera de credito: ");
		lblTarjeta.setFont(new Font("Eras Medium ITC", Font.BOLD, 16));
		GridBagConstraints gbc_lblTarjeta = new GridBagConstraints();
		gbc_lblTarjeta.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTarjeta.insets = new Insets(0, 0, 5, 5);
		gbc_lblTarjeta.gridx = 0;
		gbc_lblTarjeta.gridy = 3;
		PDonaciones.add(lblTarjeta, gbc_lblTarjeta);
		
		txtCreditCard = new JTextField();
		txtCreditCard.setFont(new Font("Eras Medium ITC", Font.BOLD, 16));
		GridBagConstraints gbc_txtCreditCard = new GridBagConstraints();
		gbc_txtCreditCard.fill = GridBagConstraints.BOTH;
		gbc_txtCreditCard.insets = new Insets(0, 0, 5, 5);
		gbc_txtCreditCard.gridx = 1;
		gbc_txtCreditCard.gridy = 3;
		PDonaciones.add(txtCreditCard, gbc_txtCreditCard);
		txtCreditCard.setColumns(10);
		
		ImDonacion = new JLabel("");
		ImDonacion.setIcon(dona);
		ImDonacion.setFont(new Font("Eras Medium ITC", Font.BOLD, 16));
		GridBagConstraints gbc_ImDonacion = new GridBagConstraints();
		gbc_ImDonacion.gridheight = 2;
		gbc_ImDonacion.insets = new Insets(0, 0, 5, 0);
		gbc_ImDonacion.gridx = 2;
		gbc_ImDonacion.gridy = 3;
		PDonaciones.add(ImDonacion, gbc_ImDonacion);
		
		JLabel lblCantidadDeDolar = new JLabel("Cantidad a  Donar");
		lblCantidadDeDolar.setFont(new Font("Eras Medium ITC", Font.BOLD, 16));
		GridBagConstraints gbc_lblCantidadDeDolar = new GridBagConstraints();
		gbc_lblCantidadDeDolar.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCantidadDeDolar.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidadDeDolar.gridx = 0;
		gbc_lblCantidadDeDolar.gridy = 4;
		PDonaciones.add(lblCantidadDeDolar, gbc_lblCantidadDeDolar);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 16));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
		PDonaciones.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		btnIngTarjeta = new JButton("DONAR");
		btnIngTarjeta.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnIngTarjeta.addActionListener(listener);
		GridBagConstraints gbc_btnIngTarjeta = new GridBagConstraints();
		gbc_btnIngTarjeta.fill = GridBagConstraints.VERTICAL;
		gbc_btnIngTarjeta.insets = new Insets(0, 0, 5, 0);
		gbc_btnIngTarjeta.gridx = 2;
		gbc_btnIngTarjeta.gridy = 5;
		PDonaciones.add(btnIngTarjeta, gbc_btnIngTarjeta);
		
		
		
		Im1Donacion = new JLabel("");
		Im1Donacion.setIcon(dona1);
		Im1Donacion.setFont(new Font("Eras Medium ITC", Font.BOLD, 16));
		GridBagConstraints gbc_Im1Donacion = new GridBagConstraints();
		gbc_Im1Donacion.gridheight = 4;
		gbc_Im1Donacion.gridwidth = 3;
		gbc_Im1Donacion.insets = new Insets(0, 0, 0, 5);
		gbc_Im1Donacion.gridx = 0;
		gbc_Im1Donacion.gridy = 6;
		PDonaciones.add(Im1Donacion, gbc_Im1Donacion);
		
		PConfiguracion = new JPanel();
		MP.add(PConfiguracion, "name_88588367616600");
		PConfiguracion.setBackground(new Color(255, 255, 255));
		GridBagLayout gbl_PConfiguracion = new GridBagLayout();
		gbl_PConfiguracion.columnWidths = new int[]{1, 0, 0, 0, 0, 207, 0};
		gbl_PConfiguracion.rowHeights = new int[]{1, 45, 41, 41, 48, 38, 44, 43, 45, 42, 0, 0, 0, 56, 0};
		gbl_PConfiguracion.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_PConfiguracion.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		PConfiguracion.setLayout(gbl_PConfiguracion);
		
		JLabel ImConfiguracion_1 = new JLabel("");
		GridBagConstraints gbc_ImConfiguracion_1 = new GridBagConstraints();
		gbc_ImConfiguracion_1.insets = new Insets(0, 0, 5, 5);
		gbc_ImConfiguracion_1.gridx = 0;
		gbc_ImConfiguracion_1.gridy = 0;
		PConfiguracion.add(ImConfiguracion_1, gbc_ImConfiguracion_1);
		
		JLabel lblInformacionDeUsuario = new JLabel("Informacion de Usuario");
		lblInformacionDeUsuario.setForeground(new Color(0, 0, 128));
		lblInformacionDeUsuario.setFont(new Font("Eras Medium ITC", Font.BOLD, 24));
		GridBagConstraints gbc_lblInformacionDeUsuario = new GridBagConstraints();
		gbc_lblInformacionDeUsuario.gridwidth = 5;
		gbc_lblInformacionDeUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_lblInformacionDeUsuario.gridx = 1;
		gbc_lblInformacionDeUsuario.gridy = 1;
		PConfiguracion.add(lblInformacionDeUsuario, gbc_lblInformacionDeUsuario);
		
		JLabel lblNombre_2 = new JLabel("Nombre");
		lblNombre_2.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblNombre_2 = new GridBagConstraints();
		gbc_lblNombre_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombre_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre_2.gridx = 2;
		gbc_lblNombre_2.gridy = 2;
		PConfiguracion.add(lblNombre_2, gbc_lblNombre_2);
		
		txtPNombre = new JTextField();
		txtPNombre.setBackground(new Color(255, 255, 255));
		txtPNombre.setEditable(false);
		GridBagConstraints gbc_txtPNombre = new GridBagConstraints();
		gbc_txtPNombre.gridwidth = 3;
		gbc_txtPNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtPNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPNombre.gridx = 3;
		gbc_txtPNombre.gridy = 2;
		PConfiguracion.add(txtPNombre, gbc_txtPNombre);
		txtPNombre.setColumns(10);
		
		JLabel lblDireccion_1 = new JLabel("Direccion");
		lblDireccion_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblDireccion_1 = new GridBagConstraints();
		gbc_lblDireccion_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDireccion_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion_1.gridx = 2;
		gbc_lblDireccion_1.gridy = 3;
		PConfiguracion.add(lblDireccion_1, gbc_lblDireccion_1);
		
		txtPDireccion = new JTextField();
		txtPDireccion.setBackground(new Color(255, 255, 255));
		txtPDireccion.setEditable(false);
		GridBagConstraints gbc_txtPDireccion = new GridBagConstraints();
		gbc_txtPDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPDireccion.gridwidth = 3;
		gbc_txtPDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_txtPDireccion.gridx = 3;
		gbc_txtPDireccion.gridy = 3;
		PConfiguracion.add(txtPDireccion, gbc_txtPDireccion);
		txtPDireccion.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Correo Electronico");
		lblNewLabel_5.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 4;
		PConfiguracion.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		txtPCorreo = new JTextField();
		txtPCorreo.setBackground(new Color(255, 255, 255));
		txtPCorreo.setEditable(false);
		GridBagConstraints gbc_txtPCorreo = new GridBagConstraints();
		gbc_txtPCorreo.gridwidth = 3;
		gbc_txtPCorreo.insets = new Insets(0, 0, 5, 0);
		gbc_txtPCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPCorreo.gridx = 3;
		gbc_txtPCorreo.gridy = 4;
		PConfiguracion.add(txtPCorreo, gbc_txtPCorreo);
		txtPCorreo.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo");
		lblNewLabel_6.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 5;
		PConfiguracion.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		txtPSexo = new JTextField();
		txtPSexo.setBackground(new Color(255, 255, 255));
		txtPSexo.setEditable(false);
		GridBagConstraints gbc_txtPSexo = new GridBagConstraints();
		gbc_txtPSexo.gridwidth = 3;
		gbc_txtPSexo.insets = new Insets(0, 0, 5, 0);
		gbc_txtPSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPSexo.gridx = 3;
		gbc_txtPSexo.gridy = 5;
		PConfiguracion.add(txtPSexo, gbc_txtPSexo);
		txtPSexo.setColumns(10);
		
		JLabel lblEdad_1 = new JLabel("Edad");
		lblEdad_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblEdad_1 = new GridBagConstraints();
		gbc_lblEdad_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEdad_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdad_1.gridx = 2;
		gbc_lblEdad_1.gridy = 6;
		PConfiguracion.add(lblEdad_1, gbc_lblEdad_1);
		
		txtPEdad = new JTextField();
		txtPEdad.setBackground(new Color(255, 255, 255));
		txtPEdad.setEditable(false);
		GridBagConstraints gbc_txtPEdad = new GridBagConstraints();
		gbc_txtPEdad.gridwidth = 3;
		gbc_txtPEdad.insets = new Insets(0, 0, 5, 0);
		gbc_txtPEdad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPEdad.gridx = 3;
		gbc_txtPEdad.gridy = 6;
		PConfiguracion.add(txtPEdad, gbc_txtPEdad);
		txtPEdad.setColumns(10);
		
		JLabel lblTelefono_1 = new JLabel("Telefono");
		lblTelefono_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblTelefono_1 = new GridBagConstraints();
		gbc_lblTelefono_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTelefono_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono_1.gridx = 2;
		gbc_lblTelefono_1.gridy = 7;
		PConfiguracion.add(lblTelefono_1, gbc_lblTelefono_1);
		
		txtPTelefono = new JTextField();
		txtPTelefono.setBackground(new Color(255, 255, 255));
		txtPTelefono.setEditable(false);
		GridBagConstraints gbc_txtPTelefono = new GridBagConstraints();
		gbc_txtPTelefono.gridwidth = 3;
		gbc_txtPTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_txtPTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPTelefono.gridx = 3;
		gbc_txtPTelefono.gridy = 7;
		PConfiguracion.add(txtPTelefono, gbc_txtPTelefono);
		txtPTelefono.setColumns(10);
		
		JLabel lblProfesion = new JLabel("Profesion");
		lblProfesion.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblProfesion = new GridBagConstraints();
		gbc_lblProfesion.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblProfesion.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfesion.gridx = 2;
		gbc_lblProfesion.gridy = 8;
		PConfiguracion.add(lblProfesion, gbc_lblProfesion);
		
		txtPProfesion = new JTextField();
		txtPProfesion.setBackground(new Color(255, 255, 255));
		txtPProfesion.setEditable(false);
		GridBagConstraints gbc_txtPProfesion = new GridBagConstraints();
		gbc_txtPProfesion.gridwidth = 3;
		gbc_txtPProfesion.insets = new Insets(0, 0, 5, 0);
		gbc_txtPProfesion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPProfesion.gridx = 3;
		gbc_txtPProfesion.gridy = 8;
		PConfiguracion.add(txtPProfesion, gbc_txtPProfesion);
		txtPProfesion.setColumns(10);
		
		JLabel lblLugarDeTrabajoestudio = new JLabel("Lugar de Trabajo/Estudio");
		lblLugarDeTrabajoestudio.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblLugarDeTrabajoestudio = new GridBagConstraints();
		gbc_lblLugarDeTrabajoestudio.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLugarDeTrabajoestudio.insets = new Insets(0, 0, 5, 5);
		gbc_lblLugarDeTrabajoestudio.gridx = 2;
		gbc_lblLugarDeTrabajoestudio.gridy = 9;
		PConfiguracion.add(lblLugarDeTrabajoestudio, gbc_lblLugarDeTrabajoestudio);
		
		txtPLugar = new JTextField();
		txtPLugar.setBackground(new Color(255, 255, 255));
		txtPLugar.setEditable(false);
		GridBagConstraints gbc_txtPLugar = new GridBagConstraints();
		gbc_txtPLugar.gridwidth = 3;
		gbc_txtPLugar.insets = new Insets(0, 0, 5, 0);
		gbc_txtPLugar.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPLugar.gridx = 3;
		gbc_txtPLugar.gridy = 9;
		PConfiguracion.add(txtPLugar, gbc_txtPLugar);
		txtPLugar.setColumns(10);
		
		pconfi = new ImageIcon(getClass().getResource("Perfil.png"));
		Iconfi = new ImageIcon(pconfi.getImage().getScaledInstance(400, 150, Image.SCALE_DEFAULT));
		
		lblPImagen = new JLabel("");
		lblPImagen.setIcon(Iconfi);
		GridBagConstraints gbc_lblPImagen = new GridBagConstraints();
		gbc_lblPImagen.gridwidth = 5;
		gbc_lblPImagen.gridheight = 4;
		gbc_lblPImagen.insets = new Insets(0, 0, 5, 5);
		gbc_lblPImagen.gridx = 1;
		gbc_lblPImagen.gridy = 10;
		PConfiguracion.add(lblPImagen, gbc_lblPImagen);
		
		lblHistorial = new JLabel("Historial");
		lblHistorial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblHistorial.addMouseListener(mouse);
		lblHistorial.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblHistorial = new GridBagConstraints();
		gbc_lblHistorial.gridwidth = 3;
		gbc_lblHistorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblHistorial.gridx = 0;
		gbc_lblHistorial.gridy = 1;
		PInicio.add(lblHistorial, gbc_lblHistorial);
		
		lblOds = new JLabel("ODS");
		lblOds.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblOds.setToolTipText("Observar ODS´s");
		lblOds.addMouseListener(mouse);
		lblOds.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblOds = new GridBagConstraints();
		gbc_lblOds.gridwidth = 3;
		gbc_lblOds.insets = new Insets(0, 0, 5, 5);
		gbc_lblOds.gridx = 0;
		gbc_lblOds.gridy = 2;
		PInicio.add(lblOds, gbc_lblOds);
		
		lblDonaciones = new JLabel("Donaciones");
		lblDonaciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblDonaciones.setToolTipText("Realizar una donacion");
		lblDonaciones.addMouseListener(mouse);
		lblDonaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblDonaciones.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblDonaciones = new GridBagConstraints();
		gbc_lblDonaciones.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDonaciones.gridwidth = 3;
		gbc_lblDonaciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblDonaciones.gridx = 0;
		gbc_lblDonaciones.gridy = 3;
		PInicio.add(lblDonaciones, gbc_lblDonaciones);
		
		lblConfiguracion = new JLabel("Perfil");
		lblConfiguracion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblConfiguracion.setToolTipText("Cambiar datos de la cuenta");
		lblConfiguracion.addMouseListener(mouse);
		lblConfiguracion.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_lblConfiguracion = new GridBagConstraints();
		gbc_lblConfiguracion.gridwidth = 3;
		gbc_lblConfiguracion.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfiguracion.gridx = 0;
		gbc_lblConfiguracion.gridy = 4;
		PInicio.add(lblConfiguracion, gbc_lblConfiguracion);
		
		JLabel label_13 = new JLabel("");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 0;
		gbc_label_13.gridy = 6;
		PInicio.add(label_13, gbc_label_13);
		
		lblCerrarSesion = new JLabel("Cerrar Sesion");
		lblCerrarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCerrarSesion.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		lblCerrarSesion.addMouseListener(mouse);
		GridBagConstraints gbc_lblCerrarSesion = new GridBagConstraints();
		gbc_lblCerrarSesion.gridwidth = 3;
		gbc_lblCerrarSesion.insets = new Insets(0, 0, 0, 5);
		gbc_lblCerrarSesion.gridx = 0;
		gbc_lblCerrarSesion.gridy = 7;
		PInicio.add(lblCerrarSesion, gbc_lblCerrarSesion);
		
						
				POds_1 = new JPanel();
				PUsuario.add(POds_1, "name_92353838502500");
				POds_1.setBackground(new Color(255, 255, 255));
				GridBagLayout gbl_POds_1 = new GridBagLayout();
				gbl_POds_1.columnWidths = new int[]{0, 205, 245, 226, 0};
				gbl_POds_1.rowHeights = new int[]{23, 60, 0, 69, 31, 23, 14, 0, 0, 34, 35, 52, 31, 48, 0};
				gbl_POds_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_POds_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				POds_1.setLayout(gbl_POds_1);
				
				JLabel label_3 = new JLabel("ODS 1: Fin de la pobreza");
				label_3.setForeground(new Color(204, 0, 0));
				label_3.setFont(new Font("Eras Medium ITC", Font.BOLD, 26));
				label_3.setBackground(new Color(240, 240, 240));
				GridBagConstraints gbc_label_3 = new GridBagConstraints();
				gbc_label_3.fill = GridBagConstraints.VERTICAL;
				gbc_label_3.insets = new Insets(0, 0, 5, 0);
				gbc_label_3.gridwidth = 3;
				gbc_label_3.gridx = 1;
				gbc_label_3.gridy = 0;
				POds_1.add(label_3, gbc_label_3);
				
				JLabel lblNewLabel_1 = new JLabel("<html>\"Con hambre, cualquier taco callejero y desabrido te sabe a gloria...\"                                -FrasesTop<html>");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_1.setFont(new Font("Eras Medium ITC", Font.ITALIC, 17));
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
				gbc_lblNewLabel_1.gridwidth = 3;
				gbc_lblNewLabel_1.gridx = 1;
				gbc_lblNewLabel_1.gridy = 1;
				POds_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
				
				JLabel label_8 = new JLabel("Descripcion ");
				label_8.setForeground(new Color(0, 0, 128));
				label_8.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
				GridBagConstraints gbc_label_8 = new GridBagConstraints();
				gbc_label_8.anchor = GridBagConstraints.WEST;
				gbc_label_8.insets = new Insets(0, 0, 5, 5);
				gbc_label_8.gridx = 1;
				gbc_label_8.gridy = 2;
				POds_1.add(label_8, gbc_label_8);
				
				JLabel lblparaLograrEste = new JLabel("<html>Para lograr este Objetivo de acabar con la pobreza, el crecimiento econ\u00F3mico debe ser inclusivo, con el fin de crear empleos sostenibles y de promover la igualdad. Los sistemas de protecci\u00F3n social deben aplicarse para mitigar los riesgos de los pa\u00EDses propensos a sufrir desastres y brindar apoyo para enfrentarse a las dificultades econ\u00F3micas. <html>");
				lblparaLograrEste.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
				GridBagConstraints gbc_lblparaLograrEste = new GridBagConstraints();
				gbc_lblparaLograrEste.anchor = GridBagConstraints.SOUTH;
				gbc_lblparaLograrEste.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblparaLograrEste.insets = new Insets(0, 0, 5, 0);
				gbc_lblparaLograrEste.gridwidth = 3;
				gbc_lblparaLograrEste.gridx = 1;
				gbc_lblparaLograrEste.gridy = 3;
				POds_1.add(lblparaLograrEste, gbc_lblparaLograrEste);
				
				JLabel lblEventos = new JLabel("Eventos ");
				lblEventos.setForeground(new Color(0, 0, 128));
				lblEventos.setFont(new Font("Eras Medium ITC", Font.BOLD, 19));
				GridBagConstraints gbc_lblEventos = new GridBagConstraints();
				gbc_lblEventos.anchor = GridBagConstraints.EAST;
				gbc_lblEventos.fill = GridBagConstraints.VERTICAL;
				gbc_lblEventos.insets = new Insets(0, 0, 5, 5);
				gbc_lblEventos.gridx = 1;
				gbc_lblEventos.gridy = 5;
				POds_1.add(lblEventos, gbc_lblEventos);
				
				CBOds_1 = new JComboBox();
				CBOds_1.setToolTipText("");
				CBOds_1.setBackground(new Color(255, 204, 102));
				GridBagConstraints gbc_CBOds_1 = new GridBagConstraints();
				gbc_CBOds_1.insets = new Insets(0, 0, 5, 5);
				gbc_CBOds_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_CBOds_1.gridx = 2;
				gbc_CBOds_1.gridy = 5;
				POds_1.add(CBOds_1, gbc_CBOds_1);
				
				ods_1 = new ImageIcon(getClass().getResource("Iods_1.jpg"));
				Ods_1 = new ImageIcon(ods_1.getImage().getScaledInstance(190, 150, Image.SCALE_DEFAULT));
				
				ods_2 = new ImageIcon(getClass().getResource("Iods_2.jpg"));
				Ods_2 = new ImageIcon(ods_2.getImage().getScaledInstance(190, 150, Image.SCALE_DEFAULT));
				
				ods_11 = new ImageIcon(getClass().getResource("Iods_11.jpg"));
				Ods_11 = new ImageIcon(ods_11.getImage().getScaledInstance(190, 150, Image.SCALE_DEFAULT));
				
				ods_14 = new ImageIcon(getClass().getResource("Iods_14.jpg"));
				Ods_14 = new ImageIcon(ods_14.getImage().getScaledInstance(190, 150, Image.SCALE_DEFAULT));
				
				ods_15 = new ImageIcon(getClass().getResource("Iods_15.png"));
				Ods_15 = new ImageIcon(ods_15.getImage().getScaledInstance(190, 150, Image.SCALE_DEFAULT));
				
				lblOds_1Im = new JLabel("");
				lblOds_1Im.setIcon(Ods_1);
				GridBagConstraints gbc_lblOds_1Im = new GridBagConstraints();
				gbc_lblOds_1Im.gridheight = 6;
				gbc_lblOds_1Im.insets = new Insets(0, 0, 5, 0);
				gbc_lblOds_1Im.gridx = 3;
				gbc_lblOds_1Im.gridy = 5;
				POds_1.add(lblOds_1Im, gbc_lblOds_1Im);
				
				JLabel label_4 = new JLabel("Descripcion del Evento: ");
				label_4.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
				GridBagConstraints gbc_label_4 = new GridBagConstraints();
				gbc_label_4.anchor = GridBagConstraints.EAST;
				gbc_label_4.fill = GridBagConstraints.VERTICAL;
				gbc_label_4.insets = new Insets(0, 0, 5, 5);
				gbc_label_4.gridx = 1;
				gbc_label_4.gridy = 6;
				POds_1.add(label_4, gbc_label_4);
				
				txtDescripcion_1 = new JTextField();
				txtDescripcion_1.setBackground(new Color(255, 255, 255));
				txtDescripcion_1.setEditable(false);
				GridBagConstraints gbc_txtDescripcion_1 = new GridBagConstraints();
				gbc_txtDescripcion_1.gridheight = 3;
				gbc_txtDescripcion_1.anchor = GridBagConstraints.NORTH;
				gbc_txtDescripcion_1.insets = new Insets(0, 0, 5, 5);
				gbc_txtDescripcion_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtDescripcion_1.gridx = 2;
				gbc_txtDescripcion_1.gridy = 6;
				POds_1.add(txtDescripcion_1, gbc_txtDescripcion_1);
				txtDescripcion_1.setColumns(10);
				
				btnagregarEvento = new JButton("<html>Agregar Evento<html>");
				btnagregarEvento.addActionListener(listener);
				btnagregarEvento.setHorizontalAlignment(SwingConstants.RIGHT);
				btnagregarEvento.setVerticalAlignment(SwingConstants.TOP);
				btnagregarEvento.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
				btnagregarEvento.setForeground(new Color(0, 0, 0));
				btnagregarEvento.setBackground(new Color(204, 0, 0));
				GridBagConstraints gbc_btnagregarEvento = new GridBagConstraints();
				gbc_btnagregarEvento.fill = GridBagConstraints.BOTH;
				gbc_btnagregarEvento.insets = new Insets(0, 0, 5, 5);
				gbc_btnagregarEvento.gridx = 1;
				gbc_btnagregarEvento.gridy = 10;
				POds_1.add(btnagregarEvento, gbc_btnagregarEvento);
				
				btnDonacion1 = new JButton("Donacion");
				btnDonacion1.addActionListener(listener);
				btnDonacion1.setForeground(new Color(0, 0, 0));
				btnDonacion1.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
				btnDonacion1.setBackground(new Color(204, 0, 0));
				GridBagConstraints gbc_btnDonacion1 = new GridBagConstraints();
				gbc_btnDonacion1.insets = new Insets(0, 0, 5, 5);
				gbc_btnDonacion1.fill = GridBagConstraints.BOTH;
				gbc_btnDonacion1.gridx = 2;
				gbc_btnDonacion1.gridy = 10;
				POds_1.add(btnDonacion1, gbc_btnDonacion1);
				
				btnMasInfo = new JButton("<html>Mas informacion<html>");
				btnMasInfo.addActionListener(listener);
				btnMasInfo.setVerticalAlignment(SwingConstants.TOP);
				btnMasInfo.setForeground(Color.BLACK);
				btnMasInfo.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
				btnMasInfo.setBackground(new Color(204, 0, 0));
				GridBagConstraints gbc_btnMasInfo = new GridBagConstraints();
				gbc_btnMasInfo.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnMasInfo.insets = new Insets(0, 0, 5, 5);
				gbc_btnMasInfo.gridx = 1;
				gbc_btnMasInfo.gridy = 11;
				POds_1.add(btnMasInfo, gbc_btnMasInfo);
				
				btnEvento = new JButton("<html>Recomendar Evento<html>");
				btnEvento.setHorizontalAlignment(SwingConstants.LEADING);
				btnEvento.setForeground(new Color(0, 0, 0));
				btnEvento.setBackground(new Color(204, 0, 0));
				btnEvento.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
				GridBagConstraints gbc_btnEvento = new GridBagConstraints();
				gbc_btnEvento.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnEvento.insets = new Insets(0, 0, 5, 5);
				gbc_btnEvento.gridx = 2;
				gbc_btnEvento.gridy = 11;
				POds_1.add(btnEvento, gbc_btnEvento);
				
				btnRegresar_1 = new JButton("Regresar");
				btnRegresar_1.addActionListener(listener);
				btnRegresar_1.setForeground(Color.WHITE);
				btnRegresar_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
				btnRegresar_1.setBackground(new Color(0, 0, 128));
				GridBagConstraints gbc_btnRegresar_1 = new GridBagConstraints();
				gbc_btnRegresar_1.anchor = GridBagConstraints.SOUTH;
				gbc_btnRegresar_1.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnRegresar_1.gridx = 3;
				gbc_btnRegresar_1.gridy = 13;
				POds_1.add(btnRegresar_1, gbc_btnRegresar_1);
		
		POds_2 = new JPanel();
		POds_2.setBackground(new Color(255, 255, 255));
		PUsuario.add(POds_2, "name_2946339492406022");
		GridBagLayout gbl_POds_2 = new GridBagLayout();
		gbl_POds_2.columnWidths = new int[]{0, 217, 216, 241, 0};
		gbl_POds_2.rowHeights = new int[]{23, 60, 127, 24, 23, 35, 53, 36, 37, 0, 56, 0};
		gbl_POds_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_POds_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		POds_2.setLayout(gbl_POds_2);
		
		btnMasInfo2 = new JButton("<html>Mas informacion<html>");
		btnMasInfo2.addActionListener(listener);
		
		JLabel lblOdsHambre = new JLabel("ODS 2: Hambre 0 ");
		lblOdsHambre.setForeground(new Color(255, 204, 0));
		lblOdsHambre.setFont(new Font("Eras Medium ITC", Font.BOLD, 26));
		lblOdsHambre.setBackground(SystemColor.menu);
		GridBagConstraints gbc_lblOdsHambre = new GridBagConstraints();
		gbc_lblOdsHambre.fill = GridBagConstraints.BOTH;
		gbc_lblOdsHambre.insets = new Insets(0, 0, 5, 0);
		gbc_lblOdsHambre.gridwidth = 2;
		gbc_lblOdsHambre.gridx = 2;
		gbc_lblOdsHambre.gridy = 0;
		POds_2.add(lblOdsHambre, gbc_lblOdsHambre);
		
		JLabel label_2 = new JLabel("<html>\"Con hambre, cualquier taco callejero y desabrido te sabe a gloria...\"                                -FrasesTop<html>");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Eras Medium ITC", Font.ITALIC, 17));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridwidth = 3;
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 1;
		POds_2.add(label_2, gbc_label_2);
		
		JLabel label_6 = new JLabel("Descripcion ");
		label_6.setForeground(new Color(0, 0, 128));
		label_6.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.NORTH;
		gbc_label_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 2;
		POds_2.add(label_6, gbc_label_6);
		
		JLabel lblelSectorAlimentario = new JLabel("<html>El sector alimentario y el sector agr\u00EDcola ofrecen soluciones claves para el desarrollo y son vitales para la eliminaci\u00F3n del hambre y la pobreza. Gestionadas de forma adecuada, la agricultura, la silvicultura y la acuicultura pueden suministrar comida nutritiva a todo el planeta, as\u00ED como generar ingresos decentes, apoyar el desarrollo centrado en las personas del campo y proteger el medio ambiente.<html>");
		lblelSectorAlimentario.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_lblelSectorAlimentario = new GridBagConstraints();
		gbc_lblelSectorAlimentario.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblelSectorAlimentario.anchor = GridBagConstraints.SOUTH;
		gbc_lblelSectorAlimentario.insets = new Insets(0, 0, 5, 0);
		gbc_lblelSectorAlimentario.gridwidth = 3;
		gbc_lblelSectorAlimentario.gridx = 1;
		gbc_lblelSectorAlimentario.gridy = 2;
		POds_2.add(lblelSectorAlimentario, gbc_lblelSectorAlimentario);
		
		JLabel label = new JLabel("Eventos ");
		label.setForeground(new Color(0, 0, 128));
		label.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.fill = GridBagConstraints.VERTICAL;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 4;
		POds_2.add(label, gbc_label);
		
		CBOds_2 = new JComboBox();
		CBOds_2.setBackground(new Color(255, 204, 102));
		CBOds_2.setToolTipText("");
		GridBagConstraints gbc_CBOds_2 = new GridBagConstraints();
		gbc_CBOds_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_CBOds_2.anchor = GridBagConstraints.SOUTH;
		gbc_CBOds_2.insets = new Insets(0, 0, 5, 5);
		gbc_CBOds_2.gridx = 2;
		gbc_CBOds_2.gridy = 4;
		POds_2.add(CBOds_2, gbc_CBOds_2);
		
		lblOds_2Im = new JLabel("");
		lblOds_2Im.setIcon(Ods_2);
		GridBagConstraints gbc_lblOds_2Im = new GridBagConstraints();
		gbc_lblOds_2Im.gridheight = 4;
		gbc_lblOds_2Im.insets = new Insets(0, 0, 5, 0);
		gbc_lblOds_2Im.gridx = 3;
		gbc_lblOds_2Im.gridy = 4;
		POds_2.add(lblOds_2Im, gbc_lblOds_2Im);
		
		JLabel label_1 = new JLabel("Descripcion del Evento: ");
		label_1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.fill = GridBagConstraints.VERTICAL;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 5;
		POds_2.add(label_1, gbc_label_1);
		
		lblDescripcion_2 = new JLabel("");
		GridBagConstraints gbc_lblDescripcion_2 = new GridBagConstraints();
		gbc_lblDescripcion_2.gridheight = 2;
		gbc_lblDescripcion_2.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion_2.gridx = 2;
		gbc_lblDescripcion_2.gridy = 5;
		POds_2.add(lblDescripcion_2, gbc_lblDescripcion_2);
		
		btnagregarEvento_1 = new JButton("<html>Agregar Evento");
		btnagregarEvento_1.setBackground(new Color(255, 204, 0));
		btnagregarEvento_1.setVerticalAlignment(SwingConstants.TOP);
		btnagregarEvento_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		GridBagConstraints gbc_btnagregarEvento_1 = new GridBagConstraints();
		gbc_btnagregarEvento_1.fill = GridBagConstraints.BOTH;
		gbc_btnagregarEvento_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnagregarEvento_1.gridx = 1;
		gbc_btnagregarEvento_1.gridy = 7;
		POds_2.add(btnagregarEvento_1, gbc_btnagregarEvento_1);
		
		btnDonacion2 = new JButton("Donacion");
		btnDonacion2.setVerticalAlignment(SwingConstants.TOP);
		btnDonacion2.addActionListener(listener);
		btnDonacion2.setBackground(new Color(255, 204, 0));
		btnDonacion2.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		GridBagConstraints gbc_btnDonacion2 = new GridBagConstraints();
		gbc_btnDonacion2.fill = GridBagConstraints.BOTH;
		gbc_btnDonacion2.insets = new Insets(0, 0, 5, 5);
		gbc_btnDonacion2.gridx = 2;
		gbc_btnDonacion2.gridy = 7;
		POds_2.add(btnDonacion2, gbc_btnDonacion2);
		btnMasInfo2.setVerticalAlignment(SwingConstants.TOP);
		btnMasInfo2.setForeground(Color.BLACK);
		btnMasInfo2.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnMasInfo2.setBackground(new Color(255, 215, 0));
		GridBagConstraints gbc_btnMasInfo2 = new GridBagConstraints();
		gbc_btnMasInfo2.fill = GridBagConstraints.BOTH;
		gbc_btnMasInfo2.insets = new Insets(0, 0, 5, 5);
		gbc_btnMasInfo2.gridx = 1;
		gbc_btnMasInfo2.gridy = 8;
		POds_2.add(btnMasInfo2, gbc_btnMasInfo2);
		
		btnRecomendarEvento = new JButton("Recomendar Evento");
		btnRecomendarEvento.setVerticalAlignment(SwingConstants.TOP);
		btnRecomendarEvento.setFont(new Font("Eras Medium ITC", Font.BOLD, 19));
		btnRecomendarEvento.setBackground(new Color(255, 204, 0));
		GridBagConstraints gbc_btnRecomendarEvento = new GridBagConstraints();
		gbc_btnRecomendarEvento.fill = GridBagConstraints.BOTH;
		gbc_btnRecomendarEvento.insets = new Insets(0, 0, 5, 5);
		gbc_btnRecomendarEvento.gridx = 2;
		gbc_btnRecomendarEvento.gridy = 8;
		POds_2.add(btnRecomendarEvento, gbc_btnRecomendarEvento);
		
		btnRegresar_2 = new JButton("Regresar");
		btnRegresar_2.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnRegresar_2.setForeground(new Color(255, 255, 255));
		btnRegresar_2.setBackground(new Color(0, 0, 128));
		btnRegresar_2.addActionListener(listener);
		GridBagConstraints gbc_btnRegresar_2 = new GridBagConstraints();
		gbc_btnRegresar_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRegresar_2.anchor = GridBagConstraints.SOUTH;
		gbc_btnRegresar_2.gridx = 3;
		gbc_btnRegresar_2.gridy = 10;
		POds_2.add(btnRegresar_2, gbc_btnRegresar_2);
		
		POds_11 = new JPanel();
		POds_11.setBackground(new Color(255, 255, 255));
		PUsuario.add(POds_11, "name_2946387583446506");
		GridBagLayout gbl_POds_11 = new GridBagLayout();
		gbl_POds_11.columnWidths = new int[]{0, 202, 214, 41, 221, 0};
		gbl_POds_11.rowHeights = new int[]{51, 38, 103, 34, 14, 60, 29, 31, 22, 0, 0, 59, 0};
		gbl_POds_11.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_POds_11.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		POds_11.setLayout(gbl_POds_11);
		
		JLabel lblOdsCiudades = new JLabel("<html>ODS 11: Ciudades y comunidades sostenibles<html>");
		lblOdsCiudades.setForeground(new Color(255, 204, 51));
		lblOdsCiudades.setFont(new Font("Eras Medium ITC", Font.BOLD, 26));
		lblOdsCiudades.setBackground(SystemColor.menu);
		GridBagConstraints gbc_lblOdsCiudades = new GridBagConstraints();
		gbc_lblOdsCiudades.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblOdsCiudades.insets = new Insets(0, 0, 5, 0);
		gbc_lblOdsCiudades.gridwidth = 4;
		gbc_lblOdsCiudades.gridx = 1;
		gbc_lblOdsCiudades.gridy = 0;
		POds_11.add(lblOdsCiudades, gbc_lblOdsCiudades);
		
		JLabel label_5 = new JLabel("<html>\"Si estas mucho tiempo en un sitio, formas parte de el\" (Rocky)<html>");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Eras Medium ITC", Font.ITALIC, 18));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.gridwidth = 4;
		gbc_label_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_5.insets = new Insets(0, 0, 5, 0);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 1;
		POds_11.add(label_5, gbc_label_5);
		
		JLabel lbllosProblemasQue_1 = new JLabel("<html>Los problemas que enfrentan las ciudades, como la recogida y la gesti\u00F3n seguras de los desechos s\u00F3lidos, se pueden vencer de manera que les permita seguir prosperando y creciendo, y al mismo tiempo aprovechar mejor los recursos y reducir la contaminaci\u00F3n y la pobreza.<html>");
		lbllosProblemasQue_1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_lbllosProblemasQue_1 = new GridBagConstraints();
		gbc_lbllosProblemasQue_1.anchor = GridBagConstraints.SOUTH;
		gbc_lbllosProblemasQue_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbllosProblemasQue_1.insets = new Insets(0, 0, 5, 0);
		gbc_lbllosProblemasQue_1.gridwidth = 4;
		gbc_lbllosProblemasQue_1.gridx = 1;
		gbc_lbllosProblemasQue_1.gridy = 2;
		POds_11.add(lbllosProblemasQue_1, gbc_lbllosProblemasQue_1);
		
		JLabel label_11 = new JLabel("Descripcion ");
		label_11.setForeground(new Color(0, 0, 128));
		label_11.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 1;
		gbc_label_11.gridy = 2;
		POds_11.add(label_11, gbc_label_11);
		
		CBOds_11 = new JComboBox();
		CBOds_11.setBackground(new Color(255, 204, 51));
		CBOds_11.setToolTipText("");
		GridBagConstraints gbc_CBOds_11 = new GridBagConstraints();
		gbc_CBOds_11.fill = GridBagConstraints.BOTH;
		gbc_CBOds_11.insets = new Insets(0, 0, 5, 5);
		gbc_CBOds_11.gridx = 2;
		gbc_CBOds_11.gridy = 3;
		POds_11.add(CBOds_11, gbc_CBOds_11);
		
		JLabel label_9 = new JLabel("Eventos ");
		label_9.setForeground(new Color(0, 0, 128));
		label_9.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.EAST;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 1;
		gbc_label_9.gridy = 3;
		POds_11.add(label_9, gbc_label_9);
		
		lblOds_11Im = new JLabel("");
		lblOds_11Im.setIcon(Ods_11);
		GridBagConstraints gbc_lblOds_11Im = new GridBagConstraints();
		gbc_lblOds_11Im.gridheight = 4;
		gbc_lblOds_11Im.insets = new Insets(0, 0, 5, 0);
		gbc_lblOds_11Im.gridx = 4;
		gbc_lblOds_11Im.gridy = 3;
		POds_11.add(lblOds_11Im, gbc_lblOds_11Im);
		
		JLabel label_10 = new JLabel("Descripcion del Evento: ");
		label_10.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.EAST;
		gbc_label_10.fill = GridBagConstraints.VERTICAL;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 1;
		gbc_label_10.gridy = 4;
		POds_11.add(label_10, gbc_label_10);
		
		btnMasInfo3 = new JButton("<html>Mas informacion<html>");
		btnMasInfo3.addActionListener(listener);
		
		lblDescripcion_11 = new JLabel("");
		GridBagConstraints gbc_lblDescripcion_11 = new GridBagConstraints();
		gbc_lblDescripcion_11.gridheight = 2;
		gbc_lblDescripcion_11.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion_11.gridx = 2;
		gbc_lblDescripcion_11.gridy = 4;
		POds_11.add(lblDescripcion_11, gbc_lblDescripcion_11);
		
		btnagregarEvento_2 = new JButton("Agregar Evento");
		btnagregarEvento_2.addActionListener(listener);
		btnagregarEvento_2.setVerticalAlignment(SwingConstants.TOP);
		btnagregarEvento_2.setBackground(new Color(255, 204, 51));
		btnagregarEvento_2.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		GridBagConstraints gbc_btnagregarEvento_2 = new GridBagConstraints();
		gbc_btnagregarEvento_2.fill = GridBagConstraints.BOTH;
		gbc_btnagregarEvento_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnagregarEvento_2.gridx = 1;
		gbc_btnagregarEvento_2.gridy = 7;
		POds_11.add(btnagregarEvento_2, gbc_btnagregarEvento_2);
		
		
		btnDonacion3 = new JButton("Donacion");
		btnDonacion3.addActionListener(listener);
		btnDonacion3.setBackground(new Color(255, 204, 51));
		btnDonacion3.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		GridBagConstraints gbc_btnDonacion3 = new GridBagConstraints();
		gbc_btnDonacion3.fill = GridBagConstraints.BOTH;
		gbc_btnDonacion3.insets = new Insets(0, 0, 5, 5);
		gbc_btnDonacion3.gridx = 2;
		gbc_btnDonacion3.gridy = 7;
		POds_11.add(btnDonacion3, gbc_btnDonacion3);
		btnMasInfo3.setVerticalAlignment(SwingConstants.TOP);
		btnMasInfo3.setForeground(Color.BLACK);
		btnMasInfo3.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnMasInfo3.setBackground(new Color(255, 215, 0));
		GridBagConstraints gbc_btnMasInfo3 = new GridBagConstraints();
		gbc_btnMasInfo3.anchor = GridBagConstraints.NORTH;
		gbc_btnMasInfo3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMasInfo3.insets = new Insets(0, 0, 5, 5);
		gbc_btnMasInfo3.gridx = 1;
		gbc_btnMasInfo3.gridy = 8;
		POds_11.add(btnMasInfo3, gbc_btnMasInfo3);
		
		btnRecomendarEvento_11 = new JButton("Recomendar Evento");
		btnRecomendarEvento_11.setFont(new Font("Eras Medium ITC", Font.BOLD, 19));
		GridBagConstraints gbc_btnRecomendarEvento_11 = new GridBagConstraints();
		gbc_btnRecomendarEvento_11.insets = new Insets(0, 0, 5, 5);
		gbc_btnRecomendarEvento_11.gridx = 2;
		gbc_btnRecomendarEvento_11.gridy = 8;
		POds_11.add(btnRecomendarEvento_11, gbc_btnRecomendarEvento_11);
		
		btnRegresar_11 = new JButton("Regresar");
		btnRegresar_11.setForeground(new Color(255, 255, 255));
		btnRegresar_11.setBackground(new Color(0, 0, 128));
		btnRegresar_11.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnRegresar_11.addActionListener(listener);
		GridBagConstraints gbc_btnRegresar_11 = new GridBagConstraints();
		gbc_btnRegresar_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRegresar_11.anchor = GridBagConstraints.SOUTH;
		gbc_btnRegresar_11.gridx = 4;
		gbc_btnRegresar_11.gridy = 11;
		POds_11.add(btnRegresar_11, gbc_btnRegresar_11);
		
		POds_14 = new JPanel();
		POds_14.setBackground(new Color(255, 255, 255));
		PUsuario.add(POds_14, "name_2946462960568703");
		GridBagLayout gbl_POds_14 = new GridBagLayout();
		gbl_POds_14.columnWidths = new int[]{0, 195, 146, 30, 249, 0};
		gbl_POds_14.rowHeights = new int[]{42, 0, 108, 23, 14, 0, 89, 28, 53, 0, 0, 36, 0};
		gbl_POds_14.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_POds_14.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		POds_14.setLayout(gbl_POds_14);
		
		JLabel lblodsVida = new JLabel("<html>ODS 14: Vida Submarina<html>");
		lblodsVida.setForeground(new Color(175, 238, 238));
		lblodsVida.setFont(new Font("Eras Medium ITC", Font.BOLD, 26));
		lblodsVida.setBackground(SystemColor.menu);
		GridBagConstraints gbc_lblodsVida = new GridBagConstraints();
		gbc_lblodsVida.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblodsVida.gridwidth = 4;
		gbc_lblodsVida.insets = new Insets(0, 0, 5, 0);
		gbc_lblodsVida.gridx = 1;
		gbc_lblodsVida.gridy = 0;
		POds_14.add(lblodsVida, gbc_lblodsVida);
		
		JLabel label_7 = new JLabel("<html>\"La dedicacion y la buena observacion hacen al buen Pescador\" -Big Fish<html>");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Eras Medium ITC", Font.ITALIC, 18));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_7.gridwidth = 4;
		gbc_label_7.insets = new Insets(0, 0, 5, 0);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 1;
		POds_14.add(label_7, gbc_label_7);
		
		JLabel lbllosOcanosDel_1 = new JLabel("<html>Los oc\u00E9anos del mundo \u2014su temperatura, qu\u00EDmica, corrientes y vida\u2014 mueven sistemas que hacen que la Tierra sea habitable para la humanidad. Nuestras precipitaciones, el agua potable, el clima, el tiempo, las costas, gran parte de nuestros alimentos e incluso el ox\u00EDgeno del aire que respiramos provienen, en \u00FAltima instancia del mar y son regulados por este. <html>");
		lbllosOcanosDel_1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_lbllosOcanosDel_1 = new GridBagConstraints();
		gbc_lbllosOcanosDel_1.anchor = GridBagConstraints.SOUTH;
		gbc_lbllosOcanosDel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbllosOcanosDel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lbllosOcanosDel_1.gridwidth = 4;
		gbc_lbllosOcanosDel_1.gridx = 1;
		gbc_lbllosOcanosDel_1.gridy = 2;
		POds_14.add(lbllosOcanosDel_1, gbc_lbllosOcanosDel_1);
		
		JLabel label_16 = new JLabel("Descripcion ");
		label_16.setForeground(new Color(0, 0, 128));
		label_16.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 1;
		gbc_label_16.gridy = 2;
		POds_14.add(label_16, gbc_label_16);
		
		JLabel label_25 = new JLabel("Eventos ");
		label_25.setForeground(new Color(0, 0, 128));
		label_25.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_label_25 = new GridBagConstraints();
		gbc_label_25.anchor = GridBagConstraints.EAST;
		gbc_label_25.fill = GridBagConstraints.VERTICAL;
		gbc_label_25.insets = new Insets(0, 0, 5, 5);
		gbc_label_25.gridx = 1;
		gbc_label_25.gridy = 4;
		POds_14.add(label_25, gbc_label_25);
		
		CBOds_14 = new JComboBox();
		CBOds_14.setBackground(new Color(175, 238, 238));
		GridBagConstraints gbc_CBOds_14 = new GridBagConstraints();
		gbc_CBOds_14.insets = new Insets(0, 0, 5, 5);
		gbc_CBOds_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_CBOds_14.gridx = 2;
		gbc_CBOds_14.gridy = 4;
		POds_14.add(CBOds_14, gbc_CBOds_14);
		
		lblOds_14Im = new JLabel("");
		lblOds_14Im.setIcon(Ods_14);
		GridBagConstraints gbc_lblOds_14Im = new GridBagConstraints();
		gbc_lblOds_14Im.gridheight = 5;
		gbc_lblOds_14Im.insets = new Insets(0, 0, 5, 0);
		gbc_lblOds_14Im.gridx = 4;
		gbc_lblOds_14Im.gridy = 4;
		POds_14.add(lblOds_14Im, gbc_lblOds_14Im);
		
		JLabel label_18 = new JLabel("Descripcion del Evento: ");
		label_18.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.anchor = GridBagConstraints.EAST;
		gbc_label_18.fill = GridBagConstraints.VERTICAL;
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 1;
		gbc_label_18.gridy = 5;
		POds_14.add(label_18, gbc_label_18);
		
		btnDonacion4 = new JButton("Donacion");
		btnDonacion4.setBackground(new Color(175, 238, 238));
		btnDonacion4.setForeground(new Color(0, 0, 0));
		btnDonacion4.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnDonacion4.addActionListener(listener);
		
		lblDescripcion_14 = new JLabel("");
		GridBagConstraints gbc_lblDescripcion_14 = new GridBagConstraints();
		gbc_lblDescripcion_14.gridheight = 2;
		gbc_lblDescripcion_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion_14.gridx = 2;
		gbc_lblDescripcion_14.gridy = 5;
		POds_14.add(lblDescripcion_14, gbc_lblDescripcion_14);
		
		btnagregarEvento_3 = new JButton("Agregar Evento");
		btnagregarEvento_3.setVerticalAlignment(SwingConstants.TOP);
		btnagregarEvento_3.addActionListener(listener);
		btnagregarEvento_3.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnagregarEvento_3.setForeground(new Color(0, 0, 0));
		btnagregarEvento_3.setBackground(new Color(175, 238, 238));
		GridBagConstraints gbc_btnagregarEvento_3 = new GridBagConstraints();
		gbc_btnagregarEvento_3.anchor = GridBagConstraints.NORTH;
		gbc_btnagregarEvento_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnagregarEvento_3.gridx = 1;
		gbc_btnagregarEvento_3.gridy = 7;
		POds_14.add(btnagregarEvento_3, gbc_btnagregarEvento_3);
		GridBagConstraints gbc_btnDonacion4 = new GridBagConstraints();
		gbc_btnDonacion4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDonacion4.insets = new Insets(0, 0, 5, 5);
		gbc_btnDonacion4.gridx = 2;
		gbc_btnDonacion4.gridy = 7;
		POds_14.add(btnDonacion4, gbc_btnDonacion4);
		
		btnMasInfo4 = new JButton("<html>Mas Informacion<html>");
		btnMasInfo4.addActionListener(listener);
		btnMasInfo4.setForeground(Color.BLACK);
		btnMasInfo4.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnMasInfo4.setBackground(new Color(175, 238, 238));
		GridBagConstraints gbc_btnMasInfo4 = new GridBagConstraints();
		gbc_btnMasInfo4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMasInfo4.insets = new Insets(0, 0, 5, 5);
		gbc_btnMasInfo4.gridx = 1;
		gbc_btnMasInfo4.gridy = 8;
		POds_14.add(btnMasInfo4, gbc_btnMasInfo4);
		
		btnRecomendadionOds_14 = new JButton("Recomendar Evento");
		btnRecomendadionOds_14.setFont(new Font("Eras Medium ITC", Font.BOLD, 19));
		btnRecomendadionOds_14.setBackground(new Color(175, 238, 238));
		GridBagConstraints gbc_btnRecomendadionOds_14 = new GridBagConstraints();
		gbc_btnRecomendadionOds_14.insets = new Insets(0, 0, 5, 5);
		gbc_btnRecomendadionOds_14.gridx = 2;
		gbc_btnRecomendadionOds_14.gridy = 8;
		POds_14.add(btnRecomendadionOds_14, gbc_btnRecomendadionOds_14);
		
		btnRegresar_14 = new JButton("Regresar");
		btnRegresar_14.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnRegresar_14.addActionListener(listener);
		btnRegresar_14.setForeground(new Color(255, 255, 255));
		btnRegresar_14.setBackground(new Color(0, 0, 139));
		GridBagConstraints gbc_btnRegresar_14 = new GridBagConstraints();
		gbc_btnRegresar_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRegresar_14.anchor = GridBagConstraints.SOUTH;
		gbc_btnRegresar_14.gridx = 4;
		gbc_btnRegresar_14.gridy = 11;
		POds_14.add(btnRegresar_14, gbc_btnRegresar_14);
		
		POds_15 = new JPanel();
		POds_15.setBackground(new Color(255, 255, 255));
		PUsuario.add(POds_15, "name_2946538650863667");
		GridBagLayout gbl_POds_15 = new GridBagLayout();
		gbl_POds_15.columnWidths = new int[]{0, 195, 146, 37, 228, 0};
		gbl_POds_15.rowHeights = new int[]{47, 77, 87, 0, 29, 14, 60, 35, 25, 21, 0, 47, 0};
		gbl_POds_15.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_POds_15.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		POds_15.setLayout(gbl_POds_15);
		
		btnDonacion5 = new JButton("Donacion");
		btnDonacion5.setBackground(new Color(34, 139, 34));
		btnDonacion5.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnDonacion5.addActionListener(listener);
		
		JLabel lblodsVida_1 = new JLabel("<html>ODS 15: Vida de Ecosistemas Terrestres<html>");
		lblodsVida_1.setForeground(new Color(34, 139, 34));
		lblodsVida_1.setFont(new Font("Eras Medium ITC", Font.BOLD, 26));
		lblodsVida_1.setBackground(new Color(34, 139, 34));
		GridBagConstraints gbc_lblodsVida_1 = new GridBagConstraints();
		gbc_lblodsVida_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblodsVida_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblodsVida_1.gridwidth = 4;
		gbc_lblodsVida_1.gridx = 1;
		gbc_lblodsVida_1.gridy = 0;
		POds_15.add(lblodsVida_1, gbc_lblodsVida_1);
		
		JLabel label_12 = new JLabel("<html>\"La tierra provee lo suficiente para satisfacer las necesidades del hombre, pero no la avaricia de cada hombre\"(Mahatma Gandhi)<html>");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Eras Medium ITC", Font.ITALIC, 18));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.gridwidth = 4;
		gbc_label_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_12.insets = new Insets(0, 0, 5, 0);
		gbc_label_12.gridx = 1;
		gbc_label_12.gridy = 1;
		POds_15.add(label_12, gbc_label_12);
		
		JLabel label_15 = new JLabel("Descripcion ");
		label_15.setForeground(new Color(0, 0, 128));
		label_15.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.anchor = GridBagConstraints.NORTHWEST;
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 1;
		gbc_label_15.gridy = 2;
		POds_15.add(label_15, gbc_label_15);
		
		JLabel lblelDe = new JLabel("<html>El 30.7% de la superficie terrestre est\u00E1 cubierta por bosques y estos, adem\u00E1s de proporcionar seguridad alimentaria y refugio, son fundamentales para combatir el cambio clim\u00E1tico, pues protegen la diversidad biol\u00F3gica y las viviendas de la poblaci\u00F3n ind\u00EDgena.<html>");
		lblelDe.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_lblelDe = new GridBagConstraints();
		gbc_lblelDe.anchor = GridBagConstraints.SOUTH;
		gbc_lblelDe.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblelDe.insets = new Insets(0, 0, 5, 0);
		gbc_lblelDe.gridwidth = 4;
		gbc_lblelDe.gridx = 1;
		gbc_lblelDe.gridy = 2;
		POds_15.add(lblelDe, gbc_lblelDe);
		
		CBOds_15 = new JComboBox();
		CBOds_15.setBackground(new Color(0, 102, 0));
		CBOds_15.setToolTipText("");
		GridBagConstraints gbc_CBOds_15 = new GridBagConstraints();
		gbc_CBOds_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_CBOds_15.anchor = GridBagConstraints.SOUTH;
		gbc_CBOds_15.insets = new Insets(0, 0, 5, 5);
		gbc_CBOds_15.gridx = 2;
		gbc_CBOds_15.gridy = 4;
		POds_15.add(CBOds_15, gbc_CBOds_15);
		
		JLabel label_21 = new JLabel("Eventos ");
		label_21.setForeground(new Color(0, 0, 128));
		label_21.setFont(new Font("Eras Medium ITC", Font.BOLD, 18));
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.anchor = GridBagConstraints.EAST;
		gbc_label_21.insets = new Insets(0, 0, 5, 5);
		gbc_label_21.gridx = 1;
		gbc_label_21.gridy = 4;
		POds_15.add(label_21, gbc_label_21);
		
		lblOds_15Im = new JLabel("");
		lblOds_15Im.setIcon(Ods_15);
		GridBagConstraints gbc_lblOds_15Im = new GridBagConstraints();
		gbc_lblOds_15Im.gridheight = 5;
		gbc_lblOds_15Im.insets = new Insets(0, 0, 5, 0);
		gbc_lblOds_15Im.gridx = 4;
		gbc_lblOds_15Im.gridy = 4;
		POds_15.add(lblOds_15Im, gbc_lblOds_15Im);
		
		JLabel label_22 = new JLabel("Descripcion del Evento: ");
		label_22.setFont(new Font("Eras Medium ITC", Font.PLAIN, 16));
		GridBagConstraints gbc_label_22 = new GridBagConstraints();
		gbc_label_22.anchor = GridBagConstraints.EAST;
		gbc_label_22.fill = GridBagConstraints.VERTICAL;
		gbc_label_22.insets = new Insets(0, 0, 5, 5);
		gbc_label_22.gridx = 1;
		gbc_label_22.gridy = 5;
		POds_15.add(label_22, gbc_label_22);
		
		lblDespcripcion_15 = new JLabel("");
		GridBagConstraints gbc_lblDespcripcion_15 = new GridBagConstraints();
		gbc_lblDespcripcion_15.gridheight = 2;
		gbc_lblDespcripcion_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblDespcripcion_15.gridx = 2;
		gbc_lblDespcripcion_15.gridy = 5;
		POds_15.add(lblDespcripcion_15, gbc_lblDespcripcion_15);
		
		btnagregarEvento_4 = new JButton("Agregar Evento");
		btnagregarEvento_4.addActionListener(listener);
		btnagregarEvento_4.setBackground(new Color(0, 102, 0));
		btnagregarEvento_4.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		GridBagConstraints gbc_btnagregarEvento_4 = new GridBagConstraints();
		gbc_btnagregarEvento_4.fill = GridBagConstraints.BOTH;
		gbc_btnagregarEvento_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnagregarEvento_4.gridx = 1;
		gbc_btnagregarEvento_4.gridy = 7;
		POds_15.add(btnagregarEvento_4, gbc_btnagregarEvento_4);
		GridBagConstraints gbc_btnDonacion5 = new GridBagConstraints();
		gbc_btnDonacion5.fill = GridBagConstraints.BOTH;
		gbc_btnDonacion5.insets = new Insets(0, 0, 5, 5);
		gbc_btnDonacion5.gridx = 2;
		gbc_btnDonacion5.gridy = 7;
		POds_15.add(btnDonacion5, gbc_btnDonacion5);
		
		btnMasInfo5 = new JButton("Mas Informacion");
		btnMasInfo5.addActionListener(listener);
		btnMasInfo5.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnMasInfo5.setBackground(new Color(34, 139, 34));
		GridBagConstraints gbc_btnMasInfo5 = new GridBagConstraints();
		gbc_btnMasInfo5.anchor = GridBagConstraints.NORTH;
		gbc_btnMasInfo5.insets = new Insets(0, 0, 5, 5);
		gbc_btnMasInfo5.gridx = 1;
		gbc_btnMasInfo5.gridy = 8;
		POds_15.add(btnMasInfo5, gbc_btnMasInfo5);
		
		btnRecomendarEvento_15 = new JButton("Recomendar Evento");
		btnRecomendarEvento_15.setBackground(new Color(51, 153, 0));
		btnRecomendarEvento_15.setFont(new Font("Eras Medium ITC", Font.BOLD, 19));
		GridBagConstraints gbc_btnRecomendarEvento_15 = new GridBagConstraints();
		gbc_btnRecomendarEvento_15.insets = new Insets(0, 0, 5, 5);
		gbc_btnRecomendarEvento_15.gridx = 2;
		gbc_btnRecomendarEvento_15.gridy = 8;
		POds_15.add(btnRecomendarEvento_15, gbc_btnRecomendarEvento_15);
		
		btnRegresar_15 = new JButton("Regresar");
		btnRegresar_15.setBackground(new Color(0, 0, 139));
		btnRegresar_15.setForeground(new Color(255, 255, 255));
		btnRegresar_15.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnRegresar_15.addActionListener(listener);
		
		btnApoyaATeamtrees = new JButton("<html>Apoya a TeamTrees<html>");
		btnApoyaATeamtrees.addActionListener(listener);
		btnApoyaATeamtrees.setFont(new Font("Eras Medium ITC", Font.BOLD, 20));
		btnApoyaATeamtrees.setBackground(new Color(34, 139, 34));
		GridBagConstraints gbc_btnApoyaATeamtrees = new GridBagConstraints();
		gbc_btnApoyaATeamtrees.gridwidth = 2;
		gbc_btnApoyaATeamtrees.fill = GridBagConstraints.BOTH;
		gbc_btnApoyaATeamtrees.insets = new Insets(0, 0, 5, 5);
		gbc_btnApoyaATeamtrees.gridx = 1;
		gbc_btnApoyaATeamtrees.gridy = 10;
		POds_15.add(btnApoyaATeamtrees, gbc_btnApoyaATeamtrees);
		GridBagConstraints gbc_btnRegresar_15 = new GridBagConstraints();
		gbc_btnRegresar_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRegresar_15.anchor = GridBagConstraints.SOUTH;
		gbc_btnRegresar_15.gridx = 4;
		gbc_btnRegresar_15.gridy = 11;
		POds_15.add(btnRegresar_15, gbc_btnRegresar_15);
	}
	
	private class Listener implements ActionListener{

		//	Controlador controller = new Controlador();
			@Override
			public void actionPerformed(ActionEvent e) {
							
				if(e.getSource() == ChBTrabaja) {
					if(ChBTrabaja.isSelected() == true) {
						ChBEstudia.setEnabled(false);
					}
					if(ChBTrabaja.isSelected() == false) {
						ChBEstudia.setEnabled(true);
					}
					}
				
				
				
				if (e.getSource() == ChBEstudia) {
					if (ChBEstudia.isSelected() == true) {
						ChBTrabaja.setEnabled(false);
					}
					if (ChBEstudia.isSelected() == false) {
						ChBTrabaja.setEnabled(true);
					}
					}
				
				
				if(e.getSource() == btnCrearCuenta) {
					char [] contra = pwfContrasena_1.getPassword();
					char[] confirmarc = pwfConfirmarContrasena.getPassword();
					String contrasena = new String(contra);
					String confirmarcontrasena = new String(confirmarc);
					String ocupacion = "";
					if (ChBTrabaja.isSelected()) {
						ocupacion = "Trabaja";
					}
					if (ChBEstudia.isSelected()) {
						ocupacion = "Estudia";
					}
					
					if (contrasena.contentEquals(confirmarcontrasena)) {
					boolean confirmar = control.crearNuevoUsuario(txtCorreo.getText(), contrasena,txtNombre.getText(), txtGenero.getText(), txtEdad.getText(), txtTelefono.getText(),ocupacion, txtLugar.getText(),txtDireccion.getText());				
					if (confirmar == false) {
						if (txtCorreo.getText().contentEquals("")) {
							JOptionPane.showMessageDialog(null, "Ingrese un correo");
							
						}
						if (txtNombre.getText().contentEquals("")|| txtTelefono.getText().contentEquals("") || txtDireccion.getText().contentEquals("")|| contra == null || confirmarc == null || txtProfesion.getText().contentEquals("")|| txtLugar.getText().contentEquals("")|| ChBTrabaja.isSelected()||txtEdad.getText().contentEquals("")||txtGenero.getText().contentEquals("")) {
							JOptionPane.showMessageDialog(null, "Ingrese todos los campos");
							
						}
						else {
							JOptionPane.showMessageDialog(null, "El correo ingresado ya existe");
							
						}
						
				    }
					//if (confirmar == true &&txtCorreo.getText().contentEquals("")==false &&txtNombre.getText().contentEquals("")== false && txtTelefono.getText().contentEquals("")== false && txtDireccion.getText().contentEquals("")== false && contra != null && confirmarc != null && txtProfesion.getText().contentEquals("")== false && txtLugar.getText().contentEquals("")== false && ChBTrabaja.isSelected() == false ) {
					if (confirmar == true) {	
						PRegistrate.setVisible(false);
						JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente, ya eres un ciudadano global");
						txtNombre.setText("");
						ChBTrabaja.setEnabled(true);
						ChBEstudia.setEnabled(true);
						txtTelefono.setText("");
						txtDireccion.setText("");
						txtGenero.setText("");
						txtCorreo.setText("");
						pwfContrasena_1.setText("");  
						pwfConfirmarContrasena.setText("");
						txtProfesion.setText(""); 
						txtLugar.setText(""); 
						ChBTrabaja.setSelected(false);  
						ChBEstudia.setSelected(false);  
						txtEdad.setText(""); 
						PInicioS.setVisible(true);
					}
					
					
					}
					else {
						JOptionPane.showMessageDialog(null, "Verifique la contrasenia");
					}
					
					}
					
					
				if(e.getSource() == btnIniciarSesion) {
					PRegistrate.setVisible(false);
					PInicioS.setVisible(true);
				
					}
				
				if (e.getSource() == btnagregarEvento) {
					try {
						Date fecha = new Date();
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
						Date date = formatter.parse(JOptionPane.showInputDialog(null, "Introduzca la fecha: dd/mm/aaaa"));
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
						String fech = sdf.format(date);
						control.agregarVoluntariado(fech, (String)CBOds_1.getSelectedItem());
						EventosHistorial.setText(control.todoHistorial());
					}catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Introduzca correctamente la contrasenia");
					}
				}
				
				if (e.getSource() == btnagregarEvento_1) {
					try {
						Date fecha = new Date();
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
						Date date = formatter.parse(JOptionPane.showInputDialog(null, "Introduzca la fecha: dd/mm/aaaa"));
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
						String fech = sdf.format(date);
						control.agregarVoluntariado(fech, (String)CBOds_2.getSelectedItem());
						EventosHistorial.setText(control.todoHistorial());
					}catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Introduzca correctamente la fecha");
					}
					
				}
				if (e.getSource() == btnagregarEvento_2) {
					try {
						Date fecha = new Date();
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
						Date date = formatter.parse(JOptionPane.showInputDialog(null, "Introduzca la fecha: dd/mm/aaaa"));
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
						String fech = sdf.format(date);
						control.agregarVoluntariado(fech, (String)CBOds_11.getSelectedItem());
						EventosHistorial.setText(control.todoHistorial());
					}catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Introduzca correctamente la fecha");
					}
					
				}
				if (e.getSource() == btnagregarEvento_3) {
					try {
						Date fecha = new Date();
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
						Date date = formatter.parse(JOptionPane.showInputDialog(null, "Introduzca la fecha: dd/mm/aaaa"));
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
						String fech = sdf.format(date);
						control.agregarVoluntariado(fech, (String)CBOds_14.getSelectedItem());
						EventosHistorial.setText(control.todoHistorial());
					}catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Introduzca correctamente la fecha");
					}
					
				}
				if (e.getSource() == btnagregarEvento_4) {
					try {
						Date fecha = new Date();
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
						Date date = formatter.parse(JOptionPane.showInputDialog(null, "Introduzca la fecha: dd/mm/aaaa"));
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
						String fech = sdf.format(date);
						control.agregarVoluntariado(fech, (String)CBOds_15.getSelectedItem());
						EventosHistorial.setText(control.todoHistorial());
					}catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Introduzca correctamente la fecha");
					}
					
				}

				if(e.getSource()== btnIniciarS) {
					try {
						char[]contra = pwfContrasena.getPassword();
						String contrasena = new String(contra);
						if (control.login(txtUsuario.getText(), contrasena) == true) {
						PInicioS.setVisible(false);
						PUsuario.setVisible(true);
						lblNombre_1.setText(control.obtenerDatosUsuario()[1]);
						String[] eventos1 = control.getOds1();
						String[] eventos2 = control.getOds2();
						String[] eventos3 = control.getOds11();
						String[] eventos4 = control.getOds14();
						String[] eventos5 = control.getOds15();
						for(int a = 0; a < eventos1.length; a++) {
							CBOds_1.addItem(eventos1[a]);
							CBOds_2.addItem(eventos2[a]);
							CBOds_11.addItem(eventos3[a]);
							CBOds_14.addItem(eventos4[a]);
							CBOds_15.addItem(eventos5[a]);
							}
						
						String [] descripcion1 = control.informacionEvento((String)CBOds_1.getSelectedItem());
						txtDescripcion_1.setText(descripcion1[3]);
						
						String [] descripcion2 = control.informacionEvento((String)CBOds_2.getSelectedItem());
						lblDescripcion_2.setText(descripcion2[3]);
						
						String [] descripcion11 = control.informacionEvento((String)CBOds_11.getSelectedItem());
						lblDescripcion_11.setText(descripcion11[3]);
						
						String [] descripcion14 = control.informacionEvento((String)CBOds_14.getSelectedItem());
						lblDescripcion_14.setText(descripcion14[3]);
						
						String [] descripcion15 = control.informacionEvento((String)CBOds_15.getSelectedItem());
						lblDespcripcion_15.setText(descripcion15[3]);
						
						EventosHistorial.setText(control.todoHistorial());
						
							}
						else {
							JOptionPane.showMessageDialog(null, "Usuario y/o Contrasena Invalidos");
							}
						
						} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
							}
					
						}
				if(e.getSource() == btnRegresar_1) {
					POds_1.setVisible(false);
					PInicio.setVisible(true);
					}
				
				if(e.getSource() == btnRegresar_2) {
					POds_2.setVisible(false);
					PInicio.setVisible(true);
					}
				
				if(e.getSource() == btnRegresar_11) {
					POds_11.setVisible(false); 
					PInicio.setVisible(true);
					}
				if(e.getSource() == btnRegresar_14) {
					POds_14.setVisible(false);
					PInicio.setVisible(true);
					}
				
				if(e.getSource() == btnRegresar_15) {
					POds_15.setVisible(false); 
					PInicio.setVisible(true);
					}
				
				if(e.getSource() == btnDonacion1 ||e.getSource() == btnDonacion2 || e.getSource() == btnDonacion3 || e.getSource() == btnDonacion4 || e.getSource() == btnDonacion5) {
					POds_1.setVisible(false);
					POds_2.setVisible(false);
					POds_11.setVisible(false);
					POds_14.setVisible(false);
					POds_15.setVisible(false);
					PODS.setVisible(false);
					PHistorial.setVisible(false);
					PDonaciones.setVisible(true);
					}
				
				if(e.getSource() == btnRegresar_3) {
					PDonaciones.setVisible(false);
					PUsuario.setVisible(true);
					}
				
				if(e.getSource() == btnIngTarjeta) {
					alerta = control.ComprobarTarjeta(txtCreditCard.getText());
					JOptionPane.showMessageDialog(null, alerta);
					}
				if(e.getSource() == btnMasInfo) {
					control.MostrarPaginaWeb("https://www.un.org/sustainabledevelopment/es/poverty/");
					}
				if(e.getSource() == btnMasInfo2) {
					control.MostrarPaginaWeb("https://www.un.org/sustainabledevelopment/es/hunger/");
					}
				if(e.getSource() == btnMasInfo3) {
					control.MostrarPaginaWeb("https://www.un.org/sustainabledevelopment/es/cities/");
					}
				if(e.getSource() == btnMasInfo4) {
					control.MostrarPaginaWeb("https://www.un.org/sustainabledevelopment/es/oceans/");
					}
				if(e.getSource() == btnMasInfo5) {
					control.MostrarPaginaWeb("https://www.un.org/sustainabledevelopment/es/biodiversity/");
					}
				if(e.getSource() == btnApoyaATeamtrees) {
					control.MostrarPaginaWeb("https://teamtrees.org/");
					}
				
				if(e.getSource() == btnEvento) {
					control.MostrarPaginaWeb("https://forms.gle/j7wdCeJmPz1g219d9");
					}
				
				if(e.getSource() == btnRecomendarEvento) {
					control.MostrarPaginaWeb("https://forms.gle/j7wdCeJmPz1g219d9");
					}
				if(e.getSource() == btnRecomendarEvento_11) {
					control.MostrarPaginaWeb("https://forms.gle/j7wdCeJmPz1g219d9");
					}
				if(e.getSource() == btnRecomendadionOds_14) {
					control.MostrarPaginaWeb("https://forms.gle/j7wdCeJmPz1g219d9");
					}
				if(e.getSource() == btnRecomendarEvento_15) {
					control.MostrarPaginaWeb("https://forms.gle/j7wdCeJmPz1g219d9");
					}
			}
			
			
		}
	
	
	
	private class Teclado implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
			//Crear Cuenta
			if (e.getSource() == pwfContrasena_1) {
				char [] contra = pwfContrasena_1.getPassword();
				String contrasena = new String(contra);
				if(contrasena != null) {
					pwfConfirmarContrasena.setEnabled(true);
					}
				}
			//Iniciar Sesion
			if(e.getSource() == txtUsuario) {
				String usuario = txtUsuario.getText();
				if(usuario != null) {
				pwfContrasena.setEnabled(true);}
				usuario = txtUsuario.getText();
				}
			
			if(e.getSource() == pwfContrasena) {
				String usuario = txtUsuario.getText();
				char[] contra = pwfContrasena.getPassword();
				String contrasena = new String(contra);
				if( usuario != null &&  contrasena != null) {
					btnIniciarS.setEnabled(true);
					}else
						JOptionPane.showMessageDialog(null, "El usurio o la contrasena son incorrectos");
				}
			
			if(e.getSource() == txtLugar) {
				char [] contra = pwfContrasena_1.getPassword();
				char [] confirmarc = pwfConfirmarContrasena.getPassword();
				String contrasena = new String(contra);
				String confirmarcontrasena = new String(confirmarc);
				
			if (txtNombre.getText() != null && txtTelefono.getText() != null && txtDireccion.getText() != null && 
					contrasena != null && confirmarcontrasena != null && txtProfesion.getText() != null && 
					txtLugar.getText() != null && ChBTrabaja.isSelected() == true && txtEdad.getText() != null)
				btnCrearCuenta.setEnabled(true);
				
			else if(txtNombre.getText() != null && txtTelefono.getText() != null && txtDireccion.getText() != null && 
					contrasena != null && confirmarcontrasena != null && txtProfesion.getText() != null && 
					txtLugar.getText() != null && ChBEstudia.isSelected() == true && txtEdad.getText() != null)
				btnCrearCuenta.setEnabled(true);
				}
			
		}
		
	}
	
	private class Mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == lblRecordarcontra) {
				System.out.println("funciona");
				String n = JOptionPane.showInputDialog(null,"Ingrese el correo");
				control.nuevaContrasena(n);
				}
			if(e.getSource() == lblOds_1) {
				PInicio.setVisible(false);
				POds_1.setVisible(true); 
				}
			if(e.getSource() == lblOds_2) {
				PInicio.setVisible(false);
				POds_2.setVisible(true); 
				}
			if(e.getSource() == lblOds_11) {
				PInicio.setVisible(false);
				POds_11.setVisible(true); 
				}
			if(e.getSource() == lblOds_14) {
				PInicio.setVisible(false);
				POds_14.setVisible(true); 
				}
			if(e.getSource() == lblOds_15) {
				PInicio.setVisible(false);
				POds_15.setVisible(true); 
				}
			if(e.getSource() == lblHistorial) {
				PODS.setVisible(false);
				PDonaciones.setVisible(false);
				PConfiguracion.setVisible(false);
				PHistorial.setVisible(true);
				}
			if(e.getSource() == lblOds) {
				PHistorial.setVisible(false);
				PDonaciones.setVisible(false);
				PConfiguracion.setVisible(false);
				PODS.setVisible(true);
				}
			if(e.getSource() == lblDonaciones) {
				PODS.setVisible(false);
				PHistorial.setVisible(false);
				PConfiguracion.setVisible(false);
				PDonaciones.setVisible(true);
				}
			if (e.getSource()== lblCerrarSesion) {
				control.logout();
				PUsuario.setVisible (false);
				txtUsuario.setText("");
				pwfContrasena.setText("");
				PInicioS.setVisible(true);
				}
			if (e.getSource() == lblRegistrate) {
				PInicioS.setVisible(false);
				PRegistrate.setVisible(true);	
				}
			if(e.getSource() == lblConfiguracion) {
				PHistorial.setVisible(false);
				PDonaciones.setVisible(false);
				PODS.setVisible(false);
				PConfiguracion.setVisible(true);
				String [] datos = control.obtenerDatosUsuario();
				txtPCorreo.setText(datos[0]);
				txtPNombre.setText(datos[1]);
				txtPSexo.setText(datos[2]);
				txtPEdad.setText(datos[3]);
				txtPTelefono.setText(datos[4]);
				txtPProfesion.setText(datos[5]);
				txtPLugar.setText(datos[6]);
				txtPDireccion.setText(datos[7]);
				}
			
			}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}



