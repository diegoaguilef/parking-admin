/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingadministrator.views;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import parkingadministrator.controllers.CarsDAO;
import parkingadministrator.models.Car;

/**
 *
 * @author Diego Aguilef
 */
public class FilteredReport extends javax.swing.JFrame {

    /**
     * Creates new form GeneralReport
     */
    public FilteredReport() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     *
     * @return
     */
    public boolean validatePatent() {
        return txtPatent.getText().matches("^([A-Z]{2}-[A-Z]{2}-[0-9]{2})$");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableParkingData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnPatent = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtPatent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        btnBrand = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        btnColor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        btnMotor = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        radioPetroleum = new javax.swing.JRadioButton();
        radioBenzine = new javax.swing.JRadioButton();
        btnFuelType = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtManufacturingYear = new javax.swing.JTextField();
        btnManufacturingYear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtOwnerRut = new javax.swing.JTextField();
        btnOwnerRut = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtOwnerName = new javax.swing.JTextField();
        btnOwnerName = new javax.swing.JButton();
        btnListcars = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        tableParkingData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tableParkingData.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableParkingData);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Reporte Filtrado De Ingresos Al Estacionamiento De Autos");

        btnPatent.setText("Buscar Patente");
        btnPatent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatentActionPerformed(evt);
            }
        });

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel2.setText("Patente");

        jLabel3.setText("Marca");

        btnBrand.setText("Buscar Marca");
        btnBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandActionPerformed(evt);
            }
        });

        jLabel4.setText("Color");

        btnColor.setText("Buscar Color");
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        jLabel5.setText("N° Motor");

        btnMotor.setText("Buscar N°Motor");
        btnMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotorActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setText("Tipo Combustible");

        buttonGroup1.add(radioPetroleum);
        radioPetroleum.setText("Petroleo");

        buttonGroup1.add(radioBenzine);
        radioBenzine.setText("Bencina");

        btnFuelType.setText("Buscar T.Combustible");
        btnFuelType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuelTypeActionPerformed(evt);
            }
        });

        jLabel7.setText("Año Fabricación");

        btnManufacturingYear.setText("Buscar Año Fabric.");
        btnManufacturingYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufacturingYearActionPerformed(evt);
            }
        });

        jLabel8.setText("Rut Dueño");

        txtOwnerRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerRutActionPerformed(evt);
            }
        });

        btnOwnerRut.setText("Buscar Rut Dueño");
        btnOwnerRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOwnerRutActionPerformed(evt);
            }
        });

        jLabel9.setText("Nombre Dueño");

        txtOwnerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerNameActionPerformed(evt);
            }
        });

        btnOwnerName.setText("Buscar Nombre Dueño");
        btnOwnerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOwnerNameActionPerformed(evt);
            }
        });

        btnListcars.setText("Mostrar Todo");
        btnListcars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListcarsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(189, 189, 189))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMotor))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPatent, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBrand)
                                            .addComponent(txtColor))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPatent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(82, 82, 82)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioPetroleum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioBenzine))
                            .addComponent(txtManufacturingYear)
                            .addComponent(txtOwnerRut)
                            .addComponent(txtOwnerName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListcars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManufacturingYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOwnerRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOwnerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFuelType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnColor)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPatent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPatent))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBrand))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMotor)
                            .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(radioPetroleum)
                                    .addComponent(radioBenzine)
                                    .addComponent(btnFuelType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnManufacturingYear))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtOwnerRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOwnerRut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOwnerName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListcars)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatentActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtModel = (DefaultTableModel) tableParkingData.getModel();
        dtModel.setRowCount(0);
        Object[] carData = new Object[8];
        Car car = null;
        String patent;
        if (validatePatent()) {
            patent = txtPatent.getText();
            try {
                car = CarsDAO.search(patent);

                carData[0] = car.getPatent();
                carData[1] = car.getBrand();
                carData[2] = car.getColor();
                carData[3] = car.getMotorNumber();
                carData[4] = car.getFuelTypeAsText();
                carData[5] = car.getManufacturingYear();
                carData[6] = car.getOwnerRut();
                carData[7] = car.getOwnerName();
                dtModel.addRow(carData);
                JOptionPane.showMessageDialog(this, "Consulta Realizada", "Info", 1);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al Obtener datos, revise su conexión", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una patente Válida", "Error", 0);
        }

    }//GEN-LAST:event_btnPatentActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtOwnerRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerRutActionPerformed

    private void txtOwnerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerNameActionPerformed

    private void btnListcarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListcarsActionPerformed
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al Obtener datos, revise su conexión", "Error", 0);
        }
    }//GEN-LAST:event_btnListcarsActionPerformed

    private void btnBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtModel = (DefaultTableModel) tableParkingData.getModel();
        dtModel.setRowCount(0);
        Object[] carData = new Object[8];
        String brand;
        if (!txtBrand.getText().equals("")) {
            brand = txtBrand.getText();
            try {
                ArrayList<Car> cars = CarsDAO.search_by_brand(brand);
                for (Car car : cars) {
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
                JOptionPane.showMessageDialog(this, "Consulta realizada", "Info", 1);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al Obtener datos, revise su conexión", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese marca antes de buscar", "Error", 0);
        }

    }//GEN-LAST:event_btnBrandActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtModel = (DefaultTableModel) tableParkingData.getModel();
        dtModel.setRowCount(0);
        Object[] carData = new Object[8];
        String color;
        if (!txtColor.getText().equals("")) {
            color = txtColor.getText();
            try {
                ArrayList<Car> cars = CarsDAO.search_by_color(color);
                for (Car car : cars) {
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
                JOptionPane.showMessageDialog(this, "Consulta realizada", "Info", 1);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al Obtener datos, revise su conexión", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese color antes de buscar", "Error", 0);
        }
    }//GEN-LAST:event_btnColorActionPerformed

    private void btnMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotorActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtModel = (DefaultTableModel) tableParkingData.getModel();
        dtModel.setRowCount(0);
        Object[] carData = new Object[8];
        int motorNum;
        if (!txtMotor.getText().equals("")) {
            motorNum = Integer.parseInt(txtMotor.getText());
            try {
                ArrayList<Car> cars = CarsDAO.search_by_motor(motorNum);
                for (Car car : cars) {
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
                JOptionPane.showMessageDialog(this, "Consulta realizada", "Info", 1);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al Obtener datos, revise su conexión", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese N°Motor antes de buscar", "Error", 0);
        }
    }//GEN-LAST:event_btnMotorActionPerformed

    private void btnFuelTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuelTypeActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtModel = (DefaultTableModel) tableParkingData.getModel();
        dtModel.setRowCount(0);
        Object[] carData = new Object[8];
        byte fuelType;
        if (radioBenzine.isSelected() || radioPetroleum.isSelected()) {
            fuelType = radioBenzine.isSelected() ? (byte)0 : (byte)1;
            try {
                ArrayList<Car> cars = CarsDAO.search_by_fuel_type(fuelType);
                for (Car car : cars) {
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
                JOptionPane.showMessageDialog(this, "Consulta realizada", "Info", 1);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al Obtener datos, revise su conexión", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Tipo COmbustible antes de buscar", "Error", 0);
        }
    }//GEN-LAST:event_btnFuelTypeActionPerformed

    private void btnManufacturingYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufacturingYearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtModel = (DefaultTableModel) tableParkingData.getModel();
        dtModel.setRowCount(0);
        Object[] carData = new Object[8];
        int year;
        if (!txtManufacturingYear.getText().equals("")) {
            year = Integer.parseInt(txtManufacturingYear.getText());
            try {
                ArrayList<Car> cars = CarsDAO.search_by_manufacturing_year(year);
                for (Car car : cars) {
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
                JOptionPane.showMessageDialog(this, "Consulta realizada", "Info", 1);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al Obtener datos, revise su conexión", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Año Fabricación antes de buscar", "Error", 0);
        }
    }//GEN-LAST:event_btnManufacturingYearActionPerformed

    private void btnOwnerRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOwnerRutActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtModel = (DefaultTableModel) tableParkingData.getModel();
        dtModel.setRowCount(0);
        Object[] carData = new Object[8];
        String ownerRut;
        if (!txtOwnerRut.getText().equals("")) {
            ownerRut = txtOwnerRut.getText();
            try {
                ArrayList<Car> cars = CarsDAO.search_by_owner_rut(ownerRut);
                for (Car car : cars) {
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
                JOptionPane.showMessageDialog(this, "Consulta realizada", "Info", 1);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al Obtener datos, revise su conexión", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Rut de Dueño antes de buscar", "Error", 0);
        }
    }//GEN-LAST:event_btnOwnerRutActionPerformed

    private void btnOwnerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOwnerNameActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtModel = (DefaultTableModel) tableParkingData.getModel();
        dtModel.setRowCount(0);
        Object[] carData = new Object[8];
        String ownerName;
        if (!txtOwnerName.getText().equals("")) {
            ownerName = txtOwnerName.getText();
            try {
                ArrayList<Car> cars = CarsDAO.search_by_owner_name(ownerName);
                for (Car car : cars) {
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
                JOptionPane.showMessageDialog(this, "Consulta realizada", "Info", 1);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al Obtener datos, revise su conexión", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Nombre de Dueño antes de buscar", "Error", 0);
        }
    }//GEN-LAST:event_btnOwnerNameActionPerformed

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
            java.util.logging.Logger.getLogger(FilteredReport.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilteredReport.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilteredReport.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilteredReport.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilteredReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrand;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFuelType;
    private javax.swing.JButton btnListcars;
    private javax.swing.JButton btnManufacturingYear;
    private javax.swing.JButton btnMotor;
    private javax.swing.JButton btnOwnerName;
    private javax.swing.JButton btnOwnerRut;
    private javax.swing.JButton btnPatent;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioBenzine;
    private javax.swing.JRadioButton radioPetroleum;
    private javax.swing.JTable tableParkingData;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtOwnerRut;
    private javax.swing.JTextField txtPatent;
    // End of variables declaration//GEN-END:variables
}