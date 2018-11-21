
package luka.kiria.ge.myapplication.app.profile.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Client {

    @SerializedName("CategoryType")
    @Expose
    private String categoryType;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("FirstNameInt")
    @Expose
    private String firstNameInt;
    @SerializedName("LastNameInt")
    @Expose
    private String lastNameInt;
    @SerializedName("Sex")
    @Expose
    private String sex;
    @SerializedName("BirthDate")
    @Expose
    private Long birthDate;
    @SerializedName("TranStatus")
    @Expose
    private String tranStatus;
    @SerializedName("Resident")
    @Expose
    private String resident;
    @SerializedName("Pin")
    @Expose
    private String pin;
    @SerializedName("ClientCategory")
    @Expose
    private String clientCategory;

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstNameInt() {
        return firstNameInt;
    }

    public void setFirstNameInt(String firstNameInt) {
        this.firstNameInt = firstNameInt;
    }

    public String getLastNameInt() {
        return lastNameInt;
    }

    public void setLastNameInt(String lastNameInt) {
        this.lastNameInt = lastNameInt;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }

    public String getTranStatus() {
        return tranStatus;
    }

    public void setTranStatus(String tranStatus) {
        this.tranStatus = tranStatus;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getClientCategory() {
        return clientCategory;
    }

    public void setClientCategory(String clientCategory) {
        this.clientCategory = clientCategory;
    }

}
