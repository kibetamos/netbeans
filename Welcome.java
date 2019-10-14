import javax.swing.*;

public class Welcome extends JFrame{

    public static void main(String[] args){
        Welcome frameTabel = new Welcome();
    }
    JLabel welcome;
    JLabel dms = new JLabel("Coiurrier services System");
    JPanel panel = new JPanel();

    Welcome(){
        super("Welcome!");
        this.welcome = new JLabel("**Welcome to**", 
                SwingConstants.CENTER);
        setSize(400,300);
        setLocation(500,280);
        setResizable(false);
        panel.setLayout(null);

        welcome.setBounds(60, 70, 300, 60);
        dms.setBounds(125, 100, 300, 60);

        panel.add(welcome);
        panel.add(dms);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}