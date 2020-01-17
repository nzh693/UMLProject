package service.imp;

import dao.IPositionDao;
import entitys.Position;
import service.interfaces.IPositionService;
import utils.DaoFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IPositionServiceImp implements IPositionService {

    private IPositionDao positionDao=null;


    @Override
    public List<Position> getAllPosition() {
        positionDao=(IPositionDao)DaoFactory.getFactoryDao().getDaoByName("IPositionDao");
        List<Position> positions=positionDao.queryAllPosition();
        return  positions;
    }

    @Override
    public Position getPositionById(int id) {
        positionDao=(IPositionDao)DaoFactory.getFactoryDao().getDaoByName("IPositionDao");
        Position position=positionDao.queryPositionById(id);
        System.out.println(position);
        return position;
    }

    @Override
    public List<String> getLimits(Position position) {
        List<String> list=new ArrayList<>();
        String[] limits=position.getLimits().split("/");
        for(String l:limits){
            list.add(l);
        }
        return list;
    }

    @Override
    public List<String> getLables(Position position) {
        List<String> list=new ArrayList<>();
        list=Arrays.asList(position.getWareFare().split("/"));
        return list;
    }

    @Override
    public List<Position> getlablesFromPositions(List<Position> positions) {
        List<Position> lists=new ArrayList<>();
        for(Position p:positions){
            List<String> list=Arrays.asList(p.getWareFare().split("/"));
            p.setWareFares(list);
            lists.add(p);
        }
        return lists;
    }
}
