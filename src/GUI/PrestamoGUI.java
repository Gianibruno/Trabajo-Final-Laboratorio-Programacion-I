/*
 * GUI de Prestamo
 */
package GUI;

/**
 * Vista de Prestamo
 * @author Pablo
 */
public class PrestamoGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form PrestamoGUI
     */
    public PrestamoGUI() {
        initComponents();
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        panelPrestamo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        datoIdPrestamo = new javax.swing.JLabel();
        datoLector = new javax.swing.JTextField();
        datoEjemplar = new javax.swing.JTextField();
        datoFechaPrestamo = new com.toedter.calendar.JDateChooser();
        datoFechaDevolucion = new com.toedter.calendar.JDateChooser();
        btnModoLector = new javax.swing.JButton();
        btnModoEjemplar = new javax.swing.JButton();
        btnFechaPrestamo = new javax.swing.JButton();
        btnFechaDevolucion = new javax.swing.JButton();
        panelOpciones = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnPrestar = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelLector = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaLector = new javax.swing.JList<>();
        buscarLector = new javax.swing.JTextField();
        btnBuscarLector = new javax.swing.JButton();
        btnVolverLector = new javax.swing.JButton();
        panelEjemplar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEjemplar = new javax.swing.JList<>();
        buscarEjemplar = new javax.swing.JTextField();
        btnBuscarEjemplar = new javax.swing.JButton();
        btnVolverEjemplar = new javax.swing.JButton();
        panelBuscarPrestamo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buscarPrestamo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPrestamos = new javax.swing.JList<>();
        btnBuscarPrestamo = new javax.swing.JButton();
        btnVolverPrestamo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Prestamos");

        Titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Registro de Prestamos");

        jLabel7.setText("Prestamo: (id)");

        jLabel8.setText("Lector:");

        jLabel9.setText("Ejemplar:");

        jLabel10.setText("Fecha del Prestamo:");

        jLabel11.setText("Fecha de Devolución:");

        datoIdPrestamo.setText("0");

        datoLector.setEnabled(false);

        datoEjemplar.setEnabled(false);

        datoFechaPrestamo.setDateFormatString("dd/MM/yyyy");
        datoFechaPrestamo.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
        datoFechaPrestamo.setEnabled(false);

        datoFechaDevolucion.setDateFormatString("dd/MM/yyyy");
        datoFechaDevolucion.setDate(null);
        datoFechaDevolucion.setEnabled(false);

        btnModoLector.setText("Seleccionar");
        btnModoLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoLectorActionPerformed(evt);
            }
        });

        btnModoEjemplar.setText("Seleccionar");
        btnModoEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoEjemplarActionPerformed(evt);
            }
        });

        btnFechaPrestamo.setText("Modificar");
        btnFechaPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaPrestamoActionPerformed(evt);
            }
        });

        btnFechaDevolucion.setText("Modificar");
        btnFechaDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaDevolucionActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnPrestar.setVisible(false);
        btnPrestar.setText("Prestar");
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });

        btnRecibir.setVisible(false);
        btnRecibir.setText("Recibir");
        btnRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirActionPerformed(evt);
            }
        });

        btnGuardar.setVisible(false);
        btnGuardar.setText("Actualizar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrestar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecibir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnPrestar)
                    .addComponent(btnRecibir)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrestamoLayout = new javax.swing.GroupLayout(panelPrestamo);
        panelPrestamo.setLayout(panelPrestamoLayout);
        panelPrestamoLayout.setHorizontalGroup(
            panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestamoLayout.createSequentialGroup()
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrestamoLayout.createSequentialGroup()
                        .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrestamoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrestamoLayout.createSequentialGroup()
                                        .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelPrestamoLayout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(jLabel9))
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(datoEjemplar)
                                            .addComponent(datoFechaPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(datoFechaDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(panelPrestamoLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(datoIdPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(panelPrestamoLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datoLector)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModoLector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModoEjemplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFechaDevolucion)
                            .addComponent(btnFechaPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelPrestamoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelPrestamoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFechaDevolucion, btnFechaPrestamo, btnModoEjemplar, btnModoLector});

        panelPrestamoLayout.setVerticalGroup(
            panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(datoIdPrestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(datoLector, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModoLector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(datoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModoEjemplar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(btnFechaPrestamo))
                    .addComponent(datoFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(btnFechaDevolucion))
                    .addComponent(datoFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrestamoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {datoEjemplar, datoFechaDevolucion, datoFechaPrestamo, datoLector});

        jLabel2.setText("Selecciona un Lector:");

        listaLector.setModel(new javax.swing.DefaultListModel<Entidades.Lector>());
        listaLector.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaLector.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaLectorValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaLector);

        btnBuscarLector.setText("Buscar");
        btnBuscarLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLectorActionPerformed(evt);
            }
        });

        btnVolverLector.setText("Volver");
        btnVolverLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverLectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLectorLayout = new javax.swing.GroupLayout(panelLector);
        panelLector.setLayout(panelLectorLayout);
        panelLectorLayout.setHorizontalGroup(
            panelLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLectorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelLectorLayout.createSequentialGroup()
                        .addComponent(buscarLector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarLector))
                    .addGroup(panelLectorLayout.createSequentialGroup()
                        .addGroup(panelLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnVolverLector))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLectorLayout.setVerticalGroup(
            panelLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLectorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverLector)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Selecciona un Ejemplar de un Libro:");

        listaEjemplar.setModel(new javax.swing.DefaultListModel<Entidades.Ejemplar>());
        listaEjemplar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaEjemplar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaEjemplarValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaEjemplar);

        btnBuscarEjemplar.setText("Buscar");
        btnBuscarEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEjemplarActionPerformed(evt);
            }
        });

        btnVolverEjemplar.setText("Volver");
        btnVolverEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverEjemplarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEjemplarLayout = new javax.swing.GroupLayout(panelEjemplar);
        panelEjemplar.setLayout(panelEjemplarLayout);
        panelEjemplarLayout.setHorizontalGroup(
            panelEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEjemplarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEjemplarLayout.createSequentialGroup()
                        .addComponent(buscarEjemplar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarEjemplar))
                    .addComponent(jScrollPane2)
                    .addGroup(panelEjemplarLayout.createSequentialGroup()
                        .addGroup(panelEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnVolverEjemplar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEjemplarLayout.setVerticalGroup(
            panelEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEjemplarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEjemplar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverEjemplar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Buscar un Prestamo de un Ejemplar:");

        jLabel4.setText("Nombre del Libro:");

        listaPrestamos.setModel(new javax.swing.DefaultListModel<Entidades.Prestamo>());
        listaPrestamos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPrestamosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaPrestamos);

        btnBuscarPrestamo.setText("Buscar");
        btnBuscarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrestamoActionPerformed(evt);
            }
        });

        btnVolverPrestamo.setText("Volver");
        btnVolverPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarPrestamoLayout = new javax.swing.GroupLayout(panelBuscarPrestamo);
        panelBuscarPrestamo.setLayout(panelBuscarPrestamoLayout);
        panelBuscarPrestamoLayout.setHorizontalGroup(
            panelBuscarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarPrestamoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarPrestamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPrestamo))
                    .addComponent(jScrollPane3)
                    .addGroup(panelBuscarPrestamoLayout.createSequentialGroup()
                        .addGroup(panelBuscarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnVolverPrestamo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBuscarPrestamoLayout.setVerticalGroup(
            panelBuscarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBuscarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(buscarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPrestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverPrestamo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBuscarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEjemplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLector, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBuscarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //<editor-fold defaultstate="collapsed" desc=" Eventos del Diseñador ">
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModoLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoLectorActionPerformed
        seleccionar(1);
    }//GEN-LAST:event_btnModoLectorActionPerformed

    private void btnModoEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoEjemplarActionPerformed
        seleccionar(2);
    }//GEN-LAST:event_btnModoEjemplarActionPerformed

    private void btnFechaPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaPrestamoActionPerformed
        habilitarFPrestamo();
    }//GEN-LAST:event_btnFechaPrestamoActionPerformed

    private void btnFechaDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaDevolucionActionPerformed
        habilitarFDevolucion();
    }//GEN-LAST:event_btnFechaDevolucionActionPerformed

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
        prestar();
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        recibir();
    }//GEN-LAST:event_btnRecibirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLectorActionPerformed
        buscarLectores();
    }//GEN-LAST:event_btnBuscarLectorActionPerformed

    private void btnVolverLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLectorActionPerformed
        seleccionar(0);
    }//GEN-LAST:event_btnVolverLectorActionPerformed

    private void btnBuscarEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEjemplarActionPerformed
        buscarEjemplares();
    }//GEN-LAST:event_btnBuscarEjemplarActionPerformed

    private void btnVolverEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverEjemplarActionPerformed
        seleccionar(0);
    }//GEN-LAST:event_btnVolverEjemplarActionPerformed

    private void btnBuscarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrestamoActionPerformed
        buscarPrestamos();
    }//GEN-LAST:event_btnBuscarPrestamoActionPerformed

    private void btnVolverPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverPrestamoActionPerformed
        seleccionar(0);
    }//GEN-LAST:event_btnVolverPrestamoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        seleccionar(3);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void listaPrestamosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPrestamosValueChanged
        if(listaPrestamos.getSelectedIndex() > -1){
            seleccionarPrestamo();
        }
    }//GEN-LAST:event_listaPrestamosValueChanged

    private void listaEjemplarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaEjemplarValueChanged
        if(listaEjemplar.getSelectedIndex() > -1){
            seleccionarEjemplar();
        }
    }//GEN-LAST:event_listaEjemplarValueChanged

    private void listaLectorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaLectorValueChanged
        if(listaLector.getSelectedIndex() > -1){
            seleccionarLector();
        }
    }//GEN-LAST:event_listaLectorValueChanged
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Variables del Diseñador ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarEjemplar;
    private javax.swing.JButton btnBuscarLector;
    private javax.swing.JButton btnBuscarPrestamo;
    private javax.swing.JButton btnFechaDevolucion;
    private javax.swing.JButton btnFechaPrestamo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModoEjemplar;
    private javax.swing.JButton btnModoLector;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JButton btnRecibir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolverEjemplar;
    private javax.swing.JButton btnVolverLector;
    private javax.swing.JButton btnVolverPrestamo;
    private javax.swing.JTextField buscarEjemplar;
    private javax.swing.JTextField buscarLector;
    private javax.swing.JTextField buscarPrestamo;
    private javax.swing.JTextField datoEjemplar;
    private com.toedter.calendar.JDateChooser datoFechaDevolucion;
    private com.toedter.calendar.JDateChooser datoFechaPrestamo;
    private javax.swing.JLabel datoIdPrestamo;
    private javax.swing.JTextField datoLector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Entidades.Ejemplar> listaEjemplar;
    private javax.swing.JList<Entidades.Lector> listaLector;
    private javax.swing.JList<Entidades.Prestamo> listaPrestamos;
    private javax.swing.JPanel panelBuscarPrestamo;
    private javax.swing.JPanel panelEjemplar;
    private javax.swing.JPanel panelLector;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelPrestamo;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Variables Privadas ">
    //entidades
    Entidades.Lector lector = new Entidades.Lector();
    Entidades.Ejemplar ejemplar = new Entidades.Ejemplar();
    Entidades.Prestamo prestamo = new Entidades.Prestamo();
    //data
    BD.PrestamoData pData = new BD.PrestamoData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    BD.LectorData lectorData = new BD.LectorData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    BD.EjemplarData eData = new BD.EjemplarData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    //listas
    java.util.List<Entidades.Lector> lectores = null;
    java.util.List<Entidades.Ejemplar> ejemplares = null;
    java.util.List<Entidades.Prestamo> prestamos = null;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Privados ">
    
    private void iniciar(){
        seleccionar(0);
        lectores = new java.util.ArrayList<>();
        ejemplares = new java.util.ArrayList<>();
        prestamos = new java.util.ArrayList<>();
    }
    
    private void seleccionar(int modo){
        switch(modo){
            case 0:
                panelPrestamo.setVisible(true);
                panelLector.setVisible(false);
                panelEjemplar.setVisible(false);
                panelBuscarPrestamo.setVisible(false);
                break;
            case 1:
                panelLector.setVisible(true);
                panelPrestamo.setVisible(false);
                panelEjemplar.setVisible(false);
                panelBuscarPrestamo.setVisible(false);
                break;
            case 2:
                panelEjemplar.setVisible(true);
                panelPrestamo.setVisible(false);
                panelLector.setVisible(false);
                panelBuscarPrestamo.setVisible(false);
                break;
            case 3:
                panelBuscarPrestamo.setVisible(true);
                panelEjemplar.setVisible(false);
                panelPrestamo.setVisible(false);
                panelLector.setVisible(false);
                break;
        }
    }
    
    private void salir(){
        if(btnGuardar.isVisible()){
            int salir = javax.swing.JOptionPane.showConfirmDialog(this, 
                    "Seguro que desea salir?\nSe perderan los cambios no guardados...", 
                    "Aun no se guardan los cambios", 2, 2);
            if(salir == 0)//Aceptar
                dispose();
        }
        else
            dispose();
    }
    
    private void guardar(){ //actualizar
        if(prestamo.getIdPrestamo() > 0){
            if(pData.modificar(prestamo) == 0)
                javax.swing.JOptionPane.showMessageDialog(this, "Error al Actualizar el prestamo.\n");
            else{
                javax.swing.JOptionPane.showMessageDialog(this, "Se actualizaron los datos del prestamo.\n");
                seleccionar(0);
                desHabilitarFPrestamo();
                desHabilitarFDevolucion();
            }
        } else
            javax.swing.JOptionPane.showMessageDialog(this, "Error al Actualizar el prestamo.\n");
    }
    
    private void limpiar(){
        datoIdPrestamo.setText("0");
        datoLector.setText("");
        datoEjemplar.setText("");
        datoFechaPrestamo.setDate(null);
        datoFechaDevolucion.setDate(null);
        buscarEjemplar.setText("");
        buscarLector.setText("");
        buscarPrestamo.setText("");
        ((javax.swing.DefaultListModel)listaEjemplar.getModel()).clear();
        ((javax.swing.DefaultListModel)listaLector.getModel()).clear();
        ((javax.swing.DefaultListModel)listaPrestamos.getModel()).clear();
    }
    
    private void prestar(){
        if(lector != null && ejemplar != null && datoFechaPrestamo.getDate() != null){
            prestamo.setFechaPrestamo(java.time.LocalDateTime.ofInstant(
                    datoFechaPrestamo.getCalendar().toInstant(), 
                    datoFechaPrestamo.getCalendar().getTimeZone().toZoneId()).toLocalDate());
            if(datoFechaDevolucion.getDate() != null)
                prestamo.setFechaDevolucion(java.time.LocalDateTime.ofInstant(
                        datoFechaDevolucion.getCalendar().toInstant(),
                        datoFechaDevolucion.getCalendar().getTimeZone().toZoneId()).toLocalDate());
            prestamo.setLector(lector);
            prestamo.setEjemplar(ejemplar);
            int nuevo = pData.registrar(prestamo);
            if(nuevo == 0)
                javax.swing.JOptionPane.showMessageDialog(this, "Error al Registrar un nuevo prestamo.\n");
            else{
                datoIdPrestamo.setText(String.valueOf(nuevo));
                prestamo.setIdPrestamo(nuevo);
                ejemplar.setEstado(0);
                int cambioEjemplar = eData.cambiarEstado(ejemplar);
                if(cambioEjemplar != 0){
                    javax.swing.JOptionPane.showMessageDialog(this, "Se registro un nuevo prestamo.\n");
                }else{
                    javax.swing.JOptionPane.showMessageDialog(this, "Se registro un nuevo prestamo.\nAun asi hubo un error al cambiar el estado del ejemplar.\nVerifiquelo manualmente.");
                }
                seleccionar(0);
                desHabilitarFPrestamo();
                desHabilitarFDevolucion();
            }
        }else
            javax.swing.JOptionPane.showMessageDialog(this, "Error al Registrar un nuevo prestamo. Faltan datos necesarios.");
    }
    
    private void recibir(){
        //prestamo ya esta cargado al seleccionar un prestamo en el buscador
        java.time.LocalDate ahora = java.time.LocalDate.now();
        if(prestamo.getIdPrestamo() > 0){
            if(pData.devolver(prestamo.getIdPrestamo()) == 0)
                javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar devolución.\n");
            else{
                prestamo.setFechaDevolucion(ahora);
                datoFechaDevolucion.setDate(java.sql.Date.valueOf(ahora));
                ejemplar.setEstado(3);
                int cambioEjemplar = eData.cambiarEstado(ejemplar);
                if(cambioEjemplar != 0){
                    javax.swing.JOptionPane.showMessageDialog(this, "Devolución del ejemplar realizada con exito.\n");
                }else{
                    javax.swing.JOptionPane.showMessageDialog(this, "Devolución del ejemplar realizada con exito.\nAun asi hubo un error al cambiar el estado del ejemplar.\nVerifiquelo manualmente.");
                }
                //Ver el tema de multa
                long dias = java.time.temporal.ChronoUnit.DAYS.between(
                        prestamo.getFechaPrestamo(), 
                        java.time.LocalDate.now()) - Entidades.Biblioteca.CONF.MAXDIASPRESTADOS;
                if(dias > 0){
                    javax.swing.JOptionPane.showMessageDialog(this, "Corresponde multa de: "+ String.valueOf(dias * Entidades.Biblioteca.CONF.MULTAPORDIA));
                    System.out.println("Corresponde multa de: "+ String.valueOf(dias * Entidades.Biblioteca.CONF.MULTAPORDIA) + " días.");
                    //ver como hacer con la multa
                }
                seleccionar(0);
                desHabilitarFPrestamo();
                desHabilitarFDevolucion();
            }
        }else
            javax.swing.JOptionPane.showMessageDialog(this, "Algo está mal con el Prestamo.\n");
    }
    
    private void habilitarFPrestamo(){
        datoFechaPrestamo.setEnabled(true);
    }
    
    private void desHabilitarFPrestamo(){
        datoFechaPrestamo.setEnabled(false);
    }
    
    private void habilitarFDevolucion(){
        datoFechaDevolucion.setEnabled(true);
    }
    
    private void desHabilitarFDevolucion(){
        datoFechaDevolucion.setEnabled(false);
    }
    
    private void habilidarEditar(){
        btnPrestar.setVisible(true);
        btnRecibir.setVisible(true);
        btnGuardar.setVisible(true);
    }
    
    private void desHabilitarEditar(){
        btnPrestar.setVisible(false);
        btnRecibir.setVisible(false);
        btnGuardar.setVisible(false);
    }
    
    private void buscarLectores(){
        if(!buscarLector.getText().isEmpty()){
            lectores = lectorData.buscarNoMultados(buscarLector.getText());
            if(lectores.size() > 0){
                javax.swing.DefaultListModel modelo = (javax.swing.DefaultListModel) listaLector.getModel();
                modelo.clear();
                for (Entidades.Lector lector : lectores) {
                    modelo.addElement(lector);
                }
            } 
        }
    }
    
    private void buscarEjemplares(){
        if(!buscarEjemplar.getText().isEmpty()){
            ejemplares = eData.buscarDisponibles(buscarEjemplar.getText());
            if(ejemplares.size() > 0){
                javax.swing.DefaultListModel modelo = (javax.swing.DefaultListModel) listaEjemplar.getModel();
                modelo.clear();
                for (Entidades.Ejemplar ejemplar : ejemplares) {
                    modelo.addElement(ejemplar);
                }
            } 
        }
    }
    
    private void buscarPrestamos(){
        if(!buscarPrestamo.getText().isEmpty()){
            prestamos = pData.buscar(buscarPrestamo.getText());
            if(prestamos.size() > 0){
                javax.swing.DefaultListModel modelo = (javax.swing.DefaultListModel) listaPrestamos.getModel();
                modelo.clear();
                for (Entidades.Prestamo prestamo : prestamos) {
                    modelo.addElement(prestamo);
                }
            } 
        }
    }
    
    private void seleccionarLector(){
        //setear los datos del lector
        lector = listaLector.getModel().getElementAt(listaLector.getSelectedIndex());
        String nombreLector = lector.getNombre();
        datoLector.setText(nombreLector);
        habilidarEditar();
    }
    
    private void seleccionarEjemplar(){
        //setear los datos del libro y del ejemplar
        ejemplar = listaEjemplar.getModel().getElementAt(listaEjemplar.getSelectedIndex());
        String nombreEjemplar = ejemplar.toString();
        datoEjemplar.setText(nombreEjemplar);
        habilidarEditar();
    }
    
    private void seleccionarPrestamo(){
        //setear los datos del libro, del ejemplar, del lector y del prestamo
        prestamo = listaPrestamos.getModel().getElementAt(listaPrestamos.getSelectedIndex());
        lector = prestamo.getLector();
        ejemplar = prestamo.getEjemplar();
        String 
            nombreLector = prestamo.getLector().toString(), //...................................Excepcion null
            nombreEjemplar = prestamo.getEjemplar().toString();
        datoLector.setText(nombreLector);
        datoEjemplar.setText(nombreEjemplar);
        datoIdPrestamo.setText(prestamo.getIdPrestamo()+"");
        datoFechaPrestamo.setDate(java.sql.Date.valueOf(prestamo.getFechaPrestamo()));
        datoFechaDevolucion.setDate(prestamo.getFechaDevolucion() == null ? null : java.sql.Date.valueOf(prestamo.getFechaDevolucion()));
        habilidarEditar();
    }
    //</editor-fold>
    
}
