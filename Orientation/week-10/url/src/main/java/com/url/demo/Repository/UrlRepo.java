package com.url.demo.Repository;

import com.url.demo.Model.Url;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UrlRepo extends CrudRepository<Url, String>{
    Url findByInputAlias(String alias);
    List<Url> findAll ();
    void deleteByInputAlias (String alias);
}
