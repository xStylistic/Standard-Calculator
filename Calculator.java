
/**
 * June 18th, 2021
 * ICS3U1
 * Standard Calculator Program with some bonus features
 *
 * @author Bonny Chen
 */
public class Calculator extends javax.swing.JFrame {

    // Global variables
    public static double input[] = new double[2];
    public double firstNum;
    public double secondNum;
    public double result;
    public double answer;
    public int operation;
    public String integer;
    public String enterNum;

    public Calculator() {
        initComponents();
    }
    
    // Method to check if the user entered an integer
    public boolean checkInt(double num) {
        
        return (num % 1) == 0;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        background = new javax.swing.JPanel();
        txtDisplay = new javax.swing.JTextField();
        btnPercent = new javax.swing.JButton();
        btnSign = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBackSpace = new javax.swing.JButton();
        btnSquared = new javax.swing.JButton();
        btnSqrRoot = new javax.swing.JButton();
        btnPI = new javax.swing.JButton();
        btn1DivByX = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnAddition = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSubtraction = new javax.swing.JButton();
        txtOperation = new javax.swing.JTextField();
        lblCalculator = new javax.swing.JLabel();

        jButton17.setText("jButton1");

        jButton18.setText("jButton1");

        jButton19.setText("jButton1");

        jButton20.setText("jButton1");

        jButton21.setText("jButton1");

        jButton22.setText("jButton1");

        jButton23.setText("jButton1");

        jButton24.setText("jButton1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(128, 128, 128));
        background.setForeground(new java.awt.Color(128, 128, 128));
        background.setToolTipText("");

        txtDisplay.setBackground(new java.awt.Color(0, 0, 0));
        txtDisplay.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtDisplay.setForeground(new java.awt.Color(255, 255, 255));
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnPercent.setBackground(new java.awt.Color(50, 50, 50));
        btnPercent.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnPercent.setForeground(new java.awt.Color(255, 255, 255));
        btnPercent.setText("%");
        btnPercent.setToolTipText("");
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentActionPerformed(evt);
            }
        });

        btnSign.setBackground(new java.awt.Color(50, 50, 50));
        btnSign.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        btnSign.setForeground(new java.awt.Color(255, 255, 255));
        btnSign.setText("+/-");
        btnSign.setToolTipText("");
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(155, 111, 111));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CE");
        btnClear.setToolTipText("");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBackSpace.setBackground(new java.awt.Color(155, 111, 111));
        btnBackSpace.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnBackSpace.setForeground(new java.awt.Color(255, 255, 255));
        btnBackSpace.setText("←");
        btnBackSpace.setToolTipText("");
        btnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSpaceActionPerformed(evt);
            }
        });

        btnSquared.setBackground(new java.awt.Color(50, 50, 50));
        btnSquared.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnSquared.setForeground(new java.awt.Color(255, 255, 255));
        btnSquared.setText("x²");
        btnSquared.setToolTipText("");
        btnSquared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquaredActionPerformed(evt);
            }
        });

        btnSqrRoot.setBackground(new java.awt.Color(50, 50, 50));
        btnSqrRoot.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnSqrRoot.setForeground(new java.awt.Color(255, 255, 255));
        btnSqrRoot.setText("²√x");
        btnSqrRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrRootActionPerformed(evt);
            }
        });

        btnPI.setBackground(new java.awt.Color(50, 50, 50));
        btnPI.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnPI.setForeground(new java.awt.Color(255, 255, 255));
        btnPI.setText("π");
        btnPI.setToolTipText("");
        btnPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIActionPerformed(evt);
            }
        });

        btn1DivByX.setBackground(new java.awt.Color(50, 50, 50));
        btn1DivByX.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn1DivByX.setForeground(new java.awt.Color(255, 255, 255));
        btn1DivByX.setText("1/x");
        btn1DivByX.setToolTipText("");
        btn1DivByX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1DivByXActionPerformed(evt);
            }
        });

        btnMultiplication.setBackground(new java.awt.Color(50, 50, 50));
        btnMultiplication.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnMultiplication.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplication.setText("x");
        btnMultiplication.setToolTipText("");
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(50, 50, 50));
        btnDivision.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnDivision.setText("÷");
        btnDivision.setToolTipText("");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setToolTipText("");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setToolTipText("");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setToolTipText("");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setToolTipText("");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setToolTipText("");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setToolTipText("");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnAddition.setBackground(new java.awt.Color(50, 50, 50));
        btnAddition.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnAddition.setForeground(new java.awt.Color(255, 255, 255));
        btnAddition.setText("+");
        btnAddition.setToolTipText("");
        btnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });

        btnEquals.setBackground(new java.awt.Color(155, 111, 111));
        btnEquals.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnEquals.setForeground(new java.awt.Color(255, 255, 255));
        btnEquals.setText("=");
        btnEquals.setToolTipText("");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btnPoint.setBackground(new java.awt.Color(0, 0, 0));
        btnPoint.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnPoint.setForeground(new java.awt.Color(255, 255, 255));
        btnPoint.setText(".");
        btnPoint.setToolTipText("");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setToolTipText("");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setToolTipText("");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setToolTipText("");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setToolTipText("");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnSubtraction.setBackground(new java.awt.Color(50, 50, 50));
        btnSubtraction.setFont(new java.awt.Font("Segoe UI", 0, 42)); // NOI18N
        btnSubtraction.setForeground(new java.awt.Color(255, 255, 255));
        btnSubtraction.setText("-");
        btnSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractionActionPerformed(evt);
            }
        });

        txtOperation.setBackground(new java.awt.Color(128, 128, 128));
        txtOperation.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtOperation.setForeground(new java.awt.Color(255, 255, 255));
        txtOperation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperationActionPerformed(evt);
            }
        });

        lblCalculator.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCalculator.setForeground(new java.awt.Color(255, 255, 255));
        lblCalculator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalculator.setText("Calculator");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSquared, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addComponent(btn1DivByX, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPI, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSqrRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(lblCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalculator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSquared, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqrRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1DivByX, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        // Button 1 
        enterNum = txtDisplay.getText() + btn1.getText(); 
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

        // Button 0
        enterNum = txtDisplay.getText() + btn0.getText(); 
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btn0ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed

        // Button 9
        enterNum = txtDisplay.getText() + btn9.getText(); 
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btn9ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        // Button CE - Clears all textboxes
        txtDisplay.setText("");
        txtOperation.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        // Button 2
        enterNum = txtDisplay.getText() + btn2.getText();
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

        // Button 3
        enterNum = txtDisplay.getText() + btn3.getText(); 
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        // Button 4
        enterNum = txtDisplay.getText() + btn4.getText(); 
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

        // Button 5
        enterNum = txtDisplay.getText() + btn5.getText(); 
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed

        // Button 6
        enterNum = txtDisplay.getText() + btn6.getText(); 
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed

        // Button 7
        enterNum = txtDisplay.getText() + btn7.getText(); 
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

        // Button 8 
        enterNum = txtDisplay.getText() + btn8.getText(); 
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btn8ActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed

        // Button .
        enterNum = txtDisplay.getText() + btnPoint.getText(); 
        txtDisplay.setText(enterNum);

    }//GEN-LAST:event_btnPointActionPerformed

    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditionActionPerformed

        // Button + 
        input[0] = Double.parseDouble(txtDisplay.getText());
        operation = 1;
        enterNum = "";
        txtDisplay.setText("");
        txtOperation.setText("+"); // Displays with operation the user clicked

    }//GEN-LAST:event_btnAdditionActionPerformed

    private void btnSubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractionActionPerformed

        // Button - 
        input[0] = Double.parseDouble(txtDisplay.getText());
        operation = 2;
        enterNum = "";
        txtDisplay.setText("");
        txtOperation.setText("-"); // Displays with operation the user clicked

    }//GEN-LAST:event_btnSubtractionActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed

        // Button x
        input[0] = Double.parseDouble(txtDisplay.getText());
        operation = 3;
        enterNum = "";
        txtDisplay.setText("");
        txtOperation.setText("x"); // Displays with operation the user clicked

    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed

        // Button ÷
        input[0] = Double.parseDouble(txtDisplay.getText());
        operation = 4;
        enterNum = "";
        txtDisplay.setText("");
        txtOperation.setText("÷"); // Displays with operation the user clicked

    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentActionPerformed

        // Button %
        input[0] = Double.parseDouble(enterNum);
        input[0] = input[0] / 100; // Divides the number by 100 to get the percent form
        txtDisplay.setText(String.valueOf(input[0])); // Displays the result 
        txtOperation.setText("%"); 
        
        // Checks if a double was entered
        if (checkInt(input[0])) {
            
            integer = String.format("%.0f", input[0]); // Set it to 0 decimal places
            enterNum = String.valueOf(integer);
            txtDisplay.setText(integer);
            txtOperation.setText("%"); // Displays with operation the user clicked
            
        } else {
            
            enterNum = String.valueOf(input[0]);
            txtDisplay.setText(String.valueOf(input[0]));
            txtOperation.setText("%"); // Displays with operation the user clicked
            
        }
        
        

    }//GEN-LAST:event_btnPercentActionPerformed

    private void btnPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIActionPerformed

        // Button π
        input[0] = Math.PI; // Gets the PI 
        txtDisplay.setText(String.format("%.12f", input[0])); // Set PI to 12 decimal places
        txtOperation.setText("π"); // Displays with operation the user clicked

    }//GEN-LAST:event_btnPIActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed

        String display;
        txtOperation.setText("="); // Displays with operation the user clicked
        
        // Checks which operation execute
        switch (operation) {

            case 1: // Addition +

                input[1] = Double.parseDouble(txtDisplay.getText()); // Gets the second value
                answer = input[0] + input[1];

                if (checkInt(answer)) { // Checks if the answer is a double

                    display = String.format("%.0f", answer); // Set it to 0 decimal places
                    txtDisplay.setText(display); // Displays answer

                } else {

                    txtDisplay.setText(String.valueOf(answer)); // Displays answer

                }

                break;

            case 2: // Subtraction - 

                input[1] = Double.parseDouble(txtDisplay.getText()); // Gets the second value
                answer = input[0] - input[1];

                if (checkInt(answer)) { // Checks if the answer is a double

                    display = String.format("%.0f", answer); // Set it to 0 decimal places
                    txtDisplay.setText(display); // Displays answer

                } else {

                    txtDisplay.setText(String.valueOf(answer)); // Displays answer

                }

                break;

            case 3: // Multiplication x 

                input[1] = Double.parseDouble(txtDisplay.getText()); // Gets the second value
                answer = input[0] * input[1];

                if (checkInt(answer)) { // Checks if the answer is a double

                    display = String.format("%.0f", answer); // Set it to 0 decimal places
                    txtDisplay.setText(display); // Displays answer

                } else {

                    txtDisplay.setText(String.valueOf(answer)); // Displays answer

                }

                break;

            case 4: // Division ÷

                input[1] = Double.parseDouble(txtDisplay.getText()); // Gets the second value
                answer = input[0] / input[1];

                if (checkInt(answer)) { // Checks if the answer is a double

                    display = String.format("%.0f", answer); // Set it to 0 decimal places
                    txtDisplay.setText(display); // Displays answer

                } else {

                    txtDisplay.setText(String.valueOf(answer)); // Displays answer

                }

                break;

        }


    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSpaceActionPerformed

        // Button ←
        int length = txtDisplay.getText().length(); // Length of the characters in display
        int number = txtDisplay.getText().length() - 1; // Subtracts a character
        String store;

        if (length > 0) { // Checks if there are numbers / symbols in the display field

            StringBuilder back = new StringBuilder(txtDisplay.getText()); // Get text from display and put it in a string builder
            back.deleteCharAt(number); // Deletes a character
            store = back.toString(); // Store the new output
            txtDisplay.setText(store); // Displays the new output

        }

    }//GEN-LAST:event_btnBackSpaceActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed

        // Button to change number from positive to negative (vice versa)
        input[0] = Double.parseDouble(String.valueOf(txtDisplay.getText())); // Get the number 
        input[0] = input[0] * (-1); // Multiplies the number by -1 
        
        // Checks if a double was entered
        if (checkInt(input[0])) {
            
            integer = String.format("%.0f", input[0]); // Set it to 0 decimal places
            enterNum = String.valueOf(integer);
            txtDisplay.setText(integer); // Displays answer
            txtOperation.setText("+/-"); // Displays with operation the user clicked
            
        } else {
            
            enterNum = String.valueOf(input[0]);
            txtDisplay.setText(String.valueOf(input[0])); // Displays answer
            txtOperation.setText("+/-"); // Displays with operation the user clicked
            
        }

    }//GEN-LAST:event_btnSignActionPerformed

    private void btnSquaredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquaredActionPerformed

        // Button to square the number
        input[0] = Math.pow(Double.parseDouble(enterNum), 2);// find sqrt of double value of input
        
        // Checks if a double was entered
        if (checkInt(input[0])) {
            
            integer = String.format("%.0f", input[0]); // Set it to 0 decimal places
            enterNum = String.valueOf(integer);
            txtDisplay.setText(integer); // Displays answer
            txtOperation.setText("x²"); // Displays with operation the user clicked
            
        } else {
            
            enterNum = String.valueOf(input[0]);
            txtDisplay.setText(String.valueOf(input[0])); // Displays answer
            txtOperation.setText("x²"); // Displays with operation the user clicked
 
            
        }

    }//GEN-LAST:event_btnSquaredActionPerformed

    private void btnSqrRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrRootActionPerformed

        // Button to square root the number
        input[0] = Math.sqrt(Double.parseDouble(enterNum));// Find square root of double value of input
        
        // Checks if a double was entered
        if (checkInt(input[0])) {
            
            integer = String.format("%.0f", input[0]); // Set it to 0 decimal places
            enterNum = String.valueOf(integer);
            txtDisplay.setText(integer); // Displays answer
            txtOperation.setText("²√x"); // Displays with operation the user clicked
            
        } else {
            
            enterNum = String.valueOf(input[0]);
            txtDisplay.setText(String.valueOf(input[0])); // Displays answer
            txtOperation.setText("²√x"); // Displays with operation the user clicked
            
        }
    

    }//GEN-LAST:event_btnSqrRootActionPerformed

    private void btn1DivByXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1DivByXActionPerformed

        // Button to divide 1 by the number
        input[0] = Double.parseDouble(String.valueOf(txtDisplay.getText())); 
        input[0] = 1 / input[0];  // Divides 1 by the number
        
        // Checks if a double was entered
        if (checkInt(input[0])) {
            
            integer = String.format("%.0f", input[0]);
            enterNum = String.valueOf(integer);
            txtDisplay.setText(integer); // Displays answer
            txtOperation.setText("1/x"); // Displays with operation the user clicked
            
        } else {
            
            enterNum = String.valueOf(input[0]);
            txtDisplay.setText(String.valueOf(input[0])); // Displays answer
            txtOperation.setText("1/x"); // Displays with operation the user clicked
            
        }

    }//GEN-LAST:event_btn1DivByXActionPerformed

    private void txtOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperationActionPerformed

    }//GEN-LAST:event_txtOperationActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn1DivByX;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAddition;
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnPI;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSign;
    private javax.swing.JButton btnSqrRoot;
    private javax.swing.JButton btnSquared;
    private javax.swing.JButton btnSubtraction;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblCalculator;
    private javax.swing.JTextField txtDisplay;
    private javax.swing.JTextField txtOperation;
    // End of variables declaration//GEN-END:variables
}
