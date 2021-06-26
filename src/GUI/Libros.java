/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author melid
 */
public class Libros extends javax.swing.JInternalFrame {

    java.util.List<Entidades.Autor> lista = null;
    BD.LibroData ld = new BD.LibroData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    Entidades.Libro libro = null;
    /**
     * Creates new form Libros
     */
    public Libros() {
        initComponents();
        actualizarCBAutores();      
    }

    private void actualizarCBAutores() {
        cbAutor.removeAllItems();
        //cbAutor.addItem(new Entidades.Autor());
        //cbAutor.setSelectedIndex(0);
        BD.AutorData ad = new BD.AutorData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
        lista = ad.obtenerAutores();
        lista.add(0, null);
        for (Entidades.Autor autor : lista) {
            cbAutor.addItem(autor);
        }
    }
    
    public void ver(Entidades.Libro l){
        if(l != null){
            libro = l;
            tfId.setText(libro.getId() + "");
            tfIsbn.setText(libro.getIsbn() + "");
            tfTitulo.setText(libro.getNombre());
            tfEditorial.setText(libro.getEditorial());
            cbAutor.setSelectedItem(lista.get(libro.getAutor().getIdAutor()));
            ycAnio.setYear(libro.getAño());
            boolean estado = false;
            if (libro.getEstado() == 1) {
                estado = true;
            }
            cbEstado.setSelected(estado);
            tfTipo.setText(libro.getTipo());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfTitulo = new javax.swing.JTextField();
        tfEditorial = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        btnBuscarIsbn = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfIsbn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBuscarId = new javax.swing.JButton();
        cbEstado = new javax.swing.JCheckBox();
        tfTipo = new javax.swing.JTextField();
        ycAnio = new com.toedter.calendar.JYearChooser();
        jbGuardar = new javax.swing.JButton();
        cbAutor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Libros");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libros.png"))); // NOI18N

        jLabel2.setText("ID:");

        jLabel4.setText("Titulo:");

        jLabel5.setText("Editorial:");

        jLabel6.setText("Tipo:");

        jLabel7.setText("Año:");

        jbNuevo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        jbNuevo.setText("NUEVO");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        btnBuscarIsbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        btnBuscarIsbn.setText("Buscar [ISBN]");
        btnBuscarIsbn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnBuscarIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIsbnActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel8.setText("Autor:");

        jLabel9.setText("ISBN:");

        btnBuscarId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        btnBuscarId.setText("Buscar [ID]");
        btnBuscarId.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdActionPerformed(evt);
            }
        });

        cbEstado.setSelected(true);
        cbEstado.setText("Estado");

        ycAnio.setMaximum(4000);

        jbGuardar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ver.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfEditorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ycAnio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(cbEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado)
                    .addComponent(btnBuscarId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIsbn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(ycAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo)
                    .addComponent(btnModificar))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbAutor, tfEditorial, tfId, tfIsbn, tfTipo, tfTitulo, ycAnio});

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnBuscarIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIsbnActionPerformed
        actualizarCBAutores();
        if(tfIsbn.getText()==""){
            mensaje("No se ha ingresado un ISBN, por favor, ingrese uno.");
            return;
        }
        if(!(tfIsbn.getText().chars().allMatch( Character::isDigit ))){
            mensaje("El ISBN debe ser de tipo numerico, por favor, ingreseló nuevamente");
            return;
        }
        long isbn = Long.parseLong(tfIsbn.getText());
        libro = ld.buscarLibro(isbn);
        if(libro==null){
            mensaje("No se ha encontrado un libro con el ISBN ingresado.");
            return;
        }
        ver(libro);
    }//GEN-LAST:event_btnBuscarIsbnActionPerformed

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed
        actualizarCBAutores();
        if(tfId.getText().isEmpty()){
            mensaje("No se ha ingresado un ID, por favor, ingrese uno.");
            return;
        }
        if(!(tfId.getText().chars().allMatch( Character::isDigit ))){
            mensaje("El ID debe ser de tipo numerico, por favor, ingreseló nuevamente");
            return;
        }
        int id = Integer.parseInt(tfId.getText());
        libro = ld.buscarLibroXId(id);
        if(libro == null){
            mensaje("No se ha encontrado un libro con el ID ingresado.");
            return;
        }
        ver(libro);
    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        tfId.setText("");
        tfIsbn.setText("");
        tfTitulo.setText("");
        tfEditorial.setText("");
        cbAutor.setSelectedItem(null); //de autores
        ycAnio.setYear(Integer.parseInt(java.time.Year.now() + ""));
        cbEstado.setSelected(true); //nuevo activado
        tfTipo.setText("");

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        //System.out.println(cbAutor.getSelectedItem().toString());
        if(tfIsbn.getText().isEmpty()){
            mensaje("No se ha ingresado un ISBN, por favor, ingrese uno.");
            return;
        }
        if(!(tfIsbn.getText().chars().allMatch( Character::isDigit ))){
            mensaje("El ISBN debe ser de tipo numerico, por favor, ingreseló nuevamente");
            return;
        }
        int rt=0;
        //actualizarCBAutores();
        int aux = 0;
        libro = new Entidades.Libro();
        if(cbAutor.getSelectedIndex() <= 0){
            mensaje("Por favor, elija un autor.");
            return;
        }
        libro.setAutor((Entidades.Autor)cbAutor.getSelectedItem());
        if(libro.getAutor() == null){
            mensaje("Error al seleccionar al autor");
            return;
        }
        if(libro.getAutor().getEstado() == 0){
            mensaje("El autor esta inactivo");
            return;
        }
        libro.setAño(Short.parseShort(ycAnio.getYear() + ""));
        if (ld.buscarLibro(Long.parseLong(tfIsbn.getText())) == null) {
            libro.setIsbn(Long.parseLong(tfIsbn.getText()));
        } else {
            mensaje("El ISBN ingresado ya existe, intente con otro.");
            tfIsbn.setText("");
            return;
        }
        libro.setEditorial(tfEditorial.getText());
        if (cbEstado.isSelected()) {
            aux = 1;
        }
        libro.setEstado(aux);
        libro.setNombre(tfTitulo.getText());
        libro.setTipo(tfTipo.getText());
        rt = ld.guardar(libro);
        if (rt>0) {
            mensaje("¡Libro guardado con exito!");
        } else {
            mensaje("¡Error al guardar libro!");
        }
        tfId.setText(rt+"");
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        actualizarCBAutores();
        if(libro != null) ver(libro);
        else jbNuevoActionPerformed(null);
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(libro != null && libro.getAutor() != null){
            Principal.abrir(Principal.VISTAS.AUTOR, libro.getAutor());
        }else mensaje("Error con el Autor del libro, busque o cree uno.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(libro != null){
            long isbn;
            String titulo, editorial, tipo;
            int id, anio, estado;
            Entidades.Autor autor;
            boolean modificar = false;
            //modificar isbn?
            if(tfIsbn.getText().isEmpty()){
                mensaje("No se ha ingresado un ISBN, por favor, ingrese uno.");
                return;
            }
            if(!(tfIsbn.getText().chars().allMatch( Character::isDigit ))){
                mensaje("El ISBN debe ser de tipo numerico, por favor, ingreseló nuevamente.");
                return;
            }
            if(cbAutor.getSelectedIndex() <= 0){
                mensaje("Por favor, elija un autor.");
                return;
            }
            id = libro.getId();
            isbn = Long.parseLong(tfIsbn.getText());
            titulo = tfTitulo.getText();
            editorial = tfEditorial.getText();
            autor = cbAutor.getModel().getElementAt(cbAutor.getSelectedIndex());
            tipo = tfTipo.getText();
            anio = ycAnio.getValue();
            estado = cbEstado.isSelected() ? 1 : 0;
            if(libro.getIsbn() != isbn) modificar = true;
            if(!libro.getNombre().equals(titulo)) modificar = true;
            if(!libro.getEditorial().equals(editorial)) modificar = true;
            if(libro.getAutor().getIdAutor() != autor.getIdAutor()) modificar = true;
            if(!libro.getTipo().equals(tipo)) modificar = true;
            if(libro.getAño() != anio) modificar = true;
            if(libro.getEstado() != estado) modificar = true;
            if(modificar){
                libro = new Entidades.Libro(
                        isbn,
                        titulo,
                        tipo,
                        editorial,
                        (short)anio,
                        autor,
                        estado,
                        id
                );
                if(ld.modificar(libro) == 0){
                    mensaje("Error al modificar el libro...");
                }else{
                    mensaje("El libro fue modificado...");
                }
            }else mensaje("No hay cambios para modificar...");
        }else mensaje("El libro no esta registrado...");
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnBuscarIsbn;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<Entidades.Autor> cbAutor;
    private javax.swing.JCheckBox cbEstado;
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
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField tfEditorial;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfIsbn;
    private javax.swing.JTextField tfTipo;
    private javax.swing.JTextField tfTitulo;
    private com.toedter.calendar.JYearChooser ycAnio;
    // End of variables declaration//GEN-END:variables

    private void mensaje(String msg) {
        javax.swing.JOptionPane.showMessageDialog(this, msg);
    }
}
