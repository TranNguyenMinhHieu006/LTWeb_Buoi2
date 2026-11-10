package murach.business;

import java.io.Serializable;

public class Survey implements Serializable {
    private String heardFrom;
    private String contactVia;

    public Survey() {
        heardFrom = "";
        contactVia = "";
    }

    public Survey(String heardFrom, String contactVia) {
        this.heardFrom = heardFrom;
        this.contactVia = contactVia;
    }

    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }


    public String getContactVia() {
        return contactVia;
    }

    public void setContactVia(String contactVia) {
        this.contactVia = contactVia;
    }
}