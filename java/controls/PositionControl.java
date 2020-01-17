package controls;

import entitys.Position;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.imp.IPositionServiceImp;
import service.interfaces.IPositionService;

@Controller
@RequestMapping(path = "/PositionControl")
public class PositionControl {

    private IPositionService positionService=null;


    @RequestMapping(path = "getPositionDetail")
    private ModelAndView getPositionDetail(String id){

        ModelAndView mv=new ModelAndView();
        positionService=new IPositionServiceImp();
        Position position= positionService.getPositionById(Integer.parseInt(id));

        mv.addObject("position",position);
        mv.addObject("limits",positionService.getLimits(position));
        mv.addObject("lables",positionService.getLables(position));
        mv.setViewName("position");
        return mv;

    }
}
