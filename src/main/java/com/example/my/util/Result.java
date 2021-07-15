package com.example.my.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    public enum OperationState {
        /**
         * 成功
         */
        SUCCESS,
        /**
         * 失败
         */
        FAIL,
        /**
         * 异常
         */
        EXCEPTION;

    }

    @Builder.Default
    private OperationState state = OperationState.SUCCESS;

    private T data;

    private String[] errors;

    @Builder.Default
    private Map<Object,Object> ext = new HashMap<>();


    public static <T> Result<T> success(T t){
        return Result.<T>builder().data(t).build();
    }

    public static <T> Result<T> success(){
        return Result.<T>builder().build();
    }
}
