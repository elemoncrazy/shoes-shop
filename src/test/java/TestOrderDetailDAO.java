import com.crazyelemon.dao.OrderDetailDAO;
import com.crazyelemon.entity.OrderDetail;
import com.crazyelemon.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Wangzh
 * Date: 2018-08-31
 * Time: 20:22
 * Desc: 描述
 */
public class TestOrderDetailDAO {
    SqlSession sqlSession = MyBatisUtil.getSession();
    OrderDetailDAO orderDetailDAO = sqlSession.getMapper(OrderDetailDAO.class);
    @Test
    public void testSaveDetails(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(3);
        orderDetail.setShoesDetailId(2);
        orderDetail.setOrderShoesColor("blue");
        orderDetail.setOrderShoesSize("40");
        orderDetail.setQuality(1);

        int rows = orderDetailDAO.saveDetails(orderDetail);
        sqlSession.commit();
        System.out.println("受影响行数:" + rows);
        MyBatisUtil.closeSession();
    }
}
