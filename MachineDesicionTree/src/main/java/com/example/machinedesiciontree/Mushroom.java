package com.example.machinedesiciontree;

import java.util.ArrayList;
import java.util.List;

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

