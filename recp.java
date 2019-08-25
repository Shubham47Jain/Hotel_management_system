/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author This pc
 */
public class recp extends javax.swing.JPanel {
int num;
Pcin p1;    
Pcout p2;
Pser p3;
Pbill p4;
JPanel lp,hp,rp;
reception obj;
admin adm;
String name;
    public recp(JPanel a1,JPanel a2,JPanel a3,reception abc,admin p,int i,String xyz) {
        initComponents();
        lp=a1;
        hp=a2;
        rp=a3;
        obj=abc;
        name=xyz;
this.setBackground(new Color(0,0,0,0));
        leftp.setBackground(new Color(0,0,0,0));
        rp.setLayout(new FlowLayout());
        unm.setText(name);
        num=i;
        adm=p;

    }


        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        unm = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        lo = new javax.swing.JLabel();
        home = new javax.swing.JLabel();

        leftp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                leftpMouseMoved(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\22.png")); // NOI18N

        unm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        unm.setForeground(new java.awt.Color(204, 255, 204));
        unm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unm.setText("User NAme");

        jSeparator1.setForeground(new java.awt.Color(153, 153, 0));

        j1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j1.setForeground(new java.awt.Color(255, 255, 204));
        j1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        j1.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\check in.png")); // NOI18N
        j1.setText("   Check In");
        j1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                j1MouseExited(evt);
            }
        });

        j2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j2.setForeground(new java.awt.Color(255, 255, 204));
        j2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        j2.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\check out.png")); // NOI18N
        j2.setText("   Check Out");
        j2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j2MouseEntered(evt);
            }
        });

        j3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j3.setForeground(new java.awt.Color(255, 255, 204));
        j3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        j3.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\order.png")); // NOI18N
        j3.setText("  Food Service");
        j3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j3MouseEntered(evt);
            }
        });

        j4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j4.setForeground(new java.awt.Color(255, 255, 204));
        j4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        j4.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\bill.png")); // NOI18N
        j4.setText("   Bill");
        j4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j4MouseEntered(evt);
            }
        });

        lo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lo.setForeground(new java.awt.Color(255, 255, 102));
        lo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lo.setText("Log Out");
        lo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loMouseClicked(evt);
            }
        });

        home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 204));
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\hm.png")); // NOI18N
        home.setText("   Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout leftpLayout = new javax.swing.GroupLayout(leftp);
        leftp.setLayout(leftpLayout);
        leftpLayout.setHorizontalGroup(
            leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftpLayout.createSequentialGroup()
                .addGroup(leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(leftpLayout.createSequentialGroup()
                            .addGroup(leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftpLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(leftpLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(unm, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(leftpLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(12, 12, 12))
                        .addGroup(leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(j2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(j1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(leftpLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        leftpLayout.setVerticalGroup(
            leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 26, Short.MAX_VALUE)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void j1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseClicked
        hp.setVisible(false);
        rp.setVisible(false);
        p1=new Pcin(rp);
        p1.setVisible(false);

        lp.setBackground(new Color(0,0,0,80));
        rp.setBackground(new Color(0,0,0,80));
        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\rec.jpg"));

        hp.setVisible(true);
        rp.removeAll();
        rp.add(p1);
        rp.setVisible(true);
        p1.setVisible(true);
        obj.head.setText("Check in");
    }//GEN-LAST:event_j1MouseClicked

    private void j1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseEntered

    }//GEN-LAST:event_j1MouseEntered

    private void j1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseExited

    }//GEN-LAST:event_j1MouseExited

    private void j2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseClicked
        hp.setVisible(false);
        rp.setVisible(false);
        p2=new Pcout(rp);
        p2.setVisible(false);

        lp.setBackground(new Color(0,0,0,80));
        rp.setBackground(new Color(0,0,0,80));
        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\rec.jpg"));

        hp.setVisible(true);
        rp.removeAll();
        rp.add(p2);
        rp.setVisible(true);
        p2.setVisible(true);
        obj.head.setText("Check out");
    }//GEN-LAST:event_j2MouseClicked

    private void j2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseEntered

    }//GEN-LAST:event_j2MouseEntered

    private void j3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseClicked
        hp.setVisible(false);
        rp.setVisible(false);
        p3=new Pser(rp);
        p3.setVisible(false);

        lp.setBackground(new Color(0,0,0,55));
        rp.setBackground(Color.white);
        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\blank.jpg"));

        rp.removeAll();
        rp.add(p3);
        rp.setVisible(true);
        p3.setVisible(true);
    }//GEN-LAST:event_j3MouseClicked

    private void j3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseEntered

    }//GEN-LAST:event_j3MouseEntered

    private void j4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseClicked
        hp.setVisible(false);
        rp.setVisible(false);
        p4=new Pbill(rp);
        p4.setVisible(false);

        lp.setBackground(new Color(0,0,0,55));
        rp.setBackground(Color.white);
        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\blank.jpg"));

        rp.removeAll();
        rp.add(p4);
        rp.setVisible(true);
        p4.setVisible(true);
        obj.head.setText("Invoice");
    }//GEN-LAST:event_j4MouseClicked

    private void j4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseEntered

    }//GEN-LAST:event_j4MouseEntered

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        if(num==1)
        {
        adm.lp.setVisible(false);

        lp.setBackground(new Color(0,0,0,90));
        rp.setBackground(new Color(0,0,0,90));

        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\ht.jpg"));
        adm.p1.setVisible(false);
        adm.lp.setVisible(true);
        
        }
        
            rp.setVisible(false);
            hp.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered

    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited

    }//GEN-LAST:event_homeMouseExited

    private void leftpMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftpMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_leftpMouseMoved

    private void loMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loMouseClicked
     login f=new login();
     f.setLocationRelativeTo(null);
     f.setVisible(true);
     obj.setVisible(false);
    }//GEN-LAST:event_loMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel home;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftp;
    private javax.swing.JLabel lo;
    private javax.swing.JLabel unm;
    // End of variables declaration//GEN-END:variables
}
