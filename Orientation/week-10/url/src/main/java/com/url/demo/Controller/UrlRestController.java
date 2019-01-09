package com.url.demo.Controller;

import com.url.demo.Model.SecretCodeObject;
import com.url.demo.Model.Url;
import com.url.demo.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UrlRestController {
UrlService urlService;
    @Autowired
    public UrlRestController (UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("/api/link")
    public List<Url> showUrls(){
        return urlService.listAll();
    }
   /* @GetMapping("/api/link/{id}")
    public ResponseEntity delete (@PathVariable String id, @RequestBody SecretCodeObject secret) {

    }*/
}
