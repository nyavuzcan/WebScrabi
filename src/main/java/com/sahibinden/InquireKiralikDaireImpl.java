package com.sahibinden;

import com.sahibindenService.InquireKiralikDaire;
import com.sahibindenService.Pagination;
import com.sahibindenService.SahibindenOperators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

public class InquireKiralikDaireImpl implements InquireKiralikDaire {

  final static private String baseUrl="https://www.sahibinden.com/satilik-daire";
  private String totalPage;
  Pagination pagination = new SatilikDairePagination();
  SahibindenOperators sahibindenOperators = new SahibindenOperatorsImp();

@Override
public void inquireDaireler() throws Exception {
  this.totalPage= pagination.getLastPage(baseUrl);
  final ArrayList<SatilikDaire> satilikDaires = sahibindenOperators.inquireSatilikDaire(baseUrl,this.totalPage);

  for (SatilikDaire satilikDaire : satilikDaires){

    System.out.println(satilikDaire.getIlanBaslik());
  }


}


}
