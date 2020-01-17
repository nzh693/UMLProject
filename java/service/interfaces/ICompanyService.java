package service.interfaces;

import entitys.Company;

public interface ICompanyService {

    /**
     * 公司登录
     * @param company
     * @return
     */
    public Company load(Company company);

}
