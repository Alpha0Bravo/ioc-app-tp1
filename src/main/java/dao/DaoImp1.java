package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImp1 implements IDao{
    @Override
    public double getdata(){
        System.out.println("Implementation 1");
        return 50;
    }
}
