package com.app.imdb.service.validation;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class EnumValidation<T extends Enum<T>>{

    private final Class<T> enumType;
    private final Map<String,T> enumMap;

    public EnumValidation(Class<T> enumType){
        this.enumType = enumType;
        this.enumMap = initializeEnumMap(enumType);
    }

    private Map<String,T> initializeEnumMap(Class<T> enumType){
        Map<String,T> enumMap = new HashMap<>();
        for (T enumConstant : enumType.getEnumConstants()){
            enumMap.put(enumConstant.name().toUpperCase(Locale.ROOT),enumConstant);
        }
        return enumMap;
    }

    public boolean isValidType(String inputType){
        return enumMap.containsKey(inputType.toUpperCase());
    }
    public T getEnumType(String input){
        return enumMap.get(input.toUpperCase());
    }
}
