
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form implements ActionListener {


  ImageIcon img;
  JLabel bg;
 String User,Pass,Email,City,Country,Gender;
 String Phone;
  JButton Register,Clear;
  JTextField text,text2,text4,text5;
  JLabel label,label1,label2,label3,label4,label5,label6,label7,UserA,PassA,EmailA,CountryA,PhoneA,PhoneM,EmailM,RegL,TermsA;
  JLabel UserF,PassF,EmailF,CountryF,CityF,PhoneF,GenderF,FormF;
  JRadioButton r,r1;
  JComboBox combo;
 JFrame frame,frame1;
 JCheckBox checkBox;
 JPasswordField text1;
 public Form()
 {
    
    try{

    
img = new ImageIcon("bg.jpg");
  Image img2 =  img.getImage();
  Image img3 = img2.getScaledInstance(600, 800, Image.SCALE_SMOOTH);
  img = new ImageIcon(img3);

bg = new JLabel("",img,JLabel.CENTER);
bg.setBounds(0, 0, 600, 800);

  combo = new JComboBox();
  frame = new JFrame();


  frame.setSize(600,800);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setResizable(false);
  frame.setLocationRelativeTo(null);
  frame.setLayout(null);



  RegL = new JLabel("Registration Form");
  RegL.setFont (RegL.getFont ().deriveFont (30.0f));
  RegL.setBounds(160,10,300,50);

  label = new JLabel("User Name: ");
  label.setBounds(80,200,200,30);
  label.setFont (label.getFont ().deriveFont (16.0f));
  text = new JTextField();
  text.setBounds(220,200,250,30);
  UserA = new JLabel();
  UserA.setBounds(220,223,200,30);


  label1 = new JLabel("Password: ");
  label1.setBounds(80,250,200,30);
  label1.setFont (label1.getFont ().deriveFont (16.0f));
  text1 = new JPasswordField();
  text1.setBounds(220,250,250,30);
  PassA = new JLabel();
  PassA.setBounds(220,273,200,30);


  label2 = new JLabel("Email: ");
  label2.setBounds(80,300,200,30);
  label2.setFont (label2.getFont ().deriveFont (16.0f));
  text2 = new JTextField();
  text2.setBounds(220,300,250,30);
  EmailA = new JLabel();
  EmailA.setBounds(220,323,200,30);
  EmailM = new JLabel();
  EmailM.setBounds(220,323,200,30);


  label3 = new JLabel("Gender: ");
  label3.setBounds(80,348,200,30);
  label3.setFont (label3.getFont ().deriveFont (16.0f));


  r = new JRadioButton("Male");
  r.setBounds(220,355,70,20);
  r.setFocusable(false);
  r.setFont (r.getFont ().deriveFont (13.0f));
  r.setOpaque(false);


  r1 = new JRadioButton("Female");
  r1.setBounds(300,355,70,20);
  r1.setFocusable(false);
  r1.setFont (r1.getFont ().deriveFont (13.0f));
  r1.setOpaque(false);

  ButtonGroup gp = new ButtonGroup();
  gp.add(r);
  gp.add(r1);


  label4 = new JLabel(" City: ");
  label4.setBounds(75,400,200,30);
  label4.setFont (label4.getFont ().deriveFont (16.0f));
  String[] cities = { "Hyderabad", "Karachi", "Sukker", "Larkana", "Thatta", "Lahore", "Islamabad", "Abbottabad",};
  combo = new JComboBox(cities);
  combo.setBounds(220,400,250,30);


  label5 = new JLabel("Country: ");
  label5.setBounds(80,450,200,30);
  label5.setFont (label5.getFont ().deriveFont (16.0f));
  text4 = new JTextField();
  text4.setBounds(220,450,250,30);
  CountryA = new JLabel();
  CountryA.setBounds(220,473,200,30);


  label6 = new JLabel("Phone:");
  label6.setBounds(80,500,200,30);
  label6.setFont (label6.getFont ().deriveFont (16.0f));
  text5 = new JTextField();
  text5.setBounds(220,500,250,30);
  PhoneA = new JLabel();
  PhoneA.setBounds(220,523,200,30);
  PhoneM = new JLabel();
  PhoneM.setBounds(220,523,200,30);


  checkBox = new JCheckBox("Accept terms and conditions");
  checkBox.setBounds(214,550,250,30);
  checkBox.setFont (checkBox.getFont ().deriveFont (13.0f));
  checkBox.setOpaque (false);
  TermsA = new JLabel();
  TermsA.setBounds(220,573,200,30);

  Register = new JButton("Register");
  Register.setBounds(130,640,100,40);
  Register.setFocusable(false);
  Register.setFont (Register.getFont ().deriveFont (16.0f));


  Clear = new JButton("Clear");
  Clear.setBounds(320,640,100,40);
  Clear.setFocusable(false);
  Clear.setFont (Clear.getFont ().deriveFont (16.0f));


  label7 = new JLabel("");
  label7.setBounds(75,470,200,30);
  Register.addActionListener(this);
  Clear.addActionListener(this);


  frame.add(RegL);frame.add(TermsA);
  frame.add(label);frame.add(text);
  frame.add(label1);frame.add(text1);
  frame.add(label2);frame.add(text2);
  frame.add(label3);frame.add(label4);
  frame.add(r);frame.add(r1);
  frame.add(text4);frame.add(combo);
  frame.add(label5);frame.add(Register);
  frame.add(Clear);frame.add(text5);
  frame.add(label6);frame.add(checkBox);
  frame.add(label7);frame.add(UserA);
  frame.add(PassA);frame.add(EmailA);
  frame.add(CountryA);frame.add(PhoneA);
  frame.add(PhoneM);frame.add(EmailM);
  frame.add(bg);


  frame.setVisible(true);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
 }

public static void main(String[] args) {
    
   Form F;

   F = new Form();

}

 @Override
 public void actionPerformed(ActionEvent e) {

  if(checkBox.isSelected()){

   TermsA.setText("");

   User = text.getText();
   Pass = text1.getText();
   Email = text2.getText();
   City = combo.getSelectedItem().toString();
   Country = text4.getText();
   Phone = text5.getText();
   Gender = "Male";
   if (r1.isSelected()) {
    Gender = "Female";
   }

   if(User.isEmpty()) {
    UserA.setText("Enter Username!");
    UserA.setForeground(Color.RED);
   }
   else{
    UserA.setText("");
   }
   if (Pass.isEmpty()) {
    PassA.setText("Enter Password!");
    PassA.setForeground(Color.RED);
   }
   else{
    PassA.setText("");
   }
   if (!Email.isEmpty()) {
    EmailA.setText("");
    if (!Email.contains("@"))
    {
   EmailM.setText("Email must contains '@' ");
   EmailM.setForeground(Color.RED);
    }
  else
  {
      EmailM.setText("");
  }
   }
   else{
    EmailA.setText("Enter Email!");
    EmailA.setForeground(Color.RED);
    EmailM.setText("");
   }
   if (Country.isEmpty()) {
    CountryA.setText("Enter Country!");
    CountryA.setForeground(Color.RED);
   }
   else
   {
    CountryA.setText("");
   }
   if (!Phone.isEmpty())
   {
    PhoneA.setText("");
    if(!Phone.matches("[0-9]+"))
    {
     PhoneM.setText("Enter digits only!");
     PhoneM.setForeground(Color.RED);
    }
    else
    {
        PhoneM.setText("");
    }
    }
   else
   {
    PhoneA.setText("Enter Phone Number");
    PhoneA.setForeground(Color.RED);
    PhoneM.setText("");
   }
  }
  else if (e.getSource()==Clear)
  {
   text.setText("");
   text1.setText("");
   text2.setText("");
   text4.setText("");
   text5.setText("");
  }
  else {
   TermsA.setText("Accept Terms and conditions!");
    TermsA.setForeground(Color.RED);

  }
  if(User.isEmpty() || !Email.contains("@")||Pass.isEmpty()||City.isEmpty()||Country.isEmpty()||Phone.isEmpty()){}
  else {
   frame1 = new JFrame();
   frame1.setSize(400, 350);
   frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame1.setResizable(false);
   frame1.setLocationRelativeTo(null);
   frame1.setLayout(null);
   frame1.setVisible(true);

   FormF = new JLabel("Details");
   FormF .setBounds(150, 1,200,80);
   FormF.setFont (label.getFont ().deriveFont (28.0f));
   FormF.setForeground(Color.DARK_GRAY);
   frame1.add(FormF);

   UserF = new JLabel();
   UserF.setText("Name: "+User);
   UserF.setBounds(20,50,200,30);
   frame1.add(UserF);
   PassF = new JLabel();
   PassF.setText("Password: "+Pass);
   PassF.setBounds(20,80,200,30);
   frame1.add(PassF);

   EmailF = new JLabel();
   EmailF.setText("Email: "+Email);
   EmailF.setBounds(20,110,200,30);
   frame1.add(EmailF);

   GenderF = new JLabel();
   GenderF.setText("Gender: "+Gender);
   GenderF.setBounds(20,140,200,30);
   frame1.add(GenderF);

   CityF = new JLabel();
   CityF.setText("City: "+City);
   CityF.setBounds(20,170,200,30);
   frame1.add(CityF);

   CountryF = new JLabel();
   CountryF.setText("Country: "+Country);
   CountryF.setBounds(20,200,200,30);
   frame1.add(CountryF);

   PhoneF = new JLabel();
   PhoneF.setText("Phone: "+Phone);
   PhoneF.setBounds(20,230,200,30);
   frame1.add(PhoneF);
  }
 }
}