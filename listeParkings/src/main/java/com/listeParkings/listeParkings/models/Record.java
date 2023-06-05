package com.listeParkings.listeParkings.models;

import lombok.Data;

import java.util.Date;

@Data
public class Record {

    public String datasetid;
    public String recordid;
    public Fields fields;
    public Geometry geometry;
    public Date record_timestamp;

}
