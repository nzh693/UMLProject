package dao;

import entitys.Company;

import java.util.List;

public interface ICompanyDao {

    /**
     *根据公司注册名称查询公司
     * @return
     */
    public Company queryCompanyByName(String name);


    /**
     *根据公司注册id查询公司
     * @return
     */
    public Company queryCompanyById(int  id);


}
