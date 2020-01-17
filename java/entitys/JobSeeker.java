package entitys;

import java.io.Serializable;

public class JobSeeker implements Serializable {

    private  int js_id;
    private  String js_name;
    private  String js_password;
    private  String js_iamge;
    private  int js_age;
    private  int js_workYear;
    private  String js_jobState;
    private  int js_comnum;
    private  int js_delnum;
    private  int js_internum;
    private  int js_creditPoint;
    private  int js_e_id;
    private  int js_re_id;

    public int getJs_id() {
        return js_id;
    }

    public void setJs_id(int js_id) {
        this.js_id = js_id;
    }

    public String getJs_name() {
        return js_name;
    }

    public void setJs_name(String js_name) {
        this.js_name = js_name;
    }

    public String getJs_password() {
        return js_password;
    }

    public void setJs_password(String js_password) {
        this.js_password = js_password;
    }

    public String getJs_iamge() {
        return js_iamge;
    }

    public void setJs_iamge(String js_iamge) {
        this.js_iamge = js_iamge;
    }

    public int getJs_age() {
        return js_age;
    }

    public void setJs_age(int js_age) {
        this.js_age = js_age;
    }

    public int getJs_workYear() {
        return js_workYear;
    }

    public void setJs_workYear(int js_workYear) {
        this.js_workYear = js_workYear;
    }

    public String getJs_jobState() {
        return js_jobState;
    }

    public void setJs_jobState(String js_jobState) {
        this.js_jobState = js_jobState;
    }

    public int getJs_comnum() {
        return js_comnum;
    }

    public void setJs_comnum(int js_comnum) {
        this.js_comnum = js_comnum;
    }

    public int getJs_delnum() {
        return js_delnum;
    }

    public void setJs_delnum(int js_delnum) {
        this.js_delnum = js_delnum;
    }

    public int getJs_internum() {
        return js_internum;
    }

    public void setJs_internum(int js_internum) {
        this.js_internum = js_internum;
    }

    public int getJs_creditPoint() {
        return js_creditPoint;
    }

    public void setJs_creditPoint(int js_creditPoint) {
        this.js_creditPoint = js_creditPoint;
    }

    public int getJs_e_id() {
        return js_e_id;
    }

    public void setJs_e_id(int js_e_id) {
        this.js_e_id = js_e_id;
    }

    public int getJs_re_id() {
        return js_re_id;
    }

    public void setJs_re_id(int js_re_id) {
        this.js_re_id = js_re_id;
    }


    @Override
    public String toString() {
        return "JobSeeker{" +
                "js_id=" + js_id +
                ", js_name='" + js_name + '\'' +
                ", js_password='" + js_password + '\'' +
                ", js_iamge='" + js_iamge + '\'' +
                ", js_age=" + js_age +
                ", js_workYear=" + js_workYear +
                ", js_jobState='" + js_jobState + '\'' +
                ", js_comnum=" + js_comnum +
                ", js_delnum=" + js_delnum +
                ", js_internum=" + js_internum +
                ", js_creditPoint=" + js_creditPoint +
                ", js_e_id=" + js_e_id +
                ", js_re_id=" + js_re_id +
                '}';
    }
}
