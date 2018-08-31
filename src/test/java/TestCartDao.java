import com.crazyelemon.dao.CartDAO;
import com.crazyelemon.util.MyBatisUtil;
import org.junit.Test;

public class TestCartDao {
    @Test
    public void testSelectByPrimaryKey(){
       CartDAO cartDAO = MyBatisUtil.getSession().getMapper(CartDAO.class);
        System.out.println(cartDAO.selectByPrimaryKey(2));
    }
}
