
package hotel;

import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class reception extends javax.swing.JFrame {

Container cp;
JLabel jlb;
recp p1;
admin p2;
String name;
    public reception(int i,String xyz) {
        initComponents();
        name=xyz;
        cp=getContentPane();
        cp.setLayout(null);        

        hp.setVisible(false);
        rp.setVisible(false);
        leftp.setVisible(false);
        rp.setLayout(new FlowLayout());
        leftp.setLayout(new FlowLayout());

        p1=new recp(leftp,hp,rp,this,p2,0,name);
        p2=new admin(leftp,hp,rp,this,name);
        if(i==1)
        {
           leftp.setBackground(new Color(0,0,0,80));
           hp.setBackground(new Color(0,0,0,80));
           rp.setBackground(new Color(0,0,0,80));

           jlb=new JLabel(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\rec.jpg"));
           p1.setVisible(true);
           leftp.add(p1);
        }
        
        if(i==2)
        {
           leftp.setBackground(new Color(0,0,0,90));
           hp.setBackground(new Color(0,0,0,90));
           rp.setBackground(new Color(0,0,0,90));

           jlb=new JLabel(new ImageIcon("E:\\Documents\\Govind Java Programs\\Project\\hotel\\Image\\ht.jpg"));
           p2.setVisible(true);
           leftp.add(p2);
        }
        leftp.setVisible(true);
        jlb.setBounds(0,0,1150,640);
        cp.add(jlb);

    }

    private reception() {
        throw new UnsupportedOperationException("Not yet implemented");
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
        jPanel1 = new javax.swing.JPanel();
        hp = new javax.swing.JPanel();
        head = new javax.swing.JLabel();
        rp = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        leftp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                leftpMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout leftpLayout = new javax.swing.GroupLayout(leftp);
        leftp.setLayout(leftpLayout);
        leftpLayout.setHorizontalGroup(
            leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );
        leftpLayout.setVerticalGroup(
            leftpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        head.setFont(new java.awt.Font("BankGothic Md BT", 2, 36)); // NOI18N
        head.setForeground(new java.awt.Color(255, 255, 255));
        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head.setText("ABC");

        javax.swing.GroupLayout hpLayout = new javax.swing.GroupLayout(hp);
        hp.setLayout(hpLayout);
        hpLayout.setHorizontalGroup(
            hpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        hpLayout.setVerticalGroup(
            hpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rpLayout = new javax.swing.GroupLayout(rp);
        rp.setLayout(rpLayout);
        rpLayout.setHorizontalGroup(
            rpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rpLayout.setVerticalGroup(
            rpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(leftp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftpMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftpMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_leftpMouseMoved

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
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reception().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel head;
    private javax.swing.JPanel hp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel leftp;
    private javax.swing.JPanel rp;
    // End of variables declaration//GEN-END:variables
}
