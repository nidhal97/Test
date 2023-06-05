package com.listeParkings.listeParkings.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Parameters {

    public String dataset;
    public int rows;
    public int start;
    public ArrayList<String> facet;
    public String format;
    public String timezone;


}
