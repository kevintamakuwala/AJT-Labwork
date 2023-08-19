import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class App extends Frame implements ActionListener {

    static Label l1 = new Label("ID");
    static TextField text1 = new TextField(10);
    static TextArea TextArea1 = new TextArea(10, 30);
    static Button b1 = new Button("Click ME");

    App() {
        super("Form Details");
        setSize(280, 280);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l1);
        add(text1);
        add(b1);
        add(TextArea1);
        b1.addActionListener(this);
        
        addWindowListener(new WindowAdapter(){
            public void  windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
    }

    public void actionPerformed(ActionEvent e) {
        try {
            //        TextArea1.setText("HII Sec");
            ConnectionProvider();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static  void ConnectionProvider() throws Exception{
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            System.out.println("Connection Eastablished");
        
            int CustomerId = Integer.parseInt(text1.getText().toString());
            System.out.println(CustomerId);
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select * from CUSTOMER where CUSTOMER_ID="+CustomerId);
            
            while(rs.next()) {
                TextArea1.setText("Name: "+rs.getString("NAME")+"\nCity: "+
		rs.getString("CITY")+"\nEmail: "+rs.getString("EMAIL")+"\nCredit_Limit: "+rs.getInt("CREDIT_LIMIT"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class Form {

    public static void main(String[] args) {
        new App();
    }

}
