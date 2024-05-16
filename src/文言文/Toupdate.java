package 文言文;

import java.awt.event.*; 

import javax.swing.*; 

import java.awt.*; 
 
@SuppressWarnings("serial")
public class Toupdate extends JLabel {
private String text, url;
private boolean isSupported;
public Toupdate(String text, String url) {
     this.text = text;
     this.url = url;
     try {
      this.isSupported = Desktop.isDesktopSupported()
        && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE);
     } catch (Exception e) {
      this.isSupported = false;
     }
     setText(false);
     addMouseListener(new MouseAdapter() {
      public void mouseEntered(MouseEvent e) {
       setText(isSupported);
       if (isSupported)
        setCursor(new Cursor(Cursor.HAND_CURSOR));
      }
      public void mouseExited(MouseEvent e) {
       setText(false);
      }
      public void mouseClicked(MouseEvent e) {
       try {
        Desktop.getDesktop().browse(
          new java.net.URI(Toupdate.this.url));
       } catch (Exception ex) {
       }
      }
     });
}

public Toupdate() {
	// TODO 自动生成的构造函数存根
}

private void setText(boolean b) {
     if (!b)
      setText("<html><font color=blue><u>" + text);
     else
      setText("<html><font color=red><u>" + text);
}
public static void main(String[] args) {
     JFrame jf = new JFrame("获取更新");
     JPanel jp = new JPanel();
     jp.add(new Toupdate("By-QHnan&版权所有    点击下载", "https://pan.baidu.com/share/home?uk=2690678049&suk=5DsO3xT4hSW9hR7jzAhx7Q#category/type=0"));
     jp.setBounds(10,80,400,20);
     jf.setContentPane(jp);
     jf.setLocation(750,250);
	 jf.setSize(200,100);  
	 jf.setResizable(false);
     jf.setVisible(true);
}
}

