import javax.swing.*;
import java.awt.*;

public class login extends JFrame {

    public login (){
        this.setLayout(null);
        this.setBounds(0,0,1800,1000);

        JLabel email = new JLabel("Email");
        email.setBounds(800,225,100,50);
        this.add(email);

        JTextField usuario = new JTextField();
        usuario.setBounds(800,260,350,40);

        JLabel password = new JLabel("Contraseña");
        password.setBounds(800,295,100,50);
        this.add(password);

        JTextField contraseña = new JTextField();
        contraseña.setBounds(800,330,350,40);

        JButton boton = new JButton("Login");
        boton.setBounds(800,390,120,40);

        this.add(boton);
        this.add(usuario);
        this.add(contraseña);
        this.setVisible(true);
    }
}