/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compomics.searchgui_xl.model;

/**
 *
 * @author Genet
 */
public class XilmassSpecific_settings {

    private String cxDBName = "C:/path-to-crosslinked-search-database-and-name";//contaminat db
    /*usage of a heavy labeled cross-linker; F: usage of a light labeled cross-linker; B: both usage of heavy and light labeled cross-linker*/
    private char isLabeled = 'F';
    private char isConsideredSideReactionSerine = 'F';//F not consider, T cosider
    private char isConsideredSideReactionThreonine = 'F';
    private char isConsideredSideReactionTyrosine = 'F';
    //intra (within same protein), inter (between different proteins), both (inter+intra protein cross-linking)
    private String crossLinkedProteinTypes = "Both";
    private char searchForAlsoMonoLink = 'T';

    private int minPepLen = 4;
    // Maximum total length allowed for a cross-linked peptide (
    private int maxPepLenCombined = 70;
    //This option enables (T) or disables (F) generation of the linkage of a peptide links to itself
    private char allowIntraPeptide = 'T';
    private int consider_neutrallosses = 1;//checkbox
    private String fragMode = "HCD";
    private int peptide_tol_total = 4;
    //The first opened-peptide_tol window in either PPM or Da 
    private double peptide_tol1 = 10.00;
    private double peptide_tol1_base = 0.00000;
    private double peptide_tol2 = 10.00;
    private double peptide_tol2_base = 1.00335;
    private double peptide_tol3 = 10.00;
    private double peptide_tol3_base = 2.00670;
    private double peptide_tol4 = 10.00;
    private double peptide_tol4_base = 3.0105;
    private double peptide_tol5 = 10.00;
    private double peptide_tol5_base = 4.0134;
    private double msms_tol = 0.03;
    private int minRequiredPeaks = 0;

    private int massWindow = 200;
    private int minimumFiltedPeaksNumberForEachWindow = 1;
    private int maximumFiltedPeaksNumberForEachWindow = 10;
    private int minPrecMassIsotopicPeakSelected = 1800;
    private double deisotopePrecision = 0.001;
    private double deconvulatePrecision = 0.003;
    private char isPercolatorAsked = 'F';
    private char isImprovedFDR = 'T';
    private double fdrInterPro = 0.05;
    private double fdrIntraPro = 0.05;
    private double fdr = 0.05;

    public String getContaminantDB_path() {
        return this.cxDBName;
    }

    public void setContaminantDB_path(String path) {
        this.cxDBName = path;
    }
    
    public char getIsSerineConsidered() {
        return this.isConsideredSideReactionSerine;
    }

    public void setIsSerineConsidered(char T_F) {
        this.isConsideredSideReactionSerine = T_F;
    }
    
    public char getIsThreonineConsidered() {
        return this.isConsideredSideReactionThreonine;
    }

    public void setIsThreonineConsidered(char T_F) {
        this.isConsideredSideReactionThreonine = T_F;
    }
    public char getIsTyrosineConsidered() {
        return this.isConsideredSideReactionTyrosine;
    }

    public void setIsTyrosineConsidered(char T_F) {
        this.isConsideredSideReactionTyrosine = T_F;
    }
    
    public char getSearchMonolink() {
        return this.searchForAlsoMonoLink;
    }

    public void setSearchMonolink(char T_F) {
        this.searchForAlsoMonoLink = T_F;
     
    }
    
    public String getCrosslinkType() {
        return this.crossLinkedProteinTypes;
        
    }
    public void setCrosslinkType(String type){
        this.crossLinkedProteinTypes=type;
        if("Both".equals(type)){
            this.allowIntraPeptide='T';
        }else{
            this.allowIntraPeptide='F';
        }
    }
    
    public char getAllowIntraPeptide(){
        return this.allowIntraPeptide;
    }

    public void setIslabeled(char T_F) {
        this.isLabeled = T_F;
     
    }
    
    public char getIslabeled() {
        return this.isLabeled;
    }
    
    

    public void setMinPepLen(int minLen) {
        this.minPepLen = minLen;
     
    }
    
    public int getMinPepLen() {
        return this.minPepLen;
    }

    public void setMaxPepLen(int maxLen) {
        this.maxPepLenCombined = maxLen;
     
    }
    public int getMaxPepLen() {
        return this.maxPepLenCombined;
    }
    
   public void setNeitralLoss(int neutralLoss) {
        this.consider_neutrallosses = neutralLoss;
     
    }
    public int getNeitralLoss() {
        return this.consider_neutrallosses;
    }
    
     public void setFragmentMethod(String fragMode) {
        this.fragMode = fragMode;
     
    }
    public String getFragmentMethod() {
        return this.fragMode;
    }
    
    public int getpepTolTotal() {
        return this.peptide_tol_total;
    }

    public void setpepTolTotal(int pepTolTotal) {
        this.peptide_tol_total = pepTolTotal;
    }
    
    public double getPepMassTol_1() {
        return this.peptide_tol1;
    }
    public double getPepMassTol_2() {
        return this.peptide_tol2;
    }
    public double getPepMassTol_3() {
        return this.peptide_tol3;
    }
    public double getPepMassTol_4() {
        return this.peptide_tol4;
    }
    public double getPepMassTol_5() {
        return this.peptide_tol5;
    }
    
    public void setPepMassTol_1(double mass) {
        this.peptide_tol1=mass;
    }
    public void setPepMassTol_2(double mass) {
        this.peptide_tol2=mass;
    }
    public void setPepMassTol_3(double mass) {
        this.peptide_tol3=mass;
    }
    public void setPepMassTol_4(double mass) {
        this.peptide_tol4=mass;
    }
    public void setPepMassTol_5(double mass) {
        this.peptide_tol5=mass;
    }
    
    //pepMasstol bases
    public double getPepMassTol_1base() {
        return this.peptide_tol1_base;
    }
    public double getPepMassTol_2base() {
        return this.peptide_tol2_base;
    }
    public double getPepMassTol_3base() {
        return this.peptide_tol3_base;
    }
    public double getPepMassTol_4base() {
        return this.peptide_tol4_base;
    }
    public double getPepMassTol_5base() {
        return this.peptide_tol5_base;
    }
    
    public void setPepMassTol_1base(double base) {
        this.peptide_tol1_base=base;
    }
    public void setPepMassTol_2base(double base) {
        this.peptide_tol2_base=base;
    }
    public void setPepMassTol_3base(double base) {
        this.peptide_tol3_base=base;
    }
    public void setPepMassTol_4base(double base) {
        this.peptide_tol4_base=base;
    }
    public void setPepMassTol_5base(double base) {
        this.peptide_tol5_base=base;
    }

      
    public int getMassWindow() {
        return this.massWindow;
    }
    
    public void setMassWindow(int massWindow) {
        this.massWindow=massWindow;
    }
    
    public int getMinFilteredPeaks() {
        return this.minimumFiltedPeaksNumberForEachWindow;
    }
    
    public void setMinFilteredPeaks(int minFilteredPeaks) {
        this.minimumFiltedPeaksNumberForEachWindow=minFilteredPeaks;
    }
    
    public int getMaxFilteredPeaks() {
        return this.maximumFiltedPeaksNumberForEachWindow;
    }
    
    public void setMaxFilteredPeaks(int maxFilteredPeaks) {
        this.maximumFiltedPeaksNumberForEachWindow=maxFilteredPeaks;
    }
    
     public int getMinPCM_isotopicPeakselected() {
        return this.minPrecMassIsotopicPeakSelected;
    }
    
    public void setMinPCM_isotopicPeakselected(int minIsotopicPeaks) {
        this.minPrecMassIsotopicPeakSelected=minIsotopicPeaks;
    }
    
    public double getDe_isotopicPrecision() {
        return this.deisotopePrecision;
    }
    
    public void getDe_isotopicPrecision(double isotopicPrecision) {
        this.deisotopePrecision=isotopicPrecision;
    }
   
       
    public double getDeconvolutionPrecision() {
        return this.deconvulatePrecision;
    }
    
    public void setDeconvolutionPrecision(double deconvolutionPrecision) {
        this.deconvulatePrecision=deconvolutionPrecision;
    }
    
    
    
    //Validation parameters
    public char getIsPercolatorActive() {
        return this.isPercolatorAsked;
    }
    
    public void setIsPercolatorActive(char percolator) {
        this.isPercolatorAsked=percolator;
    }
    
     public char getIsImprovedFDR() {
        return this.isImprovedFDR;
    }
    
    public void setIsImprovedFDR(char improvedFDR) {
        this.isImprovedFDR=improvedFDR;
    }
     
    public double getInterproteinFDR() {
        return this.fdrInterPro;
    }
    
    public void setInterproteinFDR(double fdrInter) {
        this.fdrInterPro=fdrInter;
    }
    
    public double getIntraproteinFDR() {
        return this.fdrIntraPro;
    }
    
    public void setIntraproteinFDR(double fdrIntra) {
        this.fdrIntraPro=fdrIntra;
    }
    
    public double getFDR() {
        return this.fdr;
    }
    
    public void setFDR(double fdr) {
        this.fdr=fdr;
    }
}
