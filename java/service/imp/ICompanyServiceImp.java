package service.imp;

import utils.DaoFactory;
import dao.ICompanyDao;
import entitys.Company;
import service.interfaces.ICompanyService;

public class ICompanyServiceImp implements ICompanyService {



    private static ICompanyDao companyDao=null;




    @Override
    public Company load(Company company)  {


         companyDao= (ICompanyDao) DaoFactory.getFactoryDao().getDaoByName("ICompanyDao");
         Company companyResult=companyDao.queryCompanyByName(company.getCo_name());
         DaoFactory.getFactoryDao().destory();
         if(companyResult != null){//公司查询不为空
             if(companyResult.getCo_password().equals(company.getCo_password())){
                 return  companyResult;
             }
             else {
                 return null;
             }
         }
         else {
             return null;
         }


    }
}
