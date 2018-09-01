import com.crazyelemon.dao.ShoesDAO;
import com.crazyelemon.util.MyBatisUtil;
import org.junit.Test;

public class TestShoesDao {
    @Test
    public void testQueryAll(){
        MyBatisUtil.getSession().getMapper(ShoesDAO.class).queryAll().forEach(System.out::println);
    }

    @Test
    public void testQueryByName(){
        MyBatisUtil.getSession().getMapper(ShoesDAO.class).queryByName("shoes3").forEach(System.out::println);
    }

    @Test
    public void testQueryByGender(){
        MyBatisUtil.getSession().getMapper(ShoesDAO.class).queryByGender(1).forEach(System.out::println);
    }

    @Test
    public void testQueryBySize(){
        MyBatisUtil.getSession().getMapper(ShoesDAO.class).queryBySize(44f).forEach(System.out::println);
    }
    @Test
    public void testQueryByPrice(){
        MyBatisUtil.getSession().getMapper(ShoesDAO.class).queryByPrice(300f,600f).forEach(System.out::println);
    }
    @Test
    public void testQueryByCategory(){
        MyBatisUtil.getSession().getMapper(ShoesDAO.class).queryByCategory(2).forEach(System.out::println);
    }

}
