package pres;

import dao.DaoImp1;
import metier.MetierImp;

public class Pres1 {
    public static void main(String[] args) {
        DaoImp1 dao = new DaoImp1();
        MetierImp metier = new MetierImp(dao);
        System.out.println(metier.calcul());
    }
}
