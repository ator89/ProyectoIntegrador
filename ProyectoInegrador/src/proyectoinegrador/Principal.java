
package proyectoinegrador;

import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_perfil = new javax.swing.JDialog();
        jd_amigos = new javax.swing.JDialog();
        jd_candidatos = new javax.swing.JDialog();
        jd_publicaciones = new javax.swing.JDialog();
        jd_inbox = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jd_actas = new javax.swing.JDialog();
        jd_login = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        tf_password = new javax.swing.JPasswordField();
        tf_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jd_registro = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        tf_Rpassword = new javax.swing.JPasswordField();
        tf_Ruser = new javax.swing.JTextField();
        tf_Rname = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        cb_tipoUser = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bg_registro = new javax.swing.ButtonGroup();
        jp_main = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jp_welcome = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bt_exit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_signup = new javax.swing.JMenuItem();
        jmi_logout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_perfil = new javax.swing.JMenuItem();
        jmi_amigos = new javax.swing.JMenuItem();
        jmi_candidatos = new javax.swing.JMenuItem();
        jmi_publicaciones = new javax.swing.JMenuItem();
        jmi_inbox = new javax.swing.JMenuItem();
        jmi_actas = new javax.swing.JMenuItem();

        jd_perfil.setTitle("Perfil");

        javax.swing.GroupLayout jd_perfilLayout = new javax.swing.GroupLayout(jd_perfil.getContentPane());
        jd_perfil.getContentPane().setLayout(jd_perfilLayout);
        jd_perfilLayout.setHorizontalGroup(
            jd_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );
        jd_perfilLayout.setVerticalGroup(
            jd_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        jd_amigos.setTitle("Amigos");

        javax.swing.GroupLayout jd_amigosLayout = new javax.swing.GroupLayout(jd_amigos.getContentPane());
        jd_amigos.getContentPane().setLayout(jd_amigosLayout);
        jd_amigosLayout.setHorizontalGroup(
            jd_amigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_amigosLayout.setVerticalGroup(
            jd_amigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_candidatos.setTitle("Candidatos");

        javax.swing.GroupLayout jd_candidatosLayout = new javax.swing.GroupLayout(jd_candidatos.getContentPane());
        jd_candidatos.getContentPane().setLayout(jd_candidatosLayout);
        jd_candidatosLayout.setHorizontalGroup(
            jd_candidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_candidatosLayout.setVerticalGroup(
            jd_candidatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_publicaciones.setTitle("Publicaciones");

        javax.swing.GroupLayout jd_publicacionesLayout = new javax.swing.GroupLayout(jd_publicaciones.getContentPane());
        jd_publicaciones.getContentPane().setLayout(jd_publicacionesLayout);
        jd_publicacionesLayout.setHorizontalGroup(
            jd_publicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_publicacionesLayout.setVerticalGroup(
            jd_publicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_inbox.setTitle("Inbox");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_inboxLayout = new javax.swing.GroupLayout(jd_inbox.getContentPane());
        jd_inbox.getContentPane().setLayout(jd_inboxLayout);
        jd_inboxLayout.setHorizontalGroup(
            jd_inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_inboxLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jd_inboxLayout.setVerticalGroup(
            jd_inboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_inboxLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jd_actas.setTitle("Actas");

        javax.swing.GroupLayout jd_actasLayout = new javax.swing.GroupLayout(jd_actas.getContentPane());
        jd_actas.getContentPane().setLayout(jd_actasLayout);
        jd_actasLayout.setHorizontalGroup(
            jd_actasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_actasLayout.setVerticalGroup(
            jd_actasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jd_login.setTitle("Ingreso al Sistema");

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        bt_login.setText("Ingresar");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel10.setText("¿Sin cuenta? Registrarse");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("AQUÍ");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_login)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(tf_usuario)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_login)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jd_registro.setTitle("Registro de Usuarios");

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Nombre:");

        jLabel13.setText("Usuario:");

        jLabel14.setText("Password:");

        jLabel15.setText("Fecha de Nacimiento:");

        jLabel16.setText("E-mail:");

        jLabel17.setText("Género:");

        bg_registro.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("M");

        bg_registro.add(jRadioButton2);
        jRadioButton2.setText("F");

        jLabel18.setText("Tipo de Usuario:");

        cb_tipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija un tipo...", "Usuario", "Candidato" }));

        jLabel19.setText("Ingrese sus datos personales");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(cb_tipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(tf_Ruser))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_Rpassword))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Rname, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel19)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_Rname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_Ruser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_Rpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cb_tipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_register_xl_64x64.png.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_register_ok_64x64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(66, 66, 66)
                .addComponent(jLabel21)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_registroLayout = new javax.swing.GroupLayout(jd_registro.getContentPane());
        jd_registro.getContentPane().setLayout(jd_registroLayout);
        jd_registroLayout.setHorizontalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_registroLayout.setVerticalGroup(
            jd_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Integrador");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_main.setBackground(new java.awt.Color(51, 153, 255));
        jp_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Perfil");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_friends_128x128.png"))); // NOI18N

        jLabel6.setText("Candidatos Presidente");

        jLabel7.setText("Publicaciones");

        jLabel8.setText("Inbox");

        jLabel9.setText("Actas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_main.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 570, 370));

        getContentPane().add(jp_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        jp_welcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Pantalla de Bienvenida");

        bt_exit.setText("Salir");
        bt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(419, Short.MAX_VALUE)
                .addComponent(bt_exit)
                .addGap(16, 16, 16))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(bt_exit)
                .addGap(17, 17, 17))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jp_welcome.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 510, 310));

        getContentPane().add(jp_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        jMenu1.setText("Sistema");

        jmi_login.setText("Log In");
        jmi_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loginActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_login);

        jmi_signup.setText("Registro");
        jmi_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_signupActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_signup);

        jmi_logout.setText("Log Out");
        jmi_logout.setEnabled(false);
        jMenu1.add(jmi_logout);
        jMenu1.add(jSeparator1);

        jmi_exit.setText("Salir");
        jmi_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_exitActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ver");

        jmi_perfil.setText("Perfil");
        jMenu2.add(jmi_perfil);

        jmi_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_friends_24x24.png"))); // NOI18N
        jmi_amigos.setText("Lista de Amigos");
        jMenu2.add(jmi_amigos);

        jmi_candidatos.setText("Lista de Candidatos");
        jMenu2.add(jmi_candidatos);

        jmi_publicaciones.setText("Publicaciones");
        jMenu2.add(jmi_publicaciones);

        jmi_inbox.setText("Inbox");
        jMenu2.add(jmi_inbox);

        jmi_actas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_actas_24x24.png"))); // NOI18N
        jmi_actas.setText("Actas");
        jMenu2.add(jmi_actas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loginActionPerformed
        
        jd_login.setModal(true);
        jd_login.pack();
        jd_login.setLocationRelativeTo(this);
        jd_login.setVisible(true);
        
    }//GEN-LAST:event_jmi_loginActionPerformed

    private void bt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_exitMouseClicked
        
        int exit = JOptionPane.showConfirmDialog(
                this, "¿Está seguro que desea salir del sistema?",
                "Terminar Aplicación",JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        if (exit==JOptionPane.YES_OPTION){
        System.exit(0);}
        
    }//GEN-LAST:event_bt_exitMouseClicked

    private void jmi_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_signupActionPerformed
        //registrar desde menu
        jd_registro.setModal(true);
        jd_registro.pack();
        jd_registro.setLocationRelativeTo(this);
        jd_registro.setVisible(true);
        
    }//GEN-LAST:event_jmi_signupActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        //registrar mediante link en login form
        jd_registro.setModal(true);
        jd_registro.pack();
        jd_registro.setLocationRelativeTo(this);
        jd_registro.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jmi_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_exitActionPerformed
        //salir del sistema desde Jmenu
        int exit = JOptionPane.showConfirmDialog(
                this, "¿Está seguro que desea salir del sistema?",
                "Terminar Aplicación",JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        if (exit==JOptionPane.YES_OPTION){
        System.exit(0);}
        
    }//GEN-LAST:event_jmi_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_registro;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_login;
    private javax.swing.JComboBox<String> cb_tipoUser;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog jd_actas;
    private javax.swing.JDialog jd_amigos;
    private javax.swing.JDialog jd_candidatos;
    private javax.swing.JDialog jd_inbox;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_perfil;
    private javax.swing.JDialog jd_publicaciones;
    private javax.swing.JDialog jd_registro;
    private javax.swing.JMenuItem jmi_actas;
    private javax.swing.JMenuItem jmi_amigos;
    private javax.swing.JMenuItem jmi_candidatos;
    private javax.swing.JMenuItem jmi_exit;
    private javax.swing.JMenuItem jmi_inbox;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_logout;
    private javax.swing.JMenuItem jmi_perfil;
    private javax.swing.JMenuItem jmi_publicaciones;
    private javax.swing.JMenuItem jmi_signup;
    private javax.swing.JPanel jp_main;
    private javax.swing.JPanel jp_welcome;
    private javax.swing.JTextField tf_Rname;
    private javax.swing.JPasswordField tf_Rpassword;
    private javax.swing.JTextField tf_Ruser;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
}
