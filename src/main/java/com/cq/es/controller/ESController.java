package com.cq.es.controller;

import com.cq.es.common.ResultInfo;
import com.cq.es.entity.FakerDataEntity;
import com.cq.es.repository.FakerDataRepository;
import com.cq.es.utils.ResultInfoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("es")
public class ESController {
    @Resource
    private HttpServletRequest request;
    @Resource
    private FakerDataRepository fakerDataRepository;

    @GetMapping("esSearch")
    public ResultInfo esSearch() {
        Iterable<FakerDataEntity> all = fakerDataRepository.findAll();
        return ResultInfoUtil.buildSuccess(request.getServletPath(), all);
    }
}
