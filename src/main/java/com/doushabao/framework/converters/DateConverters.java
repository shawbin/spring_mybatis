package com.doushabao.framework.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串转换成时间 yyyy-MM-dd HH:mm:ss
 */
@Component
public class DateConverters implements Converter<String, Date>{

    /**
     * 重写covert
     * @param source
     * @return
     */
    public Date convert(String source) {
        //转换格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            //转换
            return simpleDateFormat.parse(source);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        //参数绑定失败
        return null;
    }
}
