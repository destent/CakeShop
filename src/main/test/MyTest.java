import com.connectyu.test.dao.GoodsDao;
import com.connectyu.test.dao.OrderDao;
import com.connectyu.test.model.Order;
import org.junit.Test;

import java.util.Date;

public class MyTest {
    @Test
    public void addOrder(){
        OrderDao dao = new OrderDao();
        Order order = new Order();
        order.setAddress("xxxx");
        order.setUserId(1);
        order.setTotal(300.0);
        order.setAmount(2);
        order.setStatus(1);
        order.setName("admin");
        order.setDatetime(new Date());
        order.setPhone("12323134");
        order.setPaytype(1);
        order.setId(1);
        dao.insert(order);
    }
    @Test
    public void find(){
        GoodsDao goodsDao = new GoodsDao();
        System.out.println(goodsDao.findGoodsCount());
    }
}
