/*
Final Project
Create a simple POS using Java GUI

Group 1
Cruz, James Laurence A.
Dela Cruz, Rica V.
Lenizo, Jackilyn O.
Paz, Kristel Erica D.
Sacayanan, Christian John P.

BS CpE 2-3 - Software Design

Java versions used during development
Java: 16; Java HotSpot(TM) 64-Bit Server VM 16+36-2231
Runtime: Java(TM) SE Runtime Environment 16+36-2231
 */
package GUIPOS;

// GUI Autoimports
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

// Import Menu.java to reuse old classes from prev. lab experiment
import GUIPOS.Menu;
import java.text.DecimalFormat;

public class POS extends javax.swing.JFrame {

    /**
     * Creates new form POS
     */
    public POS() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        showDate();
        showTime();

    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        lblDate.setText(s.format(d));
    }

    void showTime() {
    new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                lblTime.setText(s.format(d));
            }
        }
        ).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblPLMPizzazeria1 = new javax.swing.JLabel();
        lblPLMPizzazeria2 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        cboPizza = new javax.swing.JComboBox<>();
        lblPizza = new javax.swing.JLabel();
        lblPizzaSize = new javax.swing.JLabel();
        lblPizzaQty = new javax.swing.JLabel();
        lblPizzaamt = new javax.swing.JLabel();
        btnPizzaAO = new javax.swing.JButton();
        cboPizzaSize = new javax.swing.JComboBox<>();
        lblChicken = new javax.swing.JLabel();
        lblChickenSize = new javax.swing.JLabel();
        lblChickenQty = new javax.swing.JLabel();
        lblChickenamt = new javax.swing.JLabel();
        btnChickenAO = new javax.swing.JButton();
        lblPasta = new javax.swing.JLabel();
        lblPastaSize = new javax.swing.JLabel();
        lblPastaQty = new javax.swing.JLabel();
        lblPastaamt = new javax.swing.JLabel();
        btnPastaAO = new javax.swing.JButton();
        lblDrinks = new javax.swing.JLabel();
        lblDrinksSize = new javax.swing.JLabel();
        lblDrinksQty = new javax.swing.JLabel();
        lblDrinksamt = new javax.swing.JLabel();
        btnDrinksAO = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaReceipt = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        lblvat = new javax.swing.JLabel();
        lblVAT = new javax.swing.JLabel();
        lblSUBTOTAL = new javax.swing.JLabel();
        lblsubtotal = new javax.swing.JLabel();
        txtEPayment = new javax.swing.JTextField();
        lblEPAYMENT = new javax.swing.JLabel();
        lblchange = new javax.swing.JLabel();
        lblCHANGE = new javax.swing.JLabel();
        lblTOTAL = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        btnPrintReceipt = new javax.swing.JButton();
        lblReceipt = new javax.swing.JLabel();
        lblPizzaAMT = new javax.swing.JLabel();
        lblChickenAMT = new javax.swing.JLabel();
        lblPastaAMT = new javax.swing.JLabel();
        lblDrinksAMT = new javax.swing.JLabel();
        btnNewOrder = new javax.swing.JButton();
        spnPizzaQty = new javax.swing.JSpinner();
        spnChickenQty = new javax.swing.JSpinner();
        spnPastaQty = new javax.swing.JSpinner();
        spnDrinksQty = new javax.swing.JSpinner();
        cboChickenSize = new javax.swing.JComboBox<>();
        cboPastaSize = new javax.swing.JComboBox<>();
        cboPasta = new javax.swing.JComboBox<>();
        cboDrinks = new javax.swing.JComboBox<>();
        cboDrinksSize = new javax.swing.JComboBox<>();
        cboChicken = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(977, 620));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(182, 21, 5));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblDate.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 172, 14));
        lblDate.setText("DATE");

        lblTime.setBackground(new java.awt.Color(220, 107, 41));
        lblTime.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(220, 107, 41));
        lblTime.setText("TIME");

        lblPLMPizzazeria1.setBackground(new java.awt.Color(255, 172, 14));
        lblPLMPizzazeria1.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 50)); // NOI18N
        lblPLMPizzazeria1.setForeground(new java.awt.Color(255, 172, 14));
        lblPLMPizzazeria1.setText("PLM PIZZAZERIA");

        lblPLMPizzazeria2.setBackground(new java.awt.Color(220, 107, 41));
        lblPLMPizzazeria2.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 50)); // NOI18N
        lblPLMPizzazeria2.setForeground(new java.awt.Color(220, 107, 41));
        lblPLMPizzazeria2.setText("PLM PIZZAZERIA");

        jLayeredPane1.setLayer(lblDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblPLMPizzazeria1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblPLMPizzazeria2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblPLMPizzazeria2)
                        .addGap(58, 58, 58)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPLMPizzazeria1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblPLMPizzazeria1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPLMPizzazeria2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        lblLogo.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblLogo)
                .addGap(32, 32, 32)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 980, 110);

        cboPizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Pizza", "Pepperoni", "Hawaiian", "Four Cheese", "Garlic Shrimp" }));
        cboPizza.setPreferredSize(new java.awt.Dimension(58, 25));
        getContentPane().add(cboPizza);
        cboPizza.setBounds(30, 158, 158, 25);

        lblPizza.setBackground(new java.awt.Color(182, 21, 5));
        lblPizza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPizza.setForeground(new java.awt.Color(182, 21, 5));
        lblPizza.setText("PIZZA");
        getContentPane().add(lblPizza);
        lblPizza.setBounds(30, 135, 57, 17);

        lblPizzaSize.setBackground(new java.awt.Color(182, 21, 5));
        lblPizzaSize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPizzaSize.setForeground(new java.awt.Color(182, 21, 5));
        lblPizzaSize.setText("SIZE");
        getContentPane().add(lblPizzaSize);
        lblPizzaSize.setBounds(194, 135, 57, 17);

        lblPizzaQty.setBackground(new java.awt.Color(182, 31, 5));
        lblPizzaQty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPizzaQty.setForeground(new java.awt.Color(182, 31, 5));
        lblPizzaQty.setText("QTY");
        getContentPane().add(lblPizzaQty);
        lblPizzaQty.setBounds(362, 135, 57, 17);

        lblPizzaamt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPizzaamt.setForeground(new java.awt.Color(204, 51, 0));
        lblPizzaamt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPizzaamt.setText(".00");
        lblPizzaamt.setPreferredSize(new java.awt.Dimension(29, 25));
        getContentPane().add(lblPizzaamt);
        lblPizzaamt.setBounds(444, 159, 85, 22);

        btnPizzaAO.setBackground(new java.awt.Color(182, 21, 0));
        btnPizzaAO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPizzaAO.setForeground(new java.awt.Color(243, 198, 129));
        btnPizzaAO.setText("Add Order");
        btnPizzaAO.setPreferredSize(new java.awt.Dimension(85, 25));
        btnPizzaAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPizzaAOActionPerformed(evt);
            }
        });
        getContentPane().add(btnPizzaAO);
        btnPizzaAO.setBounds(539, 159, 90, 25);

        cboPizzaSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Size", "Regular", "Large", "Party" }));
        cboPizzaSize.setPreferredSize(new java.awt.Dimension(58, 25));
        cboPizzaSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPizzaSizeActionPerformed(evt);
            }
        });
        getContentPane().add(cboPizzaSize);
        cboPizzaSize.setBounds(194, 158, 158, 25);

        lblChicken.setBackground(new java.awt.Color(182, 21, 5));
        lblChicken.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblChicken.setForeground(new java.awt.Color(182, 21, 5));
        lblChicken.setText("CHICKEN");
        getContentPane().add(lblChicken);
        lblChicken.setBounds(30, 201, 80, 17);

        lblChickenSize.setBackground(new java.awt.Color(182, 21, 5));
        lblChickenSize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblChickenSize.setForeground(new java.awt.Color(182, 21, 5));
        lblChickenSize.setText("SIZE");
        getContentPane().add(lblChickenSize);
        lblChickenSize.setBounds(194, 201, 57, 17);

        lblChickenQty.setBackground(new java.awt.Color(182, 31, 5));
        lblChickenQty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblChickenQty.setForeground(new java.awt.Color(182, 31, 5));
        lblChickenQty.setText("QTY");
        getContentPane().add(lblChickenQty);
        lblChickenQty.setBounds(362, 201, 57, 17);

        lblChickenamt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblChickenamt.setForeground(new java.awt.Color(204, 51, 0));
        lblChickenamt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChickenamt.setText(".00");
        lblChickenamt.setPreferredSize(new java.awt.Dimension(29, 25));
        getContentPane().add(lblChickenamt);
        lblChickenamt.setBounds(444, 225, 85, 22);

        btnChickenAO.setBackground(new java.awt.Color(182, 21, 0));
        btnChickenAO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnChickenAO.setForeground(new java.awt.Color(243, 198, 129));
        btnChickenAO.setText("Add Order");
        btnChickenAO.setPreferredSize(new java.awt.Dimension(85, 25));
        btnChickenAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChickenAOActionPerformed(evt);
            }
        });
        getContentPane().add(btnChickenAO);
        btnChickenAO.setBounds(539, 225, 90, 25);

        lblPasta.setBackground(new java.awt.Color(182, 21, 5));
        lblPasta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPasta.setForeground(new java.awt.Color(182, 21, 5));
        lblPasta.setText("PASTA");
        getContentPane().add(lblPasta);
        lblPasta.setBounds(30, 272, 57, 17);

        lblPastaSize.setBackground(new java.awt.Color(182, 21, 5));
        lblPastaSize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPastaSize.setForeground(new java.awt.Color(182, 21, 5));
        lblPastaSize.setText("SIZE");
        getContentPane().add(lblPastaSize);
        lblPastaSize.setBounds(194, 275, 57, 17);

        lblPastaQty.setBackground(new java.awt.Color(182, 31, 5));
        lblPastaQty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPastaQty.setForeground(new java.awt.Color(182, 31, 5));
        lblPastaQty.setText("QTY");
        getContentPane().add(lblPastaQty);
        lblPastaQty.setBounds(362, 275, 57, 17);

        lblPastaamt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPastaamt.setForeground(new java.awt.Color(204, 51, 0));
        lblPastaamt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastaamt.setText(".00");
        lblPastaamt.setPreferredSize(new java.awt.Dimension(29, 25));
        getContentPane().add(lblPastaamt);
        lblPastaamt.setBounds(444, 299, 85, 22);

        btnPastaAO.setBackground(new java.awt.Color(182, 21, 0));
        btnPastaAO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPastaAO.setForeground(new java.awt.Color(243, 198, 129));
        btnPastaAO.setText("Add Order");
        btnPastaAO.setPreferredSize(new java.awt.Dimension(85, 25));
        btnPastaAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastaAOActionPerformed(evt);
            }
        });
        getContentPane().add(btnPastaAO);
        btnPastaAO.setBounds(539, 299, 90, 25);

        lblDrinks.setBackground(new java.awt.Color(182, 21, 5));
        lblDrinks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDrinks.setForeground(new java.awt.Color(182, 21, 5));
        lblDrinks.setText("DRINKS");
        getContentPane().add(lblDrinks);
        lblDrinks.setBounds(30, 338, 122, 17);

        lblDrinksSize.setBackground(new java.awt.Color(182, 21, 5));
        lblDrinksSize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDrinksSize.setForeground(new java.awt.Color(182, 21, 5));
        lblDrinksSize.setText("SIZE");
        getContentPane().add(lblDrinksSize);
        lblDrinksSize.setBounds(194, 340, 57, 17);

        lblDrinksQty.setBackground(new java.awt.Color(182, 31, 5));
        lblDrinksQty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDrinksQty.setForeground(new java.awt.Color(182, 31, 5));
        lblDrinksQty.setText("QTY");
        getContentPane().add(lblDrinksQty);
        lblDrinksQty.setBounds(362, 338, 57, 17);

        lblDrinksamt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDrinksamt.setForeground(new java.awt.Color(204, 51, 0));
        lblDrinksamt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDrinksamt.setText(".00");
        lblDrinksamt.setPreferredSize(new java.awt.Dimension(29, 25));
        getContentPane().add(lblDrinksamt);
        lblDrinksamt.setBounds(444, 362, 85, 22);

        btnDrinksAO.setBackground(new java.awt.Color(182, 21, 0));
        btnDrinksAO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDrinksAO.setForeground(new java.awt.Color(243, 198, 129));
        btnDrinksAO.setText("Add Order");
        btnDrinksAO.setPreferredSize(new java.awt.Dimension(85, 25));
        btnDrinksAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinksAOActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrinksAO);
        btnDrinksAO.setBounds(539, 362, 90, 25);

        jPanel2.setBackground(new java.awt.Color(182, 21, 5));
        jPanel2.setForeground(new java.awt.Color(182, 21, 5));

        txaReceipt.setColumns(20);
        txaReceipt.setRows(5);
        jScrollPane1.setViewportView(txaReceipt);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(660, 155, 279, 380);

        jPanel4.setBackground(new java.awt.Color(243, 198, 129));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        lblvat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblvat.setForeground(new java.awt.Color(204, 51, 0));
        lblvat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblvat.setText("00.00");
        lblvat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0)));

        lblVAT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVAT.setForeground(new java.awt.Color(220, 107, 41));
        lblVAT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVAT.setText("VAT");

        lblSUBTOTAL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSUBTOTAL.setForeground(new java.awt.Color(220, 107, 41));
        lblSUBTOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSUBTOTAL.setText("SUBTOTAL");

        lblsubtotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblsubtotal.setForeground(new java.awt.Color(204, 51, 0));
        lblsubtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsubtotal.setText("00.00");
        lblsubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0)));

        txtEPayment.setBackground(new java.awt.Color(204, 51, 0));
        txtEPayment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEPayment.setForeground(new java.awt.Color(255, 255, 255));
        txtEPayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEPayment.setText("00");
        txtEPayment.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEPayment.setPreferredSize(new java.awt.Dimension(20, 25));

        lblEPAYMENT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEPAYMENT.setForeground(new java.awt.Color(204, 51, 0));
        lblEPAYMENT.setText("ENTER PAYMENT:");

        lblchange.setBackground(new java.awt.Color(255, 102, 51));
        lblchange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblchange.setForeground(new java.awt.Color(182, 21, 5));
        lblchange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblchange.setText("00.00");
        lblchange.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 0)));
        lblchange.setPreferredSize(new java.awt.Dimension(29, 25));

        lblCHANGE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCHANGE.setForeground(new java.awt.Color(182, 21, 0));
        lblCHANGE.setText("CHANGE:");

        lblTOTAL.setBackground(new java.awt.Color(0, 0, 0));
        lblTOTAL.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblTOTAL.setForeground(new java.awt.Color(182, 21, 5));
        lblTOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTOTAL.setText("TOTAL ");
        lblTOTAL.setPreferredSize(new java.awt.Dimension(46, 20));
        lblTOTAL.setVerifyInputWhenFocusTarget(false);

        lbltotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltotal.setText("00.00");
        lbltotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPrintReceipt.setBackground(new java.awt.Color(182, 21, 5));
        btnPrintReceipt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrintReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintReceipt.setText("PAY and PRINT RECEIPT");
        btnPrintReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReceiptActionPerformed(evt);
            }
        });

        lblReceipt.setBackground(new java.awt.Color(182, 21, 5));
        lblReceipt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblReceipt.setForeground(new java.awt.Color(182, 21, 5));
        lblReceipt.setText("RECEIPT");

        lblPizzaAMT.setBackground(new java.awt.Color(182, 21, 0));
        lblPizzaAMT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPizzaAMT.setForeground(new java.awt.Color(182, 21, 0));
        lblPizzaAMT.setText("AMOUNT");

        lblChickenAMT.setBackground(new java.awt.Color(182, 21, 0));
        lblChickenAMT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblChickenAMT.setForeground(new java.awt.Color(182, 21, 0));
        lblChickenAMT.setText("AMOUNT");

        lblPastaAMT.setBackground(new java.awt.Color(182, 21, 0));
        lblPastaAMT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPastaAMT.setForeground(new java.awt.Color(182, 21, 0));
        lblPastaAMT.setText("AMOUNT");

        lblDrinksAMT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDrinksAMT.setForeground(new java.awt.Color(182, 21, 0));
        lblDrinksAMT.setText("AMOUNT");

        btnNewOrder.setBackground(new java.awt.Color(204, 51, 0));
        btnNewOrder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder.setText("NEW ORDER");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });

        spnPizzaQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQtyStateChanged(evt);
            }
        });

        spnChickenQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQtyStateChanged(evt);
            }
        });

        spnPastaQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQtyStateChanged(evt);
            }
        });

        spnDrinksQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQtyStateChanged(evt);
            }
        });

        cboChickenSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Size", "Small Bucket", "Medium Bucket", "Large Bucket" }));
        cboChickenSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChickenSizeActionPerformed(evt);
            }
        });

        cboPastaSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Size", "Solo", "Pan" }));
        cboPastaSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPastaSizeActionPerformed(evt);
            }
        });

        cboPasta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Pasta", "Spaghetti", "Carbonara" }));
        cboPasta.setPreferredSize(new java.awt.Dimension(58, 25));

        cboDrinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Drinks", "Pepsi", "Coke", "Sprite", "Royal" }));
        cboDrinks.setPreferredSize(new java.awt.Dimension(58, 25));

        cboDrinksSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Size", "16 Oz", "1.5 Liter" }));
        cboDrinksSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDrinksSizeActionPerformed(evt);
            }
        });

        cboChicken.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Chicken", "Original", "Spicy" }));
        cboChicken.setPreferredSize(new java.awt.Dimension(58, 25));

        lblStatus.setForeground(new java.awt.Color(204, 51, 0));
        lblStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSUBTOTAL)
                                    .addComponent(lblVAT))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblsubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lblvat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEPAYMENT)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblStatus)
                                .addComponent(lblCHANGE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cboDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboDrinksSize, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(cboChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboChickenSize, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(cboPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboPastaSize, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnDrinksQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(spnPastaQty, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spnChickenQty, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spnPizzaQty, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDrinksAMT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPastaAMT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblChickenAMT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPizzaAMT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(243, 243, 243))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnPrintReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(139, 139, 139)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNewOrder)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lblReceipt)
                                .addGap(29, 29, 29)))
                        .addGap(116, 116, 116))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(358, 358, 358))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblPizzaAMT)
                        .addGap(49, 49, 49)
                        .addComponent(lblChickenAMT)
                        .addGap(57, 57, 57)
                        .addComponent(lblPastaAMT)
                        .addGap(45, 45, 45)
                        .addComponent(lblDrinksAMT))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(401, 401, 401)
                        .addComponent(btnNewOrder))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(spnPizzaQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnChickenQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboChickenSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboChicken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnPastaQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPastaSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnDrinksQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboDrinksSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEPAYMENT)
                            .addComponent(lblsubtotal)
                            .addComponent(lblSUBTOTAL))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblchange, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCHANGE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPrintReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblvat)
                                    .addComponent(lblVAT))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(13, 13, 13)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 100, 980, 500);
    }// </editor-fold>//GEN-END:initComponents

    private Purchase purchase = new Purchase(1); // TODO: Find a better way to handle this
    DecimalFormat formatter = new DecimalFormat("#.00");
    
    private String formatSubtotal() {
        String subtotal = formatter.format(purchase.getSubtotal());
        return subtotal;
    }
    
    private String formatVat() {
        String vat = formatter.format(purchase.getVAT());
        return vat;
    }

    private String formatTotal() {
        String total = formatter.format(purchase.getTotal());
        return total;
    }
    
    private void outputSubVatTotal() {
        lblsubtotal.setText(formatSubtotal());
        lblvat.setText(formatVat());
        lbltotal.setText(formatTotal());
    }
    
    private void btnPizzaAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPizzaAOActionPerformed
        String flavor = (String)cboPizza.getSelectedItem();
        String size = (String)cboPizzaSize.getSelectedItem();
        int qty = (int)spnPizzaQty.getValue();
        
        // Input validation, dont output subtotal below if invalid selection
        if (!(flavor.equals("Select Pizza") || (size.equals("Select Size")))) {
            Pizza pizzaOrder = new Pizza(size, flavor);
            for (int i = 0; i < qty; i++) {
                purchase.addOrder(pizzaOrder);
            }
            outputSubVatTotal();
        }
    }//GEN-LAST:event_btnPizzaAOActionPerformed

    private void btnChickenAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChickenAOActionPerformed
        String flavor = (String)cboChicken.getSelectedItem();
        String size = (String)cboChickenSize.getSelectedItem();
        int qty = (int)spnChickenQty.getValue();

        if (!(flavor.equals("Select Chicken") || (size.equals("Select Size")))) {
            Chicken chickenOrder = new Chicken(size, flavor);
            for (int i = 0; i < qty; i++) {
                purchase.addOrder(chickenOrder);
            }
            outputSubVatTotal();
        }
    }//GEN-LAST:event_btnChickenAOActionPerformed

    private void btnPastaAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastaAOActionPerformed
        String typeofPasta = (String)cboPasta.getSelectedItem();
        String serving = (String)cboPastaSize.getSelectedItem();
        int qty = (int)spnPastaQty.getValue();

        if (!(typeofPasta.equals("Select Pasta") || (serving.equals("Select Size")))) {
            Pasta pastaOrder = new Pasta(serving, typeofPasta);
            for (int i = 0; i < qty; i++) {
                purchase.addOrder(pastaOrder);
            }
            outputSubVatTotal();
        }
    }//GEN-LAST:event_btnPastaAOActionPerformed

    private void btnDrinksAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinksAOActionPerformed
        String drink = (String)cboDrinks.getSelectedItem();
        String size = (String)cboDrinksSize.getSelectedItem();
        int qty = (int)spnDrinksQty.getValue();

        if (!(drink.equals("Select Drink") || (size.equals("Select Size")))) {
            Beverage drinkOrder = new Beverage(size, drink);
            for (int i = 0; i < qty; i++) {
                purchase.addOrder(drinkOrder);
            }
            outputSubVatTotal();
        }
    }//GEN-LAST:event_btnDrinksAOActionPerformed

    private void btnPrintReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintReceiptActionPerformed
        lblStatus.setText(""); // Clear status message first
        double customerCash = Double.parseDouble(txtEPayment.getText());
        Payment customerPayment = new Payment("Cash", customerCash);
        // pay method returns "Success", "Insufficient Payment", "Invalid Details", or "Unknown Error"
        String status = purchase.pay(customerPayment);
        if (status.equals("Success")) {
            lblchange.setText(formatter.format(purchase.getChange()));
        
            txaReceipt.setText(txaReceipt.getText()+ "\n                          PLM PIZAZERRIA\n");
            txaReceipt.setText(txaReceipt.getText()+ "               General Luna corner Muralla St.,\n");
            txaReceipt.setText(txaReceipt.getText()+ "                        Intamuros, Manila\n");
            txaReceipt.setText(txaReceipt.getText()+ "                          (+63 2) 8 7000\n\n");
            txaReceipt.setText(txaReceipt.getText()+ "Order# " + purchase.getNumber() + "\n");
            txaReceipt.setText(txaReceipt.getText()+ "************************************************" + "\n");
            txaReceipt.setText(txaReceipt.getText()+ "    Product" + "           Size" + "\t  Amount\n\n" );
            txaReceipt.setText(txaReceipt.getText()+ purchase.listOrders());
            txaReceipt.setText(txaReceipt.getText()+ "************************************************" + "\n");
            txaReceipt.setText(txaReceipt.getText()+ purchase.printBill());
            txaReceipt.setText(txaReceipt.getText()+ "                      Thank you for Visiting\n" );
            txaReceipt.setText(txaReceipt.getText()+ "                          PLM PIZZAZERIA\n" );
            txaReceipt.setText(txaReceipt.getText()+ "                         Enjoy your Meal!" );
        } else {
            lblStatus.setText(status);
        }
    }//GEN-LAST:event_btnPrintReceiptActionPerformed

    private void calculateSubtotalColumn() {
        String pizzaFlavor = (String)cboPizza.getSelectedItem();
        String pastaFlavor = (String)cboPasta.getSelectedItem();
        String chickenFlavor = (String)cboChicken.getSelectedItem();
        String drinkFlavor = (String)cboDrinks.getSelectedItem();
        
        String pizzaSize = (String)cboPizzaSize.getSelectedItem();
        int pizzaQty = (int)spnPizzaQty.getValue();
        String chickenSize = (String)cboChickenSize.getSelectedItem();
        int chickenQty = (int)spnChickenQty.getValue();
        String pastaSize = (String)cboPastaSize.getSelectedItem();
        int pastaQty = (int)spnPastaQty.getValue();
        String drinkSize = (String)cboDrinksSize.getSelectedItem();
        int drinkQty = (int)spnDrinksQty.getValue();
        Menu tempPizza = new Pizza(pizzaSize, "Pepperoni"); // It's fine to leave the second parameter have placeholder value,
                                                            // because this object is only for computing, not storing
        Menu tempChicken = new Chicken(chickenSize, "Original");
        Menu tempPasta = new Pasta(pastaSize, "Spaghetti");
        Menu tempDrink = new Beverage(drinkSize, "Coke");

        // Set Pizza amount
        if (!(pizzaFlavor.equals("Select Pizza") || pizzaSize.equals("Select Size"))) {
            lblPizzaamt.setText(formatter.format(tempPizza.getPrice()*pizzaQty));
        }
        // Set Chicken amount
        if (!(chickenFlavor.equals("Select Chicken") || chickenSize.equals("Select Size"))) {
            lblChickenamt.setText(formatter.format(tempChicken.getPrice()*chickenQty));
        }
        // Set Pasta amount
        if (!(pastaFlavor.equals("Select Pasta") || pastaSize.equals("Select Size"))) {
            lblPastaamt.setText(formatter.format(tempPasta.getPrice()*pastaQty));
        }
        // Set Drink amount
        if (!(drinkFlavor.equals("Select Drinks") || pizzaSize.equals("Select Size"))) {
            lblDrinksamt.setText(formatter.format(tempDrink.getPrice()*drinkQty));
        }
    }
    
    private void spnQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnQtyStateChanged
        calculateSubtotalColumn();    
    }//GEN-LAST:event_spnQtyStateChanged

    private void cboPizzaSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPizzaSizeActionPerformed
        calculateSubtotalColumn();        
    }//GEN-LAST:event_cboPizzaSizeActionPerformed

    private void cboChickenSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChickenSizeActionPerformed
        calculateSubtotalColumn();        
    }//GEN-LAST:event_cboChickenSizeActionPerformed

    private void cboPastaSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPastaSizeActionPerformed
        calculateSubtotalColumn();        
    }//GEN-LAST:event_cboPastaSizeActionPerformed

    private void cboDrinksSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDrinksSizeActionPerformed
        calculateSubtotalColumn();        
    }//GEN-LAST:event_cboDrinksSizeActionPerformed

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        purchase.newTransaction();
        outputSubVatTotal();
        txaReceipt.setText("");
        lblchange.setText("00.00");
    }//GEN-LAST:event_btnNewOrderActionPerformed
    
    public static void main(String[] args) {
        System.out.print("Starting PizzaPOS...");
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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChickenAO;
    private javax.swing.JButton btnDrinksAO;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnPastaAO;
    private javax.swing.JButton btnPizzaAO;
    private javax.swing.JButton btnPrintReceipt;
    private javax.swing.JComboBox<String> cboChicken;
    private javax.swing.JComboBox<String> cboChickenSize;
    private javax.swing.JComboBox<String> cboDrinks;
    private javax.swing.JComboBox<String> cboDrinksSize;
    private javax.swing.JComboBox<String> cboPasta;
    private javax.swing.JComboBox<String> cboPastaSize;
    private javax.swing.JComboBox<String> cboPizza;
    private javax.swing.JComboBox<String> cboPizzaSize;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCHANGE;
    private javax.swing.JLabel lblChicken;
    private javax.swing.JLabel lblChickenAMT;
    private javax.swing.JLabel lblChickenQty;
    private javax.swing.JLabel lblChickenSize;
    private javax.swing.JLabel lblChickenamt;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDrinks;
    private javax.swing.JLabel lblDrinksAMT;
    private javax.swing.JLabel lblDrinksQty;
    private javax.swing.JLabel lblDrinksSize;
    private javax.swing.JLabel lblDrinksamt;
    private javax.swing.JLabel lblEPAYMENT;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPLMPizzazeria1;
    private javax.swing.JLabel lblPLMPizzazeria2;
    private javax.swing.JLabel lblPasta;
    private javax.swing.JLabel lblPastaAMT;
    private javax.swing.JLabel lblPastaQty;
    private javax.swing.JLabel lblPastaSize;
    private javax.swing.JLabel lblPastaamt;
    private javax.swing.JLabel lblPizza;
    private javax.swing.JLabel lblPizzaAMT;
    private javax.swing.JLabel lblPizzaQty;
    private javax.swing.JLabel lblPizzaSize;
    private javax.swing.JLabel lblPizzaamt;
    private javax.swing.JLabel lblReceipt;
    private javax.swing.JLabel lblSUBTOTAL;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTOTAL;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblVAT;
    private javax.swing.JLabel lblchange;
    private javax.swing.JLabel lblsubtotal;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lblvat;
    private javax.swing.JSpinner spnChickenQty;
    private javax.swing.JSpinner spnDrinksQty;
    private javax.swing.JSpinner spnPastaQty;
    private javax.swing.JSpinner spnPizzaQty;
    private javax.swing.JTextArea txaReceipt;
    private javax.swing.JTextField txtEPayment;
    // End of variables declaration//GEN-END:variables
}
