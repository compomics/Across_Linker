package com.compomics.searchgui_xl.model;



/**
 *
 * @author Genet
 */
public class GeneralSettings {

    private String crossLinker;
    private String enzyme;

    private String[] vModification;
    private String[] FModification;

    private int maxMissedCleavage;
    private double precTolerance;
    private double fragmentTolerance;
    private int numberofThreads;
    private int maxModification = 2;
    private double maxPeptideMass = 5000.0;//max peptide mass allowed in Dalton (kojak)
    private double minPeptideMass = 300.0;//max peptide mass allowed in Dalton (kojak)

    public String getCrossLinker() {
        return this.crossLinker;
    }

    public void setCrossLinker(String crosslink) {
        this.crossLinker = crosslink;
    }

    public String getEnzyme() {
        return this.enzyme;
    }

    public void getEnzyme(String enzyme) {
        this.enzyme = enzyme;
    }

    public String[] getVariableModifications() {
        return this.vModification;
    }

    public void setVariableModifications(String[] vModification) {
        this.vModification = vModification;
    }
    
    public String[] getFixedModifications() {
        return this.FModification;
    }

    public void setFixedModifications(String[] fModification) {
        this.FModification = fModification;
    }

    public int getNumMissedCleavage() {
        return this.maxMissedCleavage;
    }

    public void setNumMissedCleavage(int missedCleavage) {
        this.maxMissedCleavage = missedCleavage;
    }

    public int getNumberofThreads() {
        return this.numberofThreads;
    }

    public void setNumberofThreads(int numThreads) {
        this.numberofThreads = numThreads;
    }
    
     public int getMaxModification() {
        return this.maxModification;
    }

    public void setMaxModification(int maxNumModifications) {
        this.maxModification = maxNumModifications;
    }
    
    
    public double getPrecTolerance() {
        return this.precTolerance;
    }

    public void setPrecursorTolerance(double precTolerance) {
        this.precTolerance = precTolerance;
    }

    public double getFragTolerance() {
        return this.fragmentTolerance;
    }

    public void setFragTolerance(double fragTolerance) {
        this.fragmentTolerance = fragTolerance;
    }

    public double getMaxPeptideMass() {
        return this.maxPeptideMass;
    }

    public void setMaxPeptideMass(double maxPepMass) {
        this.maxPeptideMass = maxPepMass;
    }

    public double getMinPeptideMass() {
        return this.minPeptideMass;
    }

    public void setMinPeptideMass(double minPepMass) {
        this.minPeptideMass = minPepMass;
    }
}
