package com.url.demo.Repository;

import com.url.demo.Model.Url;
import org.springframework.data.repository.CrudRepository;

public interface UrlRepo extends CrudRepository<Url, String> {
}
