/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.text.Position;

/**
 *
 * @author Danut
 */
public class SearchArena extends javax.swing.JFrame {

   final void FillList() {
    
        try{ 
          String url = "jdbc:mysql://localhost:3306/nba";
          String username ="root";
          String password="";
        
        Connection con;
        con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement();
        String Query="SELECT * from arena";
        ResultSet rs = stmt.executeQuery(Query);
        
        DefaultListModel DLM=new DefaultListModel();
        while(rs.next()){
            
            DLM.addElement(rs.getString(1));
        }
        List2.setModel(DLM);
    }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
   
    /**
     *
     */
    public SearchArena() {
        initComponents();
        FillList();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EchipaText = new javax.swing.JTextField();
        LocatieText = new javax.swing.JTextField();
        LocuriText = new javax.swing.JTextField();
        MedieSpecText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AnulAparitieiText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NumeText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List2 = new javax.swing.JList<>();
        SearchBtn = new javax.swing.JButton();
        SearchText = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LocuriText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocuriTextActionPerformed(evt);
            }
        });

        MedieSpecText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedieSpecTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Nume");

        jLabel2.setText("Echipa");

        jLabel3.setText("Locatie");

        jLabel4.setText("Locuri");

        jLabel5.setText("MedieSpec");

        jLabel6.setText("AnulAparitiei");

        List2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List2ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List2);

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(SearchBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 545, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpdateBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DeleteBtn, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(154, 154, 154))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(372, 372, 372)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(142, 142, 142)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NumeText)
                        .addComponent(EchipaText)
                        .addComponent(LocatieText)
                        .addComponent(AnulAparitieiText, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MedieSpecText)
                        .addComponent(LocuriText))
                    .addGap(373, 373, 373)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(SearchBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(181, 181, 181))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(212, 212, 212)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NumeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EchipaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LocatieText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LocuriText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MedieSpecText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AnulAparitieiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(222, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LocuriTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocuriTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocuriTextActionPerformed

    private void MedieSpecTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedieSpecTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedieSpecTextActionPerformed

 
    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
       int result = List2.getNextMatch(SearchText.getText(), 0, Position.Bias.Forward);
        List2.setSelectedIndex(result);
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        try{ 
          String url = "jdbc:mysql://localhost:3306/nba";
          String username ="root";
          String password="";
        
        Connection con;
        con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement();
        String Query="UPDATE arena SET Nume='"+NumeText.getText()+"',Echipa='"+EchipaText.getText()+"',Locatie='"+LocatieText.getText()+"',Locuri='"+LocuriText.getText()+"',MedieSpec='"+MedieSpecText.getText()+"',AnulAparitiei='"+AnulAparitieiText.getText()+"' WHERE Nume='"+List2.getSelectedValue()+"'";
        stmt.execute(Query);
        JOptionPane.showMessageDialog(null,"Informatiile despre arena au fost actualizate");
        
       FillList();
    }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        try{ 
          String url = "jdbc:mysql://localhost:3306/nba";
          String username ="root";
          String password="";
        
        Connection con;
        con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement();
        String Query= "DELETE FROM arena WHERE Nume='"+List2.getSelectedValue()+"'";
        stmt.execute(Query);
        JOptionPane.showMessageDialog(null,"Informatiile despre arena au fost sterse cu succes");
        
       FillList();
    }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void List2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List2ValueChanged
         try{ 
          String url = "jdbc:mysql://localhost:3306/nba";
          String username ="root";
          String password="";
        
        Connection con;
        con = DriverManager.getConnection(url,username,password);
        Statement stmt = con.createStatement();
        String Query="SELECT * from arena WHERE Nume='"+List2.getSelectedValue()+"' ";
        ResultSet rs = stmt.executeQuery(Query);
        
        
        while(rs.next()){
            NumeText.setText(rs.getString(1));
            EchipaText.setText(rs.getString(2));
            LocatieText.setText(rs.getString(3));
            LocuriText.setText(rs.getString(4));
            MedieSpecText.setText(rs.getString(5));
            AnulAparitieiText.setText(rs.getString(6));
            
        }
       
    }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_List2ValueChanged

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
            java.util.logging.Logger.getLogger(SearchArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchArena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchArena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnulAparitieiText;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField EchipaText;
    private javax.swing.JList<String> List2;
    private javax.swing.JTextField LocatieText;
    private javax.swing.JTextField LocuriText;
    private javax.swing.JTextField MedieSpecText;
    private javax.swing.JTextField NumeText;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchText;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
}
