package service.imp;

import dao.IResumeDao;
import entitys.RePo;
import service.interfaces.IResumeService;
import utils.DaoFactory;

public class IResumeServiceImp implements IResumeService {

    private IResumeDao resumeDao=null;

    @Override
    public void postResume(RePo rePo) {
     resumeDao= (IResumeDao) DaoFactory.getFactoryDao().getDaoByName("IResumeDao");
     resumeDao.addResumeToPosition(rePo);
    }

    @Override
    public boolean isServiceResumeUpload(int serviceReId, int positionId) {
        resumeDao=(IResumeDao) DaoFactory.getFactoryDao().getDaoByName("IResumeDao");

        System.out.println("resumeDao"+resumeDao);
        RePo rePo=new RePo(0,0,positionId,serviceReId);
        rePo=resumeDao.checkServiceResumeIsUpLoad(rePo);
        System.out.println("isServiceResumeUpload repo:"+rePo);
        if (rePo==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean isSystemResumeUpload(int systemReId, int positionId) {
        resumeDao=(IResumeDao) DaoFactory.getFactoryDao().getDaoByName("IResumeDao");
        RePo rePo=new RePo(-1,systemReId,positionId,0);
        rePo=resumeDao.checkSystemResumeIsUpLoad(rePo);
        System.out.println("repo:"+rePo);
        if (rePo==null){
            return false;
        }else {
            return true;
        }

    }

}
