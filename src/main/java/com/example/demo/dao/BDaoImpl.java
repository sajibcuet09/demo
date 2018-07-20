package com.example.demo.dao;

import com.example.demo.domain.B;
import com.example.demo.repository.BRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BDaoImpl implements BDao{

    @Autowired
    private BRepository bRepository;

    @Override
    public B findById(Long id) {
        return bRepository.findById(id).orElse(null);
    }

    @Override
    public B save(B b) {
        return bRepository.save(b);
    }
}
