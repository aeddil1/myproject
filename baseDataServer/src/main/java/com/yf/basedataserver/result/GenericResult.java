package com.yf.basedataserver.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericResult {
    private int code;
    private String msg;
    private Map<String, Object> data;
}
