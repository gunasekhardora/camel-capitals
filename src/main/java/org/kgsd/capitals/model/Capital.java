package org.kgsd.capitals.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Capital implements Serializable {
    private String name;
    private List<String> topLevelDomain;
    private String alpha2Code;
    private String alpha3Code;
    private List<String> callingCodes;
    private String capital;
    private List<String> altSpellings;
    private String region;
    private String subregion;
    private Long population;
    private List<String> latlng;
    private String demonym;
    private Long area;
    private Double gini;
    private List<String> timezones;
    private List<String> borders;
    private String nativeName;
    private String numericCode;
    private List<Object> currencies;
    private List<Object> languages;
    private Object translations;
    private String flag;
    private List<Object> regionalBlocs;
    private String cioc;
}
