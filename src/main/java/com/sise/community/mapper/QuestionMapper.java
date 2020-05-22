package com.sise.community.mapper;

import com.sise.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title,description,creator,tag) value (#{title},#{description},#{creator},#{tag})")
    void create(Question question);
}
