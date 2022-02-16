import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class add extends JFrame {
    private JPanel add;
    private JTextField tf_col1;
    private JTextField tf_col2;
    private JTextField tf_col3;
    private JButton btn_redo;
    private JButton btn_ok;

    public add() {
        setTitle("Thêm vào cơ sở dữ liệu");
        setContentPane(add);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

        btn_ok.addActionListener(e -> {
            String col1 = tf_col1.getText();
            String col2 = tf_col2.getText();
            String col3 = tf_col3.getText();

            try {
                String dbURL = "jdbc:sqlserver://DESKTOP-2MODGPQ\\SQLEXPRESS:1433;databaseName=lmao;Username=sa;Password = 12345";
                Connection conn = DriverManager.getConnection(dbURL);
                CallableStatement stmt;
                String sql = "INSERT INTO asd VALUES (?,?,?)"; // new
                stmt = conn.prepareCall(sql);
                stmt.setString(1, col1);
                stmt.setString(2, col2);
                stmt.setString(3, col3);
                stmt.executeUpdate();
                ClassNameHere.infoBox("Thêm thành công", "Thông báo");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        btn_redo.addActionListener(e -> {
            tf_col1.setText("");
            tf_col2.setText("");
            tf_col3.setText("");
        });
    }
}
