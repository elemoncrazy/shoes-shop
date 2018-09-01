import com.crazyelemon.dao.CategoryDAO;
import com.crazyelemon.util.MyBatisUtil;
import org.junit.Test;

public class TestCategory {
    @Test
    public void testQuaryAll(){
        MyBatisUtil.getSession().getMapper(CategoryDAO.class).queryAll().forEach(System.out::println);
    }
}
