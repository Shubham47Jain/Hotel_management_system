/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;


import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author This pc
 */
public class foodp extends javax.swing.JPanel {

addfp afp;    
delfp dfp;
modfp mfp;
listfp p4;

JPanel lp,hp,rp;
reception obj;
admin adm;
 String name;  
public foodp(JPanel a1,JPanel a2,JPanel a3,reception abc,admin p,String xyz) {
        initComponents();
        lp=a1;
        hp=a2;
        rp=a3;
        obj=abc;
        this.setBackground(new Color(0,0,0,0));
        leftp.setBackground(new Color(0,0,0,0));
        rp.setLayout(new FlowLayout());
        adm=p;
        name=xyz;
        unm.setText(name);

        
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        unm = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        j3 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        j6 = new javax.swing.JLabel();
        lo = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();

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

        j3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j3.setForeground(new java.awt.Color(255, 255, 204));
        j3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        j3.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\add.png")); // NOI18N
        j3.setText("   Add Food");
        j3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                j3MouseExited(evt);
            }
        });

        j4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j4.setForeground(new java.awt.Color(255, 255, 204));
        j4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        j4.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\remove.png")); // NOI18N
        j4.setText("   Remove Food");
        j4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j4MouseEntered(evt);
            }
        });

        j5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j5.setForeground(new java.awt.Color(255, 255, 204));
        j5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        j5.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\modi.png")); // NOI18N
        j5.setText(" Edit Food Details");
        j5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j5MouseEntered(evt);
            }
        });

        j6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j6.setForeground(new java.awt.Color(255, 255, 204));
        j6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        j6.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\sall.png")); // NOI18N
        j6.setText("   Show All");
        j6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j6MouseEntered(evt);
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

        j2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j2.setForeground(new java.awt.Color(255, 255, 204));
        j2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        j2.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\hm.png")); // NOI18N
        j2.setText("   Home");
        j2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                j2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout leftpLayout = new javax.swing.GroupLayout(leftp);
        leftp.setLayout(leftpLayout);
        leftpLayout.setHorizontalGroup(
            leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftpLayout.createSequentialGroup()
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
                        .addComponent(j5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(j4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(j3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftpLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(44, 44, 44)
                .addComponent(j2)
                .addGap(30, 30, 30)
                .addComponent(j3)
                .addGap(30, 30, 30)
                .addComponent(j4)
                .addGap(30, 30, 30)
                .addComponent(j5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(j6)
                .addGap(68, 68, 68))
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

    private void j3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseClicked
        hp.setVisible(false);
        rp.setVisible(false);

        afp=new addfp(rp);
        afp.setVisible(false);
        lp.setBackground(new Color(0,0,0,90));
        rp.setBackground(new Color(0,0,0,90));
        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\rest.jpg"));

        hp.setVisible(true);
        rp.removeAll();
        rp.add(afp);
        rp.setVisible(true);
        afp.setVisible(true);
        obj.head.setText("Add Food");

    }//GEN-LAST:event_j3MouseClicked

    private void j3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseEntered

    }//GEN-LAST:event_j3MouseEntered

    private void j3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseExited

    }//GEN-LAST:event_j3MouseExited

    private void j4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseClicked
        hp.setVisible(false);
        rp.setVisible(false);

        dfp=new delfp(rp);
        dfp.setVisible(false);
        lp.setBackground(new Color(0,0,0,90));
        rp.setBackground(new Color(0,0,0,90));
        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\rest.jpg"));

        hp.setVisible(true);
        rp.removeAll();
        rp.add(dfp);
        rp.setVisible(true);
        dfp.setVisible(true);
        obj.head.setText("remove food");

    }//GEN-LAST:event_j4MouseClicked

    private void j4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseEntered

    }//GEN-LAST:event_j4MouseEntered

    private void j5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseClicked
        hp.setVisible(false);
        rp.setVisible(false);

        mfp=new modfp(rp);
        mfp.setVisible(false);
        lp.setBackground(new Color(0,0,0,90));
        rp.setBackground(new Color(0,0,0,90));
        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\rest.jpg"));

        hp.setVisible(true);
        rp.removeAll();
        rp.add(mfp);
        rp.setVisible(true);
        mfp.setVisible(true);
        obj.head.setText("Edit Details");

    }//GEN-LAST:event_j5MouseClicked

    private void j5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseEntered

    }//GEN-LAST:event_j5MouseEntered

    private void j6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j6MouseClicked
        hp.setVisible(false);
        rp.setVisible(false);

        p4=new listfp(rp);
        p4.setVisible(false);
        lp.setBackground(new Color(0,0,0,55));
        rp.setBackground(Color.white);
        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\blank.jpg"));

        rp.removeAll();
        rp.add(p4);
        rp.setVisible(true);
        p4.setVisible(true);

    }//GEN-LAST:event_j6MouseClicked

    private void j6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j6MouseEntered

    }//GEN-LAST:event_j6MouseEntered

    private void j2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseClicked
        lp.setBackground(new Color(0,0,0,90));
        rp.setBackground(new Color(0,0,0,90));
        adm.lp.setVisible(false);
        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\ht.jpg"));
        adm.p2.setVisible(false);
        adm.lp.setVisible(true);
        rp.setVisible(false);
        hp.setVisible(false);


    }//GEN-LAST:event_j2MouseClicked

    private void j2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseEntered

    }//GEN-LAST:event_j2MouseEntered

    private void j2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseExited

    }//GEN-LAST:event_j2MouseExited

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
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel j6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftp;
    private javax.swing.JLabel lo;
    private javax.swing.JLabel unm;
    // End of variables declaration//GEN-END:variables
}
