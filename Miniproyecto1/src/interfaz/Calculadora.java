package interfaz;

import java.awt.Button;
import java.awt.Event;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author BrawlCodak
 */
public class Calculadora extends javax.swing.JFrame {

    public String operator;
    public boolean variable;
    public boolean number;
    public String mathcomplete = "";
    private char lastCharacter = ' ';

    public Calculadora() {
        initComponents();
        textolog.setLineWrap(true);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_menos = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        btn_borrarlog = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_exponente = new javax.swing.JButton();
        btn_variables = new javax.swing.JButton();
        btn_borrarmemory = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textolog = new javax.swing.JTextArea();
        btn_tutorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_menos.setText("-");
        btn_menos.setFocusable(false);
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });

        btn_mas.setText("+");
        btn_mas.setFocusable(false);
        btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masActionPerformed(evt);
            }
        });

        btn_borrarlog.setText("C");
        btn_borrarlog.setFocusable(false);
        btn_borrarlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarlogActionPerformed(evt);
            }
        });

        btn_multiplicacion.setText("*");
        btn_multiplicacion.setFocusable(false);
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });

        btn_division.setText("/");
        btn_division.setFocusable(false);
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        btn_exponente.setText("^");
        btn_exponente.setFocusable(false);
        btn_exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exponenteActionPerformed(evt);
            }
        });

        btn_variables.setText("VAR");
        btn_variables.setFocusable(false);
        btn_variables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_variablesActionPerformed(evt);
            }
        });

        btn_borrarmemory.setText("CM");
        btn_borrarmemory.setFocusable(false);
        btn_borrarmemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarmemoryActionPerformed(evt);
            }
        });

        btn_igual.setText("=");
        btn_igual.setFocusable(false);
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        btn_igual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn_igualKeyTyped(evt);
            }
        });

        textolog.setBackground(new java.awt.Color(0, 0, 0));
        textolog.setColumns(20);
        textolog.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        textolog.setForeground(new java.awt.Color(0, 255, 51));
        textolog.setRows(5);
        textolog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textologKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textologKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textologKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(textolog);

        btn_tutorial.setText("TUTORIAL");
        btn_tutorial.setFocusable(false);
        btn_tutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tutorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btn_mas)
                                .addGap(18, 18, 18)
                                .addComponent(btn_menos)
                                .addGap(18, 18, 18)
                                .addComponent(btn_multiplicacion)
                                .addGap(18, 18, 18)
                                .addComponent(btn_division)
                                .addGap(18, 18, 18)
                                .addComponent(btn_exponente)
                                .addGap(18, 18, 18)
                                .addComponent(btn_variables)
                                .addGap(18, 18, 18)
                                .addComponent(btn_borrarlog)
                                .addGap(18, 18, 18)
                                .addComponent(btn_borrarmemory))
                            .addComponent(btn_tutorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tutorial, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exponente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_variables, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_borrarlog, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_borrarmemory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        String rest = textolog.getText().toString();
        textolog.setText(rest + "-");
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masActionPerformed
        // TODO add your handling code here:
        String rest = textolog.getText().toString();
        textolog.setText(rest + "+");
    }//GEN-LAST:event_btn_masActionPerformed

    private void btn_borrarlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarlogActionPerformed
        // TODO add your handling code here:
        textolog.setText("");
        lastCharacter = ' ';
    }//GEN-LAST:event_btn_borrarlogActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        // TODO add your handling code here:
        String rest = textolog.getText().toString();
        textolog.setText(rest + "*");
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        // TODO add your handling code here:
        String rest = textolog.getText().toString();
        textolog.setText(rest + "/");
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_exponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exponenteActionPerformed
        // TODO add your handling code here:
        String rest = textolog.getText().toString();
        textolog.setText(rest + "^");
    }//GEN-LAST:event_btn_exponenteActionPerformed

    private void btn_variablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_variablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_variablesActionPerformed

    private void btn_borrarmemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarmemoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_borrarmemoryActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed

        capture();
        if (mathcomplete.length() != 0) {
            if (number) {
                mathprocess();
            } else {
                JOptionPane.showMessageDialog(this, "Asignación de variable.");
            }
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void textologKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textologKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if (Character.isSpaceChar(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se pueden agregar espacios.");
        }

        if (!Character.isAlphabetic(validar) && !Character.isDigit(validar)) {
            switch (validar) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '.':
                case '^':
                case '(':
                case ')':
                    if (!Character.isAlphabetic(lastCharacter) && !Character.isDigit(lastCharacter)) {
                        evt.consume();
                    }
                    break;
                default:
                    evt.consume();
                    break;
            }

        }

        lastCharacter = evt.getKeyChar();
        System.out.println("Last " + lastCharacter);

    }//GEN-LAST:event_textologKeyTyped

    private void btn_igualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_igualKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_igualKeyTyped

    private void btn_tutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tutorialActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(this, "1. Solo se opera con los datos que este en la última línea (se ignora los anteriores).\n"
                + "2. se ejecuta la acción con el botón '='. \n"
                + "3. se puede usar el teclado para escribir los símbolos matemáticos.",
                "INSTRUCCIONES", 2, null);
    }//GEN-LAST:event_btn_tutorialActionPerformed

    private void textologKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textologKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            capture();
            if (mathcomplete.length() != 0) {
                if (number) {
                    mathprocess();
                } else {
                    JOptionPane.showMessageDialog(this, "Asignación de variable.");
                }
            } else {
                evt.consume();
            }
        }
    }//GEN-LAST:event_textologKeyPressed

    private void textologKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textologKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            capture();
            if (mathcomplete.length() != 0) {
                if (number) {
                    mathprocess();
                } else {
                    JOptionPane.showMessageDialog(this, "Asignación de variable.");
                }
            } else {
                evt.consume();
            }
        }

    }//GEN-LAST:event_textologKeyReleased

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);

            }
        });
    }

    public void capture() {
        try {
            String mathrev = "";
            mathcomplete = "";
            String screenmath = textolog.getText();
            for (int i = screenmath.length() - 1; i >= 0; i--) {
                String car = String.valueOf(screenmath.charAt(i));
                if (car.equals("\n")) {
                    i = 0;
                } else {
                    // Captura de ultima linea completa.
                    mathrev += car;
                }
            }

            for (int i = mathrev.length() - 1; i >= 0; i--) {
                String car2 = String.valueOf(mathrev.charAt(i));
                mathcomplete += car2;
            }

            if (Character.isLetter(mathcomplete.charAt(0))) {
                variable = true;
                number = false;
            } else {
                variable = false;
                number = true;
            }
        } catch (StringIndexOutOfBoundsException s) {
        }
    }

    public void mathprocess() {
        try {
            String acomulator = "";
            int num[] = new int[1000];
            String sym[] = new String[1000];
            int result = 0;
            int iterator = 0;
            int ext = 0;
            String captureScreen = "";

            for (int i = 0; i < mathcomplete.length(); i++) {
                if (Character.isDigit(mathcomplete.charAt(i))) {
                    acomulator += String.valueOf(mathcomplete.charAt(i));
                } else {
                    num[ext] = Integer.parseInt(acomulator);
                    ext++;
                    acomulator = "";
                }
            }
            if (!acomulator.isEmpty()) {
                num[ext] = Integer.parseInt(acomulator);
                acomulator = "";
            }
            ext = 0;
            for (int i = 0; i < mathcomplete.length(); i++) {
                if (!Character.isDigit(mathcomplete.charAt(i))) {
                    acomulator += String.valueOf(mathcomplete.charAt(i));
                    sym[ext] = acomulator;
                    ext++;
                    acomulator = "";
                }
            }
            int total = 0;
            for (int i = 0; i < sym.length; i++) {
                if (sym[i] != null) {
                    total++;
                }
            }

            for (int i = 0; i < total + 1; i++) {

                if (sym[i] != null) {
                    if (sym[i].equals("+")) {
                        result += num[i];
                    }

                    if (sym[i].equals("-")) {
                        result = result + num[i];
                    }

                    if (sym[i].equals("*")) {
                        result *= num[i];
                    }

                    if (sym[i].equals("/")) {
                        result /= num[i];
                    }

                    if (sym[i].equals("^")) {
                        result ^= num[i];
                    }
                } else {
                    if (sym[i - 1].equals("+")) {
                        result += num[i];
                    }

                    if (sym[i - 1].equals("-")) {
                        System.out.println("result2 - num: " + result + " - " + num[i]);
                        result = result - num[i];
                        System.out.println("resultado2 ->" + result);
                    }

                    if (sym[i - 1].equals("*")) {
                        result *= num[i];
                    }

                    if (sym[i - 1].equals("/")) {
                        result /= num[i];
                    }

                    if (sym[i - 1].equals("^")) {
                        result ^= num[i];
                    }
                }
            }

            captureScreen = textolog.getText();
            textolog.setText(captureScreen + " = " + result);
        } catch (NumberFormatException nfe) {
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrarlog;
    private javax.swing.JButton btn_borrarmemory;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_exponente;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_tutorial;
    private javax.swing.JButton btn_variables;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textolog;
    // End of variables declaration//GEN-END:variables
}
