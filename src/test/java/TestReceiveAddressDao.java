import com.crazyelemon.dao.ReceiveAddressDAO;
import com.crazyelemon.entity.ReceiveAddress;
import com.crazyelemon.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestReceiveAddressDao {
    SqlSession sqlSession = MyBatisUtil.getSession();
    ReceiveAddressDAO receiveAddressDAO = sqlSession.getMapper(ReceiveAddressDAO.class);
    @Test
    public void TestInsert(){
        ReceiveAddress receiveAddress = new ReceiveAddress(5,"江苏","苏州","吴中区","创苑路","创意产业园4栋B202",888888,"Jim",16678876334L,0,1003);
        int rows = receiveAddressDAO.insert(receiveAddress);
        sqlSession.commit();
        System.out.println("受影响行数:"+rows);
        MyBatisUtil.closeSession();
    }
    @Test
    public void TestDeleteByPrimaryKey(){
        int rows = receiveAddressDAO.deleteByPrimaryKey(4);
        sqlSession.commit();
        System.out.println("受影响行数:"+rows);
        MyBatisUtil.closeSession();
    }
    @Test
    public void TestUpdateByCustId(){
        ReceiveAddress record = new ReceiveAddress(2,"江苏","苏州","吴中区","创苑路","创意产业园4栋B202",777777,"Jim",16678876334L,0,1002);
        int rows = receiveAddressDAO.updateByCustId(record,1002);
        sqlSession.commit();
        System.out.println("受影响行数:"+rows);
        MyBatisUtil.closeSession();
    }
    @Test
    public void TestQueryAll(){
        List<ReceiveAddress>  receiveAddress= receiveAddressDAO.queryAll(1003);
        receiveAddress.forEach(System.out::println);
        MyBatisUtil.closeSession();
    }
    @Test
    public void TestUpdateDefaultAddress(){
        int rows = receiveAddressDAO.updateDefaultAddress(3,1003);
        System.out.println("受影响行数:"+rows);
        MyBatisUtil.closeSession();
    }
}
