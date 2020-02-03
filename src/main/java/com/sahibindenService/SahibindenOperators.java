package com.sahibindenService;

import com.sahibinden.SatilikDaire;

import java.io.IOException;
import java.util.ArrayList;

public interface SahibindenOperators {
  ArrayList<SatilikDaire> inquireSatilikDaire(String baseUrl, String totalPage) throws IOException;
}
