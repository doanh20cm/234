import javax.swing.*;

public class general extends JFrame {
    private JPanel chinh;
    private JButton btn_add;
    private JButton btn_default;
    private JButton btn_query;
    private JButton btn_delete;
    private JButton btn_show;
    private JButton btn_calc;

    public general() {
        setContentPane(chinh);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);
        setTitle("Quản lý bảng công tác");
        btn_add.addActionListener(e -> new add());
        btn_default.addActionListener(e -> {
//                new default_();
        });
        btn_query.addActionListener(e -> {
//                new query();
        });
        btn_delete.addActionListener(e -> {
//                new delete();
        });
        btn_show.addActionListener(e -> {
//                new show();
        });
        btn_calc.addActionListener(e -> {
//                new calc();
        });
    }

    public static void main(String[] args) {
        new general();
    }
}
