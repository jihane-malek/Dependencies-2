package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public int getData() {
        System.out.println("Version Capteurs");
        int temp=6000;


        return temp;
    }

}
