package com.listeParkings.listeParkings.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class Fields {

    public int nb_pmr;
    public int nb_voiture;
    public int nb_2_rm;
    public String tarif_4h;
    public String url;
    public String tarif_3h;
    public String f_2h15;
    public int hauteur_ma;
    public String num_siret;
    public String type_ouvra;
    public String tarif_2h;
    public String type_usage;
    public String abo_non_re;
    public String nom_du_par;
    public String tarif_1h;
    public String nom;
    public double xlong;
    public ArrayList<Double> geo_point_2d;
    public int nb_2r_el;
    public String info;
    public int nb_velo;
    public int nb_autopar;
    public GeoShape geo_shape;
    public double ylat;
    public String id;
    public int insee;
    public String adresse;
    public String tarif_24h;
    public String gml_id;
    public int gratuit;
    public int nb_places;
    public String abo_reside;
    public int nb_covoit;
    public String f_30_mn;


    public Date derniere_actualisation_bo;
    public double taux_doccupation;
    public int capacite;
    public int places;

}
