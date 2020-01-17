package dao;

import entitys.RePo;

public interface IResumeDao {

    /**
     * 向职位和简历的多对多表中插入该职位id,简历rId,服务器个人简历文件rId(id<0时id无效)
     * @param rePo
     */
    public void addResumeToPosition(RePo rePo);

    /**
     * 查询所投递系统简历是否已经存在该职位下
     * @param rePo
     * @return  存在id,不存在为空
     */
    public RePo checkSystemResumeIsUpLoad(RePo rePo);

    /**
     * 查询所投递个人文件简历是否已经存在该职位下
     * @param rePo
     * @return 存在id,不存在为空
     */
    public RePo checkServiceResumeIsUpLoad(RePo rePo);




}
