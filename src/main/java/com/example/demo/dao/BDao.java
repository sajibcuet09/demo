package com.example.demo.dao;

import com.example.demo.domain.B;

public interface BDao {

    B findById(Long id);

    B save(B b);
}
