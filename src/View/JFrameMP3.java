/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.FileTypeFilter;
import Controller.IOFile;
import jaco.mp3.player.MP3Player;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.JFileChooser;
import Model.Player;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class JFrameMP3 extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMP3
     */
    boolean check;
    Player player = new Player();
    String Path = "D:\\Music\\";
    List<String>listFileMusic;
    String FileMusic = "D:\\du lieu ngoai man hinh\\App-Java\\src\\Controller\\FileMusic.txt";
    public JFrameMP3() {
        initComponents();
//        appTitle.setText("APP CUA DUNG");
        String fileName = player.getSongFile().getName();
        songNameDisplay.setText(fileName);
        File f = new File(FileMusic);
        listFileMusic = new ArrayList<>();
        if (f.exists()) {
            listFileMusic = IOFile.doc(FileMusic);
            for (String i: listFileMusic) {
                this.jComboBoxListMusic.addItem(i);
            }
        } 
        else {
            listFileMusic = new ArrayList<>();
        }
        check = false;
        volumeControl((double)0.5);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        repeatBtn = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        pauseplayBtn = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        openBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxListMusic = new javax.swing.JComboBox<>();
        Slider = new javax.swing.JSlider();
        quitBtn = new javax.swing.JLabel();
        songNameDisplay = new javax.swing.JLabel();
        appTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        repeatBtn.setBackground(new java.awt.Color(255, 51, 51));
        repeatBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        repeatBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\repeat (2).png")); // NOI18N
        repeatBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repeatBtnMouseClicked(evt);
            }
        });
        getContentPane().add(repeatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 30, 20));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\fast-forward1.png")); // NOI18N
        back.setToolTipText("");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 40, 40));

        pauseplayBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pauseplayBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\pause (1).png")); // NOI18N
        pauseplayBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pauseplayBtnMouseClicked(evt);
            }
        });
        getContentPane().add(pauseplayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 40, 30));

        next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        next.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\fast-forward.png")); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 40, 20));

        openBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\add.png")); // NOI18N
        openBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openBtnMouseClicked(evt);
            }
        });
        getContentPane().add(openBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 30, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\trash.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 30, -1));

        jComboBoxListMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListMusicActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxListMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 240, -1));

        Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderStateChanged(evt);
            }
        });
        getContentPane().add(Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, -1));

        quitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quitBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\remove-button.png")); // NOI18N
        quitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitBtnMouseClicked(evt);
            }
        });
        getContentPane().add(quitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 43, -1));

        songNameDisplay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songNameDisplay.setText("NH???C...........................................................");
        getContentPane().add(songNameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 150, 150, 36));

        appTitle.setFont(new java.awt.Font("VNI-Algerian", 0, 8)); // NOI18N
        appTitle.setText("RELAX APP");
        getContentPane().add(appTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 70, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\go-back-arrow.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 40, 20));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\volume.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 37, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\backgr.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxListMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListMusicActionPerformed
        // TODO add your handling code here:
        player.getPlayer().getPlayList().clear();
        player.getPlayer().addToPlayList(new File(Path+jComboBoxListMusic.getItemAt(jComboBoxListMusic.getSelectedIndex())));
//        player.getPlayer().play();
        player.getPlayer().stop();
        pauseplayBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\play11.png"));
        check=true;
        songNameDisplay.setText("" + jComboBoxListMusic.getItemAt(jComboBoxListMusic.getSelectedIndex()));
    }//GEN-LAST:event_jComboBoxListMusicActionPerformed

    private void quitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitBtnMouseClicked
        this.dispose();

    }//GEN-LAST:event_quitBtnMouseClicked

    private void SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderStateChanged
        // TODO add your handling code here:
        volumeControl((double)Slider.getValue()/100f);
    }//GEN-LAST:event_SliderStateChanged

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        // TODO add your handling code here:
        int dem = this.jComboBoxListMusic.getSelectedIndex();
        if(dem == this.jComboBoxListMusic.getItemCount()-1) dem=-1;
        player.getPlayer().getPlayList().clear();
        player.getPlayer().addToPlayList(new File(Path+jComboBoxListMusic.getItemAt(++dem)));
        this.jComboBoxListMusic.setSelectedIndex(dem);
        this.songNameDisplay.setText(""+jComboBoxListMusic.getItemAt(dem));
        player.getPlayer().play();
        pauseplayBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\pause (1).png"));
    }//GEN-LAST:event_nextMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        int dem = this.jComboBoxListMusic.getSelectedIndex();
        if(dem == 0) dem=this.jComboBoxListMusic.getItemCount();
        player.getPlayer().getPlayList().clear();
        player.getPlayer().addToPlayList(new File(Path+jComboBoxListMusic.getItemAt(--dem)));
        this.jComboBoxListMusic.setSelectedIndex(dem);
        this.songNameDisplay.setText(""+jComboBoxListMusic.getItemAt(dem));
        player.getPlayer().play();
        pauseplayBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\pause (1).png"));
    }//GEN-LAST:event_backMouseClicked

    private void openBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openBtnMouseClicked
        JFileChooser openFileChooser = new JFileChooser(player.getCurrentDirectory());
        int kt=0;
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3", "CH??? M??? FILE MP3 NHA"));
        int result = openFileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            player.setSongFile(openFileChooser.getSelectedFile());
            player.getPlayer().getPlayList().clear();
            player.getPlayer().addToPlayList(player.getSongFile());
            songNameDisplay.setText("" + player.getSongFile().getName());
            for(int i=0;i<jComboBoxListMusic.getItemCount();i++){
                if(player.getSongFile().getName().equals(jComboBoxListMusic.getItemAt(i))){
                    kt=1;
                      JOptionPane.showMessageDialog(rootPane, "B??i n??y ???? c?? r???i!");
                    this.jComboBoxListMusic.setSelectedIndex(i);
                    break;
                }
            }
            if(kt==0){
                listFileMusic.add(player.getSongFile().getName());
                IOFile.viet(FileMusic, listFileMusic);
                this.jComboBoxListMusic.addItem(player.getSongFile().getName());
                this.jComboBoxListMusic.setSelectedIndex(this.jComboBoxListMusic.getItemCount()-1);
            }
            player.getPlayer().stop();
            check=true;
            pauseplayBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\play11.png"));
        }
    }//GEN-LAST:event_openBtnMouseClicked

    private void pauseplayBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseplayBtnMouseClicked

        if(check==false){
            player.getPlayer().pause();
            pauseplayBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\play11.png"));
            check=true;
        }else{
            player.getPlayer().play();
            pauseplayBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\pause (1).png"));
            check=false;
        }
    }//GEN-LAST:event_pauseplayBtnMouseClicked

    private void repeatBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeatBtnMouseClicked
        if(player.isRepeat()==false){
            player.setRepeat(true);
            player.getPlayer().setRepeat(player.isRepeat());
            System.out.println("ON REPEAT");
        }else if(player.isRepeat()==true){
            player.setRepeat(false);
            player.getPlayer().setRepeat(player.isRepeat());
            System.out.println("OFF REPEAT");
        }
    }//GEN-LAST:event_repeatBtnMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        player.getPlayer().getPlayList().clear();
        player.getPlayer().addToPlayList(new File(Path+jComboBoxListMusic.getItemAt(jComboBoxListMusic.getSelectedIndex())));
        player.getPlayer().play();
        pauseplayBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\pause (1).png"));
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int delete=jComboBoxListMusic.getSelectedIndex();
        JOptionPane.showMessageDialog(this, "???? x??a ' " + jComboBoxListMusic.getItemAt(delete));
        jComboBoxListMusic.removeAllItems();
        listFileMusic.remove(delete);
        for (String i: listFileMusic) {
            this.jComboBoxListMusic.addItem(i);
        }
        IOFile.viet(FileMusic, listFileMusic);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(JFrameMP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMP3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Slider;
    private javax.swing.JLabel appTitle;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> jComboBoxListMusic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel next;
    private javax.swing.JLabel openBtn;
    private javax.swing.JLabel pauseplayBtn;
    private javax.swing.JLabel quitBtn;
    private javax.swing.JLabel repeatBtn;
    private javax.swing.JLabel songNameDisplay;
    // End of variables declaration//GEN-END:variables
  
    //////////////////
    private void volumeControl(Double valueToPlusMinus){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((double)volumeToCut);
                    volControl.setValue(changedCalc);
                    
                }catch (LineUnavailableException lineException){
                }catch (IllegalArgumentException illException){
                }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            } 
        }
    }
}



