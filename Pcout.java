
package hotel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author This pc
 */
public class Pcout extends javax.swing.JPanel {

JPanel rp;
int m[];
int dt[][];
int d=0,cn=0,month=0,k=0;
String id;
Connection con=null;
Statement st=null;
ResultSet rs=null;
    
    public Pcout(JPanel abc) {
        rp=abc;
        cn=0;
        id="";
        initComponents();
    m=new int[12];
    dt=new int[2][3];
    m[0]=31;     m[1]=28;     m[2]=31;     m[3]=30;     m[4]=31;     m[5]=30;
    m[6]=31;     m[7]=31;     m[8]=30;     m[9]=31;     m[10]=30;    m[11]=31;

this.setBackground(new Color(0,0,0,0));
ep.setBackground(new Color(0,0,0,0));
ri.setBackground(new Color(0,0,0,0));

ep.setVisible(false);

        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/HGP","root","thakur");
        st=con.createStatement();
        }
        catch(Exception e)
        { System.out.print(e); }
    
    }
    

    
 private int getnod(String dat1,String dat2)
  {
      d=0;
        String abc[]=new String[3];
        abc=dat1.split("/");
        for(int i=0;i<3;i++) dt[0][i]=Integer.parseInt(abc[i]);
        abc=dat2.split("/");
        for(int i=0;i<3;i++) dt[1][i]=Integer.parseInt(abc[i]);
        
    if(dt[1][2]>dt[0][2])
      {
      k=dt[0][2];
      for(int i=1; i<(dt[1][2]-dt[0][2]);i++)
        {
        if(((k%4==0 && k%100!=0)|| k%400==0) && (dt[0][1]<=2)) d+=366;
        if((((k+1)%4==0 && (k+1)%100!=0)||(k+1)%400==0) && (dt[0][1]>2)) d+=366;
        else d+=365;
        k++;
      }
      month=12-dt[0][1]+dt[1][1];   
    }
    if(dt[1][2]==dt[0][2]) month=dt[1][1]-dt[0][1];   
    if(dt[0][2]<dt[1][2] || (dt[0][2]==dt[1][2] && dt[0][1]!=dt[1][1])) 
      {
      d+=m[dt[0][1]-1]-dt[0][0];         
    }
    k=dt[0][2];
    for(int i=dt[0][1]+1; i<month+dt[0][1]; i++)
      {
      int j=i%12;
      if(j==0){ j=12; k++; }
      if(j==2) {
        if((k%4==0 && k%100!=0)|| k%400==0 ) d+=29;
        else d+=m[j-1];
        }
      else d+=m[j-1];
    }      
    if(dt[0][2]<dt[1][2] || (dt[0][2]==dt[1][2] && dt[0][1]!=dt[1][1])) 
      {
      d+=dt[1][0];         
    }
    if(dt[0][2]==dt[1][2] && dt[0][1]==dt[1][1]) 
      {
      d+=dt[1][0]-dt[0][0];         
    }
    if(d==0)d=1;
    return d;
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ep = new javax.swing.JPanel();
        error = new javax.swing.JLabel();
        ri = new javax.swing.JPanel();
        l5 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        but = new javax.swing.JButton();
        go = new javax.swing.JButton();
        t6 = new javax.swing.JTextField();

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

        l5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setText("Name");

        l9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 255, 255));
        l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l9.setText("Check out Date");

        l2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("Room Number");

        l4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("Type of Room");

        l6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setText("Email");

        l8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setText("Check in Date");

        cb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb1.setForeground(new java.awt.Color(51, 51, 51));
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Search", "Customer ID", "Mobile No", "Email ID" }));
        cb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        t1.setEditable(false);
        t1.setBackground(new java.awt.Color(255, 255, 204));
        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(51, 51, 51));
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
        });

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(255, 255, 204));
        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.setForeground(new java.awt.Color(51, 51, 51));
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        t3.setEditable(false);
        t3.setBackground(new java.awt.Color(255, 255, 204));
        t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t3.setForeground(new java.awt.Color(51, 51, 51));
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        t5.setEditable(false);
        t5.setBackground(new java.awt.Color(255, 255, 204));
        t5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t5.setForeground(new java.awt.Color(51, 51, 51));
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });

        t7.setEditable(false);
        t7.setBackground(new java.awt.Color(255, 255, 204));
        t7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t7.setForeground(new java.awt.Color(51, 51, 51));
        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        t4.setEditable(false);
        t4.setBackground(new java.awt.Color(255, 255, 204));
        t4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t4.setForeground(new java.awt.Color(51, 51, 51));
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        but.setBackground(new java.awt.Color(0, 102, 102));
        but.setFont(new java.awt.Font("Bell Gothic Std Light", 3, 24)); // NOI18N
        but.setForeground(new java.awt.Color(255, 255, 255));
        but.setText("Submit");
        but.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        but.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butActionPerformed(evt);
            }
        });

        go.setBackground(new java.awt.Color(0, 102, 102));
        go.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        go.setForeground(new java.awt.Color(255, 255, 255));
        go.setText("Go");
        go.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        go.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        t6.setEditable(false);
        t6.setBackground(new java.awt.Color(255, 255, 204));
        t6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t6.setForeground(new java.awt.Color(51, 51, 51));
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout riLayout = new javax.swing.GroupLayout(ri);
        ri.setLayout(riLayout);
        riLayout.setHorizontalGroup(
            riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riLayout.createSequentialGroup()
                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(riLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(riLayout.createSequentialGroup()
                                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(l5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(l2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(riLayout.createSequentialGroup()
                                        .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(riLayout.createSequentialGroup()
                                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(riLayout.createSequentialGroup()
                                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(l9, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(l6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(riLayout.createSequentialGroup()
                                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(but, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(t7)))))
                    .addGroup(riLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );
        riLayout.setVerticalGroup(
            riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(riLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go))
                .addGap(60, 60, 60)
                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(riLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(ep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
            .addComponent(ri, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed

    }//GEN-LAST:event_t5ActionPerformed

    private void t5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyPressed

    }//GEN-LAST:event_t5KeyPressed

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped

    }//GEN-LAST:event_t5KeyTyped

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6KeyPressed

    private void t6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t6KeyTyped

    private void riMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riMouseMoved
        if(cn==1){
        rp.setVisible(false);
        rp.setVisible(true);
        }

       else if(cn==5){
           if(t1.getText().length()>0 && t1.getText().length()<10)
           { 
               t1.setEditable(true);
               t1.setBackground(Color.red);
       }}
        cn=0;
    }//GEN-LAST:event_riMouseMoved

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        t1.setText("");   
        t1.setEditable(true);
        t1.setBackground(new Color(255,255,204));
         t2.setText("");   
         t3.setText("");   
         t4.setText("");   
         t5.setText("");   
         t6.setText("");   
         t7.setText("");   

        if(cb1.getSelectedIndex()==0)
        {
         ep.setVisible(false); 
         rp.setVisible(false);
         rp.setVisible(true);
         t1.setEditable(false);   
        }
        
        else if(cb1.getSelectedIndex()==1)
        {
        t1.setEditable(false);
        t1.setText("HGP");
        t1.setEditable(true);
        t1.requestFocus();
       }
        rp.setVisible(false);
        rp.setVisible(true); 
        t1.requestFocus();

    }//GEN-LAST:event_cb1ActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        String out="";
        String gd=t1.getText();
        if(gd.isEmpty())
        {
        ep.setVisible(true);    
        error.setText(" Please Input Customer ID ... ");
        rp.setVisible(false);
        rp.setVisible(true); 
        }

        else{
        String rec[]=new String[5];
        int bj=0,ck=0;
        try{

           if(cb1.getSelectedIndex()==1)
           {
           rs=st.executeQuery("select id,rno,rmtp,cin,nm,mail from booked where id='"+gd+"';");
           bj=101;
           }

           if(cb1.getSelectedIndex()==2)
           {
           rs=st.executeQuery("select id,rno,rmtp,cin,nm,mail from booked where mob='"+gd+"';");
           bj=102;
           }

           if(cb1.getSelectedIndex()==3)
           {
           rs=st.executeQuery("select id,rno,rmtp,cin,nm,mail from booked where mail='"+gd+"';");
           bj=103;
           }

            while(rs.next())
        {  
            ck=1;
            
            id=rs.getString(1);
            rec[0]=rs.getString(2);
            rec[1]=rs.getString(3);
            rec[2]=rs.getString(4);
            rec[3]=rs.getString(5);
            rec[4]=rs.getString(6);
        }
       
      Date date=new Date();
      out=date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900);
  
        
        if(ck==1)
        {
        t2.setText(rec[0]);
        t3.setText(rec[1]);
        t4.setText(rec[2]);
        t5.setText(rec[3]);
        t6.setText(out);
        t7.setText(rec[4]);
        }  
        
        else if(ck==0)
        {
        t2.setText(" ");
        t3.setText(" ");
        t4.setText(" ");
        t5.setText(" ");
        t6.setText(" ");
        t7.setText(" ");
        ep.setVisible(true);

        if(bj==101) error.setText(" ! Please Input Valid Id...");

        if(bj==102) error.setText(" ! Mobile Number dose not match...");

        if(bj==103) error.setText(" ! Email ID dose not match...");

        rp.setVisible(false);
        rp.setVisible(true); 
        }
        }catch(Exception e){}
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_goActionPerformed

    private void butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butActionPerformed
        String gd=t1.getText();
        if(gd.isEmpty())
        {
        ep.setVisible(true);    
        error.setText(" Please Input Customer ID ... ");
        rp.setVisible(false);
        rp.setVisible(true); 
        }

        else{
        String rec[]=new String[14];
        try{
       rs=st.executeQuery("select * from booked where id='"+id+"';");
       while(rs.next())
        {
   rec[0]=rs.getString(1);         rec[1]=rs.getString(2); 
   rec[2]=rs.getString(3);         rec[3]=rs.getString(4);
   rec[4]=rs.getString(5);         rec[5]=rs.getString(6);
   rec[6]=rs.getString(7);         rec[7]=rs.getString(8); 
   rec[8]=rs.getString(9);           rs.getString(10);
   rec[10]=rs.getString(11);       rec[11]=rs.getString(12); 
   rec[12]=rs.getString(13);         rs.getString(14);
        }
    rec[13]=t6.getText();   
    rec[9]=""+getnod(rec[12],rec[13]);
st.executeUpdate("insert into hdb values('"+rec[0]+"','"+rec[1]+"','"+rec[2]+"','"+rec[3]+"','"+rec[4]+"','"+rec[5]+"','"+rec[6]+"','"+rec[7]+"','"+rec[8]+"','"+rec[9]+"','"+rec[10]+"','"+rec[11]+"','"+rec[12]+"','"+rec[13]+"');");
st.executeUpdate("delete from booked where id='"+id+"';");
st.executeUpdate("update rooms set status='Available' where rno='"+rec[1]+"';");        

        ep.setVisible(true);
        error.setText(" Thank you for Stay here...");
        rp.setVisible(false);
        rp.setVisible(true); 
        }catch(Exception e){System.out.printf("error = "+e);}
        t2.setText(" ");
        t3.setText(" ");
        t4.setText(" ");
        t5.setText(" ");
        t6.setText(" ");
        t7.setText(" ");
        t1.setText(" ");
        }
    }//GEN-LAST:event_butActionPerformed

    private void cb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb1MouseClicked
        cn=1;
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1MouseClicked

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
        ep.setVisible(false);        // TODO add your handling code here:
        rp.setVisible(false);
        rp.setVisible(true);

if(cb1.getSelectedIndex()==2){
int key=evt.getKeyCode();
if((key>=evt.VK_0 && key<=evt.VK_9)||(key>=evt.VK_NUMPAD0 && key<=evt.VK_NUMPAD9)||key==KeyEvent.VK_BACK_SPACE || key==evt.VK_LEFT || key==evt.VK_RIGHT)
{
 t1.setEditable(true);
 t1.setBackground(new Color(255,255,204));
}
else{
 t1.setEditable(false);
}
   }
        t1.requestFocus();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_t1KeyPressed

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
        if(cb1.getSelectedIndex()==2){
        if(t1.getText().length()>10){
        t1.setEditable(true);
        t1.setBackground(Color.red);
        }
        cn=5;
        }
    }//GEN-LAST:event_t1KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but;
    private javax.swing.JComboBox cb1;
    private javax.swing.JPanel ep;
    private javax.swing.JLabel error;
    private javax.swing.JButton go;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JPanel ri;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables
}
