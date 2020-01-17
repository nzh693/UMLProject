package controls;

import entitys.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.imp.IPositionServiceImp;
import service.imp.ISystemServiceImp;
import service.interfaces.IPositionService;
import service.interfaces.ISystemService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/seeker")
public class JobSeekerControl {

    private static ISystemService systemService =null;
    private static IPositionService positionService=null;

    /***
     * 用户登录
     * @param user 前端传输用户
     * @return
     * @throws Exception
     */
    @RequestMapping(path = "load")
    public ModelAndView load(HttpServletRequest request, HttpSession httpSession,User user) throws Exception {

        ModelAndView  mv=new ModelAndView();
        systemService =new ISystemServiceImp();
        positionService=new IPositionServiceImp();
        Object result= systemService.load(user);
        if (result==null){
            mv.addObject("isLoad",false);
            mv.setViewName("load");
        }else if(result instanceof JobSeeker){
            List<Position> positions= systemService.getHomePosition();
            positions=positionService.getlablesFromPositions(positions);
            mv.addObject("user",(JobSeeker)result);
            mv.addObject("positions",positions);
            mv.setViewName("index");
            httpSession.setAttribute("id",((JobSeeker)result).getJs_id() );
            httpSession.setAttribute("password", ((JobSeeker)result).getJs_password());
        }

        else {
            List<Position> positions= systemService.getHomePosition();
            mv.addObject("user",(Company)result);
            mv.addObject("positions",positions);
            httpSession.setAttribute("id",((Company)result).getCo_id() );
            httpSession.setAttribute("password", ((Company)result).getCo_password());
            mv.setViewName("index");
        }
        return mv;

    }





    /**
     * 求职者向某职位投递简历
     * @param userId 求职者ID
     * @param resumeChoice 简历选项 0：系统模板简历 1：上传的个人简历(服务器文件)
     * @param positionId
     * @return 投递是否成功
     */
    @RequestMapping(path = "sendResume",produces = {"text/html;charset=utf-8"})
    public @ResponseBody String sendResume(int userId,String resumeChoice,int positionId){
        return systemService.PostResume(userId,positionId,Integer.parseInt(resumeChoice));
    }






}
