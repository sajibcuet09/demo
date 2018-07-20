package com.example.demo;

import com.example.demo.dao.ADao;
import com.example.demo.dao.BDao;
import com.example.demo.domain.A;
import com.example.demo.domain.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class Starter implements ApplicationRunner{

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private ADao aDao;
    @Autowired
    private BDao bDao;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }

    private void insert(){
        B b = bDao.save(
                B.builder()
                        .build()
        );
        System.out.println(b.getId());
        A a = aDao.save(
                A.builder()
                        .b(b)
                        .build()
        );
        System.out.println(a.getId());
    }
}
