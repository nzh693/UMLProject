package utils;

import dao.ICompanyDao;
import dao.IJobSeekerDao;
import dao.IPositionDao;
import dao.IResumeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.util.HashMap;

/**
 * 数据层单例工厂
 */
public class DaoFactory{


    private  static  DaoFactory instance=null;

    private static InputStream in=null;
    private static SqlSession sqlSession=null;

    private static ICompanyDao companyDao=null;
    private static IJobSeekerDao seekerDao=null;
    private static IPositionDao positionDao=null;
    private static IResumeDao resumeDao=null;

    private static HashMap<String,Object> daoMap=new HashMap<>();//dao容器

    public static SqlSession getSqlSession() {
        return sqlSession;
    }


    static {
        try {
            in= Resources.getResourceAsStream("MyBatisConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=builder.build(in);
        sqlSession=factory.openSession();
        companyDao=sqlSession.getMapper(ICompanyDao.class);
        seekerDao=sqlSession.getMapper(IJobSeekerDao.class);
        positionDao=sqlSession.getMapper(IPositionDao.class);
        resumeDao=sqlSession.getMapper(IResumeDao.class);
        daoMap.put("ICompanyDao",companyDao);
        daoMap.put("IJobSeekerDao",seekerDao);
        daoMap.put("IPositionDao",positionDao);
        daoMap.put("IResumeDao",resumeDao);

    }


    private DaoFactory(){

    }


    public  static  DaoFactory getFactoryDao(){
        synchronized (DaoFactory.class){
            if (instance==null){
                instance=new DaoFactory();
            }
        }

        return  instance;
    }




    /**
     * 销毁
     * @throws IOException
     */
    public void destory() {
        sqlSession.commit();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *
     * @param name
     * @return
     */
    public Object getDaoByName(String name){
        return daoMap.get(name);
    }











}
