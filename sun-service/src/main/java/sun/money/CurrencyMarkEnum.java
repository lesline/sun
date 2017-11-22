package sun.money;

import org.apache.commons.lang.StringUtils;

/**
 * Created by marongsheng on 2017/11/9.
 */
public enum CurrencyMarkEnum {
    USD("USD","US$"),
    CNY("CNY","¥"),
    EUR("EUR","€"),
    RUB( "RUB","руб."),
    GBP("GBP","£"),
    CAD("CAD","C$"),
    CHF("CHF","CHF"),
    AUD("AUD","AU$"),
    PLN("PLN","zł");

    private String code;
    private String value;
    CurrencyMarkEnum(String currenyType, String mark) {
        code=currenyType;
        value=mark;
    }

    public static  String getCurreny(String currenyType){
        if(StringUtils.isBlank(currenyType)){
            return CurrencyMarkEnum.USD.getValue();
        }
        for (CurrencyMarkEnum currenyEnum : CurrencyMarkEnum.values()) {
            if(currenyEnum.getCode().equals(currenyType)){
                    return currenyEnum.getValue();
            }
        }
        return CurrencyMarkEnum.USD.getValue();
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
