import java.awt.*;
import java.io.*;
import javax.swing.*;

class ImageTest {
    public static void main(String[] args) {
        Toolkit imgtool = Toolkit.getDefaultToolkit();
        Image myimg = imgtool.getImage(args[0]); //������������ͼƬ�ļ���
        displayImage(myimg);
    }
    public static void displayImage(Image img){
        JFrame frame = new JFrame("ͼƬ��ʾ");
        ImageIcon imgicon = new ImageIcon(img);
        frame.setSize(imgicon.getIconWidth(),imgicon.getIconHeight());
        JLabel label = new JLabel();
        label.setIcon(imgicon);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
