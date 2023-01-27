/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import SportPlanner.SportPlanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ciccio
 */
public class FasceOrarieGUI extends javax.swing.JFrame {
private ArrayList<String> s = new ArrayList<>();
private String campo; 
private SportPlanner sportPlanner;
private static ArrayList<LocalTime>  fasce = new ArrayList<>();
private static ArrayList<String> orari = new ArrayList<>();
private JButton butt1, butt2;
//private String[][] data= {{"12:00"},{"14:00"}, {"16:00"},{"18:00"}, {"20:00"}, {"22:00"}};

private int[] rows;
    /**
     * Creates new form NewJFrame
     */
    public FasceOrarieGUI(SportPlanner sp, String cmp, JButton jButton2, JButton jButton1) {
        butt2=jButton2;
        butt1=jButton1;
        sportPlanner=sp;
        campo=cmp;
        initComponents();
        int i=0;
        setVisible(true); 
        setLocationRelativeTo(null);
        pack();
        if(orari.size()!=0) orari.removeAll(orari);
        Iterator ora = sportPlanner.getFasce().iterator();
        while(ora.hasNext()){
            orari.add(ora.next().toString());
        }
        String[] col = {"Fascia oraria"};
        checkOrario();
        String[][] data = new String[orari.size()][1] ;
        Iterator it = orari.iterator();
        while(it.hasNext()){
            data[i][0]=(String) it.next();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(data, col);
        confirm.setEnabled(false);
        jTextArea2.setEditable(false);
        jTextArea2.setEnabled(false);
        jTextArea2.setFocusable(false);
        jTable1.setModel(model);
        jTable1.setRowSelectionAllowed(true);
        jTable1.getSelectionModel().addListSelectionListener(
                new RowColumnListSelectionListener());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addTime = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        confirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        removeTime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addTime.setText("Aggiungi orari");
        addTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTimeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        confirm.setText("Conferma orari");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel2.setText("Scegli la fascia oraria e premi su \"Conferma\" per confermare orari e campo:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 36)); // NOI18N
        jLabel1.setText("SportPlanner");

        removeTime.setText("Rimuovi orari");
        removeTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 19, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(addTime, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeTime)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(confirm)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTime)
                    .addComponent(confirm)
                    .addComponent(removeTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private class RowColumnListSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            if (jTable1.getRowSelectionAllowed()) {
                rows = jTable1.getSelectedRows();
               
            }
        }
    }
    
    private void addTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTimeActionPerformed
        // TODO add your handling code here:
        int i;
        LocalTime paux;
        String aux="";
        for(i=0; i<rows.length;i++){
            paux = addTime(jTable1.getValueAt(rows[i], 0).toString());
            if(paux!=null){
                aux+="La fascia oraria " + paux.toString() + " è stata inserita!\n";
                jTextArea2.setText(aux);
            }
                         
        }
        confirm.setEnabled(true);

    
    }//GEN-LAST:event_addTimeActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        butt2.setEnabled(true);
        if(!fasce.isEmpty())
        sportPlanner.getTorneoCorrente().setOrario(fasce);
        setVisible(false);
        butt1.setEnabled(false);
    }//GEN-LAST:event_confirmActionPerformed

    private void removeTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTimeActionPerformed
        // TODO add your handling code here:
        int i;
        LocalTime paux;
        String aux="";
        for(i=0; i<rows.length;i++){
            paux = removeTime(jTable1.getValueAt(rows[i], 0).toString());
            if(paux!=null){
                aux+="La fascia oraria " + paux.toString() + " è stata rimossa!\n";
                jTextArea2.setText(aux);
            }       
        }
    }//GEN-LAST:event_removeTimeActionPerformed
      
    private LocalTime addTime(String ora){
        String reg = "\\:";
        String hh = ora.split(reg)[0];
        String mm = ora.split(reg)[1];
        LocalTime time = LocalTime.of(Integer.parseInt(hh), Integer.parseInt(mm));
        if(sportPlanner.getTorneoCorrente().getOrario()==null && !fasce.contains(time)){
           fasce.add(time);    
           return time; 
        } 
        return null;
    }
    
    private LocalTime removeTime(String ora){
        LocalTime time = LocalTime.parse(ora);
        if(sportPlanner.getTorneoCorrente().getOrario()==null && fasce.contains(time)){
           fasce.remove(time);    
           return time; 
        } 
        return null;
    }
    
    private void checkOrario(){
        Iterator it = sportPlanner.getElencoTornei().keySet().iterator();
        String aux, paux;
        while(it.hasNext()){
            aux=(String) it.next();
            Iterator iter = sportPlanner.getTorneoCorrente().getCampi().keySet().iterator();
            while(iter.hasNext()){
                paux=(String) iter.next();
                LocalDate inizioC = sportPlanner.getTorneoCorrente().getDataInizio();
                LocalDate fineC = sportPlanner.getTorneoCorrente().getDataFine();
                if(sportPlanner.getElencoTornei().get(aux).getCampi().containsKey(paux)
                &&   checkData(inizioC, sportPlanner.getElencoTornei().get(aux).getDataInizio(), fineC, sportPlanner.getElencoTornei().get(aux).getDataFine())){
                    
                    Iterator o = sportPlanner.getElencoTornei().get(aux).getOrario().iterator();
                    while(o.hasNext()){
                        String app = o.next().toString();
                        if(orari.contains(app)){
                            orari.remove(app);
                        }
                    }
                }
            }
        }
           it = sportPlanner.getElencoPrenotazioni().keySet().iterator();
            while(it.hasNext()){
                aux=(String) it.next();
                Iterator iter = sportPlanner.getTorneoCorrente().getCampi().keySet().iterator();
                while(iter.hasNext()){
                    LocalDate inizioC = sportPlanner.getTorneoCorrente().getDataInizio();
                LocalDate fineC = sportPlanner.getTorneoCorrente().getDataFine();
                LocalDate data = sportPlanner.getElencoPrenotazioni().get(aux).getData();
                    if((data.isAfter(inizioC) && data.isBefore(fineC)) || data.equals(inizioC) || data.equals(fineC))
                        if(orari.contains(sportPlanner.getElencoPrenotazioni().get(aux).getOra()))
                            orari.remove(sportPlanner.getElencoPrenotazioni().get(aux).getOra());
                        }
            }
            
            
        
    }
    
    
    public boolean checkData(LocalDate inizioCorrente, LocalDate inizio, LocalDate fineCorrente, LocalDate fine){
      if((inizioCorrente.isBefore(inizio) && (fineCorrente.isAfter(inizio) || fineCorrente.equals(inizio)))
         || (inizioCorrente.isAfter(inizio) || inizioCorrente.equals(inizio)) && (inizioCorrente.isBefore(fine) || inizioCorrente.equals(fine)))
          return true;
        return false;
    }
    /**
     * @param args the command line arguments
     */
      /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SportPlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SportPlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SportPlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SportPlannerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FasceOrarieGUI().setVisible(true);
            }
        });
    }*/
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTime;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton removeTime;
    // End of variables declaration//GEN-END:variables
}