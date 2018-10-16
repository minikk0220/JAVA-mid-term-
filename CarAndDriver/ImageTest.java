import java.awt.*;
import java.io.*;
import javax.swing.*;

class ImageTest {
    public static void main(String[] args) {
        Toolkit imgtool = Toolkit.getDefaultToolkit();
        Image myimg = imgtool.getImage(args[0]); //命令行中输入图片文件名
        displayImage(myimg);
    }
    public static void displayImage(Image img){
        JFrame frame = new JFrame("图片显示");
        ImageIcon imgicon = new ImageIcon(img);
        frame.setSize(imgicon.getIconWidth(),imgicon.getIconHeight());
        JLabel label = new JLabel();
        label.setIcon(imgicon);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
