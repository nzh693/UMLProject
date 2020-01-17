package service.imp;

import entitys.*;
import service.interfaces.*;

import java.util.List;

public class ISystemServiceImp implements ISystemService {


    private IJobSeekerService jobSeekerService=null;
    private ICompanyService companyService=null;
    private IPositionService positionService=null;
    private IResumeService resumeService=null;

    /**
     * 用户同意登录
     * @param user
     * @return
     */
    @Override
    public Object load(User user) {

        jobSeekerService=new IJobSeekerServiceImp();
        companyService =new ICompanyServiceImp();

        JobSeeker seeker=new JobSeeker();
        Company company=new Company();
        seeker.setJs_name(user.getUserName());
        seeker.setJs_password(user.getUserPassword());
        company.setCo_name(user.getUserName());
        company.setCo_password(user.getUserPassword());

        Company queryCoRe=companyService.load(company);
        JobSeeker queryJoRe=jobSeekerService.load(seeker);
        if(queryCoRe!=null){//匹配公司账户
            return queryCoRe;
        }else if (queryJoRe!=null){//匹配求职者账户
            return queryJoRe;
        }
        else {//均不匹配，登录失败
            return null;
        }

    }

    /**
     * 暂时商定为获取数据库所有已发布职位信息(由于数据有限)
     * @return
     */
    @Override
    public List<Position> getHomePosition() {
        positionService=new IPositionServiceImp();
        List<Position> positions= positionService.getAllPosition();
        return positions;
    }

    /**
     * 1.当choice=0时，查询系统简历表
     * 2.当choice=1时，查询服务器个人简历表
     * 3.查询是否已经上传
     * 4.插入resume_position表格。
     *
     * @param seekerId
     * @param pId
     * @param choice 简历选项
     * @return
     */
    @Override
    public String PostResume(int seekerId, int pId, int choice) {

        resumeService=new IResumeServiceImp();

        int systemResumeId=-1;
        int serviceResumeId=-1;
        boolean isUplload=false;//是否已经上传
        if(choice==0){
            systemResumeId=jobSeekerService.getResumeIdBySeekerId(seekerId);
            isUplload=resumeService.isSystemResumeUpload(systemResumeId,pId);
        }else {
            serviceResumeId=jobSeekerService.getServiceResumeIdBySeekerId(seekerId);
            isUplload=resumeService.isServiceResumeUpload(serviceResumeId,pId);
        }
        if (isUplload){
            return "请勿重复上传！";
        }
        if(serviceResumeId==-1 && choice==1){
            return "未上传个人简历文件";
        }
        RePo rePo=new RePo(0,systemResumeId,pId,serviceResumeId);
        resumeService.postResume(rePo);
        return "投递成功！";
    }

}


