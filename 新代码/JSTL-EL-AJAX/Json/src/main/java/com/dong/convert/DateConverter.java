package com.dong.convert;

import lombok.SneakyThrows;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String,Date> {


    @SneakyThrows
    @Override
    public Date convert(String source) {
        //将日期字符串，转换成真正的日期字符串
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = format.parse(source);
        return parse;
    }
}
