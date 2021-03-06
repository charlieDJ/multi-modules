package com.multi.modules.dao;


import com.multi.modules.bean.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CustomerDao {

    @Select("select * from Customer where id = #{id}")
    Customer getCustomer(int id);
}
