/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingadministrator.views;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import parkingadministrator.controllers.CarsDAO;
import parkingadministrator.models.Car;

/**
 *
 * @author Diego Aguilef
 */
public class ParkingForm extends javax.swing.JFrame {

    /**
     * Creates new form Car
     */
    public ParkingForm() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     *
     */
    public void clearForm() {
        txtPatent.setText("");
        txtBrand.setText("");
        txtColor.setText("");
        txtMotorNumber.setText("");
        radioBenzine.setSelected(false);
        radioPetroleum.setSelected(false);
        txtManufacturingYear.setText("");
        txtOwnerRut.setText("");
        txtOwnerName.setText("");
    }
    
    /**
     *
     * @return
     */
    public boolean validatePatent(){
        return txtPatent.getText().matches("^([A-Z]{2}-[A-Z]{2}-[0-9]{2})$");
    }
    
    public boolean validateRut(){
        return txtOwnerRut.getText().matches("^([0-9]{7,8}-[K0-9]{1})$");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtPatent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMotorNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtManufacturingYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtOwnerRut = new javax.swing.JTextField();
        radioPetroleum = new javax.swing.JRadioButton();
        radioBenzine = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtOwnerName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableParkingData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patente");

        txtPatent.setToolTipText("Ej: XX-GT-15");
        txtPatent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatentActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca");

        jLabel3.setText("Color");

        jLabel4.setText("Numero Motor");

        jLabel5.setText("Tipo Combustible");

        jLabel6.setText("Año Fabricacion");

        jLabel7.setText("Rut Dueño");

        txtOwnerRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOwnerRutFocusLost(evt);
            }
        });

        buttonGroup1.add(radioPetroleum);
        radioPetroleum.setText("Petroleo");

        buttonGroup1.add(radioBenzine);
        radioBenzine.setText("Bencina");

        jLabel8.setText("Nombre Dueño");

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setText("Registro de Estacionamiento");

        btnSearch.setText("Buscar");
        btnSearch.setPreferredSize(new java.awt.Dimension(70, 23));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnList.setText("Listar");
        btnList.setPreferredSize(new java.awt.Dimension(70, 23));
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tableParkingData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patente", "Marca", "Color", "N° Motor", "Tipo Combustible", "Año Fabricación", "Rut Dueño", "Nombre Dueño"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableParkingData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableParkingData.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableParkingData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(txtPatent, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32)
                                .addComponent(txtMotorNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(radioPetroleum)
                                .addGap(15, 15, 15)
                                .addComponent(radioBenzine))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel6)
                                .addGap(24, 24, 24)
                                .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel7)
                                .addGap(29, 29, 29)
                                .addComponent(txtOwnerRut, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel8)
                        .addGap(29, 29, 29)
                        .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtPatent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtMotorNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(radioPetroleum)
                    .addComponent(radioBenzine))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtOwnerRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClear)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit)
                        .addComponent(btnSave))
                    .addComponent(btnDelete)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatentActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String patent, brand, color, rut, owner;
        int motorNumber, year;
        byte fuelType;
        Car car = null;
        if (validatePatent() && !txtBrand.getText().equals("")
                && !txtColor.getText().equals("") && !txtMotorNumber.getText().equals("")
                && !txtManufacturingYear.getText().equals("") && !txtOwnerRut.getText().equals("")
                && !txtOwnerName.getText().equals("")
                && (radioBenzine.isSelected() || radioPetroleum.isSelected())) {
            patent = txtPatent.getText();
            brand = txtBrand.getText();
            color = txtColor.getText();
            rut = txtOwnerRut.getText();
            owner = txtOwnerName.getText();
            motorNumber = Integer.parseInt(txtMotorNumber.getText());
            year = Integer.parseInt(txtManufacturingYear.getText());
            fuelType = radioBenzine.isSelected() ? (byte) 0 : (byte) 1;
            car = new Car(patent, brand, color, motorNumber, fuelType, year, rut, owner);
            try {
                if (CarsDAO.create(car)) {
                    clearForm();
                    JOptionPane.showMessageDialog(this, "Auto Guardado Correctamente", "Creado", 1);

                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar", "Error", 0);
                };
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete todos los campos antes de continuar", "Error", 1);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        byte fuelType;
        String patent;
        Car car = null;
        if (validatePatent()) {
            patent = txtPatent.getText();
            try {
                car = CarsDAO.search(patent);
                if (car != null) {
                    txtBrand.setText(car.getBrand());
                    txtColor.setText(car.getColor());
                    txtMotorNumber.setText(String.valueOf(car.getMotorNumber()));
                    fuelType = car.getFuelType();
                    if (fuelType == 0) {
                        radioBenzine.setSelected(true);
                    } else {
                        radioPetroleum.setSelected(true);
                    }
                    txtManufacturingYear.setText(String.valueOf(car.getManufacturingYear()));
                    txtOwnerRut.setText(car.getOwnerRut());
                    txtOwnerName.setText(car.getOwnerName());
                    JOptionPane.showMessageDialog(this, "Auto Encontrado", "Buscar", 1);
                } else {
                    JOptionPane.showMessageDialog(this, "Auto No Encontrado", "Buscar", 1);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error de conexión", 0);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una patente válida antes de continuar", "Error", 1);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtModel = (DefaultTableModel) tableParkingData.getModel();
        dtModel.setRowCount(0);
        Object[] carData = new Object[8];
        try {
            for (Car car : CarsDAO.all()) {
                carData[0] = car.getPatent();
                carData[1] = car.getBrand();
                carData[2] = car.getColor();
                carData[3] = car.getMotorNumber();
                carData[4] = car.getFuelTypeAsText();
                carData[5] = car.getManufacturingYear();
                carData[6] = car.getOwnerRut();
                carData[7] = car.getOwnerName();
                dtModel.addRow(carData);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error al Obtener datos, revise su conexión", "Error", 0);
        }
    }//GEN-LAST:event_btnListActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String patent, brand, color, rut, owner;
        int motorNumber, year;
        byte fuelType;
        Car car = null;
        if (validatePatent() && !txtBrand.getText().equals("")
                && !txtColor.getText().equals("") && !txtMotorNumber.getText().equals("")
                && !txtManufacturingYear.getText().equals("") && !txtOwnerRut.getText().equals("")
                && !txtOwnerName.getText().equals("")
                && (radioBenzine.isSelected() || radioPetroleum.isSelected())) {
            patent = txtPatent.getText();
            brand = txtBrand.getText();
            color = txtColor.getText();
            rut = txtOwnerRut.getText();
            owner = txtOwnerName.getText();
            motorNumber = Integer.parseInt(txtMotorNumber.getText());
            year = Integer.parseInt(txtManufacturingYear.getText());
            fuelType = radioBenzine.isSelected() ? (byte) 0 : (byte) 1;
            car = new Car(patent, brand, color, motorNumber, fuelType, year, rut, owner);
            try {
                CarsDAO.edit(car);
                JOptionPane.showMessageDialog(this, "Auto Editado Correctamente", "Creado", 1);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete todos los campos antes de continuar", "Error", 1);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String patent;
        if (validatePatent()) {
            patent = txtPatent.getText();
            try {
                if (CarsDAO.delete(patent)) {
                    clearForm();
                    JOptionPane.showMessageDialog(this, "Auto Eliminado", "Eliminar", 1);
                } else {
                    JOptionPane.showMessageDialog(this, "Auto no existe", "Eliminar", 1);
                };
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error de conexión", 0);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una patente válida antes de continuar", "Error", 1);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtOwnerRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOwnerRutFocusLost
        // TODO add your handling code here:
        if(!validateRut()){
            JOptionPane.showMessageDialog(this, "Ingrese un rut válido: "
                    + "Rut Ingresado "+txtOwnerRut.getText() + " \n "
                    + "Si Rut Termina en K, ingreselo en mayúscula", "Alerta", 3);
            txtOwnerRut.setText("");
        }
    }//GEN-LAST:event_txtOwnerRutFocusLost

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
            java.util.logging.Logger.getLogger(ParkingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParkingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioBenzine;
    private javax.swing.JRadioButton radioPetroleum;
    private javax.swing.JTable tableParkingData;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtMotorNumber;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtOwnerRut;
    private javax.swing.JTextField txtPatent;
    // End of variables declaration//GEN-END:variables
}
