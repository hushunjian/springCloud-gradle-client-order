package com.hushunjian.springcloud.client.order.mapper;

import com.hushunjian.springcloud.client.order.domain.Order;
import com.hushunjian.springcloud.client.order.domain.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    long countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    @Delete({
        "delete from hsj_order",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    @Insert({
        "insert into hsj_order (id, order_name, ",
        "order_remark, receive_address, ",
        "user_id)",
        "values (#{id,jdbcType=VARCHAR}, #{orderName,jdbcType=VARCHAR}, ",
        "#{orderRemark,jdbcType=VARCHAR}, #{receiveAddress,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=VARCHAR})"
    })
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    @Select({
        "select",
        "id, order_name, order_remark, receive_address, user_id",
        "from hsj_order",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("com.hushunjian.springcloud.client.order.mapper.OrderMapper.BaseResultMap")
    Order selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hsj_order
     *
     * @mbg.generated Sat May 18 22:01:10 CST 2019
     */
    @Update({
        "update hsj_order",
        "set order_name = #{orderName,jdbcType=VARCHAR},",
          "order_remark = #{orderRemark,jdbcType=VARCHAR},",
          "receive_address = #{receiveAddress,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Order record);
}