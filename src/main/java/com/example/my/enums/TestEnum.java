package com.example.my.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TestEnum {
    /**
     *
     */
    ASD("ASD","描述1"),
    /**
     *
     */
    WER("WER","秒杀1"),

    ;

    final String code;

    final String name;

}
