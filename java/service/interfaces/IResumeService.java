package service.interfaces;

import entitys.RePo;

public interface IResumeService {

    /**
     *
     * @param rePo
     */
    public void postResume(RePo rePo);

    /**
     * 根据id查询是否已经存在
     * @param serviceReId
     * @param positionId
     * @return
     */
    public boolean isServiceResumeUpload(int serviceReId,int positionId);

    /**
     * 根据id查询是否已经存在
     * @param systemReId
     * @param positionId
     * @return
     */
    public boolean isSystemResumeUpload(int systemReId,int positionId);


}
