package com.nowcoder.community.dao;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    int selectDiscussPostRows(@Param("userId") int userId);//别名(如果sql动态地拼接参数，且只有一个参数，则必须加别名）



}
