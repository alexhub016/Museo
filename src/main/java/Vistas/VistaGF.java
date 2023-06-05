package Vistas;

import Controladores.ControladorVistaGF;
import javax.swing.JPanel;

public class VistaGF extends javax.swing.JFrame {

    private ControladorVistaGF control;
    
    public VistaGF() {
        initComponents();
        setFrame();
        control = new ControladorVistaGF(this);
        escuchadorElementos();
    }

    public void setFrame(){
        this.setTitle("¿Cual de las dos es?");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    private void escuchadorElementos() {
        this.jPanelImg1.addMouseListener(control);
        this.jPanelImg2.addMouseListener(control);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelImg2 = new javax.swing.JPanel();
        jPanelImg1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelImg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanelImg2Layout = new javax.swing.GroupLayout(jPanelImg2);
        jPanelImg2.setLayout(jPanelImg2Layout);
        jPanelImg2Layout.setHorizontalGroup(
            jPanelImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        jPanelImg2Layout.setVerticalGroup(
            jPanelImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        jPanelImg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanelImg1Layout = new javax.swing.GroupLayout(jPanelImg1);
        jPanelImg1.setLayout(jPanelImg1Layout);
        jPanelImg1Layout.setHorizontalGroup(
            jPanelImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        jPanelImg1Layout.setVerticalGroup(
            jPanelImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("¿Cual de los dos pertenece a Gregorio Fernandez?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanelImg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jPanelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelImg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getjPanelImg1() {
        return jPanelImg1;
    }

    public void setjPanelImg1(JPanel jPanelImg1) {
        this.jPanelImg1 = jPanelImg1;
    }

    public JPanel getjPanelImg2() {
        return jPanelImg2;
    }

    public void setjPanelImg2(JPanel jPanelImg2) {
        this.jPanelImg2 = jPanelImg2;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelImg1;
    private javax.swing.JPanel jPanelImg2;
    // End of variables declaration//GEN-END:variables

    
}
