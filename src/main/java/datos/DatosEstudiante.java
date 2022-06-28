package datos;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.JPanel;

public class DatosEstudiante extends JFrame {
    public JPanel panel3;
    public DatosEstudiante(){
        this.setSize(500,400);
        setTitle("Curso ICC264");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Verificar_Rut BotonVerificador = new Verificar_Rut();
        agregarDatos();
        agregarBoton();
        agregarPanel();
    }

    private void agregarDatos(){
        JComboBox comboBox1 = new JComboBox();
        comboBox1.setToolTipText("RUT Estudiantes ICC264");
        comboBox1.setToolTipText("20583773619;ALIANTE POBLETE SEBASTIAN ANDRES;s.aliante01@ufromail.cl\n" +
                                 "20968025420;CALDERÓN RETAMAL GUSTAVO ALEJANDRO;g.calderon05@ufromail.cl\n" +
                                 "22456736720;CAÑETE NAHUELFIL NICOLÁS MATÍAS;n.canete01@ufromail.cl\n" +
                                 "21029594120;FERNÁNDEZ MILLAR NICOLÁS ANTONIO;n.fernandez07@ufromail.cl\n" +
                                 "20886090920;HENRÍQUEZ RETAMAL MARCELO IGNACIO;m.henriquez11@ufromail.cl\n" +
                                 "19809314918;HUENCHUÑAN CARES GONZALO NICOLAS;g.huenchunan01@ufromail.cl\n" +
                                 "20787295420;HUIRCALEO CANIUPÁN JOSÉ ENRIQUE;j.huircaleo01@ufromail.cl\n" +
                                 "20919321320;LAGOS LLANOS GERMÁN ALEXANDER;g.lagos05@ufromail.cl\n" +
                                 "20081365019;MORALES ALMEYDA IGNACIO ANDRÉS ANTONIO;i.morales04@ufromail.cl\n" +
                                 "20584002819;NAVARRO CUEVAS DIEGO ALEJANDRO;d.navarro03@ufromail.cl\n" +
                                 "20302902019;PAREDES SÁEZ PAOLO FABIÁN;p.paredes06@ufromail.cl\n" +
                                 "20652598319PÉREZ LÓPEZ PABLO IGNACIO;p.perez14@ufromail.cl\n" +
                                 "20915656320;PINO BARRIENTOS LEANDRO BASTIÁN;l.pino06@ufromail.cl\n" +
                                 "20079931318;RAPOSO MÉNDEZ AGUSTÍN ANTONIO;a.raposo01@ufromail.cl\n" +
                                 "20617429319;SÁEZ ALMAZABAL ESTEBAN SIMÓN;e.saez07@ufromail.cl\n" +
                                 "20923634620;SANDOVAL ACUÑA BERNARDO ANTONIO;b.sandoval07@ufromail.cl\n" +
                                 "20366482618;VILLAGRAN OLIVERA JUAN FERNANDO;j.villagran03@ufromail.cl");
        comboBox1.setBounds(100,20,20,30);
        panel3.add(comboBox1);
    }

    private void agregarBoton(){
        JButton BotonVerificador = new JButton();
        BotonVerificador.setText("Nuevo Estudiante");
        BotonVerificador.setBounds(250,300,150,20);
        panel3.add(BotonVerificador);
    }

    private void agregarPanel(){
        panel3 = new JPanel();
        panel3.setLayout(null);
        this.getContentPane().add(panel3);
    }
}