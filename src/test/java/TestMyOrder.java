import com.crazyelemon.dao.MyorderDAO;
import com.crazyelemon.entity.Myorder;
import com.crazyelemon.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Wangzh
 * Date: 2018-08-31
 * Time: 18:45
 * Desc: 描述
 */
public class TestMyOrder {
    SqlSession sqlSession = MyBatisUtil.getSession();
    MyorderDAO myorderDAO = sqlSession.getMapper(MyorderDAO.class);
    @Test
    //测试sava方法----添加订单到数据库
    public void testSave(){
        Myorder myorder = new Myorder();
        myorder.setOrderId(4);
        myorder.setOrderNumber("Order1002");
        myorder.setCustId(1001);
        myorder.setOrderTime(new Date());
        myorder.setOrderPrice(130.0);
        myorder.setOrderAddressId(2);
        myorder.setOrderStatus(1);
        int rows = myorderDAO. save(myorder);
        sqlSession.commit();
        System.out.println("受影响的行数:"+rows);
        MyBatisUtil.closeSession();
    }

    @Test
    //测试\QueryAll方法----根据用户id查询该用户的所有订单
    public void testQueryAll(){
        List<Myorder> myorderList = myorderDAO.queryAll(1001);
        myorderList.forEach(System.out::println);
        MyBatisUtil.closeSession();

    }

    @Test
    //测试queryByShooesName方法----根据用户id查询该用户的所有订单
    public void testQueryByShooesName(){
        List<Myorder> myorders = myorderDAO.queryByShooesName("shoes2",1001);
        myorders.forEach(System.out::println);
        MyBatisUtil.closeSession();
    }

    @Test
    //测试queryByShooesName方法----根据用户id查询该用户的所有订单
    public void testQueryById(){
        List<Myorder> myorders = myorderDAO.queryById("Order",1001);
        MyBatisUtil.closeSession();
    }

    @Test
    public void testUpdateState(){
        int rows = myorderDAO.updateStatus(3,3);
        System.out.println(rows);
        sqlSession.commit();
        MyBatisUtil.closeSession();
    }
}
