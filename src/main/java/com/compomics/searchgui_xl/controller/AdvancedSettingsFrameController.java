package com.compomics.searchgui_xl.controller;

import com.compomics.searchgui_xl.model.DefaultPropertyConfig;
import com.compomics.searchgui_xl.view.AdvancedSettingsFrame;
import com.compomics.searchgui_xl.model.PropertyConfig;
import java.util.Set;

/**
 *
 * @author Genet
 */
public final class AdvancedSettingsFrameController {

    private AdvancedSettingsFrame settingsFrm;
    private MainFrameController mainController;

    /**
     * Creates new form AdvancedSettings
     *
     * @param mainConrl
     *
     */
    public AdvancedSettingsFrameController(MainFrameController mainConrl) {

        this.settingsFrm = new AdvancedSettingsFrame(this);
        this.mainController = mainConrl;
        loadSettings();

    }

    public void loadSettings() {
        try {
            // File
            //General settings
            mainController.mainGUI.txtDatabasePath.setText(PropertyConfig.getInstance().getProperty("database.path"));
            mainController.mainGUI.txtSpectrumPath.setText(PropertyConfig.getInstance().getProperty("spectra.path"));
            mainController.mainGUI.txtOutPutFolder.setText(PropertyConfig.getInstance().getProperty("output.path"));
            mainController.mainGUI.cmbCrossLinker.setSelectedItem(PropertyConfig.getInstance().getProperty("cross.linker"));

            mainController.mainGUI.txtDatabasePath.setText(PropertyConfig.getInstance().getProperty("database.path"));
            mainController.mainGUI.txtSpectrumPath.setText(PropertyConfig.getInstance().getProperty("spectra.path"));
            mainController.mainGUI.txtOutPutFolder.setText(PropertyConfig.getInstance().getProperty("output.path"));
            mainController.mainGUI.cmbCrossLinker.setSelectedItem(PropertyConfig.getInstance().getProperty("cross.linker"));
            //Input data description
            int s = Integer.parseInt(PropertyConfig.getInstance().getProperty("instrument"));
            //settingsFrm.cmbInstrument.setSelectedIndex(s);
            settingsFrm.cmbFragmentMode.setSelectedItem(PropertyConfig.getInstance().getProperty("fragment.mode"));    
            settingsFrm.txtMS1Resolution.setText(PropertyConfig.getInstance().getProperty("MS1.resolution"));
            settingsFrm.txtMS2Resolution.setText(PropertyConfig.getInstance().getProperty("MS2.resolution"));
            settingsFrm.chkMS1Centroid.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("MS1.centroid")));
            settingsFrm.chkMS2Centroid.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("MS2.centroid")));
            s = (int) (10 * Double.parseDouble(PropertyConfig.getInstance().getProperty("enrichment")));
            settingsFrm.sldrEnrichment.setValue(s);
            settingsFrm.cmbEnzyme.setSelectedItem(PropertyConfig.getInstance().getProperty("enzyme"));
            settingsFrm.txtMaxMissCleabage.setText(PropertyConfig.getInstance().getProperty("max.miscleavages"));

            //Preprocessing   
            settingsFrm.txtMassWindow.setText(PropertyConfig.getInstance().getProperty("mass.window"));
            settingsFrm.txtMinFilteredPeaks.setText(PropertyConfig.getInstance().getProperty("minimumFiltedPeaksNumberForEachWindow"));
            settingsFrm.txtMaxFilteredPeaks.setText(PropertyConfig.getInstance().getProperty("maximumFiltedPeaksNumberForEachWindow"));
            settingsFrm.txtMinPrecMassIsotop.setText(PropertyConfig.getInstance().getProperty("minPrecMassIsotopicPeakSelected"));
            settingsFrm.txtDeisotopicPrecision.setText(PropertyConfig.getInstance().getProperty("deisotopePrecision"));
            settingsFrm.txtDeconvulatePrecision.setText(PropertyConfig.getInstance().getProperty("deconvulatePrecision"));

            //Score parameters    
            s = (int) (Double.parseDouble(PropertyConfig.getInstance().getProperty("fragment.binoffset")) * 10);
            settingsFrm.sldrFragBinOffset.setValue(s);
            settingsFrm.txtFragBinSize.setText(PropertyConfig.getInstance().getProperty("fragment.binsize"));
            settingsFrm.cmbNeutralLoss.setSelectedIndex(Integer.parseInt(PropertyConfig.getInstance().getProperty("neutral.losses")));
            settingsFrm.txtPrecTolerance.setText(PropertyConfig.getInstance().getProperty("precursor.tolerance"));
            settingsFrm.txtFragTolerance.setText(PropertyConfig.getInstance().getProperty("fragment.tolerance"));
            settingsFrm.cmbPrecTolerance.setSelectedItem(PropertyConfig.getInstance().getProperty("precursor.toleranceUnit"));
            settingsFrm.cmbFragTolerance.setSelectedItem(PropertyConfig.getInstance().getProperty("fragment.toleranceUnit"));
            settingsFrm.txtMaxPepMass.setText(PropertyConfig.getInstance().getProperty("max.peptide.mass"));
            settingsFrm.txtMinPepMass.setText(PropertyConfig.getInstance().getProperty("min.peptide.mass"));
            settingsFrm.chkFragIonA.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("fragment.ionA")));
            settingsFrm.chkFragIonB.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("fragment.ionB")));
            settingsFrm.chkFragIonC.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("fragment.ionC")));
            settingsFrm.chkFragIonX.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("fragment.ionX")));
            settingsFrm.chkFragIonY.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("fragment.ionY")));
            settingsFrm.chkFragIonZ.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("fragment.ionZ")));

            //Link Information
            settingsFrm.chkIsLabeled.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("isLabeled")));
            settingsFrm.chkMonoLink.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("searchForAlsoMonoLink")));
            // settingsFrm.chkInterLink.setSelected(PropertyConfig.getInstance().getBoolean("interlinkSearch"));
            settingsFrm.chkIntraLink.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("allowIntraPeptide")));
            settingsFrm.chkSideReactionS.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("consider.sideReactionSerine")));
            settingsFrm.chkSideReactionT.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("consider.sideReactionThreonine")));
            settingsFrm.chkSideReactionY.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("consider.sideReactionTyrosine")));
            settingsFrm.txtMaxPepLength.setText(PropertyConfig.getInstance().getProperty("maxLen.allowed"));
            settingsFrm.txtMinPepLength.setText(PropertyConfig.getInstance().getProperty("minLen.allowed"));

            //Validation
            settingsFrm.chkPercolator.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("isPercolatorAsked")));
            settingsFrm.txtPercolatorVersion.setText(PropertyConfig.getInstance().getProperty("percolator.version"));
            settingsFrm.txtFDR.setText(PropertyConfig.getInstance().getProperty("fdr"));

            //Additional
            settingsFrm.cmbisotopError.setSelectedIndex(Integer.parseInt(PropertyConfig.getInstance().getProperty("isotope.error")));
            settingsFrm.chkTurboButton.setSelected(Boolean.parseBoolean(PropertyConfig.getInstance().getProperty("turbo.button")));
            settingsFrm.txtFixedModifications.setText(PropertyConfig.getInstance().getProperty("fixed.modifications"));
            settingsFrm.txtVariableModifications.setText(PropertyConfig.getInstance().getProperty("variable.modifications"));
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }

    public void loadDefaultSettings() {

        restoreSettings();
        loadSettings();
    }

    /**
     * copy default configuration file values to current working properties
     * file.
     */
    private void restoreSettings() {

        Set<String> keys = DefaultPropertyConfig.getInstance().getAllProperties();
        for (String key : keys) {
            if (PropertyConfig.getInstance().keyfound(key)) {
                PropertyConfig.getInstance().setProperty(key, DefaultPropertyConfig.getInstance().getProperty(key));
            }
        }

    }

    /**
     * set the properties file from the user interface inputs
     */
    public void setPropertyFile() {

//        //General
//        PropertyConfig.getInstance().setProperty("database.path", mainController.mainGUI.txtDatabasePath.getText());
//        PropertyConfig.getInstance().setProperty("spectra.path", mainController.mainGUI.txtSpectrumPath);
//        PropertyConfig.getInstance().setProperty("output.path", mainController.mainGUI.txtOutPutFolder);
//
//        String crosslinker = mainController.mainGUI.cmbCrossLinker.getSelectedItem().toString();
//        PropertyConfig.getInstance().setProperty("cross.linker", crosslinker);
//
//        //Input data description
//        PropertyConfig.getInstance().setProperty("instrument", settingsFrm.cmbInstrument.getSelectedIndex());
//
//        PropertyConfig.getInstance().setProperty("fragment.mode", settingsFrm.cmbFragmentMode.getSelectedItem().toString());
//
//        int msRes = Integer.parseInt(settingsFrm.txtMS1Resolution.getText());
//        PropertyConfig.getInstance().setProperty("MS1.resolution", msRes);
//        msRes = Integer.parseInt(settingsFrm.txtMS2Resolution.getText());
//        PropertyConfig.getInstance().setProperty("MS2.resolution", msRes);
//
//        boolean chk = settingsFrm.chkMS1Centroid.isSelected();
//        PropertyConfig.getInstance().setProperty("MS1.centroid", chk);
//        chk = settingsFrm.chkMS2Centroid.isSelected();
//        PropertyConfig.getInstance().setProperty("MS2.centroid", chk);
//
//        PropertyConfig.getInstance().setProperty("enrichment", settingsFrm.txtEnrichment.getText());
//
//        PropertyConfig.getInstance().setProperty("enzyme", settingsFrm.cmbEnzyme.getSelectedItem().toString());
//        PropertyConfig.getInstance().setProperty("max_miscleavages", Integer.parseInt(settingsFrm.txtMaxMissCleabage.getText()));
//        PropertyConfig.getInstance().setProperty("max.miscleavages", DefaultConfigHolder.getInstance().getProperty("max.miscleavages"));
//
//        //Preprocessing   
//        PropertyConfig.getInstance().setProperty("mass.window", Integer.parseInt(settingsFrm.txtMassWindow.getText()));
//        PropertyConfig.getInstance().setProperty("minimumFiltedPeaksNumberForEachWindow", Integer.parseInt(settingsFrm.txtMinFilteredPeaks.getText()));
//        PropertyConfig.getInstance().setProperty("maximumFiltedPeaksNumberForEachWindow", Integer.parseInt(settingsFrm.txtMaxFilteredPeaks.getText()));
//        PropertyConfig.getInstance().setProperty("minPrecMassIsotopicPeakSelected", Integer.parseInt(settingsFrm.txtMinPrecMassIsotop.getText()));
//        PropertyConfig.getInstance().setProperty("deisotopePrecision", Integer.parseInt(settingsFrm.txtDeisotopicPrecision.getText()));
//        PropertyConfig.getInstance().setProperty("deconvulatePrecision", Integer.parseInt(settingsFrm.txtDeconvulatePrecision.getText()));
//
//        //Score parameters    
//        double fragBinOffset = Double.parseDouble(settingsFrm.txtFragBinOffset.getText());
//        PropertyConfig.getInstance().setProperty("fragment.binoffset", fragBinOffset);
//
//        PropertyConfig.getInstance().setProperty("fragment.binsize", Double.parseDouble(settingsFrm.txtFragBinSize.getText()));
//        PropertyConfig.getInstance().setProperty("neutral.losses", settingsFrm.cmbNeutralLoss.getSelectedIndex());
//        PropertyConfig.getInstance().setProperty("precursor.tolerance", Double.parseDouble(settingsFrm.txtPrecTolerance.getText()));
//        PropertyConfig.getInstance().setProperty("fragment.tolerance", Double.parseDouble(settingsFrm.txtFragTolerance.getText()));
//        PropertyConfig.getInstance().setProperty("precursor.toleranceUnit", settingsFrm.cmbPrecTolerance.getSelectedItem().toString());
//        PropertyConfig.getInstance().setProperty("fragment.toleranceUnit", settingsFrm.cmbFragmentMode.getSelectedItem().toString());
//        PropertyConfig.getInstance().setProperty("max.peptide.mass", Integer.parseInt(settingsFrm.txtMaxPepMass.getText()));
//        PropertyConfig.getInstance().setProperty("min.peptide.mass", Integer.parseInt(settingsFrm.txtMinPepMass.getText()));
//        PropertyConfig.getInstance().setProperty("fragment.ionA", settingsFrm.chkFragIonA.isSelected());
//        PropertyConfig.getInstance().setProperty("fragment.ionB", settingsFrm.chkFragIonB.isSelected());
//        PropertyConfig.getInstance().setProperty("fragment.ionC", settingsFrm.chkFragIonC.isSelected());
//        PropertyConfig.getInstance().setProperty("fragment.ionX", settingsFrm.chkFragIonX.isSelected());
//        PropertyConfig.getInstance().setProperty("fragment.ionY", settingsFrm.chkFragIonY.isSelected());
//        PropertyConfig.getInstance().setProperty("fragment.ionZ", settingsFrm.chkFragIonZ.isSelected());
//
//        //Link Information
//        PropertyConfig.getInstance().setProperty("isLabeled", settingsFrm.chkIsLabeled.isSelected());
//        PropertyConfig.getInstance().setProperty("searchForAlsoMonoLink", settingsFrm.chkMonoLink.isSelected());
//        boolean val = settingsFrm.chkIntraLink.isSelected();
//        if (val) {
//            PropertyConfig.getInstance().setProperty("crossLinkedProteinTypes", "Both");
//        } else {
//            PropertyConfig.getInstance().setProperty("crossLinkedProteinTypes", "Inter");
//        }
//        // settingsFrm.chkInterLink.setSelected(PropertyConfig.getInstance().getBoolean("interlinkSearch"));
//        DefaultConfigHolder.getInstance().setProperty("allowIntraPeptide", DefaultConfigHolder.getInstance().getBoolean("allowIntraPeptide"));
//        PropertyConfig.getInstance().setProperty("consider.sideReactionSerine", settingsFrm.chkSideReactionS.isSelected());
//        PropertyConfig.getInstance().setProperty("consider.sideReactionThreonine", settingsFrm.chkSideReactionT.isSelected());
//        PropertyConfig.getInstance().setProperty("consider.sideReactionTyrosine", settingsFrm.chkSideReactionY.isSelected());
//        PropertyConfig.getInstance().setProperty("maxLen.allowed", Integer.parseInt(settingsFrm.txtMaxPepLength.getText()));
//        PropertyConfig.getInstance().setProperty("minLen.allowed", Integer.parseInt(settingsFrm.txtMinPepLength.getText()));
//
//        //Validation
//        PropertyConfig.getInstance().setProperty("isPercolatorAsked", settingsFrm.chkPercolator.isSelected());
//        PropertyConfig.getInstance().setProperty("percolator.version", settingsFrm.txtPercolatorVersion.getText());
//        PropertyConfig.getInstance().setProperty("fdr", Double.parseDouble(settingsFrm.txtFDR.getText()));
//
//        //Additional
//        PropertyConfig.getInstance().setProperty("isotope.error", settingsFrm.cmbisotopError.getSelectedIndex());
//        PropertyConfig.getInstance().setProperty("turbo.button", settingsFrm.chkTurboButton.isSelected());
//        // PropertyConfig.getInstance().setProperty("fixed.modifications", DefaultConfigHolder.getInstance().getProperty("fixed.modifications"));
//        //PropertyConfig.getInstance().setProperty("variable.modifications", DefaultConfigHolder.getInstance().getProperty("variable.modifications"));

    }

    public void showForm() {
        settingsFrm.setLocationRelativeTo(null);
        settingsFrm.setVisible(true);

    }

}

// //General
//        ConfigHolder.getInstance().setProperty("database.path", DefaultConfigHolder.getInstance().getString("database.path"));
//        ConfigHolder.getInstance().setProperty("spectra.path", DefaultConfigHolder.getInstance().getString("spectra.path"));
//        ConfigHolder.getInstance().setProperty("output.path", DefaultConfigHolder.getInstance().getString("output.path"));
//        ConfigHolder.getInstance().setProperty("cross.linker", DefaultConfigHolder.getInstance().getString("cross.linker"));
//
//        //Input data description
//        ConfigHolder.getInstance().setProperty("instrument", DefaultConfigHolder.getInstance().getInt("instrument"));
//
//        ConfigHolder.getInstance().setProperty("fragment.mode", DefaultConfigHolder.getInstance().getString("fragment.mode"));
//        ConfigHolder.getInstance().setProperty("MS1.resolution", DefaultConfigHolder.getInstance().getInt("MS1.resolution"));
//        ConfigHolder.getInstance().setProperty("MS2.resolution", DefaultConfigHolder.getInstance().getInt("MS2.resolution"));
//        ConfigHolder.getInstance().setProperty("MS1.centroid", DefaultConfigHolder.getInstance().getBoolean("MS1.centroid"));
//        ConfigHolder.getInstance().setProperty("MS2.centroid", DefaultConfigHolder.getInstance().getBoolean("MS2.centroid"));
//        ConfigHolder.getInstance().setProperty("enrichment", DefaultConfigHolder.getInstance().getInt("enrichment"));
//        ConfigHolder.getInstance().setProperty("enzyme", DefaultConfigHolder.getInstance().getString("enzyme"));
//        ConfigHolder.getInstance().setProperty("max.miscleavages", DefaultConfigHolder.getInstance().getString("max.miscleavages"));
//
//        //Preprocessing   
//        ConfigHolder.getInstance().setProperty("mass.window", DefaultConfigHolder.getInstance().getString("mass.window"));
//        ConfigHolder.getInstance().setProperty("minimumFiltedPeaksNumberForEachWindow", DefaultConfigHolder.getInstance().getString("minimumFiltedPeaksNumberForEachWindow"));
//        ConfigHolder.getInstance().setProperty("maximumFiltedPeaksNumberForEachWindow", DefaultConfigHolder.getInstance().getString("maximumFiltedPeaksNumberForEachWindow"));
//        ConfigHolder.getInstance().setProperty("minPrecMassIsotopicPeakSelected", DefaultConfigHolder.getInstance().getString("minPrecMassIsotopicPeakSelected"));
//        ConfigHolder.getInstance().setProperty("deisotopePrecision", DefaultConfigHolder.getInstance().getString("deisotopePrecision"));
//        ConfigHolder.getInstance().setProperty("deconvulatePrecision", DefaultConfigHolder.getInstance().getString("deconvulatePrecision"));
//
//        //Score parameters    
//        int val = (int) (ConfigHolder.getInstance().getDouble("fragment.binoffset") * 10);
//        settingsFrm.sldrFragBinOffset.setValue(val);
//        ConfigHolder.getInstance().setProperty("fragment.binsize", DefaultConfigHolder.getInstance().getString("fragment.binsize"));
//        ConfigHolder.getInstance().setProperty("neutral.losses", DefaultConfigHolder.getInstance().getInt("neutral.losses"));
//        ConfigHolder.getInstance().setProperty("precursor.tolerance", DefaultConfigHolder.getInstance().getString("precursor.tolerance"));
//        ConfigHolder.getInstance().setProperty("fragment.tolerance", DefaultConfigHolder.getInstance().getString("fragment.tolerance"));
//        ConfigHolder.getInstance().setProperty("precursor.toleranceUnit", DefaultConfigHolder.getInstance().getString("precursor.toleranceUnit"));
//        ConfigHolder.getInstance().setProperty("fragment.toleranceUnit", DefaultConfigHolder.getInstance().getString("fragment.toleranceUnit"));
//        ConfigHolder.getInstance().setProperty("max.peptide.mass", DefaultConfigHolder.getInstance().getString("max.peptide.mass"));
//        ConfigHolder.getInstance().setProperty("min.peptide.mass", DefaultConfigHolder.getInstance().getString("min.peptide.mass"));
//        ConfigHolder.getInstance().setProperty("fragment.ionA", DefaultConfigHolder.getInstance().getBoolean("fragment.ionA"));
//        ConfigHolder.getInstance().setProperty("fragment.ionB", DefaultConfigHolder.getInstance().getBoolean("fragment.ionB"));
//        ConfigHolder.getInstance().setProperty("fragment.ionC", DefaultConfigHolder.getInstance().getBoolean("fragment.ionC"));
//        ConfigHolder.getInstance().setProperty("fragment.ionX", DefaultConfigHolder.getInstance().getBoolean("fragment.ionX"));
//        ConfigHolder.getInstance().setProperty("fragment.ionY", DefaultConfigHolder.getInstance().getBoolean("fragment.ionY"));
//        ConfigHolder.getInstance().setProperty("fragment.ionZ", DefaultConfigHolder.getInstance().getBoolean("fragment.ionZ"));
//
//        //Link Information
//        ConfigHolder.getInstance().setProperty("isLabeled", DefaultConfigHolder.getInstance().getBoolean("isLabeled"));
//        ConfigHolder.getInstance().setProperty("searchForAlsoMonoLink", DefaultConfigHolder.getInstance().getBoolean("searchForAlsoMonoLink"));
//        // settingsFrm.chkInterLink.setSelected(ConfigHolder.getInstance().getBoolean("interlinkSearch"));
//        DefaultConfigHolder.getInstance().setProperty("allowIntraPeptide", DefaultConfigHolder.getInstance().getBoolean("allowIntraPeptide"));
//        ConfigHolder.getInstance().setProperty("consider.sideReactionSerine", DefaultConfigHolder.getInstance().getBoolean("consider.sideReactionSerine"));
//        ConfigHolder.getInstance().setProperty("consider.sideReactionThreonine", DefaultConfigHolder.getInstance().getBoolean("consider.sideReactionThreonine"));
//        ConfigHolder.getInstance().setProperty("consider.sideReactionTyrosine", DefaultConfigHolder.getInstance().getBoolean("consider.sideReactionTyrosine"));
//        ConfigHolder.getInstance().setProperty("maxLen.allowed", DefaultConfigHolder.getInstance().getString("maxLen.allowed"));
//        ConfigHolder.getInstance().setProperty("minLen.allowed", DefaultConfigHolder.getInstance().getString("minLen.allowed"));
//
//        //Validation
//        ConfigHolder.getInstance().setProperty("isPercolatorAsked", DefaultConfigHolder.getInstance().getBoolean("isPercolatorAsked"));
//        ConfigHolder.getInstance().setProperty("percolator.version", DefaultConfigHolder.getInstance().getString("percolator.version"));
//        ConfigHolder.getInstance().setProperty("fdr", DefaultConfigHolder.getInstance().getString("fdr"));
//
//        //Additional
//        ConfigHolder.getInstance().setProperty("turbo.button", DefaultConfigHolder.getInstance().getBoolean("turbo.button"));
//        ConfigHolder.getInstance().setProperty("fixed.modifications", DefaultConfigHolder.getInstance().getString("fixed.modifications"));
//        ConfigHolder.getInstance().setProperty("variable.modifications", DefaultConfigHolder.getInstance().getString("variable.modifications"));
