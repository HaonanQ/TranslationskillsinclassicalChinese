package 文言文;

import java.awt.Label;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class About extends JFrame {
  private Label name;
  private Label who;
  private Label www;
  private Label wx;
  private Label wc,wv;
  private JFrame frame;
  
  public About()
  {
	  setTitle("关于");
	    setLocation(750, 250);
	    setSize(250, 150);
	    setResizable(false);
	    setVisible(true);
	    name = new Label("作者: By-QHnan");
	    name.setBounds(75, 15, 400, 20);add(this.name);
	    www = new Label("我的主页: https://pan.baidu.com/share/ho");
	    www.setBounds(10, 45, 400, 20);add(this.www);
	    wx = new Label("me?uk=2690678049&suk=5DsO3xT4hS");
	    wx.setBounds(10, 64, 500, 20);add(this.wx);
	    wc = new Label("W9hR7jzAhx7Q#category/type=0");
	    wc.setBounds(10, 82, 500, 20);add(this.wc);
	    wv = new Label("By--QHnan&2017    版权所有");
	    wv.setBounds(85, 105, 500, 20);add(this.wv);
	    who = new Label("");
	    who.setBounds(60, 100, 400, 20);add(this.who);
	    
    this.frame.pack();
  }
  
  public static void main(String[] arg)
  {
    new About();
  }
}
