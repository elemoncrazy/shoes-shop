import com.crazyelemon.dao.ShoesColorDAO;
import com.crazyelemon.entity.ShoesColor;
import com.crazyelemon.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class TestShoesColorDao {
    @Test
    public void queryAllColorByShoesId(){
     List<ShoesColor> shoesColors =MyBatisUtil.getSession().getMapper(ShoesColorDAO.class).queryAllColorByShoesId(2001);
        for (ShoesColor s:shoesColors){
            System.out.println(s);
        }
    }
}
