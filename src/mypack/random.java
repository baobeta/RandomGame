package mypack;

import sun.awt.im.InputMethodJFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.*;
import java.util.List;

public class random {
    private static Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7,8,9 };
    private static Component panel;
    public Random random =new Random();
    public JFrame frame = new JFrame();
    public JPanel title_panel = new JPanel();
    public JPanel button_panel = new JPanel();
    public JPanel random_panel = new JPanel();
    public JButton btn = new JButton();
    public JButton[] buttons = new JButton[9];


    public random() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        btn.setText("Random");
        btn.setSize(800,200);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button_panel.removeAll();
                xaotron();
                KhoiTao();
                check(buttons);


            }
        });

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);



        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150,150,150));

        random_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);
        xaotron();

        KhoiTao();




        title_panel.add(btn);

        frame.add(button_panel);
        frame.add(title_panel,BorderLayout.NORTH);
        check(buttons);





    }
    public  void KhoiTao()
    {

        for(int i =0;i<9;i++)
        {
            buttons[i]= new JButton();
            buttons[i].setBackground(new Color(255,255,255));
            buttons[i].setText(String.valueOf(intArray[i]));
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);

        }
    }
    public static void xaotron() {
        List<Integer> intList = Arrays.asList(intArray);

        Collections.shuffle(intList);

        intList.toArray(intArray);



    }
    public static void check(JButton[] buttons){
        int x=Integer.parseInt (buttons[0].getText()) +Integer.parseInt (buttons[4].getText())+Integer.parseInt (buttons[8].getText());
        int y=Integer.parseInt (buttons[2].getText()) +Integer.parseInt (buttons[4].getText())+Integer.parseInt (buttons[6].getText());
        int z=Integer.parseInt (buttons[1].getText()) +Integer.parseInt (buttons[4].getText())+Integer.parseInt (buttons[7].getText());
        int t=Integer.parseInt (buttons[3].getText()) +Integer.parseInt (buttons[4].getText())+Integer.parseInt (buttons[5].getText());
        if(x==y && y== z && z==t){
            JOptionPane.showMessageDialog(panel, "chuc mung ban", "About",
                    JOptionPane.INFORMATION_MESSAGE);
        }
//        else
//        {
//            JOptionPane.showMessageDialog(panel, "chuc ban may man lan sau", "About",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }

    }



    public static void main(String[] args){
        new random();
    }//ket thuc main


}
