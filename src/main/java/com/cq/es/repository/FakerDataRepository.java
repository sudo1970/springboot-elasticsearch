package com.cq.es.repository;


import com.cq.es.entity.FakerDataEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface FakerDataRepository extends ElasticsearchRepository<FakerDataEntity, String> {
}
