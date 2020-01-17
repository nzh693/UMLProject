package service.imp;

import utils.DaoFactory;
import dao.IJobSeekerDao;
import entitys.JobSeeker;
import service.interfaces.IJobSeekerService;

public class IJobSeekerServiceImp implements IJobSeekerService {

    private static IJobSeekerDao jobSeekerDao=null;

    /**
     *求职者登录
     * @param jobSeeker
     * @return
     */
    @Override
    public JobSeeker load(JobSeeker jobSeeker) {

        jobSeekerDao=(IJobSeekerDao)DaoFactory.getFactoryDao().getDaoByName("IJobSeekerDao");
        JobSeeker seekerResult= jobSeekerDao.queryJobSeekerByName(jobSeeker.getJs_name());
        DaoFactory.getFactoryDao().destory();
        if(seekerResult!=null){//求职者查询不为空
            if(seekerResult.getJs_password().equals(jobSeeker.getJs_password())){
                return  seekerResult;
            }
            else {
                return null;
            }
        }
        else {
            return null;
        }
    }

    /**
     * 查询简历id
     * @param seekId
     * @return
     */
    @Override
    public int getResumeIdBySeekerId(int seekId) {
       return jobSeekerDao.queryResumeBySeekId(seekId);

    }

    /**
     *
     * @param seekerId
     * @return
     */
    @Override
    public int getServiceResumeIdBySeekerId(int seekerId) {

        return jobSeekerDao.queryServiceResumeBySeekId(seekerId);
    }

}
