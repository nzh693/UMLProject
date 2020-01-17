package entitys;

import java.util.List;

public class TradeField {

    private int tf_id;
    private String tf_name;
    private String tf_desc;

    private List<Company> companies=null;

    public int getTf_id() {
        return tf_id;
    }

    public void setTf_id(int tf_id) {
        this.tf_id = tf_id;
    }

    public String getTf_name() {
        return tf_name;
    }

    public void setTf_name(String tf_name) {
        this.tf_name = tf_name;
    }

    public String getTf_desc() {
        return tf_desc;
    }

    public void setTf_desc(String tf_desc) {
        this.tf_desc = tf_desc;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "TradeField{" +
                "tf_id=" + tf_id +
                ", tf_name='" + tf_name + '\'' +
                ", tf_desc='" + tf_desc + '\'' +
                ", companies=" + companies +
                '}';
    }


}
