package com.javaprograms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Form ");
        JPanel panel = new JPanel();
        JLabel l1 = new JLabel("Registration Form ");
        JLabel name = new JLabel("Name ");
        JTextField nameinput = new JTextField();
        JLabel age = new JLabel("Age ");
        JTextField ageinput = new JTextField();
        JLabel number = new JLabel("Mobile ");
        JTextField mob = new JTextField();
        JLabel email = new JLabel("Email-ID ");
        JTextField emailid = new JTextField();
        JLabel gender = new JLabel("Gender");
        JCheckBox male = new JCheckBox("Male");
        JCheckBox female = new JCheckBox("Female");
        JCheckBox other = new JCheckBox("Other");
        JCheckBox accept = new JCheckBox("I accept all the terms and conditons.");
        JButton submit = new JButton("Submit");

        frame.setSize(300,530);
        frame.add(panel);
        panel.setLayout(null);
        submit.setBounds(100,430,80,40);
        accept.setBounds(20,380,250,30);
        other.setBounds(70,335,70,40);
        female.setBounds(70,300,70,40);
        male.setBounds(70,265,60,40);
        gender.setBounds(20,250,50,70);
        emailid.setBounds(70,235,160,20);
        email.setBounds(20,210,50,70);
        mob.setBounds(70,197,160,20);
        number.setBounds(20,170,50,70);
        ageinput.setBounds(70,155,160,20);
        age.setBounds(20,130,50,70);
        nameinput.setBounds(70,115,160,20);
        name.setBounds(20,90,50,70);
        l1.setBounds(85,5,150,100);

        panel.add(male);
        panel.add(submit);
        panel.add(accept);
        panel.add(female);
        panel.add(other);
        panel.add(number);
        panel.add(gender);
        panel.add(email);
        panel.add(emailid);
        panel.add(l1);
        panel.add(mob);
        panel.add(age);
        panel.add(ageinput);
        panel.add(nameinput);
        panel.add(name);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
