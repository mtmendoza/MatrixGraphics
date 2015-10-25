package model;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GraphInput extends JPanel implements ActionListener{
    private JLabel labelX;
    private JLabel labelY;
    private JTextField inputX;
    private JTextField inputY;
    private JButton buttonAdd;
    private JLabel labelOperation;
    private JComboBox<String> selectOperation;
    private JLabel labelObject;
    private JComboBox<String> selectObject;
    private JLabel labelScale;
    private JLabel labelDegree;
    private JTextField inputFactor;
    private JTextField inputDegree;
    private JLabel labelAxis;
    private JTextField inputAxis;
    private JTextArea textGenerate;
    private JButton buttonGenerate;
    
	public GraphInput() {
        //construct preComponents
        String[] selectOperationItems = {"Translate", "Rotate", "Shear", "Scale", "Dilate", "Contract", "Reflect"};
        String[] selectObjectItems = {"Point","Line Segment","Ellipse", "Parabola", "Hyperbola", "Polygon","Vector"};

        //construct components
        labelX = new JLabel ("Input X:");
        labelY = new JLabel ("Input Y:");
        inputX = new JTextField (1);
        inputY = new JTextField (1);
        buttonAdd = new JButton ("Add Point");
        labelOperation = new JLabel ("Operation:");
        selectOperation = new JComboBox<String> (selectOperationItems);
        labelObject = new JLabel ("Object:");
        selectObject = new JComboBox<String> (selectObjectItems);
        labelScale = new JLabel ("Factor:");
        labelDegree = new JLabel ("Degree:");
        inputFactor = new JTextField (1);
        inputDegree = new JTextField (1);
        labelAxis = new JLabel ("Axis:");
        inputAxis = new JTextField (1);
        textGenerate = new JTextArea (5, 5);
        buttonGenerate = new JButton ("Generate");

        //adjust size and set layout
        setPreferredSize (new Dimension (1227, 265));
        setLayout (null);

        //add components
        add (labelX);
        add (labelY);
        add (inputX);
        add (inputY);
        add (buttonAdd);
        add (labelOperation);
        add (selectOperation);
        add (labelObject);
        add (selectObject);
        add (labelScale);
        add (labelDegree);
        add (inputFactor);
        add (inputDegree);
        add (labelAxis);
        add (inputAxis);
        add (textGenerate);
        add (buttonGenerate);

        //set component bounds (only needed by Absolute Positioning)
        labelX.setBounds (230, 15, 55, 25);
        labelY.setBounds (230, 45, 55, 20);
        inputX.setBounds (280, 15, 100, 25);
        inputY.setBounds (280, 45, 100, 25);
        buttonAdd.setBounds (280, 75, 100, 25);
        labelOperation.setBounds (390, 15, 65, 25);
        selectOperation.setBounds (455, 15, 145, 25);
        labelObject.setBounds (15, 15, 50, 25);
        selectObject.setBounds (60, 15, 150, 25);
        labelScale.setBounds (390, 45, 60, 25);
        labelDegree.setBounds (390, 70, 60, 25);
        inputFactor.setBounds (455, 45, 100, 25);
        inputDegree.setBounds (455, 75, 100, 25);
        labelAxis.setBounds (565, 45, 45, 25);
        inputAxis.setBounds (610, 45, 100, 25);
        textGenerate.setBounds (20, 115, 695, 85);
        buttonGenerate.setBounds (615, 205, 100, 25);
        
        labelScale.setVisible(false);
        inputFactor.setVisible(false);
        labelDegree.setVisible(false);
        inputDegree.setVisible(false);
        labelAxis.setVisible(false);
        inputAxis.setVisible(false);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		
	}

}