/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Citlalli
 */
public class EliminarAlumnosDialog extends JDialog {
    private JLabel lblInformacion;
    private JTextField edtNoControl;
    private JButton btnEliminar;
    private JButton btnSalir;
        private EliminarAlumnoListener listener;

    public EliminarAlumnosDialog(JFrame parent){
        super(parent, true);
        super.setTitle("Eliminar alumno");
        super.getContentPane().setBackground(Color.PINK);
        super.setSize(547, 104);

        lblInformacion = new JLabel("ID del Alumno a Eliminar");
        edtNoControl = new JTextField(15);
        btnEliminar = new JButton("Eliminar");
        btnSalir = new JButton("Cerrar");

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                listener.salirButtonClick();
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String a = (String) edtNoControl.getText();
                listener.eliminarButtonCLick(a);
            }
        });



        super.add(lblInformacion);
        super.add(edtNoControl);
        super.add(btnEliminar);

        super.add(btnSalir,BorderLayout.SOUTH);
        super.setLocationRelativeTo(parent);
        super.setLayout(new FlowLayout());
    }

    public void setListener(EliminarAlumnoListener listener) {
        this.listener = listener;
    }

    public void clean() {
        edtNoControl.setText("");
    }
}
