package com.listeParkings.listeParkings.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class GeoShape {

    public ArrayList<Double> coordinates;
    public String type;
}
