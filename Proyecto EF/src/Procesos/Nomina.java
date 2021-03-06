/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jacky
 */
public class Nomina extends javax.swing.JInternalFrame {
FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form Nomina
     */
String BD = "jdbc:mysql://localhost/sin";
    String Usuario = "root";
    String Clave = "";
    public Nomina() {
        initComponents();
        this.setContentPane(fondo);
        cbx_nomina();
        cbx_empleado();
        cbx_concepto();
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void Tabla() {
       
         try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);

            PreparedStatement ps = cn.prepareStatement("select * from nominaD;");
            PreparedStatement ps2 = cn.prepareStatement("select * from nominaD;");
            //pstt4.setString(1, txt_buscar.getText().trim());

            ResultSet rs = ps.executeQuery();

            ResultSet rss = ps2.executeQuery();

            if (rs.next()) {

                DefaultTableModel modelo = new DefaultTableModel();

                modelo.addColumn("codigo_nomina");
                modelo.addColumn("codigo_empleado");
                modelo.addColumn("codigo_concepto");
                

                tbl_asignacion.setModel(modelo);

                String[] dato = new String[6];

                while (rss.next()) {
                    
                    dato[0] = rss.getString(1);
                    dato[1] = rss.getString(2);
                    dato[1] = rss.getString(3);
                  
                    

                    modelo.addRow(dato);
                }
            }

        } catch (Exception e) {

        }
    }public void cbx_nomina() {
        //Codigo que permite consultar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select fecha_inicial_nomina from nominaE");

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            cbx_nomina.addItem("codigo_nomina");

            while (rs.next()) {
                cbx_nomina.addItem(rs.getString("nombre_nomina"));
            }

            rs.close();

        } catch (Exception e) {

        }
    }public void cbx_empleado() {
        //Codigo que permite consultar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select codigo_empleado from empleado");

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            cbx_nomina.addItem("codigo_empleado");

            while (rs.next()) {
                cbx_nomina.addItem(rs.getString("nombre_empleado"));
            }

            rs.close();

        } catch (Exception e) {

        }
    }
    public void cbx_concepto() {
        //Codigo que permite consultar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select codigo_concepto from concepto");

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            cbx_concepto.addItem("codigo_concepto");

            while (rs.next()) {
                cbx_concepto.addItem(rs.getString("nombre_concepto"));
            }

            rs.close();

        } catch (Exception e) {

        }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ESTADO = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        cbx_nomina = new javax.swing.JComboBox<>();
        cbx_empleado = new javax.swing.JComboBox<>();
        cbx_concepto = new javax.swing.JComboBox<>();
        lbl_nomina = new javax.swing.JLabel();
        lbl_empleado = new javax.swing.JLabel();
        lbl_concepto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_asignacion = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setText("Nomina");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Codigo Nomina");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Codigo Empleado");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Codigo Concepto");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Buscar (Codigo)");

        cbx_nomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_nominaMouseClicked(evt);
            }
        });
        cbx_nomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_nominaActionPerformed(evt);
            }
        });

        cbx_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_empleadoMouseClicked(evt);
            }
        });
        cbx_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_empleadoActionPerformed(evt);
            }
        });

        cbx_concepto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_conceptoMouseClicked(evt);
            }
        });
        cbx_concepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_conceptoActionPerformed(evt);
            }
        });

        lbl_nomina.setText("Codigo");

        lbl_empleado.setText("Codigo");

        lbl_concepto.setText("Codigo");

        tbl_asignacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Nomina", "Codigo Empleado", "Codigo Concepto"
            }
        ));
        tbl_asignacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_asignacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_asignacion);

        jButton5.setText("Mostrar datos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 0));
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 204, 0));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 255, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 204, 0));
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(428, 428, 428))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addGap(407, 407, 407))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_nomina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_concepto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_nomina)
                                            .addComponent(lbl_empleado)
                                            .addComponent(lbl_concepto))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(110, 110, 110))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbx_nomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(cbx_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(cbx_concepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nomina)
                                .addGap(14, 14, 14)
                                .addComponent(lbl_empleado)
                                .addGap(14, 14, 14)
                                .addComponent(lbl_concepto))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(2, 2, 2)
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton2))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_nominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_nominaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_nominaMouseClicked

    private void cbx_nominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_nominaActionPerformed

        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select codigo_nomina from nominaE where fecha_inicial_nomina=?");
            pst.setString(1, cbx_nomina.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            //cbx_facultad.addItem("Facultad");
            if (rs.next()) {
                lbl_nomina.setText(rs.getString("codigo_nomina"));
            }

            //rs.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cbx_nominaActionPerformed

    private void cbx_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_empleadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_empleadoMouseClicked

    private void cbx_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_empleadoActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select codigo_empleado from empleado where nombre_empleado=?");
            pst.setString(1, cbx_empleado.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            //llenar combobox para el comentaario
            //cbx_facultad.addItem("Facultad");
            if (rs.next()) {
                lbl_empleado.setText(rs.getString("codigo_empleado"));
            }

            //rs.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cbx_empleadoActionPerformed

    private void cbx_conceptoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_conceptoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_conceptoMouseClicked

    private void cbx_conceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_conceptoActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select codigo_concepto from concepto where nombre_concepto=?");
            pst.setString(1, cbx_concepto.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            
            if (rs.next()) {
                lbl_concepto.setText(rs.getString("codigo_concepto"));
            }

            //rs.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cbx_conceptoActionPerformed

    private void tbl_asignacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_asignacionMouseClicked
        // TODO add your handling code here:
        int seleccionar = tbl_asignacion.rowAtPoint(evt.getPoint());

     

        lbl_nomina.setText(String.valueOf(tbl_asignacion.getValueAt(seleccionar, 0)));
        lbl_empleado.setText(String.valueOf(tbl_asignacion.getValueAt(seleccionar, 1)));
        lbl_concepto.setText(String.valueOf(tbl_asignacion.getValueAt(seleccionar, 2)));
        

        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select fecha_inicial_nomina from nominaE where codigo_nomina=?;");
            pst.setString(1, lbl_nomina.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cbx_nomina.setSelectedItem(rs.getString("fecha_inicial_nomina"));
            }
        } catch (Exception e) {
        }

        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select nombre_empleado from empleado where codigo_empleado=?;");
            pst.setString(1, lbl_empleado.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cbx_empleado.setSelectedItem(rs.getString("nombre_empleado"));
            }
        } catch (Exception e) {
        }

        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select nombre_concepto from concepto where codigo_concepto=?;");
            pst.setString(1, lbl_concepto.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cbx_concepto.setSelectedItem(rs.getString("nombre_jornada"));
            }
        } catch (Exception e) {
        }

        
    }//GEN-LAST:event_tbl_asignacionMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Tabla();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("insert into empleado values(?,?,?)");

          
            pst.setString(1, lbl_nomina.getText().trim());
            pst.setString(2, lbl_empleado.getText().trim());
            pst.setString(3, lbl_concepto.getText().trim());
           
            pst.setString(4, "0");

            pst.executeUpdate();

            cbx_nomina.setSelectedIndex(0);
            cbx_empleado.setSelectedIndex(0);
            cbx_concepto.setSelectedIndex(0);

            lbl_nomina.setText("Codigo");
            lbl_empleado.setText("Codigo");
           lbl_concepto.setText("Codigo");

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "¡Error en registro!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Codigo que permite modificar registros en la base de datos
        try {
            String ID = lbl_nomina.getText().trim();

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("update nominaD set codigo_nomina= ?, codigo_empleado=?, codigo_concepto=? where codigo_nomina = " + ID);

          
            pst.setString(1, lbl_nomina.getText().trim());
            pst.setString(2, lbl_empleado.getText().trim());
            pst.setString(3, lbl_concepto.getText().trim());


            pst.executeUpdate();

            cbx_nomina.setSelectedIndex(0);
            cbx_empleado.setSelectedIndex(0);
            cbx_concepto.setSelectedIndex(0);

            lbl_nomina.setText("Codigo");
            lbl_empleado.setText("Codigo");
           lbl_concepto.setText("Codigo");

            JOptionPane.showMessageDialog(this, "¡MODIFICACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Tabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en modificación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Codigo que permite borrar registros en la base de datos
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("delete from nominaD where codigo_nomina = ?");

            pst.setString(1, lbl_nomina.getText().trim());
            pst.executeUpdate();

            cbx_nomina.setSelectedIndex(0);
            cbx_empleado.setSelectedIndex(0);
            cbx_concepto.setSelectedIndex(0);

            lbl_nomina.setText("Codigo");
            lbl_empleado.setText("Codigo");
           lbl_concepto.setText("Codigo");

            JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Tabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en eliminación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //Codigo que permite consultar registros en la base de datos
        
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);

            PreparedStatement pstt4 = cn.prepareStatement("select * from nominaD where codigo_nomina=?");
            pstt4.setString(1, txtbuscar.getText().trim());

            ResultSet rss4 = pstt4.executeQuery();

            // hacer la copia del query para que la tabla empiece desde 1
            PreparedStatement ps = cn.prepareStatement("select * from nominaD where codigo_nomina=?");
            ps.setString(1, txtbuscar.getText().trim());
            

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                DefaultTableModel modelo = new DefaultTableModel();

                modelo.addColumn("codigo_nomina");
                modelo.addColumn("codigo_empleado");
                modelo.addColumn("codigo_concepto");

                tbl_asignacion.setModel(modelo);

                String[] dato = new String[3];

                while (rss4.next()) {
              
                    dato[0] = rss4.getString(1);
                    dato[1] = rss4.getString(2);
                    dato[2] = rss4.getString(3);
                
                    modelo.addRow(dato);

                }
            } else {
                JOptionPane.showMessageDialog(null, " no Registrado");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ESTADO;
    private javax.swing.JLabel Label1;
    private javax.swing.JComboBox<String> cbx_concepto;
    private javax.swing.JComboBox<String> cbx_empleado;
    private javax.swing.JComboBox<String> cbx_nomina;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_concepto;
    private javax.swing.JLabel lbl_empleado;
    private javax.swing.JLabel lbl_nomina;
    private javax.swing.JTable tbl_asignacion;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel
{
    private Image imagen;
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/Mantenimientos/unnamed.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
        
    }
}}
