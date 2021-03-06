/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftmanagement.presentation;

import javax.swing.DefaultListModel;
import shiftmanagement.Business.ShiftManagement;

/**
 *
 * @author sergio
 */
public class FrameAlunoTrocas extends javax.swing.JFrame {

    private ShiftManagement system;
    private String username;
    
    /**
     * Creates new form FrameAlunoTrocas
     * @param system
     * @param username
     */
    public FrameAlunoTrocas(ShiftManagement system, String username) {
        initComponents();
        this.system=system;
        this.username=username;
        atualizaJanela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        turnodesejado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uctroca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        trocas = new javax.swing.JList<>();
        cancelButton = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("UC:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Turno Desejado:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Drugs", 0, 36)); // NOI18N
        jLabel1.setText("Trocas");

        jButton1.setText("Trocar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Adicionar Troca");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        turnodesejado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnodesejadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Drugs", 0, 14)); // NOI18N
        jLabel5.setText("Turno Desejado:");

        jLabel4.setFont(new java.awt.Font("Drugs", 0, 14)); // NOI18N
        jLabel4.setText("UC:");

        trocas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(trocas);

        cancelButton.setText("Cancelar Troca");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turnodesejado, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uctroca, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(turnodesejado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(uctroca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(69, 69, 69)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(82, 82, 82))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String troca = trocas.getSelectedValue();
        if(troca != null){
            String UC = troca.substring(troca.indexOf(":")+2,troca.indexOf(" - Turno Oferecido: "));
            String codigoUC = this.system.getCodigoUC(UC);
            int tipo = this.system.getTipoUC(codigoUC);
            String meuturno = troca.substring(troca.indexOf(" - Turno Requerido: ")+20,troca.length());
            String turnoquequero = troca.substring(troca.indexOf(" - Turno Oferecido: ")+20,troca.indexOf(" - Turno Requerido: "));
            String idaluno = troca.substring(0, troca.indexOf("-")-1);
            int cap = this.system.getCapSala(turnoquequero, codigoUC, tipo);
            int inscritos = this.system.getInscritosTurno(turnoquequero, codigoUC, tipo);
            int permitido = this.system.getMaxAlunos(turnoquequero, codigoUC, tipo);
            
            if(this.system.getTurno_UC_Aluno(UC, username).equals(meuturno)){
                    this.system.trocaTurnos(username,idaluno,turnoquequero,meuturno,UC);
                    javax.swing.JOptionPane.showMessageDialog(this, "Turnos Trocados", "Trocado", 1);
                    atualizaJanela(); 
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(this, "Turnos incompatíveis", "Problema", 0);            
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String uc = uctroca.getText();
        String turnod = turnodesejado.getText();
        try{
            this.system.criaTroca(username, uc, turnod);
            atualizaJanela();
        } catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "Turno ou UC inseridos não são compatíveis", "Problema", 0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void turnodesejadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnodesejadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_turnodesejadoActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        String t = this.trocas.getSelectedValue();
        if(t!=null){
            String UC = t.substring(t.indexOf(":")+2, t.indexOf(" - Turno Oferecido: "));
            String codigoUC = this.system.getCodigoUC(UC);
            int tipo = this.system.getTipoUC(codigoUC);
            String meuturno = t.substring(t.indexOf(" - Turno Requerido: ")+20, t.length());
            String turnoquequero = t.substring(t .indexOf(" - Turno Oferecido: ")+20, t.indexOf(" - Turno Requerido: "));
            String idaluno = t.substring(0, t.indexOf("-")-1);
            this.system.removeTroca(idaluno, UC, meuturno, turnoquequero);
            atualizaJanela();
        }
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JList<String> trocas;
    private javax.swing.JTextField turnodesejado;
    private javax.swing.JTextField uctroca;
    // End of variables declaration//GEN-END:variables

    private void atualizaJanela() {
        if(!this.username.equals("admin")){
            this.cancelButton.setVisible(false);
        }
        DefaultListModel<String> lista = new DefaultListModel<>();
        for(String s: this.system.getTrocas()){
            lista.addElement(s);
        }
        trocas.setModel(lista);
    }
}
