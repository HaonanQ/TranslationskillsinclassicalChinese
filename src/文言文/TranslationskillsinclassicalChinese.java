package 文言文;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu; 
@SuppressWarnings("serial")
public class TranslationskillsinclassicalChinese  extends JFrame{
private Label Tell,Thll,tgll,t3,t1,t4,t5,t6,t7,t8,t9,t10,t11,t12;
@SuppressWarnings("unused")
private JPanel panel;
private JFrame frame;
JMenuBar menubar = new JMenuBar();
private static final JDesktopPane DESKTOP_PANE = new JDesktopPane();
private static final JDesktopPane DESKTOP_PANE2 = new JDesktopPane();
JPanel contentPane;
static final int WIDTH=600;
static final int HEIGHT=300;
JPopupMenu pop;
JMenuItem item1;
JMenuItem item2;
JMenuItem item3;
	public   TranslationskillsinclassicalChinese()
    {   
	//TOOD
		
		JMenuBar menubar1 = new JMenuBar();
		setJMenuBar(menubar1);
		JMenu menu1=new JMenu("关于");
	    menubar1.add(menu1);
	    item1=new JMenuItem("关于");	     
	    item2=new JMenuItem("帮助");
	    item3=new JMenuItem("更新");
	    menu1.add(item1);
	    menu1.addSeparator();
	    menu1.add(item2);
	    menu1.addSeparator();
	    menu1.add(item3);
	    item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	addIFame(new About());
            }
        });
	    item3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e)
			{	try
				{	String cmd="rundll32 url.dll FileProtocolHandler file://F:\\TranslationskillsinclassicalChinese\\Toupdate.jar ";//启动相应的windows程序来打开文件
					@SuppressWarnings("unused")
					Process p = Runtime.getRuntime().exec(cmd);
				}
				catch (Exception e1)
				{	System.out.println(e1);
				}
			}
		});
	    item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addIFame(new Help());
            }
        }); 
      this .setTitle("文言文翻译技巧");
      this.setSize(410,350);
      this.setVisible(true);
      this.setResizable(false);
      this.setLocation(650,250);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   t1=new Label("文言文翻译方法");
   t1.setBounds(150,10,400,20);add(t1);
   Tell= new Label("文言文翻译方法：留、删、补、换、调、变。");
   Tell.setBounds(10, 40, 400, 20);add(Tell);
   Thll=new Label("1.“留”，就是保留。凡是古今意义相同的词，以及古代的人名、地名、");
   Thll.setBounds(10,60,400,20);add(Thll);
   t3=new Label("物名、官名、国号、年号、度量衡单位等，翻译时可保留不变。");
   t3.setBounds(10, 78, 400, 20);add(t3);
   t4=new Label("2.“删”，就是删除。删掉无须译出的文言虚词。(语气助词不译。)");
   t4.setBounds(10, 100, 400, 20);add(t4);
   t5=new Label("3.“补”，就是增补。（1）变单音词为双音词；（2）补出省略句中的省");
   t5.setBounds(10, 120, 400, 20);add(t5);
   t6=new Label("略成分；（3）补出省略了的语句。注意：补出省略的成分或语句，要加");
   t6.setBounds(10, 140, 400, 20);add(t6);
   t7=new Label("括号。");
   t7.setBounds(10, 159, 400, 20);add(t7);
   t8=new Label("4.“换”，就是替换。用现代词汇替换古代词汇。");
   t8.setBounds(10, 178, 400, 20);add(t8);
   t9=new Label("5.“调”就是调整。把古汉语倒装句调整为现代汉语句式。主谓倒装句、");
   t9.setBounds(10, 197, 400, 20);add(t9);
   t10=new Label("前置句、介宾后置句、定语后置句等翻译时一般应调整语序。");
   t10.setBounds(10, 215, 400, 20);add(t10);
   t11=new Label("6.“变”，就是变通。在忠实于原文的基础上，活译有关文字。");
   t11.setBounds(10, 235, 400, 20);add(t11);
   t12 = new Label("By--QHnan &2017    版权所有");
   t12.setBounds(240, 280, 500, 20);add(this.t12);
   tgll=new Label("");add(tgll);
   frame.pack();//调整窗口以容纳所有的组件
    }


	public static  void addIFame(About about) { // 添加子窗体的方法
			DESKTOP_PANE.add(DESKTOP_PANE);
		}
	 public static void addIFame(Help help) { // 添加子窗体的方法
			DESKTOP_PANE2.add(help);
		}
   public static void main(String[] args){
		new TranslationskillsinclassicalChinese();
	}
}








