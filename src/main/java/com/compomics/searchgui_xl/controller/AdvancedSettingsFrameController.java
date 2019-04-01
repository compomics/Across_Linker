package com.compomics.searchgui_xl.controller;

import com.compomics.searchgui_xl.model.ConfigHolder;
import com.compomics.searchgui_xl.model.DefaultConfigHolder;
import com.compomics.searchgui_xl.view.AdvancedSettingsFrame;


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
 
     */
    public AdvancedSettingsFrameController(MainFrameController mainConrl) {

        this.settingsFrm = new AdvancedSettingsFrame(this);
        this.mainController = mainConrl;
        loadAdvancedSettings();
        
        
    }

    private void loadAdvancedSettings() {        
        
        //Input data description
        settingsFrm.cmbInstrument.setSelectedIndex(ConfigHolder.getInstance().getInt("instrument"));// check input String
        settingsFrm.cmbFragmentMode.setSelectedItem(ConfigHolder.getInstance().getString("fragment.mode"));
        settingsFrm.txtMS1Resolution.setText(Integer.toString(ConfigHolder.getInstance().getInt("MS1.resolution")));
        settingsFrm.txtMS2Resolution.setText(Integer.toString(ConfigHolder.getInstance().getInt("MS2.resolution")));
        settingsFrm.chkMS1Centroid.setSelected(ConfigHolder.getInstance().getBoolean("MS1.centroid"));
        settingsFrm.chkMS2Centroid.setSelected(ConfigHolder.getInstance().getBoolean("MS2.centroid"));
        int val = (int)(10*ConfigHolder.getInstance().getDouble("enrichment"));
        settingsFrm.sldrEnrichment.setValue(val); 
        settingsFrm.cmbEnzyme.setSelectedItem(ConfigHolder.getInstance().getString("enzyme"));
        settingsFrm.txtMaxMissCleabage.setText(ConfigHolder.getInstance().getString("max.miscleavages"));

        //Preprocessing   
        settingsFrm.txtMassWindow.setText(ConfigHolder.getInstance().getString("mass.window"));
        settingsFrm.txtMinFilteredPeaks.setText(ConfigHolder.getInstance().getString("minimumFiltedPeaksNumberForEachWindow"));
        settingsFrm.txtMaxFilteredPeaks.setText(ConfigHolder.getInstance().getString("maximumFiltedPeaksNumberForEachWindow"));
        settingsFrm.txtMinPrecMassIsotop.setText(ConfigHolder.getInstance().getString("minPrecMassIsotopicPeakSelected"));
        settingsFrm.txtDeisotopicPrecision.setText(ConfigHolder.getInstance().getString("deisotopePrecision"));
        settingsFrm.txtDeconvulatePrecision.setText(ConfigHolder.getInstance().getString("deconvulatePrecision"));

        //Score parameters    


        val=(int)(ConfigHolder.getInstance().getDouble("fragment.binoffset")*10);
        settingsFrm.sldrFragBinOffset.setValue(val);         
        settingsFrm.txtFragBinSize.setText(ConfigHolder.getInstance().getString("fragment.binsize"));
        settingsFrm.cmbNeutralLoss.setSelectedIndex(ConfigHolder.getInstance().getInt("neutral.losses"));
        settingsFrm.txtPrecTolerance.setText(ConfigHolder.getInstance().getString("precursor.tolerance"));
        settingsFrm.txtFragTolerance.setText(ConfigHolder.getInstance().getString("fragment.tolerance"));
        settingsFrm.cmbPrecTolerance.setSelectedItem(ConfigHolder.getInstance().getString("precursor.toleranceUnit"));
        settingsFrm.cmbFragTolerance.setSelectedItem(ConfigHolder.getInstance().getString("fragment.toleranceUnit"));
        settingsFrm.txtMaxPepMass.setText(ConfigHolder.getInstance().getString("max.peptide.mass"));
        settingsFrm.txtMinPepMass.setText(ConfigHolder.getInstance().getString("min.peptide.mass"));
        settingsFrm.chkFragIonA.setSelected(ConfigHolder.getInstance().getBoolean("fragment.ionA"));
        settingsFrm.chkFragIonB.setSelected(ConfigHolder.getInstance().getBoolean("fragment.ionB"));
        settingsFrm.chkFragIonC.setSelected(ConfigHolder.getInstance().getBoolean("fragment.ionC"));
        settingsFrm.chkFragIonX.setSelected(ConfigHolder.getInstance().getBoolean("fragment.ionX"));
        settingsFrm.chkFragIonY.setSelected(ConfigHolder.getInstance().getBoolean("fragment.ionY"));
        settingsFrm.chkFragIonZ.setSelected(ConfigHolder.getInstance().getBoolean("fragment.ionZ"));

        //Link Information
        settingsFrm.chkIsLabeled.setSelected(ConfigHolder.getInstance().getBoolean("isLabeled"));
        settingsFrm.chkMonoLink.setSelected(ConfigHolder.getInstance().getBoolean("searchForAlsoMonoLink"));
       // settingsFrm.chkInterLink.setSelected(ConfigHolder.getInstance().getBoolean("interlinkSearch"));
        settingsFrm.chkIntraLink.setSelected(ConfigHolder.getInstance().getBoolean("allowIntraPeptide"));
        settingsFrm.chkSideReactionS.setSelected(ConfigHolder.getInstance().getBoolean("consider.sideReactionSerine"));
        settingsFrm.chkSideReactionT.setSelected(ConfigHolder.getInstance().getBoolean("consider.sideReactionThreonine"));
        settingsFrm.chkSideReactionY.setSelected(ConfigHolder.getInstance().getBoolean("consider.sideReactionTyrosine"));
        settingsFrm.txtMaxPepLength.setText(ConfigHolder.getInstance().getString("maxLen.allowed"));
        settingsFrm.txtMinPepLength.setText(ConfigHolder.getInstance().getString("minLen.allowed"));

        //Validation
        settingsFrm.chkPercolator.setSelected(ConfigHolder.getInstance().getBoolean("isPercolatorAsked"));
        settingsFrm.txtPercolatorVersion.setText(ConfigHolder.getInstance().getString("percolator.version"));
        settingsFrm.txtFDR.setText(ConfigHolder.getInstance().getString("fdr"));

        //Additional
        settingsFrm.cmbisotopError.setSelectedIndex(ConfigHolder.getInstance().getInt("isotope.error"));
        settingsFrm.chkTurboButton.setSelected(ConfigHolder.getInstance().getBoolean("turbo.button"));
        settingsFrm.txtFixedModifications.setText(ConfigHolder.getInstance().getString("fixed.modifications"));
        settingsFrm.txtVariableModifications.setText(ConfigHolder.getInstance().getString("variable.modifications"));

    }

    public void loadDefaultSettings() {

        restoreSettings();
        mainController.loadGeneralSettings();
        loadAdvancedSettings();
    }

    private void restoreSettings() {
        //General
        ConfigHolder.getInstance().setProperty("database.path", DefaultConfigHolder.getInstance().getString("database.path"));
        ConfigHolder.getInstance().setProperty("spectra.path", DefaultConfigHolder.getInstance().getString("spectra.path"));
        ConfigHolder.getInstance().setProperty("output.path", DefaultConfigHolder.getInstance().getString("output.path"));
        ConfigHolder.getInstance().setProperty("cross.linker", DefaultConfigHolder.getInstance().getString("cross.linker"));
        
        //Input data description
        ConfigHolder.getInstance().setProperty("instrument", DefaultConfigHolder.getInstance().getInt("instrument"));
        
        ConfigHolder.getInstance().setProperty("fragment.mode", DefaultConfigHolder.getInstance().getString("fragment.mode"));
        ConfigHolder.getInstance().setProperty("MS1.resolution", DefaultConfigHolder.getInstance().getInt("MS1.resolution"));
        ConfigHolder.getInstance().setProperty("MS2.resolution", DefaultConfigHolder.getInstance().getInt("MS2.resolution"));
        ConfigHolder.getInstance().setProperty("MS1.centroid", DefaultConfigHolder.getInstance().getBoolean("MS1.centroid"));
        ConfigHolder.getInstance().setProperty("MS2.centroid" , DefaultConfigHolder.getInstance().getBoolean("MS2.centroid"));
        ConfigHolder.getInstance().setProperty("enrichment", DefaultConfigHolder.getInstance().getInt("enrichment")); 
        ConfigHolder.getInstance().setProperty("enzyme", DefaultConfigHolder.getInstance().getString("enzyme"));
        ConfigHolder.getInstance().setProperty("max.miscleavages", DefaultConfigHolder.getInstance().getString("max.miscleavages"));

        //Preprocessing   
        ConfigHolder.getInstance().setProperty("mass.window", DefaultConfigHolder.getInstance().getString("mass.window"));
        ConfigHolder.getInstance().setProperty("minimumFiltedPeaksNumberForEachWindow", DefaultConfigHolder.getInstance().getString("minimumFiltedPeaksNumberForEachWindow"));
        ConfigHolder.getInstance().setProperty("maximumFiltedPeaksNumberForEachWindow", DefaultConfigHolder.getInstance().getString("maximumFiltedPeaksNumberForEachWindow"));
        ConfigHolder.getInstance().setProperty("minPrecMassIsotopicPeakSelected", DefaultConfigHolder.getInstance().getString("minPrecMassIsotopicPeakSelected"));
        ConfigHolder.getInstance().setProperty("deisotopePrecision", DefaultConfigHolder.getInstance().getString("deisotopePrecision"));
        ConfigHolder.getInstance().setProperty("deconvulatePrecision", DefaultConfigHolder.getInstance().getString("deconvulatePrecision"));

        //Score parameters    


        int val=(int)(ConfigHolder.getInstance().getDouble("fragment.binoffset")*10);
        settingsFrm.sldrFragBinOffset.setValue(val);         
        ConfigHolder.getInstance().setProperty("fragment.binsize",DefaultConfigHolder.getInstance().getString("fragment.binsize"));
        ConfigHolder.getInstance().setProperty("neutral.losses", DefaultConfigHolder.getInstance().getInt("neutral.losses"));
        ConfigHolder.getInstance().setProperty("precursor.tolerance", DefaultConfigHolder.getInstance().getString("precursor.tolerance"));
        ConfigHolder.getInstance().setProperty("fragment.tolerance", DefaultConfigHolder.getInstance().getString("fragment.tolerance"));
        ConfigHolder.getInstance().setProperty("precursor.toleranceUnit", DefaultConfigHolder.getInstance().getString("precursor.toleranceUnit"));
        ConfigHolder.getInstance().setProperty("fragment.toleranceUnit", DefaultConfigHolder.getInstance().getString("fragment.toleranceUnit"));
        ConfigHolder.getInstance().setProperty("max.peptide.mass", DefaultConfigHolder.getInstance().getString("max.peptide.mass"));
        ConfigHolder.getInstance().setProperty("min.peptide.mass", DefaultConfigHolder.getInstance().getString("min.peptide.mass"));
        ConfigHolder.getInstance().setProperty("fragment.ionA", DefaultConfigHolder.getInstance().getBoolean("fragment.ionA"));
        ConfigHolder.getInstance().setProperty("fragment.ionB", DefaultConfigHolder.getInstance().getBoolean("fragment.ionB"));
        ConfigHolder.getInstance().setProperty("fragment.ionC", DefaultConfigHolder.getInstance().getBoolean("fragment.ionC"));
        ConfigHolder.getInstance().setProperty("fragment.ionX", DefaultConfigHolder.getInstance().getBoolean("fragment.ionX"));
        ConfigHolder.getInstance().setProperty("fragment.ionY", DefaultConfigHolder.getInstance().getBoolean("fragment.ionY"));
        ConfigHolder.getInstance().setProperty("fragment.ionZ", DefaultConfigHolder.getInstance().getBoolean("fragment.ionZ"));

        //Link Information
        ConfigHolder.getInstance().setProperty("isLabeled", DefaultConfigHolder.getInstance().getBoolean("isLabeled"));
        ConfigHolder.getInstance().setProperty("searchForAlsoMonoLink", DefaultConfigHolder.getInstance().getBoolean("searchForAlsoMonoLink"));
       // settingsFrm.chkInterLink.setSelected(ConfigHolder.getInstance().getBoolean("interlinkSearch"));
        DefaultConfigHolder.getInstance().setProperty("allowIntraPeptide", DefaultConfigHolder.getInstance().getBoolean("allowIntraPeptide"));
        ConfigHolder.getInstance().setProperty("consider.sideReactionSerine", DefaultConfigHolder.getInstance().getBoolean("consider.sideReactionSerine"));
        ConfigHolder.getInstance().setProperty("consider.sideReactionThreonine", DefaultConfigHolder.getInstance().getBoolean("consider.sideReactionThreonine"));
        ConfigHolder.getInstance().setProperty("consider.sideReactionTyrosine", DefaultConfigHolder.getInstance().getBoolean("consider.sideReactionTyrosine"));
        ConfigHolder.getInstance().setProperty("maxLen.allowed", DefaultConfigHolder.getInstance().getString("maxLen.allowed"));
        ConfigHolder.getInstance().setProperty("minLen.allowed", DefaultConfigHolder.getInstance().getString("minLen.allowed"));

        //Validation
        ConfigHolder.getInstance().setProperty("isPercolatorAsked", DefaultConfigHolder.getInstance().getBoolean("isPercolatorAsked"));
        ConfigHolder.getInstance().setProperty("percolator.version", DefaultConfigHolder.getInstance().getString("percolator.version"));
        ConfigHolder.getInstance().setProperty("fdr", DefaultConfigHolder.getInstance().getString("fdr"));

        //Additional
        ConfigHolder.getInstance().setProperty("turbo.button", DefaultConfigHolder.getInstance().getBoolean("turbo.button"));
        ConfigHolder.getInstance().setProperty("fixed.modifications", DefaultConfigHolder.getInstance().getString("fixed.modifications"));
        ConfigHolder.getInstance().setProperty("variable.modifications", DefaultConfigHolder.getInstance().getString("variable.modifications"));

        
    }
    
    
   

    public void showForm() {
        settingsFrm.setLocationRelativeTo(null);
        settingsFrm.setVisible(true);

    }

}
