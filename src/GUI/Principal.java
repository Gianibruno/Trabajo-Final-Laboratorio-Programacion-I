/*
 * GUI.Principal vista principal de la Biblioteca
 */
package GUI;

/**
 * GUI principal de la Biblioteca.
 *
 * @author Astor, Pablo, Gian, Meli
 */
public class Principal extends javax.swing.JFrame {
    //Atributos
    private AutorGUI autorGUI = null;
    private ListaAutores listaAutores = null;
    private ListaLectores listaLectores = null;
    private ListaLibros listaLibros = null;
    private Libros librosGUI = null;
    private Lectores lectoresGUI = null;
    private PrestamoGUI prestamoGUI = null;
    private PrestamoPorFecha prestamoPorFecha = null;
    private PrestamosPorLector prestamoPorLector = null;
    private LectoresMorosos lectoresMorosos = null;
    private LectoresMultas lectoresMultas = null;
    private Multa multa = null;
    private Ejemplares ejemplares = null;
    private java.util.ArrayList<javax.swing.JInternalFrame> vistas = null;
    /**
     * Constructor de vista Principal
     */
    public Principal() {
        initComponents();
        alinicio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        formInfo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVolverAlEscritorio = new javax.swing.JButton();
        formConectar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreBD = new javax.swing.JTextField();
        txtPuerto = new javax.swing.JTextField();
        txtUsuarioBD = new javax.swing.JTextField();
        txtContraseñaBD = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menuSistema = new javax.swing.JMenu();
        menuSistemaReconectar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSistemaSalir = new javax.swing.JMenuItem();
        menuBiblioteca = new javax.swing.JMenu();
        menuAutores = new javax.swing.JMenu();
        menuAutores1 = new javax.swing.JMenuItem();
        menuAutores2 = new javax.swing.JMenuItem();
        menuLectores = new javax.swing.JMenu();
        menuLectores1 = new javax.swing.JMenuItem();
        menuLectores2 = new javax.swing.JMenuItem();
        menuLibros = new javax.swing.JMenu();
        menuLibros1 = new javax.swing.JMenuItem();
        menuLibros2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuLibros3 = new javax.swing.JMenuItem();
        menuEjemplaresdeunLibro = new javax.swing.JMenuItem();
        menuGestion = new javax.swing.JMenu();
        menuPrestamo = new javax.swing.JMenuItem();
        menuMulta = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuPrestamoporfecha = new javax.swing.JMenuItem();
        menuPrestamoporlector = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuLibros7 = new javax.swing.JMenuItem();
        menuLibros8 = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuAcercaBiblioteca = new javax.swing.JMenuItem();
        menuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca por Grupo1");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LABORATORIO DE PROGRAMACIÓN 1");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Trabajo Practico Final: Biblioteca.");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Grupo 1 integrantes:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("Astor Arico");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("Barrionuevo Pablo");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("Gianfranco Bruno");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Di-Mauro Melisa");

        btnVolverAlEscritorio.setText("Volver");
        btnVolverAlEscritorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAlEscritorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formInfoLayout = new javax.swing.GroupLayout(formInfo);
        formInfo.setLayout(formInfoLayout);
        formInfoLayout.setHorizontalGroup(
            formInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolverAlEscritorio)
                .addContainerGap(548, Short.MAX_VALUE))
            .addGroup(formInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formInfoLayout.createSequentialGroup()
                    .addGap(0, 75, Short.MAX_VALUE)
                    .addGroup(formInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 75, Short.MAX_VALUE)))
        );
        formInfoLayout.setVerticalGroup(
            formInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formInfoLayout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(btnVolverAlEscritorio)
                .addContainerGap())
            .addGroup(formInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formInfoLayout.createSequentialGroup()
                    .addGap(0, 89, Short.MAX_VALUE)
                    .addGroup(formInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formInfoLayout.createSequentialGroup()
                            .addGroup(formInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(formInfoLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel7)))
                            .addGap(28, 28, 28)
                            .addGroup(formInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(formInfoLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel10))
                                .addGroup(formInfoLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabel11))
                                .addComponent(jLabel9)
                                .addGroup(formInfoLayout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(jLabel5))))
                        .addGroup(formInfoLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jLabel8)))
                    .addGap(0, 89, Short.MAX_VALUE)))
        );

        formConectar.setToolTipText("Formulario para conectar con la BD.");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONEXION CON LA BD");

        jLabel2.setText("Nombre de la BD: ");

        jLabel12.setText("Puerto:");

        jLabel3.setText("Usuario: ");

        jLabel4.setText("Contraseña:  ");

        txtPuerto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPuertoKeyTyped(evt);
            }
        });

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formConectarLayout = new javax.swing.GroupLayout(formConectar);
        formConectar.setLayout(formConectarLayout);
        formConectarLayout.setHorizontalGroup(
            formConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formConectarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addGroup(formConectarLayout.createSequentialGroup()
                        .addGroup(formConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreBD)
                            .addComponent(txtUsuarioBD)
                            .addComponent(txtContraseñaBD)
                            .addComponent(txtPuerto)))
                    .addGroup(formConectarLayout.createSequentialGroup()
                        .addComponent(btnConectar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formConectarLayout.setVerticalGroup(
            formConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formConectarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuarioBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContraseñaBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConectar)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        menuSistema.setText("Sistema");

        menuSistemaReconectar.setText("Re-Conectar");
        menuSistemaReconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSistemaReconectarActionPerformed(evt);
            }
        });
        menuSistema.add(menuSistemaReconectar);
        menuSistema.add(jSeparator1);

        menuSistemaSalir.setText("Salir");
        menuSistemaSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSistemaSalirActionPerformed(evt);
            }
        });
        menuSistema.add(menuSistemaSalir);

        menu.add(menuSistema);

        menuBiblioteca.setText("Biblioteca");

        menuAutores.setText("Autores");

        menuAutores1.setText("Autor");
        menuAutores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAutores1ActionPerformed(evt);
            }
        });
        menuAutores.add(menuAutores1);

        menuAutores2.setText("Lista de Autores");
        menuAutores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAutores2ActionPerformed(evt);
            }
        });
        menuAutores.add(menuAutores2);

        menuBiblioteca.add(menuAutores);

        menuLectores.setText("Lectores");

        menuLectores1.setText("Lector");
        menuLectores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLectores1ActionPerformed(evt);
            }
        });
        menuLectores.add(menuLectores1);

        menuLectores2.setText("Lista de Lectores");
        menuLectores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLectores2ActionPerformed(evt);
            }
        });
        menuLectores.add(menuLectores2);

        menuBiblioteca.add(menuLectores);

        menuLibros.setText("Libros");

        menuLibros1.setText("Libro");
        menuLibros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibros1ActionPerformed(evt);
            }
        });
        menuLibros.add(menuLibros1);

        menuLibros2.setText("Listado de Libros");
        menuLibros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibros2ActionPerformed(evt);
            }
        });
        menuLibros.add(menuLibros2);
        menuLibros.add(jSeparator3);

        menuLibros3.setText("Ejemplar");
        menuLibros3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibros3ActionPerformed(evt);
            }
        });
        menuLibros.add(menuLibros3);

        menuEjemplaresdeunLibro.setText("Ejemplares de un Libro");
        menuLibros.add(menuEjemplaresdeunLibro);

        menuBiblioteca.add(menuLibros);

        menuGestion.setText("Gestión");

        menuPrestamo.setText("Prestamo");
        menuPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrestamoActionPerformed(evt);
            }
        });
        menuGestion.add(menuPrestamo);

        menuMulta.setText("Multa");
        menuMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMultaActionPerformed(evt);
            }
        });
        menuGestion.add(menuMulta);
        menuGestion.add(jSeparator5);

        menuPrestamoporfecha.setText("Prestamos por fecha");
        menuPrestamoporfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrestamoporfechaActionPerformed(evt);
            }
        });
        menuGestion.add(menuPrestamoporfecha);

        menuPrestamoporlector.setText("Prestamos por lector");
        menuPrestamoporlector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrestamoporlectorActionPerformed(evt);
            }
        });
        menuGestion.add(menuPrestamoporlector);
        menuGestion.add(jSeparator6);

        menuLibros7.setText("Lectores morosos");
        menuLibros7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibros7ActionPerformed(evt);
            }
        });
        menuGestion.add(menuLibros7);

        menuLibros8.setText("Lectores con multa");
        menuLibros8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibros8ActionPerformed(evt);
            }
        });
        menuGestion.add(menuLibros8);

        menuBiblioteca.add(menuGestion);

        menu.add(menuBiblioteca);

        menuAyuda.setText("Ayuda");

        menuAcercaBiblioteca.setText("Acerca de la Biblioteca");
        menuAyuda.add(menuAcercaBiblioteca);

        menuAcercaDe.setText("Acerca de...");
        menuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(menuAcercaDe);

        menu.add(menuAyuda);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(formInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(formConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(formInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(formConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc=" Eventos Generados por el Design ">  
    private void menuSistemaSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSistemaSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSistemaSalirActionPerformed

    private void menuSistemaReconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSistemaReconectarActionPerformed
        irAConectar();
    }//GEN-LAST:event_menuSistemaReconectarActionPerformed

    private void btnVolverAlEscritorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAlEscritorioActionPerformed
        if (grupo1tpfinal.Grupo1TPFinal.CONEXION.getConexion() == null) {
            irAConectar();
        } else {
            irAEscritorio();
        }
    }//GEN-LAST:event_btnVolverAlEscritorioActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        if (!txtNombreBD.getText().isEmpty()) {
            grupo1tpfinal.Grupo1TPFinal.CONEXION.setNombreBD(txtNombreBD.getText());
        }
        if (!txtPuerto.getText().isEmpty()) {
            grupo1tpfinal.Grupo1TPFinal.CONEXION.setPuerto(Integer.parseInt(txtPuerto.getText()));
        }
        if (!txtUsuarioBD.getText().isEmpty()) {
            grupo1tpfinal.Grupo1TPFinal.CONEXION.setUsuario(txtUsuarioBD.getText());
        }
        if (!txtContraseñaBD.getText().isEmpty()) {
            grupo1tpfinal.Grupo1TPFinal.CONEXION.setPassword(txtContraseñaBD.getText());
        }
        grupo1tpfinal.Grupo1TPFinal.CONEXION.Conectar();
        alinicio();
    }//GEN-LAST:event_btnConectarActionPerformed

    private void menuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaDeActionPerformed
        irAInfo();
    }//GEN-LAST:event_menuAcercaDeActionPerformed

    private void menuAutores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAutores1ActionPerformed
        System.out.println("ABRIR VISTA AUTORES");
        if(autorGUI == null)autorGUI = new AutorGUI();
        insertarEnEscritorio(autorGUI);
    }//GEN-LAST:event_menuAutores1ActionPerformed

    private void menuAutores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAutores2ActionPerformed
        System.out.println("ABRIR VISTA LISTA AUTORES");
        if(listaAutores == null)listaAutores = new ListaAutores();
        insertarEnEscritorio(listaAutores);
    }//GEN-LAST:event_menuAutores2ActionPerformed

    private void menuLectores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLectores1ActionPerformed
        System.out.println("ABRIR VISTA LECTORES");
        if(lectoresGUI == null)lectoresGUI = new Lectores();
        insertarEnEscritorio(lectoresGUI);
    }//GEN-LAST:event_menuLectores1ActionPerformed

    private void menuLectores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLectores2ActionPerformed
        System.out.println("ABRIR VISTA LISTA LECTORES");
        if(listaLectores == null)listaLectores = new ListaLectores();
        insertarEnEscritorio(listaLectores);
    }//GEN-LAST:event_menuLectores2ActionPerformed

    private void menuPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrestamoActionPerformed
        System.out.println("ABRIR PRESTAMOS");
        if(prestamoGUI == null)prestamoGUI = new PrestamoGUI();
        insertarEnEscritorio(prestamoGUI);
    }//GEN-LAST:event_menuPrestamoActionPerformed

    private void menuMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMultaActionPerformed
        System.out.println("ABRIR VISTA MULTAS");
        if(multa == null)multa = new Multa();
        insertarEnEscritorio(multa);
    }//GEN-LAST:event_menuMultaActionPerformed

    private void menuLibros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros1ActionPerformed
        System.out.println("ABRIR VISTA LIBROS");
        if(librosGUI == null)librosGUI = new Libros();
        insertarEnEscritorio(librosGUI);
    }//GEN-LAST:event_menuLibros1ActionPerformed

    private void menuLibros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros2ActionPerformed
        System.out.println("ABRIR VISTA LISTA LIBROS");
        if(listaLibros == null)listaLibros = new ListaLibros();
        insertarEnEscritorio(listaLibros);
    }//GEN-LAST:event_menuLibros2ActionPerformed

    private void menuLibros3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros3ActionPerformed
        System.out.println("ABRIR VISTA EJEMPLARES");
        if(ejemplares == null)ejemplares = new Ejemplares();
        insertarEnEscritorio(ejemplares);
    }//GEN-LAST:event_menuLibros3ActionPerformed

    private void menuPrestamoporfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrestamoporfechaActionPerformed
        System.out.println("ABRIR VISTA PRESTAMOS POR FECHA");
        if(prestamoPorFecha == null)prestamoPorFecha = new PrestamoPorFecha();
        insertarEnEscritorio(prestamoPorFecha);
    }//GEN-LAST:event_menuPrestamoporfechaActionPerformed

    private void menuPrestamoporlectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrestamoporlectorActionPerformed
        System.out.println("ABRIR VISTA PRESTAMOS POR LECTOR");
        if(prestamoPorLector == null)prestamoPorLector = new PrestamosPorLector();
        insertarEnEscritorio(prestamoPorLector);
    }//GEN-LAST:event_menuPrestamoporlectorActionPerformed

    private void menuLibros7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros7ActionPerformed
        System.out.println("ABRIR VISTA LECTORES MOROSOS");
        if(lectoresMorosos == null)lectoresMorosos = new LectoresMorosos();
        insertarEnEscritorio(lectoresMorosos);
    }//GEN-LAST:event_menuLibros7ActionPerformed

    private void menuLibros8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros8ActionPerformed
        System.out.println("ABRIR VISTA LECTORES CON MULTA");
        if(lectoresMultas == null)lectoresMultas = new LectoresMultas();
        insertarEnEscritorio(lectoresMultas);
    }//GEN-LAST:event_menuLibros8ActionPerformed

    private void txtPuertoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuertoKeyTyped
        char tecla = evt.getKeyChar(),
                cero = '0',
                nueve = '9';
        int max = 4; //.........................................................CONSULTAR
        if (txtPuerto.getText().length() >= max) { //modificar salio a lo bruto
            evt.consume();
        } else if (tecla < cero || tecla > nueve) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPuertoKeyTyped
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Metodo static iniciar ">
    /**
     * Antiguo main Construye el GUI principal de la Biblioteca.
     */
    public static void iniciar() {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Variables del Design ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnVolverAlEscritorio;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel formConectar;
    private javax.swing.JPanel formInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuAcercaBiblioteca;
    private javax.swing.JMenuItem menuAcercaDe;
    private javax.swing.JMenu menuAutores;
    private javax.swing.JMenuItem menuAutores1;
    private javax.swing.JMenuItem menuAutores2;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuBiblioteca;
    private javax.swing.JMenuItem menuEjemplaresdeunLibro;
    private javax.swing.JMenu menuGestion;
    private javax.swing.JMenu menuLectores;
    private javax.swing.JMenuItem menuLectores1;
    private javax.swing.JMenuItem menuLectores2;
    private javax.swing.JMenu menuLibros;
    private javax.swing.JMenuItem menuLibros1;
    private javax.swing.JMenuItem menuLibros2;
    private javax.swing.JMenuItem menuLibros3;
    private javax.swing.JMenuItem menuLibros7;
    private javax.swing.JMenuItem menuLibros8;
    private javax.swing.JMenuItem menuMulta;
    private javax.swing.JMenuItem menuPrestamo;
    private javax.swing.JMenuItem menuPrestamoporfecha;
    private javax.swing.JMenuItem menuPrestamoporlector;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem menuSistemaReconectar;
    private javax.swing.JMenuItem menuSistemaSalir;
    private javax.swing.JTextField txtContraseñaBD;
    private javax.swing.JTextField txtNombreBD;
    private javax.swing.JTextField txtPuerto;
    private javax.swing.JTextField txtUsuarioBD;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Metodos Privados ">
    /**
     * Si existe conexion prepara menu y escritorio, si no existe conexion
     * muestra informacion para reconectar.
     */
    private void alinicio() {
        //probar conexion
        if (!grupo1tpfinal.Grupo1TPFinal.CONEXION.esValida()) {
            grupo1tpfinal.Grupo1TPFinal.CONEXION.Conectar();
        }
        //error si no es valida
        if (!grupo1tpfinal.Grupo1TPFinal.CONEXION.esValida()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Error en la Conexion con la BD.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            irAConectar();
            //deshabilitar menu de biblioteca
            menuBiblioteca.setVisible(false);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Se establecio la conexión con la Biblioteca.",
                    "Biblioteca conectada",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            //establecer que pueda hacer uso del programa
            irAEscritorio();
            //habilitar menu de biblioteca
            menuBiblioteca.setVisible(true);
            vistas = new java.util.ArrayList<>();
        }
    }

    /**
     * Panel con informacion para intentar conectar
     */
    private void irAConectar() {
        formConectar.setVisible(true);
        formInfo.setVisible(false);
        escritorio.setVisible(false);
    }

    /**
     * Panel con informacion del TP
     */
    private void irAInfo() {
        formConectar.setVisible(false);
        formInfo.setVisible(true);
        escritorio.setVisible(false);
    }

    /**
     * Panel de escritorio principal
     */
    private void irAEscritorio() {
        formConectar.setVisible(false);
        formInfo.setVisible(false);
        escritorio.setVisible(true);
    }
    
    private void insertarEnEscritorio(javax.swing.JInternalFrame vista) {
        if (vista != null) {
            System.out.println("------------------------------------------------\nVISTA: " + vista.getTitle() + "\n------------------------------------------------");
            if(!vista.isVisible()){
                escritorio.add(vista);
                vista.setVisible(true);
            }
            vista.toFront();
            escritorio.setSelectedFrame(vista);
        }
    }
    //</editor-fold>
}


