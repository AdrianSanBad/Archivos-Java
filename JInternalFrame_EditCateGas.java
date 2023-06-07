package Vista;

import java.awt.Dimension;
import java.sql.Connection;
import conexion.Conexion;
import java.awt.event.MouseAdapter;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;




public class JInternalFrame_EditCateGas extends javax.swing.JInternalFrame {

    private int idCategoriaGasto;

    public JInternalFrame_EditCateGas() {
        initComponents();
        this.setSize(new Dimension(600, 400));
        this.setTitle("Gestionar Categorias");
        this.CargarTablaCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Categorias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_EliminarCate = new javax.swing.JButton();
        jButton_ActualizarCate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Descripcion = new javax.swing.JTextField();
        jLabelwallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Categorias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Categorias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 250));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administrar categoria de gasto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_EliminarCate.setBackground(new java.awt.Color(255, 51, 51));
        jButton_EliminarCate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_EliminarCate.setText("Eliminar");
        jButton_EliminarCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarCateActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_EliminarCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        jButton_ActualizarCate.setBackground(new java.awt.Color(51, 204, 0));
        jButton_ActualizarCate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ActualizarCate.setText("Actualizar");
        jButton_ActualizarCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarCateActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_ActualizarCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 130, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Descripcion:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txt_Descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 190, 80));

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ActualizarCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarCateActionPerformed
     actualizarCategoria();

    }//GEN-LAST:event_jButton_ActualizarCateActionPerformed

    private void jButton_EliminarCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarCateActionPerformed
       eliminarCategoria();
    }//GEN-LAST:event_jButton_EliminarCateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ActualizarCate;
    private javax.swing.JButton jButton_EliminarCate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_Categorias;
    private javax.swing.JTextField txt_Descripcion;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo para mostrar todas las categorias registradas
     */
    private void CargarTablaCategorias() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select idCategoriaGasto, descripcion, estado from tb_categoriaGasto";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            JInternalFrame_EditCateGas.jTable_Categorias = new JTable(model);
            JInternalFrame_EditCateGas.jScrollPane1.setViewportView(JInternalFrame_EditCateGas.jTable_Categorias);
            model.addColumn("idCategoriaGasto");
            model.addColumn("descripcion");
            model.addColumn("estado");
            while (rs.next()) {
                Object fila[] = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.err.println("Error al llenar la table de categoria" + e);
        }
        jTable_Categorias.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Categorias.rowAtPoint(e.getPoint());
                int columna_point = 0;
                if (fila_point > -1) {
                    idCategoriaGasto = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosCategoriaSeleccionada(idCategoriaGasto);
                }
            }
        }
        );
    }

    private void EnviarDatosCategoriaSeleccionada(int idCategoriaGasto) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("Select * from tb_categoriaGasto where idCategoriaGasto= '" + idCategoriaGasto + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_Descripcion.setText(rs.getString("descripcion"));

            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar categoria: " + e);
        }
    }
    private void actualizarCategoria() {
        String descripcion = txt_Descripcion.getText();
        if (idCategoriaGasto != 0 && !descripcion.isEmpty()) {
            try {
                Connection con = Conexion.conectar();
                PreparedStatement pst = con.prepareStatement("UPDATE tb_categoria SET descripcion = ? WHERE idCategoria = ?");
                pst.setString(1, descripcion);
                pst.setInt(2, idCategoriaGasto);
                int resultado = pst.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Categoría actualizada correctamente");
                    limpiarCampos();
                    CargarTablaCategorias();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar la categoría");
                }
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al actualizar categoría: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una categoría y completa la descripción");
        }
    }
    private void eliminarCategoria() {
        if (idCategoriaGasto != 0) {
            try {
                Connection con = Conexion.conectar();
                PreparedStatement pst = con.prepareStatement("DELETE FROM tb_categoria WHERE idCategoria = ?");
                pst.setInt(1, idCategoriaGasto);
                int resultado = pst.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Categoría eliminada correctamente");
                    limpiarCampos();
                    CargarTablaCategorias();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar la categoría");
                }
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al eliminar categoría: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una categoría");
        }
    }

    private void limpiarCampos() {
        txt_Descripcion.setText("");
        idCategoriaGasto = 0;
    }


}
