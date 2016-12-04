/**
 * 
 */
package br.com.erudio.data.risk;


/**
 * @author tqi_evianna
 *
 */
public final class CommonsDataConstants {

    public static final String PROTOCOL_VERSION = System.getProperty("vericad.protocol.version", "1.0");
    
    public static final String REGEXP_ADDRESS_TYPE = "[\\w \']*[^ ^\']*[^ ^-]*[^ ^)]*[^ ^(]*[^ ^,]*[^ ^.]*[^ ^/]*[^ ^\']*[\\d]*";
    public static final String REGEXP_ADDRESS_ORIGIN = "[\\w \']*[^ ^\']*[^ ^-]*[^ ^)]*[^ ^(]*[^ ^,]*[^ ^.]*[^ ^/]*[^ ^\']*[\\d]*";
    public static final String REGEXP_BIRTH_DATE = "(0{0,1}[1-9]|[1-2][0-9]|3[0-1])\\/(0{0,1}[1-9]|1[0-2])\\/(18[0-9]{2,2}|19[0-9]{2,2}|2[0-1]{1,1}[0-9]{2,2})";
    public static final String REGEXP_IP_ADDRESS = "(((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])(:?[0-9]{1,5})?|(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,6}((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])|([0-9a-fA-F]{1,4}:){1,5}(:((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]))|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4})(:((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]))|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,3}:((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])|fe80:(:[0-9a-fA-F]{0,4}){0,4}[%%]{1}[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])))";
    public static final String REGEXP_PHONE_NUMBER = "[0-9]{2}([0-9]{3,5})[0-9]{4,5}|([0-9]{3,5})[0-9]{4,5}|\\([0-9]{2}\\)([0-9]{3,5})[0-9]{4,5}|([0-9]{3,5})[0-9]{4,5}";
    public static final String REGEXP_ZIP_CODE = "[\\d]{8,8}";
}
