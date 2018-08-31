import com.crazyelemon.dao.CartDAO;
import com.crazyelemon.util.MyBatisUtil;
import org.junit.Test;

public class TestCartDao {
    CartDAO cartDAO = MyBatisUtil.getSession().getMapper(CartDAO.class);
    @Test
    public void testSelectByPrimaryKey(){
       System.out.println(cartDAO.selectByPrimaryKey(2));
       MyBatisUtil.closeSession();
    }
}
