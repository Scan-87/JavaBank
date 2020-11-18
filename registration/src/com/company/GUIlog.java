package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class GUIlog implements ActionListener {     //так, implements прописываем ручками, далее первое решение и ентер
    /* описываем все элементы на странице: текстики, кнопочки, ползуночки, секретные рецепты от Елены Малышевой */
    private static JTextField login;
    private static JLabel log_label;
    private static JPasswordField password;
    private static JLabel pass_label;
    private static JLabel pass_error;

    private static JButton submit;
    private static JButton new_acc;

    private static Scanner x;

    /* а тут начинается веселье */
    public static void main(/*String[] args*/) {

        /* кароч, просто перепиши это */
        JFrame frame = new JFrame();
        frame.setSize(320, 230);          //А вот тут можно настроить размер окна. Все в пикселях канешн
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



        pass_error = new JLabel("Please enter your credentials");
        pass_error.setBounds(10, 100, 300, 25);
        panel.add(pass_error);


        /* ееее, мечта школьника - делаем собственную кнопку! */
        submit = new JButton("Log in");
        submit.setBounds(170, 150, 140, 25);
        submit.addActionListener(new GUIlog());     //прикинь, она теперь даже работает!
        panel.add(submit);

        new_acc = new JButton("Register");
        new_acc.setBounds(10, 150, 140, 25);
        new_acc.addActionListener(new GUIlog());     //прикинь, она теперь даже работает!
        panel.add(new_acc);

        frame.setVisible(true);     //о! и эту фигню тоже не забудь, иначе все по @ пойдет
    }




    public static void verifyLogin(String username, String password, String filepath)
    {
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";

        //System.out.println(username + ", " + password);

        try
        {
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while(x.hasNext() && !found)
            {
                tempUsername = x.next();
                tempPassword = x.next();

                //System.out.println(tempUsername + " " + tempPassword);

                if (tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
                {
                    found = true;
                    pass_error.setText("Welcome, " + username + "!");
                }
                else
                    pass_error.setText("Incorrect password!");
            }
            x.close();
            System.out.println(found);


        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }





    @Override

        public void actionPerformed(ActionEvent e) {
            Object obj = e.getSource();
            if (obj == new_acc)
                GUIreg.main();
            else
                verifyLogin(login.getText(), password.getText(), "/home/ascander/Desktop/java/Bank-app/sandbox/registration/src/com/company/creds.txt");

    /* эта фигня сама появится. Она типа важная. Типа сюда падают все личные данные сверху. Продавай сколько влезет! */



    }
}