package xinfan.example.splitdb.shardingjdbc.demo.shardingtable;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xinfan.example.splitdb.shardingjdbc.demo.shardingtable.mapper.OrdersMapper;
import xinfan.example.splitdb.shardingjdbc.demo.shardingtable.model.Orders;

@SpringBootTest
public class ShardingsphereDemoApplicationTests {
    @Autowired
    private OrdersMapper ordersMapper;
    @Test
    public void addOrders(){
        for (int i = 1; i <=10 ; i++) {
            Orders orders = new Orders();
            orders.setId(i);
            orders.setCustomerId(i);
            orders.setOrderType(i);
            orders.setAmount(1000.0*i);
            ordersMapper.insert(orders);
        }
    }
    @Test
    public void queryOrders(){
        Orders orders = ordersMapper.selectOne(1);
        System.out.println(orders);
    }
}
