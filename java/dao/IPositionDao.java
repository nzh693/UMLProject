package dao;

import entitys.Position;

import java.util.List;

public interface IPositionDao {


    /**
     * 查询所有账户账户下的所有角色
     * @param
     * @return
     */
    public List<Position> queryAllPosition();

    /**
     * 查询某一职位的详细信息
     * @param id 职位id
     * @return
     */
    public Position queryPositionById(int id);








}
