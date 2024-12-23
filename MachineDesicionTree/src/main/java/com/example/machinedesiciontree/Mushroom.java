package com.example.machinedesiciontree;

public class Mushroom {
    private String edible;
    private String capShape;
    private String capSurface;
    private String capColor;
    private String bruises;
    private String odor;
    private String gillAttachment;
    private String gillSpacing;
    private String gillSize;
    private String gillColor;
    private String stalkShape;
    private String stalkRoot;
    private String stalkSurfaceAboveRing;
    private String stalkSurfaceUnderRing;
    private String stalkColorAboveRing;
    private String stalkColorBelowRing;
    private String veilType;
    private String veilColor;
    private String ringNumber;
    private String ringType;
    private String sporePrintColor;
    private String population;
    private String habitat;

    // Constructor
    public Mushroom(String edible, String capShape, String capSurface, String capColor, String bruises, String odor,
                    String gillAttachment, String gillSpacing, String gillSize, String gillColor, String stalkShape,
                    String stalkRoot, String stalkSurfaceAboveRing, String stalkSurfaceUnderRing,
                    String stalkColorAboveRing, String stalkColorBelowRing, String veilType, String veilColor,
                    String ringNumber, String ringType, String sporePrintColor, String population, String habitat) {
        this.edible = edible;
        this.capShape = capShape;
        this.capSurface = capSurface;
        this.capColor = capColor;
        this.bruises = bruises;
        this.odor = odor;
        this.gillAttachment = gillAttachment;
        this.gillSpacing = gillSpacing;
        this.gillSize = gillSize;
        this.gillColor = gillColor;
        this.stalkShape = stalkShape;
        this.stalkRoot = stalkRoot;
        this.stalkSurfaceAboveRing = stalkSurfaceAboveRing;
        this.stalkSurfaceUnderRing = stalkSurfaceUnderRing;
        this.stalkColorAboveRing = stalkColorAboveRing;
        this.stalkColorBelowRing = stalkColorBelowRing;
        this.veilType = veilType;
        this.veilColor = veilColor;
        this.ringNumber = ringNumber;
        this.ringType = ringType;
        this.sporePrintColor = sporePrintColor;
        this.population = population;
        this.habitat = habitat;
    }

    // Getters and Setters
    public String getEdible() {
        return edible;
    }

    public void setEdible(String edible) {
        this.edible = edible;
    }

    public String getCapShape() {
        return capShape;
    }

    public void setCapShape(String capShape) {
        this.capShape = capShape;
    }

    public String getCapSurface() {
        return capSurface;
    }

    public void setCapSurface(String capSurface) {
        this.capSurface = capSurface;
    }

    public String getCapColor() {
        return capColor;
    }

    public void setCapColor(String capColor) {
        this.capColor = capColor;
    }

    public String getBruises() {
        return bruises;
    }

    public void setBruises(String bruises) {
        this.bruises = bruises;
    }

    public String getOdor() {
        return odor;
    }

    public void setOdor(String odor) {
        this.odor = odor;
    }

    public String getGillAttachment() {
        return gillAttachment;
    }

    public void setGillAttachment(String gillAttachment) {
        this.gillAttachment = gillAttachment;
    }

    public String getGillSpacing() {
        return gillSpacing;
    }

    public void setGillSpacing(String gillSpacing) {
        this.gillSpacing = gillSpacing;
    }

    public String getGillSize() {
        return gillSize;
    }

    public void setGillSize(String gillSize) {
        this.gillSize = gillSize;
    }

    public String getGillColor() {
        return gillColor;
    }

    public void setGillColor(String gillColor) {
        this.gillColor = gillColor;
    }

    public String getStalkShape() {
        return stalkShape;
    }

    public void setStalkShape(String stalkShape) {
        this.stalkShape = stalkShape;
    }

    public String getStalkRoot() {
        return stalkRoot;
    }

    public void setStalkRoot(String stalkRoot) {
        this.stalkRoot = stalkRoot;
    }

    public String getStalkSurfaceAboveRing() {
        return stalkSurfaceAboveRing;
    }

    public void setStalkSurfaceAboveRing(String stalkSurfaceAboveRing) {
        this.stalkSurfaceAboveRing = stalkSurfaceAboveRing;
    }

    public String getStalkSurfaceUnderRing() {
        return stalkSurfaceUnderRing;
    }

    public void setStalkSurfaceUnderRing(String stalkSurfaceUnderRing) {
        this.stalkSurfaceUnderRing = stalkSurfaceUnderRing;
    }

    public String getStalkColorAboveRing() {
        return stalkColorAboveRing;
    }

    public void setStalkColorAboveRing(String stalkColorAboveRing) {
        this.stalkColorAboveRing = stalkColorAboveRing;
    }

    public String getStalkColorBelowRing() {
        return stalkColorBelowRing;
    }

    public void setStalkColorBelowRing(String stalkColorBelowRing) {
        this.stalkColorBelowRing = stalkColorBelowRing;
    }

    public String getVeilType() {
        return veilType;
    }

    public void setVeilType(String veilType) {
        this.veilType = veilType;
    }

    public String getVeilColor() {
        return veilColor;
    }

    public void setVeilColor(String veilColor) {
        this.veilColor = veilColor;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public void setRingNumber(String ringNumber) {
        this.ringNumber = ringNumber;
    }

    public String getRingType() {
        return ringType;
    }

    public void setRingType(String ringType) {
        this.ringType = ringType;
    }

    public String getSporePrintColor() {
        return sporePrintColor;
    }

    public void setSporePrintColor(String sporePrintColor) {
        this.sporePrintColor = sporePrintColor;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Mushroom{" +
                "edible='" + edible + '\'' +
                ", capShape='" + capShape + '\'' +
                ", capSurface='" + capSurface + '\'' +
                ", capColor='" + capColor + '\'' +
                ", bruises='" + bruises + '\'' +
                ", odor='" + odor + '\'' +
                ", gillAttachment='" + gillAttachment + '\'' +
                ", gillSpacing='" + gillSpacing + '\'' +
                ", gillSize='" + gillSize + '\'' +
                ", gillColor='" + gillColor + '\'' +
                ", stalkShape='" + stalkShape + '\'' +
                ", stalkRoot='" + stalkRoot + '\'' +
                ", stalkSurfaceAboveRing='" + stalkSurfaceAboveRing + '\'' +
                ", stalkSurfaceUnderRing='" + stalkSurfaceUnderRing + '\'' +
                ", stalkColorAboveRing='" + stalkColorAboveRing + '\'' +
                ", stalkColorBelowRing='" + stalkColorBelowRing + '\'' +
                ", veilType='" + veilType + '\'' +
                ", veilColor='" + veilColor + '\'' +
                ", ringNumber='" + ringNumber + '\'' +
                ", ringType='" + ringType + '\'' +
                ", sporePrintColor='" + sporePrintColor + '\'' +
                ", population='" + population + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
