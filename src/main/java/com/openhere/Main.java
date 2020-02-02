package com.openhere;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
  private static final String baseUrl = "https://www.sahibinden.com/satilik-daire";

  public static void main(String[] args) throws IOException {

   /* Document doc = Jsoup.connect(baseUrl).get();
    String title = doc.title();
    System.out.println(title);


    Elements links = doc.select("a[href]");
    for (Element link: links){
      System.out.println("\nlink"+link.attr("href"));
      System.out.println("text: "+link.text());
    }

    System.out.println("Getting All images");

    Elements imags = doc.getElementsByTag("img");

    for (Element src: imags){
      System.out.println("src"+ src.attr("abs:src"));
    }

    htmlCrawler htmlCrawler = new htmlCrawler();*/

 /*  System.setProperty("http.proxyhost","127.0.0.1");
   System.setProperty("http.proxyport","3128");
    String str = Jsoup.connect(baseUrl).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36")
        .ignoreContentType(true).timeout(10000)
        .get().text();
    System.out.println(str);

*/
  }
}
