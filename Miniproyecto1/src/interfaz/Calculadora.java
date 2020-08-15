/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public int num[] = new int[1000];
    public String sym[] = new String[1000];
    public String mathcomplete = "";
    private char lastCharacter = ' ';
    public Calculadora() {
        initComponents();
        textolog.setLineWrap(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_menos = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        btn_borrarlog = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_divicion = new javax.swing.JButton();
        btn_exponente = new javax.swing.JButton();
        btn_variables = new javax.swing.JButton();
        btn_borrarmemory = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textolog = new javax.swing.JTextArea();
        btn_tutorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_menos.setText("-");
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });

        btn_mas.setText("+");
        btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masActionPerformed(evt);
            }
        });

        btn_borrarlog.setText("C");
        btn_borrarlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarlogActionPerformed(evt);
            }
        });

        btn_multiplicacion.setText("*");
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });

        btn_divicion.setText("/");
        btn_divicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divicionActionPerformed(evt);
            }
        });

        btn_exponente.setText("^");
        btn_exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exponenteActionPerformed(evt);
            }
        });

        btn_variables.setText("VAR");
        btn_variables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_variablesActionPerformed(evt);
            }
        });

        btn_borrarmemory.setText("CM");
        btn_borrarmemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarmemoryActionPerformed(evt);
            }
        });

        btn_igual.setText("=");
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textologKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(textolog);

        btn_tutorial.setText("TUTORIAL");
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
                                .addComponent(btn_divicion)
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
                            .addComponent(btn_divicion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        textolog.setText(rest+"-");
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masActionPerformed
        // TODO add your handling code here:
        String rest = textolog.getText().toString();
        textolog.setText(rest+"+");
    }//GEN-LAST:event_btn_masActionPerformed

    private void btn_borrarlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarlogActionPerformed
        // TODO add your handling code here:
        textolog.setText("");
    }//GEN-LAST:event_btn_borrarlogActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        // TODO add your handling code here:
        String rest = textolog.getText().toString();
        textolog.setText(rest+"*");
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_divicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divicionActionPerformed
        // TODO add your handling code here:
        String rest = textolog.getText().toString();
        textolog.setText(rest+"/");
    }//GEN-LAST:event_btn_divicionActionPerformed

    private void btn_exponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exponenteActionPerformed
        // TODO add your handling code here:
        String rest = textolog.getText().toString();
        textolog.setText(rest+"^");
    }//GEN-LAST:event_btn_exponenteActionPerformed

    private void btn_variablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_variablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_variablesActionPerformed

    private void btn_borrarmemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarmemoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_borrarmemoryActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        // TODO add your handling code here:
        capture();
        if(number){
            mathprocess();
        }else{
            JOptionPane.showMessageDialog(this, "Asignacion de variable");
        }
        
    }//GEN-LAST:event_btn_igualActionPerformed

    private void textologKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textologKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isSpaceChar(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se pueden agregar espacios");
        }
        
//        if (!Character.isAlphabetic(validar) && !Character.isDigit(validar)) {
////            switch (validar) {
////                case '+':
////                case '-':
////                case '*':
////                case '/':
////                case '.':
////                case '^':
////                case '(':
////                case ')':
////                    if (!Character.isAlphabetic(lastCharacter) && !Character.isDigit(lastCharacter)) {
////                        evt.consume();
////                    }
////                    break;
////                default:
////                    evt.consume();
////                    break;
////            }
//
//        }
//
//        lastCharacter = evt.getKeyChar();
//        System.out.println("Last " + lastCharacter);
        
    }//GEN-LAST:event_textologKeyTyped

    private void btn_igualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_igualKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btn_igualKeyTyped

    private void btn_tutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tutorialActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(this, "1. Solo se opera con los datos que este en la ultima linea (se ignora los anteriores).\n"
                + "2. se ejecuta la accion con el boton '='. \n"
                + "3. se puede usar el teclado para escribir los symbolos matematicos."
                , "INSTRUCCIONES", 2, null);
    }//GEN-LAST:event_btn_tutorialActionPerformed

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
    
    public void capture(){
        String mathrev = "";
        mathcomplete = "";
        String screenmath = textolog.getText().toString().trim();
        for (int i = screenmath.length() - 1; i >= 0; i--) {
            String car = String.valueOf(screenmath.charAt(i));
            if(car.equals("\n")){
                i = 0;
            }else{
            // Captura de ultima linea completa.
                mathrev += car;
            }
        }
        
        for (int i = mathrev.length() -1; i >= 0; i--) {
            String car2 = String.valueOf(mathrev.charAt(i));
            if(car2.equals("\n")){
                car2 = String.valueOf(mathrev.charAt(i));
            }
            mathcomplete += car2;
        }
        
        try{
            if(Character.isLetter(mathcomplete.charAt(0))){
            variable = true;
            number = false;
        }else{
            variable = false;
            number = true;
        }
            
        }catch(Exception e){
            textolog.setText("0");
        }
        
        
        
    }
    
    public void mathprocess(){
        String acomulator = "";
        int waiter = 0;
        int result = 0;
        int iterator = 0;
        int ext = 0;
        String captureScreen ="";
        
        

        for (int i = 0; i < mathcomplete.length(); i++) {
            if(Character.isDigit(mathcomplete.charAt(i))){
                acomulator += String.valueOf(mathcomplete.charAt(i));
            }else{
                num[ext] = Integer.parseInt(acomulator);
                ext++;
                acomulator = "";
            }
        }
        if (!acomulator.isEmpty()){
            num[ext] = Integer.parseInt(acomulator);
            acomulator = "";
        }
        ext = 0;
        
        for (int i = 0; i < mathcomplete.length(); i++) {
            if (!Character.isDigit(mathcomplete.charAt(i))){
                acomulator += String.valueOf(mathcomplete.charAt(i));
                sym[ext] = acomulator;
                ext++;
                acomulator ="";
            }
        }
        
        int total = 0;
        for (int i = 0; i < sym.length; i++) {
            if(sym[i]!= null){
                total++;
            }
        }
        ext = 0;
        
        
            if(sym[0].equals("*")){
                System.out.println("entra al if multiplicacion");
                try {
                    for (int i = 0; i < total+1; i++) {
                        System.out.println("entra al for del multiplicacion");
                        System.out.println("\n\n");
                        if (sym[ext].equals("*")){
                            if (ext == 0){
                                System.out.println("------if multipli -------------");
                                System.out.println("i entra con valor de "+i);
                                System.out.println(num[i]+" * "+num[i+1]);
                                waiter = num[i] * num[i+1];
                                i = i+1;
                                System.out.println("resultado = "+ waiter);
                                System.out.println("iterador -> "+ iterator);
                                System.out.println("\n\n");
                            }else{
                                System.out.println("------else multipli -------------");
                                System.out.println("i entra con valor de "+i);
                                System.out.println(waiter+" * "+num[i]);
                                waiter = waiter * num[i];
                                //iterator++;
                                System.out.println("resultado = "+ waiter);
                                System.out.println("iterador -> "+ iterator);
                                System.out.println("\n\n");
                            } 
                            ext++;
                            System.out.println("ext sube a -> " + ext);
                        }
                }
                } catch (Exception e) {
                    System.out.println("error ext -> " + ext);
                }
                
                
                    
                }else{
                    for (int i = 0; i < total; i++) {
                        if(sym[i].equals("*")){
                            num[i] = num[i] * num[i+1];
                            num[i+1] = 0;
                            System.out.println("            prioridad -> "+num[i]);
                        }                       
                    }
                }
            
         
            
            
        
        
        if (sym[0] == null){

            captureScreen = String.valueOf(num[0]);
            result = num[0];
        }else{
            try{
                System.out.println("total -> " + total);
                for (int i = 0; i < total+1; i = i++) {
                if(sym[ext].equals("+")){
                    if (ext == 0){
                        System.out.println("waiter para suma -> "+waiter);
                        System.out.println("i para suma if -> " + i);
                        System.out.println(num[i]+"+"+num[i+1]);
                        waiter = num[i]+ num[i+1];
                        System.out.println("="+waiter);
                        System.out.println("ext ->" + ext + " suma");
                        i = i + 2;
                        System.out.println("i cambia a "+ i);
                        System.out.println("\n\n\n");
                    }else{
                        System.out.println("waiter para suma else -> "+waiter);
                        System.out.println("i para suma else -> " + i);
                        System.out.println(waiter+"+"+num[i+iterator]);
                        waiter = waiter + num[i+iterator];                        
                        System.out.println("="+waiter);
                        System.out.println("ext ->" + ext + " suma");
                        iterator++;
                        System.out.println("\n\n\n");
                    } 
                    
                }
                if(sym[ext].equals("-")){
                    if(ext == 0){
                        System.out.println("waiter para resta -> "+waiter);
                        System.out.println("i para resta if -> " + i);
                        System.out.println(num[i]+"-"+num[i+1]);
                        waiter = num[i] - num[i+1];
                        System.out.println("="+waiter);
                        System.out.println("ext ->" + ext + " resta");
                         i = i + 2;
                        System.out.println("i cambia a "+ i);
                        System.out.println("\n\n\n");
                        
                    }else{
                        System.out.println("waiter para resta else -> "+waiter);
                        System.out.println("i para resta else -> " + i);
                        System.out.println(waiter+"-"+num[i+iterator]);
                        waiter = waiter - num[i+iterator];
                        System.out.println("="+waiter);
                        System.out.println("ext ->" + ext + " resta");
                        iterator++;
                        System.out.println("\n\n\n");
                        
                    }
                }
                
                 ext++;
        }
    }catch(Exception e){
        System.out.println("error ext-> "+ ext);
    }
            
            
            result = waiter;
            ext = 0;
        }
        
        
        
        
        captureScreen = textolog.getText().toString();
        textolog.setText(captureScreen+ " = " + result);
}        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrarlog;
    private javax.swing.JButton btn_borrarmemory;
    private javax.swing.JButton btn_divicion;
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
