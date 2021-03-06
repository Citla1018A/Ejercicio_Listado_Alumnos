/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Citlalli
 */
public class BusquedaPanel  extends JPanel{
    JLabel lblAlumno;
    JTextField edtId;
    JButton btnBuscar;
    
    BusquedaPanelListener listener;    
    
    public BusquedaPanel(){
        super.setBackground(Color.GRAY);
        
        lblAlumno = new JLabel("Buscar Por ID");
        edtId = new JTextField(15);
        btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String id = edtId.getText();
                listener.buscarAlumno(id);
                System.out.println(id);
            }
        });
        
               
        super.add(lblAlumno);
        super.add(edtId);
        super.add(btnBuscar);
        
    }

    public void clean(){
        edtId.setText("");
    }

    public void setListener(BusquedaPanelListener listener) {
        this.listener = listener;
    }
}
