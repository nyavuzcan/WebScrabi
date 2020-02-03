/*
package com.openhere;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class htmlCrawler {
  public htmlCrawler() throws IOException {
    File file = new File("src/main/java/com/openhere/raw.html");

    Document doc = Jsoup.parse(file,"utf-8");

    //Adding a <meta> tah to <head>

    Element tagMetaCharset = new Element(Tag.valueOf("meta"),"");
    tagMetaCharset.attr("charset","utf8");
    doc.head().appendChild(tagMetaCharset);
    //Add a <p> tag for body content description
    Element tagPDescription  = new Element(Tag.valueOf("p"),"");
    tagPDescription.text("It is va very powerful Html Parser");
    doc.body().appendChild(tagPDescription);
    //add a <p> tag for body content authpr.
    tagPDescription.before("<p>Author:M NEVZAT YAVUZCAN</p>");
    //add an attribute to the <p> tag of the author

    Element tagPAuthor = doc.body().select("p:contains(Author)").first();
    tagPAuthor.attr("align","center");
    //Add a class for the <body> tagg
    doc.body().addClass("content");

    System.out.println("Transferring...");

    FileWriter writer = new FileWriter("updated.html");
    writer.write(doc.toString());
    writer.close();

  }
}
*/
