package com.url.demo.Service;

import com.url.demo.Model.Url;
import com.url.demo.Repository.UrlRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlService {
    UrlRepo urlRepo;

    public UrlService (UrlRepo urlRepo) {
        this.urlRepo = urlRepo;
    }

    public void updateLink(Url url){
        urlRepo.save(url);
    }
    public boolean isIdUsed (String id) {
        return urlRepo.findById(id).isPresent();
    }
    public void increaseHitCount (String alias) {
        urlRepo.findByInputAlias(alias).setHitCount(urlRepo.findByInputAlias(alias).getHitCount()+1);
    }
    public Url findUrlByInputAlias (String alias) {
        return urlRepo.findByInputAlias(alias);
    }
    public List<Url> listAll () {
        return urlRepo.findAll();
    }
    public void deleteUrl (String alias){
        urlRepo.deleteByInputAlias(alias);
    }
}
