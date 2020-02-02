package turkishsource;

import com.sahibinden.SatilikDaire;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class SahibindenGet {

  private static final String baseUrl = "https://www.sahibinden.com/satilik-daire";

  public static void main(String[] args) throws IOException {
    Document doc = Jsoup.connect(baseUrl).get();
    //tr içindeki td elemanlarının 1.elemanınını aldı > hem önünde hem arkasında 1 boşuk bulunmalı.
    Elements titleElements = doc.select("tbody.searchResultsRowClass > tr.searchResultsItem > td");

    final ArrayList<SatilikDaire> satilikDaires = new ArrayList<>();

      SatilikDaire satilikDaire = new SatilikDaire();

      for (Element element : titleElements) {

        if (!element.getElementsByClass("searchResultsTitleValue leafContent").isEmpty()) {

          satilikDaire.setIlanBaslik(element.text());
        }
        else if (!element.getElementsByClass("searchResultsAttributeValue").isEmpty()){
          if(Objects.isNull(satilikDaire.getIlanAlan())){
            satilikDaire.setIlanOdaSayisi(element.text());
          }
          satilikDaire.setIlanAlan(element.text());

        }
        else if (!element.getElementsByClass("searchResultsPriceValue").isEmpty()){
          satilikDaire.setIlanIlanFiyat(element.text());
        }
        else if (!element.getElementsByClass("searchResultsDateValue").isEmpty()){
          satilikDaire.setIlanTarihi(element.text());
        }
        else if (!element.getElementsByClass("searchResultsLocationValue").isEmpty()){
          satilikDaire.setIlanIlIlce(element.text());
          satilikDaires.add(satilikDaire);
          satilikDaire=new SatilikDaire();


        }



    }
    System.out.println(satilikDaires.size());

    for (SatilikDaire sa : satilikDaires){
      System.out.println("Baslik "+sa.getIlanBaslik()+" Alan: "+sa.getIlanAlan()+" Oda "+sa.getIlanOdaSayisi()+ " Fiyat :"+
          sa.getIlanIlanFiyat()+" Tarih :"+ sa.getIlanTarihi()+" İl İlçe :"+sa.getIlanIlIlce()+"\n");

    }
  }
}
