package com.compomics.searchgui_xl.controller;

import com.compomics.searchgui_xl.view.*;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;
import org.apache.commons.configuration.ConfigurationException;

/**
 *
 * @author Genet
 */
public class MainFrameController {

    public MainGUI mainGUI;
    private AdvancedSettingsFrameController advFrmController;
    private  MapSearchSettings mps;

    public void init() {
        
        mainGUI = new MainGUI(this);
        advFrmController = new AdvancedSettingsFrameController(this);
        mps = new MapSearchSettings();
        advFrmController.loadSettings();
        showMainFrame();
    }

    /**
     * Show the main window of .
     */
    private void showMainFrame() {

        mainGUI.setLocationRelativeTo(null);
        mainGUI.setVisible(true);

    }



    public void startSearch() throws ConfigurationException {
       
        mps.setXilmassParameters();
        
        //call swing worker thread to process time taking work
    }

    /**
     * Shows a message dialog.
     *
     * @param title the dialog title
     * @param message the dialog message
     * @param messageType the dialog message type
     */
    public void showMessageDialog(final String title, final String message, final int messageType) {
        JTextArea textArea = new JTextArea(message);
        //put JTextArea in JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(600, 200));
        scrollPane.getViewport().setOpaque(false);
        
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JOptionPane.showMessageDialog(mainGUI.getContentPane(), scrollPane, title, messageType);
    }

    /**
     * restore default settings
     */
    public void resetDefaultSettings() {// produce backupConfig file to reset
        //delete old file and create new from backup file

    }

    public void showAdvancedSearchParams() {

        advFrmController.showForm();
    }

    /**
     * swing thread to start the search and it runs on background
     */
    private class SwingWorkerThread extends SwingWorker<Void, Void> {

        @Override
        protected Void doInBackground() throws Exception {

//            isBussy = true;
//            mainGUI.btnSearch(false);
//
//            result = null;
//            LOG.info("COSS version 1.0");
//            LOG.info("Query spectra: " + configData.getExperimentalSpecFile().toString());
//            LOG.info("Library: " + configData.getSpecLibraryFile().toString());
//            LOG.info("Search started ");
//            result = dispatcher.dispatch();
            return null;

        }

        @Override
        protected void done() {

//            try {
//
//                if (cencelled) {
//
//                    LOG.info("Process Cancelled.");
//                    mainView.setProgressValue(0);
//                    mainView.setProgressValue(Integer.toString(0) + "%");
//
//                } else if (result != null) {
//                    LOG.info("Search Completed");
//                    mainView.setProgressValue(100);
//                    mainView.setProgressValue(Integer.toString(100) + "%");
//
//                    LOG.info("Total number of identified spectra: " + Integer.toString(result.size()));
//
//                    
//                    if (!result.isEmpty() && configData.isDecoyAvailable()) {
//                        validateResult();
//                        LOG.info("Number of validated identified spectra: " + Integer.toString(result.size()));
//                    } else if(configData.isDecoyAvailable()){
//                        LOG.info("No decoy spectra found in library");
//                    }
//                    fillExpSpectraTable();
//                    fillBestmatchTable(0);
//                    displayResult();
//                    get();
//
//                } else {
//                    LOG.info("No comparison result.");
//                    clearGraphicArea();
//                }
//
//                isBussy = false;
//                mainView.searchBtnActive(true);
//
//            } catch (InterruptedException | ExecutionException ex) {
//                LOG.error(ex.getMessage(), ex);
//                showMessageDialog("Unexpected error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
//            } catch (CancellationException ex) {
//                LOG.info("the spectrum similarity score pipeline run was cancelled");
//            } finally {
//
//            }
        }

    }

}
