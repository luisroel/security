/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security.views;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JList;
import security.controllers.MenuController;
import security.entities.Item;
import security.entities.Menu;
import security.entities.User;
import security.entities.UserRight;
import security.models.MenuModel;

/**
 *
 * @author Administrator
 */
public class MenuView extends javax.swing.JInternalFrame{

    private MenuController controller;
    private UserRight right;
    private User user;
    
    /**
     * Creates new form FrmMenu
     * @param right
     * @param user
     */
    public MenuView(User user, UserRight right) {
        initComponents();
        localInit(user, right);
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
        cmbStatus = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMenu = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        chkActive = new javax.swing.JCheckBox();
        btnNew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtMenu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtOrder = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEntryUser = new javax.swing.JTextField();
        txtModUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEntryDate = new javax.swing.JTextField();
        txtModDate = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Menu Options");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter:"));

        cmbStatus.setName(""); // NOI18N

        lstMenu.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstMenu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu info:"));

        jLabel1.setText("Id:");

        txtId.setEnabled(false);

        chkActive.setText("Active");

        btnNew.setText("New");

        jLabel2.setText("Menu:");

        jLabel3.setText("Description:");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.setEnabled(false);
        jScrollPane2.setViewportView(txtDescription);

        btnEdit.setText("Edit");

        btnDelete.setText("Delete");

        jLabel8.setText("Order:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)
                                        .addComponent(chkActive, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(txtMenu)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrder)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew)
                            .addComponent(chkActive))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Change info:"));

        jLabel4.setText("Entry User:");

        jLabel5.setText("Mod. User:");

        txtEntryUser.setEnabled(false);

        txtModUser.setEnabled(false);

        jLabel6.setText("Entry Date:");

        jLabel7.setText("Mod. Date:");

        txtEntryDate.setEnabled(false);

        txtModDate.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEntryDate)
                    .addComponent(txtEntryUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModUser)
                    .addComponent(txtModDate))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntryUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtModUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtModDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JCheckBox chkActive;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstMenu;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtEntryDate;
    private javax.swing.JTextField txtEntryUser;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMenu;
    private javax.swing.JTextField txtModDate;
    private javax.swing.JTextField txtModUser;
    private javax.swing.JTextField txtOrder;
    // End of variables declaration//GEN-END:variables
        
    private void localInit(User user, UserRight right) {
        MenuModel model = new MenuModel();
        this.controller = new MenuController(model, this, user);
        this.right = right;
        this.user = user;

        btnNew.setActionCommand("New");
        btnNew.addActionListener(this.controller);
        btnEdit.setActionCommand("Edit");
        btnEdit.addActionListener(this.controller);
        btnDelete.setActionCommand("Delete");
        btnDelete.addActionListener(this.controller);
        cmbStatus.addItemListener(this.controller);
        lstMenu.addListSelectionListener(this.controller);
        
        setNormalScenario();
                
        controller.loadStatus();
    }

    public void setNormalScenario(){
        cmbStatus.setEnabled(true);
        lstMenu.setEnabled(true);
        chkActive.setEnabled(false);
        txtMenu.setEnabled(false);
        txtDescription.setEnabled(false);
        txtOrder.setEnabled(false);

        btnNew.setEnabled(right.getIsCreated());
        btnEdit.setEnabled(right.getIsUpdated());
        btnDelete.setEnabled(right.getIsDeleted());
        
        btnNew.setText("New");
        btnEdit.setText("Edit");
        
        controller.setViewState(0);
    }

    public void setNewScenario(){
        cmbStatus.setEnabled(false);
        lstMenu.setEnabled(false);
        chkActive.setEnabled(false);
        txtMenu.setEnabled(true);
        txtDescription.setEnabled(true);
        txtOrder.setEnabled(true);
        btnNew.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(false);
        
        btnNew.setText("Save");
        btnEdit.setText("Cancel");
        
        clearFields();
        
        controller.setViewState(1);
    }
    
    public void setEditScenario(){
        cmbStatus.setEnabled(false);
        lstMenu.setEnabled(false);
        chkActive.setEnabled(true);
        txtMenu.setEnabled(true);
        txtDescription.setEnabled(true);
        txtOrder.setEnabled(true);
        btnNew.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(false);
        
        btnNew.setText("Save");
        btnEdit.setText("Cancel");
        
        controller.setViewState(2);
    }
    
    public void clearFields() {
        txtId.setText("");
        txtMenu.setText("");
        txtDescription.setText("");
        txtOrder.setText("");
        chkActive.setSelected(true);
        txtEntryUser.setText("");
        txtEntryDate.setText("");
        txtModUser.setText("");
        txtModDate.setText("");
    }

    public void loadDetail(){
        if (!lstMenu.isSelectionEmpty()){
            Menu obj = (Menu)lstMenu.getSelectedValue();
            txtId.setText(Long.toString(obj.getId()));
            txtMenu.setText(obj.getName());
            txtDescription.setText(obj.getDescription());
            txtOrder.setText(Integer.toString(obj.getOrder()));
            chkActive.setSelected(obj.getIsActive());
            txtEntryUser.setText(obj.getTrack().getEntryUser().getName());
            txtEntryDate.setText(new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(obj.getTrack().getEntryDate()));
            txtModUser.setText(obj.getTrack().getModUser().getName());
            txtModDate.setText(new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(obj.getTrack().getModDate()));
        }        
    }
    
    public void updateRow(){
        Date date = new Date();
        Menu obj = (Menu)lstMenu.getSelectedValue();
        obj.setName(txtMenu.getText());
        obj.setDescription(txtDescription.getText());
        obj.setOrder(Integer.parseInt(txtOrder.getText()));
        obj.setIsActive(chkActive.isSelected());
        obj.getTrack().setModUser(new Item(user.getUserId(), user.getUsername()));
        obj.getTrack().setModDate(new Timestamp(date.getTime()));
        txtModUser.setText(user.getUsername());
        txtModDate.setText(new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(date));
    }
    
    public JComboBox getCmbStatus(){
        return cmbStatus;
    }
    
    public JList getMenuList(){
        return lstMenu;
    }

    public Long getMenuId(){
        return Long.parseLong(txtId.getText());
    }
    
    public String getMenuName(){
        return txtMenu.getText();
    }
    
    public String getMenuDescription(){
        return txtDescription.getText();
    }
    
    public String getOrder(){
        return txtOrder.getText();
    }
    
    public boolean getIsActive(){
        return chkActive.isSelected();
    }
}
