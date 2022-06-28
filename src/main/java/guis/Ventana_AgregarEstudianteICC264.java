package guis;

import javax.swing.*;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import dominio.Estudiante;

public class Ventana_AgregarEstudianteICC264 extends JFrame {
    public JPanel panel2;

    public Ventana_AgregarEstudianteICC264(){
        this.setSize(500,400);
        setTitle("Agregar Estudiante ICC264");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        establecerPartes2();
    }

    private void establecerPartes2(){
        establecerPanel();
        establecerEtiquetas();
        establecerCajasDeTexto();
        establecerBotones();
    }

    private void establecerPanel(){
        panel2 = new JPanel();
        panel2.setLayout(null);
        this.getContentPane().add(panel2);
    }

    private void establecerEtiquetas(){
        JLabel Etiqueta1 = new JLabel();
        Etiqueta1.setText("Rut:    ");
        Etiqueta1.setBounds(13,80,100,20);
        Etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(Etiqueta1);

        JLabel Etiqueta2 = new JLabel();
        Etiqueta2.setText("Nombre:    ");
        Etiqueta2.setBounds(26,100,100,20);
        Etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(Etiqueta2);

        JLabel Etiqueta3 = new JLabel();
        Etiqueta3.setText("Email:    ");
        Etiqueta3.setBounds(18,120,100,20);
        Etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(Etiqueta3);
    }

    private void establecerCajasDeTexto(){
        JTextField CajaTexto1 = new JTextField();
        CajaTexto1.setBounds(150,80,100,20);
        panel2.add(CajaTexto1);

        JTextField CajaTexto2 = new JTextField();
        CajaTexto2.setBounds(150,100,100,20);
        panel2.add(CajaTexto2);

        JTextField CajaTexto3 = new JTextField();
        CajaTexto3.setBounds(150,120,100,20);
        panel2.add(CajaTexto3);
    }

    private void establecerBotones(){
        JButton Boton1 = new JButton();
        Boton1.setText("Agregar");
        Boton1.setBounds(40,300,150,20);
        panel2.add(Boton1);

        JButton Boton2 = new JButton();
        Boton2.setText("Cancelar");
        Boton2.setBounds(300,300,150,20);
        panel2.add(Boton2);
    }
}
