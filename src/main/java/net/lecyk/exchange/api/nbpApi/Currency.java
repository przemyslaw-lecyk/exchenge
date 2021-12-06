package net.lecyk.exchange.api.nbpApi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;


@Generated("jsonschema2pojo")
public class Currency {

    private String table;
    private String currency;
    private String code;


    private List<Rate> rates = null;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Currency() {
    }

    /**
     *
     * @param code
     * @param rates
     * @param currency
     * @param table
     */
    public Currency(String table, String currency, String code, List<Rate> rates) {
        super();
        this.table = table;
        this.currency = currency;
        this.code = code;
        this.rates = rates;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Currency{" +
                "table='" + table + '\'' +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", rates=" + rates +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
