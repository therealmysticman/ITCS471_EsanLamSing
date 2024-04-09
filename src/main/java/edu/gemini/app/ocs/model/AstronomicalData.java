package edu.gemini.app.ocs.model;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class AstronomicalData {

    private ArrayList<BufferedImage> images;

    public AstronomicalData(){}
    public AstronomicalData(ArrayList<BufferedImage> images){
        this.images = images;
    }

    public AstronomicalData getAstronomicalData()
            throws IOException{
        return this;
    }

    public ArrayList<String> getAstronomicalDataLinks()
            throws IOException{
        return null;
    }

    public ArrayList<BufferedImage> getAllImages()
            throws IOException{
        return images;
    }

    public boolean removeAnAstronomicalData(int index){
        BufferedImage img = this.images.remove(index);
        return img != null;
    }


}
