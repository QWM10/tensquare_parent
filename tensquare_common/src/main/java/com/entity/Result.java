package com.entity;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Boolean flag;
    private Integer code;
    private String message;
    private Object data;
    public Result (Boolean flag, Integer code , String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}
