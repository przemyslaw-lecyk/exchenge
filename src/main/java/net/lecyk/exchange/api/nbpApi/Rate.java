package net.lecyk.exchange.api.nbpApi;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;


@Generated("jsonschema2pojo")
public class Rate {

    private String no;
    private String effectiveDate;
    private Double bid;
    private Double ask;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Rate() {
    }

    /**
     *
     * @param no
     * @param ask
     * @param bid
     * @param effectiveDate
     */
    public Rate(String no, String effectiveDate, Double bid, Double ask) {
        super();
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.bid = bid;
        this.ask = ask;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Rate{" +
                "no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", bid=" + bid +
                ", ask=" + ask +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
