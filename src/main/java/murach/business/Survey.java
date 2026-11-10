package murach.business;

import java.io.Serializable;

public class Survey implements Serializable {
    private String heardFrom;
    private String contactVia;
    private String receiveAnnouncements;
    private String emailOK;

    public Survey() {
        heardFrom = "";
        contactVia = "";
        receiveAnnouncements = "";
        emailOK = "";
    }

    public Survey(String heardFrom, String contactVia, String receiveAnnouncements, String emailOK) {
        this.heardFrom = heardFrom;
        this.contactVia = contactVia;
        this.receiveAnnouncements = receiveAnnouncements;
        this.emailOK = emailOK;
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

    public String getReceiveAnnouncements() {
        return receiveAnnouncements;
    }

    public void setReceiveAnnouncements(String receiveAnnouncements) {
        this.receiveAnnouncements = receiveAnnouncements;
    }

    public String getEmailOK() {
        return emailOK;
    }

    public void setEmailOK(String emailOK) {
        this.emailOK = emailOK;
    }
}