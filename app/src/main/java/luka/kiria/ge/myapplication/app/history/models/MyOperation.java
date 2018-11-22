
package luka.kiria.ge.myapplication.app.history.models;

import android.support.v4.app.INotificationSideChannel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyOperation {

    @SerializedName("AcctKey")
    @Expose
    private Long acctKey;
    @SerializedName("EntryId")
    @Expose
    private Long entryId;
    @SerializedName("Nomination")
    @Expose
    private String nomination;
    @SerializedName("EntryGroup")
    @Expose
    private String entryGroup;
    @SerializedName("MerchantId")
    @Expose
    private String merchantId;
    @SerializedName("Date")
    @Expose
    private Long date;
    @SerializedName("Amount")
    @Expose
    private Double amount;
    @SerializedName("Ccy")
    @Expose
    private String ccy;
    @SerializedName("DocNomination")
    @Expose
    private String docNomination;
    @SerializedName("Beneficiary")
    @Expose
    private String beneficiary;
    @SerializedName("DstAcc")
    @Expose
    private String dstAcc;
    @SerializedName("SrcAcc")
    @Expose
    private String srcAcc;
    @SerializedName("MerchantName")
    @Expose
    private String merchantName;
    @SerializedName("MerchantNameInt")
    @Expose
    private String merchantNameInt;
    @SerializedName("AmountBase")
    @Expose
    private Double amountBase;
    @SerializedName("EntryGroupName")
    @Expose
    private String entryGroupName;
    @SerializedName("EntryGroupNameId")
    @Expose
    private Integer entryGroupNameId;
    @SerializedName("ServiceId")
    @Expose
    private String serviceId;
    @SerializedName("PostDate")
    @Expose
    private Long postDate;

    public Long getAcctKey() {
        return acctKey;
    }

    public void setAcctKey(Long acctKey) {
        this.acctKey = acctKey;
    }

    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    public String getNomination() {
        return nomination;
    }

    public void setNomination(String nomination) {
        this.nomination = nomination;
    }

    public String getEntryGroup() {
        return entryGroup;
    }

    public void setEntryGroup(String entryGroup) {
        this.entryGroup = entryGroup;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getDocNomination() {
        return docNomination;
    }

    public void setDocNomination(String docNomination) {
        this.docNomination = docNomination;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getDstAcc() {
        return dstAcc;
    }

    public void setDstAcc(String dstAcc) {
        this.dstAcc = dstAcc;
    }

    public String getSrcAcc() {
        return srcAcc;
    }

    public void setSrcAcc(String srcAcc) {
        this.srcAcc = srcAcc;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantNameInt() {
        return merchantNameInt;
    }

    public void setMerchantNameInt(String merchantNameInt) {
        this.merchantNameInt = merchantNameInt;
    }

    public Double getAmountBase() {
        return amountBase;
    }

    public void setAmountBase(Double amountBase) {
        this.amountBase = amountBase;
    }

    public String getEntryGroupName() {
        return entryGroupName;
    }

    public void setEntryGroupName(String entryGroupName) {
        this.entryGroupName = entryGroupName;
    }

    public Integer getEntryGroupNameId() {
        return entryGroupNameId;
    }

    public void setEntryGroupNameId(Integer entryGroupNameId) {
        this.entryGroupNameId = entryGroupNameId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Long getPostDate() {
        return postDate;
    }

    public void setPostDate(Long postDate) {
        this.postDate = postDate;
    }

}
