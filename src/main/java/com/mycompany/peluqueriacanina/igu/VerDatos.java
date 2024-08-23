package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    Controladora control = null;

    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        TablaMascotas.setBackground(new java.awt.Color(153, 153, 153));
        TablaMascotas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaMascotas.setForeground(new java.awt.Color(0, 0, 0));
        TablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaMascotas.setGridColor(new java.awt.Color(204, 204, 204));
        TablaMascotas.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(TablaMascotas);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Datos de Mascotas:");

        BtnEditar.setBackground(new java.awt.Color(62, 201, 255));
        BtnEditar.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        BtnEditar.setForeground(new java.awt.Color(0, 0, 0));
        BtnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Documents\\NetBeansProjects\\PeluqueriaCanina\\Imagenes\\documentediting_editdocuments_text_documentedi_2820.png")); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.setMargin(new java.awt.Insets(2, 14, 3, 24));
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(62, 201, 255));
        BtnEliminar.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BtnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Documents\\NetBeansProjects\\PeluqueriaCanina\\Imagenes\\delete_remove_page_document_16678.png")); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setMargin(new java.awt.Insets(2, 14, 3, 18));
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnVolver.setBackground(new java.awt.Color(62, 201, 255));
        BtnVolver.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(0, 0, 0));
        BtnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\JuanC\\Documents\\NetBeansProjects\\PeluqueriaCanina\\Imagenes\\devolver.png")); // NOI18N
        BtnVolver.setText("Volver");
        BtnVolver.setMargin(new java.awt.Insets(2, 14, 3, 25));
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Visualización de Datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        //Controlamos que la tabla no esté vacia
        if (TablaMascotas.getRowCount() > 0) {
            //Conttrolamos que se haya seleccionado a una mascota
            if (TablaMascotas.getSelectedRow() != -1) {

                //obtenemos el id de la mascota a eliminar
                int num_cliente = Integer.parseInt(String.valueOf(TablaMascotas.getValueAt(TablaMascotas.getSelectedRow(), 0)));

                //llamamos al metodo borrar
                control.borrarMascota(num_cliente);

                mostrarMensaje("Mascota eliminada correctamente", "Info", "Borrado de Mascota");
                cargarTabla();

            } else {
                mostrarMensaje("No seleccionó ninguna mascota", "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed

        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.setVisible(false);
        

    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed

        //Controlamos que la tabla no esté vacia
        if (TablaMascotas.getRowCount() > 0) {
            //Controlamos que se haya seleccionado una tabla
            if (TablaMascotas.getSelectedRowCount() != -1) {
                
                 //obtenemos el id de la mascota a editar
                int num_cliente = Integer.parseInt(String.valueOf(TablaMascotas.getValueAt(TablaMascotas.getSelectedRow(), 0)));
                
                ModificarDatos md = new ModificarDatos(num_cliente);
                md.setVisible(true);
                md.setLocationRelativeTo(null);
                this.setVisible(false);
                
            } else {
                mostrarMensaje("No seleccionó ninguna mascota para modificar", "Error", "Error al modificar");
            }
        } else {
           mostrarMensaje("No hay datos para modificar en la tabla", "Info", "Error al modificar");
        }
    }//GEN-LAST:event_BtnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JTable TablaMascotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        // definimos el modelo que queremos que tenga la tabla
        DefaultTableModel tabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //establecemos los nombres de las columnas de la tabla
        String titulos[] = {"Num", "Nombre", "Raza", "Color", "Alergico", "At. Especial", "Nombre Dueño", "Cel. Dueño"};
        tabla.setColumnIdentifiers(titulos);

        //cargamos los datos desde la base de datos
        List<Mascota> listaMascotas = control.traerMascotas();

        //recorremos la lista y mostramos cada uno de los elementos en la tabla
        if (listaMascotas != null) {
            for (Mascota masco : listaMascotas) {

                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getRaza(), masco.getColor(), masco.getAlergico(), masco.getAtencion_especial(), masco.getDuenio().getNombre(), masco.getDuenio().getCelDuenio()};

                tabla.addRow(objeto);
            }

        }
        //agregamos el modelo de tabla a nuestra tabla
        TablaMascotas.setModel(tabla);
    }

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        // Mensaje de guardado exitoso
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);

        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
