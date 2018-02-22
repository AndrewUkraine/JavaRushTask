package com.javarush.task.task28.task2810.model;


import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.sun.org.apache.xml.internal.serialize.LineSeparator.Windows;
import static sun.net.www.protocol.http.HttpURLConnection.userAgent;

public class HHStrategy implements Strategy {



    private static final String URL_FORMAT = "http://hh.ua/search/vacancy?text=java+%s&page=%d";


    String s = String.format(URL_FORMAT, "Kiev", 0);

    @Override
    public List<Vacancy> getVacancies(String searchString) {

            String vacancyQuery = "[data-qa='vacancy-serp__vacancy']";
            String titleQuery = "[data-qa='vacancy-serp__vacancy-title']";
            String compensationQuery = "[data-qa='vacancy-serp__vacancy-compensation']";
            String addressQuery = "[data-qa='vacancy-serp__vacancy-address']";
            String employerQuery = "[data-qa='vacancy-serp__vacancy-employer']";
            List<Vacancy> list = new ArrayList<>();
            int i = 0;
            Vacancy vacancy = new Vacancy();
            try {
                while (true) {
                    Document document = getDocument(searchString, i);
                    Elements vacanciesElements = document.select(vacancyQuery);
                    if (!vacanciesElements.isEmpty()) {
                        for (Element element : vacanciesElements) {
                            vacancy.setTitle(element.select(titleQuery).text());
                            vacancy.setCity(element.select(addressQuery).text());
                            vacancy.setCompanyName(element.select(employerQuery).text());
                            vacancy.setUrl(element.select(titleQuery).attr("href"));
                            vacancy.setSiteName("https://hh.ua");
                            if (!element.select(compensationQuery).isEmpty()) {
                                vacancy.setSalary(element.select(compensationQuery).text());
                            } else {
                                vacancy.setSalary("");
                            }
                            list.add(vacancy);
                        }
                    } else {
                        break;
                    }
                    i++;
                }
            } catch (Exception error) {
                error.printStackTrace();
            }
            return list;
        }


    // http://hh.ua/search/vacancy?text=java+ADDITIONAL_VALUE&page=PAGE_VALUE

  //  String url = String.format(, URL_FORMAT, "Kiev", 0);

    protected  Document getDocument(String searchString, int page) throws IOException {
        String url = String.format( URL_FORMAT, searchString, page);
        Document doc = Jsoup.connect(url)
                .userAgent ("Mozilla/5.0 (Windows NT 10.0; …) Gecko/20100101 Firefox/57.0")
                .referrer ("https://hh.ua/")
                .get();
return doc;
    }


    }

//

