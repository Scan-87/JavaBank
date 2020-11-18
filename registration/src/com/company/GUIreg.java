package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIreg implements ActionListener {     //так, implements прописываем ручками, далее первое решение и ентер
    /* описываем все элементы на странице: текстики, кнопочки, ползуночки, секретные рецепты от Елены Малышевой */
    private static JTextField login;
    private static JLabel log_label;
    private static JPasswordField password;
    private static JLabel pass_label;
    private static JPasswordField password_confirm;
    private static JLabel pass_conf_label;
    private static JTextField birth_day;
    private static JLabel birthday_label;
    private static JLabel birth_day_label;
    private static JTextField birth_month;
    private static JLabel birth_month_label;
    private static JTextField birth_year;
    private static JLabel birth_year_label;
    private static JTextField passport_ser;
    private static JLabel passer_label;
    private static JLabel passport_label;
    private static JTextField passport_num;
    private static JLabel pasnum_label;
    private static JTextField address;
    private static JLabel adr_label;
    private static JTextField phone;
    private static JLabel phone_label;
    private static JTextField email;
    private static JLabel email_label;
    private static JTextField name1;
    private static JLabel name1_label;
    private static JTextField name2;
    private static JLabel name2_label;
    private static JTextField name3;
    private static JLabel name3_label;
    private static JButton submit;

/* а тут начинается веселье */
    public static void main(/*String[] args*/) {

        /* кароч, просто перепиши это */
        JFrame frame = new JFrame();
        frame.setSize(320, 550);          //А вот тут можно настроить размер окна. Все в пикселях канешн
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);


        /* первая циферка - растояние от левого края, вторая - сверху, третья - ширина поля, четвертая - высота поля*/
        name1_label = new JLabel("First name");     //здесь можно передать привет маме
        name1_label.setBounds(10, 20, 100, 25);
        panel.add(name1_label);

        name1 = new JTextField(24);     //ну а тут подпортить жизь человеку по имени Баярсайханбадамсэрээжид
        name1.setBounds(110, 20, 200, 25);      //да, если что - это было настоящее имя
        panel.add(name1);
        /* сложно? а нефиг было математику в 5 классе прогуливать!11!!!!1!1 */



        name2_label = new JLabel("Last name");
        name2_label.setBounds(10, 60, 100, 25);
        panel.add(name2_label);

        name2 = new JTextField(24);
        name2.setBounds(110, 60, 200, 25);
        panel.add(name2);



        name3_label = new JLabel("Middle name");
        name3_label.setBounds(10, 100, 100, 25);
        panel.add(name3_label);

        name3 = new JTextField(24);
        name3.setBounds(110, 100, 200, 25);
        panel.add(name3);



        birthday_label = new JLabel("Birthday");
        birthday_label.setBounds(10, 140, 100, 25);
        panel.add(birthday_label);


        birth_day = new JTextField(2);
        birth_day.setBounds(110, 140, 25, 25);
        panel.add(birth_day);

        birth_day_label = new JLabel("dd");
        birth_day_label.setBounds(138, 140, 25, 25);
        panel.add(birth_day_label);


        birth_month = new JTextField(2);
        birth_month.setBounds(165, 140, 25, 25);
        panel.add(birth_month);

        birth_month_label = new JLabel("mm");
        birth_month_label.setBounds(193, 140, 25, 25);
        panel.add(birth_month_label);


        birth_year = new JTextField(4);
        birth_year.setBounds(225, 140, 50, 25);
        panel.add(birth_year);

        birth_year_label = new JLabel("yyyy");
        birth_year_label.setBounds(278, 140, 32, 25);
        panel.add(birth_year_label);


        passport_ser = new JTextField(4);
        passport_ser.setBounds(160, 180, 45, 25);
        panel.add(passport_ser);

        passport_label = new JLabel("Passport");
        passport_label.setBounds(10, 180, 100, 25);
        panel.add(passport_label);

        passer_label = new JLabel("Series");
        passer_label.setBounds(110, 180, 50, 25);
        panel.add(passer_label);


        /* Цой жив! */
        pasnum_label = new JLabel("№");
        pasnum_label.setBounds(225, 180, 15, 25);
        panel.add(pasnum_label);

        passport_num = new JTextField(6);
        passport_num.setBounds(245, 180, 65, 25);
        panel.add(passport_num);


        adr_label = new JLabel("Address");
        adr_label.setBounds(10, 220, 100, 25);
        panel.add(adr_label);

        address = new JTextField(256);
        address.setBounds(110, 220, 200, 25);
        panel.add(address);


        phone_label = new JLabel("Phone");
        phone_label.setBounds(10, 260, 100, 25);
        panel.add(phone_label); //тест на внимательность пройден!

        phone = new JTextField(16);
        phone.setBounds(110, 260, 200, 25);
        panel.add(phone);


        email_label = new JLabel("E-Mail");
        email_label.setBounds(10, 300, 100, 25);
        panel.add(email_label);

        email = new JTextField(64);
        email.setBounds(110, 300, 200, 25);
        panel.add(email);


        log_label = new JLabel("Login");
        log_label.setBounds(10, 340, 100, 25);
        panel.add(log_label);

        login = new JTextField(24);
        login.setBounds(110, 340, 200, 25);
        panel.add(login);


        /* пожалуйста, не выбирайте сложные пароли. На брут хакеры тратят много энергии и нервов:( Заботьтесь о них! */
        pass_label = new JLabel("Password");
        pass_label.setBounds(10, 380, 100, 25);
        panel.add(pass_label);

        password = new JPasswordField(32);
        password.setBounds(110, 380, 200, 25);
        panel.add(password);


        pass_conf_label = new JLabel("Confirm pass");   //Ctrl + C; Ctrl + V; Forgot password?
        pass_conf_label.setBounds(10, 420, 100, 25);
        panel.add(pass_conf_label);

        password_confirm = new JPasswordField(32);
        password_confirm.setBounds(110, 420, 200, 25);
        panel.add(password_confirm);


        /* ееее, мечта школьника - делаем собственную кнопку! */
        submit = new JButton("Submit");
        submit.setBounds(80, 460, 150, 25);
        submit.addActionListener(new GUIreg());     //прикинь, она теперь даже работает!
        panel.add(submit);


        frame.setVisible(true);     //о! и эту фигню тоже не забудь, иначе все по @ пойдет
    }

    public static String get_first_name() {
        return name1.getText();
    }
    public static String get_second_name() {
        return name2.getText();
    }
    public static String get_third_name() {
        return name3.getText();
    }
    public static String get_login() {
        return login.getText();
    }
    public static String get_password() {
        return password.getText();
    }
    public static String get_birth_day() {
        return birth_day.getText();
    }
    public static String get_birth_month() {
        return birth_month.getText();
    }
    public static String get_birth_year() {
        return birth_year.getText();
    }
    public static String get_address() {
        return address.getText();
    }
    public static String get_phone() {
        return phone.getText();
    }
    public static String get_email() {
        return email.getText();
    }

    /* эта фигня сама появится. Она типа важная. Типа сюда падают все личные данные сверху. Продавай сколько влезет! */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        /*System.out.println("This is example of how button works");
        System.out.println(name1.getText() + " " + name2.getText() + " " + name3.getText());   //не забудь getText() !
        System.out.println(password.getText()); */
    }


}
