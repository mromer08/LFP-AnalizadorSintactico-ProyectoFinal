package user_interface;

import controllers.ManejadorVentanaPrincipal;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import user_interface.reports.TipoReporte;
import util.TextLineNumber;

/**
 * Clase que se encarga de mostrarle al usuario el área de texto además de las
 * diferentes opciones que se tienen dentro de la aplicación.
 *
 * @author Manu
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ManejadorVentanaPrincipal manejador;

    private TextLineNumber numeroLinea;

    /**
     * Contructor para una nueva ventana principal.
     */
    public VentanaPrincipal() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        numeroLinea = new TextLineNumber(jTextPaneEditor);
        numeroLinea.setBackground(new Color(40, 40, 40));
        numeroLinea.setForeground(new Color(130, 130, 130));
        jScrollPane1.setRowHeaderView(numeroLinea);
        manejador = new ManejadorVentanaPrincipal(this);
        this.setIconImage(new ImageIcon(getClass().getResource("/images/filtro.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneEditor = new javax.swing.JTextPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAbrirArchivo = new javax.swing.JMenuItem();
        jMenuItemGuardarArchivo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemValidarTexto = new javax.swing.JMenuItem();
        jMenuItemLimpiarPantalla = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemReportTokens = new javax.swing.JMenuItem();
        jMenuItemRecuento = new javax.swing.JMenuItem();
        jMenuItemReportErrores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AFD");
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        jTextPaneEditor.setBackground(new java.awt.Color(40, 40, 40));
        jTextPaneEditor.setBorder(null);
        jTextPaneEditor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextPaneEditor.setForeground(new java.awt.Color(255, 255, 255));
        jTextPaneEditor.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextPaneEditor.setPreferredSize(new java.awt.Dimension(62, 500));
        jScrollPane1.setViewportView(jTextPaneEditor);

        jPanel3.add(jScrollPane1);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu4.setText("Archivo");

        jMenuItemAbrirArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemAbrirArchivo.setText("Abrir Archivo...");
        jMenuItemAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirArchivoActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAbrirArchivo);

        jMenuItemGuardarArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemGuardarArchivo.setText("Guardar como...");
        jMenuItemGuardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarArchivoActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemGuardarArchivo);
        jMenu4.add(jSeparator1);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemSalir);

        jMenuBar2.add(jMenu4);

        jMenu1.setText("Editar");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Buscar...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItemValidarTexto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemValidarTexto.setText("Validar Texto...");
        jMenuItemValidarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemValidarTextoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemValidarTexto);

        jMenuItemLimpiarPantalla.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemLimpiarPantalla.setText("Limpiar pantalla...");
        jMenuItemLimpiarPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLimpiarPantallaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLimpiarPantalla);

        jMenuBar2.add(jMenu1);

        jMenu5.setText("Reportes");

        jMenu2.setText("Reporte de tokens válidos");

        jMenuItemReportTokens.setText("Reporte de Tokens");
        jMenuItemReportTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReportTokensActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemReportTokens);

        jMenuItemRecuento.setText("Recuento de Tokens");
        jMenuItemRecuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRecuentoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRecuento);

        jMenu5.add(jMenu2);

        jMenuItemReportErrores.setText("Reporte de errores");
        jMenuItemReportErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReportErroresActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemReportErrores);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemSalirActionPerformed
        this.dispose();
    }// GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemAbrirArchivoActionPerformed
        manejador.cargarArchivo();
    }// GEN-LAST:event_jMenuItemAbrirArchivoActionPerformed

    private void jMenuItemGuardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemGuardarArchivoActionPerformed
        manejador.guardarArchivo();
    }// GEN-LAST:event_jMenuItemGuardarArchivoActionPerformed

    private void jMenuItemLimpiarPantallaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemLimpiarPantallaActionPerformed
        jTextPaneEditor.setText("");
    }// GEN-LAST:event_jMenuItemLimpiarPantallaActionPerformed

    private void jMenuItemValidarTextoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemValidarTextoActionPerformed
        manejador.validarTexto();
    }// GEN-LAST:event_jMenuItemValidarTextoActionPerformed

    private void jMenuItemReportErroresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemReportErroresActionPerformed
        manejador.mostrarReportes(TipoReporte.ERRORES);
    }// GEN-LAST:event_jMenuItemReportErroresActionPerformed

    private void jMenuItemReportTokensActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemReportTokensActionPerformed
        manejador.mostrarReportes(TipoReporte.TOKENS);
    }// GEN-LAST:event_jMenuItemReportTokensActionPerformed

    private void jMenuItemRecuentoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemRecuentoActionPerformed
        manejador.mostrarReportes(TipoReporte.RECUENTO);
    }// GEN-LAST:event_jMenuItemRecuentoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
        manejador.mostrarBuscador();
    }// GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAbrirArchivo;
    private javax.swing.JMenuItem jMenuItemGuardarArchivo;
    private javax.swing.JMenuItem jMenuItemLimpiarPantalla;
    private javax.swing.JMenuItem jMenuItemRecuento;
    private javax.swing.JMenuItem jMenuItemReportErrores;
    private javax.swing.JMenuItem jMenuItemReportTokens;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemValidarTexto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextPane jTextPaneEditor;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para obtener el editor de texto del programa
     *
     * @return El editor de texto del programa.
     */
    public JTextPane getjTextPaneEditor() {
        return jTextPaneEditor;
    }
}