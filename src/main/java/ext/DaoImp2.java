package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImp2 implements IDao {
    @Override
    public double getdata() {
        System.out.println("Implementation 2");
        return 420;
    }
}