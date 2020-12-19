package xinfan.example.splitdb.shardingjdbc.demo.shardingtable.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import xinfan.example.splitdb.shardingjdbc.demo.shardingtable.model.Orders;

@Repository
@Mapper
public interface OrdersMapper {

    @Insert("insert into orders(id,order_type,customer_id,amount) values(#{id},#{orderType},#{customerId},#{amount})")
    public void insert(Orders orders);

    @Select("select * from orders where id = #{id}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "orderType",column = "order_type"),
            @Result(property = "customerId",column = "customer_id"),
            @Result(property = "amount",column = "amount")
    })
    public Orders selectOne(Integer id);
}
