package metier;


import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class MetierImp implements IMetier {

    private IDao dao;

    public MetierImp(){}
    @Autowired
    public MetierImp(IDao dao){this.dao = dao;}

    @Override
    public double calcul() {
        return dao.getdata()*69;
    }

    public void setDao(IDao dao){this.dao = dao;}
}
