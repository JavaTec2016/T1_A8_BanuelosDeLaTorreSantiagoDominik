import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class TxtFont extends JLabel {
	public TxtFont(String txt, Color c) {
		super(txt);
		setForeground(c);
	}
}
class PanelInfo extends JPanel {
	int width = 20, height = 20;
	public PanelInfo() {
		setBorder(BorderFactory.createTitledBorder(""));
		setLayout(null);
		setSize(600, 600);
		setVisible(true);
		setBackground(Color.BLUE);
		
		dimensionar(new TxtFont("F1:Select Test F2:Save Entry F3:Perform Test F4:New Booking F5:Payment Type F6:Delete Entry F7:Conc. F8:Add row", new Color(255, 255, 255)), 0, 0, 40, 1);
		dimensionar(new TxtFont("F9:Test Selected F11:Print Receipt F12: Patient Details Ctrl+F7:Payment Mode Ctrl+F2:Show Concession  Time in 24 hours", new Color(255, 255, 255)), 0, 1, 40, 1);
		dimensionar(new TxtFont("Format(Click on Time Label for more information) value in this field is coming from the Masters", new Color(255, 255, 255)), 0, 2, 40, 1);
		
	}
	void dimensionar(JComponent c, int x, int y, double w, double h) {
		c.setBounds(x*width,y*height,(int)w*width,(int)h*height);
		add(c);
	}
	void dimensionar(JComponent c, int x, int y) {
		c.setBounds(x*width,y*height, c.getWidth(), c.getHeight());
		add(c);
	}
}
class Jpl extends JPanel {
	int width = 20, height = 20;
	
	public Jpl() {
		setBorder(BorderFactory.createTitledBorder(""));
		setLayout(null);
		setSize(600, 600);
		setVisible(true);
		setBackground(Color.WHITE);
		
		dimensionar(new JLabel("Home Collection"), 0, 0, 6, 1);
		dimensionar(new JTextField(10), 6, 0, 4, 1);
		
		dimensionar(new JLabel("Paid"), 12, 0, 4, 1);
		dimensionar(new JTextField(10), 14, 0, 4, 1);
		
		dimensionar(new JLabel("Pay Type"), 19, 0, 4, 1);
		dimensionar(new JTextField(10), 22, 0, 4, 1);
		
		dimensionar(new JLabel("Receipt No."), 27, 0, 4, 1);
		dimensionar(new JTextField(10), 31, 0, 4, 1);
	}
	void dimensionar(JComponent c, int x, int y, double w, double h) {
		c.setBounds(x*width,y*height,(int)w*width,(int)h*height);
		add(c);
	}
	void dimensionar(JComponent c, int x, int y) {
		c.setBounds(x*width,y*height, c.getWidth(), c.getHeight());
		add(c);
	}
}

class PanelForm extends JPanel {
	int width = 20, height = 20;
	public PanelForm() {
		setBorder(BorderFactory.createTitledBorder(""));
		setLayout(null);
		setSize(600, 600);
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
		
		dimensionar(new JLabel("Total less"), 0,0,4,1);
		dimensionar(new JTextField(10), 6,0,4,1);
		dimensionar(new JLabel("test Amt."), 0, 2, 4, 1);
		dimensionar(new JTextField(10), 6, 2, 4, 1);
		dimensionar(new JLabel("Home Collection"), 0, 4, 4, 1);
		dimensionar(new JTextField(10), 6, 4, 4, 1);
		
		dimensionar(new JLabel("Tax Amt."), 0,6,4,1);
		dimensionar(new JTextField(10), 6,6,4,1);
		dimensionar(new JLabel("Net Amt."), 0, 8, 4, 1);
		dimensionar(new JTextField(10), 6, 8, 4, 1);
		dimensionar(new JLabel("Balance"), 0, 10, 4, 1);
		dimensionar(new JTextField(10), 6, 10, 4, 1);
		
	}
	
	void dimensionar(JComponent c, int x, int y, double w, double h) {
		c.setBounds(x*width,y*height,(int)w*width,(int)h*height);
		add(c);
	}
	void dimensionar(JComponent c, int x, int y) {
		c.setBounds(x*width,y*height, c.getWidth(), c.getHeight());
		add(c);
	}
}
class PanelSub extends JPanel {
	int width = 20, height = 20;
	public PanelSub() {
		setBorder(BorderFactory.createTitledBorder(""));
		setLayout(null);
		setSize(600, 600);
		setVisible(true);
		setBackground(Color.GRAY);
		
		dimensionar(new JButton("Test ID"), 0,0,4,2);
		dimensionar(new JButton("Test Name"), 3,0,15,2);
		dimensionar(new JButton("Rate"), 18, 0, 4, 2);
		dimensionar(new JButton("Disc %"), 22, 0, 4, 2);
		dimensionar(new JButton("Discount"), 26, 0, 5, 2);
		dimensionar(new JButton("Tax(%)"), 31, 0, 4, 2);
		dimensionar(new JButton("Tax Amt."), 35, 0, 5, 2);
	}
	
	void dimensionar(JComponent c, int x, int y, double w, double h) {
		c.setBounds(x*width,y*height,(int)w*width,(int)h*height);
		add(c);
	}
	void dimensionar(JComponent c, int x, int y) {
		c.setBounds(x*width,y*height, c.getWidth(), c.getHeight());
		add(c);
	}
}
class VentanaSub extends JInternalFrame {
	int width = 20, height = 20;
	public VentanaSub() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setTitle("");
		setSize(600, 600);
		setVisible(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);
		setResizable(true);
		
		dimensionar(new JLabel("Patient ID"), 0, 0, 3, 1);
		dimensionar(new JTextField(10), 3, 0, 5, 1);
		dimensionar(new JLabel("Date"), 11, 0, 2, 1);
		dimensionar(new JTextField(10), 13, 0, 3, 1);
		
		dimensionar(new JLabel("*Time (hh:mm)"), 16, 0, 5, 1);
		dimensionar(new JTextField(10), 20, 0, 3, 1);
		
		dimensionar(new JLabel("Lab. No"), 24, 0, 3, 1);
		dimensionar(new JTextField(10), 27, 0, 3, 1);
		
		dimensionar(new JLabel("Name"), 0, 2, 3, 1);
		initJCombo("MR", 3, 2, 3, 1);
		dimensionar(new JTextField(14), 7, 2, 14, 1);
		
		dimensionar(new JLabel("Sex"), 0, 4, 3, 1);
		initJCombo("MALE", 3, 4, 3, 1);
		dimensionar(new JLabel("Age"), 6, 4, 3, 1);
		dimensionar(new JTextField(10), 8, 4, 3, 1);
		
		dimensionar(new JLabel("Mons"), 11, 4, 3, 1);
		dimensionar(new JTextField(10), 13, 4, 3, 1);
		
		dimensionar(new JLabel("Days"), 16, 4, 3, 1);
		dimensionar(new JTextField(10), 18, 4, 3, 1);
		
		dimensionar(new JLabel("Referred By:"), 0, 6, 4, 1);
		dimensionar(new JTextField(10), 5, 6, 4, 1);
		dimensionar(new JTextField(10), 10, 6, 11, 1);
		
		dimensionar(new JLabel("Sample By:"), 22, 4, 4, 1);
		dimensionar(new JTextField(10), 26, 4, 4, 1);
		
		dimensionar(new JLabel("Sample By:"), 22, 4, 4, 1);
		dimensionar(new JTextField(10), 26, 4, 4, 1);
		dimensionar(new JLabel("Panel Code:"), 22, 6, 4, 1);
		dimensionar(new JTextField(10), 26, 6, 4, 1);
		dimensionar(new JLabel("Panel ID:"), 22, 8, 4, 1);
		dimensionar(new JTextField(10), 26, 8, 4, 1);
		dimensionar(new JLabel("e-mail:"), 22, 10, 4, 1);
		dimensionar(new JTextField(10), 26, 10, 4, 1);
	}
	public VentanaSub(int w, int h) {
		this();
		setSize(w, h);
		
	}
	void dimensionar(JComponent c, int x, int y, double w, double h) {
		c.setBounds(x*width,y*height,(int)w*width,(int)h*height);
		add(c);
	}
	void dimensionar(JComponent c, int x, int y) {
		c.setBounds(x*width,y*height, c.getWidth(), c.getHeight());
		add(c);
	}
	void initJCombo(String op1,int x, int y, double w, double h) {
		JComboBox<String> jc = new JComboBox<String>();
		jc.addItem(op1);
		dimensionar(jc, x, y, w, h);
	}
}
class VentanaInicio extends JFrame{
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menuMasters = new JMenu("Alumnos");
	
	int width = 26, height = 26;
	
	JInternalFrame sv;
	JPanel jp, jpf, jpl, jpi;
	
	public VentanaInicio() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MENUS - INTERNALFRAMES");
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		sv = new VentanaSub(getWidth()-10, getHeight()/3-10);
		jp = new PanelSub();
		jpf = new PanelForm();
		jpl = new Jpl();
		jpi = new PanelInfo();
		//-------------MENU------------
		menuBar.add(menuMasters);	
		JMenu menuBooking = new JMenu("Booking");
		menuBar.add(menuBooking);
	
			
		setJMenuBar(menuBar);
		//Barra de herramientas de acceso rapido
		JToolBar toolBar = new JToolBar(JToolBar.HORIZONTAL);
			JButton btnToolBarAdd = new JButton("Add");
			toolBar.add(btnToolBarAdd);
			JButton btnToolBarEdit = new JButton("Edit");
			toolBar.add(btnToolBarEdit);
			JButton btnToolBarBack = new JButton("Back");
			toolBar.add(btnToolBarBack);
			JButton btnToolBarNext = new JButton("Next");
			toolBar.add(btnToolBarNext);
			JButton btnToolBarList = new JButton("List");
			toolBar.add(btnToolBarList);
			JButton btnToolBarSave = new JButton("Save");
			toolBar.add(btnToolBarSave);
			JButton btnToolBarPrint = new JButton("Print");
			toolBar.add(btnToolBarPrint);
			JButton btnToolBarTest = new JButton("Test");
			toolBar.add(btnToolBarTest);
			JButton btnToolBarCancel = new JButton("Cancel");
			toolBar.add(btnToolBarCancel);
			JButton btnToolBarSettings = new JButton("Settings");
			toolBar.add(btnToolBarSettings);
			JButton btnToolBarDelete = new JButton("Delete");
			toolBar.add(btnToolBarDelete);
			JButton btnToolBarSlip = new JButton("Slip");
			toolBar.add(btnToolBarSlip);
			JButton btnToolBarExit = new JButton("Exit");
			toolBar.add(btnToolBarExit);
		dimensionar(toolBar, 0, 0, 23, 1);
		dimensionar(sv, 0, 1);
		dimensionar(jp, 0, 11, 3*getWidth()/4 /width, 12);
		dimensionar(jpf, (int)(3*getWidth()/4 /width), 11, getWidth()/4 /width, 12);
		dimensionar(jpl, 0, (int)(4*getHeight()/5 /height), getWidth()/width, getHeight()/12 /height);
		dimensionar(jpi, 0, (int)(11*getHeight()/13 /height), getWidth()/width, 10*getHeight()/12 /height);
		
	}//constructor
	void dimensionar(JComponent c, int x, int y, double w, double h) {
		c.setBounds(x*width,y*height,(int)w*width,(int)h*height);
		add(c);
	}
	void dimensionar(JComponent c, int x, int y) {
		c.setBounds(x*width,y*height, c.getWidth(), c.getHeight());
		add(c);
	}
	
}
public class Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VentanaInicio();
	}

}
