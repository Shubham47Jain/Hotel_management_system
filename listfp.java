package hotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.sql.*;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class listfp extends javax.swing.JPanel {

JPanel rp;
Connection con=null;
Statement st=null;
ResultSet rs=null;
DefaultTableModel md=null;
String rec[][];
int i=0;

    public listfp(JPanel abc) {
        initComponents();

rp=abc;
this.setBackground(new Color(0,0,0,0));
tp.setBackground(new Color(0,0,0,0));
opt.setBackground(new Color(0,0,0,0));

tbf.getTableHeader().setFont(new Font("tahoma",Font.PLAIN,16));
md=(DefaultTableModel)tbf.getModel();

        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/HGP","root","thakur");
        st=con.createStatement();
        rs=st.executeQuery("select * from foods;");
        while(rs.next())
        {
         i++;
        }       
        rs=st.executeQuery("select * from foods;");
        rec=new String[i][4];
        i=0;
        while(rs.next())
        {
         rec[i][0]=""+(i+1);   
         rec[i][1]=rs.getString(1);
         rec[i][2]=rs.getString(2);
         rec[i][3]=rs.getString(3);
         i++;
        }       
    for(int j=0;j<i;j++)
    {
     md.addRow(rec[j]);
    } 
        }catch(Exception e){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbf = new javax.swing.JTable();
        opt = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        tbf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbf.setForeground(new java.awt.Color(102, 102, 102));
        tbf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No.", "Name", "Category", "Price"
            }
        ));
        tbf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbf.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tbf.setEnabled(false);
        tbf.setGridColor(new java.awt.Color(0, 0, 0));
        tbf.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbf.setRowHeight(24);
        jScrollPane1.setViewportView(tbf);

        javax.swing.GroupLayout tpLayout = new javax.swing.GroupLayout(tp);
        tp.setLayout(tpLayout);
        tpLayout.setHorizontalGroup(
            tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tpLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        tpLayout.setVerticalGroup(
            tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tpLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Default");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Price");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Print");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optLayout = new javax.swing.GroupLayout(opt);
        opt.setLayout(optLayout);
        optLayout.setHorizontalGroup(
            optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        optLayout.setVerticalGroup(
            optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optLayout.createSequentialGroup()
                .addGroup(optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(opt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    for(int j=0;j<i;j++) md.removeRow(0);
     String ind[][]=new String[i][4];
for(int j=0;j<i;j++)
{
ind[j][0]=rec[j][0];
ind[j][1]=rec[j][1];
ind[j][2]=rec[j][2];
ind[j][3]=rec[j][3];
}
     
     
for(int j=0;j<i-1;j++)
{
 for(int k=j+1;k<i;k++)
{
  if(Integer.parseInt(ind[j][3])>=Integer.parseInt(ind[k][3]))  
  {
    String strr=ind[j][1];
    ind[j][1]=ind[k][1];
    ind[k][1]=strr;
    
    strr=ind[j][2];
    ind[j][2]=ind[k][2];
    ind[k][2]=strr;

    strr=ind[j][3];
    ind[j][3]=ind[k][3];
    ind[k][3]=strr;
  }
 }
}
    for(int j=0;j<i;j++) md.addRow(ind[j]);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    for(int j=0;j<i;j++) md.removeRow(0);
    for(int j=0;j<i;j++) md.addRow(rec[j]);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
{
 MessageFormat header=new MessageFormat("Foods Deatils.");
 MessageFormat fter=new MessageFormat("");
 tbf.print(JTable.PrintMode.FIT_WIDTH,header,fter);
}catch(Exception e){}

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel opt;
    private javax.swing.JTable tbf;
    private javax.swing.JPanel tp;
    // End of variables declaration//GEN-END:variables
}
