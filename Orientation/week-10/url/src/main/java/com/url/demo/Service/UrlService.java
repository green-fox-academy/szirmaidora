package com.url.demo.Service;

import com.url.demo.Model.Url;
import com.url.demo.Repository.UrlRepo;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    UrlRepo urlRepo;
    public UrlService (UrlRepo urlRepo) {
        this.urlRepo = urlRepo;
    }
    public void newLink (String url, String urlAlias){
        urlRepo.save(new Url(url, urlAlias));
    }
}
