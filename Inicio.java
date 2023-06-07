package Vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import vista.JInternalFrame_RegiProd;
import Controlador.Reporte_Vent;



public class Inicio extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public Inicio() {
        initComponents();
        this.setSize(new Dimension(1200, 700)); // Establecer un tamaño tentativo de la pantalla
        this.setExtendedState(this.MAXIMIZED_BOTH); // Maximizar la ventana al abrir
        this.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        this.setTitle("Sistema registrador"); // Establecer el título de la ventana
        this.setLayout(null);

        // Crear un panel de escritorio para mostrar las ventanas internas
        jDesktopPane_menu = new JDesktopPane();

        // Obtener el ancho y alto de la pantalla
        int ancho1 = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto1 = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        // Establecer las dimensiones y posición del panel de escritorio
        this.jDesktopPane_menu.setBounds(0, 0, ancho1, (alto1 - 120));

        // Agregar el panel de escritorio a la ventana principal
        this.add(jDesktopPane_menu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Ventas = new javax.swing.JMenu();
        jMenu_Gastos = new javax.swing.JMenu();
        jMenu_Registro = new javax.swing.JMenu();
        jMenuItem_RegisPro = new javax.swing.JMenuItem();
        jMenuItem_RegisCa = new javax.swing.JMenuItem();
        jMenuItem_RegisGas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_EdiPro = new javax.swing.JMenuItem();
        jMenuItem_EdiCat = new javax.swing.JMenuItem();
        jMenuItem_EditGas = new javax.swing.JMenuItem();
        jMenu_Reporte = new javax.swing.JMenu();
        jMenuItem_RepoVen = new javax.swing.JMenuItem();
        jMenuItem_RepoGas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money (1).png"))); // NOI18N
        jMenu_Ventas.setText("Ventas");
        jMenu_Ventas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_Ventas.setPreferredSize(new java.awt.Dimension(150, 50));
        jMenu_Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_VentasMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_Ventas);

        jMenu_Gastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lost.png"))); // NOI18N
        jMenu_Gastos.setText("Gastos");
        jMenu_Gastos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_Gastos.setPreferredSize(new java.awt.Dimension(150, 50));
        jMenu_Gastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_GastosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_Gastos);

        jMenu_Registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/registro.png"))); // NOI18N
        jMenu_Registro.setText("Registro");
        jMenu_Registro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_Registro.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_RegisPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/product.png"))); // NOI18N
        jMenuItem_RegisPro.setText("Registrar producto");
        jMenuItem_RegisPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_RegisProActionPerformed(evt);
            }
        });
        jMenu_Registro.add(jMenuItem_RegisPro);

        jMenuItem_RegisCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/category.png"))); // NOI18N
        jMenuItem_RegisCa.setText("Registrar Categoria");
        jMenuItem_RegisCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_RegisCaActionPerformed(evt);
            }
        });
        jMenu_Registro.add(jMenuItem_RegisCa);

        jMenuItem_RegisGas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/loss.png"))); // NOI18N
        jMenuItem_RegisGas.setText("Registrar Categoria Gasto");
        jMenuItem_RegisGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_RegisGasActionPerformed(evt);
            }
        });
        jMenu_Registro.add(jMenuItem_RegisGas);

        jMenuBar1.add(jMenu_Registro);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/folder.png"))); // NOI18N
        jMenu1.setText("Editar Datos");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_EdiPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit_product.png"))); // NOI18N
        jMenuItem_EdiPro.setText("Editar productos");
        jMenuItem_EdiPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EdiProActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_EdiPro);

        jMenuItem_EdiCat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit.png"))); // NOI18N
        jMenuItem_EdiCat.setText("Editar categoria");
        jMenuItem_EdiCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EdiCatActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_EdiCat);

        jMenuItem_EditGas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit (2).png"))); // NOI18N
        jMenuItem_EditGas.setText("Editar categoria Gasto");
        jMenuItem_EditGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EditGasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_EditGas);

        jMenuBar1.add(jMenu1);

        jMenu_Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N
        jMenu_Reporte.setText("Reportes");
        jMenu_Reporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu_Reporte.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_RepoVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money (1).png"))); // NOI18N
        jMenuItem_RepoVen.setText("Generar reporte ventas");
        jMenuItem_RepoVen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_RepoVenMouseClicked(evt);
            }
        });
        jMenu_Reporte.add(jMenuItem_RepoVen);

        jMenuItem_RepoGas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lost.png"))); // NOI18N
        jMenuItem_RepoGas.setText("Generar reporte gastos");
        jMenuItem_RepoGas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_RepoGasMouseClicked(evt);
            }
        });
        jMenu_Reporte.add(jMenuItem_RepoGas);

        jMenuBar1.add(jMenu_Reporte);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_RegisCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_RegisCaActionPerformed
        JInternalFrame_RegiCate jInternalFrame_RegiCate = new JInternalFrame_RegiCate();
        jDesktopPane_menu.add(jInternalFrame_RegiCate);
        jInternalFrame_RegiCate.setVisible(true);
    }//GEN-LAST:event_jMenuItem_RegisCaActionPerformed

    private void jMenuItem_RegisProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_RegisProActionPerformed
        JInternalFrame_RegiProd jInternalFrame_RegiProd = new JInternalFrame_RegiProd();
        jDesktopPane_menu.add(jInternalFrame_RegiProd);
        jInternalFrame_RegiProd.setVisible(true);
    }//GEN-LAST:event_jMenuItem_RegisProActionPerformed

    private void jMenuItem_EdiCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EdiCatActionPerformed
        JInternalFrame_EditCate jInternalFrame_EditCate = new JInternalFrame_EditCate();
        jDesktopPane_menu.add(jInternalFrame_EditCate);
        jInternalFrame_EditCate.setVisible(true);
    }//GEN-LAST:event_jMenuItem_EdiCatActionPerformed

    private void jMenuItem_EdiProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EdiProActionPerformed
        JInternalFrame_EditProd jInternalFrame_EditProd = new JInternalFrame_EditProd();
        jDesktopPane_menu.add(jInternalFrame_EditProd);
        jInternalFrame_EditProd.setVisible(true);
    }//GEN-LAST:event_jMenuItem_EdiProActionPerformed

    private void jMenuItem_RegisGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_RegisGasActionPerformed
        JInternalFrame_RegiCateGas jInternalFrame_RegiCateGas = new JInternalFrame_RegiCateGas();
        jDesktopPane_menu.add(jInternalFrame_RegiCateGas);
        jInternalFrame_RegiCateGas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_RegisGasActionPerformed

    private void jMenuItem_EditGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EditGasActionPerformed
        JInternalFrame_EditCateGas jInternalFrame_EditCateGas = new JInternalFrame_EditCateGas();
        jDesktopPane_menu.add(jInternalFrame_EditCateGas);
        jInternalFrame_EditCateGas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_EditGasActionPerformed

    private void jMenu_VentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_VentasMouseClicked
        JInternalFrame_Vent jInternalFrame_Ventas = new JInternalFrame_Vent();
        jDesktopPane_menu.add(jInternalFrame_Ventas);
        jInternalFrame_Ventas.setVisible(true);
    }//GEN-LAST:event_jMenu_VentasMouseClicked

    private void jMenu_GastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_GastosMouseClicked
        JInternalFrame_Gas jInternalFrame_Gas = new JInternalFrame_Gas();
        jDesktopPane_menu.add(jInternalFrame_Gas);
        jInternalFrame_Gas.setVisible(true);
        
    }//GEN-LAST:event_jMenu_GastosMouseClicked

    private void jMenuItem_RepoVenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_RepoVenMouseClicked
        JInternalFrame_Reportvent jinternalframe_ReporteVent =new JInternalFrame_Reportvent();
        jDesktopPane_menu.add(jinternalframe_ReporteVent);
        jinternalframe_ReporteVent.setVisible(true);
        jinternalframe_ReporteVent.toFront();
    }//GEN-LAST:event_jMenuItem_RepoVenMouseClicked

    private void jMenuItem_RepoGasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_RepoGasMouseClicked
   JInternalFrame_ReportGas jinternalframe_ReporteGas =new JInternalFrame_ReportGas();
        jDesktopPane_menu.add(jinternalframe_ReporteGas);
        jinternalframe_ReporteGas.setVisible(true);
        jinternalframe_ReporteGas.toFront();
    }//GEN-LAST:event_jMenuItem_RepoGasMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_EdiCat;
    private javax.swing.JMenuItem jMenuItem_EdiPro;
    private javax.swing.JMenuItem jMenuItem_EditGas;
    private javax.swing.JMenuItem jMenuItem_RegisCa;
    private javax.swing.JMenuItem jMenuItem_RegisGas;
    private javax.swing.JMenuItem jMenuItem_RegisPro;
    private javax.swing.JMenuItem jMenuItem_RepoGas;
    private javax.swing.JMenuItem jMenuItem_RepoVen;
    private javax.swing.JMenu jMenu_Gastos;
    private javax.swing.JMenu jMenu_Registro;
    private javax.swing.JMenu jMenu_Reporte;
    private javax.swing.JMenu jMenu_Ventas;
    // End of variables declaration//GEN-END:variables
}
