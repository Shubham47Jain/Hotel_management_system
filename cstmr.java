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

public class cstmr extends javax.swing.JPanel {

listcp p1;    
searchp p2;    
JPanel lp,hp,rp;
reception obj;
admin adm;
 String name;  
public cstmr(JPanel a1,JPanel a2,JPanel a3,reception abc,admin p,String xyz) {
        initComponents();
        lp=a1;
        hp=a2;
        rp=a3;
        obj=abc;
        this.setBackground(new Color(0,0,0,0));
        leftp.setBackground(new Color(0,0,0,0));
        lp.setLayout(new FlowLayout());
        adm=p;
        name=xyz;
        unm.setText(name);


}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        unm = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        j3 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
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
        j3.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\sall.png")); // NOI18N
        j3.setText("   Show All");
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

        j5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j5.setForeground(new java.awt.Color(255, 255, 204));
        j5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        j5.setIcon(new javax.swing.ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\sr.png")); // NOI18N
        j5.setText("   Search");
        j5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j5MouseEntered(evt);
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
                        .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(70, 70, 70)
                .addComponent(j2)
                .addGap(50, 50, 50)
                .addComponent(j3)
                .addGap(50, 50, 50)
                .addComponent(j5)
                .addContainerGap(137, Short.MAX_VALUE))
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
        p1=new listcp(rp);
        p1.setVisible(false);

        rp.removeAll();
        rp.add(p1);
        rp.setVisible(true);
        p1.setVisible(true);

    }//GEN-LAST:event_j3MouseClicked

    private void j3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseEntered

    }//GEN-LAST:event_j3MouseEntered

    private void j3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseExited

    }//GEN-LAST:event_j3MouseExited

    private void j5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseClicked
        hp.setVisible(false);
        rp.setVisible(false);
        p2=new searchp(rp);
        p2.setVisible(false);

        rp.removeAll();
        rp.add(p2);
        rp.setVisible(true);
        p2.setVisible(true);

    }//GEN-LAST:event_j5MouseClicked

    private void j5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseEntered

    }//GEN-LAST:event_j5MouseEntered

    private void j2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseClicked
        lp.setBackground(new Color(0,0,0,90));
        rp.setBackground(new Color(0,0,0,90));
        obj.jlb.setIcon(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\ht.jpg"));

        adm.lp.setVisible(false);
        adm.p4.setVisible(false);
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
    private javax.swing.JLabel j5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel leftp;
    private javax.swing.JLabel lo;
    private javax.swing.JLabel unm;
    // End of variables declaration//GEN-END:variables
}
