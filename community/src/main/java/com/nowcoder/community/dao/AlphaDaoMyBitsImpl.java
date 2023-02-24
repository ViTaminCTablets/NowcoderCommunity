package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class AlphaDaoMyBitsImpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
