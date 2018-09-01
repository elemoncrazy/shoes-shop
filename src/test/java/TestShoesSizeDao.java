import com.crazyelemon.dao.ShoesSizeDAO;
import com.crazyelemon.entity.ShoesSize;
import com.crazyelemon.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;
public class TestShoesSizeDao {
    @Test
    public void testQueryAllSizeByShoesId() {
       List<ShoesSize> list = MyBatisUtil.getSession().getMapper(ShoesSizeDAO.class).queryAllSizeByShoesId(2001);
       list.forEach(System.out::println);
    }


}
