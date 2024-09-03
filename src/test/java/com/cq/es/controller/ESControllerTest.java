package com.cq.es.controller;

import com.cq.es.entity.FakerDataEntity;
import com.cq.es.repository.FakerDataRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Iterator;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ESControllerTest {
    @Resource
    private FakerDataRepository fakerDataRepository;

    @Test
    public void testEs() {
        Iterable<FakerDataEntity> all = fakerDataRepository.findAll();
        Iterator<FakerDataEntity> iterator = all.iterator();
        System.out.println("========"+iterator.next()+"=========");
    }
}