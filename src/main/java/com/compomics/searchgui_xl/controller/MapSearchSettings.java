
package com.compomics.searchgui_xl.controller;

import com.compomics.searchgui_xl.model.ConfigHolder;
import com.compomics.searchgui_xl.model.ConfigHolder_kojak;
import com.compomics.searchgui_xl.model.ConfigHolder_xilmass;

/**
 *
 * @author Genet
 */
public class MapSearchSettings {
    
    public MapSearchSettings(){
        
    }
    
    public void setXilmassParameters(){
        //Input data description        
        ConfigHolder_xilmass.getInstance().setProperty("fragMode", ConfigHolder.getInstance().getString("fragment.mode"));       
        ConfigHolder_xilmass.getInstance().setProperty("enzymeName", ConfigHolder.getInstance().getString("enzyme"));
        ConfigHolder_xilmass.getInstance().setProperty("miscleavaged",ConfigHolder.getInstance().getString("max.miscleavages"));

        //Preprocessing   
        ConfigHolder_xilmass.getInstance().setProperty("massWindow",ConfigHolder.getInstance().getString("mass.window"));
        ConfigHolder_xilmass.getInstance().setProperty("minimumFiltedPeaksNumberForEachWindow",ConfigHolder.getInstance().getString("minimumFiltedPeaksNumberForEachWindow"));
        ConfigHolder_xilmass.getInstance().setProperty("maximumFiltedPeaksNumberForEachWindow",ConfigHolder.getInstance().getString("maximumFiltedPeaksNumberForEachWindow"));
        ConfigHolder_xilmass.getInstance().setProperty("minPrecMassIsotopicPeakSelected",ConfigHolder.getInstance().getString("minPrecMassIsotopicPeakSelected"));
        ConfigHolder_xilmass.getInstance().setProperty("deisotopePrecision",ConfigHolder.getInstance().getString("deisotopePrecision"));
        ConfigHolder_xilmass.getInstance().setProperty("deconvulatePrecision",ConfigHolder.getInstance().getString("deconvulatePrecision"));

        //Score parameters    
       
        ConfigHolder_xilmass.getInstance().setProperty("consider_neutrallosses",ConfigHolder.getInstance().getInt("neutral.losses"));
        ConfigHolder_xilmass.getInstance().setProperty("peptide_tol1",ConfigHolder.getInstance().getString("precursor.tolerance"));
        ConfigHolder_xilmass.getInstance().setProperty("msms_tol",ConfigHolder.getInstance().getString("fragment.tolerance"));
        char tf='T';
        if(!"PPM".equals(ConfigHolder.getInstance().getString("precursor.toleranceUnit"))){
            tf='F';
        }
            
        ConfigHolder_xilmass.getInstance().setProperty("is_peptide_tol1_PPM", tf);
        ConfigHolder_xilmass.getInstance().setProperty("higherMass",ConfigHolder.getInstance().getString("max.peptide.mass"));
        ConfigHolder_xilmass.getInstance().setProperty("lowerMass",ConfigHolder.getInstance().getString("min.peptide.mass"));
        
        //Link Information
        ConfigHolder_xilmass.getInstance().setProperty("isLabeled",ConfigHolder.getInstance().getBoolean("isLabeled"));
        boolean b =ConfigHolder.getInstance().getBoolean("searchForAlsoMonoLink");
        if(b){
            tf='T';
        }else{
            tf='F';
        }
        ConfigHolder_xilmass.getInstance().setProperty("searchForAlsoMonoLink",tf);
       // settingsFrm.chkInterLink.setSelected(ConfigHolder.getInstance().getBoolean("interlinkSearch"));
        b =ConfigHolder.getInstance().getBoolean("allowIntraPeptide");
        if(b){
            tf='T';
        }else{
            tf='F';
        }
       
        ConfigHolder_xilmass.getInstance().setProperty("allowIntraPeptide",tf);
        ConfigHolder_xilmass.getInstance().setProperty("isConsideredSideReactionSerine",ConfigHolder.getInstance().getBoolean("consider.sideReactionSerine"));
        ConfigHolder_xilmass.getInstance().setProperty("isConsideredSideReactionThreonine",ConfigHolder.getInstance().getBoolean("consider.sideReactionThreonine"));
        ConfigHolder_xilmass.getInstance().setProperty("isConsideredSideReactionTyrosine",ConfigHolder.getInstance().getBoolean("consider.sideReactionTyrosine"));
        ConfigHolder_xilmass.getInstance().setProperty("maxLenCombined",ConfigHolder.getInstance().getString("maxLen.allowed"));
        ConfigHolder_xilmass.getInstance().setProperty("minLen",ConfigHolder.getInstance().getString("minLen.allowed"));

        //Validation
        
        ConfigHolder_xilmass.getInstance().setProperty("fdr",ConfigHolder.getInstance().getString("fdr"));

        //Additional
        ConfigHolder_xilmass.getInstance().setProperty("fixedModification",ConfigHolder.getInstance().getString("fixed.modifications"));
        ConfigHolder_xilmass.getInstance().setProperty("variableModification",ConfigHolder.getInstance().getString("variable.modifications"));
        
    }
    
    public void setKojakParameters(){
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getInt("instrument"));
        ConfigHolder_kojak.getInstance().setProperty("MS1_resolution", ConfigHolder.getInstance().getInt("MS1.resolution"));
        ConfigHolder_kojak.getInstance().setProperty("MS2_resolution", ConfigHolder.getInstance().getInt("MS2.resolution"));
        ConfigHolder_kojak.getInstance().setProperty("MS1_centroid", ConfigHolder.getInstance().getBoolean("MS1.centroid"));
        ConfigHolder_kojak.getInstance().setProperty("MS2_centroid", ConfigHolder.getInstance().getBoolean("MS2.centroid"));
        int val = (int)(10*ConfigHolder.getInstance().getDouble("enrichment"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", val); 
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("enzyme"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("max.miscleavages"));

       //Score parameters    


        val=(int)(ConfigHolder.getInstance().getDouble("fragment.binoffset")*10);
        ConfigHolder_kojak.getInstance().setProperty("fragment_bin_offset", val);         
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("fragment.binsize"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("precursor.tolerance"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("fragment.tolerance"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("precursor.toleranceUnit"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("fragment.toleranceUnit"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("max.peptide.mass"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("min.peptide.mass"));
        ConfigHolder_kojak.getInstance().setProperty("ion_series_A", ConfigHolder.getInstance().getBoolean("fragment.ionA"));
        ConfigHolder_kojak.getInstance().setProperty("ion_series_B", ConfigHolder.getInstance().getBoolean("fragment.ionB"));
        ConfigHolder_kojak.getInstance().setProperty("ion_series_C", ConfigHolder.getInstance().getBoolean("fragment.ionC"));
        ConfigHolder_kojak.getInstance().setProperty("ion_series_X", ConfigHolder.getInstance().getBoolean("fragment.ionX"));
        ConfigHolder_kojak.getInstance().setProperty("ion_series_Y", ConfigHolder.getInstance().getBoolean("fragment.ionY"));
        ConfigHolder_kojak.getInstance().setProperty("ion_series_Z", ConfigHolder.getInstance().getBoolean("fragment.ionZ"));

       
        //Validation
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getBoolean("isPercolatorAsked"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("percolator.version"));
       

        //Additional
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getInt("isotope.error"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getBoolean("turbo.button"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("fixed.modifications"));
        ConfigHolder_kojak.getInstance().setProperty("instrument", ConfigHolder.getInstance().getString("variable.modifications"));
    }
    
}
