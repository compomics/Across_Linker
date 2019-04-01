/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import com.compomics.searchgui_xl.controller.MainFrameController;
import com.compomics.searchgui_xl.controller.MainConsoleController;
import org.apache.log4j.Logger;

/**
 *
 * @author Genet
 */
public class ProjectMain {

    /**
     * Logger instance.
     */
    private static Logger LOG;
    /**
     * The startup error message.
     */
    private static final String ERROR_MESSAGE = "An error occured during startup, please try again."
            + System.lineSeparator() + "If the problem persists, contact your administrator or post an issue on the google code page.";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LOG = Logger.getLogger(ProjectMain.class.getName());
        try {
            if (args.length == 0) {// GUI 
                MainFrameController controller = new MainFrameController();
                controller.init();
            } else if (args.length != 0) { // command line interface option

                MainConsoleController controller = new MainConsoleController();
//                        controller.startRunning(args);

            }

        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
            //add message to JTextArea
            JTextArea textArea = new JTextArea(ERROR_MESSAGE + System.lineSeparator() + System.lineSeparator() + ex.getMessage());
            //put JTextArea in JScrollPane
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new Dimension(600, 200));
            textArea.setEditable(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);

            JOptionPane.showMessageDialog(null, scrollPane, "COSS startup error", JOptionPane.ERROR_MESSAGE);

        }
    }

}
