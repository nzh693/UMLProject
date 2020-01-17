package entitys;

import java.io.Serializable;

public class RePo implements Serializable {

    private  int r_id;
    private  int  r_re_id;
    private  int r_po_id;
    private  int r_sr_id;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getR_re_id() {
        return r_re_id;
    }

    public void setR_re_id(int r_re_id) {
        this.r_re_id = r_re_id;
    }

    public int getR_po_id() {
        return r_po_id;
    }

    public void setR_po_id(int r_po_id) {
        this.r_po_id = r_po_id;
    }

    public int getR_sr_id() {
        return r_sr_id;
    }

    public void setR_sr_id(int r_sr_id) {
        this.r_sr_id = r_sr_id;
    }

    public RePo(int r_id, int r_re_id, int r_po_id, int r_sr_id) {
        this.r_id = r_id;
        this.r_re_id = r_re_id;
        this.r_po_id = r_po_id;
        this.r_sr_id = r_sr_id;
    }

    @Override
    public String toString() {
        return "RePo{" +
                "r_id=" + r_id +
                ", r_re_id=" + r_re_id +
                ", r_po_id=" + r_po_id +
                ", r_sr_id=" + r_sr_id +
                '}';
    }
}
