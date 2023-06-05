package com.listeParkings.listeParkings.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Place {

    public int nhits;
    public Parameters parameters;
    public ArrayList<Record> records;
    public ArrayList<FacetGroup> facet_groups;
}
