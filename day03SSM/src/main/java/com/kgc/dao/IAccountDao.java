package com.kgc.dao;

import com.kgc.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {

    /**
     * 查询全部
     */
    @Select("select * from account")
    public List<Account> findAll();

    @Select("select * from account where id = #{id}")
    public Account findById(int id);

    //增
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void insert(Account account);

    //删
    @Delete("delete from account where id = #{id}")
    public void delete(int id);

    //改
    @Update("update account set name = #{name}, money = #{money}")
    public void update(Account account);
}
