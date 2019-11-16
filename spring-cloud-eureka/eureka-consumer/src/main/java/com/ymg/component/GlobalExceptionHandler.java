package com.ymg.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yumg
 * @create 2019/10/28
 * @desc
 * @since 1.0.0
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    public ResponseData defaultErrorHandler(HttpServletRequest req,Exception e) throws Exception{
        logger.error("",e);
        ResponseData data = new ResponseData();
        data.setMessage(e.getMessage());
        if (e instanceof NoHandlerFoundException){
            data.setCode(404);
        }else{
            data.setCode(500);
        }
        data.setStatus(false);
        data.setData(null);
        return data;
    }


}
