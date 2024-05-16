package 文言文;
import java.awt.Label;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Help extends JFrame {
  private Label name;
  private Label who;
  private Label www;
  private Label wx;
  private Label wc;
  private JFrame frame;
  
  public Help()
  {
	  setTitle("帮助");
	    setLocation(750, 250);
	    setSize(250, 150);
	    setResizable(false);
	    setVisible(true);
	    name = new Label("文言文翻译技巧");
	    name.setBounds(75, 15, 400, 20);add(this.name);
	    www = new Label("此软件后续会提供字词翻译，更新中.........");
	    www.setBounds(10, 50, 400, 20);add(this.www);
	    wx = new Label("敬请期待新版本！");
	    wx.setBounds(10, 70, 500, 20);add(this.wx);
	    wc = new Label("By--QHnan&2017    版权所有");
	    wc.setBounds(85, 105, 500, 20);add(this.wc);
	    who = new Label("");
	    who.setBounds(60, 100, 400, 20);add(this.who);
	    
    this.frame.pack();
  }
  
  public static void main(String[] arg)
  {
    new Help();
  }
}
