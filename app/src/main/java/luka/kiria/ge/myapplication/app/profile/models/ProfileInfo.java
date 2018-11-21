
package luka.kiria.ge.myapplication.app.profile.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfileInfo {

    @SerializedName("Client")
    @Expose
    private Client client;
    @SerializedName("ClientAddresses")
    @Expose
    private List<ClientAddress> clientAddresses = null;
    @SerializedName("ClientMails")
    @Expose
    private List<ClientMail> clientMails = null;
    @SerializedName("ClientPhones")
    @Expose
    private List<ClientPhone> clientPhones = null;
    @SerializedName("ClientDevices")
    @Expose
    private List<ClientDevice> clientDevices = null;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<ClientAddress> getClientAddresses() {
        return clientAddresses;
    }

    public void setClientAddresses(List<ClientAddress> clientAddresses) {
        this.clientAddresses = clientAddresses;
    }

    public List<ClientMail> getClientMails() {
        return clientMails;
    }

    public void setClientMails(List<ClientMail> clientMails) {
        this.clientMails = clientMails;
    }

    public List<ClientPhone> getClientPhones() {
        return clientPhones;
    }

    public void setClientPhones(List<ClientPhone> clientPhones) {
        this.clientPhones = clientPhones;
    }

    public List<ClientDevice> getClientDevices() {
        return clientDevices;
    }

    public void setClientDevices(List<ClientDevice> clientDevices) {
        this.clientDevices = clientDevices;
    }

}
