package com.yournewsapi_wc.demo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TopNews {

    private String status;

    private int totalResults;

    private ArrayList<Articles> topNewsArticles;



    public TopNews() {
        this.topNewsArticles = new ArrayList<>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    @Override
    public String toString() {
        return "TopNews{" +
                "status='" + status + '\'' +
                ", totalResults=" + totalResults +
                ", topNewsArticles=" + topNewsArticles +
                '}';
    }

    public ArrayList<Articles> getTopNewsArticles() {
        return topNewsArticles;
    }

    public void setTopNewsArticles(ArrayList<Articles> topNewsArticles) {
        this.topNewsArticles = topNewsArticles;
    }

//    public ArrayList<Articles> getTopNewsArticles() {
//        return topNewsArticles;
//    }
//
//    public void setTopNewsArticles(ArrayList<Articles> topNewsArticles) {
//        this.topNewsArticles = topNewsArticles;
//    }
}
