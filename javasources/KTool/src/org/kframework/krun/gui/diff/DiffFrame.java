package org.kframework.krun.gui.diff;

import java.io.IOException;

import javax.swing.text.html.HTMLEditorKit;

import org.kframework.krun.api.KRunState;
import org.kframework.krun.api.Transition;
import org.kframework.krun.gui.Controller.RunKRunCommand;

/**
 *
 * @author daniel
 */
public class DiffFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	/**
     * Creates new form DiffFrame
     */
    public DiffFrame(KRunState srcState, KRunState destState, Transition transition) {
    	try {
			initComponents(Diff.comparableTest(RunKRunCommand.transformTerm(srcState.getResult()), RunKRunCommand.transformTerm(destState.getResult())));
		} catch (IOException e) {
			e.printStackTrace();
			initComponents(e.getMessage());
		}
        src.setText("Node : " + srcState.getStateId());
        dest.setText("Node : " + destState.getStateId());
        this.transition.setText("Transition : " + transition.getLabel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String Htmldiffs) {
    	HTMLEditorKit kit = new HTMLEditorKit();
        jScrollPane1 = new javax.swing.JScrollPane();
        diffEditor = new javax.swing.JEditorPane("text/html",Htmldiffs);
//        diffEditor.setEditorKitForContentType("text/html", kit);
//        //diffEditor.setEditorKit(kit);
        diffEditor.setEditable(false);
//        Document doc = kit.createDefaultDocument();
//        diffEditor.setDocument(doc);
//        diffEditor.setText(Htmldiffs);
        src = new javax.swing.JLabel();
        dest = new javax.swing.JLabel();
        transition = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(diffEditor);

        src.setText("");

        dest.setText("");

        transition.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(src)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dest)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(transition)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(src)
                    .addComponent(dest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transition))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dest;
    private javax.swing.JEditorPane diffEditor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel src;
    private javax.swing.JLabel transition;
    // End of variables declaration//GEN-END:variables
}