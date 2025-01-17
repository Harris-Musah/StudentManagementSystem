/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SystemManagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;;

/**
 *
 * @author Harris Abdallah Musa
 */
public class CourseRecord extends javax.swing.JFrame {

    /**
     * Creates new form CourseRecord
     */
    Connection Con = null;
    PreparedStatement Pst = null;
    Statement St = null, St1 = null;
    ResultSet Rs = null, Rs1 = null;
    public CourseRecord() {
        initComponents();
        getStudId();
        showCourse();
    }
    private void showCourse(){
        String db_url = "jdbc:mysql://localhost:3308/studentmanagementsystem";
        try{
            Con = (Connection) DriverManager.getConnection(db_url, "root", "");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("select * from courserecord");
            CourseTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void getStudName(){
        String query = "select StudentName from studentrecords where RefNumber="+ StudIdCb.getSelectedItem().toString();
        try{
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/studentmanagementsystem", "root", "");
            St = (Statement) Con.createStatement();
            //String query = "select * from suppliertb";
            Rs = St.executeQuery(query);
            if(Rs.next()){
                StudNameTb.setText(Rs.getString("StudentName"));
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void getStudId(){
        try{
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/studentmanagementsystem", "root", "");
            St = (Statement) Con.createStatement();
            String query = "select * from Studentrecords";
            ResultSet Rs = St.executeQuery(query);
            while(Rs.next()){
                String myCust = Rs.getString("RefNumber");
                StudIdCb.addItem(myCust);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        CourseNameTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CourseIdTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        StudNameTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        StudIdCb = new javax.swing.JComboBox<>();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        SearchTb = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        StudentLnk = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Transcript = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ScoreTb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Record Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(427, 427, 427))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jProgressBar1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Course Name");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Course ID");

        CourseIdTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseIdTbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Student Name");

        StudNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudNameTbActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Student Id");

        StudIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudIdCbActionPerformed(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(102, 102, 255));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(102, 102, 255));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(102, 102, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        SearchTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTbActionPerformed(evt);
            }
        });

        SearchBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(102, 102, 255));
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CourseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CourseTable);

        jPanel3.setBackground(new java.awt.Color(102, 0, 255));

        StudentLnk.setBackground(new java.awt.Color(0, 51, 51));
        StudentLnk.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        StudentLnk.setForeground(new java.awt.Color(255, 255, 255));
        StudentLnk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentLnk.setText("Students");
        StudentLnk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentLnkMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Courses");

        Transcript.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        Transcript.setForeground(new java.awt.Color(255, 255, 255));
        Transcript.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Transcript.setText("Transcript");
        Transcript.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TranscriptMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 204));
        jLabel12.setText("University of Mines And Technology");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                .addComponent(StudentLnk, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Transcript, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(StudentLnk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Transcript, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Score");

        ScoreTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ScoreTb, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SearchTb, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(StudNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(StudIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CourseIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CourseNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(52, 52, 52)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SearchTb)
                                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(124, 124, 124)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(CourseNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(CourseIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(StudIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(StudNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(ScoreTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SaveBtn)
                                    .addComponent(EditBtn)
                                    .addComponent(DeleteBtn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudNameTbActionPerformed
    private boolean CheckForEmpty()
    {
        if(StudNameTb.getText().isEmpty() || CourseIdTb.getText().isEmpty() || StudNameTb.getText().isEmpty() || ScoreTb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "All field required");
            return false;
        }else{
            return true;
        }
    }
    
    
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        if (CheckForEmpty() == true){
            String db_url = "jdbc:mysql://localhost:3308/studentmanagementsystem";
            try{
                Con = DriverManager.getConnection(db_url, "root", "");
                //countCourse();
                PreparedStatement Add = Con.prepareStatement("insert into courserecord values (?,?,?,?,?)");
                //Add.setInt(1, CsId);
                Add.setString(1, CourseNameTb.getText());
                Add.setInt(2, Integer.parseInt(CourseIdTb.getText()));
                Add.setString(3, (String) StudIdCb.getSelectedItem());
                Add.setString(4, StudNameTb.getText());
                Add.setInt(5, Integer.parseInt(ScoreTb.getText()));
                int Rows = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Course Added!!");
                Con.close();
                showCourse();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
        if (CheckForEmpty() == true){
            String db_url = "jdbc:mysql://localhost:3308/studentmanagementsystem";
            try{
                Con = DriverManager.getConnection(db_url, "root", "");
                //countCourse();
                String updateQuery = "update courserecord set CourseName=?, StudentId=?, StudentName=?, Score=? where CourseId=?";
                PreparedStatement Add = Con.prepareStatement(updateQuery);
                Add.setInt(5, Integer.parseInt(CourseIdTb.getText()));
                Add.setString(1, CourseNameTb.getText());
                Add.setString(2, (String) StudIdCb.getSelectedItem());
                Add.setString(3, StudNameTb.getText());
                Add.setString(4, ScoreTb.getText());
                int Rows = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Student course record updated!!");
                Con.close();
                showCourse();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        if(key == 0)
        {
            JOptionPane.showMessageDialog(this, "Select Student.");
        }else
        {
            try
            {
                Con = (Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3308/studentmanagementsystem", "root", "");
                String Query = "delete from courserecord where courseId=" + key;
                Statement Delete = (Statement) Con.createStatement();
                //Delete.setInt(1, key);
                Delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "student removed");
                showCourse();
                //clear();
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        try{
            Con = (Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3308/studentmanagementsystem", "root", "");
            String search = SearchTb.getText();
            String Query = "Select * from courserecord where courseId=" + search;
            PreparedStatement Add = Con.prepareStatement(Query);
            ResultSet Rs = Add.executeQuery();
            if(Rs.next()){
                CourseNameTb.setText(Rs.getString("CourseName"));
                CourseIdTb.setText(Rs.getString("CourseID"));
                StudIdCb.setSelectedItem(Rs.getString("StudentId"));
                StudNameTb.setText(Rs.getString("StudentName"));
                ScoreTb.setText(Rs.getString("Score"));
            }else{
                JOptionPane.showMessageDialog(this, "course not found");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    int key = 0;
    private void CourseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) CourseTable.getModel();
        int myIndex = CourseTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(myIndex, 1).toString());
        CourseNameTb.setText(model.getValueAt(myIndex, 0).toString());
        CourseIdTb.setText(model.getValueAt(myIndex, 1).toString());
        StudIdCb.setSelectedItem(model.getValueAt(myIndex, 2).toString());
        StudNameTb.setText(model.getValueAt(myIndex, 3).toString());
        ScoreTb.setText(model.getValueAt(myIndex, 4).toString());
    }//GEN-LAST:event_CourseTableMouseClicked

    private void CourseIdTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseIdTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseIdTbActionPerformed

    private void ScoreTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScoreTbActionPerformed

    private void StudIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudIdCbActionPerformed
        // TODO add your handling code here:
        getStudName();
    }//GEN-LAST:event_StudIdCbActionPerformed

    private void StudentLnkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentLnkMouseClicked
        // TODO add your handling code here
        new StudentRecord().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StudentLnkMouseClicked

    private void TranscriptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TranscriptMouseClicked
        // TODO add your handling code here:
        new StudentTranscript().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TranscriptMouseClicked

    private void SearchTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CourseIdTb;
    private javax.swing.JTextField CourseNameTb;
    private javax.swing.JTable CourseTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField ScoreTb;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchTb;
    private javax.swing.JComboBox<String> StudIdCb;
    private javax.swing.JTextField StudNameTb;
    private javax.swing.JLabel StudentLnk;
    private javax.swing.JLabel Transcript;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
