package service.interfaces;

import entitys.JobSeeker;

public interface IJobSeekerService {

    /**
     * 求职者登录
     * @param jobSeeker
     * @return
     */
    public JobSeeker load(JobSeeker jobSeeker);

    /**
     * 根据求职者id查询简历id
     * @param seekerId
     * @return
     */
    public int getResumeIdBySeekerId(int seekerId);

    /**
     * 根据求职者id查询服务器个人简历文件id
     *
     * @param seekerId
     * @return 服务器个人简历文件id
     */
    public int getServiceResumeIdBySeekerId(int seekerId);



}
