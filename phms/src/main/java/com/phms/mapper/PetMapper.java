package com.phms.mapper;

import com.phms.pojo.Pet;
import com.phms.pojo.PetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    long countByExample(PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int deleteByExample(PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int insert(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int insertSelective(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    List<Pet> selectByExample(PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    Pet selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByExampleSelective(@Param("record") Pet record, @Param("example") PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByExample(@Param("record") Pet record, @Param("example") PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByPrimaryKeySelective(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByPrimaryKey(Pet record);

    List<Pet> getAllByLimit(Pet po);

    int countAllByLimit(Pet po);
}