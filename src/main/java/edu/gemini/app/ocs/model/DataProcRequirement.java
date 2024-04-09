package edu.gemini.app.ocs.model;

import java.io.Serializable;
import java.util.Objects;

public class DataProcRequirement implements Serializable {
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileQuality() {
        return fileQuality;
    }

    public void setFileQuality(String fileQuality) {
        this.fileQuality = fileQuality;
    }

    public String getColorType() {
        return colorType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public double getContrast() {
        return contrast;
    }

    public void setContrast(double contrast) {
        this.contrast = contrast;
    }

    public double getBrightness() {
        return brightness;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }

    public double getSaturation() {
        return saturation;
    }

    public void setSaturation(double saturation) {
        this.saturation = saturation;
    }

    public double getHighlights() {
        return highlights;
    }

    public void setHighlights(double highlights) {
        this.highlights = highlights;
    }

    public double getExposure() {
        return exposure;
    }

    public void setExposure(double exposure) {
        this.exposure = exposure;
    }

    public double getShadows() {
        return shadows;
    }

    public void setShadows(double shadows) {
        this.shadows = shadows;
    }

    public double getWhites() {
        return whites;
    }

    public void setWhites(double whites) {
        this.whites = whites;
    }

    public double getBlacks() {
        return blacks;
    }

    public void setBlacks(double blacks) {
        this.blacks = blacks;
    }

    public double getLuminance() {
        return luminance;
    }

    public void setLuminance(double luminance) {
        this.luminance = luminance;
    }

    public double getHue() {
        return hue;
    }

    public void setHue(double hue) {
        this.hue = hue;
    }

    private String fileType;
    private String fileQuality;
    private String colorType;
    private double contrast;
    private double brightness;
    private double saturation;
    private double highlights;
    private double exposure;
    private double shadows;
    private double whites;
    private double blacks;
    private double luminance;
    private double hue;

    public DataProcRequirement(){}
    public DataProcRequirement(String fileType,
                               String fileQuality,
                               String colorType,
                               double contrast,
                               double brightness,
                               double saturation,
                               double highlights,
                               double exposure,
                               double shadows,
                               double whites,
                               double blacks,
                               double luminance,
                               double hue){

        this.fileType = fileType;
        this.fileQuality = fileQuality;
        this.colorType = colorType;
        this.contrast = contrast;
        this.brightness = brightness;
        this.saturation = saturation;
        this.highlights = highlights;
        this.exposure = exposure;
        this.shadows = shadows;
        this.whites = whites;
        this.blacks = blacks;
        this.luminance = luminance;
        this.hue = hue;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileType, fileQuality, colorType, contrast, brightness, saturation, highlights, exposure, shadows, whites, blacks, luminance, hue);
    }

    @Override
    public String toString() {
        return "DataProcRequirement{" +
                "fileType='" + fileType + '\'' +
                ", fileQuality='" + fileQuality + '\'' +
                ", colorType='" + colorType + '\'' +
                ", contrast=" + contrast +
                ", brightness=" + brightness +
                ", saturation=" + saturation +
                ", highlights=" + highlights +
                ", exposure=" + exposure +
                ", shadows=" + shadows +
                ", whites=" + whites +
                ", blacks=" + blacks +
                ", luminance=" + luminance +
                ", hue=" + hue +
                '}';
    }
}
