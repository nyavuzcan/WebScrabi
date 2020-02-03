package com.sahibinden;

import com.sahibindenService.Pagination;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SatilikDairePagination implements Pagination  {

  @Override
  public String getLastPage(String baseUrl) throws IOException  {
    Document doc = Jsoup.connect(baseUrl).get();
    Elements titleElements = doc.select("ul.pageNaviButtons > li");

    int temp = titleElements.last().elementSiblingIndex();
    Element element =  titleElements.get(temp-1);

    return element.text();
  }
}
