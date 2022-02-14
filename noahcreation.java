import java.awt.*;
import javax.swing.*;
 class noahcreation {
     public static void main(String[] args) {
         final int width = 800;
         final int height = 800;
         JFrame frame = new JFrame("Chat");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(width, height);

             JMenuBar menuBar = new JMenuBar();
             JMenu menu1 = new JMenu("File");
             JMenu menu2 = new JMenu("Help");
             menuBar.add(menu1);
             menuBar.add(menu2);

         JMenuItem m1 = new JMenuItem("Open");
         JMenuItem m2 = new JMenuItem("Save As");
         menu1.add(m1);
         menu1.add(m2);

         JPanel panel = new JPanel();
         JLabel label = new JLabel("Enter");
         JTextField textField = new JTextField(10);
         JButton send = new JButton ("Send");
         JButton reset = new JButton("Reset");
         panel.add(label);
         panel.add(textField);
         panel.add(send);
         panel.add(reset);

         JTextArea textarea = new JTextArea();

         frame.getContentPane().add(BorderLayout.SOUTH, panel);
         frame.getContentPane().add(BorderLayout.NORTH, menuBar);
         frame.getContentPane().add(BorderLayout.CENTER, textarea);
         frame.setVisible(true);


     }


}
