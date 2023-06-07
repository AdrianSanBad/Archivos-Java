package Vista;

import Controlador.Ctrl_RegistroGasto;
import conexion.Conexion;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.CategoriaGasto;
import modelo.RegistroGasto;
import javax.swing.DefaultComboBoxModel;

public class JInternalFrame_Gas extends javax.swing.JInternalFrame {

    public JInternalFrame_Gas() {
        initComponents();
        this.setSize(new Dimension(403, 257));
        this.setTitle("Nueva categoria");
        this.cargarComboCategoria();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_Categoria = new javax.swing.JComboBox<>();
        txt_costo = new javax.swing.JTextField();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar gasto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 170, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion gasto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoria:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Costo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jComboBox_Categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo de gasto:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, -1));

        txt_costo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 170, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   RegistroGasto registroGasto = new RegistroGasto();
Ctrl_RegistroGasto controlGasto = new Ctrl_RegistroGasto();

// Validar campos vacíos
if (txt_descripcion.getText().isEmpty() || txt_costo.getText().isEmpty() || jComboBox_Categoria.getSelectedItem() == null) {
    JOptionPane.showMessageDialog(null, "Completa todos los campos");
} else {
    registroGasto.setDescripcion(txt_descripcion.getText().trim());
    registroGasto.setCosto(Double.parseDouble(txt_costo.getText().trim()));

    // Obtener la descripción de la categoría seleccionada del JComboBox
    String descripcionCategoria = (String) jComboBox_Categoria.getSelectedItem();
    registroGasto.setDescripcion(descripcionCategoria);

    registroGasto.setEstado(1);

    if (controlGasto.guardar(registroGasto)) {
        JOptionPane.showMessageDialog(null, "Registro guardado");
    } else {
        JOptionPane.showMessageDialog(null, "Error al guardar");
    }
}

// Limpiar campos
txt_descripcion.setText("");
txt_costo.setText("");



    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_Categoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables
// Método para cargar las categorías de gasto en el JComboBox
private void cargarComboCategoria() {
    Connection cn = Conexion.conectar();
    String sql = "SELECT * FROM tb_categoriaGasto";
    try (Statement st = cn.createStatement();
         ResultSet rs = st.executeQuery(sql)) {
        
        jComboBox_Categoria.removeAllItems(); // Limpiar los elementos existentes
        
        jComboBox_Categoria.addItem("Seleccione categoría de gasto"); // Agregar el primer elemento
        
        while (rs.next()) {
            String descripcion = rs.getString("descripcion");
            
            // Agregar la descripción de la categoría al JComboBox existente
            jComboBox_Categoria.addItem(descripcion);
        }
        
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al cargar las categorías de gasto: " + e.getMessage());
    }
}

}

