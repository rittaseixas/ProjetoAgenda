package view;

import controller.AgendarController;
import controller.CompromissosController;
import util.MaximumSize;
import java.awt.Color;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Compromissos;
import DAO.BuscarInfoDAO;
import java.util.ArrayList;
import util.Formatar;
import util.ModeloTabelaDiaSelecionado;
import util.ModeloTabelaProximos;

public class Home extends javax.swing.JFrame {

    int xx; //mouse pressed
    int xy; //mouse pressed
    boolean compromissosSelected = true;
    boolean agendarSelected = false;
    boolean notasSelected = false;
    boolean buscarSelected = false;
    AgendarController agendarController = new AgendarController();
    CompromissosController compromissosController = new CompromissosController();

    public Home() {
        initComponents();
        txtDescricao.setDocument(new MaximumSize());
        iniciarCompromissos();

    }

    private void iniciarCompromissos() {
        Date[] datas = Formatar.buscarProximosDias();
        lblDepoisAmanha.setText(Formatar.formatarParaExibir(datas[2]));
        lblDepoisDepoisAmanha.setText(Formatar.formatarParaExibir(datas[3]));
        tabelaCompromissos1.setModel(new ModeloTabelaProximos(Formatar.formatarParaMySql(datas[0])));
        tabelaCompromissos2.setModel(new ModeloTabelaProximos(Formatar.formatarParaMySql(datas[1])));
        tabelaCompromissos3.setModel(new ModeloTabelaProximos(Formatar.formatarParaMySql(datas[2])));
        tabelaCompromissos4.setModel(new ModeloTabelaProximos(Formatar.formatarParaMySql(datas[3])));
    }

    private void fillComboBoxesAgendar() {
        //Limpa todos os combo boxes do painel Agendar
        jComboMateria.removeAllItems();
        jComboTipoTarefa.removeAllItems();
        jComboPrioridade.removeAllItems();

        //Preenche ArrayLists com os dados e preenche os comboboxes dentro de cada for.
        ArrayList<String> materias = BuscarInfoDAO.getMateriasCadastradas();
        for (String materia : materias) {
            //Preenche o combobox materia com as matérias cadastradas
            jComboMateria.addItem(materia);
        }
        ArrayList<String> tiposTarefas = BuscarInfoDAO.getTiposCadastrados();
        for (String tipo : tiposTarefas) {
            //preenche o combobox tipoTarefa com os tipos cadastrados
            jComboTipoTarefa.addItem(tipo);
        }
        ArrayList<String> prioridades = BuscarInfoDAO.getPrioridadesCadstradas();
        for (String prioridade : prioridades) {
            //preenche o combobox de prioridades com as prioridades cadastradas
            jComboPrioridade.addItem(prioridade);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        btnSair = new javax.swing.JLabel();
        btnNotas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCompromissos = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        compromissos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCompromissos1 = new javax.swing.JTable();
        lblDepoisAmanha = new javax.swing.JLabel();
        lblDepoisDepoisAmanha = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaCompromissos4 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaCompromissos2 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabelaCompromissos3 = new javax.swing.JTable();
        notas = new javax.swing.JPanel();
        jLabelConsultar = new javax.swing.JLabel();
        jLabelRegistrar = new javax.swing.JLabel();
        buscar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooserDia = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        TabelaCompromissosDoDia = new javax.swing.JTable();
        notasBuscar = new javax.swing.JPanel();
        agendar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboTipoTarefa = new javax.swing.JComboBox<>();
        jComboMateria = new javax.swing.JComboBox<>();
        jComboPrioridade = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomeTarefa = new javax.swing.JTextField();
        btnSalvarTarefa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jComboHora = new javax.swing.JComboBox<>();
        jComboMinuto = new javax.swing.JComboBox<>();
        jCallendarAgendar = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        header.setBackground(new java.awt.Color(1, 198, 83));
        header.setToolTipText("");
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSair.setText("X");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        btnNotas.setBackground(new java.awt.Color(1, 198, 83));
        btnNotas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNotas.setForeground(new java.awt.Color(255, 255, 255));
        btnNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNotas.setText("Matérias");
        btnNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNotas.setOpaque(true);
        btnNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNotasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNotasMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agenda");

        btnCompromissos.setBackground(new java.awt.Color(0, 150, 62));
        btnCompromissos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCompromissos.setForeground(new java.awt.Color(255, 255, 255));
        btnCompromissos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCompromissos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Calendar_20px.png"))); // NOI18N
        btnCompromissos.setText("Compromissos");
        btnCompromissos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompromissos.setOpaque(true);
        btnCompromissos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompromissosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCompromissosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCompromissosMouseExited(evt);
            }
        });

        btnAgendar.setBackground(new java.awt.Color(1, 198, 83));
        btnAgendar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Create_20px.png"))); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgendar.setOpaque(true);
        btnAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgendarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgendarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgendarMouseExited(evt);
            }
        });

        btnMinimizar.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setText("-");
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(1, 198, 83));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Search_20px.png"))); // NOI18N
        btnBuscar.setText(" Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setOpaque(true);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMinimizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnCompromissos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompromissos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setLayout(new java.awt.CardLayout());

        compromissos.setBackground(java.awt.Color.white);

        jLabel2.setText("Hoje");

        jLabel11.setText("Amanhã");

        tabelaCompromissos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compromisso", "Horário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCompromissos1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tabelaCompromissos1);

        lblDepoisAmanha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDepoisAmanha.setPreferredSize(new java.awt.Dimension(39, 14));

        lblDepoisDepoisAmanha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDepoisDepoisAmanha.setPreferredSize(new java.awt.Dimension(39, 14));

        tabelaCompromissos4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compromisso", "Horário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCompromissos4.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(tabelaCompromissos4);

        tabelaCompromissos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compromisso", "Horário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCompromissos2.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(tabelaCompromissos2);

        tabelaCompromissos3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compromisso", "Horário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCompromissos3.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane9.setViewportView(tabelaCompromissos3);

        javax.swing.GroupLayout compromissosLayout = new javax.swing.GroupLayout(compromissos);
        compromissos.setLayout(compromissosLayout);
        compromissosLayout.setHorizontalGroup(
            compromissosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, compromissosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(compromissosLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addGap(154, 154, 154)
                .addComponent(jLabel11)
                .addGap(119, 119, 119)
                .addComponent(lblDepoisAmanha, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDepoisDepoisAmanha, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        compromissosLayout.setVerticalGroup(
            compromissosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compromissosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(compromissosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compromissosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel11)
                        .addComponent(lblDepoisDepoisAmanha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(compromissosLayout.createSequentialGroup()
                        .addComponent(lblDepoisAmanha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addGroup(compromissosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        home.add(compromissos, "card2");

        notas.setBackground(java.awt.Color.white);

        jLabelConsultar.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabelConsultar.setForeground(new java.awt.Color(102, 102, 102));
        jLabelConsultar.setText("Consultar");

        jLabelRegistrar.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabelRegistrar.setForeground(new java.awt.Color(102, 102, 102));
        jLabelRegistrar.setText("Registrar");

        javax.swing.GroupLayout notasLayout = new javax.swing.GroupLayout(notas);
        notas.setLayout(notasLayout);
        notasLayout.setHorizontalGroup(
            notasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notasLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabelConsultar)
                .addGap(34, 34, 34)
                .addComponent(jLabelRegistrar)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        notasLayout.setVerticalGroup(
            notasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(notasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultar)
                    .addComponent(jLabelRegistrar))
                .addContainerGap(318, Short.MAX_VALUE))
        );

        home.add(notas, "card4");

        buscar.setBackground(java.awt.Color.white);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel8.setText("Dia");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TabelaCompromissosDoDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compromisso", "Descrição", "Tipo", "Matéria", "Horário", "Prioridade"
            }
        ));
        jScrollPane6.setViewportView(TabelaCompromissosDoDia);

        javax.swing.GroupLayout buscarLayout = new javax.swing.GroupLayout(buscar);
        buscar.setLayout(buscarLayout);
        buscarLayout.setHorizontalGroup(
            buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(buscarLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jDateChooserDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton2)
                .addContainerGap(177, Short.MAX_VALUE))
        );
        buscarLayout.setVerticalGroup(
            buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooserDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        home.add(buscar, "card2");

        javax.swing.GroupLayout notasBuscarLayout = new javax.swing.GroupLayout(notasBuscar);
        notasBuscar.setLayout(notasBuscarLayout);
        notasBuscarLayout.setHorizontalGroup(
            notasBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        notasBuscarLayout.setVerticalGroup(
            notasBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        home.add(notasBuscar, "card6");

        agendar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel6.setText("Descrição");

        jComboTipoTarefa.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jComboTipoTarefa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarefa", "Estudar", "Trabalho", "Prova" }));

        jComboMateria.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        jComboPrioridade.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jComboPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Média", "Baixa" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel9.setText("Tipo");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel10.setText("Matéria");

        txtNomeTarefa.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtNomeTarefa.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));

        btnSalvarTarefa.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvarTarefa.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnSalvarTarefa.setText("Agendar");
        btnSalvarTarefa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarTarefa.setPreferredSize(new java.awt.Dimension(76, 25));
        btnSalvarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTarefaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Horário");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel12.setText("Prioridade");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtDescricao.setLineWrap(true);
        txtDescricao.setRows(5);
        txtDescricao.setWrapStyleWord(true);
        txtDescricao.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txtDescricao.setMaximumSize(new java.awt.Dimension(204, 84));
        txtDescricao.setMinimumSize(new java.awt.Dimension(204, 84));
        jScrollPane1.setViewportView(txtDescricao);

        jComboHora.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jComboHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jComboMinuto.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jComboMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setText("Dia");

        javax.swing.GroupLayout agendarLayout = new javax.swing.GroupLayout(agendar);
        agendar.setLayout(agendarLayout);
        agendarLayout.setHorizontalGroup(
            agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agendarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agendarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(txtNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(agendarLayout.createSequentialGroup()
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addGroup(agendarLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(agendarLayout.createSequentialGroup()
                        .addComponent(jComboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCallendarAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboTipoTarefa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboPrioridade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agendarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        agendarLayout.setVerticalGroup(
            agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(agendarLayout.createSequentialGroup()
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboMinuto)
                                    .addComponent(jComboHora)))))
                    .addGroup(agendarLayout.createSequentialGroup()
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboTipoTarefa))
                        .addGap(18, 18, 18)
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addComponent(jCallendarAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))))
                .addGap(31, 31, 31)
                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnSalvarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        home.add(agendar, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy); //set location do mouse na tela
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xx = evt.getX();    //mouse pressed
        xy = evt.getY();    //mouse pressed
    }//GEN-LAST:event_headerMousePressed

    private void btnCompromissosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompromissosMouseClicked
        iniciarCompromissos();
        setLabelColor(btnCompromissos);
        resetLabelColor(btnAgendar);
        resetLabelColor(btnNotas);
        resetLabelColor(btnBuscar);
        compromissosSelected = true;
        agendarSelected = false;
        notasSelected = false;
        buscarSelected = false;
        compromissos.setVisible(true);
        agendar.setVisible(false);
        notas.setVisible(false);
        buscar.setVisible(false);
    }//GEN-LAST:event_btnCompromissosMouseClicked

    private void btnNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotasMouseClicked
        setLabelColor(btnNotas);
        resetLabelColor(btnAgendar);
        resetLabelColor(btnCompromissos);
        resetLabelColor(btnBuscar);
        compromissosSelected = false;
        agendarSelected = false;
        notasSelected = true;
        buscarSelected = false;
        compromissos.setVisible(false);
        agendar.setVisible(false);
        notas.setVisible(true);
        buscar.setVisible(false);
    }//GEN-LAST:event_btnNotasMouseClicked

    private void btnAgendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMouseClicked
        fillComboBoxesAgendar();
        setLabelColor(btnAgendar);
        resetLabelColor(btnCompromissos);
        resetLabelColor(btnNotas);
        resetLabelColor(btnBuscar);
        compromissosSelected = false;
        agendarSelected = true;
        notasSelected = false;
        buscarSelected = false;
        compromissos.setVisible(false);
        agendar.setVisible(true);
        notas.setVisible(false);
        buscar.setVisible(false);
    }//GEN-LAST:event_btnAgendarMouseClicked

    private void btnCompromissosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompromissosMouseEntered
        setLabelColor(btnCompromissos);
    }//GEN-LAST:event_btnCompromissosMouseEntered

    private void btnCompromissosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompromissosMouseExited
        if (compromissosSelected == false) {
            resetLabelColor(btnCompromissos);
        }
    }//GEN-LAST:event_btnCompromissosMouseExited

    private void btnNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotasMouseEntered
        setLabelColor(btnNotas);
    }//GEN-LAST:event_btnNotasMouseEntered

    private void btnNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotasMouseExited
        if (notasSelected == false) {
            resetLabelColor(btnNotas);
        }
    }//GEN-LAST:event_btnNotasMouseExited

    private void btnAgendarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMouseEntered
        setLabelColor(btnAgendar);
    }//GEN-LAST:event_btnAgendarMouseEntered

    private void btnAgendarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMouseExited
        if (agendarSelected == false) {
            resetLabelColor(btnAgendar);
        }
    }//GEN-LAST:event_btnAgendarMouseExited

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        setLabelColor(btnBuscar);
        resetLabelColor(btnAgendar);
        resetLabelColor(btnCompromissos);
        resetLabelColor(btnNotas);
        compromissosSelected = false;
        agendarSelected = false;
        notasSelected = false;
        buscarSelected = true;
        compromissos.setVisible(false);
        agendar.setVisible(false);
        notas.setVisible(false);
        buscar.setVisible(true);
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        setLabelColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        if (buscarSelected == false) {
            resetLabelColor(btnBuscar);
        }
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnSalvarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTarefaActionPerformed
        if (txtNomeTarefa.getText().isEmpty() || jCallendarAgendar.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, tenha certeza de ter preenchido o campo Nome e ter escolhido uma data");
        } else {
            Compromissos tarefa = new Compromissos();
            tarefa.setNomeTarefa(txtNomeTarefa.getText());
            tarefa.setDescricaoTarefa(txtDescricao.getText());
            tarefa.setTipoTarefa(BuscarInfoDAO.buscarCodTipoTarefa(jComboTipoTarefa.getSelectedItem().toString()));
            tarefa.setCodMateria(BuscarInfoDAO.buscarCodMateria(jComboMateria.getSelectedItem().toString()));
            tarefa.setDataTarefa(Formatar.formatarParaMySql(jCallendarAgendar.getDate()));
            tarefa.setHorarioTarefa(jComboHora.getSelectedItem().toString() + ":" + jComboMinuto.getSelectedItem().toString());
            tarefa.setPrioridadeTarefa(BuscarInfoDAO.buscarCodPrioridade(jComboPrioridade.getSelectedItem().toString()));
            agendarController.agendarTarefas(tarefa);
        }
    }//GEN-LAST:event_btnSalvarTarefaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jDateChooserDia.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor, tenha certeza de ter selecionado um dia válido");
        } else {
            TabelaCompromissosDoDia.setModel(new ModeloTabelaDiaSelecionado(Formatar.formatarParaMySql(jDateChooserDia.getDate())));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void setLabelColor(JLabel label) {
        label.setBackground(new Color(0, 150, 62));
    }

    private void resetLabelColor(JLabel label) {
        label.setBackground(new Color(1, 198, 83));
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCompromissosDoDia;
    private javax.swing.JPanel agendar;
    private javax.swing.JLabel btnAgendar;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnCompromissos;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel btnNotas;
    private javax.swing.JLabel btnSair;
    private javax.swing.JButton btnSalvarTarefa;
    private javax.swing.JPanel buscar;
    private javax.swing.JPanel compromissos;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jCallendarAgendar;
    private javax.swing.JComboBox<String> jComboHora;
    private javax.swing.JComboBox<String> jComboMateria;
    private javax.swing.JComboBox<String> jComboMinuto;
    private javax.swing.JComboBox<String> jComboPrioridade;
    private javax.swing.JComboBox<String> jComboTipoTarefa;
    private com.toedter.calendar.JDateChooser jDateChooserDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConsultar;
    private javax.swing.JLabel jLabelRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblDepoisAmanha;
    private javax.swing.JLabel lblDepoisDepoisAmanha;
    private javax.swing.JPanel notas;
    private javax.swing.JPanel notasBuscar;
    private javax.swing.JTable tabelaCompromissos1;
    private javax.swing.JTable tabelaCompromissos2;
    private javax.swing.JTable tabelaCompromissos3;
    private javax.swing.JTable tabelaCompromissos4;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNomeTarefa;
    // End of variables declaration//GEN-END:variables
}
