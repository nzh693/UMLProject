package service.interfaces;

import entitys.Position;

import java.util.List;

public interface IPositionService {

    /***
     * 获取已发布职位信息
     */
    public List<Position> getAllPosition();

    /**
     * 根据id查询职位
     * @param id
     * @return
     */
    public Position getPositionById(int id);

    /**
     * 提取职位中的限制转化为list(根据数据中的分隔符)
     * @param position
     * @return
     */
    public List<String> getLimits(Position position);

    /**
     * 提取职位中的公司福利转化为list(根据数据中的分隔符)
     * @param position
     * @return
     */
    public List<String> getLables(Position position);

    /**
     *
     * @param positions
     * @return
     */
    public List<Position> getlablesFromPositions(List<Position> positions);



}
