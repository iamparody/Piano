/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pianos;
import javax.swing.JOptionPane;
import sun.audio.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author bob
 */
public class Piano extends javax.swing.JFrame {

    /**
     * Creates new form Piano
     */
    public Piano() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jcbMusic = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        tune = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 96, 87, 139));

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, 86, 231));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 96, 81, 139));

        jcbMusic.setForeground(new java.awt.Color(255, 255, 255));
        jcbMusic.setText("Music");
        jPanel1.add(jcbMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 23, -1, -1));

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 102, 87, 227));

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 96, 74, 233));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 94, 70, 140));

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 96, 90, 230));

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 97, 70, 140));

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 96, 100, 230));

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 70, 140));

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 96, 90, 230));

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 70, 140));

        jButton17.setBackground(new java.awt.Color(0, 0, 0));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 100, 70, 140));

        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 93, 89, 239));

        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 94, 107, 235));

        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 90, 80, 240));

        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 93, 95, 240));

        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 90, 76, 240));

        tune.setText("Tune");
        tune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuneActionPerformed(evt);
            }
        });
        jPanel1.add(tune, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\C.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\D.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\E.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\F.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\G.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\A.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\B.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\C1.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\D1.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\E1.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\F1.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\C_s.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\D_s.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\F_s.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\G_s.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\Bb.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\C_s1.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        InputStream iAudio;
        if(jcbMusic.isSelected()){
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\D_s1.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void tuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuneActionPerformed
        InputStream iAudio;
       
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\C.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\C_s.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
         try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\D_s.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
         try{
        iAudio=new FileInputStream(new File("C:\\Users\\bob\\Desktop\\Java\\Music_Note\\G_s.wav"));
        AudioStream iMusic=new AudioStream(iAudio);
        AudioPlayer.player.start(iMusic);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_tuneActionPerformed

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
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcbMusic;
    private javax.swing.JButton tune;
    // End of variables declaration//GEN-END:variables
}
