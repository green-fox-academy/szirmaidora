package com.url.demo.Controller;

import com.url.demo.Model.SecretCodeObject;
import com.url.demo.Model.Url;
import com.url.demo.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UrlRestController {

    @Autowired
    UrlService urlService;

    @GetMapping("/api/link")
    public List<Url> showUrls(){
        return urlService.listAll();
    }
    @DeleteMapping("/api/link/{id}")
    public ResponseEntity delete (@PathVariable String id, @RequestBody SecretCodeObject secret) {
        Url urlToFind = urlService.findUrlByInputAlias(id);
        if (urlToFind == null) {
            return ResponseEntity.notFound().build();
        } else if (urlToFind.getSecretCode().equals(secret.getSecretcode())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        } else {urlService.deleteUrl(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}
