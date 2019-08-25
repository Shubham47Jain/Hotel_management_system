/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.sql.*;

/**
 *
 * @author This pc
 */
public class addfp extends javax.swing.JPanel {

JPanel rp;
int k=0;
Connection con=null;
Statement st=null;
ResultSet rs=null;
    
    public addfp(JPanel abc)
    {
        initComponents();
        rp=abc;
this.setBackground(new Color(0,0,0,0));
ep.setBackground(new Color(0,0,0,0));
ri.setBackground(new Color(0,0,0,0));
inr.setBackground(new Color(0,0,0,0));
ep.setVisible(false);
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/HGP","root","thakur");
        st=con.createStatement();
        rs=st.executeQuery("select * from ftype;");
      while(rs.next())
        {
         cba.addItem(rs.getString(1).toString());   
        }
         cba.addItem("Other");   
        }
        catch(Exception e)
        { System.out.print(e); }
        
         t1.setEditable(false);   
         t2.setEditable(false);   
         t3.setEditable(false);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ep = new javax.swing.JPanel();
        error = new javax.swing.JLabel();
        ri = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        inr = new javax.swing.JPanel();
        but = new javax.swing.JButton();
        cba = new javax.swing.JComboBox();

        error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        error.setForeground(new java.awt.Color(204, 255, 204));
        error.setText("! Error");

        javax.swing.GroupLayout epLayout = new javax.swing.GroupLayout(ep);
        ep.setLayout(epLayout);
        epLayout.setHorizontalGroup(
            epLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        epLayout.setVerticalGroup(
            epLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        ri.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                riMouseMoved(evt);
            }
        });

        l1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l1.setText("Category");

        l3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l3.setText("Name");

        l5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l5.setText("Cost / Plate");

        t1.setBackground(new java.awt.Color(255, 255, 204));
        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(51, 51, 51));
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });

        t2.setBackground(new java.awt.Color(255, 255, 204));
        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.setForeground(new java.awt.Color(51, 51, 51));
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });

        t3.setBackground(new java.awt.Color(255, 255, 204));
        t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t3.setForeground(new java.awt.Color(51, 51, 51));
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout riLayout = new javax.swing.GroupLayout(ri);
        ri.setLayout(riLayout);
        riLayout.setHorizontalGroup(
            riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(riLayout.createSequentialGroup()
                        .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(riLayout.createSequentialGroup()
                        .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        riLayout.setVerticalGroup(
            riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        inr.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                inrMouseMoved(evt);
            }
        });

        but.setBackground(new java.awt.Color(0, 102, 102));
        but.setFont(new java.awt.Font("Bell Gothic Std Light", 3, 24)); // NOI18N
        but.setForeground(new java.awt.Color(255, 255, 255));
        but.setText("ADD");
        but.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        but.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butActionPerformed(evt);
            }
        });

        cba.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cba.setForeground(new java.awt.Color(51, 51, 51));
        cba.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Category" }));
        cba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbaMouseClicked(evt);
            }
        });
        cba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inrLayout = new javax.swing.GroupLayout(inr);
        inr.setLayout(inrLayout);
        inrLayout.setHorizontalGroup(
            inrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inrLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(inrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cba, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        inrLayout.setVerticalGroup(
            inrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inrLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(cba, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(ep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(ri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void riMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riMouseMoved

    }//GEN-LAST:event_riMouseMoved

    private void cbaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbaMouseClicked
        k=1;
        // TODO add your handling code here:
    }//GEN-LAST:event_cbaMouseClicked

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
    ep.setVisible(false);        // TODO add your handling code here:
        rp.setVisible(false);
        rp.setVisible(true);
        t1.requestFocus();
    }//GEN-LAST:event_t1KeyPressed

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
    ep.setVisible(false);        // TODO add your handling code here:
        rp.setVisible(false);
        rp.setVisible(true);
        t2.requestFocus();
    }//GEN-LAST:event_t2KeyPressed

    private void t3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyPressed
    ep.setVisible(false);        // TODO add your handling code here:
        rp.setVisible(false);
        rp.setVisible(true);
int key=evt.getKeyCode();
if((key>=evt.VK_0 && key<=evt.VK_9)||(key>=evt.VK_NUMPAD0 && key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE || key==evt.VK_LEFT || key==evt.VK_RIGHT)
{
 t3.setEditable(true);
}
else
{
 t3.setEditable(false);
}
        t3.requestFocus();

    }//GEN-LAST:event_t3KeyPressed

    private void cbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbaActionPerformed

        t1.setText("");
        t2.setText("");
        t3.setText("");
         t1.setEditable(true);   
         t2.setEditable(true);   
         t3.setEditable(true);
         
        int num=cba.getItemCount();
        if(cba.getSelectedIndex()==0)
        {
         t1.setEditable(false);   
         t2.setEditable(false);   
         t3.setEditable(false);   
        }
       else if(cba.getSelectedIndex()==num-1)
         t1.requestFocus();
       
       else
        {
         t1.setText(cba.getSelectedItem().toString());   
         t1.setEditable(false);   
         t2.requestFocus();
        }
  rp.setVisible(false);
  rp.setVisible(true);

    }//GEN-LAST:event_cbaActionPerformed

    private void butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butActionPerformed
        String s1,s2,s3;
        s1=t1.getText().trim(); 
        s2=t2.getText().trim();
        s3=t3.getText().trim();
        
        if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty())
        {
        ep.setVisible(true);
        error.setText(" ! Please Fill All Fields...");
        rp.setVisible(false);
        rp.setVisible(true); 
        }

        else
        {
        try
        {
        int num=cba.getItemCount();
        
            rs=st.executeQuery("select ftp from foods where ftp='"+s1+"' AND fnm='"+s2+"';");
            int i=0;
            while(rs.next())
            {
                i++;
                rs.getString(1);
            }
            if(i==0)
            {
                if(cba.getSelectedIndex()==num-1)
                {
                    st.executeUpdate("insert into ftype values('"+s1+"');"); 
                    cba.removeItem("Other");   
                    cba.addItem(s1);   
                    cba.addItem("Other");   
               }
                st.executeUpdate("insert into foods values('"+s1+"','"+s2+"','"+s3+"');");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t1.setEditable(false);   
                t2.setEditable(false);   
                t3.setEditable(false); 
                cba.setSelectedIndex(0);
             
                ep.setVisible(true);
                error.setText(s2+" has been Added...");
                rp.setVisible(false);
                rp.setVisible(true);               
            }            
            else 
            {
        ep.setVisible(true);
        error.setText(" ! This Food is Allready Exist...");
        rp.setVisible(false);
        rp.setVisible(true); 
        
        }
  }catch(Exception e){}
        }
    }//GEN-LAST:event_butActionPerformed

    private void inrMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inrMouseMoved
        if(k==1){
        rp.setVisible(false);
        rp.setVisible(true);
        }
        k=0;        // TODO add your handling code here:
    }//GEN-LAST:event_inrMouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but;
    private javax.swing.JComboBox cba;
    private javax.swing.JPanel ep;
    private javax.swing.JLabel error;
    private javax.swing.JPanel inr;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l5;
    private javax.swing.JPanel ri;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
