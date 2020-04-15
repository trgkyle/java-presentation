/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jtable_Lab;

/**
 *
 * @author quang
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quang
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author quang
 */
public class JtableVectorInit extends JFrame {

    private JTable jtable = new JTable();
    private DefaultTableModel tableModel = new DefaultTableModel();

    public JtableVectorInit(int n) {
        Vector<String> columnNames = new Vector<String>();

        columnNames.add("Ma sv");
        columnNames.add("Ho va ten");
        columnNames.add("Gioi tinh");
        columnNames.add("Dai So");
        columnNames.add("Kinh Te");
        columnNames.add("Triet Hoc");
        tableModel.setColumnIdentifiers(columnNames);  // đặt tiêu đề cột cho tableModel

        Vector<Student> t = new Vector<Student>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            Student a = new Student();
            a.Nhap();
            t.add(a);
        }

        for (int i = 0; i < t.size(); i++) {
            String maSv = t.get(i).getMaSv();
            String hoTen = t.get(i).getHoten();
            String gioiTinh = t.get(i).getGioiTinh();
            int daiSo = t.get(i).getDaiSo();
            int kinhTe = t.get(i).getKinhTe();
            int trietHoc = t.get(i).getTrietHoc();
            Vector row = new Vector();
            row.add(maSv);
            row.add(hoTen);
            row.add(gioiTinh);
            row.add(daiSo);
            row.add(kinhTe);
            row.add(trietHoc);
            tableModel.addRow(row);
        }

//        tableModel.insertRow(0, rows1);
//        tableModel.removeRow(0);
//        tableModel.getValueAt(0, 0);
//        tableModel.setValueAt("My name", 0, 1);
        jtable.setModel(tableModel);    // kết nối jtable với tableModel 
        initComponent();    // Khởi tạo các components trên JFrame
    }

    public void initComponent() {
        this.setTitle("Title Jtable");
        this.setSize(600, 200);
        // Đưa jtable vào trong thanh cuộn (khi dữ liệu quá nhiều dòng sẽ có thanh cuộn ngang và doc để xem dữ liệu)
        JScrollPane scroll = JTable.createScrollPaneForTable(jtable);
        this.add(scroll); // Đưa thanh cuộn vào Frame (hiện thanh cuộn trên frame)
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.jtable.getColumnModel().getColumn(0).setPreferredWidth(100);
        this.jtable.getColumnModel().getColumn(1).setPreferredWidth(280);
        this.setVisible(false);
    }

//  Action 
    public void sortAction() {
        System.out.println("Sort by Ma sinh vien ");
        int rowlength = this.jtable.getRowCount();
//        System.out.println(this.tableModel.getValueAt(0, 0)); return object
//        System.out.println("Test row length" + rowlength);
        for (int i = 0; i < rowlength; i++) {
            for (int e = 0; e < i; e++) {
                int value = Integer.parseInt(this.jtable.getValueAt(e, 0).toString());
                int value2 = Integer.parseInt(this.jtable.getValueAt(i, 0).toString());
                if (value > value2) {
                    this.tableModel.moveRow(e, e, e + 1);
                }
            }
        }
//        this.tableModel.fireTableChanged();
        this.jtable.repaint();
    }

    public void addAction(Vector newItem) {
        this.tableModel.addRow(newItem);
//         this.tableModel.fireTableStructureChanged();
        this.jtable.repaint();
    }

    public void addAction(Vector newItem, int position) {
        if ((position < 1) || (position > this.jtable.getRowCount())) {
            System.out.println("Vi tri chen khong hop le");
            return;
        }
        this.tableModel.insertRow(position - 1, newItem);
        this.jtable.repaint();
    }

    public void deleteAction(int position) {
        // check condition first
        if ((position < 1) || (position > this.jtable.getRowCount())) {
            System.out.println("Vi tri xoa khong hop le");
            return;
        }
        this.tableModel.removeRow(position - 1);
    }

    public void updateAction() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Khoi tao Table");
        System.out.println("Nhap so sinh vien khoi tao");
        JtableVectorInit jtable = new JtableVectorInit(sc.nextInt());
        while (true) {
            System.out.println("============================MENU========================");
            System.out.println("Moi nhap lua chon :");
            System.out.println("1. Hien thi Table Sinh Vien");
            System.out.println("2. Sap xep sinh vien");
            System.out.println("3. Them sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Dong cua so table");
            System.out.println("6. Thoat chuong trinh");
            System.out.println("========================================================");
            try {
                int input = sc.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Hien thi Table");
                        jtable.setVisible(true);
                        break;
                    case 2:
                        System.out.println("Sap xep Sinh vien");
                        jtable.sortAction();
                        break;
                    case 3:
                        System.out.println("Them sinh vien");
                        Vector newItem = new Vector();
                        Student sv = new Student();
                        sv.Nhap();
                        String maSv = sv.getMaSv();
                        String hoTen = sv.getHoten();
                        String gioiTinh = sv.getGioiTinh();
                        int daiSo = sv.getDaiSo();
                        int kinhTe = sv.getKinhTe();
                        int trietHoc = sv.getTrietHoc();
                        newItem.add(maSv);
                        newItem.add(hoTen);
                        newItem.add(gioiTinh);
                        newItem.add(daiSo);
                        newItem.add(kinhTe);
                        newItem.add(trietHoc);
                        jtable.addAction(newItem);
                        break;
                    case 4:
                        System.out.println("Xoa sinh vien");
                        System.out.println("Nhap vi tri xoa");
                        int position = sc.nextInt();
                        jtable.deleteAction(position);
                        break;
                    case 5:
                        System.out.println("Da dong cua so table");
                        jtable.setVisible(false);
                        break;
                    case 6:
                        System.out.println("Good Bye !!!");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Lua chon khong chinh xac, Nhap lai !");
            }

        }
    }
}
