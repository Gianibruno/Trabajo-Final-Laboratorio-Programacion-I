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
    private AutorGUI autorGUI = new AutorGUI();
    private ListaAutores listaAutores = new ListaAutores();
    private ListaLectores listaLectores = new ListaLectores();
    private ListaLibros listaLibros = new ListaLibros();
    private Libros librosGUI = new Libros();
    private Lectores lectoresGUI = new Lectores();
    private PrestamoGUI prestamoGUI = new PrestamoGUI();
    private PrestamoPorFecha prestamoPorFecha = new PrestamoPorFecha();
    private PrestamosPorLector prestamoPorLector = new PrestamosPorLector();
    private LectoresMorosos lectoresMorosos = new LectoresMorosos();
    private LectoresMultas lectoresMultas = new LectoresMultas();
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
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuAutores3 = new javax.swing.JMenuItem();
        menuLectores = new javax.swing.JMenu();
        menuLectores1 = new javax.swing.JMenuItem();
        menuLectores2 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuLibros7 = new javax.swing.JMenuItem();
        menuLibros8 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuLectores3 = new javax.swing.JMenuItem();
        menuLectores4 = new javax.swing.JMenuItem();
        menuLibros = new javax.swing.JMenu();
        menuLibros1 = new javax.swing.JMenuItem();
        menuLibros2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuLibros3 = new javax.swing.JMenuItem();
        menuLibros4 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuLibros5 = new javax.swing.JMenuItem();
        menuLibros6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuAyudaInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca por Grupo1");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
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
        menuAutores.add(jSeparator4);

        menuAutores3.setText("Libros publicados");
        menuAutores3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAutores3ActionPerformed(evt);
            }
        });
        menuAutores.add(menuAutores3);

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
        menuLectores.add(jSeparator6);

        menuLibros7.setText("Lectores morosos");
        menuLibros7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibros7ActionPerformed(evt);
            }
        });
        menuLectores.add(menuLibros7);

        menuLibros8.setText("Lectores con multa");
        menuLibros8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibros8ActionPerformed(evt);
            }
        });
        menuLectores.add(menuLibros8);
        menuLectores.add(jSeparator2);

        menuLectores3.setText("Prestamo");
        menuLectores3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLectores3ActionPerformed(evt);
            }
        });
        menuLectores.add(menuLectores3);

        menuLectores4.setText("Multa");
        menuLectores4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLectores4ActionPerformed(evt);
            }
        });
        menuLectores.add(menuLectores4);

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

        menuLibros4.setText("Ver ejemplares de un libro");
        menuLibros4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibros4ActionPerformed(evt);
            }
        });
        menuLibros.add(menuLibros4);
        menuLibros.add(jSeparator5);

        menuLibros5.setText("Prestamos por fecha");
        menuLibros5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibros5ActionPerformed(evt);
            }
        });
        menuLibros.add(menuLibros5);

        menuLibros6.setText("Prestamos por lector");
        menuLibros6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibros6ActionPerformed(evt);
            }
        });
        menuLibros.add(menuLibros6);

        menuBiblioteca.add(menuLibros);

        menu.add(menuBiblioteca);

        jMenu1.setText("Ayuda");

        menuAyudaInfo.setText("Acerca de...");
        menuAyudaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAyudaInfoActionPerformed(evt);
            }
        });
        jMenu1.add(menuAyudaInfo);

        menu.add(jMenu1);

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

    private void menuAyudaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAyudaInfoActionPerformed
        irAInfo();
    }//GEN-LAST:event_menuAyudaInfoActionPerformed

    private void menuAutores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAutores1ActionPerformed
        System.out.println("ABRIR VISTA AUTORES");
        insertarEnEscritorio(autorGUI);
    }//GEN-LAST:event_menuAutores1ActionPerformed

    private void menuAutores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAutores2ActionPerformed
        System.out.println("ABRIR VISTA LISTA AUTORES");
        insertarEnEscritorio(listaAutores);
    }//GEN-LAST:event_menuAutores2ActionPerformed

    private void menuAutores3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAutores3ActionPerformed
        insertarEnEscritorio(null);
    }//GEN-LAST:event_menuAutores3ActionPerformed

    private void menuLectores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLectores1ActionPerformed
        System.out.println("ABRIR VISTA LECTORES");
        insertarEnEscritorio(lectoresGUI);
    }//GEN-LAST:event_menuLectores1ActionPerformed

    private void menuLectores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLectores2ActionPerformed
        System.out.println("ABRIR VISTA LISTA LECTORES");
        insertarEnEscritorio(listaLectores);
    }//GEN-LAST:event_menuLectores2ActionPerformed

    private void menuLectores3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLectores3ActionPerformed
        System.out.println("ABRIR PRESTAMOS");
        insertarEnEscritorio(prestamoGUI);
    }//GEN-LAST:event_menuLectores3ActionPerformed

    private void menuLectores4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLectores4ActionPerformed
        insertarEnEscritorio(null);
    }//GEN-LAST:event_menuLectores4ActionPerformed

    private void menuLibros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros1ActionPerformed
        System.out.println("ABRIR VISTA LIBROS");
        insertarEnEscritorio(librosGUI);
    }//GEN-LAST:event_menuLibros1ActionPerformed

    private void menuLibros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros2ActionPerformed
        System.out.println("ABRIR VISTA LISTA LIBROS");
        insertarEnEscritorio(listaLibros);
    }//GEN-LAST:event_menuLibros2ActionPerformed

    private void menuLibros3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros3ActionPerformed
        System.out.println("ABRIR VISTA EJEMPLARES");
        insertarEnEscritorio(new Ejemplares());
    }//GEN-LAST:event_menuLibros3ActionPerformed

    private void menuLibros4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros4ActionPerformed
        insertarEnEscritorio(null);
    }//GEN-LAST:event_menuLibros4ActionPerformed

    private void menuLibros5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros5ActionPerformed
        System.out.println("ABRIR VISTA PRESTAMOS POR FECHA");
        insertarEnEscritorio(prestamoPorFecha);
    }//GEN-LAST:event_menuLibros5ActionPerformed

    private void menuLibros6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros6ActionPerformed
        System.out.println("ABRIR VISTA PRESTAMOS POR LECTOR");
        insertarEnEscritorio(prestamoPorLector);
    }//GEN-LAST:event_menuLibros6ActionPerformed

    private void menuLibros7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros7ActionPerformed
        System.out.println("ABRIR VISTA LECTORES MOROSOS");
        insertarEnEscritorio(lectoresMorosos);
    }//GEN-LAST:event_menuLibros7ActionPerformed

    private void menuLibros8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibros8ActionPerformed
        System.out.println("ABRIR VISTA LECTORES CON MULTA");
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAutores;
    private javax.swing.JMenuItem menuAutores1;
    private javax.swing.JMenuItem menuAutores2;
    private javax.swing.JMenuItem menuAutores3;
    private javax.swing.JMenuItem menuAyudaInfo;
    private javax.swing.JMenu menuBiblioteca;
    private javax.swing.JMenu menuLectores;
    private javax.swing.JMenuItem menuLectores1;
    private javax.swing.JMenuItem menuLectores2;
    private javax.swing.JMenuItem menuLectores3;
    private javax.swing.JMenuItem menuLectores4;
    private javax.swing.JMenu menuLibros;
    private javax.swing.JMenuItem menuLibros1;
    private javax.swing.JMenuItem menuLibros2;
    private javax.swing.JMenuItem menuLibros3;
    private javax.swing.JMenuItem menuLibros4;
    private javax.swing.JMenuItem menuLibros5;
    private javax.swing.JMenuItem menuLibros6;
    private javax.swing.JMenuItem menuLibros7;
    private javax.swing.JMenuItem menuLibros8;
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
        if (grupo1tpfinal.Grupo1TPFinal.CONEXION.getConexion() == null) {
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
        }
    }
    //</editor-fold>
}


