package guis;
import javax.swing.*;
import java.awt.Dimension;


public class Ventana_CursoICC264 extends JFrame {
    public Ventana_CursoICC264(){
        JComboBox comboBox = new JComboBox();
        this.setSize(500,400);
        setTitle("Curso ICC264");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}