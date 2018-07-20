package com.example.demo.dao;

import com.example.demo.domain.A;
import com.example.demo.repository.ARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class ADaoImpl implements ADao{

    @Autowired
    private ARepository aRepository;

    @Override
    public A findById(Long id) {
        return aRepository.findById(id).orElse(null);
    }

    @Override
    public A save(A a) {
        return aRepository.save(a);
    }
}
