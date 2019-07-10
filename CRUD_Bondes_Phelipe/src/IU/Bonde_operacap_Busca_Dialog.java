package IU;

import dao.PaisDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Pais;

/**
 *
 * @author André Schwerz
 */
public class Bonde_operacap_Busca_Dialog extends javax.swing.JDialog {
    
    private String EquipeID;
    private String EquipeNome;
    
    public Bonde_operacap_Busca_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         try {
            fillCBPais();
            loadRecords();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CBPaises = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEquipes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCA DE EQUIPE");

        jLabel1.setText("Nome:");

        jLabel2.setText("Pais: ");

        CBPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPaisesActionPerformed(evt);
            }
        });

        txtNome.setToolTipText("");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(CBPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableEquipes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEquipes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEquipesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEquipes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CBPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPaisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPaisesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            loadRecords();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jTableEquipesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipesMouseClicked
        String idEquipe = jTableEquipes.getValueAt(jTableEquipes.getSelectedRow(), 0).toString();
        String nomeEquipe = jTableEquipes.getValueAt(jTableEquipes.getSelectedRow(), 1).toString();
        this.setEquipeID(idEquipe);
        this.setEquipeNome(nomeEquipe);
        this.dispose();
    }//GEN-LAST:event_jTableEquipesMouseClicked

    private void clearInputBoxes() {
        txtNome.setText("");   
    }
    
    private void fillCBPais() throws SQLException {
        PaisDAO dao = new PaisDAO();
        List<Pais> paises = dao.list();
        CBPaises.removeAllItems();
        CBPaises.addItem("Todos");
        for(Pais p : paises){
            CBPaises.addItem(p.getSigla());
        }     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBPaises;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEquipes;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void loadRecords() throws SQLException {
         
        String sql = "SELECT id AS ID, nome AS Nome, pais_sigla AS 'Sigla do Pais', status AS Status FROM EQUIPE WHERE 1 = 1";
        if (!txtNome.getText().isEmpty()){
            sql = sql.concat(" AND nome like '%"+txtNome.getText()+"%'");
        }
        if (CBPaises.getSelectedIndex()!=0){
            sql = sql.concat(" AND pais_sigla = '"+CBPaises.getSelectedItem()+"'");
        }
        ResultSetTableModel tableModel = new ResultSetTableModel(sql);
        jTableEquipes.setModel(tableModel);

         //Adjusting columns 
        jTableEquipes.getColumnModel().getColumn(0).setMaxWidth(40);
        jTableEquipes.getColumnModel().getColumn(1).setMinWidth(200);//"nome
        jTableEquipes.getColumnModel().getColumn(2).setMaxWidth(50); //"sigla"
        jTableEquipes.getColumnModel().getColumn(3).setMaxWidth(40); //"status"
       
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        jTableEquipes.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
    }  

    public String getEquipeID() {
        return EquipeID;
    }

    public void setEquipeID(String EquipeID) {
        this.EquipeID = EquipeID;
    }

    public String getEquipeNome() {
        return EquipeNome;
    }

    public void setEquipeNome(String EquipeNome) {
        this.EquipeNome = EquipeNome;
    }
}
