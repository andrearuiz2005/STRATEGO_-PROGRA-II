/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ar466
 */
public class Batallas extends javax.swing.JFrame {
  DatosUsuario datos;
    Login login;
    Menu menu;
    UniversoMarvel marvel;
 private TableroStratego tablero;
    /**
     * Creates new form Batallas
     */
    public Batallas(DatosUsuario datos,Login login) {
        initComponents();
         setLocationRelativeTo(this);
         this.datos = datos;
         this.login=login;
        
         mostrarUsuariosActivos();
         marvel=new UniversoMarvel(login,datos);    
    }
    
    
    
 public void mostrarUsuariosActivos(){
     int usuariosActivos;
     int usuariosEliminados;
     usuariosActivos=datos.getListaUsuarios().size()-datos.getListaUsuariosEliminado().size();
     usuariosEliminados=datos.getListaUsuariosEliminado().size();
     
     lblCantUsuariosActivos.setText("Usuarios Activos: "+String.valueOf(usuariosActivos));
     lblCantUsuariosHistoricos.setText("Usuarios Historicos: "+String.valueOf(usuariosEliminados+usuariosActivos));
       lblCantGanadasHeroes.setText("Victorias Héroes: " + TableroStratego.contadorVictoriasHeroes);
    lblCantGanadasVillanos.setText("Victorias Villanos: " + TableroStratego.contadorVictoriasVillanos);

  
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCantUsuariosActivos = new javax.swing.JLabel();
        lblCantUsuariosHistoricos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCantGanadasHeroes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCantGanadasVillanos = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Batallas");

        lblCantUsuariosActivos.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        lblCantUsuariosActivos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantUsuariosActivos.setText("jLabel3");

        lblCantUsuariosHistoricos.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        lblCantUsuariosHistoricos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantUsuariosHistoricos.setText("jLabel5");

        jLabel5.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad Veces Ganadas Heroes:");

        lblCantGanadasHeroes.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        lblCantGanadasHeroes.setForeground(new java.awt.Color(255, 255, 255));
        lblCantGanadasHeroes.setText("jLabel6");

        jLabel6.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad Veces Ganadas Villanos:");

        lblCantGanadasVillanos.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        lblCantGanadasVillanos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantGanadasVillanos.setText("jLabel7");

        btnBack.setBackground(new java.awt.Color(0, 102, 153));
        btnBack.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantUsuariosActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantUsuariosHistoricos)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantGanadasHeroes)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantGanadasVillanos)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(btnBack)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(lblCantUsuariosActivos)
                .addGap(46, 46, 46)
                .addComponent(lblCantUsuariosHistoricos)
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantGanadasHeroes)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantGanadasVillanos)
                .addGap(60, 60, 60)
                .addComponent(btnBack)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
          marvel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCantGanadasHeroes;
    private javax.swing.JLabel lblCantGanadasVillanos;
    private javax.swing.JLabel lblCantUsuariosActivos;
    private javax.swing.JLabel lblCantUsuariosHistoricos;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g){
        {
            imagen = new ImageIcon(getClass().getResource("/imagenes/BATALLAS.png")).getImage(); 
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
        }
    }
}
