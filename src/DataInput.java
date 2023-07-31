import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DataInput {}
class TextEditor extends JFrame {
    TextEditor (){
        setSize(800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        Mypanel mypanel =new Mypanel();
        add(mypanel);

        setVisible(true);
    }
}
class Mypanel extends JPanel{
    private JTextField textField1 = new JTextField();
    private JTextField textField2 = new JTextField();
    private JTextField textField3 = new JTextField();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
Mypanel () {
    setSize(800, 400);
    setLayout(null);

    jLabel1.setBounds(20,20,250,20);
    jLabel1.setText("Название книги:");
    textField1.setBounds(20,40,250,40);
    add(jLabel1);
    add(textField1);

    jLabel2.setBounds(20,120,250,20);
    jLabel2.setText("Год публикации книги:");
    textField2.setBounds(20,140,250,40);
    add(jLabel2);
    add(textField2);

    jLabel3.setBounds(20,220,250,20);
    jLabel3.setText("Автор книги:");
    textField3.setBounds(20,240,250,40);
    add(jLabel3);
    add(textField3);

    JButton button2 = new JButton();
    button2.setBounds(510, 40, 200, 40);
    button2.setText("Сохранить в Базе Данных ");

    button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String parametr1 = textField1.getText();
                String parametr2 = textField2.getText();
                String parametr3 = textField3.getText();
                int parametr = Integer.parseInt(parametr2);
                MyDatabase myDatabase = new MyDatabase(parametr1,parametr,parametr3);
            }
        });
    add(button2);
    }
}