package com.listeParkings.listeParkings.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class FacetGroup {

    public String name;
    public ArrayList<Facet> facets;
}
