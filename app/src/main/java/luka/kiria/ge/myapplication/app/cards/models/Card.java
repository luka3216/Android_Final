package luka.kiria.ge.myapplication.app.cards.models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Card {

    @SerializedName("Id")
    @Expose
    private Long id;
    @SerializedName("CardId")
    @Expose
    private Integer cardId;
    @SerializedName("AcctKey")
    @Expose
    private Long acctKey;
    @SerializedName("ClientKey")
    @Expose
    private Long clientKey;
    @SerializedName("CardClass")
    @Expose
    private String cardClass;
    @SerializedName("CardName")
    @Expose
    private String cardName;
    @SerializedName("CardType")
    @Expose
    private String cardType;
    @SerializedName("ProductCode")
    @Expose
    private String productCode;
    @SerializedName("SubProductCode")
    @Expose
    private String subProductCode;
    @SerializedName("SubProductGroup")
    @Expose
    private String subProductGroup;
    @SerializedName("LastFour")
    @Expose
    private String lastFour;
    @SerializedName("CardHolder")
    @Expose
    private String cardHolder;
    @SerializedName("ExpDate")
    @Expose
    private Long expDate;
    @SerializedName("IsCardBlocked")
    @Expose
    private String isCardBlocked;
    @SerializedName("CardPan")
    @Expose
    private String cardPan;
    @SerializedName("CardForTypeDictionaryValue")
    @Expose
    private String cardForTypeDictionaryValue;
    @SerializedName("ProductGroup")
    @Expose
    private String productGroup;
    @SerializedName("ProductId")
    @Expose
    private Long productId;
    @SerializedName("SubProductId")
    @Expose
    private Long subProductId;
    @SerializedName("NameDictionaryValue")
    @Expose
    private String nameDictionaryValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Long getAcctKey() {
        return acctKey;
    }

    public void setAcctKey(Long acctKey) {
        this.acctKey = acctKey;
    }

    public Long getClientKey() {
        return clientKey;
    }

    public void setClientKey(Long clientKey) {
        this.clientKey = clientKey;
    }

    public String getCardClass() {
        return cardClass;
    }

    public void setCardClass(String cardClass) {
        this.cardClass = cardClass;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
    }

    public String getSubProductGroup() {
        return subProductGroup;
    }

    public void setSubProductGroup(String subProductGroup) {
        this.subProductGroup = subProductGroup;
    }

    public String getLastFour() {
        return lastFour;
    }

    public void setLastFour(String lastFour) {
        this.lastFour = lastFour;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Long getExpDate() {
        return expDate;
    }

    public void setExpDate(Long expDate) {
        this.expDate = expDate;
    }

    public String getIsCardBlocked() {
        return isCardBlocked;
    }

    public void setIsCardBlocked(String isCardBlocked) {
        this.isCardBlocked = isCardBlocked;
    }

    public String getCardPan() {
        return cardPan;
    }

    public void setCardPan(String cardPan) {
        this.cardPan = cardPan;
    }

    public String getCardForTypeDictionaryValue() {
        return cardForTypeDictionaryValue;
    }

    public void setCardForTypeDictionaryValue(String cardForTypeDictionaryValue) {
        this.cardForTypeDictionaryValue = cardForTypeDictionaryValue;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSubProductId() {
        return subProductId;
    }

    public void setSubProductId(Long subProductId) {
        this.subProductId = subProductId;
    }

    public String getNameDictionaryValue() {
        return nameDictionaryValue;
    }

    public void setNameDictionaryValue(String nameDictionaryValue) {
        this.nameDictionaryValue = nameDictionaryValue;
    }

}