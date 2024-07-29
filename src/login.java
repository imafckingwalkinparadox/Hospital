import javax.swing.*;

public class login extends JFrame {

    public login (){
        this.setLayout(null);
        this.setBounds(0,0,800,500);
        this.setVisible(true);

        JTextField usuario = new JTextField();
        usuario.setBounds(300,20,200,50);

        this.add(usuario);
        this.setVisible(true);
    }
}