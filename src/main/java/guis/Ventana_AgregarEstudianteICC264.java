package guis;
import javax.swing.*;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;


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
    }

    private void establecerPanel(){
        panel2 = new JPanel();
        panel2.setLayout(null);
        this.getContentPane().add(panel2);
    }

    private void establecerEtiquetas(){
        JLabel Etiqueta1 = new JLabel();
        Etiqueta1.setText("Rut:    ");
        Etiqueta1.setBounds(30,80,100,20);
        Etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(Etiqueta1);

        JLabel Etiqueta2 = new JLabel();
        Etiqueta2.setText("Nombre:    ");
        Etiqueta2.setBounds(35,100,100,20);
        Etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(Etiqueta2);

        JLabel Etiqueta3 = new JLabel();
        Etiqueta3.setText("Email:    ");
        Etiqueta3.setBounds(30,80,100,20);
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
    }
}
