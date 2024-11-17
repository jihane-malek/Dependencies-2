package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao DAO;
    @Override
    public double calcul() {
        double tmp = DAO.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    public void setDAO(IDao DAO) {
        this.DAO = DAO;

    }
}
