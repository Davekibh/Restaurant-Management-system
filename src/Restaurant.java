
import java.awt.Component;
import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
        
public class Restaurant extends JFrame {

    /**
     * Creates new form Restaurant
     */
    public Restaurant() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlblTax2 = new javax.swing.JLabel();
        jlblSubTotal2 = new javax.swing.JLabel();
        jlblTotal2 = new javax.swing.JLabel();
        jtxtFrankie = new javax.swing.JTextField();
        jtxtPizza = new javax.swing.JTextField();
        jtxtBurger = new javax.swing.JTextField();
        jlblTax4 = new javax.swing.JLabel();
        jtxtSandwich = new javax.swing.JTextField();
        jtxtFries = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtReceipt = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jlblTax7 = new javax.swing.JLabel();
        jlblSubTotal4 = new javax.swing.JLabel();
        jlblTotal4 = new javax.swing.JLabel();
        jtxtTC = new javax.swing.JTextField();
        jtxtCOD = new javax.swing.JTextField();
        jtxtCOM = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jtxtSubTotal = new javax.swing.JTextField();
        jtxtTotal = new javax.swing.JTextField();
        jtxtTax = new javax.swing.JTextField();
        jlblTax = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jlblSubTotal = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jBtnReceipt = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jlblTax5 = new javax.swing.JLabel();
        jlblSubTotal3 = new javax.swing.JLabel();
        jlblTotal3 = new javax.swing.JLabel();
        jtxtClassicVanilla = new javax.swing.JTextField();
        jtxtVanillaCone = new javax.swing.JTextField();
        jtxtMilkShake = new javax.swing.JTextField();
        jlblTax6 = new javax.swing.JLabel();
        jtxtChocoMilkShake = new javax.swing.JTextField();
        jtxtVanillaMilkshake = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setMaximumSize(new java.awt.Dimension(1370, 700));

        jlblTax2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblTax2.setText("Burger");

        jlblSubTotal2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblSubTotal2.setText("Pizza");

        jlblTotal2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblTotal2.setText("Frankie");

        jtxtFrankie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtFrankie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFrankie.setText("0");
        jtxtFrankie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFrankieActionPerformed(evt);
            }
        });

        jtxtPizza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtPizza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtPizza.setText("0");
        jtxtPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPizzaActionPerformed(evt);
            }
        });

        jtxtBurger.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtBurger.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtBurger.setText("0");
        jtxtBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBurgerActionPerformed(evt);
            }
        });

        jlblTax4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTax4.setText("Meals");

        jtxtSandwich.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtSandwich.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtSandwich.setText("0");
        jtxtSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSandwichActionPerformed(evt);
            }
        });

        jtxtFries.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtFries.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFries.setText("0");
        jtxtFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFriesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Fries");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sandwich");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jlblTax4)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlblSubTotal2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addComponent(jlblTax2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblTotal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtPizza, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtBurger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jtxtSandwich, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtFries, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtFrankie, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlblTax4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTax2)
                    .addComponent(jtxtBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSubTotal2)
                    .addComponent(jtxtPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtFrankie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtFries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, 260));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setMaximumSize(new java.awt.Dimension(1370, 700));

        jtxtReceipt.setColumns(20);
        jtxtReceipt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jtxtReceipt.setRows(5);
        jScrollPane1.setViewportView(jtxtReceipt);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 340, 510));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setMaximumSize(new java.awt.Dimension(1370, 700));

        jlblTax7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblTax7.setText("Cost of Meal");

        jlblSubTotal4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblSubTotal4.setText("Cost of Drinks");

        jlblTotal4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblTotal4.setText("Total Cost");

        jtxtTC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTCActionPerformed(evt);
            }
        });

        jtxtCOD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCODActionPerformed(evt);
            }
        });

        jtxtCOM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtCOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCOMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblSubTotal4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblTax7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblTotal4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtTC, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jtxtCOD)
                    .addComponent(jtxtCOM))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTax7)
                    .addComponent(jtxtCOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSubTotal4)
                    .addComponent(jtxtCOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTotal4)
                    .addComponent(jtxtTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 320, 160));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel6.setMaximumSize(new java.awt.Dimension(1370, 700));

        jtxtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubTotalActionPerformed(evt);
            }
        });

        jtxtTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalActionPerformed(evt);
            }
        });

        jtxtTax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTaxActionPerformed(evt);
            }
        });

        jlblTax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblTax.setText("Tax");

        jlblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblTotal.setText("Total");

        jlblSubTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblSubTotal.setText("SubTotal");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jlblTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtTax, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jtxtSubTotal)
                    .addComponent(jtxtTotal))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTax)
                    .addComponent(jtxtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSubTotal)
                    .addComponent(jtxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTotal)
                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 310, 160));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel7.setMaximumSize(new java.awt.Dimension(1370, 700));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnReceipt.setText("Receipt");
        jBtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReceiptActionPerformed(evt);
            }
        });

        jBtnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnReset.setText("Reset");
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(93, 93, 93)
                .addComponent(jBtnReceipt)
                .addGap(89, 89, 89)
                .addComponent(jBtnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(33, 33, 33))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jBtnReceipt)
                    .addComponent(jBtnReset)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 650, 50));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel8.setMaximumSize(new java.awt.Dimension(1370, 700));

        jlblTax5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblTax5.setText("Milk Shake");

        jlblSubTotal3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblSubTotal3.setText("Vanilla Cone");

        jlblTotal3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblTotal3.setText("Classic Vanilla");

        jtxtClassicVanilla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtClassicVanilla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtClassicVanilla.setText("0");
        jtxtClassicVanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtClassicVanillaActionPerformed(evt);
            }
        });

        jtxtVanillaCone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtVanillaCone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtVanillaCone.setText("0");
        jtxtVanillaCone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtVanillaConeActionPerformed(evt);
            }
        });

        jtxtMilkShake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtMilkShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtMilkShake.setText("0");
        jtxtMilkShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMilkShakeActionPerformed(evt);
            }
        });

        jlblTax6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTax6.setText("Drinks");

        jtxtChocoMilkShake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtChocoMilkShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtChocoMilkShake.setText("0");
        jtxtChocoMilkShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChocoMilkShakeActionPerformed(evt);
            }
        });

        jtxtVanillaMilkshake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtVanillaMilkshake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtVanillaMilkshake.setText("0");
        jtxtVanillaMilkshake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtVanillaMilkshakeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Vanilla Milk Shake");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Chocolate Milk Shake");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jlblTax6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlblSubTotal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblTax5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblTotal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtVanillaCone)
                    .addComponent(jtxtMilkShake)
                    .addComponent(jtxtChocoMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtVanillaMilkshake)
                    .addComponent(jtxtClassicVanilla))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlblTax6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTax5)
                    .addComponent(jtxtMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSubTotal3)
                    .addComponent(jtxtVanillaCone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtClassicVanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotal3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtVanillaMilkshake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtChocoMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 310, 260));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("GRD Restaurant");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSubTotalActionPerformed

    private void jtxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalActionPerformed

    private void jtxtTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTaxActionPerformed

    private void jtxtFrankieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFrankieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFrankieActionPerformed

    private void jtxtPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPizzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPizzaActionPerformed

    private void jtxtBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBurgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBurgerActionPerformed

    private void jtxtSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSandwichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSandwichActionPerformed

    private void jtxtFriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFriesActionPerformed

    private void jtxtClassicVanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtClassicVanillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtClassicVanillaActionPerformed

    private void jtxtVanillaConeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtVanillaConeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtVanillaConeActionPerformed

    private void jtxtMilkShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMilkShakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMilkShakeActionPerformed

    private void jtxtChocoMilkShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtChocoMilkShakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtChocoMilkShakeActionPerformed

    private void jtxtVanillaMilkshakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtVanillaMilkshakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtVanillaMilkshakeActionPerformed

    private void jtxtTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTCActionPerformed

    private void jtxtCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCODActionPerformed

    private void jtxtCOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCOMActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SubClass iExit = new SubClass();      
        iExit.iExitSystem();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        JTextField cleartext = null;
        
        for(Component c:jPanel8.getComponents())
        {
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                cleartext = (JTextField)c;
                cleartext.setText("0");
            }
        }
        
        for(Component c:jPanel2.getComponents())
        {
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                cleartext = (JTextField)c;
                cleartext.setText("0");
            }
        }
        for(Component c:jPanel4.getComponents())
        {
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                cleartext = (JTextField)c;
                cleartext.setText("");
            }
        }
        
        for(Component c:jPanel6.getComponents())
        {
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                cleartext = (JTextField)c;
                cleartext.setText("");
            }
        }
        
        jtxtReceipt.setText("");
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SubClass ItemCost = new SubClass();
        
        double iTax, iSubTotal, iTotal;
        
        ItemCost.Burger = ItemCost.pBurger * Double.parseDouble(jtxtBurger.getText());
        ItemCost.Pizza = ItemCost.pPizza * Double.parseDouble(jtxtPizza.getText());
        ItemCost.Frankie = ItemCost.pFrankie * Double.parseDouble(jtxtFrankie.getText());
        ItemCost.Fries = ItemCost.pFries * Double.parseDouble(jtxtFries.getText());
        ItemCost.Sandwich = ItemCost.pSandwich * Double.parseDouble(jtxtSandwich.getText());
        
        ItemCost.MilkShake = ItemCost.pMilkShake * Double.parseDouble(jtxtMilkShake.getText());
        ItemCost.VanillaCone = ItemCost.pVanillaCone * Double.parseDouble(jtxtVanillaCone.getText());
        ItemCost.ClasVanilla = ItemCost.pClasVanilla * Double.parseDouble(jtxtClassicVanilla.getText());
        ItemCost.VanMilkShake = ItemCost.pVanMilkShake * Double.parseDouble(jtxtVanillaMilkshake.getText());
        ItemCost.ChocMilkShake = ItemCost.pChocMilkShake * Double.parseDouble(jtxtChocoMilkShake.getText());
        
        iSubTotal = ItemCost.GetAmount();
        iTax = ItemCost.cFindTax(iSubTotal);
        iTotal = iSubTotal + iTax;
        
        String SubTotal = String.format("₹%.2f", iSubTotal);
        jtxtSubTotal.setText(SubTotal);
        
        String Tax = String.format("₹%.2f", iTax);
        jtxtTax.setText(Tax);
        
        String Total = String.format("₹%.2f", iTotal);
        jtxtTotal.setText(Total);
        
        String Meal = String.format("₹%.2f", ItemCost.Meals);
        jtxtCOM.setText(Meal);
        
        String Drink = String.format("₹%.2f", ItemCost.Drinks);
        jtxtCOD.setText(Drink);
        
        String TotalCost = String.format("₹%.2f", ItemCost.TotalMD);
        jtxtTC.setText(TotalCost);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReceiptActionPerformed
        
        int refs = 1325 + (int) (Math.random()*4238);
        
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yy");
        Tdate.format(timer.getTime());
        
        jtxtReceipt.append("\tGRD Restaurant\n"+
                "Reference:\t" + refs + 
                "\n==========================\n" + 
                     "Meals:\t\t" + jtxtCOM.getText() + "\n\n" +
                     "Drinks:\t\t" + jtxtCOD.getText() + "\n\n" +
                     "Total Cost:\t" + jtxtTC.getText() + "\n\n"+
                "============================" +  "\n\n" +
                    "Tax:\t\t" + jtxtTax.getText() + "\n\n" +
                    "SubTotal:\t" + jtxtSubTotal.getText() + "\n\n" +
                    "Total:\t\t" + jtxtTotal.getText() + "\n"  +
                "============================" +
                "\nDate: " + Tdate.format(timer.getTime()) +
                "\tTime: " + tTime.format(timer.getTime()) +
                "\n\n\t\tThank you!");
    }//GEN-LAST:event_jBtnReceiptActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnReceipt;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblSubTotal;
    private javax.swing.JLabel jlblSubTotal2;
    private javax.swing.JLabel jlblSubTotal3;
    private javax.swing.JLabel jlblSubTotal4;
    private javax.swing.JLabel jlblTax;
    private javax.swing.JLabel jlblTax2;
    private javax.swing.JLabel jlblTax4;
    private javax.swing.JLabel jlblTax5;
    private javax.swing.JLabel jlblTax6;
    private javax.swing.JLabel jlblTax7;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JLabel jlblTotal2;
    private javax.swing.JLabel jlblTotal3;
    private javax.swing.JLabel jlblTotal4;
    private javax.swing.JTextField jtxtBurger;
    private javax.swing.JTextField jtxtCOD;
    private javax.swing.JTextField jtxtCOM;
    private javax.swing.JTextField jtxtChocoMilkShake;
    private javax.swing.JTextField jtxtClassicVanilla;
    private javax.swing.JTextField jtxtFrankie;
    private javax.swing.JTextField jtxtFries;
    private javax.swing.JTextField jtxtMilkShake;
    private javax.swing.JTextField jtxtPizza;
    private javax.swing.JTextArea jtxtReceipt;
    private javax.swing.JTextField jtxtSandwich;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTC;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTotal;
    private javax.swing.JTextField jtxtVanillaCone;
    private javax.swing.JTextField jtxtVanillaMilkshake;
    // End of variables declaration//GEN-END:variables
}
