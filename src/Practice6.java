import javax.swing.*;
import java.awt.*;
public class Practice6 extends JFrame{
	public Practice6() {
		setTitle("20195101_강나은"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); 
		c.add(new JButton("버튼"));
		
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\kne02\\Desktop\\cherry.jpg");
		ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\kne02\\Desktop\\cherry2.jpg");

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", imageIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(imageIcon2);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		JRadioButton apple2 = new JRadioButton("사과");
		JRadioButton pear2 = new JRadioButton("배", true);
		JRadioButton cherry2 = new JRadioButton("체리", imageIcon);
		cherry2.setBorderPainted(true);
		cherry2.setSelectedIcon(imageIcon2);
		ButtonGroup group = new ButtonGroup();
		group.add(apple2);
		group.add(pear2);
		group.add(cherry2);
		
		c.add(apple2);
		c.add(pear2);
		c.add(cherry2);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		
		c.add(slider);
		
		c.add(new JLabel("이름: "));
		c.add(new JTextField(10));
		c.add(new JLabel("학과: "));
		c.add(new JTextField("의료it공학과",10));
		c.add(new JLabel("주소: "));
		c.add( new JTextField("서울시...",20));
		
		JLabel text = new JLabel("Enter the password:");
		JPasswordField password = new JPasswordField(10);
	
		c.add(text);
		c.add(password);
		
		String[] name = {"January", "February", "March", "April",
				"May", "June", "July", "August",
				"September", "October", "November", "December"};
		JSpinner spinner;
		SpinnerListModel listModel = new SpinnerListModel(name);
		spinner = new JSpinner(listModel);
		spinner.setPreferredSize(new Dimension(100,20));


		c.add(new JLabel("Month: "));
		c.add(spinner);
		
		c.add(new JTextArea("hello", 7, 20));
		
		
		String[] fruit = {"apple", "banana", "kiwi", "mango", "pear",
				"peach", "berry", "strawberry", "blackberry"};
		String [] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
		JComboBox<String> strCombo = new JComboBox<String>(fruit); 
		JComboBox<String> nameCombo = new JComboBox<String>();
		for(int i=0; i<names.length; i++)
			nameCombo.addItem(names[i]);
		
		c.add(strCombo);
		c.add(nameCombo);
		
		ImageIcon [] images = { 
				new ImageIcon("C:\\Users\\kne02\\Desktop\\images\\icon1.png"),
				new ImageIcon("C:\\Users\\kne02\\Desktop\\images\\icon2.png"),
				new ImageIcon("C:\\Users\\kne02\\Desktop\\images\\icon3.png"),
				new ImageIcon("C:\\Users\\kne02\\Desktop\\images\\icon4.png") };
		JList<String> strList = new JList<String>(fruit); 
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		JList<String> scrollList = new JList<String>(fruit); 
		c.add(strList);
		c.add(imageList);
		c.add(new JScrollPane(scrollList));
		
		
		
		setSize(300, 200); 
		setVisible(true);
	}
	public static void main(String[] args) {
		new Practice6();
	}
}
