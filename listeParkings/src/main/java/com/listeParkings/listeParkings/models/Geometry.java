package com.listeParkings.listeParkings.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Geometry {

    public String type;
    public ArrayList<Double> coordinates;

}
