
package luka.kiria.ge.myapplication.app.profile.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientPhone {

    @SerializedName("Contact")
    @Expose
    private String contact;
    @SerializedName("Route")
    @Expose
    private String route;
    @SerializedName("DefaultContact")
    @Expose
    private String defaultContact;
    @SerializedName("ContactName")
    @Expose
    private String contactName;
    @SerializedName("Mail")
    @Expose
    private String mail;
    @SerializedName("Mobile")
    @Expose
    private String mobile;
    @SerializedName("Device")
    @Expose
    private String device;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDefaultContact() {
        return defaultContact;
    }

    public void setDefaultContact(String defaultContact) {
        this.defaultContact = defaultContact;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

}
