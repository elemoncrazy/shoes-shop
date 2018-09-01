import com.crazyelemon.dao.CustLoginDAO;
import com.crazyelemon.entity.CustLogin;
import com.crazyelemon.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class TestCustLoginDao {
    @Test
    public void testCheckTelnoAndPwd(){
        System.out.println(MyBatisUtil.getSession().getMapper(CustLoginDAO.class).checkTelnoAndPwd(17678627809l, "kleis"));
    }
    @Test
    public void testCheckEmailAndPwd(){
        System.out.println(MyBatisUtil.getSession().getMapper(CustLoginDAO.class).checkEmailAndPwd("kleislove@kleislove.com", "kleis"));
    }

    @Test
    public void testSave(){
        CustLogin custLogin = new CustLogin(3,"kleis","kleis",new Date(),"1.1.1.1",1,6);
        SqlSession sqlSession = MyBatisUtil.getSession();
        int i = sqlSession.getMapper(CustLoginDAO.class).save(custLogin);
        sqlSession.commit();
        System.out.println(i);
    }
}
