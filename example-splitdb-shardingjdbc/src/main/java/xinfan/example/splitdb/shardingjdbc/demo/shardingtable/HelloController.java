package xinfan.example.splitdb.shardingjdbc.demo.shardingtable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xinfan.example.splitdb.shardingjdbc.demo.shardingtable.mapper.OrdersMapper;
import xinfan.example.splitdb.shardingjdbc.demo.shardingtable.model.Orders;

@RestController
public class HelloController {
    @Autowired
    private OrdersMapper ordersMapper;
    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot,Index!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "Spring Boot Test Demo!";
    }

    @RequestMapping("/insert")
    public String insert() {
        for (int i = 1; i <=10 ; i++) {
            Orders orders = new Orders();
            orders.setId(i);
            orders.setCustomerId(i);
            orders.setOrderType(i);
            orders.setAmount(1000.0*i);
            ordersMapper.insert(orders);
        }
        return "insert success";
    }
}
