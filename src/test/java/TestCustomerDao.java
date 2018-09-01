import com.crazyelemon.dao.CustomerDAO;
import com.crazyelemon.entity.Customer;
import com.crazyelemon.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class TestCustomerDao {
    @Test
    public void testInsert(){
        Customer customer = new Customer();
        customer.setCustAge(21);
        customer.setCustCreateTime(new Date());
        customer.setCustEmail("kleislove@kleislove.com");
        customer.setCustId(6);
        customer.setCustName("kleis");
        customer.setCustPhone(17678627809l);
        customer.setCustProfile(null);
        customer.setCustPwd("kleis");
        customer.setCustUpdateTime(new Date());
        SqlSession sqlSession = MyBatisUtil.getSession();
        CustomerDAO customerDAO = sqlSession.getMapper(CustomerDAO.class);
        int  i = customerDAO.insert(customer);
        sqlSession.commit();
        MyBatisUtil.closeSession();
        System.out.println(i);
    }

    @Test
    public void testIsValidTelno(){
        System.out.println(MyBatisUtil.getSession().getMapper(CustomerDAO.class).isValidTelno(00000l));
    }

    @Test
    public void testIsValidEmail(){
        System.out.println(MyBatisUtil.getSession().getMapper(CustomerDAO.class).isValidEmail("kleislove@kleislove.com"));
    }

    @Test
    public void testUpdatePwd(){
        Customer customer = new Customer();
        customer.setCustPwd("kkkkkkk");
        customer.setCustId(1001);
        SqlSession sqlSession = MyBatisUtil.getSession();
        int i = sqlSession.getMapper(CustomerDAO.class).updatePwd(customer);
        sqlSession.commit();
        System.out.println(i);
    }

    @Test
    public void testSelectByPrimaryKey(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        Customer customer = sqlSession.getMapper(CustomerDAO.class).selectByPrimaryKey(6);
        MyBatisUtil.closeSession();
        System.out.println(customer);

    }

    @Test
    public void testUpdateByPrimaryKey(){
        Customer customer = new Customer();
        customer.setCustId(6);
        customer.setCustUpdateTime(new Date());
        SqlSession sqlSession = MyBatisUtil.getSession();
        int i = sqlSession.getMapper(CustomerDAO.class).updateByPrimaryKey(customer);
        sqlSession.commit();
        System.out.println(i);
    }
}
