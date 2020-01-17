package dao;

import entitys.JobSeeker;

public interface IJobSeekerDao {

    /**
     *
     * @param name
     * @return
     */
    public JobSeeker queryJobSeekerByName(String name);


    /**
     *根据id查询简历id
     * @param id  求职者Id
     * @return 简历id
     */
    public int queryResumeBySeekId(int id);


    /**
     *根据id查服务器简历文件id
     * @param id  求职者Id
     * @return 服务器简历文件id
     */
    public int queryServiceResumeBySeekId(int id);






}
