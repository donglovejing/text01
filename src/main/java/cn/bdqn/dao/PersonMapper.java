package cn.bdqn.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import cn.bdqn.pojo.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    List<Person> findByName(@Param("name")String name);


}