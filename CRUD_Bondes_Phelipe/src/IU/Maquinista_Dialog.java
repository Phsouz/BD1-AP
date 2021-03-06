package IU;

import dao.CircuitoDAO;
import dao.EquipeDAO;
import dao.PaisDAO;
import java.awt.Frame;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import model.Circuito;
import model.Pais;


/**
 *
 * @author André Schwerz
 */
public class Maquinista_Dialog extends javax.swing.JDialog {

    public Maquinista_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            lblNomeCircuito.setVisible(false);
            loadRecords();
            fillCBEstilo();
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableCircuitos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CBStatus = new javax.swing.JCheckBox();
        CBEstilo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtSiglaPais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BtnBuscarPais = new javax.swing.JButton();
        txtNomePais = new javax.swing.JTextField();
        lblNomeCircuito = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CIRCUITO");
        setBounds(new java.awt.Rectangle(0, 15, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableCircuitos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTableCircuitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Pais", "Cidade", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableCircuitos);
        if (JTableCircuitos.getColumnModel().getColumnCount() > 0) {
            JTableCircuitos.getColumnModel().getColumn(0).setResizable(false);
            JTableCircuitos.getColumnModel().getColumn(1).setResizable(false);
            JTableCircuitos.getColumnModel().getColumn(2).setResizable(false);
            JTableCircuitos.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 215));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " REGISTRO DE CIRCUITO ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 20));

        txtNome.setEnabled(false);
        txtNome.setName("txtNome"); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 550, -1));

        txtCidade.setEnabled(false);
        txtCidade.setName("nome"); // NOI18N
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, -1));

        jLabel3.setText("Estilo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, 20));

        CBStatus.setText("Status");
        CBStatus.setToolTipText("");
        CBStatus.setEnabled(false);
        CBStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBStatusActionPerformed(evt);
            }
        });
        jPanel1.add(CBStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        CBEstilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBEstilo.setEnabled(false);
        jPanel1.add(CBEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 200, -1));

        jLabel4.setText("Cidade:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 20));

        txtSiglaPais.setEditable(false);
        txtSiglaPais.setEnabled(false);
        txtSiglaPais.setName("nome"); // NOI18N
        jPanel1.add(txtSiglaPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 60, -1));

        jLabel5.setText("Pais:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 70, 20));

        BtnBuscarPais.setText("...");
        BtnBuscarPais.setEnabled(false);
        BtnBuscarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarPaisActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscarPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 40, -1));

        txtNomePais.setEditable(false);
        txtNomePais.setEnabled(false);
        txtNomePais.setName("nome"); // NOI18N
        jPanel1.add(txtNomePais, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 200, -1));

        lblNomeCircuito.setText("jLabel2");
        jPanel1.add(lblNomeCircuito, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 590, 180));
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        btnFechar.setText("Fechar");
        btnFechar.setActionCommand("btnFechar");
        btnFechar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 100, 30));

        btnNovo.setText("Novo");
        btnNovo.setActionCommand("btnNovo");
        btnNovo.setPreferredSize(new java.awt.Dimension(90, 29));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 100, 30));

        btnSalvar.setText("Salvar");
        btnSalvar.setActionCommand("btnAlterar");
        btnSalvar.setEnabled(false);
        btnSalvar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 100, 30));

        btnRemover.setText("Remover");
        btnRemover.setActionCommand("btnRemover");
        btnRemover.setEnabled(false);
        btnRemover.setPreferredSize(new java.awt.Dimension(90, 29));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 100, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.setActionCommand("btnImprimir");
        btnCancelar.setEnabled(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 100, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        addRecord = true;
        clearInputBoxes();
        txtNome.requestFocus();
        enableButtons(false, true, true, false);
        enableFields(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja salvar esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                if (addRecord == true) {
                    addNew();
                } else {
                    updateRecord();
                }
                addRecord = false;
                loadRecords();
                enableButtons(true, false, false, false);
                enableFields(false);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                deleteRecord();
                loadRecords();
                clearInputBoxes();
                enableButtons(true, false, false, false);
                enableFields(false);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void CBStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBStatusActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clearInputBoxes();  
        enableButtons(true, false, false, false);
        enableFields(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void BtnBuscarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarPaisActionPerformed
        PaisBuscaJDialog busca = new PaisBuscaJDialog((Frame) this.getParent(), true);
        busca.setVisible(true); 
        txtNomePais.setText(busca.pais.getNome());
        txtSiglaPais.setText(busca.pais.getSigla());        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarPaisActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarPais;
    private javax.swing.JComboBox<String> CBEstilo;
    private javax.swing.JCheckBox CBStatus;
    private javax.swing.JTable JTableCircuitos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeCircuito;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomePais;
    private javax.swing.JTextField txtSiglaPais;
    // End of variables declaration//GEN-END:variables
    
    boolean addRecord = false;

    private void clearInputBoxes() {
        txtNome.setText("");
        txtCidade.setText("");
        txtSiglaPais.setText("");
        txtNomePais.setText("");
        lblNomeCircuito.setText("");
    }
    
    private void addNew() throws SQLException {
        PaisDAO pDao = new PaisDAO(); 
        Circuito c = new Circuito();
        c.setNome(txtNome.getText());
        c.setCidade(txtCidade.getText());
        c.setEstilo(CBEstilo.getSelectedItem().toString());
        c.setPais(pDao.find((String) txtSiglaPais.getText()));
        c.setStatus(CBStatus.isSelected());
        CircuitoDAO dao = new CircuitoDAO();
        dao.insert(c);
    }
    
    private void updateRecord() throws SQLException {
        PaisDAO pDao = new PaisDAO();
        Circuito c = new Circuito();
        c.setNome(txtNome.getText());
        c.setCidade(txtCidade.getText());
        c.setEstilo(CBEstilo.getSelectedItem().toString());
        c.setPais(pDao.find((String) txtSiglaPais.getText()));
        c.setStatus(CBStatus.isSelected());
        CircuitoDAO dao = new CircuitoDAO();
        dao.update(c, lblNomeCircuito.getText());
    }

    private void deleteRecord() throws SQLException {
        CircuitoDAO dao = new CircuitoDAO();
        dao.remove(txtNome.getText());
    }
    
    private void loadRecords() throws SQLException {
        String sql = "SELECT nome as Nome, cidade as Cidade, pais_sigla as 'Sigla do Pais', estilo AS Estilo, status as Status  FROM CIRCUITO ORDER BY nome;";
        ResultSetTableModel tableModel = new ResultSetTableModel(sql);
        JTableCircuitos.setModel(tableModel);
        
        //Hiding column "id" 
        //JTableCircuitos.removeColumn(JTableCircuitos.getColumnModel().getColumn(0));
        
        //Adjusting columns 
        JTableCircuitos.getColumnModel().getColumn(0).setMinWidth(200);//nome
        JTableCircuitos.getColumnModel().getColumn(1).setMinWidth(100);//cidade
        JTableCircuitos.getColumnModel().getColumn(2).setMaxWidth(50); //sigla
        JTableCircuitos.getColumnModel().getColumn(3).setMinWidth(50); //estilo
        JTableCircuitos.getColumnModel().getColumn(4).setMaxWidth(40); //status
       
        JTableCircuitos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                try {
                    if (JTableCircuitos.getSelectedRow() >= 0) {
                        
                        Object nome = JTableCircuitos.getModel().getValueAt(JTableCircuitos.getSelectedRow(), 0);
                        Object cidade = JTableCircuitos.getModel().getValueAt(JTableCircuitos.getSelectedRow(), 1);
                        Object pais_sigla = JTableCircuitos.getModel().getValueAt(JTableCircuitos.getSelectedRow(), 2);
                        Object estilo = JTableCircuitos.getModel().getValueAt(JTableCircuitos.getSelectedRow(), 3);
                        Object status = JTableCircuitos.getModel().getValueAt(JTableCircuitos.getSelectedRow(), 4).toString();
                        
                        
                        txtNome.setText(nome.toString());
                        lblNomeCircuito.setText(nome.toString());
                        txtCidade.setText(cidade.toString());
                        CBEstilo.setSelectedItem(estilo.toString());
                        
                        PaisDAO daoP = new PaisDAO();
                        Pais p = daoP.find(pais_sigla.toString());
                        txtSiglaPais.setText(p.getSigla());
                        txtNomePais.setText(p.getNome());
                                
                        CBStatus.setSelected(status.equals("true"));
                        
                        enableButtons(false, true, true, true);
                        enableFields(true);
                        
                        addRecord = false;
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        JTableCircuitos.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
    }  

    private void fillCBEstilo() throws SQLException {
        CBEstilo.removeAllItems();
        CBEstilo.addItem("Pista");
        CBEstilo.addItem("Estrada");
        CBEstilo.addItem("Circuito de Rua");
        CBEstilo.addItem("Pista/Estrada");
        CBEstilo.addItem("Hibrido");
    } 
    
    public void enableButtons(boolean novo, boolean salvar, boolean cancelar, boolean remover){
        btnNovo.setEnabled(novo);
        btnSalvar.setEnabled(salvar);
        btnCancelar.setEnabled(cancelar);
        btnRemover.setEnabled(remover);
    }
    
    public void enableFields(boolean flag){
        BtnBuscarPais.setEnabled(flag);
        CBEstilo.setEnabled(flag);
        CBStatus.setEnabled(flag);
        txtCidade.setEnabled(flag);
        txtNome.setEnabled(flag);
    }
}