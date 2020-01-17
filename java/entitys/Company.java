package entitys;

import java.io.Serializable;
import java.util.List;

public class Company implements Serializable {


    private  int co_id;
    private String co_name;
    private String co_password;
    private String co_iamge;
    private String co_desc;
    private String co_address;
    private String co_environment;
    private String co_opnum;
    private int    co_creditPoint;
    private int    co_c_id;

    private List<TradeField> tradeFields=null;//一对多 公司所属行业领域

    public List<TradeField> getTradeFields() {
        return tradeFields;
    }

    public void setTradeFields(List<TradeField> tradeFields) {
        this.tradeFields = tradeFields;
    }

    public int getCo_id() {
        return co_id;
    }

    public void setCo_id(int co_id) {
        this.co_id = co_id;
    }

    public String getCo_name() {
        return co_name;
    }

    public void setCo_name(String co_name) {
        this.co_name = co_name;
    }

    public String getCo_password() {
        return co_password;
    }

    public void setCo_password(String co_password) {
        this.co_password = co_password;
    }

    public String getCo_opnum() {
        return co_opnum;
    }

    public void setCo_opnum(String co_opnum) {
        this.co_opnum = co_opnum;
    }

    public String getCo_iamge() {
        return co_iamge;
    }

    public void setCo_iamge(String co_iamge) {
        this.co_iamge = co_iamge;
    }

    public String getCo_desc() {
        return co_desc;
    }

    public void setCo_desc(String co_desc) {
        this.co_desc = co_desc;
    }

    public String getCo_address() {
        return co_address;
    }

    public void setCo_address(String co_address) {
        this.co_address = co_address;
    }

    public String getCo_environment() {
        return co_environment;
    }

    public void setCo_environment(String co_environment) {
        this.co_environment = co_environment;
    }

    public int getCo_creditPoint() {
        return co_creditPoint;
    }

    public void setCo_creditPoint(int co_creditPoint) {
        this.co_creditPoint = co_creditPoint;
    }

    public int getCo_c_id() {
        return co_c_id;
    }

    public void setCo_c_id(int co_c_id) {
        this.co_c_id = co_c_id;
    }

    @Override
    public String toString() {
        return "Company{" +
                "co_id=" + co_id +
                ", co_name='" + co_name + '\'' +
                ", co_password='" + co_password + '\'' +
                ", co_iamge='" + co_iamge + '\'' +
                ", co_desc='" + co_desc + '\'' +
                ", co_address='" + co_address + '\'' +
                ", co_environment='" + co_environment + '\'' +
                ", co_opnum='" + co_opnum + '\'' +
                ", co_creditPoint=" + co_creditPoint +
                ", co_c_id=" + co_c_id +
                ", tradeFields=" + tradeFields +
                '}';
    }

}
