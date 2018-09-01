import com.crazyelemon.dao.CartDAO;
import com.crazyelemon.entity.Cart;
import com.crazyelemon.entity.ShoesDetail;
import com.crazyelemon.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TestCartDao {
    SqlSession sqlSession = MyBatisUtil.getSession();
    CartDAO cartDAO = sqlSession.getMapper(CartDAO.class);
    @Test
    public void testSelectByPrimaryKey(){
        System.out.println(cartDAO.selectByPrimaryKey(2));
    }
    @Test
    public void testInsert(){
        Cart cart = new Cart(3,1001,3,"3",new Date(),new Date());
        int rows = cartDAO.insert(cart);
        sqlSession.commit();
        System.out.println("受影响行数:"+rows);
        MyBatisUtil.closeSession();
    }
    @Test
    public void testDeleteByShoesDetailId(){
        int rows = cartDAO.deleteByShoesDetailId(3);
        sqlSession.commit();
        System.out.println("受影响行数:"+rows);
        MyBatisUtil.closeSession();
    }
    @Test
    public void TestUpdateCount(){
        int rows = cartDAO.updateCount(2,1003,"5");
        sqlSession.commit();
        System.out.println("受影响行数:"+rows);
        MyBatisUtil.closeSession();
    }
    @Test
    public void TestQueryAll(){
        List<Cart> shoesDetailId= cartDAO.queryAll(1003);
        shoesDetailId.forEach(System.out::println);
        MyBatisUtil.closeSession();
    }
}
