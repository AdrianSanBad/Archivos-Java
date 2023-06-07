package Vista;

import conexion.Conexion;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CabeceraVenta;
import modelo.DetalleVenta;
import Controlador.Ctrl_RegistrarVenta;

public class JInternalFrame_Vent extends javax.swing.JInternalFrame {

    //Modelo de los datos
    private DefaultTableModel modeloDatosProductos;
    //lista para el detalle de venta de los productos
    ArrayList<DetalleVenta> listaProductos = new ArrayList<>();
    private DetalleVenta producto;

    private int idProducto = 0;
    private String nombre = "";
    private int cantidadProductoBBDD = 0;
    private double precioUnitario = 0.0;

    private int cantidad = 0;//cantidad de productos a comprar
    private double subtotal = 0.0;//cantidad por precio
    private double totalPagar = 0.0;

    //variable para calculos globales
    private double totalPagarGeneral = 0.0;
    //fin de variable de calculos globales

    private int auxIdDetalle = 1;//id del detalle de venta

    public JInternalFrame_Vent() {
        initComponents();
        //insertar imagen en nuestro JLabel
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(800, 600, WIDTH));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        this.CargarComboProductos();
        this.inicializarTablaProducto();

    }

    //metodo para inicializar la tabla de los productos
    private void inicializarTablaProducto() {
        modeloDatosProductos = new DefaultTableModel();
        //añadir columnas
        modeloDatosProductos.addColumn("N");
        modeloDatosProductos.addColumn("Nombre");
        modeloDatosProductos.addColumn("Cantidad");
        modeloDatosProductos.addColumn("P. Unitario");
        modeloDatosProductos.addColumn("Total Pagar");
        modeloDatosProductos.addColumn("Accion");
        //agregar los datos del modelo a la tabla
        this.jTable_productos.setModel(modeloDatosProductos);
    }

    //metodo para presentar la informacion de la tabla DetalleVenta
    private void listaTablaProductos() {
        this.modeloDatosProductos.setRowCount(listaProductos.size());
        for (int i = 0; i < listaProductos.size(); i++) {
            this.modeloDatosProductos.setValueAt(i + 1, i, 0);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getNombre(), i, 1);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getCantidad(), i, 2);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getPrecioUnitario(), i, 3);
            this.modeloDatosProductos.setValueAt(listaProductos.get(i).getTotalPagar(), i, 4);
            this.modeloDatosProductos.setValueAt("Eliminar", i, 5);//aqui luego poner un boton de eliminar
        }
        //añadir al Jtable
        jTable_productos.setModel(modeloDatosProductos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox_producto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jButton_añadir_producto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_total_pagar = new javax.swing.JTextField();
        txt_efectivo = new javax.swing.JTextField();
        txt_cambio = new javax.swing.JTextField();
        jButton_calcular_cambio = new javax.swing.JButton();
        jButton_RegistrarVenta = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jComboBox_producto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione producto:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 80, -1));

        txt_cantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 60, -1));

        jButton_añadir_producto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_añadir_producto.setText("Añadir Productos");
        jButton_añadir_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_añadir_productoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_añadir_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 150, -1));

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_productos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 740, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total a pagar:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Efectivo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Cambio:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txt_total_pagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_total_pagar.setEnabled(false);
        jPanel2.add(txt_total_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, -1));

        txt_efectivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(txt_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 120, -1));

        txt_cambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_cambio.setEnabled(false);
        jPanel2.add(txt_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 120, -1));

        jButton_calcular_cambio.setBackground(new java.awt.Color(51, 255, 255));
        jButton_calcular_cambio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_calcular_cambio.setText("Calcular Cambio");
        jButton_calcular_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_calcular_cambioActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_calcular_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 130, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 250, 210));

        jButton_RegistrarVenta.setBackground(new java.awt.Color(51, 255, 255));
        jButton_RegistrarVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_RegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cash-machine.png"))); // NOI18N
        jButton_RegistrarVenta.setText("Registrar Venta");
        jButton_RegistrarVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_RegistrarVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_RegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 170, 100));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_añadir_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_añadir_productoActionPerformed
        String combo = this.jComboBox_producto.getSelectedItem().toString();
// Validar que se haya seleccionado un producto
        if (combo.equalsIgnoreCase("Seleccione producto:")) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        } else {
            // Validar que se haya ingresado una cantidad
            if (!txt_cantidad.getText().isEmpty()) {
                // Validar que el usuario no ingrese caracteres no numéricos
                boolean validacion = validar(txt_cantidad.getText());
                if (validacion == true) {
                    // Validar que la cantidad sea mayor a cero
                    if (Integer.parseInt(txt_cantidad.getText()) > 0) {
                        cantidad = Integer.parseInt(txt_cantidad.getText());
                        // Ejecutar método para obtener datos del producto
                        this.DatosDelProducto();

                        subtotal = precioUnitario * cantidad;
                        totalPagar = subtotal;

                        // Redondear decimales
                        subtotal = (double) Math.round(subtotal * 100) / 100;
                        totalPagar = (double) Math.round(totalPagar * 100) / 100;

                        // Crear un nuevo producto
                        producto = new DetalleVenta(auxIdDetalle, //idDetalleVenta
                                1, //idCabecera
                                idProducto,
                                nombre,
                                Integer.parseInt(txt_cantidad.getText()),
                                precioUnitario,
                                totalPagar,
                                1//estado
                        );
                        // Añadir a la lista de productos
                        listaProductos.add(producto);
                        JOptionPane.showMessageDialog(null, "Producto Agregado");
                        auxIdDetalle++;
                        txt_cantidad.setText("");// Limpiar el campo de cantidad
                        // Volver a cargar el combo de productos
                        this.CargarComboProductos();
                        this.CalcularTotalPagar();
                        txt_efectivo.setEnabled(true);
                        jButton_calcular_cambio.setEnabled(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero (0), ni negativa");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numéricos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa la cantidad de productos");
            }
        }
// Llamar al método listaTablaProductos()
        this.listaTablaProductos();


    }//GEN-LAST:event_jButton_añadir_productoActionPerformed

    private void jButton_calcular_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_calcular_cambioActionPerformed
        if (!txt_efectivo.getText().isEmpty()) {
            // Validar que el usuario no ingrese otros caracteres no numéricos
            boolean validacion = validarDouble(txt_efectivo.getText());
            if (validacion == true) {
                // Validar que el efectivo sea mayor a cero
                double efc = Double.parseDouble(txt_efectivo.getText().trim());
                double top = Double.parseDouble(txt_total_pagar.getText().trim());

                if (efc < top) {
                    JOptionPane.showMessageDialog(null, "El Dinero en efectivo no es suficiente");
                } else {
                    // Calcular el cambio y redondearlo
                    double cambio = (efc - top);
                    double cambi = (double) Math.round(cambio * 100d) / 100;
                    String camb = String.valueOf(cambi);
                    txt_cambio.setText(camb);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se admiten caracteres no numéricos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese dinero en efectivo para calcular el cambio");
        }

    }//GEN-LAST:event_jButton_calcular_cambioActionPerformed

    private void jButton_RegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarVentaActionPerformed
        CabeceraVenta cabeceraVenta = new CabeceraVenta();
        DetalleVenta detalleVenta = new DetalleVenta();
        Ctrl_RegistrarVenta controlVenta = new Ctrl_RegistrarVenta();

        String fechaActual = "";
        Date date = new Date();
        fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);

        if (listaProductos.size() > 0) {
            // Registrar cabecera de venta
            cabeceraVenta.setIdCabeceraventa(0);
            cabeceraVenta.setValorPagar(Double.parseDouble(txt_total_pagar.getText()));
            cabeceraVenta.setFechaVenta(fechaActual);
            cabeceraVenta.setEstado(1);

            if (controlVenta.guardar(cabeceraVenta)) {
                JOptionPane.showMessageDialog(null, "¡Venta Registrada!");

                // Guardar detalle de venta
                for (DetalleVenta elemento : listaProductos) {
                    detalleVenta.setIdDetalleVenta(0);
                    detalleVenta.setIdCabeceraVenta(0);
                    detalleVenta.setIdProducto(elemento.getIdProducto());
                    detalleVenta.setCantidad(elemento.getCantidad());
                    detalleVenta.setPrecioUnitario(elemento.getPrecioUnitario());
                    detalleVenta.setTotalPagar(elemento.getTotalPagar());
                    detalleVenta.setEstado(1);

                    if (controlVenta.guardarDetalle(detalleVenta)) {
                        // System.out.println("Detalle de Venta Registrado");

                        txt_total_pagar.setText("0.0");
                        txt_efectivo.setText("");
                        txt_cambio.setText("0.0");
                        auxIdDetalle = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "¡Error al guardar detalle de venta!");
                    }
                }
                // Vaciar la lista de productos
                listaProductos.clear();
                listaTablaProductos();
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al guardar cabecera de venta!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Seleccione un producto!");
        }


    }//GEN-LAST:event_jButton_RegistrarVentaActionPerformed
    int idArrayList = 0;
    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked

// Obtener la fila y columna en la que se hizo clic
        int fila_point = jTable_productos.rowAtPoint(evt.getPoint());
        int columna_point = 0;
        if (fila_point > -1) {
            idArrayList = (int) modeloDatosProductos.getValueAt(fila_point, columna_point);
        }

// Mostrar un cuadro de diálogo de confirmación para eliminar el producto
        int opcion = JOptionPane.showConfirmDialog(null, "¿Eliminar Producto?");
// opciones de confirmación del diálogo (si = 0; no = 1; cancelar = 2; cerrar = -1)
        switch (opcion) {
            case 0: // si se presiona "sí"
                listaProductos.remove(idArrayList - 1);
                this.CalcularTotalPagar();
                this.listaTablaProductos();
                break;
            case 1: // si se presiona "no"
                break;
            default: // si se presiona "cancelar" (2) o "cerrar" (-1)
                break;
        }

    }//GEN-LAST:event_jTable_productosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_RegistrarVenta;
    private javax.swing.JButton jButton_añadir_producto;
    private javax.swing.JButton jButton_calcular_cambio;
    private javax.swing.JComboBox<String> jComboBox_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_efectivo;
    public static javax.swing.JTextField txt_total_pagar;
    // End of variables declaration//GEN-END:variables

    // Método para cargar los productos en el JComboBox
    private void CargarComboProductos() {
        Connection cn = Conexion.conectar();
        String sql = "SELECT * FROM tb_productos";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_producto.removeAllItems();
            jComboBox_producto.addItem("Seleccione producto:");
            while (rs.next()) {
                jComboBox_producto.addItem(rs.getString("nombre"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar productos!" + e);
        }
    }

    /*
    Método para validar que el usuario no ingrese caracteres no numéricos
     */
    private boolean validar(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /*
    Método para mostrar los datos del producto seleccionado
     */
    private void DatosDelProducto() {
        try {
            String sql = "SELECT * FROM tb_productos WHERE nombre = '" + this.jComboBox_producto.getSelectedItem() + "'";
            Connection cn = Conexion.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                idProducto = rs.getInt("idProducto");
                nombre = rs.getString("nombre");
                precioUnitario = rs.getDouble("precio");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del producto: " + e);
        }
    }

    /*
    Método para calcular el total a pagar de todos los productos agregados
     */
    private void CalcularTotalPagar() {
        totalPagarGeneral = 0;
        for (DetalleVenta elemento : listaProductos) {
            totalPagarGeneral += elemento.getTotalPagar();
        }
        // Redondear decimales
        totalPagarGeneral = (double) Math.round(totalPagarGeneral * 100) / 100;
        // Enviar datos a la vista
        txt_total_pagar.setText(String.valueOf(totalPagarGeneral));
    }

    /*
    Método para validar que el usuario no ingrese caracteres no numéricos
     */
    private boolean validarDouble(String valor) {
        try {
            double num = Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
