package ������;

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
		JMenu menu1=new JMenu("����");
	    menubar1.add(menu1);
	    item1=new JMenuItem("����");	     
	    item2=new JMenuItem("����");
	    item3=new JMenuItem("����");
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
				{	String cmd="rundll32 url.dll FileProtocolHandler file://F:\\TranslationskillsinclassicalChinese\\Toupdate.jar ";//������Ӧ��windows���������ļ�
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
      this .setTitle("�����ķ��뼼��");
      this.setSize(410,350);
      this.setVisible(true);
      this.setResizable(false);
      this.setLocation(650,250);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   t1=new Label("�����ķ��뷽��");
   t1.setBounds(150,10,400,20);add(t1);
   Tell= new Label("�����ķ��뷽��������ɾ���������������䡣");
   Tell.setBounds(10, 40, 400, 20);add(Tell);
   Thll=new Label("1.�����������Ǳ��������ǹŽ�������ͬ�Ĵʣ��Լ��Ŵ���������������");
   Thll.setBounds(10,60,400,20);add(Thll);
   t3=new Label("���������������š���š������ⵥλ�ȣ�����ʱ�ɱ������䡣");
   t3.setBounds(10, 78, 400, 20);add(t3);
   t4=new Label("2.��ɾ��������ɾ����ɾ�����������������ʡ�(�������ʲ��롣)");
   t4.setBounds(10, 100, 400, 20);add(t4);
   t5=new Label("3.��������������������1���䵥����Ϊ˫���ʣ���2������ʡ�Ծ��е�ʡ");
   t5.setBounds(10, 120, 400, 20);add(t5);
   t6=new Label("�Գɷ֣���3������ʡ���˵���䡣ע�⣺����ʡ�Եĳɷֻ���䣬Ҫ��");
   t6.setBounds(10, 140, 400, 20);add(t6);
   t7=new Label("���š�");
   t7.setBounds(10, 159, 400, 20);add(t7);
   t8=new Label("4.�������������滻�����ִ��ʻ��滻�Ŵ��ʻ㡣");
   t8.setBounds(10, 178, 400, 20);add(t8);
   t9=new Label("5.���������ǵ������ѹź��ﵹװ�����Ϊ�ִ������ʽ����ν��װ�䡢");
   t9.setBounds(10, 197, 400, 20);add(t9);
   t10=new Label("ǰ�þ䡢������þ䡢������þ�ȷ���ʱһ��Ӧ��������");
   t10.setBounds(10, 215, 400, 20);add(t10);
   t11=new Label("6.���䡱�����Ǳ�ͨ������ʵ��ԭ�ĵĻ����ϣ������й����֡�");
   t11.setBounds(10, 235, 400, 20);add(t11);
   t12 = new Label("By--QHnan &2017    ��Ȩ����");
   t12.setBounds(240, 280, 500, 20);add(this.t12);
   tgll=new Label("");add(tgll);
   frame.pack();//�����������������е����
    }


	public static  void addIFame(About about) { // ����Ӵ���ķ���
			DESKTOP_PANE.add(DESKTOP_PANE);
		}
	 public static void addIFame(Help help) { // ����Ӵ���ķ���
			DESKTOP_PANE2.add(help);
		}
   public static void main(String[] args){
		new TranslationskillsinclassicalChinese();
	}
}








