package service.interfaces;

import entitys.Position;
import entitys.User;

import java.util.List;

public interface ISystemService {

    /**
     * 登录,成功返回登录用户的id，失败返回0
     * @return
     */
   public Object load(User user);

    /**
     * 获取首页职位展示信息
     * @return
     */
   public List<Position> getHomePosition();

    /**
     * 求职者向公司某一职位投递简历
     * @return 投递是否成功
     */
   public String PostResume(int rId, int pId, int sId);



}
