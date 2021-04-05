/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Citlalli
 */
public class AcercaDeDialog extends JDialog {
    private JLabel lblImg;
    private JLabel lblTxt;
    private JLabel lblContanto;
    public AcercaDeDialog(JFrame parent){

        super(parent, true);
        super.setTitle("INFORMACIÓN");

        super.getContentPane().setBackground(Color.black);

        lblImg = new JLabel(new ImageIcon("Logo.gif"));
        lblTxt = new JLabel("INFORMACIÓN");
        super.add(lblTxt, BorderLayout.EAST);

        lblImg.setBounds(110,0,10,50);




        lblContanto = new JLabel("INFORMACIÓN CONTACTO");
        super.add(lblContanto, BorderLayout.SOUTH);
        super.add(lblImg);


        super.setSize(500, 500);
        super.setLocationRelativeTo(parent);
        super.setLayout(new FlowLayout());
    }  
}
