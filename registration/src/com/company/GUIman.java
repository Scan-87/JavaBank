
package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIman implements ActionListener {     //так, implements прописываем ручками, далее первое решение и ентер
    /* описываем все элементы на странице: текстики, кнопочки, ползуночки, секретные рецепты от Елены Малышевой */
    private static JTextField login;
    private static JLabel log_label;
    private static JPasswordField password;
    private static JLabel pass_label;

    private static JButton submit;

    /* а тут начинается веселье */
    public static void main(/*String[] args*/) {

        /* кароч, просто перепиши это */
        JFrame frame = new JFrame();
        frame.setSize(320, 180);          //А вот тут можно настроить размер окна. Все в пикселях канешн
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);


        /* первая циферка - растояние от левого края, вторая - сверху, третья - ширина поля, четвертая - высота поля*/

        /* сложно? а нефиг было математику в 5 классе прогуливать!11!!!!1!1 */


        log_label = new JLabel("Login");
        log_label.setBounds(10, 20, 100, 25);
        panel.add(log_label);

        login = new JTextField(24);
        login.setBounds(110, 20, 200, 25);
        panel.add(login);


        /* пожалуйста, не выбирайте сложные пароли. На брут хакеры тратят много энергии и нервов:( Заботьтесь о них! */
        pass_label = new JLabel("Password");
        pass_label.setBounds(10, 60, 100, 25);
        panel.add(pass_label);

        password = new JPasswordField(32);
        password.setBounds(110, 60, 200, 25);
        panel.add(password);


        /* ееее, мечта школьника - делаем собственную кнопку! */
        submit = new JButton("Submit");
        submit.setBounds(80, 100, 150, 25);
        submit.addActionListener(new GUIlog());     //прикинь, она теперь даже работает!
        panel.add(submit);


        frame.setVisible(true);     //о! и эту фигню тоже не забудь, иначе все по @ пойдет
    }
    /* эта фигня сама появится. Она типа важная. Типа сюда падают все личные данные сверху. Продавай сколько влезет! */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("This is example of how button works");
        //System.out.println(name1.getText() + " " + name2.getText() + " " + name3.getText());   //не забудь getText() !
        System.out.println(password.getText());
    }
}