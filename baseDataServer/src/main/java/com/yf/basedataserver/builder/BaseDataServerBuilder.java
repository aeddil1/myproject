package com.yf.basedataserver.builder;

import com.yf.basedataserver.result.GenericResult;

import java.util.Map;

public class BaseDataServerBuilder {
    public GenericResult ok(Map<String,Object> data){
        GenericResult genericResult = new GenericResult();
        genericResult.setCode(200);
        genericResult.setMsg("ok");
        genericResult.setData(data);
        return genericResult;
    }
    public GenericResult error(Map<String,Object> data){
        GenericResult genericResult = new GenericResult();
        genericResult.setCode(500);
        genericResult.setMsg("error");
        genericResult.setData(data);
        return genericResult;
    }
}
