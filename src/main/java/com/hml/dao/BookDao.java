package com.hml.dao;

import com.hml.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加@Mapper
@Mapper
public interface BookDao {
    @Insert("insert into user (type,name,description) values(#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update user set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);

    @Delete("delete from user where id = #{id}")
    public int delete(Integer id);

    @Select("select * from user where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from user")
    public List<Book> getAll();
}
