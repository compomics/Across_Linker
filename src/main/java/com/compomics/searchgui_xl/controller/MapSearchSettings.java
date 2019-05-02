package com.compomics.searchgui_xl.controller;

import com.compomics.searchgui_xl.model.PropertyConfig;
import org.apache.commons.configuration.ConfigurationException;

/**
 *
 * @author Genet
 */
public class MapSearchSettings {

    public MapSearchSettings() {

    }

    public void setXilmassParameters() throws ConfigurationException {
        try {

//            // General settings
//            System.out.println(PropertyConfig.getInstance().getProperty("database.path"));
//            ConfigHolder_xilmass.getInstance().setProperty("mgfs", PropertyConfig.getInstance().getProperty("spectra.path"));
//            ConfigHolder_xilmass.getInstance().setProperty("resultFolder", PropertyConfig.getInstance().getProperty("output.path"));
//            ConfigHolder_xilmass.getInstance().setProperty("crossLinkerName", PropertyConfig.getInstance().getProperty("cross.linker"));
//            //Input data description        
//            ConfigHolder_xilmass.getInstance().setProperty("fragMode", PropertyConfig.getInstance().getProperty("fragment.mode"));
//            ConfigHolder_xilmass.getInstance().setProperty("enzymeName", PropertyConfig.getInstance().getProperty("enzyme"));
//            ConfigHolder_xilmass.getInstance().setProperty("miscleavaged", PropertyConfig.getInstance().getProperty("max.miscleavages"));
//
//            //Preprocessing   
//            ConfigHolder_xilmass.getInstance().setProperty("massWindow", PropertyConfig.getInstance().getProperty("mass.window"));
//            ConfigHolder_xilmass.getInstance().setProperty("minimumFiltedPeaksNumberForEachWindow", PropertyConfig.getInstance().getProperty("minimumFiltedPeaksNumberForEachWindow"));
//            ConfigHolder_xilmass.getInstance().setProperty("maximumFiltedPeaksNumberForEachWindow", PropertyConfig.getInstance().getProperty("maximumFiltedPeaksNumberForEachWindow"));
//            ConfigHolder_xilmass.getInstance().setProperty("minPrecMassIsotopicPeakSelected", PropertyConfig.getInstance().getProperty("minPrecMassIsotopicPeakSelected"));
//            ConfigHolder_xilmass.getInstance().setProperty("deisotopePrecision", PropertyConfig.getInstance().getProperty("deisotopePrecision"));
//            ConfigHolder_xilmass.getInstance().setProperty("deconvulatePrecision", PropertyConfig.getInstance().getProperty("deconvulatePrecision"));
//
//            //Score parameters    
//            ConfigHolder_xilmass.getInstance().setProperty("consider_neutrallosses", PropertyConfig.getInstance().getInt("neutral.losses"));
//            ConfigHolder_xilmass.getInstance().setProperty("peptide_tol1", PropertyConfig.getInstance().getProperty("precursor.tolerance"));
//            ConfigHolder_xilmass.getInstance().setProperty("msms_tol", PropertyConfig.getInstance().getProperty("fragment.tolerance"));
//            char tf = 'T';
//            if (!"PPM".equals(PropertyConfig.getInstance().getProperty("precursor.toleranceUnit"))) {
//                tf = 'F';
//            }
//
//            ConfigHolder_xilmass.getInstance().setProperty("is_peptide_tol1_PPM", tf);
//            ConfigHolder_xilmass.getInstance().setProperty("higherMass", PropertyConfig.getInstance().getProperty("max.peptide.mass"));
//            ConfigHolder_xilmass.getInstance().setProperty("lowerMass", PropertyConfig.getInstance().getProperty("min.peptide.mass"));
//
//            //Link Information
//            ConfigHolder_xilmass.getInstance().setProperty("isLabeled", PropertyConfig.getInstance().getBoolean("isLabeled"));
//            boolean b = PropertyConfig.getInstance().getBoolean("searchForAlsoMonoLink");
//            if (b) {
//                tf = 'T';
//            } else {
//                tf = 'F';
//            }
//            ConfigHolder_xilmass.getInstance().setProperty("searchForAlsoMonoLink", tf);
//            // settingsFrm.chkInterLink.setSelected(PropertyConfig.getInstance().getBoolean("interlinkSearch"));
//            b = PropertyConfig.getInstance().getBoolean("allowIntraPeptide");
//            if (b) {
//                tf = 'T';
//            } else {
//                tf = 'F';
//            }
//
//            ConfigHolder_xilmass.getInstance().setProperty("allowIntraPeptide", tf);
//            ConfigHolder_xilmass.getInstance().setProperty("isConsideredSideReactionSerine", PropertyConfig.getInstance().getBoolean("consider.sideReactionSerine"));
//            ConfigHolder_xilmass.getInstance().setProperty("isConsideredSideReactionThreonine", PropertyConfig.getInstance().getBoolean("consider.sideReactionThreonine"));
//            ConfigHolder_xilmass.getInstance().setProperty("isConsideredSideReactionTyrosine", PropertyConfig.getInstance().getBoolean("consider.sideReactionTyrosine"));
//            ConfigHolder_xilmass.getInstance().setProperty("maxLenCombined", PropertyConfig.getInstance().getProperty("maxLen.allowed"));
//            ConfigHolder_xilmass.getInstance().setProperty("minLen", PropertyConfig.getInstance().getProperty("minLen.allowed"));
//
//            //Validation
//            ConfigHolder_xilmass.getInstance().setProperty("fdr", PropertyConfig.getInstance().getProperty("fdr"));
//
//            //Modifications
////            ConfigHolder_xilmass.getInstance().setProperty("fixedModification", PropertyConfig.getInstance().getProperty("fixed.modifications"));
////            ConfigHolder_xilmass.getInstance().setProperty("variableModification", PropertyConfig.getInstance().getProperty("variable.modifications"));
//
//             ConfigHolder_xilmass.getInstance().save();
            
        } catch (Exception ex) {
            System.out.println("Initializer error: " + ex);
        }

    }

    public void setKojakParameters() {

//        ConfigHolder_kojak.getInstance().setProperty("instrument", PropertyConfig.getInstance().getInt("instrument"));
//        ConfigHolder_kojak.getInstance().setProperty("MS1_resolution", PropertyConfig.getInstance().getInt("MS1.resolution"));
//        ConfigHolder_kojak.getInstance().setProperty("MS2_resolution", PropertyConfig.getInstance().getInt("MS2.resolution"));
//        ConfigHolder_kojak.getInstance().setProperty("MS1_centroid", PropertyConfig.getInstance().getBoolean("MS1.centroid"));
//        ConfigHolder_kojak.getInstance().setProperty("MS2_centroid", PropertyConfig.getInstance().getBoolean("MS2.centroid"));
//        int val = (int) (10 * PropertyConfig.getInstance().getDouble("enrichment"));
//        ConfigHolder_kojak.getInstance().setProperty("instrument", val);
//        ConfigHolder_kojak.getInstance().setProperty("instrument", PropertyConfig.getInstance().getProperty("enzyme"));
//        ConfigHolder_kojak.getInstance().setProperty("instrument", PropertyConfig.getInstance().getProperty("max.miscleavages"));
//
//        //Score parameters    
//        val = (int) (PropertyConfig.getInstance().getDouble("fragment.binoffset") * 10);
//        ConfigHolder_kojak.getInstance().setProperty("fragment_bin_offset", val);
//        ConfigHolder_kojak.getInstance().setProperty("instrument", PropertyConfig.getInstance().getProperty("fragment.binsize"));
//        ConfigHolder_kojak.getInstance().setProperty("instrument", PropertyConfig.getInstance().getProperty("precursor.tolerance"));
//        ConfigHolder_kojak.getInstance().setProperty("instrument", PropertyConfig.getInstance().getProperty("fragment.tolerance"));
//        ConfigHolder_kojak.getInstance().setProperty("instrument", PropertyConfig.getInstance().getProperty("precursor.toleranceUnit"));
//        ConfigHolder_kojak.getInstance().setProperty("instrument", PropertyConfig.getInstance().getProperty("fragment.toleranceUnit"));
//        ConfigHolder_kojak.getInstance().setProperty("instrument", PropertyConfig.getInstance().getProperty("max.peptide.mass"));
//        ConfigHolder_kojak.getInstance().setProperty("instrument", PropertyConfig.getInstance().getProperty("min.peptide.mass"));
//        ConfigHolder_kojak.getInstance().setProperty("ion_series_A", PropertyConfig.getInstance().getBoolean("fragment.ionA"));
//        ConfigHolder_kojak.getInstance().setProperty("ion_series_B", PropertyConfig.getInstance().getBoolean("fragment.ionB"));
//        ConfigHolder_kojak.getInstance().setProperty("ion_series_C", PropertyConfig.getInstance().getBoolean("fragment.ionC"));
//        ConfigHolder_kojak.getInstance().setProperty("ion_series_X", PropertyConfig.getInstance().getBoolean("fragment.ionX"));
//        ConfigHolder_kojak.getInstance().setProperty("ion_series_Y", PropertyConfig.getInstance().getBoolean("fragment.ionY"));
//        ConfigHolder_kojak.getInstance().setProperty("ion_series_Z", PropertyConfig.getInstance().getBoolean("fragment.ionZ"));
//
//        //Validation
//        int p = 1;
//        if (!PropertyConfig.getInstance().getBoolean("isPercolatorAsked")) {
//            p = 0;
//        }
//        ConfigHolder_kojak.getInstance().setProperty("export_percolator", p);
//        ConfigHolder_kojak.getInstance().setProperty("percolator_version", PropertyConfig.getInstance().getProperty("percolator.version"));
//
//        //Additional
//        ConfigHolder_kojak.getInstance().setProperty("isotope_error", PropertyConfig.getInstance().getInt("isotope.error"));
//        ConfigHolder_kojak.getInstance().setProperty("turbo_button", PropertyConfig.getInstance().getBoolean("turbo.button"));
//
//        //Modifications
//        ConfigHolder_kojak.getInstance().setProperty("fixed.modifications", PropertyConfig.getInstance().getProperty("fixed.modifications"));
//        ConfigHolder_kojak.getInstance().setProperty("variable.modifications", PropertyConfig.getInstance().getProperty("variable.modifications"));
    }

}
