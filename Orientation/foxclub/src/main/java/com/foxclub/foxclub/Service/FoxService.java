package com.foxclub.foxclub.Service;

import com.foxclub.foxclub.Model.Fox;
import com.foxclub.foxclub.Repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
    FoxRepository foxRepository;
    @Autowired
    public FoxService(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }
    public void saveFox (Fox fox) {
        foxRepository.save(fox);
    }
}
