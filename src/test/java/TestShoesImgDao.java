import com.crazyelemon.dao.ShoesImgDAO;


import com.crazyelemon.entity.ShoesImg;
import com.crazyelemon.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class TestShoesImgDao {
    @Test
    public void queryAllImgByShoesId() {
        List<ShoesImg> shoesImgs = MyBatisUtil.getSession().getMapper(ShoesImgDAO.class).queryAllImgByShoesId(2001);
        for (ShoesImg s : shoesImgs) {
            System.out.println(s);
        }

    }
}
