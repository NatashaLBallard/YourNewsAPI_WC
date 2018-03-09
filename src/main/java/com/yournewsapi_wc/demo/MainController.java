package com.yournewsapi_wc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
public class MainController {


    @RequestMapping("/")
    public @ResponseBody
    String showIndex() {


//        //DISPLAYS FOR TOPNEWS
        RestTemplate restTemplate = new RestTemplate();
        TopNews topNews = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0", TopNews.class);

        System.out.println(topNews.getArticles());
        return topNews.toString();


    }
}
