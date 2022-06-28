package guis;
import javax.swing.*;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import guis.Ventana_AgregarEstudianteICC264;


public class Ventana_CursoICC264 extends JFrame {
    public JPanel panel;

    public Ventana_CursoICC264(){
        JComboBox comboBox = new JComboBox();
        this.setSize(500,400);
        setTitle("Curso ICC264");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();

    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotonComboBox();
        colocarBoton();
    }

    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarEtiquetas(){
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("Nombre:    ");
        etiqueta1.setBounds(30,80,100,20);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("Email:    ");
        etiqueta2.setBounds(35,100,100,20);
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta2);
    }

    private void colocarBotonComboBox(){
        JComboBox boton1 = new JComboBox();
        boton1.setToolTipText("RUT Estudiantes ICC264");
        boton1.setBounds(20,20,200,30);
        panel.add(boton1);


    }

    private void colocarBoton(){
        JButton boton2 = new JButton();
        boton2.setText("NuevoEstudiante");
        boton2.setBounds(250,300,150,20);
        panel.add(boton2);
    }
}