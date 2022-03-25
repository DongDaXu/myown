package com.dong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private String[] phones;
    private List<String> cities;
    private Map<String,Object> map;

}
