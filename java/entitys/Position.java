package entitys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Position implements Serializable {


    private  int id;
    private  String name;
    private  String state;
    private  String desc;
    private  String status;
    private  String salary;
    private  String limits;
    private  String wareFare;
    private  String workPlace;
    private  int    companyId;
    private  int    fieldId;
    private  String upTime;//职位发布时间
    private  Company company;//职位发布所属公司
    private  List<String> wareFares =new ArrayList<>();//公司福利


    public List<String> getWareFares() {
        return wareFares;
    }

    public void setWareFares(List<String> wareFares) {
        this.wareFares = wareFares;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
    }

    public String getWareFare() {
        return wareFare;
    }

    public void setWareFare(String wareFare) {
        this.wareFare = wareFare;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getUpTime() {
        return upTime;
    }

    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", desc='" + desc + '\'' +
                ", status='" + status + '\'' +
                ", salary='" + salary + '\'' +
                ", limits='" + limits + '\'' +
                ", wareFare='" + wareFare + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", companyId=" + companyId +
                ", fieldId=" + fieldId +
                ", upTime='" + upTime + '\'' +
                ", company=" + company +
                '}';
    }
}
