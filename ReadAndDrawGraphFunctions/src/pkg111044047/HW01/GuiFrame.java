/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg111044047.HW01;

import java.awt.Component;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ATPSOFTWARE
 */
public class GuiFrame extends javax.swing.JFrame {

    /**
     * Creates new form GuiFrame
     */
    private ReadAndDisplay prg;
    private int sizeSelect;
    public GuiFrame() {
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

        dosyaSec = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        read = new javax.swing.JButton();
        display = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFuncs = new javax.swing.JList();
        okunan = new javax.swing.JLabel();
        gecerli = new javax.swing.JLabel();
        gecersiz = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        size = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 200, 200, 200));
        setFocusable(false);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Welcome Graph Function Programme");

        read.setText("Read Functions");
        read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readActionPerformed(evt);
            }
        });

        display.setText("Display Graph");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        clear.setText("Clear Graph");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listFuncs);

        okunan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg111044047/HW01/images/pending.png"))); // NOI18N
        okunan.setText(" 0 : Okunan Veri");

        gecerli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg111044047/HW01/images/ok.png"))); // NOI18N
        gecerli.setText(" 0 : Tanımlanan Fonksiyon");

        gecersiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg111044047/HW01/images/not.png"))); // NOI18N
        gecersiz.setText(" 0 : Tanımlanamayan Fonksiyon");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg111044047/HW01/images/read.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg111044047/HW01/images/graph.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg111044047/HW01/images/clear.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("List of Functions");

        size.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "400 x 400", "500 x 500", "600 x 600", "640 x 480" }));
        size.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sizeİtemStateChanged(evt);
            }
        });

        jLabel6.setText("Graph size ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(read))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(display)
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(118, 118, 118)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clear)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(16, 16, 16)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(okunan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gecerli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gecersiz, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(display)
                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(clear)
                    .addComponent(read))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(okunan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gecerli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gecersiz))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readActionPerformed
        // ReadButton 
       
        dosyaSec.showOpenDialog((Component)evt.getSource());
        File  file = dosyaSec.getSelectedFile();
        if(file != null){
            if(prg == null)
                  prg = new GuiProgramControl();
             prg.setFileName(file.getPath());
             prg.readFile();
            okunan.setText( " "+prg.getIsValidData().length+" : Okunan Veri");
            gecerli.setText(" "+prg.isValidNums()+" : Tanımlanan Fonksiyon");
            gecersiz.setText(" "+prg.unValidNums()+" : Tanımlanamayan Fonksiyon");
            setList(prg.getReadingData(),prg.getIsValidData());
        }
    }//GEN-LAST:event_readActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
   
    }//GEN-LAST:event_jLabel3MouseClicked

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // Display Button
      if(prg != null){
          if(!prg.displayGraph(sizeSelect))
          {
          JOptionPane.showMessageDialog(null,"Malesef! Fonksiyonlarınızı tanıyamadık.!");
          }  
      }
      else
         JOptionPane.showMessageDialog(null,"Fonksiyon bulunmuyor, Önce Okuma Yapın.!"); 
    }//GEN-LAST:event_displayActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // Clear Button
       if(prg != null)
         prg.clearVisulation(sizeSelect);
    }//GEN-LAST:event_clearActionPerformed

    private void sizeİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sizeİtemStateChanged
        // TODO add your handling code here:
        sizeSelect = size.getSelectedIndex();
    }//GEN-LAST:event_sizeİtemStateChanged

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
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFrame().setVisible(true);
            }
        });
    }
    
    private void setList(String[] listData ,boolean[] valid){
        
        this.listFuncs.setListData(listData);
        this.listFuncs.setCellRenderer(new MyCellRenderer(valid));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton display;
    private javax.swing.JFileChooser dosyaSec;
    private javax.swing.JLabel gecerli;
    private javax.swing.JLabel gecersiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listFuncs;
    private javax.swing.JLabel okunan;
    private javax.swing.JButton read;
    private javax.swing.JComboBox size;
    // End of variables declaration//GEN-END:variables
}

class MyCellRenderer extends JLabel implements ListCellRenderer {
  
   private Icon kabul=new ImageIcon(getClass().getResource("okL.png"));
   private Icon red =new ImageIcon(getClass().getResource("notL.png"));
  boolean[] valid;
     MyCellRenderer(boolean[] valid) {
         this.valid = valid;
       
     }

  @Override
     public Component getListCellRendererComponent(JList list,
                               Object value,int index,boolean isSelected,
                                                        boolean cellHasFocus) {

         setText(value.toString());
         if(valid[index])
            setIcon(kabul);
         else
             setIcon(red);

         return this;
     }
 }
