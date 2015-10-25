package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Plot2D_test;

public class Welcome extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JButton btnPoint;
    private JButton btnLine;
    private JButton btnEllipse;
    private JButton btnPolygon;
    private JButton btnHyperbola;
    private JButton btnParabola;
    private JButton btnVector;
    private JLabel xLabel;
    private JLabel yLabel;
    private JTextField xTxt;
    private JTextField yTxt;
    private JButton btnAdd;
    private JTextArea pointBox;
    private JLabel magLabel;
    private JTextField magTxt;
    private JLabel hLabel;
    private JTextField hTxt;
    private JLabel vLabel;
    private JTextField vTxt;
    private JLabel orientationLabel;
    private JComboBox oBox;
    private JButton btnCreate;

    public Welcome() {
        //construct preComponents
        String[] oBoxItems = {"VERTICAL", "HORIZONTAL"};

        //construct components
        jcomp1 = new JLabel ("ADVDISC MACHINE PROJECT ");
        jcomp2 = new JLabel ("MATRIX GRAPHICS");
        btnPoint = new JButton ("POINT");
        btnLine = new JButton ("LINE ");
        btnEllipse = new JButton ("ELLIPSE");
        btnPolygon = new JButton ("POLYGON");
        btnHyperbola = new JButton ("HYPERBOLA");
        btnParabola = new JButton ("PARABOLA");
        btnVector = new JButton ("VECTOR");
        xLabel = new JLabel ("X- COORDINATE:");
        yLabel = new JLabel ("Y- COORDINATE:");
        xTxt = new JTextField (1);
        yTxt = new JTextField (1);
        btnAdd = new JButton ("ADD");
        pointBox = new JTextArea (5, 5);
        magLabel = new JLabel ("MAGNITUDE:");
        magTxt = new JTextField (1);
        hLabel = new JLabel ("H. DISTANCE:");
        hTxt = new JTextField (1);
        vLabel = new JLabel ("V. DISTANCE:");
        vTxt = new JTextField (1);
        orientationLabel = new JLabel ("ORIENTATION:");
        oBox = new JComboBox (oBoxItems);
        btnCreate = new JButton ("CREATE");

        //set components properties
        magTxt.setEnabled (false);
        hTxt.setEnabled (false);
        vTxt.setEnabled (false);
        oBox.setEnabled (false);
        pointBox.setEnabled(false);

        //adjust size and set layout
        setPreferredSize (new Dimension (667, 393));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (btnPoint);
        add (btnLine);
        add (btnEllipse);
        add (btnPolygon);
        add (btnHyperbola);
        add (btnParabola);
        add (btnVector);
        add (xLabel);
        add (yLabel);
        add (xTxt);
        add (yTxt);
        add (btnAdd);
        add (pointBox);
        add (magLabel);
        add (magTxt);
        add (hLabel);
        add (hTxt);
        add (vLabel);
        add (vTxt);
        add (orientationLabel);
        add (oBox);
        add (btnCreate);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (240, 25, 175, 30);
        jcomp2.setBounds (265, 55, 115, 25);
        btnPoint.setBounds (15, 120, 105, 25);
        btnLine.setBounds (15, 155, 105, 25);
        btnEllipse.setBounds (15, 190, 105, 25);
        btnPolygon.setBounds (15, 295, 105, 25);
        btnHyperbola.setBounds (15, 260, 105, 25);
        btnParabola.setBounds (15, 225, 105, 25);
        btnVector.setBounds (15, 330, 105, 25);
        xLabel.setBounds (145, 120, 100, 25);
        yLabel.setBounds (145, 155, 100, 25);
        xTxt.setBounds (245, 120, 100, 25);
        yTxt.setBounds (245, 155, 100, 25);
        btnAdd.setBounds (245, 185, 100, 25);
        pointBox.setBounds (375, 120, 270, 195);
        magLabel.setBounds (145, 230, 100, 25);
        magTxt.setBounds (245, 230, 100, 25);
        hLabel.setBounds (145, 260, 100, 25);
        hTxt.setBounds (245, 260, 100, 25);
        vLabel.setBounds (145, 290, 100, 25);
        vTxt.setBounds (245, 290, 100, 25);
        orientationLabel.setBounds (145, 320, 100, 25);
        oBox.setBounds (245, 320, 100, 25);
        btnCreate.setBounds (460, 325, 100, 25);
  
    }

    private void showActionListenerDemo(){               
    	
        btnAdd.addActionListener(new CustomActionListener());        
        btnPoint.addActionListener(new CustomActionListener());
        btnLine.addActionListener(new CustomActionListener());
        btnParabola.addActionListener(new CustomActionListener());
        btnHyperbola.addActionListener(new CustomActionListener());
        btnEllipse.addActionListener(new CustomActionListener());
        btnPolygon.addActionListener(new CustomActionListener());
        btnVector.addActionListener(new CustomActionListener());
        btnCreate.addActionListener(new GraphPanelListener());
     }
    
    class GraphPanelListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame();
			
			Plot2D_test plot = new Plot2D_test();
			frame.add(plot.initGraph());
			plot.addPlot(2, 4);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.pack();             			
            frame.setLocationRelativeTo(null);  // center the application window
            frame.setVisible(true);   
			
		}
    }
    
    class CustomActionListener implements ActionListener{
    	
        public void actionPerformed(ActionEvent e) {
        
            if(e.getSource().equals(btnPoint)){
            	btnPoint.setEnabled(false);
            	btnLine.setEnabled(true);
            	btnParabola.setEnabled(true);
            	btnHyperbola.setEnabled(true);
            	btnEllipse.setEnabled(true);
            	btnPolygon.setEnabled(true);
            	btnVector.setEnabled(true);
            	magTxt.setEnabled(false);
            	oBox.setEnabled(false);
            	hTxt.setEnabled(false);
            	vTxt.setEnabled(false);
            }else if(e.getSource().equals(btnLine)){
            	btnPoint.setEnabled(true);
            	btnLine.setEnabled(false);
            	btnParabola.setEnabled(true);
            	btnHyperbola.setEnabled(true);
            	btnEllipse.setEnabled(true);
            	btnPolygon.setEnabled(true);
            	btnVector.setEnabled(true);
            	magTxt.setEnabled(false);
            	oBox.setEnabled(false);
            	hTxt.setEnabled(false);
            	vTxt.setEnabled(false);
            }else if(e.getSource().equals(btnParabola)){
            	btnPoint.setEnabled(true);
            	btnLine.setEnabled(true);
            	btnParabola.setEnabled(false);
            	btnHyperbola.setEnabled(true);
            	btnEllipse.setEnabled(true);
            	btnPolygon.setEnabled(true);
            	btnVector.setEnabled(true);
            	magTxt.setEnabled(true);
            	oBox.setEnabled(true);
            	hTxt.setEnabled(false);
            	vTxt.setEnabled(false);
            }else if(e.getSource().equals(btnHyperbola)){
            	btnPoint.setEnabled(true);
            	btnLine.setEnabled(true);
            	btnParabola.setEnabled(true);
            	btnHyperbola.setEnabled(false);
            	btnEllipse.setEnabled(true);
            	btnPolygon.setEnabled(true);
            	btnVector.setEnabled(true);
            	magTxt.setEnabled(false);
            	oBox.setEnabled(true);
            	hTxt.setEnabled(true);
            	vTxt.setEnabled(true);
            }else if(e.getSource().equals(btnEllipse)){
            	btnPoint.setEnabled(true);
            	btnLine.setEnabled(true);
            	btnParabola.setEnabled(true);
            	btnHyperbola.setEnabled(true);
            	btnEllipse.setEnabled(false);
            	btnPolygon.setEnabled(true);
            	btnVector.setEnabled(true);
            	magTxt.setEnabled(false);
            	oBox.setEnabled(false);
            	hTxt.setEnabled(true);
            	vTxt.setEnabled(true);
            }else if(e.getSource().equals(btnPolygon)){
            	btnPoint.setEnabled(true);
            	btnLine.setEnabled(true);
            	btnParabola.setEnabled(true);
            	btnHyperbola.setEnabled(true);
            	btnEllipse.setEnabled(true);
            	btnPolygon.setEnabled(false);
            	btnVector.setEnabled(true);
            	magTxt.setEnabled(false);
            	oBox.setEnabled(false);
            	hTxt.setEnabled(false);
            	vTxt.setEnabled(false);
            }else if(e.getSource().equals(btnVector)){
            	btnPoint.setEnabled(true);
            	btnLine.setEnabled(true);
            	btnParabola.setEnabled(true);
            	btnHyperbola.setEnabled(true);
            	btnEllipse.setEnabled(true);
            	btnPolygon.setEnabled(true);
            	btnVector.setEnabled(false);
            	magTxt.setEnabled(false);
            	oBox.setEnabled(false);
            	hTxt.setEnabled(false);
            	vTxt.setEnabled(false);
            }
            
            if(e.getSource().equals(btnAdd)){
            	pointBox.append(xTxt.getText()+"," + yTxt.getText() + "\n");
            	
            }
        }
     }	
    
    public static void main (String[] args) {
    	Welcome welcome = new Welcome();
        JFrame frame = new JFrame ("");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (welcome);
        
        welcome.showActionListenerDemo();
        
        frame.setLocation(350,150);
        frame.pack();
        frame.setVisible (true);
    }
}