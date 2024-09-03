package com.cq.es.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * ES
 */
@Data
@Document(indexName = "assemble", type = "doc", useServerConfiguration = true, createIndex = false)
public class FakerDataEntity<T> implements Serializable {
    @Id
    private String id;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String name;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String cnname;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String x;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String y;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String location;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String cnlocation;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String area;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String telephone;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String email;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String website;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String cuisine;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String average_price;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String introduction;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String thumbnail;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String like_votes;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String dislike_votes;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String city_id;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String is_valid;
    @Field(type = FieldType.Date, format = DateFormat.custom,
            pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    private String create_date;
    @Field(type = FieldType.Date, format = DateFormat.custom,
            pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    private String update_date;
}