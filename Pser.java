/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author This pc
 */
public class Pser extends javax.swing.JPanel {

JPanel rp;Connection con=null;
Statement st=null;
ResultSet rs=null;
DefaultTableModel mt=null;
int k;
JButton b[];
String tab[][];
int sno,sum;
    
    public Pser(JPanel abc) {
      k=0;
      rp=abc;
        initComponents();
this.setBackground(new Color(0,0,0,0));
item.setBackground(new Color(0,0,0,0));
tp.setBackground(new Color(0,0,0,0));

tb.getTableHeader().setFont(new Font("tahoma",Font.PLAIN,16));

mt=(DefaultTableModel) tb.getModel();
    tab=new String[50][5];
    sno=0;
    sum=0;

b=new JButton[12];
b[0]=b1;   b[1]=b2;    b[2]=b3;    b[3]=b4;    b[4]=b5;    b[5]=b6;
b[6]=b7;   b[7]=b8;    b[8]=b9;    b[9]=b10;    b[10]=b11;    b[11]=b12;


for(int i=0;i<12;i++)
b[i].setVisible(false);

        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/HGP","root","thakur");
        st=con.createStatement();
        rs=st.executeQuery("select id from booked;");
      while(rs.next())
        {
         cb.addItem(rs.getString(1).toString());   
        }
        }
        catch(Exception e)
        { System.out.print(e); }

   }

public void settb(String var)
{ 
    String name=var;
    if(mt.getRowCount()!=0)
      {
    for(int i=0;i<sno;i++)
    {
    mt.removeRow(0);
    }
      }
    else sno=0;
 int i=0;
 for(i=0;i<sno;i++)
 {
  if(name.equals(tab[i][1]))
  {
   tab[i][3]=""+(Integer.parseInt(tab[i][3].trim())+1);
   tab[i][4]=""+(Integer.parseInt(tab[i][3].trim())*Integer.parseInt(tab[i][2].trim()));
   break;
  }
 }
 if(i==sno)
 {
     sno=sno+1;
     tab[i][0]=""+sno;
  try{
  rs=st.executeQuery("select fnm,cost from foods where fnm='"+name+"';");
  while(rs.next())
  {
  tab[i][1]=rs.getString(1);    
  tab[i][2]=rs.getString(2);    
  tab[i][3]=""+1;    
  tab[i][4]=""+(Integer.parseInt(tab[i][2].trim())*Integer.parseInt(tab[i][3].trim()));
  }
  }catch(Exception e){}   
 }
  sum=0;
 for(i=0;i<sno;i++)
 {
     sum+=Integer.parseInt(tab[i][4]);
     mt.addRow(tab[i]);
 } 
 tot.setText(""+sum);
}
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        item = new javax.swing.JPanel();
        cb = new javax.swing.JComboBox();
        b1 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox();
        tp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        odr = new javax.swing.JButton();
        tot = new javax.swing.JTextField();

        item.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                itemMouseMoved(evt);
            }
        });

        cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb.setForeground(new java.awt.Color(51, 51, 51));
        cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Customer ID" }));
        cb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMouseClicked(evt);
            }
        });
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 255, 204));
        b1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b1.setForeground(new java.awt.Color(102, 102, 102));
        b1.setText("1st");
        b1.setBorder(null);
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 204));
        b5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b5.setForeground(new java.awt.Color(102, 102, 102));
        b5.setText("5th");
        b5.setBorder(null);
        b5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 204));
        b3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b3.setForeground(new java.awt.Color(102, 102, 102));
        b3.setText("3rd");
        b3.setBorder(null);
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 204));
        b4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b4.setForeground(new java.awt.Color(102, 102, 102));
        b4.setText("4th");
        b4.setBorder(null);
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(255, 255, 204));
        b9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b9.setForeground(new java.awt.Color(102, 102, 102));
        b9.setText("9th");
        b9.setBorder(null);
        b9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 204));
        b2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b2.setForeground(new java.awt.Color(102, 102, 102));
        b2.setText("2nd");
        b2.setBorder(null);
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 204));
        b6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b6.setForeground(new java.awt.Color(102, 102, 102));
        b6.setText("6th");
        b6.setBorder(null);
        b6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 204));
        b8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b8.setForeground(new java.awt.Color(102, 102, 102));
        b8.setText("8th");
        b8.setBorder(null);
        b8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 204));
        b7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b7.setForeground(new java.awt.Color(102, 102, 102));
        b7.setText("7th");
        b7.setBorder(null);
        b7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b10.setBackground(new java.awt.Color(255, 255, 204));
        b10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b10.setForeground(new java.awt.Color(102, 102, 102));
        b10.setText("10th");
        b10.setBorder(null);
        b10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setBackground(new java.awt.Color(255, 255, 204));
        b11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b11.setForeground(new java.awt.Color(102, 102, 102));
        b11.setText("11th");
        b11.setBorder(null);
        b11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setBackground(new java.awt.Color(255, 255, 204));
        b12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b12.setForeground(new java.awt.Color(102, 102, 102));
        b12.setText("12th");
        b12.setBorder(null);
        b12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        cb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb1.setForeground(new java.awt.Color(51, 51, 51));
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Food Category" }));
        cb1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb1MouseClicked(evt);
            }
        });
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemLayout = new javax.swing.GroupLayout(item);
        item.setLayout(itemLayout);
        itemLayout.setHorizontalGroup(
            itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(itemLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(b11, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(b12, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        itemLayout.setVerticalGroup(
            itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tpMouseMoved(evt);
            }
        });

        tb.setBackground(new java.awt.Color(204, 255, 204));
        tb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb.setForeground(new java.awt.Color(102, 102, 102));
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No.", "Name", "Price", "Quantity", "Cost"
            }
        ));
        tb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tb.setEnabled(false);
        tb.setGridColor(new java.awt.Color(0, 0, 0));
        tb.setRowHeight(20);
        jScrollPane1.setViewportView(tb);

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total  Amount  = ");

        odr.setBackground(new java.awt.Color(0, 102, 102));
        odr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        odr.setForeground(new java.awt.Color(255, 255, 255));
        odr.setText("Order");
        odr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        odr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odrActionPerformed(evt);
            }
        });

        tot.setEditable(false);
        tot.setBackground(new java.awt.Color(255, 255, 204));
        tot.setFont(new java.awt.Font("Papyrus", 3, 18)); // NOI18N
        tot.setForeground(new java.awt.Color(51, 51, 51));
        tot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tot.setBorder(null);

        javax.swing.GroupLayout tpLayout = new javax.swing.GroupLayout(tp);
        tp.setLayout(tpLayout);
        tpLayout.setHorizontalGroup(
            tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(odr, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(tpLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        tpLayout.setVerticalGroup(
            tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tpLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(tpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMouseMoved
        if(k==1){
        rp.setVisible(false);
        rp.setVisible(true);
        }
        k=0;
    }//GEN-LAST:event_itemMouseMoved

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed

for(int i=0;i<12;i++)
b[i].setVisible(false);
        
        if(cb.getSelectedIndex()==0){
         if(cb1.getItemCount()>0)
         for(int i=cb1.getItemCount()-1;i>0;i--)
         cb1.removeItemAt(i);
        }
        else
        {
        try
        {
        rs=st.executeQuery("select ftp from ftype;");
      while(rs.next())
        {
         cb1.addItem(rs.getString(1).toString());   
        }
        }
        catch(Exception e)
        { System.out.print(e); }
            
        }
rp.setVisible(false);
rp.setVisible(true);
    }//GEN-LAST:event_cbActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
for(int i=0;i<12;i++)
b[i].setVisible(false);

String ch=cb1.getSelectedItem().toString();

try{
rs=st.executeQuery("select fnm from foods where ftp='"+ch+"';");
int i=0;
while(rs.next())
{
b[i].setText(rs.getString(1));
b[i].setVisible(true);
i++;
}

}catch(Exception e){}
rp.setVisible(false);
rp.setVisible(true);

    }//GEN-LAST:event_cb1ActionPerformed

    private void cbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMouseClicked
        k=1;
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMouseClicked

    private void cb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb1MouseClicked
        k=1;
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1MouseClicked

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
settb(b1.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
settb(b2.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
settb(b3.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
settb(b4.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
settb(b5.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
settb(b6.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
settb(b7.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
settb(b8.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
settb(b9.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
settb(b10.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
settb(b11.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
settb(b12.getText().trim());        // TODO add your handling code here:
    }//GEN-LAST:event_b12ActionPerformed

    private void tpMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tpMouseMoved

    private void odrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odrActionPerformed
        try{
            if(!tot.getText().isEmpty()){
            String ide=cb.getSelectedItem().toString().trim();
            rs=st.executeQuery("select fcost from booked where id='"+ide+"'");
         while(rs.next()){
         sum+=Integer.parseInt(rs.getString(1));
         }
        st.executeUpdate("update booked set fcost="+sum+" where id='"+ide+"';");
       for(int i=0;i<sno;i++) mt.removeRow(0);
       for(int i=0;i<12;i++)  b[i].setVisible(false);
       cb1.setSelectedIndex(0);
       tot.setText("");
       JOptionPane.showMessageDialog(null,"Order Successfull...\n\n");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"Please choose some Item....\n\n");
            }
        }catch(Exception e){}

    }//GEN-LAST:event_odrActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JComboBox cb;
    private javax.swing.JComboBox cb1;
    private javax.swing.JPanel item;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton odr;
    private javax.swing.JTable tb;
    private javax.swing.JTextField tot;
    private javax.swing.JPanel tp;
    // End of variables declaration//GEN-END:variables
}