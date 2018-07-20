package com.example.demo.dao;

import com.example.demo.domain.A;

public interface ADao {

    A findById(Long id);

    A save(A a);
}
