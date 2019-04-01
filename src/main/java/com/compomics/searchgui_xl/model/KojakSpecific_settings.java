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
public class KojakSpecific_settings {
    
    private double enrichment=0; //JSlider 0-1
   
    private int instrument= 0; // JCombobox Orbitrap, FTICR
    private int MS1_centroid=1;//JCheckbos
    private int MS2_centroid=1;
    private long MS1_resolution=1000; //jtext
    private long MS2_resolution=1000; //jtext
    private String monolink;// dropdownbox
    private double fragment_bin_offset=0.4;//JSlider 0-1
    private double fragment_bin_size=1.00002; // in Thomson
    private  int ion_series_A=0;
    private  int ion_series_B=1;
    private  int ion_series_C=0;
    private  int ion_series_X=0;
    private  int ion_series_Y=1;
    private  int ion_series_Z=0;
    private String decoy_filter="DECOY";
    int isotop_error=1;
    private double max_spectrum_peaks = 0;//top N peaks to use during analysis. 0 uses all peaks.
    
   /**
    * prefer precursor mono mass predicted by  instrument software. 
     0 = ignore previous predictions
     1 = use only previous predictions
     2 = supplement predictions with additional analysis
    */
    private int prefer_precursor_pred   =   2;
    private int spectrum_processing  = 0;//checkbox       #0=no, 1=yes
    
    /**
     * number of top scoring single peptides to combine 
       in relaxed analysis
     */
    private int top_count = 300;   
    private int truncate_prot_names =0; //Max protein name character to export, 0=off
    
    /**
     * Generally speeds up analysis. Special cases cause reverse
       effect, thus this is allowed to be disabled. 0=off
     */
    private int turbo_button = 1;
    
    
    
    
    //Getters and setters
    
     public double getEnrichment() {
        return enrichment;
    }

    public void setEnrichment(double enrichment) {
        this.enrichment = enrichment;
    }

    public int getMS2_centroid() {
        return MS2_centroid;
    }

    public void setMS2_centroid(int MS2_centroid) {
        this.MS2_centroid = MS2_centroid;
    }

    public double getFragment_bin_size() {
        return fragment_bin_size;
    }

    public void setFragment_bin_size(double fragment_bin_size) {
        this.fragment_bin_size = fragment_bin_size;
    }

    public int getIon_series_X() {
        return ion_series_X;
    }

    public void setIon_series_X(int ion_series_X) {
        this.ion_series_X = ion_series_X;
    }

    public int getIon_series_Y() {
        return ion_series_Y;
    }

    public void setIon_series_Y(int ion_series_Y) {
        this.ion_series_Y = ion_series_Y;
    }

    public int getIsotop_error() {
        return isotop_error;
    }

    public void setIsotop_error(int isotop_error) {
        this.isotop_error = isotop_error;
    }

    public int getInstrument() {
        return instrument;
    }

    public void setInstrument(int instrument) {
        this.instrument = instrument;
    }

    public int getMS1_centroid() {
        return MS1_centroid;
    }

    public void setMS1_centroid(int MS1_centroid) {
        this.MS1_centroid = MS1_centroid;
    }

    public long getMS1_resolution() {
        return MS1_resolution;
    }

    public void setMS1_resolution(long MS1_resolution) {
        this.MS1_resolution = MS1_resolution;
    }

    public long getMS2_resolution() {
        return MS2_resolution;
    }

    public void setMS2_resolution(long MS2_resolution) {
        this.MS2_resolution = MS2_resolution;
    }

    public String getMonolink() {
        return monolink;
    }

    public void setMonolink(String monolink) {
        this.monolink = monolink;
    }

    public double getFragment_bin_offset() {
        return fragment_bin_offset;
    }

    public void setFragment_bin_offset(double fragment_bin_offset) {
        this.fragment_bin_offset = fragment_bin_offset;
    }

    public int getIon_series_A() {
        return ion_series_A;
    }

    public void setIon_series_A(int ion_series_A) {
        this.ion_series_A = ion_series_A;
    }

    public int getIon_series_B() {
        return ion_series_B;
    }

    public void setIon_series_B(int ion_series_B) {
        this.ion_series_B = ion_series_B;
    }

    public int getIon_series_C() {
        return ion_series_C;
    }

    public void setIon_series_C(int ion_series_C) {
        this.ion_series_C = ion_series_C;
    }

    public int getIon_series_Z() {
        return ion_series_Z;
    }

    public void setIon_series_Z(int ion_series_Z) {
        this.ion_series_Z = ion_series_Z;
    }

    public String getDecoy_filter() {
        return decoy_filter;
    }

    public void setDecoy_filter(String decoy_filter) {
        this.decoy_filter = decoy_filter;
    }

    public double getMax_spectrum_peaks() {
        return max_spectrum_peaks;
    }

    public void setMax_spectrum_peaks(double max_spectrum_peaks) {
        this.max_spectrum_peaks = max_spectrum_peaks;
    }

    public int getPrefer_precursor_pred() {
        return prefer_precursor_pred;
    }

    public void setPrefer_precursor_pred(int prefer_precursor_pred) {
        this.prefer_precursor_pred = prefer_precursor_pred;
    }

    public int getSpectrum_processing() {
        return spectrum_processing;
    }

    public void setSpectrum_processing(int spectrum_processing) {
        this.spectrum_processing = spectrum_processing;
    }

    public int getTop_count() {
        return top_count;
    }

    public void setTop_count(int top_count) {
        this.top_count = top_count;
    }

    public int getTruncate_prot_names() {
        return truncate_prot_names;
    }

    public void setTruncate_prot_names(int truncate_prot_names) {
        this.truncate_prot_names = truncate_prot_names;
    }

    public int getTurbo_button() {
        return turbo_button;
    }

    public void setTurbo_button(int turbo_button) {
        this.turbo_button = turbo_button;
    }
    
        
}
