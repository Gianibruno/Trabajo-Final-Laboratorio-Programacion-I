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

        titulo = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
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
        btnPrestar = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVerLector = new javax.swing.JButton();
        btnVerEjemplar = new javax.swing.JButton();
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
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registro de Prestamos");

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/libros.png"))); // NOI18N
        imagen.setToolTipText("");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Prestamo: (id)");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Lector:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Ejemplar:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Fecha del Prestamo:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Fecha de Devolución:");

        datoIdPrestamo.setText("0");

        datoLector.setEditable(false);

        datoEjemplar.setEditable(false);

        datoFechaPrestamo.setDateFormatString("dd/MM/yyyy");
        datoFechaPrestamo.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
        datoFechaPrestamo.setToolTipText("Fecha del prestamo");

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

        btnPrestar.setVisible(false);
        btnPrestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/prestar.png"))); // NOI18N
        btnPrestar.setText("Prestar");
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });

        btnRecibir.setVisible(false);
        btnRecibir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/recibir.png"))); // NOI18N
        btnRecibir.setText("Recibir");
        btnRecibir.setToolTipText("Al recibir, de acuerdo a las fechas, puede aplicar multa o hasta deshabilitar al lector");
        btnRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirActionPerformed(evt);
            }
        });

        btnGuardar.setVisible(false);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Actualizar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setVisible(false);
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
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
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addComponent(btnPrestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecibir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrestar)
                    .addComponent(btnRecibir)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnSalir)
                    .addComponent(btnNuevo))
                .addContainerGap())
        );

        btnVerLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ver.png"))); // NOI18N
        btnVerLector.setBorder(null);
        btnVerLector.setVisible(false);
        btnVerLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerLectorActionPerformed(evt);
            }
        });

        btnVerEjemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ver.png"))); // NOI18N
        btnVerEjemplar.setBorder(null);
        btnVerEjemplar.setVisible(false);
        btnVerEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEjemplarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrestamoLayout = new javax.swing.GroupLayout(panelPrestamo);
        panelPrestamo.setLayout(panelPrestamoLayout);
        panelPrestamoLayout.setHorizontalGroup(
            panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrestamoLayout.createSequentialGroup()
                        .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrestamoLayout.createSequentialGroup()
                                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datoEjemplar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(datoFechaPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(datoFechaDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelPrestamoLayout.createSequentialGroup()
                                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datoLector)
                                    .addComponent(datoIdPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrestamoLayout.createSequentialGroup()
                                .addComponent(btnVerLector)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModoLector))
                            .addGroup(panelPrestamoLayout.createSequentialGroup()
                                .addComponent(btnVerEjemplar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFechaPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFechaDevolucion)))))
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelPrestamoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFechaDevolucion, btnFechaPrestamo, btnModoEjemplar, btnModoLector});

        panelPrestamoLayout.setVerticalGroup(
            panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(datoIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModoLector, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVerLector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(datoLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(datoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVerEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnModoEjemplar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFechaPrestamo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10))
                    .addComponent(datoFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFechaDevolucion, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11))
                    .addComponent(datoFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelPrestamoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {datoEjemplar, datoFechaDevolucion, datoFechaPrestamo, datoIdPrestamo, datoLector});

        panelPrestamoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnModoLector, btnVerLector});

        panelPrestamoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnModoEjemplar, btnVerEjemplar});

        jLabel2.setText("Selecciona un Lector:");

        listaLector.setModel(new javax.swing.DefaultListModel<Entidades.Lector>());
        listaLector.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaLector.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaLectorValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaLector);

        buscarLector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarLectorKeyPressed(evt);
            }
        });

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

        buscarEjemplar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarEjemplarKeyPressed(evt);
            }
        });

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

        buscarPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarPrestamoKeyPressed(evt);
            }
        });

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverPrestamo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEjemplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBuscarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titulo)
                .addGap(59, 59, 59)
                .addComponent(imagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEjemplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(111, 111, 111))
                    .addComponent(panelPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBuscarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelLector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122))))
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
        habilitarEditar();
    }//GEN-LAST:event_btnFechaPrestamoActionPerformed

    private void btnFechaDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaDevolucionActionPerformed
        habilitarFDevolucion();
        habilitarEditar();
    }//GEN-LAST:event_btnFechaDevolucionActionPerformed

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
        prestar();
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        recibir();
    }//GEN-LAST:event_btnRecibirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        actualizar();
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
            seleccionar(0);
        }
    }//GEN-LAST:event_listaEjemplarValueChanged

    private void listaLectorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaLectorValueChanged
        if(listaLector.getSelectedIndex() > -1){
            seleccionarLector();
            seleccionar(0);
        }
    }//GEN-LAST:event_listaLectorValueChanged

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void buscarLectorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarLectorKeyPressed
        int tecla = evt.getKeyCode();
        if(tecla == java.awt.event.KeyEvent.VK_ENTER)
            buscarLectores();
    }//GEN-LAST:event_buscarLectorKeyPressed

    private void buscarEjemplarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarEjemplarKeyPressed
        int tecla = evt.getKeyCode();
        if(tecla == java.awt.event.KeyEvent.VK_ENTER)
            buscarEjemplares();
    }//GEN-LAST:event_buscarEjemplarKeyPressed

    private void buscarPrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarPrestamoKeyPressed
        int tecla = evt.getKeyCode();
        if(tecla == java.awt.event.KeyEvent.VK_ENTER)
            buscarPrestamos();
    }//GEN-LAST:event_buscarPrestamoKeyPressed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if(btnGuardar.isVisible())salir();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnVerLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerLectorActionPerformed
        GUI.Principal.abrir(GUI.Principal.VISTAS.LECTOR, lector);
    }//GEN-LAST:event_btnVerLectorActionPerformed

    private void btnVerEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEjemplarActionPerformed
        GUI.Principal.abrir(GUI.Principal.VISTAS.EJEMPLAR, ejemplar);
    }//GEN-LAST:event_btnVerEjemplarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        iniciar();
    }//GEN-LAST:event_formComponentShown
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Variables del Diseñador ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarEjemplar;
    private javax.swing.JButton btnBuscarLector;
    private javax.swing.JButton btnBuscarPrestamo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFechaDevolucion;
    private javax.swing.JButton btnFechaPrestamo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModoEjemplar;
    private javax.swing.JButton btnModoLector;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JButton btnRecibir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerEjemplar;
    private javax.swing.JButton btnVerLector;
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
    private javax.swing.JLabel imagen;
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
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Variables Privadas ">
    //entidades
    Entidades.Lector lector = new Entidades.Lector();
    Entidades.Ejemplar ejemplar = new Entidades.Ejemplar();
    Entidades.Prestamo prestamo = new Entidades.Prestamo();
    Entidades.Multa multa = new Entidades.Multa();
    //data
    BD.PrestamoData pData = new BD.PrestamoData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    BD.MultaData mData = new BD.MultaData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    BD.LectorData lectorData = new BD.LectorData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    BD.EjemplarData eData = new BD.EjemplarData(grupo1tpfinal.Grupo1TPFinal.CONEXION);
    //listas
    java.util.List<Entidades.Lector> lectores = null;
    java.util.List<Entidades.Ejemplar> ejemplares = null;
    java.util.List<Entidades.Prestamo> prestamos = null;
    //fechas
    java.time.LocalDate hoy = java.time.LocalDate.now();
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Publicos ">
    public void ver(Entidades.Prestamo prestamo){
        iniciar();
        this.prestamo = prestamo;
        lector = prestamo.getLector();
        ejemplar = prestamo.getEjemplar();
        datoIdPrestamo.setText(String.valueOf(prestamo.getIdPrestamo()));
        datoLector.setText(lector.toString());
        datoEjemplar.setText(ejemplar.toString());
        if(prestamo.getFechaPrestamo() != null)datoFechaPrestamo.setDate(java.sql.Date.valueOf(prestamo.getFechaPrestamo()));
        else datoFechaPrestamo.setDate(null);
        if(prestamo.getFechaDevolucion() != null)datoFechaDevolucion.setDate(java.sql.Date.valueOf(prestamo.getFechaDevolucion()));
        else datoFechaDevolucion.setDate(null);
        datoFechaPrestamo.setEnabled(false);
        btnVerLector.setVisible(true);
        btnVerEjemplar.setVisible(true);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Metodos Privados ">
    
    private void iniciar(){
        limpiarTodo();
        seleccionar(0);
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
            if(salir == 0){
                limpiarTodo();
                desHabilitarEditar();
                dispose();
            }else{
               // setDefaultCloseOperation(0);
            }
        }
        else{
            limpiarTodo();
            desHabilitarEditar();
            dispose();
        }
    }
    
    /**
     * ACTUALIZAR
     * Condiciones:...
     * 
     * Generales:
     * G1) pretamo, ejemplar, lector, deben existir.
     * G2) hay cambios para guardar.
     * G3) no modificar si posee multa vigente.
     * 
     * 
     */
    private void actualizar(){
        final int 
                maxPrestamosPorLector = Entidades.Biblioteca.CONF.MAXPRESTAMOSPORLECTOR,
                multaPorDia = Entidades.Biblioteca.CONF.MULTAPORDIA,
                maxDiasPrestados = Entidades.Biblioteca.CONF.MAXDIASPRESTADOS;
        java.time.LocalDate fechaPrestamo, fechaDevolucion, fechaFinMulta;
        java.util.List<Entidades.Lector> listaL;
        String mensaje = "Actualizar la información del prestamo.\n";
        int idEjemplarAnterior = 0;
        long diasMulta;
        boolean exito;
        hoy = java.time.LocalDate.now();
        if(comprobar()){//...........................................................................(G1)
            if(prestamo.getIdPrestamo() > 0){
                multa = mData.buscarMulta(prestamo);
                if(multa == null){
                    exito = true;
                }else{
                    if(multa.getFecha_fin().isAfter(hoy)){//.........................................(G3)
                        mensaje += "Hay una multa vigente.\n";
                        exito = false;
                    }else{
                        mensaje += "El prestamo no tiene multa...\n";
                        exito = true;
                    }
                }
                if(exito){
                    if(lector.getIdLector() != prestamo.getLector().getIdLector()){//................(G2) lector
                        mensaje += "Comprobando lector: "+ lector.getNombre() +"...\n";
                        listaL = pData.listarVencidos()
                                .stream()
                                .filter(l -> l.getIdLector() == lector.getIdLector())
                                .collect(java.util.stream.Collectors.toList());
                        if(listaL.isEmpty()){//......................................................Lector sin prestamos vencidos
                            mensaje += "\tNo posee prestamos vencidos.\n";
                            listaL = pData.listar(lector)
                                    .stream()
                                    .filter(p -> p.getFechaDevolucion() == null)
                                    .map(p -> p.getLector())
                                    .collect(java.util.stream.Collectors.toList());
                            if(listaL.size() < maxPrestamosPorLector){//.............................Lector con menos de 3 prestamos
                                mensaje += "\tPosee menos de " + maxPrestamosPorLector + " prestamos.\n";
                                //todo ok modifico el lector del prestamo
                                prestamo.setLector(lector);
                                exito = true;
                            }else{
                                mensaje +="\tTiene "+ listaL.size() +" prestamos realizados, el máximo permitido es: "+ maxPrestamosPorLector +".\n";
                                exito = false;
                            }
                        }else{
                            mensaje += "\tPosee " + (listaL.size() == 1 ? "un prestamo" : listaL.size() +" prestamos") + " vencidos sin devolver.\n";
                            exito = false;
                        }
                    }else{
                        mensaje += "El lector no fue modificado.\n";
                        exito = true;
                    }
                }
                if(exito){
                    fechaPrestamo = java.time.LocalDateTime.ofInstant(
                            datoFechaPrestamo.getCalendar().toInstant(), 
                            datoFechaPrestamo.getCalendar().getTimeZone().toZoneId()).toLocalDate();
                    if(!prestamo.getFechaPrestamo().isEqual(fechaPrestamo)){
                        mensaje += "La fecha del prestamo fue modificada.\n";
                        prestamo.setFechaPrestamo(fechaPrestamo);
                    }else{
                        mensaje += "La fecha del prestamo no fue modificada.\n";
                    }
                }
                if(exito){
                    if(datoFechaDevolucion.getDate() != null){
                        fechaDevolucion = java.time.LocalDateTime.ofInstant(
                                datoFechaDevolucion.getCalendar().toInstant(), 
                                datoFechaDevolucion.getCalendar().getTimeZone().toZoneId()).toLocalDate();
                        if(!prestamo.getFechaDevolucion().isEqual(fechaDevolucion)){
                            mensaje += "La fecha de devolución del prestamo fue modificada.\n";
                            prestamo.setFechaDevolucion(fechaDevolucion);
                        }else{
                            mensaje += "La fecha de devolución del prestamo no fue modificada.\n";
                        }
                    }else{
                        mensaje += "Sin fecha de devolución...\n";
                        prestamo.setFechaDevolucion(null);
                    }
                }
                if(exito){
                    if(ejemplar.getId() != prestamo.getEjemplar().getId()){
                        idEjemplarAnterior = prestamo.getEjemplar().getId();
                        mensaje += "El ejemplar fue modificado.\n";
                        ejemplar.setEstado(prestamo.getEjemplar().getEstado());
                        prestamo.setEjemplar(ejemplar);
                    }else{
                        mensaje += "El ejemplar no fue modificado.\n";
                    }
                }
            } else exito = false;
        } else exito = false;
        if(!exito)mensaje += "No se puede modificar la información de este prestamo.\n";
        else{
            if(prestamo.getFechaPrestamo().isBefore(prestamo.getFechaDevolucion())){
                if(pData.modificar(prestamo) == 1){
                    if(idEjemplarAnterior > 0){
                        if(eData.cambiarEstado(idEjemplarAnterior, Entidades.Ejemplar.ESTADOS.disponible) == 1){
                            mensaje += "El ejemplar anterior ahora está disponible...\n";
                        }else{
                            mensaje += "Cambiar manualmente el estado del ejemplar id: "+ idEjemplarAnterior +" a disponible.\n";
                        }
                        if(prestamo.getEjemplar().getEstado() == 0 && eData.cambiarEstado(prestamo.getEjemplar()) == 1){
                            mensaje += "Actualizado el ejemplar seleccionado a prestado...\n";
                        }else{
                            mensaje += "Cambiar manualmente el estado del ejemplar id: "+ prestamo.getEjemplar().getId() +" a prestado.\n";
                        }
                    }
                    //multas
                    if(prestamo.getFechaPrestamo().plusDays(maxDiasPrestados).isBefore(prestamo.getFechaDevolucion())){
                        diasMulta = java.time.temporal.ChronoUnit.DAYS.between(prestamo.getFechaPrestamo().plusDays(maxDiasPrestados), hoy) * multaPorDia;
                        fechaFinMulta = prestamo.getFechaDevolucion().plusDays(diasMulta);
                        //System.out.println(diasMulta +" > "+ (maxDiasPrestados * multaPorDia * 2) +" = "+ (diasMulta > maxDiasPrestados * multaPorDia * 2));
                        if(diasMulta > maxDiasPrestados * multaPorDia * 2){ //1 mes = 60 multa, 2 meses = 120 (3 meses desde el prestamo)
                            if(fechaFinMulta.isAfter(hoy)){
                                mensaje += "inhabilitar lector\n";
                                if(lectorData.desactivar(lector.getIdLector()) == 1)
                                    mensaje += "Se inhabilitó al lector por haber superado "+ maxDiasPrestados * 3 +" días de deuda...\n";
                                else mensaje += "Error al inhabilitar al lector, intentelo manualmente...\n";
                            }
                        }
                        if(mData.guardar(new Entidades.Multa(prestamo, prestamo.getFechaDevolucion(), fechaFinMulta)) > 0)
                            mensaje += "Se aplicó una multa de "+ diasMulta +" días. Hasta la fecha "+ fechaFinMulta.toString() + ".\n";
                        else
                            mensaje += "Error al aplicar la multa. Intentelo manualmente hasta la fecha: "+ fechaFinMulta.toString() + "\n";
                    }
                    mensaje += "Los datos fueron modificados!!";
                    desHabilitarEditar();
                    desHabilitarFDevolucion();
                    desHabilitarFPrestamo();
                }else mensaje += "No se modificaron los datos, posible error de conexión...";
            }else mensaje += "Las fecha del prestamo no puede ser superior a la fecha de devolución...\nNo se puede modificar la información de este prestamo.";
        }
        mensaje(mensaje);
    }
    
    private void actualizarDatos(){
        prestamo = new Entidades.Prestamo();
        if(datoFechaPrestamo.getDate() != null)
            prestamo.setFechaPrestamo(java.time.LocalDateTime.ofInstant(
                    datoFechaPrestamo.getCalendar().toInstant(), 
                    datoFechaPrestamo.getCalendar().getTimeZone().toZoneId()).toLocalDate());
        else
            prestamo.setFechaPrestamo(java.time.LocalDate.now());
        if(datoFechaDevolucion.getDate() != null)
            prestamo.setFechaDevolucion(java.time.LocalDateTime.ofInstant(
                    datoFechaDevolucion.getCalendar().toInstant(),
                    datoFechaDevolucion.getCalendar().getTimeZone().toZoneId()).toLocalDate());
        else
            prestamo.setFechaDevolucion(null);
        prestamo.setLector(lector);
        prestamo.setEjemplar(ejemplar);
        try{
            int id = Integer.parseInt(datoIdPrestamo.getText());
            if(id > 0)
                prestamo.setIdPrestamo(id);
        }catch(NumberFormatException ex){
            prestamo.setIdPrestamo(0);
        }
    }
    
    private void limpiarTodo(){
        lector = null;
        ejemplar = null;
        prestamo = null;
        lectores = null;
        ejemplares = null;
        prestamos = null;
        datoIdPrestamo.setText("Nuevo");
        datoLector.setText(""); datoLector.setBackground(java.awt.Color.white);
        datoEjemplar.setText(""); datoEjemplar.setBackground(java.awt.Color.white);
        datoFechaPrestamo.setDate(java.sql.Date.valueOf(java.time.LocalDate.now())); datoFechaPrestamo.setBackground(panelPrestamo.getBackground());
        datoFechaDevolucion.setDate(null);
        buscarEjemplar.setText("");
        buscarLector.setText("");
        buscarPrestamo.setText("");
        ((javax.swing.DefaultListModel)listaEjemplar.getModel()).clear();
        ((javax.swing.DefaultListModel)listaLector.getModel()).clear();
        ((javax.swing.DefaultListModel)listaPrestamos.getModel()).clear();
        btnVerLector.setVisible(false);
        btnVerEjemplar.setVisible(false);
    }
    
    /**
     * PRESTAR
     * Condiciones...
     * 1) El lector: tiene que estar activo.
     * 2) El lector: no tiene que tener prestamos vencidos. (con fecha superior al limite)
     * 3) El lector: no tiene que tener multa pendiente.
     * 4) El lector: no puede pedir mas del limite de ejemplares prestados (3).
     * 5) El ejemplar: tiene que estar disponible.
     * 
     */
    private void prestar(){
        final int
                maxPrestamosPorLector = Entidades.Biblioteca.CONF.MAXPRESTAMOSPORLECTOR,
                maxDiasPrestados = Entidades.Biblioteca.CONF.MAXDIASPRESTADOS;
        java.util.List<Entidades.Prestamo> prestamosDelLector;
        java.util.List<Entidades.Prestamo> prestamosVencidos;
        java.util.List<Entidades.Multa> multasDelLector;
        int nuevo;
        String mensaje = "Prestar un Ejemplar:\n";
        if(comprobar()){ //............................................................................(1) y (5)
            if(!esNumero(datoIdPrestamo.getText())){
                actualizarDatos();
                hoy = java.time.LocalDate.now();
                prestamosDelLector = pData.listar(lector);
                if(prestamosDelLector.size() < maxPrestamosPorLector){ //..............................(4)
                    multasDelLector = mData.obtenerMultas().stream().filter(m ->
                            m.getPrestamo().getLector().getIdLector() == lector.getIdLector()
                    ).collect(java.util.stream.Collectors.toList());
                    if(multasDelLector.isEmpty()){ //..................................................(3)
                        prestamosVencidos = prestamosDelLector.stream()
                                .filter(p -> 
                                        p.getFechaDevolucion() == null 
                                        && p.getFechaPrestamo().plusDays(maxDiasPrestados).isAfter(hoy)
                                ).collect(java.util.stream.Collectors.toList());
                        if(prestamosVencidos.isEmpty()){ //............................................(2)
                            nuevo = pData.registrar(prestamo);
                            if(nuevo > 0){
                                datoIdPrestamo.setText(String.valueOf(nuevo));
                                prestamo.setIdPrestamo(nuevo);
                                ejemplar.setEstado(0);
                                if(eData.cambiarEstado(ejemplar) != 0) mensaje += "Se registro un nuevo prestamo.";
                                else mensaje += "Se registro un nuevo prestamo.\nAun asi hubo un error al cambiar el estado del ejemplar.\nVerifiquelo manualmente.";
                                seleccionar(0);
                                desHabilitarFPrestamo();
                                desHabilitarFDevolucion();
                            }else mensaje = "Error al Registrar un nuevo prestamo.";
                        }else mensaje = "El Lector adeuda ejemplares con prestamos vencidos...";
                    }else mensaje = "El lector posee multa...";
                }else mensaje = "Lector en limite de prestamos...";
            }else mensaje = "Ya existe un prestamo con estos datos...";
        }else mensaje = "Error al Registrar un nuevo prestamo. Faltan datos necesarios.";
        mensaje(mensaje);
    }
    
    /**
     * RECIBIR:
     * Condiciones...
     * 1) El prestamo existe, el lector existe, el ejemplar existe. El prestamo no posee multa
     * 2) El prestamo es de mas de un mes: multar.
     * 3) El prestamo es de mas de tres meses: inhabilitar lector.
     * 4) Cambiar estado del ejemplar si se logra recibir.
     * 5) Avisar los dias de multa que tiene el lector si corresponde.
     */
    private void recibir(){
        final int 
                multaPorDia = Entidades.Biblioteca.CONF.MULTAPORDIA,
                maxDiasPrestados = Entidades.Biblioteca.CONF.MAXDIASPRESTADOS;
        java.time.LocalDate fechaFinMulta;
        long diasMulta;
        String mensaje = "Recibir ejemplar: \n";
        if(comprobar()){
            actualizarDatos();
            hoy = java.time.LocalDate.now();
            if(prestamo.getIdPrestamo() > 0 && prestamo.getFechaDevolucion() == null){//..........(1)
                if(pData.devolver(prestamo.getIdPrestamo()) == 1){
//                    System.out.println("Vencido?: \n"
//                            + "fecha + 30 dias: "+ prestamo.getFechaPrestamo().plusDays(maxDiasPrestados).toString() +".\n"
//                            + "fecha actual:"+ hoy.toString() +".\n"
//                            + "isBefore -> (fecha).isBefore(hoy): "+ prestamo.getFechaPrestamo().plusDays(maxDiasPrestados).isBefore(hoy) + ".\n");
                    if(prestamo.getFechaPrestamo().plusDays(maxDiasPrestados).isBefore(hoy)){//...(2) y (3)
                        diasMulta = java.time.temporal.ChronoUnit.DAYS.between(prestamo.getFechaPrestamo().plusDays(maxDiasPrestados), hoy) * multaPorDia;
//                        System.out.println("Multa: "+ diasMulta);
                        fechaFinMulta = hoy.plusDays(diasMulta);
                        if(diasMulta > maxDiasPrestados * multaPorDia * 2){//.........................................(3)
                            if(lectorData.desactivar(lector.getIdLector()) == 1)
                                mensaje += "Se inhabilitó al lector por haber superado "+ maxDiasPrestados * 3 +" meses de deuda...\n";
                            else
                                mensaje += "Error al inhabilitar al lector, intentelo manualmente...\n";
                        }
                        if(mData.guardar(new Entidades.Multa(prestamo, hoy, fechaFinMulta)) > 0)
                            mensaje += "Se aplicó una multa de "+ diasMulta +" días. Hasta la fecha "+ fechaFinMulta.toString() + ".\n";
                        else
                            mensaje += "Error al aplicar la multa. Intentelo manualmente hasta la fecha: "+ fechaFinMulta.toString() + "\n";
                    }
                    prestamo.setFechaDevolucion(hoy);
                    datoFechaDevolucion.setDate(java.sql.Date.valueOf(hoy));
                    ejemplar.setEstado(3);
                    if(eData.cambiarEstado(ejemplar) != 0)
                        mensaje += "Devolución del ejemplar realizada con exito.\n";
                    else
                        mensaje += "Devolución del ejemplar realizada con exito.\nAun asi hubo un error al cambiar el estado del ejemplar.\nVerifiquelo manualmente.\n";
                    desHabilitarEditar();
                    desHabilitarFPrestamo();
                    desHabilitarFDevolucion();
                }else
                    mensaje += "Error al Devolver el ejemplar...";
            }else
                 mensaje += "No se puede recibir este ejemplar.";
        }else
             mensaje += "Error al recibir el ejemplar. Faltan datos necesarios.";
        mensaje(mensaje);
    }
    
    /**
     * ELIMINAR
     * Condiciones para borrado fisico...
     * 1) el prestamo debe existir
     * 2) eliminar un prestamo no devuelto: advertencia
     * 3) si posee multa, error
     */
    private void eliminar(){
        String mensaje = "Eliminar un prestamo del ejemplar.\n";
        if(comprobar()){
            actualizarDatos();
            multa = mData.buscarMulta(prestamo);
            if(multa == null){//.....................................................(3)
                if(esNumero(datoIdPrestamo.getText())){//............................(1)
                    if(prestamo.getIdPrestamo() > 0){
                        if(prestamo.getFechaDevolucion() == null){//.................(2)
                            if(javax.swing.JOptionPane.showConfirmDialog(
                                    this, 
                                    "Se eliminará la información del prestamo, este prestamo posee un ejemplar no devuelto.\n"
                                    +"Aceptar para eliminar.\n"
                                    +"Se cambiará el estado del ejemplar a disponible...",
                                    "Advertencia al Eliminar",
                                    2,2) == 0){
                                if(pData.anular(prestamo) == 1){
                                    mensaje += "Prestamo Eliminado de la Base de datos.";
                                    ejemplar.setEstado(Entidades.Ejemplar.ESTADOS.disponible);
                                    if(eData.cambiarEstado(ejemplar) == 1) mensaje += "El ejemplar ahora esta disponible en la biblioteca.";
                                    else mensaje += "No se logro cambiar el estado del ejemplar en la biblioteca...";
                                    habilitarNuevo();
                                }else mensaje = "Error al Eliminar el prestamo. Comprueba que no posea una multa.";
                                desHabilitarEditar();
                            }
                        }
                    }else mensaje = "Error al eliminar prestamo.";
                }else mensaje = "Un prestamo sin registrar no se puede eliminar.";
            }else mensaje = "El prestamo posee multa, no se puede eliminar.";
        }else mensaje = "Faltan datos necesarios para eliminar el prestamo.";
        mensaje(mensaje);
    }
    
    private void habilitarNuevo(){
        btnPrestar.setVisible(true);
        btnRecibir.setVisible(false);
        btnGuardar.setVisible(false);
        btnEliminar.setVisible(false);
        iniciar();
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
    
    private void habilitarEditar(){
        btnPrestar.setVisible(true);
        btnRecibir.setVisible(true);
        btnGuardar.setVisible(true);
        btnEliminar.setVisible(true);
    }
    
    private void desHabilitarEditar(){
        btnPrestar.setVisible(false);
        btnRecibir.setVisible(false);
        btnGuardar.setVisible(false);
        btnEliminar.setVisible(false);
    }
    
    private void buscarLectores(){
        if(!buscarLector.getText().isEmpty()){
            lectores = lectorData.buscarNoMultados(buscarLector.getText());
            if(lectores.size() > 0){
                javax.swing.DefaultListModel modelo = (javax.swing.DefaultListModel) listaLector.getModel();
                modelo.clear();
                for (Entidades.Lector lectore : lectores) {
                    modelo.addElement(lectore);
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
                for (Entidades.Ejemplar ejemplare : ejemplares) {
                    modelo.addElement(ejemplare);
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
                for (Entidades.Prestamo prestamoo : prestamos) {
                    modelo.addElement(prestamoo);
                }
            } 
        }
    }
    
    private void seleccionarLector(){
        //setear los datos del lector
        lector = listaLector.getModel().getElementAt(listaLector.getSelectedIndex());
        String nombreLector = lector.toString();
        datoLector.setText(nombreLector);
        btnVerLector.setVisible(true);
        habilitarEditar();
    }
    
    private void seleccionarEjemplar(){
        //setear los datos del libro y del ejemplar
        ejemplar = listaEjemplar.getModel().getElementAt(listaEjemplar.getSelectedIndex());
        String nombreEjemplar = ejemplar.toString();
        datoEjemplar.setText(nombreEjemplar);
        btnVerEjemplar.setVisible(true);
        habilitarEditar();
    }
    
    private void seleccionarPrestamo(){
        //setear los datos del libro, del ejemplar, del lector y del prestamo
        prestamo = listaPrestamos.getModel().getElementAt(listaPrestamos.getSelectedIndex());
        ver(prestamo);
        desHabilitarEditar();
        desHabilitarFDevolucion();
        desHabilitarFPrestamo();
    }

    private boolean comprobar() {
        boolean respuesta = true;
        if(lector == null) {
            respuesta = false;
            datoLector.setBackground(java.awt.Color.yellow);
        }
        if(ejemplar == null) {
            respuesta = false;
            datoEjemplar.setBackground(java.awt.Color.yellow);
        }
        if(datoFechaPrestamo.getDate() == null){
            respuesta = false;
            datoFechaPrestamo.setBackground(java.awt.Color.yellow);
        }
//        if(datoFechaDevolucion.getDate() == null){
//            //por el momento nada
//        }
        return respuesta;
    }

    private void mensaje(String mensaje) {
        javax.swing.JOptionPane.showMessageDialog(this, mensaje, "Prestamo", 1);
        System.out.println(mensaje);
    }

    private boolean esNumero(String texto) {
        if(texto != null)
            for (char c : texto.toCharArray()) {
                if (c < '0' || c > '9')
                    return false;
            }
        else
            return false;
        return true;
    }
    
    //</editor-fold>
}
